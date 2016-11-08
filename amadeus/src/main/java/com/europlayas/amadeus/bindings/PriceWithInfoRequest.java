
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.PaymentCardBrand;


/**
 * This message requests the system to price a specific journey for one or more passengers. Preferably, but not necessarily, this message should be used to request the system to confirm the pricing solution applied to detailed itineraries by a recommendation found by Low Fare Search. The system will also search for additional info such as detailed segment information, the need to provide information such as an identity document, redress information and residence contact information (related to Advanced Passenger Information System, Secure Flight, DHS Traveler Redress Inquiry Program). The system may also search for text rules and seat map details, when requested.
 * 
 * <p>Clase Java para PriceWithInfoRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="journey" type="{http://ws.amadeus.fr/air}Journey"/&gt;
 *         &lt;element name="passengers" type="{http://ws.amadeus.fr/air}SeatedPassengerWithServicesList"/&gt;
 *         &lt;element name="pricing" type="{http://ws.amadeus.fr/air}PriceWithInfoPricingMode"/&gt;
 *         &lt;element name="payment" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="cardBrand" use="required" type="{http://ws.amadeus.fr/common}PaymentCardBrand" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoRequest", propOrder = {

})
@XmlRootElement(name = "priceWithInfoRequest")
public class PriceWithInfoRequest implements Serializable
{

    @XmlElement(required = true)
    protected Journey journey;
    @XmlElement(required = true)
    protected SeatedPassengerWithServicesList passengers;
    @XmlElement(required = true)
    protected PriceWithInfoPricingMode pricing;
    protected PriceWithInfoRequest.Payment payment;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoRequest(final Journey journey, final SeatedPassengerWithServicesList passengers, final PriceWithInfoPricingMode pricing, final PriceWithInfoRequest.Payment payment) {
        this.journey = journey;
        this.passengers = passengers;
        this.pricing = pricing;
        this.payment = payment;
    }

    /**
     * Obtiene el valor de la propiedad journey.
     * 
     * @return
     *     possible object is
     *     {@link Journey }
     *     
     */
    public Journey getJourney() {
        return journey;
    }

    /**
     * Define el valor de la propiedad journey.
     * 
     * @param value
     *     allowed object is
     *     {@link Journey }
     *     
     */
    public void setJourney(Journey value) {
        this.journey = value;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link SeatedPassengerWithServicesList }
     *     
     */
    public SeatedPassengerWithServicesList getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatedPassengerWithServicesList }
     *     
     */
    public void setPassengers(SeatedPassengerWithServicesList value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoPricingMode }
     *     
     */
    public PriceWithInfoPricingMode getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoPricingMode }
     *     
     */
    public void setPricing(PriceWithInfoPricingMode value) {
        this.pricing = value;
    }

    /**
     * Obtiene el valor de la propiedad payment.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoRequest.Payment }
     *     
     */
    public PriceWithInfoRequest.Payment getPayment() {
        return payment;
    }

    /**
     * Define el valor de la propiedad payment.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoRequest.Payment }
     *     
     */
    public void setPayment(PriceWithInfoRequest.Payment value) {
        this.payment = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="cardBrand" use="required" type="{http://ws.amadeus.fr/common}PaymentCardBrand" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Payment implements Serializable
    {

        @XmlAttribute(name = "cardBrand", required = true)
        protected PaymentCardBrand cardBrand;

        /**
         * Default no-arg constructor
         * 
         */
        public Payment() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Payment(final PaymentCardBrand cardBrand) {
            this.cardBrand = cardBrand;
        }

        /**
         * Obtiene el valor de la propiedad cardBrand.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardBrand }
         *     
         */
        public PaymentCardBrand getCardBrand() {
            return cardBrand;
        }

        /**
         * Define el valor de la propiedad cardBrand.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardBrand }
         *     
         */
        public void setCardBrand(PaymentCardBrand value) {
            this.cardBrand = value;
        }

    }

}
