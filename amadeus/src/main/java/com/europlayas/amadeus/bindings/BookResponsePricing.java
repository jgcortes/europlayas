
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BookResponsePricing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookResponsePricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="pricingsByItineraryGroup" type="{http://ws.amadeus.fr/air}BookResponsePricingsByItineraryGroup"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookResponsePricing", propOrder = {

})
public class BookResponsePricing implements Serializable
{

    @XmlElement(required = true)
    protected BookResponsePricingsByItineraryGroup pricingsByItineraryGroup;

    /**
     * Default no-arg constructor
     * 
     */
    public BookResponsePricing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookResponsePricing(final BookResponsePricingsByItineraryGroup pricingsByItineraryGroup) {
        this.pricingsByItineraryGroup = pricingsByItineraryGroup;
    }

    /**
     * Obtiene el valor de la propiedad pricingsByItineraryGroup.
     * 
     * @return
     *     possible object is
     *     {@link BookResponsePricingsByItineraryGroup }
     *     
     */
    public BookResponsePricingsByItineraryGroup getPricingsByItineraryGroup() {
        return pricingsByItineraryGroup;
    }

    /**
     * Define el valor de la propiedad pricingsByItineraryGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponsePricingsByItineraryGroup }
     *     
     */
    public void setPricingsByItineraryGroup(BookResponsePricingsByItineraryGroup value) {
        this.pricingsByItineraryGroup = value;
    }

}
