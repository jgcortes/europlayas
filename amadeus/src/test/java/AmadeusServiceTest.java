/**
 * Created by gcortes on 07/11/2016.
 */

import com.europlayas.amadeus.bindings.AvailabilitySearchRequest;
import com.europlayas.amadeus.bindings.ServicePortType;
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
import javax.xml.ws.BindingProvider;

@RunWith(MockitoJUnitRunner.class)
public class AmadeusServiceTest {

    private static String ENDPOINT = "https://demo.amadeus.fr/air-5/ws/airService";
    private static String USER = "WS";
    private static String PASSWORD = "PASSWORD";

    @Before
    public void setUp() {

    }

    @Test
    public void doValidate_TestConection() throws JAXBException {
        boolean isConnection = true;
        try {
            ServicePortType AmadeusServicePort = AmadeusService.getAmadeusService(ENDPOINT, USER, PASSWORD, 10000);
            AmadeusService.setAdrressing((BindingProvider) AmadeusServicePort, "http://ws.amadeus.fr/air/availabilitySearch");
            AmadeusServicePort.availabilitySearch(new AvailabilitySearchRequest());
        }catch (Exception ex){
            isConnection = false;
        }

        assertThat(isConnection, is(true));

    }


    }
