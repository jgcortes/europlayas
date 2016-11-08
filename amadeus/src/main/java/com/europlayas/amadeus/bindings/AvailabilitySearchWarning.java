
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning related to an availability search. Please refer to derived types.
 * 
 * <p>Clase Java para AvailabilitySearchWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchWarning"&gt;
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
@XmlType(name = "AvailabilitySearchWarning")
@XmlSeeAlso({
    MissingSearchWarning.class
})
public abstract class AvailabilitySearchWarning
    extends Warning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public AvailabilitySearchWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AvailabilitySearchWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
