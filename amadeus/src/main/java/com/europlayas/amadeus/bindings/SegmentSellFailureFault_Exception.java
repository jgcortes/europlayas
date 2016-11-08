
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-11-08T12:42:57.140+01:00
 * Generated source version: 3.1.7
 */

@WebFault(name = "segmentSellFailureFault", targetNamespace = "http://ws.amadeus.fr/air")
public class SegmentSellFailureFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.SegmentSellFailureFault segmentSellFailureFault;

    public SegmentSellFailureFault_Exception() {
        super();
    }
    
    public SegmentSellFailureFault_Exception(String message) {
        super(message);
    }
    
    public SegmentSellFailureFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SegmentSellFailureFault_Exception(String message, com.europlayas.amadeus.bindings.SegmentSellFailureFault segmentSellFailureFault) {
        super(message);
        this.segmentSellFailureFault = segmentSellFailureFault;
    }

    public SegmentSellFailureFault_Exception(String message, com.europlayas.amadeus.bindings.SegmentSellFailureFault segmentSellFailureFault, Throwable cause) {
        super(message, cause);
        this.segmentSellFailureFault = segmentSellFailureFault;
    }

    public com.europlayas.amadeus.bindings.SegmentSellFailureFault getFaultInfo() {
        return this.segmentSellFailureFault;
    }
}
