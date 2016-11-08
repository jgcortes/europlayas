
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LowFareSearchResponsePricingDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchResponsePricingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountWithoutServices" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *         &lt;element name="baseAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *         &lt;element name="baseAmountWithoutTax" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="fees" type="{http://ws.amadeus.fr/air}LowFareSearchResponseFees"/&gt;
 *         &lt;element name="additionalServices" type="{http://ws.amadeus.fr/air}LowFareSearchResponseAdditionalServices" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFareSearchResponsePricingDetail", propOrder = {
    "amountWithoutServices",
    "baseAmount",
    "baseAmountWithoutTax",
    "fees",
    "additionalServices"
})
public class LowFareSearchResponsePricingDetail implements Serializable
{

    @XmlElement(required = true)
    protected CurrencyAmount amountWithoutServices;
    @XmlElement(required = true)
    protected CurrencyAmount baseAmount;
    protected CurrencyAmount baseAmountWithoutTax;
    @XmlElement(required = true)
    protected LowFareSearchResponseFees fees;
    protected LowFareSearchResponseAdditionalServices additionalServices;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchResponsePricingDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchResponsePricingDetail(final CurrencyAmount amountWithoutServices, final CurrencyAmount baseAmount, final CurrencyAmount baseAmountWithoutTax, final LowFareSearchResponseFees fees, final LowFareSearchResponseAdditionalServices additionalServices) {
        this.amountWithoutServices = amountWithoutServices;
        this.baseAmount = baseAmount;
        this.baseAmountWithoutTax = baseAmountWithoutTax;
        this.fees = fees;
        this.additionalServices = additionalServices;
    }

    /**
     * Obtiene el valor de la propiedad amountWithoutServices.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getAmountWithoutServices() {
        return amountWithoutServices;
    }

    /**
     * Define el valor de la propiedad amountWithoutServices.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setAmountWithoutServices(CurrencyAmount value) {
        this.amountWithoutServices = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmount.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getBaseAmount() {
        return baseAmount;
    }

    /**
     * Define el valor de la propiedad baseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setBaseAmount(CurrencyAmount value) {
        this.baseAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmountWithoutTax.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getBaseAmountWithoutTax() {
        return baseAmountWithoutTax;
    }

    /**
     * Define el valor de la propiedad baseAmountWithoutTax.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setBaseAmountWithoutTax(CurrencyAmount value) {
        this.baseAmountWithoutTax = value;
    }

    /**
     * Obtiene el valor de la propiedad fees.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchResponseFees }
     *     
     */
    public LowFareSearchResponseFees getFees() {
        return fees;
    }

    /**
     * Define el valor de la propiedad fees.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchResponseFees }
     *     
     */
    public void setFees(LowFareSearchResponseFees value) {
        this.fees = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalServices.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchResponseAdditionalServices }
     *     
     */
    public LowFareSearchResponseAdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Define el valor de la propiedad additionalServices.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchResponseAdditionalServices }
     *     
     */
    public void setAdditionalServices(LowFareSearchResponseAdditionalServices value) {
        this.additionalServices = value;
    }

}
