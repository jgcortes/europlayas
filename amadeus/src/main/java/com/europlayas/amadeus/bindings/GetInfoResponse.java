
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This message contains requested itineraries with fare breakdown and ticketing information, along with detailed segment information, the need to provide information such as an identity document, redress information and residence contact information, to properly perform the booking. When requested and available, text rules and seat map details are also included.
 * 
 * <p>Clase Java para GetInfoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="warnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="warning" type="{http://ws.amadeus.fr/air}Warning" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="journey" type="{http://ws.amadeus.fr/air}DetailedJourney"/&gt;
 *         &lt;element name="bookingRequirements" type="{http://ws.amadeus.fr/air}BookingRequirements"/&gt;
 *         &lt;element name="luggageFees"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="luggageFee" type="{http://ws.amadeus.fr/air}LuggageFee" maxOccurs="1000" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentCardFees"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="paymentCardFee" type="{http://ws.amadeus.fr/air}PaymentCardFee" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ticketingRequirements" type="{http://ws.amadeus.fr/air}TicketingRequirements" minOccurs="0"/&gt;
 *         &lt;element name="fareRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fareRule" type="{http://ws.amadeus.fr/air}FareRule" maxOccurs="162" minOccurs="0"/&gt;
 *                   &lt;element name="warnings" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="warning" type="{http://ws.amadeus.fr/air}Warning" maxOccurs="162"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="luggageAllowances" type="{http://ws.amadeus.fr/air}LuggageAllowances" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoResponse", propOrder = {

})
@XmlRootElement(name = "getInfoResponse")
public class GetInfoResponse implements Serializable
{

    protected GetInfoResponse.Warnings warnings;
    @XmlElement(required = true)
    protected DetailedJourney journey;
    @XmlElement(required = true)
    protected BookingRequirements bookingRequirements;
    @XmlElement(required = true)
    protected GetInfoResponse.LuggageFees luggageFees;
    @XmlElement(required = true)
    protected GetInfoResponse.PaymentCardFees paymentCardFees;
    protected TicketingRequirements ticketingRequirements;
    protected GetInfoResponse.FareRules fareRules;
    protected LuggageAllowances luggageAllowances;

    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoResponse(final GetInfoResponse.Warnings warnings, final DetailedJourney journey, final BookingRequirements bookingRequirements, final GetInfoResponse.LuggageFees luggageFees, final GetInfoResponse.PaymentCardFees paymentCardFees, final TicketingRequirements ticketingRequirements, final GetInfoResponse.FareRules fareRules, final LuggageAllowances luggageAllowances) {
        this.warnings = warnings;
        this.journey = journey;
        this.bookingRequirements = bookingRequirements;
        this.luggageFees = luggageFees;
        this.paymentCardFees = paymentCardFees;
        this.ticketingRequirements = ticketingRequirements;
        this.fareRules = fareRules;
        this.luggageAllowances = luggageAllowances;
    }

