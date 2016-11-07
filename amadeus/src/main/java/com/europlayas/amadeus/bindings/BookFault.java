
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BookFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookFault")
@XmlSeeAlso({
    BookingFailureFault.class,
    TicketIssuanceFailureFault.class,
    SegmentSellFailureFault.class,
    PassengerPriceDiscrepancyFault.class,
    PriceDiscrepancyFault.class,
    InconsistentBookRequestFault.class,
    DuplicateBookingFault.class
})
public class BookFault
    extends Fault
{


    /**
     * Default no-arg constructor
     * 
     */
    public BookFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
