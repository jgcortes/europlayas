
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when a keyword remark could not be added in the PNR.
 * 
 * <p>Clase Java para KeywordRemarkNotAddedToBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KeywordRemarkNotAddedToBookingWarning"&gt;
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
@XmlType(name = "KeywordRemarkNotAddedToBookingWarning")
public class KeywordRemarkNotAddedToBookingWarning
    extends BookWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public KeywordRemarkNotAddedToBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public KeywordRemarkNotAddedToBookingWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