    /**
     * Obtiene el valor de la propiedad warnings.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoResponse.Warnings }
     *     
     */
    public GetInfoResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Define el valor de la propiedad warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoResponse.Warnings }
     *     
     */
    public void setWarnings(GetInfoResponse.Warnings value) {
        this.warnings = value;
    }

    /**
     * Obtiene el valor de la propiedad journey.
     * 
     * @return
     *     possible object is
     *     {@link DetailedJourney }
     *     
     */
    public DetailedJourney getJourney() {
        return journey;
    }

    /**
     * Define el valor de la propiedad journey.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedJourney }
     *     
     */
    public void setJourney(DetailedJourney value) {
        this.journey = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingRequirements.
     * 
     * @return
     *     possible object is
     *     {@link BookingRequirements }
     *     
     */
    public BookingRequirements getBookingRequirements() {
        return bookingRequirements;
    }

    /**
     * Define el valor de la propiedad bookingRequirements.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRequirements }
     *     
     */
    public void setBookingRequirements(BookingRequirements value) {
        this.bookingRequirements = value;
    }

    /**
     * Obtiene el valor de la propiedad luggageFees.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoResponse.LuggageFees }
     *     
     */
    public GetInfoResponse.LuggageFees getLuggageFees() {
        return luggageFees;
    }

    /**
     * Define el valor de la propiedad luggageFees.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoResponse.LuggageFees }
     *     
     */
    public void setLuggageFees(GetInfoResponse.LuggageFees value) {
        this.luggageFees = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardFees.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoResponse.PaymentCardFees }
     *     
     */
    public GetInfoResponse.PaymentCardFees getPaymentCardFees() {
        return paymentCardFees;
    }

    /**
     * Define el valor de la propiedad paymentCardFees.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoResponse.PaymentCardFees }
     *     
     */
    public void setPaymentCardFees(GetInfoResponse.PaymentCardFees value) {
        this.paymentCardFees = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketingRequirements.
     * 
     * @return
     *     possible object is
     *     {@link TicketingRequirements }
     *     
     */
    public TicketingRequirements getTicketingRequirements() {
        return ticketingRequirements;
    }

    /**
     * Define el valor de la propiedad ticketingRequirements.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingRequirements }
     *     
     */
    public void setTicketingRequirements(TicketingRequirements value) {
        this.ticketingRequirements = value;
    }

    /**
     * Obtiene el valor de la propiedad fareRules.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoResponse.FareRules }
     *     
     */
    public GetInfoResponse.FareRules getFareRules() {
        return fareRules;
    }

    /**
     * Define el valor de la propiedad fareRules.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoResponse.FareRules }
     *     
     */
    public void setFareRules(GetInfoResponse.FareRules value) {
        this.fareRules = value;
    }

    /**
     * Obtiene el valor de la propiedad luggageAllowances.
     * 
     * @return
     *     possible object is
     *     {@link LuggageAllowances }
     *     
     */
    public LuggageAllowances getLuggageAllowances() {
        return luggageAllowances;
    }

    /**
     * Define el valor de la propiedad luggageAllowances.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageAllowances }
     *     
     */
    public void setLuggageAllowances(LuggageAllowances value) {
        this.luggageAllowances = value;
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
     *         &lt;element name="fareRule" type="{http://ws.amadeus.fr/air}FareRule" maxOccurs="162" minOccurs="0"/&gt;
     *         &lt;element name="warnings" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="warning" type="{http://ws.amadeus.fr/air}Warning" maxOccurs="162"/&gt;
     *                 &lt;/sequence&gt;
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
        "fareRules",
        "warnings"
    })
    public static class FareRules implements Serializable
    {

        @XmlElement(name = "fareRule")
        protected List<FareRule> fareRules;
        protected GetInfoResponse.FareRules.Warnings warnings;

        /**
         * Default no-arg constructor
         * 
         */
        public FareRules() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public FareRules(final List<FareRule> fareRules, final GetInfoResponse.FareRules.Warnings warnings) {
            this.fareRules = fareRules;
            this.warnings = warnings;
        }

        /**
         * Gets the value of the fareRules property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareRules property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareRules().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareRule }
         * 
         * 
         */
        public List<FareRule> getFareRules() {
            if (fareRules == null) {
                fareRules = new ArrayList<FareRule>();
            }
            return this.fareRules;
        }

        /**
         * Obtiene el valor de la propiedad warnings.
         * 
         * @return
         *     possible object is
         *     {@link GetInfoResponse.FareRules.Warnings }
         *     
         */
        public GetInfoResponse.FareRules.Warnings getWarnings() {
            return warnings;
        }

        /**
         * Define el valor de la propiedad warnings.
         * 
         * @param value
         *     allowed object is
         *     {@link GetInfoResponse.FareRules.Warnings }
         *     
         */
        public void setWarnings(GetInfoResponse.FareRules.Warnings value) {
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
         *         &lt;element name="warning" type="{http://ws.amadeus.fr/air}Warning" maxOccurs="162"/&gt;
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
            protected List<Warning> warnings;

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
            public Warnings(final List<Warning> warnings) {
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
             * {@link Warning }
             * 
             * 
             */
            public List<Warning> getWarnings() {
                if (warnings == null) {
                    warnings = new ArrayList<Warning>();
                }
                return this.warnings;
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
     *         &lt;element name="luggageFee" type="{http://ws.amadeus.fr/air}LuggageFee" maxOccurs="1000" minOccurs="0"/&gt;
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
        "luggageFees"
    })
    public static class LuggageFees implements Serializable
    {

        @XmlElement(name = "luggageFee")
        protected List<LuggageFee> luggageFees;

        /**
         * Default no-arg constructor
         * 
         */
        public LuggageFees() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public LuggageFees(final List<LuggageFee> luggageFees) {
            this.luggageFees = luggageFees;
        }

        /**
         * Gets the value of the luggageFees property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the luggageFees property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLuggageFees().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LuggageFee }
         * 
         * 
         */
        public List<LuggageFee> getLuggageFees() {
            if (luggageFees == null) {
                luggageFees = new ArrayList<LuggageFee>();
            }
            return this.luggageFees;
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
     *         &lt;element name="paymentCardFee" type="{http://ws.amadeus.fr/air}PaymentCardFee" maxOccurs="99" minOccurs="0"/&gt;
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
        "paymentCardFees"
    })
    public static class PaymentCardFees implements Serializable
    {

        @XmlElement(name = "paymentCardFee")
        protected List<PaymentCardFee> paymentCardFees;

        /**
         * Default no-arg constructor
         * 
         */
        public PaymentCardFees() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PaymentCardFees(final List<PaymentCardFee> paymentCardFees) {
            this.paymentCardFees = paymentCardFees;
        }

        /**
         * Gets the value of the paymentCardFees property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentCardFees property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentCardFees().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentCardFee }
         * 
         * 
         */
        public List<PaymentCardFee> getPaymentCardFees() {
            if (paymentCardFees == null) {
                paymentCardFees = new ArrayList<PaymentCardFee>();
            }
            return this.paymentCardFees;
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
     *         &lt;element name="warning" type="{http://ws.amadeus.fr/air}Warning" maxOccurs="unbounded"/&gt;
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
        protected List<Warning> warnings;

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
        public Warnings(final List<Warning> warnings) {
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
         * {@link Warning }
         * 
         * 
         */
        public List<Warning> getWarnings() {
            if (warnings == null) {
                warnings = new ArrayList<Warning>();
            }
            return this.warnings;
        }

    }

}
