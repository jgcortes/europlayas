
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when some options have been discarded during the book
 * 
 * <p>Clase Java para BookWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Warning"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookWarning")
@XmlSeeAlso({
    UnconfirmedBookingWarning.class,
    ErrorDuringPnrCreationAfterBookingWarning.class,
    SSRDocsNotAddedBookingWarning.class,
    RecordWarning.class,
    ErrorDuringQueueingAfterBookingWarning.class,
    KeywordRemarkNotAddedToBookingWarning.class,
    OtherSpecialServiceRequestRemarkNotAddedToBookingWarning.class,
    BookingWithPriceMarginWarning.class,
    LowAvailabilityBookWarning.class,
    AdditionalServicesUnpriceableBookWarning.class,
    ErrorAfterBookingWhileDisplayingTSTWarning.class,
    TicketAgreementErrorAfterBookingWarning.class
})
public class BookWarning
    extends Warning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public BookWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
