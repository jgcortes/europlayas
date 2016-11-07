
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This message requests the system to search for itineraries between specific city pairs on specific dates for specific numbers and types of passengers. This search focuses on availabilities, regardless of fares. Optional request information to narrow the search include (but are not limited to): client preferences (airlines, cabin, flight types, etc.), booking class, among others.
 * 
 * <p>Clase Java para AvailabilitySearchRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchRequest"&gt;
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
 *                             &lt;element name="originDestination" maxOccurs="6"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="origin" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
 *                                       &lt;element name="destination" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="departureDateTime"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *                                                 &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="arrivalDateTime"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *                                                 &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/choice&gt;
 *                                       &lt;element name="connectionPoints" type="{http://ws.amadeus.fr/air}ConnectionPoints" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="travelPreferences" type="{http://ws.amadeus.fr/air}TravelPreferences" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySearchRequest", propOrder = {

})
public class AvailabilitySearchRequest {

    @XmlElement(required = true)
    protected AvailabilitySearchRequest.Journey journey;
    @XmlElement(required = true)
    protected SeatedPassengerList passengers;
    protected TravelPreferences travelPreferences;

    /**
     * Default no-arg constructor
     * 
     */
    public AvailabilitySearchRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AvailabilitySearchRequest(final AvailabilitySearchRequest.Journey journey, final SeatedPassengerList passengers, final TravelPreferences travelPreferences) {
        this.journey = journey;
        this.passengers = passengers;
        this.travelPreferences = travelPreferences;
    }

    /**
     * Obtiene el valor de la propiedad journey.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilitySearchRequest.Journey }
     *     
     */
    public AvailabilitySearchRequest.Journey getJourney() {
        return journey;
    }

