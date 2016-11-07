
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing solution applied to a group of one or more itineraries.
 * 
 * <p>Clase Java para PriceWithInfoResponsePricingByItineraryGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoResponsePricingByItineraryGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingDetail" type="{http://ws.amadeus.fr/air}PriceWithInfoResponsePricingDetail" minOccurs="0"/&gt;
 *         &lt;element name="fareType" type="{http://ws.amadeus.fr/air}FareType" minOccurs="0"/&gt;
 *         &lt;element name="validatingAirline" type="{http://ws.amadeus.fr/common}AirlineCode"/&gt;
 *         &lt;element name="passengerPricings" type="{http://ws.amadeus.fr/air}PriceWithInfoResponsePassengerPricingList"/&gt;
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
@XmlType(name = "PriceWithInfoResponsePricingByItineraryGroup", propOrder = {
    "pricingDetail",
    "fareType",
    "validatingAirline",
    "passengerPricings",
    "itineraries"
})
public class PriceWithInfoResponsePricingByItineraryGroup {

    protected PriceWithInfoResponsePricingDetail pricingDetail;
    protected FareType fareType;
    @XmlElement(required = true)
    protected String validatingAirline;
    @XmlElement(required = true)
    protected PriceWithInfoResponsePassengerPricingList passengerPricings;
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
    public PriceWithInfoResponsePricingByItineraryGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoResponsePricingByItineraryGroup(final PriceWithInfoResponsePricingDetail pricingDetail, final FareType fareType, final String validatingAirline, final PriceWithInfoResponsePassengerPricingList passengerPricings, final ItineraryIdList itineraries, final Provider provider, final Boolean multipleBookingRecordsRequired) {
        this.pricingDetail = pricingDetail;
        this.fareType = fareType;
        this.validatingAirline = validatingAirline;
        this.passengerPricings = passengerPricings;
        this.itineraries = itineraries;
        this.provider = provider;
        this.multipleBookingRecordsRequired = multipleBookingRecordsRequired;
    }

    /**
     * Obtiene el valor de la propiedad pricingDetail.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoResponsePricingDetail }
     *     
     */
    public PriceWithInfoResponsePricingDetail getPricingDetail() {
        return pricingDetail;
    }

    /**
     * Define el valor de la propiedad pricingDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponsePricingDetail }
     *     
     */
    public void setPricingDetail(PriceWithInfoResponsePricingDetail value) {
        this.pricingDetail = value;
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
     *     {@link PriceWithInfoResponsePassengerPricingList }
     *     
     */
    public PriceWithInfoResponsePassengerPricingList getPassengerPricings() {
        return passengerPricings;
    }

    /**
     * Define el valor de la propiedad passengerPricings.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponsePassengerPricingList }
     *     
     */
    public void setPassengerPricings(PriceWithInfoResponsePassengerPricingList value) {
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
