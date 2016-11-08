
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.europlayas.amadeus.util.DateAdapter;


/**
 * <p>Clase Java para OneWayRecommendation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OneWayRecommendation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="pricingDetail" type="{http://ws.amadeus.fr/air}LowFareSearchResponsePricingDetail"/&gt;
 *         &lt;element name="fareType" type="{http://ws.amadeus.fr/air}FareType"/&gt;
 *         &lt;element name="validatingAirlines" type="{http://ws.amadeus.fr/air}ValidatingAirlineCodeList"/&gt;
 *         &lt;element name="passengerPricings" type="{http://ws.amadeus.fr/air}SearchPassengerPricingList"/&gt;
 *       &lt;/all&gt;
 *       &lt;attGroup ref="{http://ws.amadeus.fr/air}PricingAttributeGroup"/&gt;
 *       &lt;attribute name="originDestinationId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="itineraryId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="lastTicketingDate" type="{http://ws.amadeus.fr/common}UtcDate" /&gt;
 *       &lt;attribute name="numberOfBookableSeats" type="{http://ws.amadeus.fr/air}NumberOfBookableSeats" /&gt;
 *       &lt;attribute name="lowCost" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneWayRecommendation", propOrder = {

})
public class OneWayRecommendation implements Serializable
{

    @XmlElement(required = true)
    protected LowFareSearchResponsePricingDetail pricingDetail;
    @XmlElement(required = true)
    protected FareType fareType;
    @XmlElement(required = true)
    protected ValidatingAirlineCodeList validatingAirlines;
    @XmlElement(required = true)
    protected SearchPassengerPricingList passengerPricings;
    @XmlAttribute(name = "originDestinationId", required = true)
    protected int originDestinationId;
    @XmlAttribute(name = "itineraryId", required = true)
    protected int itineraryId;
    @XmlAttribute(name = "lastTicketingDate")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDate lastTicketingDate;
    @XmlAttribute(name = "numberOfBookableSeats")
    protected Short numberOfBookableSeats;
    @XmlAttribute(name = "lowCost")
    protected Boolean lowCost;
    @XmlAttribute(name = "provider", required = true)
    protected Provider provider;
    @XmlAttribute(name = "multipleBookingRecordsRequired")
    protected Boolean multipleBookingRecordsRequired;

    /**
     * Default no-arg constructor
     * 
     */
    public OneWayRecommendation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OneWayRecommendation(final LowFareSearchResponsePricingDetail pricingDetail, final FareType fareType, final ValidatingAirlineCodeList validatingAirlines, final SearchPassengerPricingList passengerPricings, final int originDestinationId, final int itineraryId, final LocalDate lastTicketingDate, final Short numberOfBookableSeats, final Boolean lowCost, final Provider provider, final Boolean multipleBookingRecordsRequired) {
        this.pricingDetail = pricingDetail;
        this.fareType = fareType;
        this.validatingAirlines = validatingAirlines;
        this.passengerPricings = passengerPricings;
        this.originDestinationId = originDestinationId;
        this.itineraryId = itineraryId;
        this.lastTicketingDate = lastTicketingDate;
        this.numberOfBookableSeats = numberOfBookableSeats;
        this.lowCost = lowCost;
        this.provider = provider;
        this.multipleBookingRecordsRequired = multipleBookingRecordsRequired;
    }

    /**
     * Obtiene el valor de la propiedad pricingDetail.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchResponsePricingDetail }
     *     
     */
    public LowFareSearchResponsePricingDetail getPricingDetail() {
        return pricingDetail;
    }

    /**
     * Define el valor de la propiedad pricingDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchResponsePricingDetail }
     *     
     */
    public void setPricingDetail(LowFareSearchResponsePricingDetail value) {
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
     * Obtiene el valor de la propiedad validatingAirlines.
     * 
     * @return
     *     possible object is
     *     {@link ValidatingAirlineCodeList }
     *     
     */
    public ValidatingAirlineCodeList getValidatingAirlines() {
        return validatingAirlines;
    }

    /**
     * Define el valor de la propiedad validatingAirlines.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatingAirlineCodeList }
     *     
     */
    public void setValidatingAirlines(ValidatingAirlineCodeList value) {
        this.validatingAirlines = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerPricings.
     * 
     * @return
     *     possible object is
     *     {@link SearchPassengerPricingList }
     *     
     */
    public SearchPassengerPricingList getPassengerPricings() {
        return passengerPricings;
    }

    /**
     * Define el valor de la propiedad passengerPricings.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPassengerPricingList }
     *     
     */
    public void setPassengerPricings(SearchPassengerPricingList value) {
        this.passengerPricings = value;
    }

    /**
     * Obtiene el valor de la propiedad originDestinationId.
     * 
     */
    public int getOriginDestinationId() {
        return originDestinationId;
    }

    /**
     * Define el valor de la propiedad originDestinationId.
     * 
     */
    public void setOriginDestinationId(int value) {
        this.originDestinationId = value;
    }

    /**
     * Obtiene el valor de la propiedad itineraryId.
     * 
     */
    public int getItineraryId() {
        return itineraryId;
    }

    /**
     * Define el valor de la propiedad itineraryId.
     * 
     */
    public void setItineraryId(int value) {
        this.itineraryId = value;
    }

    /**
     * Obtiene el valor de la propiedad lastTicketingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLastTicketingDate() {
        return lastTicketingDate;
    }

    /**
     * Define el valor de la propiedad lastTicketingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTicketingDate(LocalDate value) {
        this.lastTicketingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfBookableSeats.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfBookableSeats() {
        return numberOfBookableSeats;
    }

    /**
     * Define el valor de la propiedad numberOfBookableSeats.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfBookableSeats(Short value) {
        this.numberOfBookableSeats = value;
    }

    /**
     * Obtiene el valor de la propiedad lowCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowCost() {
        return lowCost;
    }

    /**
     * Define el valor de la propiedad lowCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowCost(Boolean value) {
        this.lowCost = value;
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
