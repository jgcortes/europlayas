
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of solution passenger information, for one or more passengers. This type can include information for all passenger / segment pairs, related to a pricing solution for a recommendation.
 * 
 * <p>Clase Java para PriceWithInfoResponsePricingsByItineraryGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoResponsePricingsByItineraryGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingByItineraryGroup" type="{http://ws.amadeus.fr/air}PriceWithInfoResponsePricingByItineraryGroup" maxOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoResponsePricingsByItineraryGroup", propOrder = {
    "pricingByItineraryGroups"
})
public class PriceWithInfoResponsePricingsByItineraryGroup implements Serializable
{

    @XmlElement(name = "pricingByItineraryGroup", required = true)
    protected List<PriceWithInfoResponsePricingByItineraryGroup> pricingByItineraryGroups;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoResponsePricingsByItineraryGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoResponsePricingsByItineraryGroup(final List<PriceWithInfoResponsePricingByItineraryGroup> pricingByItineraryGroups) {
        this.pricingByItineraryGroups = pricingByItineraryGroups;
    }

    /**
     * Gets the value of the pricingByItineraryGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingByItineraryGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingByItineraryGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceWithInfoResponsePricingByItineraryGroup }
     * 
     * 
     */
    public List<PriceWithInfoResponsePricingByItineraryGroup> getPricingByItineraryGroups() {
        if (pricingByItineraryGroups == null) {
            pricingByItineraryGroups = new ArrayList<PriceWithInfoResponsePricingByItineraryGroup>();
        }
        return this.pricingByItineraryGroups;
    }

}
