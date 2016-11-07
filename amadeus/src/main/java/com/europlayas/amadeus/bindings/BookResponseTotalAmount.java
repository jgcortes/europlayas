
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Total price of the trip all extra fees included.
 * 
 * <p>Clase Java para BookResponseTotalAmount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookResponseTotalAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="billedAmount" type="{http://ws.amadeus.fr/common}CurrencyAmount"/&gt;
 *         &lt;element name="convertedAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookResponseTotalAmount", propOrder = {

})
public class BookResponseTotalAmount {

    @XmlElement(required = true)
    protected com.europlayas.amadeus.bindings.common.CurrencyAmount billedAmount;
    protected com.europlayas.amadeus.bindings.CurrencyAmount convertedAmount;

    /**
     * Default no-arg constructor
     * 
     */
    public BookResponseTotalAmount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookResponseTotalAmount(final com.europlayas.amadeus.bindings.common.CurrencyAmount billedAmount, final com.europlayas.amadeus.bindings.CurrencyAmount convertedAmount) {
        this.billedAmount = billedAmount;
        this.convertedAmount = convertedAmount;
    }

    /**
     * Obtiene el valor de la propiedad billedAmount.
     * 
     * @return
     *     possible object is
     *     {@link com.europlayas.amadeus.bindings.common.CurrencyAmount }
     *     
     */
    public com.europlayas.amadeus.bindings.common.CurrencyAmount getBilledAmount() {
        return billedAmount;
    }

    /**
     * Define el valor de la propiedad billedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link com.europlayas.amadeus.bindings.common.CurrencyAmount }
     *     
     */
    public void setBilledAmount(com.europlayas.amadeus.bindings.common.CurrencyAmount value) {
        this.billedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad convertedAmount.
     * 
     * @return
     *     possible object is
     *     {@link com.europlayas.amadeus.bindings.CurrencyAmount }
     *     
     */
    public com.europlayas.amadeus.bindings.CurrencyAmount getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * Define el valor de la propiedad convertedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link com.europlayas.amadeus.bindings.CurrencyAmount }
     *     
     */
    public void setConvertedAmount(com.europlayas.amadeus.bindings.CurrencyAmount value) {
        this.convertedAmount = value;
    }

}
