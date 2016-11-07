
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when a SSR OTHS remark could not be added in the PNR.
 * 
 * <p>Clase Java para OtherSpecialServiceRequestRemarkNotAddedToBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtherSpecialServiceRequestRemarkNotAddedToBookingWarning"&gt;
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
@XmlType(name = "OtherSpecialServiceRequestRemarkNotAddedToBookingWarning")
public class OtherSpecialServiceRequestRemarkNotAddedToBookingWarning
    extends BookWarning
{


    /**
     * Default no-arg constructor
     * 
     */
    public OtherSpecialServiceRequestRemarkNotAddedToBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OtherSpecialServiceRequestRemarkNotAddedToBookingWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
