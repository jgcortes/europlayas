
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-11-07T10:21:46.596+01:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "inconsistentGetInfoRequestFault", targetNamespace = "http://ws.amadeus.fr/air")
public class InconsistentGetInfoRequestFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.InconsistentGetInfoRequestFault inconsistentGetInfoRequestFault;

    public InconsistentGetInfoRequestFault_Exception() {
        super();
    }
    
    public InconsistentGetInfoRequestFault_Exception(String message) {
        super(message);
    }
    
    public InconsistentGetInfoRequestFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InconsistentGetInfoRequestFault_Exception(String message, com.europlayas.amadeus.bindings.InconsistentGetInfoRequestFault inconsistentGetInfoRequestFault) {
        super(message);
        this.inconsistentGetInfoRequestFault = inconsistentGetInfoRequestFault;
    }

    public InconsistentGetInfoRequestFault_Exception(String message, com.europlayas.amadeus.bindings.InconsistentGetInfoRequestFault inconsistentGetInfoRequestFault, Throwable cause) {
        super(message, cause);
        this.inconsistentGetInfoRequestFault = inconsistentGetInfoRequestFault;
    }

    public com.europlayas.amadeus.bindings.InconsistentGetInfoRequestFault getFaultInfo() {
        return this.inconsistentGetInfoRequestFault;
    }
}
