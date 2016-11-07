
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This message requests the system to book a specific journey for one or more identified and named passengers. The message contains optional pricing options, allowing the pricing to be rechecked as part of the booking process. Optional request information include (but are not limited to): seats, loyalty programs, Special Service Request, Advanced Passenger Information System, Secure Flight, DHS Traveler Redress Inquiry Program, remarks, record queuing, among others.
 * 
 * <p>Clase Java para BookRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="journey" type="{http://ws.amadeus.fr/air}Journey"/&gt;
 *         &lt;element name="pricing" type="{http://ws.amadeus.fr/air}BookRequestPricing"/&gt;
 *         &lt;element name="passengers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="passenger" type="{http://ws.amadeus.fr/air}SeatedNamedPassenger" maxOccurs="9"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalRecordData" type="{http://ws.amadeus.fr/air}AdditionalRecordData" minOccurs="0"/&gt;
 *         &lt;element name="amadeusRecordQueuing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="immediateQueuings" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="immediateQueuing" type="{http://ws.amadeus.fr/air}ImmediateAmadeusRecordQueuing" maxOccurs="10"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="delayedQueuings" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="delayedQueuing" type="{http://ws.amadeus.fr/air}DelayedAmadeusRecordQueuing" maxOccurs="20"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="errorRecordQueuing" type="{http://ws.amadeus.fr/air}ImmediateAmadeusRecordQueuing" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="queuingOfficeId" type="{http://ws.amadeus.fr/common}AmadeusOfficeId" /&gt;
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
@XmlType(name = "BookRequest", propOrder = {

})
public class BookRequest {

    @XmlElement(required = true)
    protected Journey journey;
    @XmlElement(required = true)
    protected BookRequestPricing pricing;
    @XmlElement(required = true)
    protected BookRequest.Passengers passengers;
    protected AdditionalRecordData additionalRecordData;
    protected BookRequest.AmadeusRecordQueuing amadeusRecordQueuing;

    /**
     * Default no-arg constructor
     * 
     */
    public BookRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookRequest(final Journey journey, final BookRequestPricing pricing, final BookRequest.Passengers passengers, final AdditionalRecordData additionalRecordData, final BookRequest.AmadeusRecordQueuing amadeusRecordQueuing) {
        this.journey = journey;
        this.pricing = pricing;
        this.passengers = passengers;
        this.additionalRecordData = additionalRecordData;
        this.amadeusRecordQueuing = amadeusRecordQueuing;
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
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link BookRequestPricing }
     *     
     */
    public BookRequestPricing getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link BookRequestPricing }
     *     
     */
    public void setPricing(BookRequestPricing value) {
        this.pricing = value;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link BookRequest.Passengers }
     *     
     */
    public BookRequest.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link BookRequest.Passengers }
     *     
     */
    public void setPassengers(BookRequest.Passengers value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalRecordData.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRecordData }
     *     
     */
    public AdditionalRecordData getAdditionalRecordData() {
        return additionalRecordData;
    }

    /**
     * Define el valor de la propiedad additionalRecordData.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRecordData }
     *     
     */
    public void setAdditionalRecordData(AdditionalRecordData value) {
        this.additionalRecordData = value;
    }

    /**
     * Obtiene el valor de la propiedad amadeusRecordQueuing.
     * 
     * @return
     *     possible object is
     *     {@link BookRequest.AmadeusRecordQueuing }
     *     
     */
    public BookRequest.AmadeusRecordQueuing getAmadeusRecordQueuing() {
        return amadeusRecordQueuing;
    }

    /**
     * Define el valor de la propiedad amadeusRecordQueuing.
     * 
     * @param value
     *     allowed object is
     *     {@link BookRequest.AmadeusRecordQueuing }
     *     
     */
    public void setAmadeusRecordQueuing(BookRequest.AmadeusRecordQueuing value) {
        this.amadeusRecordQueuing = value;
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
     *         &lt;element name="immediateQueuings" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="immediateQueuing" type="{http://ws.amadeus.fr/air}ImmediateAmadeusRecordQueuing" maxOccurs="10"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="delayedQueuings" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="delayedQueuing" type="{http://ws.amadeus.fr/air}DelayedAmadeusRecordQueuing" maxOccurs="20"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="errorRecordQueuing" type="{http://ws.amadeus.fr/air}ImmediateAmadeusRecordQueuing" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="queuingOfficeId" type="{http://ws.amadeus.fr/common}AmadeusOfficeId" /&gt;
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
    public static class AmadeusRecordQueuing {

        protected BookRequest.AmadeusRecordQueuing.ImmediateQueuings immediateQueuings;
        protected BookRequest.AmadeusRecordQueuing.DelayedQueuings delayedQueuings;
        protected ImmediateAmadeusRecordQueuing errorRecordQueuing;
        @XmlAttribute(name = "queuingOfficeId")
        protected String queuingOfficeId;

        /**
         * Default no-arg constructor
         * 
         */
        public AmadeusRecordQueuing() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AmadeusRecordQueuing(final BookRequest.AmadeusRecordQueuing.ImmediateQueuings immediateQueuings, final BookRequest.AmadeusRecordQueuing.DelayedQueuings delayedQueuings, final ImmediateAmadeusRecordQueuing errorRecordQueuing, final String queuingOfficeId) {
            this.immediateQueuings = immediateQueuings;
            this.delayedQueuings = delayedQueuings;
            this.errorRecordQueuing = errorRecordQueuing;
            this.queuingOfficeId = queuingOfficeId;
        }

        /**
         * Obtiene el valor de la propiedad immediateQueuings.
         * 
         * @return
         *     possible object is
         *     {@link BookRequest.AmadeusRecordQueuing.ImmediateQueuings }
         *     
         */
        public BookRequest.AmadeusRecordQueuing.ImmediateQueuings getImmediateQueuings() {
            return immediateQueuings;
        }

        /**
         * Define el valor de la propiedad immediateQueuings.
         * 
         * @param value
         *     allowed object is
         *     {@link BookRequest.AmadeusRecordQueuing.ImmediateQueuings }
         *     
         */
        public void setImmediateQueuings(BookRequest.AmadeusRecordQueuing.ImmediateQueuings value) {
            this.immediateQueuings = value;
        }

        /**
         * Obtiene el valor de la propiedad delayedQueuings.
         * 
         * @return
         *     possible object is
         *     {@link BookRequest.AmadeusRecordQueuing.DelayedQueuings }
         *     
         */
        public BookRequest.AmadeusRecordQueuing.DelayedQueuings getDelayedQueuings() {
            return delayedQueuings;
        }

        /**
         * Define el valor de la propiedad delayedQueuings.
         * 
         * @param value
         *     allowed object is
         *     {@link BookRequest.AmadeusRecordQueuing.DelayedQueuings }
         *     
         */
        public void setDelayedQueuings(BookRequest.AmadeusRecordQueuing.DelayedQueuings value) {
            this.delayedQueuings = value;
        }

        /**
         * Obtiene el valor de la propiedad errorRecordQueuing.
         * 
         * @return
         *     possible object is
         *     {@link ImmediateAmadeusRecordQueuing }
         *     
         */
        public ImmediateAmadeusRecordQueuing getErrorRecordQueuing() {
            return errorRecordQueuing;
        }

        /**
         * Define el valor de la propiedad errorRecordQueuing.
         * 
         * @param value
         *     allowed object is
         *     {@link ImmediateAmadeusRecordQueuing }
         *     
         */
        public void setErrorRecordQueuing(ImmediateAmadeusRecordQueuing value) {
            this.errorRecordQueuing = value;
        }

        /**
         * Obtiene el valor de la propiedad queuingOfficeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueuingOfficeId() {
            return queuingOfficeId;
        }

        /**
         * Define el valor de la propiedad queuingOfficeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueuingOfficeId(String value) {
            this.queuingOfficeId = value;
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
         *         &lt;element name="delayedQueuing" type="{http://ws.amadeus.fr/air}DelayedAmadeusRecordQueuing" maxOccurs="20"/&gt;
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
            "delayedQueuing"
        })
        public static class DelayedQueuings {

            @XmlElement(required = true)
            protected List<DelayedAmadeusRecordQueuing> delayedQueuing;

            /**
             * Default no-arg constructor
             * 
             */
            public DelayedQueuings() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public DelayedQueuings(final List<DelayedAmadeusRecordQueuing> delayedQueuing) {
                this.delayedQueuing = delayedQueuing;
            }

            /**
             * Gets the value of the delayedQueuing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delayedQueuing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelayedQueuing().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DelayedAmadeusRecordQueuing }
             * 
             * 
             */
            public List<DelayedAmadeusRecordQueuing> getDelayedQueuing() {
                if (delayedQueuing == null) {
                    delayedQueuing = new ArrayList<DelayedAmadeusRecordQueuing>();
                }
                return this.delayedQueuing;
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
         *         &lt;element name="immediateQueuing" type="{http://ws.amadeus.fr/air}ImmediateAmadeusRecordQueuing" maxOccurs="10"/&gt;
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
            "immediateQueuing"
        })
        public static class ImmediateQueuings {

            @XmlElement(required = true)
            protected List<ImmediateAmadeusRecordQueuing> immediateQueuing;

            /**
             * Default no-arg constructor
             * 
             */
            public ImmediateQueuings() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public ImmediateQueuings(final List<ImmediateAmadeusRecordQueuing> immediateQueuing) {
                this.immediateQueuing = immediateQueuing;
            }

            /**
             * Gets the value of the immediateQueuing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the immediateQueuing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImmediateQueuing().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImmediateAmadeusRecordQueuing }
             * 
             * 
             */
            public List<ImmediateAmadeusRecordQueuing> getImmediateQueuing() {
                if (immediateQueuing == null) {
                    immediateQueuing = new ArrayList<ImmediateAmadeusRecordQueuing>();
                }
                return this.immediateQueuing;
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
     *         &lt;element name="passenger" type="{http://ws.amadeus.fr/air}SeatedNamedPassenger" maxOccurs="9"/&gt;
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
        "passenger"
    })
    public static class Passengers {

        @XmlElement(required = true)
        protected List<SeatedNamedPassenger> passenger;

        /**
         * Default no-arg constructor
         * 
         */
        public Passengers() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Passengers(final List<SeatedNamedPassenger> passenger) {
            this.passenger = passenger;
        }

        /**
         * Gets the value of the passenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatedNamedPassenger }
         * 
         * 
         */
        public List<SeatedNamedPassenger> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<SeatedNamedPassenger>();
            }
            return this.passenger;
        }

    }

}
