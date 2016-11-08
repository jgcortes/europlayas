
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details for applicable fees (sum for all segments of all itineraries and for all passengers).
 * 
 * <p>Clase Java para PricingSolutionFees complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PricingSolutionFees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="paymentCard" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *         &lt;element name="luggage" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingSolutionFees", propOrder = {

})
public class PricingSolutionFees implements Serializable
{

    @XmlElement(required = true)
    protected CurrencyAmount paymentCard;
    @XmlElement(required = true)
    protected CurrencyAmount luggage;

    /**
     * Default no-arg constructor
     * 
     */
    public PricingSolutionFees() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PricingSolutionFees(final CurrencyAmount paymentCard, final CurrencyAmount luggage) {
        this.paymentCard = paymentCard;
        this.luggage = luggage;
    }

    /**
     * Obtiene el valor de la propiedad paymentCard.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getPaymentCard() {
        return paymentCard;
    }

    /**
     * Define el valor de la propiedad paymentCard.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setPaymentCard(CurrencyAmount value) {
        this.paymentCard = value;
    }

    /**
     * Obtiene el valor de la propiedad luggage.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getLuggage() {
        return luggage;
    }

    /**
     * Define el valor de la propiedad luggage.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setLuggage(CurrencyAmount value) {
        this.luggage = value;
    }

}
