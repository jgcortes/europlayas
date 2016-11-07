
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of solution passenger information, for one or more passengers. This type can include information for all passenger / segment pairs, related to a pricing solution for a recommendation.
 * 
 * <p>Clase Java para PriceWithInfoRequestPricingsByItineraryGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoRequestPricingsByItineraryGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingByItineraryGroup" type="{http://ws.amadeus.fr/air}PriceWithInfoRequestPricingByItineraryGroup" maxOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoRequestPricingsByItineraryGroup", propOrder = {
    "pricingByItineraryGroup"
})
public class PriceWithInfoRequestPricingsByItineraryGroup {

    @XmlElement(required = true)
    protected List<PriceWithInfoRequestPricingByItineraryGroup> pricingByItineraryGroup;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoRequestPricingsByItineraryGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoRequestPricingsByItineraryGroup(final List<PriceWithInfoRequestPricingByItineraryGroup> pricingByItineraryGroup) {
        this.pricingByItineraryGroup = pricingByItineraryGroup;
    }

    /**
     * Gets the value of the pricingByItineraryGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingByItineraryGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingByItineraryGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceWithInfoRequestPricingByItineraryGroup }
     * 
     * 
     */
    public List<PriceWithInfoRequestPricingByItineraryGroup> getPricingByItineraryGroup() {
        if (pricingByItineraryGroup == null) {
            pricingByItineraryGroup = new ArrayList<PriceWithInfoRequestPricingByItineraryGroup>();
        }
        return this.pricingByItineraryGroup;
    }

}
