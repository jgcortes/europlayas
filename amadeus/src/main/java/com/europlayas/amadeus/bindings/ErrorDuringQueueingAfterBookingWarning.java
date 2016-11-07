
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the Amadeus PNR could not be queued.
 * 
 * <p>Clase Java para ErrorDuringQueueingAfterBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorDuringQueueingAfterBookingWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookWarning"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDuringQueueingAfterBookingWarning")
public class ErrorDuringQueueingAfterBookingWarning
    extends BookWarning
{


    /**
     * Default no-arg constructor
     * 
     */
    public ErrorDuringQueueingAfterBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ErrorDuringQueueingAfterBookingWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
