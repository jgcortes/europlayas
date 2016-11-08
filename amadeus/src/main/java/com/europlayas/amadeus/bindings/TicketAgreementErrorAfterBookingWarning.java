
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The booking hasn't been finalised.
 * 
 * <p>Clase Java para TicketAgreementErrorAfterBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TicketAgreementErrorAfterBookingWarning"&gt;
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
@XmlType(name = "TicketAgreementErrorAfterBookingWarning")
public class TicketAgreementErrorAfterBookingWarning
    extends BookWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public TicketAgreementErrorAfterBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TicketAgreementErrorAfterBookingWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
