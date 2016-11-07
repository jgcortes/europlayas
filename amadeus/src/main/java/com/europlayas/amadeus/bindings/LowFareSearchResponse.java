
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This message contains priced itineraries meeting requested requirements, with fare breakdown and ticketing information. Such priced itineraries are not intended to be exhaustive, since attractive and convenient ones are favored over others.
 * 
 * <p>Clase Java para LowFareSearchResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchResponse"&gt;
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
 *                                       &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}DetailedItinerary" maxOccurs="250" minOccurs="0"/&gt;
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
 *         &lt;element name="recommendations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="recommendation" type="{http://ws.amadeus.fr/air}Recommendation" maxOccurs="250" minOccurs="0"/&gt;
 *                   &lt;element name="oneWayRecommendation" type="{http://ws.amadeus.fr/air}OneWayRecommendation" maxOccurs="60" minOccurs="0"/&gt;
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
 *                   &lt;element name="warning" type="{http://ws.amadeus.fr/air}LowFareSearchWarning" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "LowFareSearchResponse", propOrder = {

})
public class LowFareSearchResponse {

    @XmlElement(required = true)
    protected LowFareSearchResponse.OriginDestinations originDestinations;
    @XmlElement(required = true)
    protected LowFareSearchResponse.Recommendations recommendations;
    protected LowFareSearchResponse.Warnings warnings;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchResponse(final LowFareSearchResponse.OriginDestinations originDestinations, final LowFareSearchResponse.Recommendations recommendations, final LowFareSearchResponse.Warnings warnings) {
        this.originDestinations = originDestinations;
        this.recommendations = recommendations;
        this.warnings = warnings;
    }

    /**
     * Obtiene el valor de la propiedad originDestinations.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchResponse.OriginDestinations }
     *     
     */
    public LowFareSearchResponse.OriginDestinations getOriginDestinations() {
        return originDestinations;
    }

    /**
     * Define el valor de la propiedad originDestinations.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchResponse.OriginDestinations }
     *     
     */
    public void setOriginDestinations(LowFareSearchResponse.OriginDestinations value) {
        this.originDestinations = value;
    }

    /**
     * Obtiene el valor de la propiedad recommendations.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchResponse.Recommendations }
     *     
     */
    public LowFareSearchResponse.Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Define el valor de la propiedad recommendations.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchResponse.Recommendations }
     *     
     */
    public void setRecommendations(LowFareSearchResponse.Recommendations value) {
        this.recommendations = value;
    }

    /**
     * Obtiene el valor de la propiedad warnings.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchResponse.Warnings }
     *     
     */
    public LowFareSearchResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Define el valor de la propiedad warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchResponse.Warnings }
     *     
     */
    public void setWarnings(LowFareSearchResponse.Warnings value) {
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
     *                             &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}DetailedItinerary" maxOccurs="250" minOccurs="0"/&gt;
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
        protected List<LowFareSearchResponse.OriginDestinations.OriginDestination> originDestination;

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
        public OriginDestinations(final List<LowFareSearchResponse.OriginDestinations.OriginDestination> originDestination) {
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
         * {@link LowFareSearchResponse.OriginDestinations.OriginDestination }
         * 
         * 
         */
        public List<LowFareSearchResponse.OriginDestinations.OriginDestination> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<LowFareSearchResponse.OriginDestinations.OriginDestination>();
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
         *                   &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}DetailedItinerary" maxOccurs="250" minOccurs="0"/&gt;
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
            protected LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries itineraries;
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
            public OriginDestination(final LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries itineraries, final int id) {
                this.itineraries = itineraries;
                this.id = id;
            }

            /**
             * Obtiene el valor de la propiedad itineraries.
             * 
             * @return
             *     possible object is
             *     {@link LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries }
             *     
             */
            public LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries getItineraries() {
                return itineraries;
            }

            /**
             * Define el valor de la propiedad itineraries.
             * 
             * @param value
             *     allowed object is
             *     {@link LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries }
             *     
             */
            public void setItineraries(LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries value) {
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
             *         &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}DetailedItinerary" maxOccurs="250" minOccurs="0"/&gt;
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

                protected List<DetailedItinerary> itinerary;

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
                public Itineraries(final List<DetailedItinerary> itinerary) {
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
                 * {@link DetailedItinerary }
                 * 
                 * 
                 */
                public List<DetailedItinerary> getItinerary() {
                    if (itinerary == null) {
                        itinerary = new ArrayList<DetailedItinerary>();
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
     *         &lt;element name="recommendation" type="{http://ws.amadeus.fr/air}Recommendation" maxOccurs="250" minOccurs="0"/&gt;
     *         &lt;element name="oneWayRecommendation" type="{http://ws.amadeus.fr/air}OneWayRecommendation" maxOccurs="60" minOccurs="0"/&gt;
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
        "recommendation",
        "oneWayRecommendation"
    })
    public static class Recommendations {

        protected List<Recommendation> recommendation;
        protected List<OneWayRecommendation> oneWayRecommendation;

        /**
         * Default no-arg constructor
         * 
         */
        public Recommendations() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Recommendations(final List<Recommendation> recommendation, final List<OneWayRecommendation> oneWayRecommendation) {
            this.recommendation = recommendation;
            this.oneWayRecommendation = oneWayRecommendation;
        }

        /**
         * Gets the value of the recommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Recommendation }
         * 
         * 
         */
        public List<Recommendation> getRecommendation() {
            if (recommendation == null) {
                recommendation = new ArrayList<Recommendation>();
            }
            return this.recommendation;
        }

        /**
         * Gets the value of the oneWayRecommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneWayRecommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneWayRecommendation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneWayRecommendation }
         * 
         * 
         */
        public List<OneWayRecommendation> getOneWayRecommendation() {
            if (oneWayRecommendation == null) {
                oneWayRecommendation = new ArrayList<OneWayRecommendation>();
            }
            return this.oneWayRecommendation;
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
     *         &lt;element name="warning" type="{http://ws.amadeus.fr/air}LowFareSearchWarning" maxOccurs="unbounded"/&gt;
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
        protected List<LowFareSearchWarning> warning;

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
        public Warnings(final List<LowFareSearchWarning> warning) {
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
         * {@link LowFareSearchWarning }
         * 
         * 
         */
        public List<LowFareSearchWarning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<LowFareSearchWarning>();
            }
            return this.warning;
        }

    }

}
