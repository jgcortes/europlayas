
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out inconsistencies in the low fare search request to the requestor. These inconsistencies have caused a search failure. Composed of at least one inconsistency.
 * 
 * <p>Clase Java para InconsistentLowFareSearchRequestFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentLowFareSearchRequestFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}LowFareSearchFault"&gt;
 *       &lt;choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="originDestinationInconsistency" type="{http://ws.amadeus.fr/air}OriginDestinationInconsistency"/&gt;
 *           &lt;element name="ticketingRequirementsInconsistency"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="ticketingDateTooFar" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="passengersInconsistency" type="{http://ws.amadeus.fr/air}PassengersInconsistency" minOccurs="0"/&gt;
 *           &lt;element name="pricingInconsistency" type="{http://ws.amadeus.fr/air}PricingInconsistency" minOccurs="0"/&gt;
 *           &lt;element name="providerInconsistency" type="{http://ws.amadeus.fr/air}ProviderInconsistency" minOccurs="0"/&gt;
 *           &lt;element name="searchOptionInconsistency" type="{http://ws.amadeus.fr/air}SearchOptionInconsistency" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentLowFareSearchRequestFault", propOrder = {
    "originDestinationInconsistency",
    "ticketingRequirementsInconsistency",
    "passengersInconsistency",
    "pricingInconsistency",
    "providerInconsistency",
    "searchOptionInconsistency"
})
public class InconsistentLowFareSearchRequestFault
    extends LowFareSearchFault
{

    protected OriginDestinationInconsistency originDestinationInconsistency;
    protected InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency ticketingRequirementsInconsistency;
    protected PassengersInconsistency passengersInconsistency;
    protected PricingInconsistency pricingInconsistency;
    protected ProviderInconsistency providerInconsistency;
    protected SearchOptionInconsistency searchOptionInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentLowFareSearchRequestFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentLowFareSearchRequestFault(final ItineraryIdList itineraries, final OriginDestinationIdList originDestinations, final OriginDestinationInconsistency originDestinationInconsistency, final InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency ticketingRequirementsInconsistency, final PassengersInconsistency passengersInconsistency, final PricingInconsistency pricingInconsistency, final ProviderInconsistency providerInconsistency, final SearchOptionInconsistency searchOptionInconsistency) {
        super(itineraries, originDestinations);
        this.originDestinationInconsistency = originDestinationInconsistency;
        this.ticketingRequirementsInconsistency = ticketingRequirementsInconsistency;
        this.passengersInconsistency = passengersInconsistency;
        this.pricingInconsistency = pricingInconsistency;
        this.providerInconsistency = providerInconsistency;
        this.searchOptionInconsistency = searchOptionInconsistency;
    }

    /**
     * Obtiene el valor de la propiedad originDestinationInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInconsistency }
     *     
     */
    public OriginDestinationInconsistency getOriginDestinationInconsistency() {
        return originDestinationInconsistency;
    }

    /**
     * Define el valor de la propiedad originDestinationInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInconsistency }
     *     
     */
    public void setOriginDestinationInconsistency(OriginDestinationInconsistency value) {
        this.originDestinationInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketingRequirementsInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency }
     *     
     */
    public InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency getTicketingRequirementsInconsistency() {
        return ticketingRequirementsInconsistency;
    }

    /**
     * Define el valor de la propiedad ticketingRequirementsInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency }
     *     
     */
    public void setTicketingRequirementsInconsistency(InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency value) {
        this.ticketingRequirementsInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad passengersInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link PassengersInconsistency }
     *     
     */
    public PassengersInconsistency getPassengersInconsistency() {
        return passengersInconsistency;
    }

    /**
     * Define el valor de la propiedad passengersInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengersInconsistency }
     *     
     */
    public void setPassengersInconsistency(PassengersInconsistency value) {
        this.passengersInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad pricingInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link PricingInconsistency }
     *     
     */
    public PricingInconsistency getPricingInconsistency() {
        return pricingInconsistency;
    }

    /**
     * Define el valor de la propiedad pricingInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInconsistency }
     *     
     */
    public void setPricingInconsistency(PricingInconsistency value) {
        this.pricingInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad providerInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link ProviderInconsistency }
     *     
     */
    public ProviderInconsistency getProviderInconsistency() {
        return providerInconsistency;
    }

    /**
     * Define el valor de la propiedad providerInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderInconsistency }
     *     
     */
    public void setProviderInconsistency(ProviderInconsistency value) {
        this.providerInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad searchOptionInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptionInconsistency }
     *     
     */
    public SearchOptionInconsistency getSearchOptionInconsistency() {
        return searchOptionInconsistency;
    }

    /**
     * Define el valor de la propiedad searchOptionInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptionInconsistency }
     *     
     */
    public void setSearchOptionInconsistency(SearchOptionInconsistency value) {
        this.searchOptionInconsistency = value;
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
     *       &lt;attribute name="ticketingDateTooFar" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketingRequirementsInconsistency {

        @XmlAttribute(name = "ticketingDateTooFar", required = true)
        protected boolean ticketingDateTooFar;

        /**
         * Default no-arg constructor
         * 
         */
        public TicketingRequirementsInconsistency() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TicketingRequirementsInconsistency(final boolean ticketingDateTooFar) {
            this.ticketingDateTooFar = ticketingDateTooFar;
        }

        /**
         * Obtiene el valor de la propiedad ticketingDateTooFar.
         * 
         */
        public boolean isTicketingDateTooFar() {
            return ticketingDateTooFar;
        }

        /**
         * Define el valor de la propiedad ticketingDateTooFar.
         * 
         */
        public void setTicketingDateTooFar(boolean value) {
            this.ticketingDateTooFar = value;
        }

    }

}
