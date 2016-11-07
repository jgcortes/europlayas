
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex and composite pricing solution. Itineraries are priced on a per group basis. Itineraires are priced only with other itineraries belonging to the same group, using one provider per group. Passenger pricing information are provided for each pair of group / passenger. In order to book a recommendation priced with such kind of solution, one validating airline per group is required (to choose among possible ones for each group). This solution is able to combine "one-way combinable" fares when pricing a roundtrip or multi-destination journey. Complex pricing solution, restricted to contain only one validating airline for each itinerary goup pricing solution and always with fees.
 * 
 * <p>Clase Java para PriceWithInfoPricingMode complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoPricingMode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://ws.amadeus.fr/air}PricingModeGroup"/&gt;
 *         &lt;element name="pricingsByItineraryGroup" type="{http://ws.amadeus.fr/air}PriceWithInfoRequestPricingsByItineraryGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currencyCode" type="{http://ws.amadeus.fr/air}CurrencyCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoPricingMode", propOrder = {
    "pointOfSell",
    "pointOfTicketing",
    "pricingsByItineraryGroup"
})
public class PriceWithInfoPricingMode {

    protected IataLocation pointOfSell;
    protected IataLocation pointOfTicketing;
    @XmlElement(required = true)
    protected PriceWithInfoRequestPricingsByItineraryGroup pricingsByItineraryGroup;
    @XmlAttribute(name = "currencyCode")
    protected CurrencyCode currencyCode;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoPricingMode() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoPricingMode(final IataLocation pointOfSell, final IataLocation pointOfTicketing, final PriceWithInfoRequestPricingsByItineraryGroup pricingsByItineraryGroup, final CurrencyCode currencyCode) {
        this.pointOfSell = pointOfSell;
        this.pointOfTicketing = pointOfTicketing;
        this.pricingsByItineraryGroup = pricingsByItineraryGroup;
        this.currencyCode = currencyCode;
    }

    /**
     * Obtiene el valor de la propiedad pointOfSell.
     * 
     * @return
     *     possible object is
     *     {@link IataLocation }
     *     
     */
    public IataLocation getPointOfSell() {
        return pointOfSell;
    }

    /**
     * Define el valor de la propiedad pointOfSell.
     * 
     * @param value
     *     allowed object is
     *     {@link IataLocation }
     *     
     */
    public void setPointOfSell(IataLocation value) {
        this.pointOfSell = value;
    }

    /**
     * Obtiene el valor de la propiedad pointOfTicketing.
     * 
     * @return
     *     possible object is
     *     {@link IataLocation }
     *     
     */
    public IataLocation getPointOfTicketing() {
        return pointOfTicketing;
    }

    /**
     * Define el valor de la propiedad pointOfTicketing.
     * 
     * @param value
     *     allowed object is
     *     {@link IataLocation }
     *     
     */
    public void setPointOfTicketing(IataLocation value) {
        this.pointOfTicketing = value;
    }

    /**
     * Obtiene el valor de la propiedad pricingsByItineraryGroup.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoRequestPricingsByItineraryGroup }
     *     
     */
    public PriceWithInfoRequestPricingsByItineraryGroup getPricingsByItineraryGroup() {
        return pricingsByItineraryGroup;
    }

    /**
     * Define el valor de la propiedad pricingsByItineraryGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoRequestPricingsByItineraryGroup }
     *     
     */
    public void setPricingsByItineraryGroup(PriceWithInfoRequestPricingsByItineraryGroup value) {
        this.pricingsByItineraryGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define el valor de la propiedad currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

}
