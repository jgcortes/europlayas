
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PriceRequestPricingDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceRequestPricingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="baseAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="baseAmountWithoutTax" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="fees" type="{http://ws.amadeus.fr/air}PriceRequestFees" minOccurs="0"/&gt;
 *         &lt;element name="additionalServices" type="{http://ws.amadeus.fr/air}PriceRequestAdditionalServices" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRequestPricingDetail", propOrder = {
    "totalAmount",
    "baseAmount",
    "baseAmountWithoutTax",
    "fees",
    "additionalServices"
})
public class PriceRequestPricingDetail implements Serializable
{

    protected CurrencyAmount totalAmount;
    protected CurrencyAmount baseAmount;
    protected CurrencyAmount baseAmountWithoutTax;
    protected PriceRequestFees fees;
    protected PriceRequestAdditionalServices additionalServices;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceRequestPricingDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceRequestPricingDetail(final CurrencyAmount totalAmount, final CurrencyAmount baseAmount, final CurrencyAmount baseAmountWithoutTax, final PriceRequestFees fees, final PriceRequestAdditionalServices additionalServices) {
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
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalAmount(CurrencyAmount value) {
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
     *     {@link PriceRequestFees }
     *     
     */
    public PriceRequestFees getFees() {
        return fees;
    }

    /**
     * Define el valor de la propiedad fees.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestFees }
     *     
     */
    public void setFees(PriceRequestFees value) {
        this.fees = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalServices.
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestAdditionalServices }
     *     
     */
    public PriceRequestAdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Define el valor de la propiedad additionalServices.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestAdditionalServices }
     *     
     */
    public void setAdditionalServices(PriceRequestAdditionalServices value) {
        this.additionalServices = value;
    }

}
