/**
 * Created by gcortes on 07/11/2016.
 */

import com.europlayas.amadeus.bindings.*;
import com.europlayas.amadeus.engine.AmadeusService;

import com.europlayas.amadeus.util.GzipUtil;
import com.europlayas.amadeus.util.SerializerUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.runners.MockitoJUnitRunner;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.Is.is;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@RunWith(MockitoJUnitRunner.class)
public class AmadeusServiceTest {

    private static String ENDPOINT = "https://demo.amadeus.fr/air-5/ws/airService";
    private static String USER = "to_Europlayas_Test";
    private static String PASSWORD = "HKPo8i9n";

    private static JAXBContext JAXB_CONTEXT = null;

    @Before
    public void setUp() {

    }

    @Test
    public void doValidate_TestConection() throws JAXBException {
        boolean isConnection = true;
        try {
            ServicePortType AmadeusServicePort = AmadeusService.getAmadeusService(ENDPOINT, USER, PASSWORD, 30000);

            AmadeusServicePort.lowFareSearch(createLowFareRequest());
        }catch (Exception ex){
            ex.printStackTrace();
            isConnection = false;
        }

        assertThat(isConnection, is(true));

    }

    @Test
    public void doValidate_TestSerialization() throws JAXBException {
        try{
            serializeProviderReferece();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    private  LowFareSearchRequest createLowFareRequest() throws Exception{
        LowFareSearchRequest lowFareSearchRequest = new LowFareSearchRequest();

        LowFareSearchRequest.SearchPreferences searchPreferences = new LowFareSearchRequest.SearchPreferences();
        searchPreferences.setReturnAdditionalServices(true);
        lowFareSearchRequest.setSearchPreferences(searchPreferences);

        LowFareSearchRequest.Journey journey = new LowFareSearchRequest.Journey();
        LowFareSearchRequest.Journey.OriginDestinations originDestinations = new LowFareSearchRequest.Journey.OriginDestinations();
        journey.setOriginDestinations(originDestinations);

        OriginDestination originDestination = getOriginDestination(1,"MAD","BCN","161216");
        originDestinations.getOriginDestinations().add(originDestination);
        originDestination = getOriginDestination(2,"BCN","MAD","201216");
        originDestinations.getOriginDestinations().add(originDestination);

        lowFareSearchRequest.setJourney(journey );



        SeatedPassengerList seatedPassengerList = new SeatedPassengerList();

        InfantHoldingSeatedPassenger setatPassangerWithInfant = new InfantHoldingSeatedPassenger();
        setatPassangerWithInfant.setId(1);
        setatPassangerWithInfant.setPassengerType(InfantHoldingAllowedPassengerType.ADULT);
        HeldInfantPassenger heldInfantPassenger = new HeldInfantPassenger();
        heldInfantPassenger.setId(2);
        setatPassangerWithInfant.setHeldInfant( heldInfantPassenger );

        seatedPassengerList.getPassengers().add( setatPassangerWithInfant );
        lowFareSearchRequest.setPassengers(seatedPassengerList);

        NonInfantHoldingSeatedPassenger seatedPassenger = new NonInfantHoldingSeatedPassenger();
        seatedPassenger.setId(3);
        seatedPassenger.setPassengerType(PassengerType.CHILD);

        seatedPassengerList.getPassengers().add(seatedPassenger);
        lowFareSearchRequest.setPassengers(seatedPassengerList);



        SearchPricingMode searchPricingMode = new SearchPricingMode();
        searchPricingMode.setCurrencyCode(CurrencyCode.EUR);
        FareType fareType = new FareType();
        fareType.setPublishedFares(true);
        fareType.setUnifares(false);
        searchPricingMode.setFareType(fareType);

        PassengerFareOptionGroups passengerFareOptionGroups = new PassengerFareOptionGroups();
        PassengerFareOptionList passengerFareOptionList = new PassengerFareOptionList();
        PassengerFareOption passengerFareOption = new PassengerFareOption();
        passengerFareOption.setPassengerId(1);
        passengerFareOption.setFareOption(FareOption.STANDARD);
        passengerFareOptionList.getPassengerFareOptions().add(passengerFareOption);
         passengerFareOption = new PassengerFareOption();
        passengerFareOption.setPassengerId(2);
        passengerFareOption.setFareOption(FareOption.STANDARD);
        passengerFareOptionList.getPassengerFareOptions().add(passengerFareOption);
        passengerFareOption = new PassengerFareOption();
        passengerFareOption.setPassengerId(3);
        passengerFareOption.setFareOption(FareOption.STANDARD);
        passengerFareOptionList.getPassengerFareOptions().add(passengerFareOption);

        passengerFareOptionGroups.getPassengerFareOptionGroups().add(passengerFareOptionList);
        searchPricingMode.setPassengerFareOptionGroups(passengerFareOptionGroups);
        lowFareSearchRequest.setPricing(searchPricingMode);



        return lowFareSearchRequest;
    }


    private   OriginDestination getOriginDestination(int id, String origin, String destination, String date){
        OriginDestination originDestination = new OriginDestination();
        originDestination.setId(id);
        Area area = new Area();
        IataLocation iataLocation = new IataLocation();
        iataLocation.setCode(origin);
        area.setLocation(iataLocation);
        originDestination.setOrigin(area);
        area = new Area();
        iataLocation = new IataLocation();
        iataLocation.setCode(destination);
        area.setLocation(iataLocation);
        originDestination.setDestination(area);
        DateTimeRange dateTimeRange = new DateTimeRange();
        DateTimeRange.DateRange dateRange = new  DateTimeRange.DateRange();
        dateRange.setDate(getDate(date));
        dateTimeRange.setDateRange(dateRange);
        originDestination.setDepartureDateTimeRange(dateTimeRange);
        return originDestination;
    }


    private  LocalDate getDate(String input) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("ddMMyy");

        return  LocalDate.parse(input, formatter);

    }


    public void serializeProviderReferece(){
        try{
            BookRequest bookRequest = new  BookRequest();
            com.europlayas.amadeus.bindings.Journey journey = new com.europlayas.amadeus.bindings.Journey();
            Journey.Itineraries itineraries = new Journey.Itineraries();
            Itinerary itinerary = new Itinerary();
            itinerary.setId(1);
            itineraries.getItineraries().add(itinerary);
            journey.setItineraries(itineraries);
            bookRequest.setJourney(journey);

            BookRequestPricing bookRequestPricing = new BookRequestPricing();

            bookRequest.setPricing(bookRequestPricing);
            String providerReference = SerializerUtil.seralizeProviderReference(bookRequest);
            System.out.println("Solution Zip: " + providerReference);
            bookRequest = SerializerUtil.unSerializeProviderReference (providerReference );
            System.out.println("Book Solution" + bookRequest.getJourney().getItineraries().getItineraries().get(0).getId());

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }












}
