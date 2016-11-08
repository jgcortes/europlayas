
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
@XmlRootElement(name = "availabilitySearchResponse")
public class AvailabilitySearchResponse implements Serializable
{

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
        "originDestinations"
    })
    public static class OriginDestinations implements Serializable
    {

        @XmlElement(name = "originDestination", required = true)
        protected List<AvailabilitySearchResponse.OriginDestinations.OriginDestination> originDestinations;

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
        public OriginDestinations(final List<AvailabilitySearchResponse.OriginDestinations.OriginDestination> originDestinations) {
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
         * {@link AvailabilitySearchResponse.OriginDestinations.OriginDestination }
         * 
         * 
         */
        public List<AvailabilitySearchResponse.OriginDestinations.OriginDestination> getOriginDestinations() {
            if (originDestinations == null) {
                originDestinations = new ArrayList<AvailabilitySearchResponse.OriginDestinations.OriginDestination>();
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
        public static class OriginDestination implements Serializable
        {

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
                "itineraries"
            })
            public static class Itineraries implements Serializable
            {

                @XmlElement(name = "itinerary")
                protected List<AvailabilitySearchResponseDetailedItinerary> itineraries;

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
                public Itineraries(final List<AvailabilitySearchResponseDetailedItinerary> itineraries) {
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
                 * {@link AvailabilitySearchResponseDetailedItinerary }
                 * 
                 * 
                 */
                public List<AvailabilitySearchResponseDetailedItinerary> getItineraries() {
                    if (itineraries == null) {
                        itineraries = new ArrayList<AvailabilitySearchResponseDetailedItinerary>();
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
        "warnings"
    })
    public static class Warnings implements Serializable
    {

        @XmlElement(name = "warning", required = true)
        protected List<AvailabilitySearchWarning> warnings;

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
        public Warnings(final List<AvailabilitySearchWarning> warnings) {
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
         * {@link AvailabilitySearchWarning }
         * 
         * 
         */
        public List<AvailabilitySearchWarning> getWarnings() {
            if (warnings == null) {
                warnings = new ArrayList<AvailabilitySearchWarning>();
            }
            return this.warnings;
        }

    }

}
