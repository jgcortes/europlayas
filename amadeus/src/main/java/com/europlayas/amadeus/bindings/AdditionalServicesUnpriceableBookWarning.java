
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the additional services cannot be price during the Pricing operation.
 * 
 * <p>Clase Java para AdditionalServicesUnpriceableBookWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServicesUnpriceableBookWarning"&gt;
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
@XmlType(name = "AdditionalServicesUnpriceableBookWarning")
public class AdditionalServicesUnpriceableBookWarning
    extends BookWarning
{


    /**
     * Default no-arg constructor
     * 
     */
    public AdditionalServicesUnpriceableBookWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AdditionalServicesUnpriceableBookWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
