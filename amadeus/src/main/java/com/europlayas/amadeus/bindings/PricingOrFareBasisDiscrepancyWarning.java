
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the search of fare notes could not be performed completely.
 * 
 * <p>Clase Java para PricingOrFareBasisDiscrepancyWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PricingOrFareBasisDiscrepancyWarning"&gt;
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
@XmlType(name = "PricingOrFareBasisDiscrepancyWarning")
public class PricingOrFareBasisDiscrepancyWarning
    extends Warning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public PricingOrFareBasisDiscrepancyWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PricingOrFareBasisDiscrepancyWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
