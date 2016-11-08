
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement(name = "lowFareSearchResponse")
public class LowFareSearchResponse implements Serializable
{

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
        "originDestinations"
    })
    public static class OriginDestinations implements Serializable
    {

        @XmlElement(name = "originDestination", required = true)
        protected List<LowFareSearchResponse.OriginDestinations.OriginDestination> originDestinations;

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
        public OriginDestinations(final List<LowFareSearchResponse.OriginDestinations.OriginDestination> originDestinations) {
            this.originDestinations = originDestinations;
        }

        /**
         * Gets the value of the originDestinations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LowFareSearchResponse.OriginDestinations.OriginDestination }
         * 
         * 
         */
        public List<LowFareSearchResponse.OriginDestinations.OriginDestination> getOriginDestinations() {
            if (originDestinations == null) {
                originDestinations = new ArrayList<LowFareSearchResponse.OriginDestinations.OriginDestination>();
            }
            return this.originDestinations;
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
        public static class OriginDestination implements Serializable
        {

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
                "itineraries"
            })
            public static class Itineraries implements Serializable
            {

                @XmlElement(name = "itinerary")
                protected List<DetailedItinerary> itineraries;

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
                public Itineraries(final List<DetailedItinerary> itineraries) {
                    this.itineraries = itineraries;
                }

                /**
                 * Gets the value of the itineraries property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itineraries property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItineraries().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DetailedItinerary }
                 * 
                 * 
                 */
                public List<DetailedItinerary> getItineraries() {
                    if (itineraries == null) {
                        itineraries = new ArrayList<DetailedItinerary>();
                    }
                    return this.itineraries;
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
        "recommendations",
        "oneWayRecommendations"
    })
    public static class Recommendations implements Serializable
    {

        @XmlElement(name = "recommendation")
        protected List<Recommendation> recommendations;
        @XmlElement(name = "oneWayRecommendation")
        protected List<OneWayRecommendation> oneWayRecommendations;

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
        public Recommendations(final List<Recommendation> recommendations, final List<OneWayRecommendation> oneWayRecommendations) {
            this.recommendations = recommendations;
            this.oneWayRecommendations = oneWayRecommendations;
        }

        /**
         * Gets the value of the recommendations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Recommendation }
         * 
         * 
         */
        public List<Recommendation> getRecommendations() {
            if (recommendations == null) {
                recommendations = new ArrayList<Recommendation>();
            }
            return this.recommendations;
        }

        /**
         * Gets the value of the oneWayRecommendations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneWayRecommendations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneWayRecommendations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneWayRecommendation }
         * 
         * 
         */
        public List<OneWayRecommendation> getOneWayRecommendations() {
            if (oneWayRecommendations == null) {
                oneWayRecommendations = new ArrayList<OneWayRecommendation>();
            }
            return this.oneWayRecommendations;
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
        "warnings"
    })
    public static class Warnings implements Serializable
    {

        @XmlElement(name = "warning", required = true)
        protected List<LowFareSearchWarning> warnings;

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
        public Warnings(final List<LowFareSearchWarning> warnings) {
            this.warnings = warnings;
        }

        /**
         * Gets the value of the warnings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warnings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarnings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LowFareSearchWarning }
         * 
         * 
         */
        public List<LowFareSearchWarning> getWarnings() {
            if (warnings == null) {
                warnings = new ArrayList<LowFareSearchWarning>();
            }
            return this.warnings;
        }

    }

}
