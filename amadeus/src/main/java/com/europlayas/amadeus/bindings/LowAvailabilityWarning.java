
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when there is a low availability.
 * 
 * <p>Clase Java para LowAvailabilityWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowAvailabilityWarning"&gt;
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
@XmlType(name = "LowAvailabilityWarning")
public class LowAvailabilityWarning
    extends Warning
{


    /**
     * Default no-arg constructor
     * 
     */
    public LowAvailabilityWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowAvailabilityWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
