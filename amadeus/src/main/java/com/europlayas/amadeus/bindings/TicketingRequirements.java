
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.europlayas.amadeus.util.DateAdapter;


/**
 * <p>Clase Java para TicketingRequirements complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TicketingRequirements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticketingRequirement" maxOccurs="6"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="lastTicketingDate" type="{http://ws.amadeus.fr/common}UtcDate" /&gt;
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
@XmlType(name = "TicketingRequirements", propOrder = {
    "ticketingRequirements"
})
public class TicketingRequirements implements Serializable
{

    @XmlElement(name = "ticketingRequirement", required = true)
    protected List<TicketingRequirements.TicketingRequirement> ticketingRequirements;

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
    public TicketingRequirements(final List<TicketingRequirements.TicketingRequirement> ticketingRequirements) {
        this.ticketingRequirements = ticketingRequirements;
    }

    /**
     * Gets the value of the ticketingRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingRequirements.TicketingRequirement }
     * 
     * 
     */
    public List<TicketingRequirements.TicketingRequirement> getTicketingRequirements() {
        if (ticketingRequirements == null) {
            ticketingRequirements = new ArrayList<TicketingRequirements.TicketingRequirement>();
        }
        return this.ticketingRequirements;
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
     *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="lastTicketingDate" type="{http://ws.amadeus.fr/common}UtcDate" /&gt;
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
    public static class TicketingRequirement implements Serializable
    {

        protected ItineraryIdList itineraries;
        @XmlAttribute(name = "lastTicketingDate")
        @XmlJavaTypeAdapter(DateAdapter.class)
        protected LocalDate lastTicketingDate;

        /**
         * Default no-arg constructor
         * 
         */
        public TicketingRequirement() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TicketingRequirement(final ItineraryIdList itineraries, final LocalDate lastTicketingDate) {
            this.itineraries = itineraries;
            this.lastTicketingDate = lastTicketingDate;
        }

        /**
         * Obtiene el valor de la propiedad itineraries.
         * 
         * @return
         *     possible object is
         *     {@link ItineraryIdList }
         *     
         */
        public ItineraryIdList getItineraries() {
            return itineraries;
        }

        /**
         * Define el valor de la propiedad itineraries.
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryIdList }
         *     
         */
        public void setItineraries(ItineraryIdList value) {
            this.itineraries = value;
        }

        /**
         * Obtiene el valor de la propiedad lastTicketingDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDate getLastTicketingDate() {
            return lastTicketingDate;
        }

        /**
         * Define el valor de la propiedad lastTicketingDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTicketingDate(LocalDate value) {
            this.lastTicketingDate = value;
        }

    }

}
