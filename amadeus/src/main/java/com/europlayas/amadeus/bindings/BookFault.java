
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
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
    DuplicateBookingFault.class,
    InconsistentBookRequestFault.class,
    PriceDiscrepancyFault.class,
    PassengerPriceDiscrepancyFault.class,
    SegmentSellFailureFault.class,
    TicketIssuanceFailureFault.class,
    BookingFailureFault.class
})
public class BookFault
    extends Fault
    implements Serializable
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
