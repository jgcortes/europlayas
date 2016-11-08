package com.europlayas.amadeus.engine;

import com.europlayas.amadeus.bindings.Service;
import com.europlayas.amadeus.bindings.ServicePortType;
import com.europlayas.amadeus.interceptor.LogInInterceptor;
import com.europlayas.amadeus.interceptor.LogOutInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.ws.addressing.AddressingProperties;
import org.apache.cxf.ws.addressing.AttributedURIType;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import org.slf4j.Logger;

import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.AddressingFeature;
import java.util.Date;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by gcortes on 07/11/2016.
 */
public class AmadeusService {

    private static volatile Service service;
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger( AmadeusService.class);

   public static ServicePortType getAmadeusService(String endpointAddress, String user, String password,
                                                     int timeoutMillis) throws Exception{

       ServicePortType AmadeusServicePort = createAmadeusService(endpointAddress, timeoutMillis);
       addSecurityRequestInfo( AmadeusServicePort, user, password);
      return  AmadeusServicePort;
   }

    public static void setAdrressing(BindingProvider provider, String action) {
        AddressingProperties maps = new AddressingProperties();
        AttributedURIType epr = new AttributedURIType();
        epr.setValue(action);
        maps.setAction(epr);
        // associate MAPs with request context
        provider.getRequestContext().put(org.apache.cxf.ws.addressing.JAXWSAConstants.CLIENT_ADDRESSING_PROPERTIES, maps);
    }

    private static ServicePortType createAmadeusService(String endpointAddress, int timeoutMillis) throws Exception{
        Date now = new Date();
        if (service == null) {
            synchronized (AmadeusService.class) {
                if (service == null) {
                    AddressingFeature addressing = new AddressingFeature(true, true);
                    service = new Service(addressing);
                }
            }
        }

        ServicePortType amadeuServicePort = service.getServicePort();
        final BindingProvider provider = (BindingProvider) amadeuServicePort;
        provider.getRequestContext().put("set-jaxb-validation-event-handler", "false");
        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress);
        provider.getRequestContext().put("thread.local.request.context", "true");

        setupWSAddressing(provider);

        Client client = ClientProxy.getClient(amadeuServicePort);
        client.getInInterceptors().add(new LogInInterceptor());
        client.getOutInterceptors().add(new LogOutInterceptor());



        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setAllowChunking(false);
        httpClientPolicy.setConnectionTimeout(timeoutMillis);
        httpClientPolicy.setReceiveTimeout(timeoutMillis);
        conduit.setClient(httpClientPolicy);

        addSecurityInterceptor(client);

        LOGGER.debug("Amadeus service created in {} ms", new Date().getTime() - now.getTime());
        return amadeuServicePort;
    }

    private static void addSecurityRequestInfo( ServicePortType port, String user, String password) {
        final BindingProvider provider = (BindingProvider) port;
        //Ponemos el usuario y password en variables dependientes del thread
        provider.getRequestContext().put(WSHandlerConstants.USER, user);
        provider.getRequestContext().put("password", password);
        /*try {
             byte[] passwordSha1 = MessageDigest.getInstance("SHA-1").digest(password.getBytes());
            provider.getRequestContext().put("password", Base64.encode(passwordSha1));

        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalArgumentException("Algoritmo no soportado", ex);
        }*/
    }


    private static void addSecurityInterceptor(Client client) {
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.PASSWORD_TYPE,  WSConstants.PW_TEXT);

        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
        client.getOutInterceptors().add(wssOut);
    }

    private static void setupWSAddressing(BindingProvider bp) {
        // get Message Addressing Properties instance
        AddressingProperties maps = new AddressingProperties();

        // associate MAPs with request context
        bp.getRequestContext().put(org.apache.cxf.ws.addressing.JAXWSAConstants.CLIENT_ADDRESSING_PROPERTIES, maps);
    }

    }


