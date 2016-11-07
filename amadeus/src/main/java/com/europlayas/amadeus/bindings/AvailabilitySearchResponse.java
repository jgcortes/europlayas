
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This message contains available itineraries meeting requested requirements, with number of bookable seats.
 * 
 * <p>Clase Java para AvailabilitySearchResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchResponse"&gt;
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
 *                           &lt;all&gt;
 *                             &lt;element name="itineraries"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}AvailabilitySearchResponseDetailedItinerary" maxOccurs="100" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
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
 *         &lt;element name="warnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="warning" type="{http://ws.amadeus.fr/air}AvailabilitySearchWarning" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "AvailabilitySearchResponse", propOrder = {

})
public class AvailabilitySearchResponse {

    @XmlElement(required = true)
    protected AvailabilitySearchResponse.OriginDestinations originDestinations;
    protected AvailabilitySearchResponse.Warnings warnings;

    /**
     * Default no-arg constructor
     * 
     */
    public AvailabilitySearchResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AvailabilitySearchResponse(final AvailabilitySearchResponse.OriginDestinations originDestinations, final AvailabilitySearchResponse.Warnings warnings) {
        this.originDestinations = originDestinations;
        this.warnings = warnings;
    }

    /**
     * Obtiene el valor de la propiedad originDestinations.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilitySearchResponse.OriginDestinations }
     *     
     */
    public AvailabilitySearchResponse.OriginDestinations getOriginDestinations() {
        return originDestinations;
    }

    /**
     * Define el valor de la propiedad originDestinations.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilitySearchResponse.OriginDestinations }
     *     
     */
    public void setOriginDestinations(AvailabilitySearchResponse.OriginDestinations value) {
        this.originDestinations = value;
    }

    /**
     * Obtiene el valor de la propiedad warnings.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilitySearchResponse.Warnings }
     *     
     */
    public AvailabilitySearchResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Define el valor de la propiedad warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilitySearchResponse.Warnings }
     *     
     */
    public void setWarnings(AvailabilitySearchResponse.Warnings value) {
        this.warnings = value;
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
     *                 &lt;all&gt;
     *                   &lt;element name="itineraries"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}AvailabilitySearchResponseDetailedItinerary" maxOccurs="100" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
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
        protected List<AvailabilitySearchResponse.OriginDestinations.OriginDestination> originDestination;

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
        public OriginDestinations(final List<AvailabilitySearchResponse.OriginDestinations.OriginDestination> originDestination) {
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
         * {@link AvailabilitySearchResponse.OriginDestinations.OriginDestination }
         * 
         * 
         */
        public List<AvailabilitySearchResponse.OriginDestinations.OriginDestination> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<AvailabilitySearchResponse.OriginDestinations.OriginDestination>();
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
         *       &lt;all&gt;
         *         &lt;element name="itineraries"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}AvailabilitySearchResponseDetailedItinerary" maxOccurs="100" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
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

        })
        public static class OriginDestination {

            @XmlElement(required = true)
            protected AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries itineraries;
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
            public OriginDestination(final AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries itineraries, final int id) {
                this.itineraries = itineraries;
                this.id = id;
            }

            /**
             * Obtiene el valor de la propiedad itineraries.
             * 
             * @return
             *     possible object is
             *     {@link AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries }
             *     
             */
            public AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries getItineraries() {
                return itineraries;
            }

            /**
             * Define el valor de la propiedad itineraries.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries }
             *     
             */
            public void setItineraries(AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries value) {
                this.itineraries = value;
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
             *       &lt;sequence&gt;
             *         &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}AvailabilitySearchResponseDetailedItinerary" maxOccurs="100" minOccurs="0"/&gt;
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
                "itinerary"
            })
            public static class Itineraries {

                protected List<AvailabilitySearchResponseDetailedItinerary> itinerary;

                /**
                 * Default no-arg constructor
                 * 
                 */
                public Itineraries() {
                    super();
                }

                /**
                 * Fully-initialising value constructor
                 * 
                 */
                public Itineraries(final List<AvailabilitySearchResponseDetailedItinerary> itinerary) {
                    this.itinerary = itinerary;
                }

                /**
                 * Gets the value of the itinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AvailabilitySearchResponseDetailedItinerary }
                 * 
                 * 
                 */
                public List<AvailabilitySearchResponseDetailedItinerary> getItinerary() {
                    if (itinerary == null) {
                        itinerary = new ArrayList<AvailabilitySearchResponseDetailedItinerary>();
                    }
                    return this.itinerary;
                }

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
     *         &lt;element name="warning" type="{http://ws.amadeus.fr/air}AvailabilitySearchWarning" maxOccurs="unbounded"/&gt;
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(required = true)
        protected List<AvailabilitySearchWarning> warning;

        /**
         * Default no-arg constructor
         * 
         */
        public Warnings() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Warnings(final List<AvailabilitySearchWarning> warning) {
            this.warning = warning;
        }

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailabilitySearchWarning }
         * 
         * 
         */
        public List<AvailabilitySearchWarning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<AvailabilitySearchWarning>();
            }
            return this.warning;
        }

    }

}
