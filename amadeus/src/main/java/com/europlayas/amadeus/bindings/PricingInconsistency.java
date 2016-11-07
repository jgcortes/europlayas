
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to pricing.
 * 
 * <p>Clase Java para PricingInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PricingInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fareTypeInconsistency" type="{http://ws.amadeus.fr/air}FareTypeInconsistencyWithCause" minOccurs="0"/&gt;
 *         &lt;element name="passengerFareOptionGroupsInconsistency" type="{http://ws.amadeus.fr/air}PassengerFareOptionGroupsInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="currencyInconsistency" type="{http://ws.amadeus.fr/air}CurrencyInconsistency" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingInconsistency", propOrder = {

})
public class PricingInconsistency {

    protected FareTypeInconsistencyWithCause fareTypeInconsistency;
    protected PassengerFareOptionGroupsInconsistency passengerFareOptionGroupsInconsistency;
    protected CurrencyInconsistency currencyInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public PricingInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PricingInconsistency(final FareTypeInconsistencyWithCause fareTypeInconsistency, final PassengerFareOptionGroupsInconsistency passengerFareOptionGroupsInconsistency, final CurrencyInconsistency currencyInconsistency) {
        this.fareTypeInconsistency = fareTypeInconsistency;
        this.passengerFareOptionGroupsInconsistency = passengerFareOptionGroupsInconsistency;
        this.currencyInconsistency = currencyInconsistency;
    }

    /**
     * Obtiene el valor de la propiedad fareTypeInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeInconsistencyWithCause }
     *     
     */
    public FareTypeInconsistencyWithCause getFareTypeInconsistency() {
        return fareTypeInconsistency;
    }

    /**
     * Define el valor de la propiedad fareTypeInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeInconsistencyWithCause }
     *     
     */
    public void setFareTypeInconsistency(FareTypeInconsistencyWithCause value) {
        this.fareTypeInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerFareOptionGroupsInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFareOptionGroupsInconsistency }
     *     
     */
    public PassengerFareOptionGroupsInconsistency getPassengerFareOptionGroupsInconsistency() {
        return passengerFareOptionGroupsInconsistency;
    }

    /**
     * Define el valor de la propiedad passengerFareOptionGroupsInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFareOptionGroupsInconsistency }
     *     
     */
    public void setPassengerFareOptionGroupsInconsistency(PassengerFareOptionGroupsInconsistency value) {
        this.passengerFareOptionGroupsInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInconsistency }
     *     
     */
    public CurrencyInconsistency getCurrencyInconsistency() {
        return currencyInconsistency;
    }

    /**
     * Define el valor de la propiedad currencyInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInconsistency }
     *     
     */
    public void setCurrencyInconsistency(CurrencyInconsistency value) {
        this.currencyInconsistency = value;
    }

}
