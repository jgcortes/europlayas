
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the search could not be performed completely.
 * 
 * <p>Clase Java para MissingSearchWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MissingSearchWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AvailabilitySearchWarning"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingSearchWarning")
public class MissingSearchWarning
    extends AvailabilitySearchWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public MissingSearchWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MissingSearchWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
