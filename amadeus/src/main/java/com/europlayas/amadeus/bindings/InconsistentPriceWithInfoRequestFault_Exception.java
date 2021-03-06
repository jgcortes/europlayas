
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-11-08T12:42:57.223+01:00
 * Generated source version: 3.1.7
 */

@WebFault(name = "inconsistentPriceWithInfoRequestFault", targetNamespace = "http://ws.amadeus.fr/air")
public class InconsistentPriceWithInfoRequestFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.InconsistentPriceWithInfoRequestFault inconsistentPriceWithInfoRequestFault;

    public InconsistentPriceWithInfoRequestFault_Exception() {
        super();
    }
    
    public InconsistentPriceWithInfoRequestFault_Exception(String message) {
        super(message);
    }
    
    public InconsistentPriceWithInfoRequestFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InconsistentPriceWithInfoRequestFault_Exception(String message, com.europlayas.amadeus.bindings.InconsistentPriceWithInfoRequestFault inconsistentPriceWithInfoRequestFault) {
        super(message);
        this.inconsistentPriceWithInfoRequestFault = inconsistentPriceWithInfoRequestFault;
    }

    public InconsistentPriceWithInfoRequestFault_Exception(String message, com.europlayas.amadeus.bindings.InconsistentPriceWithInfoRequestFault inconsistentPriceWithInfoRequestFault, Throwable cause) {
        super(message, cause);
        this.inconsistentPriceWithInfoRequestFault = inconsistentPriceWithInfoRequestFault;
    }

    public com.europlayas.amadeus.bindings.InconsistentPriceWithInfoRequestFault getFaultInfo() {
        return this.inconsistentPriceWithInfoRequestFault;
    }
}
