
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PriceWithInfoResponsePricingDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoResponsePricingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmount" type="{http://ws.amadeus.fr/air}PriceWithInfoResponseTotalAmount"/&gt;
 *         &lt;element name="baseAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *         &lt;element name="baseAmountWithoutTax" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="fees" type="{http://ws.amadeus.fr/air}PriceWithInfoResponseFees"/&gt;
 *         &lt;element name="additionalServices" type="{http://ws.amadeus.fr/air}PriceWithInfoResponseAdditionalServices" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoResponsePricingDetail", propOrder = {
    "totalAmount",
    "baseAmount",
    "baseAmountWithoutTax",
    "fees",
    "additionalServices"
})
public class PriceWithInfoResponsePricingDetail implements Serializable
{

    @XmlElement(required = true)
    protected PriceWithInfoResponseTotalAmount totalAmount;
    @XmlElement(required = true)
    protected CurrencyAmount baseAmount;
    protected CurrencyAmount baseAmountWithoutTax;
    @XmlElement(required = true)
    protected PriceWithInfoResponseFees fees;
    protected PriceWithInfoResponseAdditionalServices additionalServices;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoResponsePricingDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoResponsePricingDetail(final PriceWithInfoResponseTotalAmount totalAmount, final CurrencyAmount baseAmount, final CurrencyAmount baseAmountWithoutTax, final PriceWithInfoResponseFees fees, final PriceWithInfoResponseAdditionalServices additionalServices) {
        this.totalAmount = totalAmount;
        this.baseAmount = baseAmount;
        this.baseAmountWithoutTax = baseAmountWithoutTax;
        this.fees = fees;
        this.additionalServices = additionalServices;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoResponseTotalAmount }
     *     
     */
    public PriceWithInfoResponseTotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponseTotalAmount }
     *     
     */
    public void setTotalAmount(PriceWithInfoResponseTotalAmount value) {
        this.totalAmount = value;
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
     *     {@link PriceWithInfoResponseFees }
     *     
     */
    public PriceWithInfoResponseFees getFees() {
        return fees;
    }

    /**
     * Define el valor de la propiedad fees.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponseFees }
     *     
     */
    public void setFees(PriceWithInfoResponseFees value) {
        this.fees = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalServices.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoResponseAdditionalServices }
     *     
     */
    public PriceWithInfoResponseAdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Define el valor de la propiedad additionalServices.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponseAdditionalServices }
     *     
     */
    public void setAdditionalServices(PriceWithInfoResponseAdditionalServices value) {
        this.additionalServices = value;
    }

}
