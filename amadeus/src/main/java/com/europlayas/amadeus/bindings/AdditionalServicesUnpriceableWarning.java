
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the additional services cannot be price during the PriceWithInfo operation.
 * 
 * <p>Clase Java para AdditionalServicesUnpriceableWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServicesUnpriceableWarning"&gt;
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
@XmlType(name = "AdditionalServicesUnpriceableWarning")
public class AdditionalServicesUnpriceableWarning
    extends Warning
{


    /**
     * Default no-arg constructor
     * 
     */
    public AdditionalServicesUnpriceableWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AdditionalServicesUnpriceableWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
