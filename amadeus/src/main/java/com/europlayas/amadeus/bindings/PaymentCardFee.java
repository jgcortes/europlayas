
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.PaymentCardBrand;


/**
 * Fee due to a payment card.
 * 
 * <p>Clase Java para PaymentCardFee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="amount" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="brand" use="required" type="{http://ws.amadeus.fr/common}PaymentCardBrand" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://ws.amadeus.fr/air}CardFeeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardFee", propOrder = {

})
public class PaymentCardFee {

    @XmlElement(required = true)
    protected CurrencyAmount amount;
    protected ItineraryIdList itineraries;
    @XmlAttribute(name = "brand", required = true)
    protected PaymentCardBrand brand;
    @XmlAttribute(name = "type", required = true)
    protected CardFeeType type;

    /**
     * Default no-arg constructor
     * 
     */
    public PaymentCardFee() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PaymentCardFee(final CurrencyAmount amount, final ItineraryIdList itineraries, final PaymentCardBrand brand, final CardFeeType type) {
        this.amount = amount;
        this.itineraries = itineraries;
        this.brand = brand;
        this.type = type;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setAmount(CurrencyAmount value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryIdList }
     *     
     */
    public ItineraryIdList getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryIdList }
     *     
     */
    public void setItineraries(ItineraryIdList value) {
        this.itineraries = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBrand }
     *     
     */
    public PaymentCardBrand getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBrand }
     *     
     */
    public void setBrand(PaymentCardBrand value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link CardFeeType }
     *     
     */
    public CardFeeType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFeeType }
     *     
     */
    public void setType(CardFeeType value) {
        this.type = value;
    }

}
