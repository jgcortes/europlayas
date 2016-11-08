
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing solution applied to a group of one or more itineraries.
 * 
 * <p>Clase Java para GetInfoRequestPricingByItineraryGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoRequestPricingByItineraryGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://ws.amadeus.fr/air}PricingPassengersGroup"/&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ws.amadeus.fr/air}PricingAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoRequestPricingByItineraryGroup", propOrder = {
    "fareType",
    "validatingAirline",
    "passengerPricings",
    "itineraries"
})
public class GetInfoRequestPricingByItineraryGroup implements Serializable
{

    protected FareType fareType;
    @XmlElement(required = true)
    protected String validatingAirline;
    @XmlElement(required = true)
    protected GetInfoRequestPassengerPricingList passengerPricings;
    @XmlElement(required = true)
    protected ItineraryIdList itineraries;
    @XmlAttribute(name = "provider", required = true)
    protected Provider provider;
    @XmlAttribute(name = "multipleBookingRecordsRequired")
    protected Boolean multipleBookingRecordsRequired;

    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoRequestPricingByItineraryGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoRequestPricingByItineraryGroup(final FareType fareType, final String validatingAirline, final GetInfoRequestPassengerPricingList passengerPricings, final ItineraryIdList itineraries, final Provider provider, final Boolean multipleBookingRecordsRequired) {
        this.fareType = fareType;
        this.validatingAirline = validatingAirline;
        this.passengerPricings = passengerPricings;
        this.itineraries = itineraries;
        this.provider = provider;
        this.multipleBookingRecordsRequired = multipleBookingRecordsRequired;
    }

    /**
     * Obtiene el valor de la propiedad fareType.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getFareType() {
        return fareType;
    }

    /**
     * Define el valor de la propiedad fareType.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setFareType(FareType value) {
        this.fareType = value;
    }

    /**
     * Obtiene el valor de la propiedad validatingAirline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirline() {
        return validatingAirline;
    }

    /**
     * Define el valor de la propiedad validatingAirline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirline(String value) {
        this.validatingAirline = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerPricings.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoRequestPassengerPricingList }
     *     
     */
    public GetInfoRequestPassengerPricingList getPassengerPricings() {
        return passengerPricings;
    }

    /**
     * Define el valor de la propiedad passengerPricings.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoRequestPassengerPricingList }
     *     
     */
    public void setPassengerPricings(GetInfoRequestPassengerPricingList value) {
        this.passengerPricings = value;
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
     * Obtiene el valor de la propiedad provider.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Define el valor de la propiedad provider.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Obtiene el valor de la propiedad multipleBookingRecordsRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultipleBookingRecordsRequired() {
        if (multipleBookingRecordsRequired == null) {
            return false;
        } else {
            return multipleBookingRecordsRequired;
        }
    }

    /**
     * Define el valor de la propiedad multipleBookingRecordsRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleBookingRecordsRequired(Boolean value) {
        this.multipleBookingRecordsRequired = value;
    }

}
