
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * This message requests the system to search for priced itineraries between specific city pairs on specific dates for specific numbers and types of passengers. This search focuses on lowest fares. Optional request information to narrow the search include (but are not limited to): time window, radius around location, client preferences (airlines, cabin, flight types, etc.), fare types, among others.
 * 
 * <p>Clase Java para LowFareSearchRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="journey"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="originDestinations"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="originDestination" type="{http://ws.amadeus.fr/air}OriginDestination" maxOccurs="6"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passengers" type="{http://ws.amadeus.fr/air}SeatedPassengerList"/&gt;
 *         &lt;element name="travelPreferences" type="{http://ws.amadeus.fr/air}LowFareSearchTravelPreferences" minOccurs="0"/&gt;
 *         &lt;element name="pricing" type="{http://ws.amadeus.fr/air}SearchPricingMode" minOccurs="0"/&gt;
 *         &lt;element name="ticketingRequirements" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="minimumDelayBeforeTicketing" type="{http://ws.amadeus.fr/common}Unsigned0To365DaysOr1YearDuration" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="searchPreferences" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="oneWayCombinable" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="maximumNumberOfRecommendationOutbound" type="{http://ws.amadeus.fr/air}Integer1To30" /&gt;
 *                           &lt;attribute name="maximumNumberOfRecommendationInbound" type="{http://ws.amadeus.fr/air}Integer1To30" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="disableProviders" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="provider" type="{http://ws.amadeus.fr/air}Provider" maxOccurs="2"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="maximumNumberOfRecommendation"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                       &lt;minInclusive value="1"/&gt;
 *                       &lt;maxInclusive value="250"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="oneRecommendationPerDay" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="returnAdditionalServices" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="returnFreeBagageAllowanceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="returnToDepartureAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "LowFareSearchRequest", propOrder = {

})
public class LowFareSearchRequest {

    @XmlElement(required = true)
    protected LowFareSearchRequest.Journey journey;
    @XmlElement(required = true)
    protected SeatedPassengerList passengers;
    protected LowFareSearchTravelPreferences travelPreferences;
    protected SearchPricingMode pricing;
    protected LowFareSearchRequest.TicketingRequirements ticketingRequirements;
    protected LowFareSearchRequest.SearchPreferences searchPreferences;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchRequest(final LowFareSearchRequest.Journey journey, final SeatedPassengerList passengers, final LowFareSearchTravelPreferences travelPreferences, final SearchPricingMode pricing, final LowFareSearchRequest.TicketingRequirements ticketingRequirements, final LowFareSearchRequest.SearchPreferences searchPreferences) {
        this.journey = journey;
        this.passengers = passengers;
        this.travelPreferences = travelPreferences;
        this.pricing = pricing;
        this.ticketingRequirements = ticketingRequirements;
        this.searchPreferences = searchPreferences;
    }

    /**
     * Obtiene el valor de la propiedad journey.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchRequest.Journey }
     *     
     */
    public LowFareSearchRequest.Journey getJourney() {
        return journey;
    }

    /**
     * Define el valor de la propiedad journey.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchRequest.Journey }
     *     
     */
    public void setJourney(LowFareSearchRequest.Journey value) {
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
     * Obtiene el valor de la propiedad travelPreferences.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchTravelPreferences }
     *     
     */
    public LowFareSearchTravelPreferences getTravelPreferences() {
        return travelPreferences;
    }

    /**
     * Define el valor de la propiedad travelPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchTravelPreferences }
     *     
     */
    public void setTravelPreferences(LowFareSearchTravelPreferences value) {
        this.travelPreferences = value;
    }

