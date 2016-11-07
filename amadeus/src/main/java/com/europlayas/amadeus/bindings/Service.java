package com.europlayas.amadeus.bindings;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-11-07T10:21:46.694+01:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "service", 
                  wsdlLocation = "file:/D:/europlayas/europlayas/amadeus/src/main/other/wsdl/airService.wsdl",
                  targetNamespace = "http://ws.amadeus.fr/air") 
public class Service extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.amadeus.fr/air", "service");
    public final static QName ServicePort = new QName("http://ws.amadeus.fr/air", "servicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/europlayas/europlayas/amadeus/src/main/other/wsdl/airService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/europlayas/europlayas/amadeus/src/main/other/wsdl/airService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ServicePortType
     */
    @WebEndpoint(name = "servicePort")
    public ServicePortType getServicePort() {
        return super.getPort(ServicePort, ServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicePortType
     */
    @WebEndpoint(name = "servicePort")
    public ServicePortType getServicePort(WebServiceFeature... features) {
        return super.getPort(ServicePort, ServicePortType.class, features);
    }

}