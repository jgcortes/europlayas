
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.europlayas.amadeus.util.DateAdapter;
import com.europlayas.amadeus.util.DateTimeAdapter;


/**
 * Air booking record information
 * 
 * <p>Clase Java para AirRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList"/&gt;
 *         &lt;element name="passengers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="passengerId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="18"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="externalRecords" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="externalRecord" type="{http://ws.amadeus.fr/air}AirExternalRecord" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="automaticProcesses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unticketedCancellation" type="{http://ws.amadeus.fr/air}UnticketedCancellation" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="provider" use="required" type="{http://ws.amadeus.fr/air}Provider" /&gt;
 *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="creationDateTime" use="required" type="{http://ws.amadeus.fr/common}UtcDateTime" /&gt;
 *       &lt;attribute name="lastTicketingDate" type="{http://ws.amadeus.fr/common}UtcDate" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirRecord", propOrder = {

})
public class AirRecord implements Serializable
{

    @XmlElement(required = true)
    protected ItineraryIdList itineraries;
    @XmlElement(required = true)
    protected AirRecord.Passengers passengers;
    protected AirRecord.ExternalRecords externalRecords;
    protected AirRecord.AutomaticProcesses automaticProcesses;
    @XmlAttribute(name = "provider", required = true)
    protected Provider provider;
    @XmlAttribute(name = "locator", required = true)
    protected String locator;
    @XmlAttribute(name = "creationDateTime", required = true)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    protected LocalDateTime creationDateTime;
    @XmlAttribute(name = "lastTicketingDate")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDate lastTicketingDate;

    /**
     * Default no-arg constructor
     * 
     */
    public AirRecord() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirRecord(final ItineraryIdList itineraries, final AirRecord.Passengers passengers, final AirRecord.ExternalRecords externalRecords, final AirRecord.AutomaticProcesses automaticProcesses, final Provider provider, final String locator, final LocalDateTime creationDateTime, final LocalDate lastTicketingDate) {
        this.itineraries = itineraries;
        this.passengers = passengers;
        this.externalRecords = externalRecords;
        this.automaticProcesses = automaticProcesses;
        this.provider = provider;
        this.locator = locator;
        this.creationDateTime = creationDateTime;
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
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link AirRecord.Passengers }
     *     
     */
    public AirRecord.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRecord.Passengers }
     *     
     */
    public void setPassengers(AirRecord.Passengers value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad externalRecords.
     * 
     * @return
     *     possible object is
     *     {@link AirRecord.ExternalRecords }
     *     
     */
    public AirRecord.ExternalRecords getExternalRecords() {
        return externalRecords;
    }

    /**
     * Define el valor de la propiedad externalRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRecord.ExternalRecords }
     *     
     */
    public void setExternalRecords(AirRecord.ExternalRecords value) {
        this.externalRecords = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticProcesses.
     * 
     * @return
     *     possible object is
     *     {@link AirRecord.AutomaticProcesses }
     *     
     */
    public AirRecord.AutomaticProcesses getAutomaticProcesses() {
        return automaticProcesses;
    }

    /**
     * Define el valor de la propiedad automaticProcesses.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRecord.AutomaticProcesses }
     *     
     */
    public void setAutomaticProcesses(AirRecord.AutomaticProcesses value) {
        this.automaticProcesses = value;
    }

    /**
     * Obtiene el valor de la propiedad provider.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Define el valor de la propiedad provider.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Obtiene el valor de la propiedad locator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Define el valor de la propiedad locator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Define el valor de la propiedad creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(LocalDateTime value) {
        this.creationDateTime = value;
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
     *         &lt;element name="unticketedCancellation" type="{http://ws.amadeus.fr/air}UnticketedCancellation" maxOccurs="99"/&gt;
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
        "unticketedCancellations"
    })
    public static class AutomaticProcesses implements Serializable
    {

        @XmlElement(name = "unticketedCancellation", required = true)
        protected List<UnticketedCancellation> unticketedCancellations;

        /**
         * Default no-arg constructor
         * 
         */
        public AutomaticProcesses() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AutomaticProcesses(final List<UnticketedCancellation> unticketedCancellations) {
            this.unticketedCancellations = unticketedCancellations;
        }

        /**
         * Gets the value of the unticketedCancellations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unticketedCancellations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnticketedCancellations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UnticketedCancellation }
         * 
         * 
         */
        public List<UnticketedCancellation> getUnticketedCancellations() {
            if (unticketedCancellations == null) {
                unticketedCancellations = new ArrayList<UnticketedCancellation>();
            }
            return this.unticketedCancellations;
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
     *         &lt;element name="externalRecord" type="{http://ws.amadeus.fr/air}AirExternalRecord" maxOccurs="99"/&gt;
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
        "externalRecords"
    })
    public static class ExternalRecords implements Serializable
    {

        @XmlElement(name = "externalRecord", required = true)
        protected List<AirExternalRecord> externalRecords;

        /**
         * Default no-arg constructor
         * 
         */
        public ExternalRecords() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ExternalRecords(final List<AirExternalRecord> externalRecords) {
            this.externalRecords = externalRecords;
        }

        /**
         * Gets the value of the externalRecords property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalRecords property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalRecords().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirExternalRecord }
         * 
         * 
         */
        public List<AirExternalRecord> getExternalRecords() {
            if (externalRecords == null) {
                externalRecords = new ArrayList<AirExternalRecord>();
            }
            return this.externalRecords;
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
     *         &lt;element name="passengerId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="18"/&gt;
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
        "passengerIds"
    })
    public static class Passengers implements Serializable
    {

        @XmlElement(name = "passengerId", type = Integer.class)
        protected List<Integer> passengerIds;

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
        public Passengers(final List<Integer> passengerIds) {
            this.passengerIds = passengerIds;
        }

        /**
         * Gets the value of the passengerIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getPassengerIds() {
            if (passengerIds == null) {
                passengerIds = new ArrayList<Integer>();
            }
            return this.passengerIds;
        }

    }

}