    /**
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link SearchPricingMode }
     *     
     */
    public SearchPricingMode getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPricingMode }
     *     
     */
    public void setPricing(SearchPricingMode value) {
        this.pricing = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketingRequirements.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchRequest.TicketingRequirements }
     *     
     */
    public LowFareSearchRequest.TicketingRequirements getTicketingRequirements() {
        return ticketingRequirements;
    }

    /**
     * Define el valor de la propiedad ticketingRequirements.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchRequest.TicketingRequirements }
     *     
     */
    public void setTicketingRequirements(LowFareSearchRequest.TicketingRequirements value) {
        this.ticketingRequirements = value;
    }

    /**
     * Obtiene el valor de la propiedad searchPreferences.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchRequest.SearchPreferences }
     *     
     */
    public LowFareSearchRequest.SearchPreferences getSearchPreferences() {
        return searchPreferences;
    }

    /**
     * Define el valor de la propiedad searchPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchRequest.SearchPreferences }
     *     
     */
    public void setSearchPreferences(LowFareSearchRequest.SearchPreferences value) {
        this.searchPreferences = value;
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
     *       &lt;all&gt;
     *         &lt;element name="originDestinations"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="originDestination" type="{http://ws.amadeus.fr/air}OriginDestination" maxOccurs="6"/&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {

    })
    public static class Journey {

        @XmlElement(required = true)
        protected LowFareSearchRequest.Journey.OriginDestinations originDestinations;

        /**
         * Default no-arg constructor
         * 
         */
        public Journey() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Journey(final LowFareSearchRequest.Journey.OriginDestinations originDestinations) {
            this.originDestinations = originDestinations;
        }

        /**
         * Obtiene el valor de la propiedad originDestinations.
         * 
         * @return
         *     possible object is
         *     {@link LowFareSearchRequest.Journey.OriginDestinations }
         *     
         */
        public LowFareSearchRequest.Journey.OriginDestinations getOriginDestinations() {
            return originDestinations;
        }

        /**
         * Define el valor de la propiedad originDestinations.
         * 
         * @param value
         *     allowed object is
         *     {@link LowFareSearchRequest.Journey.OriginDestinations }
         *     
         */
        public void setOriginDestinations(LowFareSearchRequest.Journey.OriginDestinations value) {
            this.originDestinations = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="originDestination" type="{http://ws.amadeus.fr/air}OriginDestination" maxOccurs="6"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "originDestination"
        })
        public static class OriginDestinations {

            @XmlElement(required = true)
            protected List<OriginDestination> originDestination;

            /**
             * Default no-arg constructor
             * 
             */
            public OriginDestinations() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public OriginDestinations(final List<OriginDestination> originDestination) {
                this.originDestination = originDestination;
            }

            /**
             * Gets the value of the originDestination property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originDestination property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOriginDestination().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OriginDestination }
             * 
             * 
             */
            public List<OriginDestination> getOriginDestination() {
                if (originDestination == null) {
                    originDestination = new ArrayList<OriginDestination>();
                }
                return this.originDestination;
            }

        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="oneWayCombinable" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="maximumNumberOfRecommendationOutbound" type="{http://ws.amadeus.fr/air}Integer1To30" /&gt;
     *                 &lt;attribute name="maximumNumberOfRecommendationInbound" type="{http://ws.amadeus.fr/air}Integer1To30" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="disableProviders" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="provider" type="{http://ws.amadeus.fr/air}Provider" maxOccurs="2"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="maximumNumberOfRecommendation"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *             &lt;minInclusive value="1"/&gt;
     *             &lt;maxInclusive value="250"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="oneRecommendationPerDay" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="returnAdditionalServices" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="returnFreeBagageAllowanceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="returnToDepartureAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oneWayCombinable",
        "disableProviders"
    })
    public static class SearchPreferences {

        protected LowFareSearchRequest.SearchPreferences.OneWayCombinable oneWayCombinable;
        protected LowFareSearchRequest.SearchPreferences.DisableProviders disableProviders;
        @XmlAttribute(name = "maximumNumberOfRecommendation")
        protected Integer maximumNumberOfRecommendation;
        @XmlAttribute(name = "oneRecommendationPerDay")
        protected Boolean oneRecommendationPerDay;
        @XmlAttribute(name = "returnAdditionalServices")
        protected Boolean returnAdditionalServices;
        @XmlAttribute(name = "returnFreeBagageAllowanceOnly")
        protected Boolean returnFreeBagageAllowanceOnly;
        @XmlAttribute(name = "returnToDepartureAirport")
        protected Boolean returnToDepartureAirport;

        /**
         * Default no-arg constructor
         * 
         */
        public SearchPreferences() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SearchPreferences(final LowFareSearchRequest.SearchPreferences.OneWayCombinable oneWayCombinable, final LowFareSearchRequest.SearchPreferences.DisableProviders disableProviders, final Integer maximumNumberOfRecommendation, final Boolean oneRecommendationPerDay, final Boolean returnAdditionalServices, final Boolean returnFreeBagageAllowanceOnly, final Boolean returnToDepartureAirport) {
            this.oneWayCombinable = oneWayCombinable;
            this.disableProviders = disableProviders;
            this.maximumNumberOfRecommendation = maximumNumberOfRecommendation;
            this.oneRecommendationPerDay = oneRecommendationPerDay;
            this.returnAdditionalServices = returnAdditionalServices;
            this.returnFreeBagageAllowanceOnly = returnFreeBagageAllowanceOnly;
            this.returnToDepartureAirport = returnToDepartureAirport;
        }

        /**
         * Obtiene el valor de la propiedad oneWayCombinable.
         * 
         * @return
         *     possible object is
         *     {@link LowFareSearchRequest.SearchPreferences.OneWayCombinable }
         *     
         */
        public LowFareSearchRequest.SearchPreferences.OneWayCombinable getOneWayCombinable() {
            return oneWayCombinable;
        }

        /**
         * Define el valor de la propiedad oneWayCombinable.
         * 
         * @param value
         *     allowed object is
         *     {@link LowFareSearchRequest.SearchPreferences.OneWayCombinable }
         *     
         */
        public void setOneWayCombinable(LowFareSearchRequest.SearchPreferences.OneWayCombinable value) {
            this.oneWayCombinable = value;
        }

        /**
         * Obtiene el valor de la propiedad disableProviders.
         * 
         * @return
         *     possible object is
         *     {@link LowFareSearchRequest.SearchPreferences.DisableProviders }
         *     
         */
        public LowFareSearchRequest.SearchPreferences.DisableProviders getDisableProviders() {
            return disableProviders;
        }

        /**
         * Define el valor de la propiedad disableProviders.
         * 
         * @param value
         *     allowed object is
         *     {@link LowFareSearchRequest.SearchPreferences.DisableProviders }
         *     
         */
        public void setDisableProviders(LowFareSearchRequest.SearchPreferences.DisableProviders value) {
            this.disableProviders = value;
        }

        /**
         * Obtiene el valor de la propiedad maximumNumberOfRecommendation.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaximumNumberOfRecommendation() {
            return maximumNumberOfRecommendation;
        }

        /**
         * Define el valor de la propiedad maximumNumberOfRecommendation.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaximumNumberOfRecommendation(Integer value) {
            this.maximumNumberOfRecommendation = value;
        }

        /**
         * Obtiene el valor de la propiedad oneRecommendationPerDay.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOneRecommendationPerDay() {
            return oneRecommendationPerDay;
        }

        /**
         * Define el valor de la propiedad oneRecommendationPerDay.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOneRecommendationPerDay(Boolean value) {
            this.oneRecommendationPerDay = value;
        }

        /**
         * Obtiene el valor de la propiedad returnAdditionalServices.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAdditionalServices() {
            return returnAdditionalServices;
        }

        /**
         * Define el valor de la propiedad returnAdditionalServices.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAdditionalServices(Boolean value) {
            this.returnAdditionalServices = value;
        }

        /**
         * Obtiene el valor de la propiedad returnFreeBagageAllowanceOnly.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnFreeBagageAllowanceOnly() {
            return returnFreeBagageAllowanceOnly;
        }

        /**
         * Define el valor de la propiedad returnFreeBagageAllowanceOnly.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnFreeBagageAllowanceOnly(Boolean value) {
            this.returnFreeBagageAllowanceOnly = value;
        }

        /**
         * Obtiene el valor de la propiedad returnToDepartureAirport.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnToDepartureAirport() {
            return returnToDepartureAirport;
        }

        /**
         * Define el valor de la propiedad returnToDepartureAirport.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnToDepartureAirport(Boolean value) {
            this.returnToDepartureAirport = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="provider" type="{http://ws.amadeus.fr/air}Provider" maxOccurs="2"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "provider"
        })
        public static class DisableProviders {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected List<Provider> provider;

            /**
             * Default no-arg constructor
             * 
             */
            public DisableProviders() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public DisableProviders(final List<Provider> provider) {
                this.provider = provider;
            }

            /**
             * Gets the value of the provider property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the provider property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProvider().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Provider }
             * 
             * 
             */
            public List<Provider> getProvider() {
                if (provider == null) {
                    provider = new ArrayList<Provider>();
                }
                return this.provider;
            }

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
         *       &lt;attribute name="maximumNumberOfRecommendationOutbound" type="{http://ws.amadeus.fr/air}Integer1To30" /&gt;
         *       &lt;attribute name="maximumNumberOfRecommendationInbound" type="{http://ws.amadeus.fr/air}Integer1To30" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OneWayCombinable {

            @XmlAttribute(name = "maximumNumberOfRecommendationOutbound")
            protected Integer maximumNumberOfRecommendationOutbound;
            @XmlAttribute(name = "maximumNumberOfRecommendationInbound")
            protected Integer maximumNumberOfRecommendationInbound;

            /**
             * Default no-arg constructor
             * 
             */
            public OneWayCombinable() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public OneWayCombinable(final Integer maximumNumberOfRecommendationOutbound, final Integer maximumNumberOfRecommendationInbound) {
                this.maximumNumberOfRecommendationOutbound = maximumNumberOfRecommendationOutbound;
                this.maximumNumberOfRecommendationInbound = maximumNumberOfRecommendationInbound;
            }

            /**
             * Obtiene el valor de la propiedad maximumNumberOfRecommendationOutbound.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaximumNumberOfRecommendationOutbound() {
                return maximumNumberOfRecommendationOutbound;
            }

            /**
             * Define el valor de la propiedad maximumNumberOfRecommendationOutbound.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaximumNumberOfRecommendationOutbound(Integer value) {
                this.maximumNumberOfRecommendationOutbound = value;
            }

            /**
             * Obtiene el valor de la propiedad maximumNumberOfRecommendationInbound.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaximumNumberOfRecommendationInbound() {
                return maximumNumberOfRecommendationInbound;
            }

            /**
             * Define el valor de la propiedad maximumNumberOfRecommendationInbound.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaximumNumberOfRecommendationInbound(Integer value) {
                this.maximumNumberOfRecommendationInbound = value;
            }

        }

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
     *       &lt;attribute name="minimumDelayBeforeTicketing" type="{http://ws.amadeus.fr/common}Unsigned0To365DaysOr1YearDuration" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketingRequirements {

        @XmlAttribute(name = "minimumDelayBeforeTicketing")
        protected Duration minimumDelayBeforeTicketing;

        /**
         * Default no-arg constructor
         * 
         */
        public TicketingRequirements() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TicketingRequirements(final Duration minimumDelayBeforeTicketing) {
            this.minimumDelayBeforeTicketing = minimumDelayBeforeTicketing;
        }

        /**
         * Obtiene el valor de la propiedad minimumDelayBeforeTicketing.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinimumDelayBeforeTicketing() {
            return minimumDelayBeforeTicketing;
        }

        /**
         * Define el valor de la propiedad minimumDelayBeforeTicketing.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinimumDelayBeforeTicketing(Duration value) {
            this.minimumDelayBeforeTicketing = value;
        }

    }

}
