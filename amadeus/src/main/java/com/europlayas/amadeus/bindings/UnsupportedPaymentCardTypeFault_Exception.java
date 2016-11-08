
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-11-07T15:50:32.187+01:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "unsupportedPaymentCardTypeFault", targetNamespace = "http://ws.amadeus.fr/air")
public class UnsupportedPaymentCardTypeFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.UnsupportedPaymentCardTypeFault unsupportedPaymentCardTypeFault;

    public UnsupportedPaymentCardTypeFault_Exception() {
        super();
    }
    
    public UnsupportedPaymentCardTypeFault_Exception(String message) {
        super(message);
    }
    
    public UnsupportedPaymentCardTypeFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedPaymentCardTypeFault_Exception(String message, com.europlayas.amadeus.bindings.UnsupportedPaymentCardTypeFault unsupportedPaymentCardTypeFault) {
        super(message);
        this.unsupportedPaymentCardTypeFault = unsupportedPaymentCardTypeFault;
    }

    public UnsupportedPaymentCardTypeFault_Exception(String message, com.europlayas.amadeus.bindings.UnsupportedPaymentCardTypeFault unsupportedPaymentCardTypeFault, Throwable cause) {
        super(message, cause);
        this.unsupportedPaymentCardTypeFault = unsupportedPaymentCardTypeFault;
    }

    public com.europlayas.amadeus.bindings.UnsupportedPaymentCardTypeFault getFaultInfo() {
        return this.unsupportedPaymentCardTypeFault;
    }
}
