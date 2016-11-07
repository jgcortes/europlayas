
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-11-07T10:21:46.486+01:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "noFareApplicableFault", targetNamespace = "http://ws.amadeus.fr/air")
public class NoFareApplicableFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.NoFareApplicableFault noFareApplicableFault;

    public NoFareApplicableFault_Exception() {
        super();
    }
    
    public NoFareApplicableFault_Exception(String message) {
        super(message);
    }
    
    public NoFareApplicableFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFareApplicableFault_Exception(String message, com.europlayas.amadeus.bindings.NoFareApplicableFault noFareApplicableFault) {
        super(message);
        this.noFareApplicableFault = noFareApplicableFault;
    }

    public NoFareApplicableFault_Exception(String message, com.europlayas.amadeus.bindings.NoFareApplicableFault noFareApplicableFault, Throwable cause) {
        super(message, cause);
        this.noFareApplicableFault = noFareApplicableFault;
    }

    public com.europlayas.amadeus.bindings.NoFareApplicableFault getFaultInfo() {
        return this.noFareApplicableFault;
    }
}