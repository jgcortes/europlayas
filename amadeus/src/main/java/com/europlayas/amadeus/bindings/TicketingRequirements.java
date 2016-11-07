
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
    "ticketingRequirement"
})
public class TicketingRequirements {

    @XmlElement(required = true)
    protected List<TicketingRequirements.TicketingRequirement> ticketingRequirement;

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
    public TicketingRequirements(final List<TicketingRequirements.TicketingRequirement> ticketingRequirement) {
        this.ticketingRequirement = ticketingRequirement;
    }

    /**
     * Gets the value of the ticketingRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingRequirements.TicketingRequirement }
     * 
     * 
     */
    public List<TicketingRequirements.TicketingRequirement> getTicketingRequirement() {
        if (ticketingRequirement == null) {
            ticketingRequirement = new ArrayList<TicketingRequirements.TicketingRequirement>();
        }
        return this.ticketingRequirement;
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
    public static class TicketingRequirement {

        protected ItineraryIdList itineraries;
        @XmlAttribute(name = "lastTicketingDate")
        protected XMLGregorianCalendar lastTicketingDate;

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
        public TicketingRequirement(final ItineraryIdList itineraries, final XMLGregorianCalendar lastTicketingDate) {
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
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastTicketingDate() {
            return lastTicketingDate;
        }

        /**
         * Define el valor de la propiedad lastTicketingDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastTicketingDate(XMLGregorianCalendar value) {
            this.lastTicketingDate = value;
        }

    }

}
