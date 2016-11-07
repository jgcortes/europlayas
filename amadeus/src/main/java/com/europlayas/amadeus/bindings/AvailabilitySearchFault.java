
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract type for faults that occurred during the processing of an availability search message.
 * 
 * <p>Clase Java para AvailabilitySearchFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySearchFault")
@XmlSeeAlso({
    InconsistentAvailabilitySearchRequestFault.class
})
public abstract class AvailabilitySearchFault
    extends Fault
{


    /**
     * Default no-arg constructor
     * 
     */
    public AvailabilitySearchFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AvailabilitySearchFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
