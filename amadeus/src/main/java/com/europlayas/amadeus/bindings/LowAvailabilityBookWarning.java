
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when there is a low availability.
 * 
 * <p>Clase Java para LowAvailabilityBookWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowAvailabilityBookWarning"&gt;
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
@XmlType(name = "LowAvailabilityBookWarning")
public class LowAvailabilityBookWarning
    extends BookWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public LowAvailabilityBookWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowAvailabilityBookWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
