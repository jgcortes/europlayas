
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This message contains requested itineraries with fare breakdown and ticketing information, along with detailed segment information, the need to provide information such as an identity document, redress information and residence contact information, to properly perform the booking. When requested and available, text rules and seat map details are also included.
 * 
 * <p>Clase Java para PriceWithInfoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journey" type="{http://ws.amadeus.fr/air}DetailedJourney"/&gt;
 *         &lt;element name="pricing" type="{http://ws.amadeus.fr/air}PriceWithInfoResponsePricing"/&gt;
 *         &lt;element name="bookingRequirements" type="{http://ws.amadeus.fr/air}BookingRequirements"/&gt;
 *         &lt;element name="ticketingRequirements" type="{http://ws.amadeus.fr/air}TicketingRequirements" minOccurs="0"/&gt;
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
 *         &lt;element name="luggageAllowances" type="{http://ws.amadeus.fr/air}LuggageAllowances" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoResponse", propOrder = {
    "journey",
    "pricing",
    "bookingRequirements",
    "ticketingRequirements",
    "warnings",
    "luggageAllowances"
})
public class PriceWithInfoResponse {

    @XmlElement(required = true)
    protected DetailedJourney journey;
    @XmlElement(required = true)
    protected PriceWithInfoResponsePricing pricing;
    @XmlElement(required = true)
    protected BookingRequirements bookingRequirements;
    protected TicketingRequirements ticketingRequirements;
    protected PriceWithInfoResponse.Warnings warnings;
    protected LuggageAllowances luggageAllowances;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoResponse(final DetailedJourney journey, final PriceWithInfoResponsePricing pricing, final BookingRequirements bookingRequirements, final TicketingRequirements ticketingRequirements, final PriceWithInfoResponse.Warnings warnings, final LuggageAllowances luggageAllowances) {
        this.journey = journey;
        this.pricing = pricing;
        this.bookingRequirements = bookingRequirements;
        this.ticketingRequirements = ticketingRequirements;
        this.warnings = warnings;
        this.luggageAllowances = luggageAllowances;
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
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoResponsePricing }
     *     
     */
    public PriceWithInfoResponsePricing getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponsePricing }
     *     
     */
    public void setPricing(PriceWithInfoResponsePricing value) {
        this.pricing = value;
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
     * Obtiene el valor de la propiedad warnings.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoResponse.Warnings }
     *     
     */
    public PriceWithInfoResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Define el valor de la propiedad warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoResponse.Warnings }
     *     
     */
    public void setWarnings(PriceWithInfoResponse.Warnings value) {
        this.warnings = value;
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(required = true)
        protected List<Warning> warning;

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
        public Warnings(final List<Warning> warning) {
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
         * {@link Warning }
         * 
         * 
         */
        public List<Warning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<Warning>();
            }
            return this.warning;
        }

    }

}
