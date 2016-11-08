
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchPricingMode complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchPricingMode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://ws.amadeus.fr/air}PricingModeGroup"/&gt;
 *         &lt;element name="fareType" type="{http://ws.amadeus.fr/air}FareType" minOccurs="0"/&gt;
 *         &lt;element name="passengerFareOptionGroups" type="{http://ws.amadeus.fr/air}PassengerFareOptionGroups" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ws.amadeus.fr/air}PricingModeAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPricingMode", propOrder = {
    "pointOfSell",
    "pointOfTicketing",
    "fareType",
    "passengerFareOptionGroups"
})
public class SearchPricingMode implements Serializable
{

    protected IataLocation pointOfSell;
    protected IataLocation pointOfTicketing;
    protected FareType fareType;
    protected PassengerFareOptionGroups passengerFareOptionGroups;
    @XmlAttribute(name = "currencyCode")
    protected CurrencyCode currencyCode;

    /**
     * Default no-arg constructor
     * 
     */
    public SearchPricingMode() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchPricingMode(final IataLocation pointOfSell, final IataLocation pointOfTicketing, final FareType fareType, final PassengerFareOptionGroups passengerFareOptionGroups, final CurrencyCode currencyCode) {
        this.pointOfSell = pointOfSell;
        this.pointOfTicketing = pointOfTicketing;
        this.fareType = fareType;
        this.passengerFareOptionGroups = passengerFareOptionGroups;
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
     * Obtiene el valor de la propiedad fareType.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getFareType() {
        return fareType;
    }

    /**
     * Define el valor de la propiedad fareType.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setFareType(FareType value) {
        this.fareType = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerFareOptionGroups.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFareOptionGroups }
     *     
     */
    public PassengerFareOptionGroups getPassengerFareOptionGroups() {
        return passengerFareOptionGroups;
    }

    /**
     * Define el valor de la propiedad passengerFareOptionGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFareOptionGroups }
     *     
     */
    public void setPassengerFareOptionGroups(PassengerFareOptionGroups value) {
        this.passengerFareOptionGroups = value;
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
