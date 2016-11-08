
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported during the processing of a message related to air domain. Please refer to derived types.
 * 
 * <p>Clase Java para Warning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Warning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}Warning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warning", propOrder = {
    "itineraries"
})
@XmlSeeAlso({
    PricingOrFareBasisDiscrepancyWarning.class,
    AdditionalServicesUnpriceableWarning.class,
    LowAvailabilityWarning.class,
    LowFareSearchWarning.class,
    GetInfoWarning.class,
    AvailabilitySearchWarning.class,
    BookWarning.class
})
public abstract class Warning
    extends com.europlayas.amadeus.bindings.common.Warning
    implements Serializable
{

    protected ItineraryIdList itineraries;

    /**
     * Default no-arg constructor
     * 
     */
    public Warning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Warning(final String message, final ItineraryIdList itineraries) {
        super(message);
        this.itineraries = itineraries;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryIdList }
     *     
     */
    public ItineraryIdList getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryIdList }
     *     
     */
    public void setItineraries(ItineraryIdList value) {
        this.itineraries = value;
    }

}
