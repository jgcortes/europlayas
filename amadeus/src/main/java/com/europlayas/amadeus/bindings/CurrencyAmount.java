
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Monetary amount (price with two fraction digits, greater than or equal to zero) and the currency code to reflect the currency in which this amount is expressed.
 * 
 * <p>Clase Java para CurrencyAmount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CurrencyAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="amount" use="required" type="{http://ws.amadeus.fr/common}NonNegativeAmount" /&gt;
 *       &lt;attribute name="currencyCode" use="required" type="{http://ws.amadeus.fr/air}CurrencyCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmount")
@XmlSeeAlso({
    BookRequestTotalAmount.class,
    PriceWithInfoResponseTotalAmount.class
})
public class CurrencyAmount implements Serializable
{

    @XmlAttribute(name = "amount", required = true)
    protected BigDecimal amount;
    @XmlAttribute(name = "currencyCode", required = true)
    protected CurrencyCode currencyCode;

    /**
     * Default no-arg constructor
     * 
     */
    public CurrencyAmount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CurrencyAmount(final BigDecimal amount, final CurrencyCode currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
