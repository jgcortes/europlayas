/**
 * Created by gcortes on 07/11/2016.
 */

import com.europlayas.amadeus.bindings.*;
import com.europlayas.amadeus.engine.AmadeusService;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

@RunWith(MockitoJUnitRunner.class)
public class AmadeusServiceTest {

    private static String ENDPOINT = "https://demo.amadeus.fr/air-5/ws/airService";
    private static String USER = "to_Europlayas_Test";
    private static String PASSWORD = "HKPo8i9n";

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


    private LowFareSearchRequest createLowFareRequest() throws Exception{
        LowFareSearchRequest lowFareSearchRequest = new LowFareSearchRequest();

        LowFareSearchRequest.Journey journey = new LowFareSearchRequest.Journey();
        LowFareSearchRequest.Journey.OriginDestinations originDestinations = new LowFareSearchRequest.Journey.OriginDestinations();
        journey.setOriginDestinations(originDestinations);
        OriginDestination originDestination = new OriginDestination();
        originDestination.setId(1);
        Area area = new Area();
        IataLocation iataLocation = new IataLocation();
        iataLocation.setCode("MAD");
        area.setLocation(iataLocation);
        originDestination.setOrigin(area);
        area = new Area();
        iataLocation = new IataLocation();
        iataLocation.setCode("BCN");
        area.setLocation(iataLocation);
        originDestination.setDestination(area);
        originDestinations.getOriginDestinations().add(originDestination);
        lowFareSearchRequest.setJourney(journey );
        DateTimeRange dateTimeRange = new DateTimeRange();
        DateTimeRange.DateRange dateRange = new  DateTimeRange.DateRange();
        dateRange.setDate(getDate("161216"));
        dateTimeRange.setDateRange(dateRange);
        originDestination.setDepartureDateTimeRange(dateTimeRange);


        SeatedPassengerList seatedPassengerList = new SeatedPassengerList();
        NonInfantHoldingSeatedPassenger seatedPassenger = new NonInfantHoldingSeatedPassenger();
        seatedPassenger.setPassengerType(PassengerType.ADULT);
        seatedPassenger.setId(1);
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
        passengerFareOptionGroups.getPassengerFareOptionGroups().add(passengerFareOptionList);
        searchPricingMode.setPassengerFareOptionGroups(passengerFareOptionGroups);
        lowFareSearchRequest.setPricing(searchPricingMode);



        return lowFareSearchRequest;
    }


    private LocalDate getDate(String input) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("ddMMyy");

        return  LocalDate.parse(input, formatter);

    }



    }
