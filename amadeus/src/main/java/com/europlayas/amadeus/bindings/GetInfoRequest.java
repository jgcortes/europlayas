
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This message requests the system to get informations on  a specific journey for one or more passengers.
 * 
 * <p>Clase Java para GetInfoRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journey" type="{http://ws.amadeus.fr/air}Journey"/&gt;
 *         &lt;element name="passengers" type="{http://ws.amadeus.fr/air}SeatedPassengerList"/&gt;
 *         &lt;element name="pricing" type="{http://ws.amadeus.fr/air}GetInfoPricingMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoRequest", propOrder = {
    "journey",
    "passengers",
    "pricing"
})
public class GetInfoRequest {

    @XmlElement(required = true)
    protected Journey journey;
    @XmlElement(required = true)
    protected SeatedPassengerList passengers;
    @XmlElement(required = true)
    protected GetInfoPricingMode pricing;

    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoRequest(final Journey journey, final SeatedPassengerList passengers, final GetInfoPricingMode pricing) {
        this.journey = journey;
        this.passengers = passengers;
        this.pricing = pricing;
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
     *     {@link SeatedPassengerList }
     *     
     */
    public SeatedPassengerList getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatedPassengerList }
     *     
     */
    public void setPassengers(SeatedPassengerList value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoPricingMode }
     *     
     */
    public GetInfoPricingMode getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoPricingMode }
     *     
     */
    public void setPricing(GetInfoPricingMode value) {
        this.pricing = value;
    }

}
