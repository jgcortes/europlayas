
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to a pricing solution.
 * 
 * <p>Clase Java para PriceWithInfoPricingInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoPricingInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fareTypeInconsistency" type="{http://ws.amadeus.fr/air}FareTypeInconsistencyWithCause" minOccurs="0"/&gt;
 *         &lt;element name="passengerPricingInconsistency" type="{http://ws.amadeus.fr/air}PriceWithInfoPassengerPricingInconsistency" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="cause" type="{http://ws.amadeus.fr/air}PricingModeInconsistencyCause" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoPricingInconsistency", propOrder = {

})
public class PriceWithInfoPricingInconsistency implements Serializable
{

    protected FareTypeInconsistencyWithCause fareTypeInconsistency;
    protected PriceWithInfoPassengerPricingInconsistency passengerPricingInconsistency;
    @XmlAttribute(name = "cause")
    protected PricingModeInconsistencyCause cause;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoPricingInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoPricingInconsistency(final FareTypeInconsistencyWithCause fareTypeInconsistency, final PriceWithInfoPassengerPricingInconsistency passengerPricingInconsistency, final PricingModeInconsistencyCause cause) {
        this.fareTypeInconsistency = fareTypeInconsistency;
        this.passengerPricingInconsistency = passengerPricingInconsistency;
        this.cause = cause;
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
     * Obtiene el valor de la propiedad passengerPricingInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoPassengerPricingInconsistency }
     *     
     */
    public PriceWithInfoPassengerPricingInconsistency getPassengerPricingInconsistency() {
        return passengerPricingInconsistency;
    }

    /**
     * Define el valor de la propiedad passengerPricingInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoPassengerPricingInconsistency }
     *     
     */
    public void setPassengerPricingInconsistency(PriceWithInfoPassengerPricingInconsistency value) {
        this.passengerPricingInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link PricingModeInconsistencyCause }
     *     
     */
    public PricingModeInconsistencyCause getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModeInconsistencyCause }
     *     
     */
    public void setCause(PricingModeInconsistencyCause value) {
        this.cause = value;
    }

}
