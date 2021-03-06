
package com.europlayas.amadeus.bindings;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-11-08T12:42:57.077+01:00
 * Generated source version: 3.1.7
 */

@WebFault(name = "bookingFailureFault", targetNamespace = "http://ws.amadeus.fr/air")
public class BookingFailureFault_Exception extends Exception {
    
    private com.europlayas.amadeus.bindings.BookingFailureFault bookingFailureFault;

    public BookingFailureFault_Exception() {
        super();
    }
    
    public BookingFailureFault_Exception(String message) {
        super(message);
    }
    
    public BookingFailureFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public BookingFailureFault_Exception(String message, com.europlayas.amadeus.bindings.BookingFailureFault bookingFailureFault) {
        super(message);
        this.bookingFailureFault = bookingFailureFault;
    }

    public BookingFailureFault_Exception(String message, com.europlayas.amadeus.bindings.BookingFailureFault bookingFailureFault, Throwable cause) {
        super(message, cause);
        this.bookingFailureFault = bookingFailureFault;
    }

    public com.europlayas.amadeus.bindings.BookingFailureFault getFaultInfo() {
        return this.bookingFailureFault;
    }
}
