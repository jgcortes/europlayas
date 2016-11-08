
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-11-08T12:42:57.162+01:00
 * Generated source version: 3.1.7
 */

@WebFault(name = "supplierSideFault", targetNamespace = "http://ws.amadeus.fr/air")
public class SupplierSideFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.SupplierSideFault supplierSideFault;

    public SupplierSideFault_Exception() {
        super();
    }
    
    public SupplierSideFault_Exception(String message) {
        super(message);
    }
    
    public SupplierSideFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SupplierSideFault_Exception(String message, com.europlayas.amadeus.bindings.SupplierSideFault supplierSideFault) {
        super(message);
        this.supplierSideFault = supplierSideFault;
    }

    public SupplierSideFault_Exception(String message, com.europlayas.amadeus.bindings.SupplierSideFault supplierSideFault, Throwable cause) {
        super(message, cause);
        this.supplierSideFault = supplierSideFault;
    }

    public com.europlayas.amadeus.bindings.SupplierSideFault getFaultInfo() {
        return this.supplierSideFault;
    }
}
