
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BookResponsePricingDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookResponsePricingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmount" type="{http://ws.amadeus.fr/air}BookResponseTotalAmount"/&gt;
 *         &lt;element name="baseAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *         &lt;element name="baseAmountWithoutTax" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="fees" type="{http://ws.amadeus.fr/air}BookResponseFees"/&gt;
 *         &lt;element name="additionalServices" type="{http://ws.amadeus.fr/air}BookResponseAdditionalServices"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookResponsePricingDetail", propOrder = {
    "totalAmount",
    "baseAmount",
    "baseAmountWithoutTax",
    "fees",
    "additionalServices"
})
public class BookResponsePricingDetail {

    @XmlElement(required = true)
    protected BookResponseTotalAmount totalAmount;
    @XmlElement(required = true)
    protected CurrencyAmount baseAmount;
    protected CurrencyAmount baseAmountWithoutTax;
    @XmlElement(required = true)
    protected BookResponseFees fees;
    @XmlElement(required = true)
    protected BookResponseAdditionalServices additionalServices;

    /**
     * Default no-arg constructor
     * 
     */
    public BookResponsePricingDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookResponsePricingDetail(final BookResponseTotalAmount totalAmount, final CurrencyAmount baseAmount, final CurrencyAmount baseAmountWithoutTax, final BookResponseFees fees, final BookResponseAdditionalServices additionalServices) {
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
     *     {@link BookResponseTotalAmount }
     *     
     */
    public BookResponseTotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponseTotalAmount }
     *     
     */
    public void setTotalAmount(BookResponseTotalAmount value) {
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
     *     {@link BookResponseFees }
     *     
     */
    public BookResponseFees getFees() {
        return fees;
    }

    /**
     * Define el valor de la propiedad fees.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponseFees }
     *     
     */
    public void setFees(BookResponseFees value) {
        this.fees = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalServices.
     * 
     * @return
     *     possible object is
     *     {@link BookResponseAdditionalServices }
     *     
     */
    public BookResponseAdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Define el valor de la propiedad additionalServices.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponseAdditionalServices }
     *     
     */
    public void setAdditionalServices(BookResponseAdditionalServices value) {
        this.additionalServices = value;
    }

}
