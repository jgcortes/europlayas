
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PriceWithInfoResponsePricing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoResponsePricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="pricingsByItineraryGroup" type="{http://ws.amadeus.fr/air}PriceWithInfoResponsePricingsByItineraryGroup"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoResponsePricing", propOrder = {

})
public class PriceWithInfoResponsePricing {

    @XmlElement(required = true)
    protected PriceWithInfoResponsePricingsByItineraryGroup pricingsByItineraryGroup;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoResponsePricing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoResponsePricing(final PriceWithInfoResponsePricingsByItineraryGroup pricingsByItineraryGroup) {
        this.pricingsByItineraryGroup = pricingsByItineraryGroup;
    }

    /**
     * Obtiene el valor de la propiedad pricingsByItineraryGroup.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoResponsePricingsByItineraryGroup }
     *     
     */
    public PriceWithInfoResponsePricingsByItineraryGroup getPricingsByItineraryGroup() {
        return pricingsByItineraryGroup;
    }

    /**
     * Define el valor de la propiedad pricingsByItineraryGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponsePricingsByItineraryGroup }
     *     
     */
    public void setPricingsByItineraryGroup(PriceWithInfoResponsePricingsByItineraryGroup value) {
        this.pricingsByItineraryGroup = value;
    }

}