    /**
     * Define el valor de la propiedad journey.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilitySearchRequest.Journey }
     *     
     */
    public void setJourney(AvailabilitySearchRequest.Journey value) {
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
     *     {@link TravelPreferences }
     *     
     */
    public TravelPreferences getTravelPreferences() {
        return travelPreferences;
    }

    /**
     * Define el valor de la propiedad travelPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPreferences }
     *     
     */
    public void setTravelPreferences(TravelPreferences value) {
        this.travelPreferences = value;
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
     *                   &lt;element name="originDestination" maxOccurs="6"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="origin" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
     *                             &lt;element name="destination" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="departureDateTime"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
     *                                       &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="arrivalDateTime"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
     *                                       &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/choice&gt;
     *                             &lt;element name="connectionPoints" type="{http://ws.amadeus.fr/air}ConnectionPoints" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        protected AvailabilitySearchRequest.Journey.OriginDestinations originDestinations;

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
        public Journey(final AvailabilitySearchRequest.Journey.OriginDestinations originDestinations) {
            this.originDestinations = originDestinations;
        }

        /**
         * Obtiene el valor de la propiedad originDestinations.
         * 
         * @return
         *     possible object is
         *     {@link AvailabilitySearchRequest.Journey.OriginDestinations }
         *     
         */
        public AvailabilitySearchRequest.Journey.OriginDestinations getOriginDestinations() {
            return originDestinations;
        }

        /**
         * Define el valor de la propiedad originDestinations.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilitySearchRequest.Journey.OriginDestinations }
         *     
         */
        public void setOriginDestinations(AvailabilitySearchRequest.Journey.OriginDestinations value) {
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
         *         &lt;element name="originDestination" maxOccurs="6"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="origin" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
         *                   &lt;element name="destination" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="departureDateTime"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
         *                             &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="arrivalDateTime"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
         *                             &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/choice&gt;
         *                   &lt;element name="connectionPoints" type="{http://ws.amadeus.fr/air}ConnectionPoints" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            protected List<AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination> originDestination;

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
            public OriginDestinations(final List<AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination> originDestination) {
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
             * {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination }
             * 
             * 
             */
            public List<AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination> getOriginDestination() {
                if (originDestination == null) {
                    originDestination = new ArrayList<AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination>();
                }
                return this.originDestination;
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
             *         &lt;element name="origin" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
             *         &lt;element name="destination" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
             *         &lt;choice&gt;
             *           &lt;element name="departureDateTime"&gt;
             *             &lt;complexType&gt;
             *               &lt;complexContent&gt;
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                   &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
             *                   &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
             *                 &lt;/restriction&gt;
             *               &lt;/complexContent&gt;
             *             &lt;/complexType&gt;
             *           &lt;/element&gt;
             *           &lt;element name="arrivalDateTime"&gt;
             *             &lt;complexType&gt;
             *               &lt;complexContent&gt;
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                   &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
             *                   &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
             *                 &lt;/restriction&gt;
             *               &lt;/complexContent&gt;
             *             &lt;/complexType&gt;
             *           &lt;/element&gt;
             *         &lt;/choice&gt;
             *         &lt;element name="connectionPoints" type="{http://ws.amadeus.fr/air}ConnectionPoints" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "origin",
                "destination",
                "departureDateTime",
                "arrivalDateTime",
                "connectionPoints"
            })
            public static class OriginDestination {

                @XmlElement(required = true)
                protected IataLocation origin;
                @XmlElement(required = true)
                protected IataLocation destination;
                protected AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime departureDateTime;
                protected AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime arrivalDateTime;
                protected ConnectionPoints connectionPoints;
                @XmlAttribute(name = "id", required = true)
                protected int id;

                /**
                 * Default no-arg constructor
                 * 
                 */
                public OriginDestination() {
                    super();
                }

                /**
                 * Fully-initialising value constructor
                 * 
                 */
                public OriginDestination(final IataLocation origin, final IataLocation destination, final AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime departureDateTime, final AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime arrivalDateTime, final ConnectionPoints connectionPoints, final int id) {
                    this.origin = origin;
                    this.destination = destination;
                    this.departureDateTime = departureDateTime;
                    this.arrivalDateTime = arrivalDateTime;
                    this.connectionPoints = connectionPoints;
                    this.id = id;
                }

                /**
                 * Obtiene el valor de la propiedad origin.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IataLocation }
                 *     
                 */
                public IataLocation getOrigin() {
                    return origin;
                }

                /**
                 * Define el valor de la propiedad origin.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IataLocation }
                 *     
                 */
                public void setOrigin(IataLocation value) {
                    this.origin = value;
                }

                /**
                 * Obtiene el valor de la propiedad destination.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IataLocation }
                 *     
                 */
                public IataLocation getDestination() {
                    return destination;
                }

                /**
                 * Define el valor de la propiedad destination.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IataLocation }
                 *     
                 */
                public void setDestination(IataLocation value) {
                    this.destination = value;
                }

                /**
                 * Obtiene el valor de la propiedad departureDateTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime }
                 *     
                 */
                public AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime getDepartureDateTime() {
                    return departureDateTime;
                }

                /**
                 * Define el valor de la propiedad departureDateTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime }
                 *     
                 */
                public void setDepartureDateTime(AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime value) {
                    this.departureDateTime = value;
                }

                /**
                 * Obtiene el valor de la propiedad arrivalDateTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime }
                 *     
                 */
                public AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime getArrivalDateTime() {
                    return arrivalDateTime;
                }

                /**
                 * Define el valor de la propiedad arrivalDateTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime }
                 *     
                 */
                public void setArrivalDateTime(AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime value) {
                    this.arrivalDateTime = value;
                }

                /**
                 * Obtiene el valor de la propiedad connectionPoints.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConnectionPoints }
                 *     
                 */
                public ConnectionPoints getConnectionPoints() {
                    return connectionPoints;
                }

                /**
                 * Define el valor de la propiedad connectionPoints.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConnectionPoints }
                 *     
                 */
                public void setConnectionPoints(ConnectionPoints value) {
                    this.connectionPoints = value;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 */
                public int getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 */
                public void setId(int value) {
                    this.id = value;
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
                 *       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
                 *       &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ArrivalDateTime {

                    @XmlAttribute(name = "date", required = true)
                    protected XMLGregorianCalendar date;
                    @XmlAttribute(name = "time")
                    protected XMLGregorianCalendar time;

                    /**
                     * Default no-arg constructor
                     * 
                     */
                    public ArrivalDateTime() {
                        super();
                    }

                    /**
                     * Fully-initialising value constructor
                     * 
                     */
                    public ArrivalDateTime(final XMLGregorianCalendar date, final XMLGregorianCalendar time) {
                        this.date = date;
                        this.time = time;
                    }

                    /**
                     * Obtiene el valor de la propiedad date.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDate() {
                        return date;
                    }

                    /**
                     * Define el valor de la propiedad date.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDate(XMLGregorianCalendar value) {
                        this.date = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad time.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getTime() {
                        return time;
                    }

                    /**
                     * Define el valor de la propiedad time.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setTime(XMLGregorianCalendar value) {
                        this.time = value;
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
                 *       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
                 *       &lt;attribute name="time" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DepartureDateTime {

                    @XmlAttribute(name = "date", required = true)
                    protected XMLGregorianCalendar date;
                    @XmlAttribute(name = "time")
                    protected XMLGregorianCalendar time;

                    /**
                     * Default no-arg constructor
                     * 
                     */
                    public DepartureDateTime() {
                        super();
                    }

                    /**
                     * Fully-initialising value constructor
                     * 
                     */
                    public DepartureDateTime(final XMLGregorianCalendar date, final XMLGregorianCalendar time) {
                        this.date = date;
                        this.time = time;
                    }

                    /**
                     * Obtiene el valor de la propiedad date.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDate() {
                        return date;
                    }

                    /**
                     * Define el valor de la propiedad date.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDate(XMLGregorianCalendar value) {
                        this.date = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad time.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getTime() {
                        return time;
                    }

                    /**
                     * Define el valor de la propiedad time.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setTime(XMLGregorianCalendar value) {
                        this.time = value;
                    }

                }

            }

        }

    }

}
