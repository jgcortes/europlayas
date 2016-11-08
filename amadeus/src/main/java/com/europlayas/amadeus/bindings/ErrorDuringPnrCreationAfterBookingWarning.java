
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the Amadeus PNR could not be created.
 * 
 * <p>Clase Java para ErrorDuringPnrCreationAfterBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorDuringPnrCreationAfterBookingWarning"&gt;
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
@XmlType(name = "ErrorDuringPnrCreationAfterBookingWarning")
public class ErrorDuringPnrCreationAfterBookingWarning
    extends BookWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public ErrorDuringPnrCreationAfterBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ErrorDuringPnrCreationAfterBookingWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
