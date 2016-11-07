
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Detailed flight segment (see type Segment).
 * 
 * <p>Clase Java para DetailedSegment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetailedSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Segment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="departureAirport" type="{http://ws.amadeus.fr/air}Airport"/&gt;
 *         &lt;element name="arrivalAirport" type="{http://ws.amadeus.fr/air}Airport"/&gt;
 *         &lt;element name="stops" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="stop" type="{http://ws.amadeus.fr/air}Stop" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="arrivalDateTime" use="required" type="{http://ws.amadeus.fr/common}LocalDateTime" /&gt;
 *       &lt;attribute name="equipment" type="{http://ws.amadeus.fr/air}IataAircraftTypeDesignator" /&gt;
 *       &lt;attribute name="numberOfStops" type="{http://ws.amadeus.fr/common}Unsigned0To99Byte" /&gt;
 *       &lt;attribute name="checkInTime" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="blacklistedInEU" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="eligibleForElectronicTicketing" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedSegment", propOrder = {
    "departureAirport",
    "arrivalAirport",
    "stops"
})
@XmlSeeAlso({
    AvailabilitySearchResponseDetailedSegment.class
})
public class DetailedSegment
    extends Segment
{

    @XmlElement(required = true)
    protected Airport departureAirport;
    @XmlElement(required = true)
    protected Airport arrivalAirport;
    protected DetailedSegment.Stops stops;
    @XmlAttribute(name = "arrivalDateTime", required = true)
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlAttribute(name = "equipment")
    protected String equipment;
    @XmlAttribute(name = "numberOfStops")
    protected Short numberOfStops;
    @XmlAttribute(name = "checkInTime")
    protected XMLGregorianCalendar checkInTime;
    @XmlAttribute(name = "duration")
    protected Duration duration;
    @XmlAttribute(name = "blacklistedInEU")
    protected Boolean blacklistedInEU;
    @XmlAttribute(name = "eligibleForElectronicTicketing")
    protected Boolean eligibleForElectronicTicketing;

    /**
     * Default no-arg constructor
     * 
     */
    public DetailedSegment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DetailedSegment(final IataLocation originLocation, final IataLocation destinationLocation, final int id, final String marketingAirlineCode, final String operatingAirlineCode, final String flightNumber, final XMLGregorianCalendar departureDateTime, final Airport departureAirport, final Airport arrivalAirport, final DetailedSegment.Stops stops, final XMLGregorianCalendar arrivalDateTime, final String equipment, final Short numberOfStops, final XMLGregorianCalendar checkInTime, final Duration duration, final Boolean blacklistedInEU, final Boolean eligibleForElectronicTicketing) {
        super(originLocation, destinationLocation, id, marketingAirlineCode, operatingAirlineCode, flightNumber, departureDateTime);
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.stops = stops;
        this.arrivalDateTime = arrivalDateTime;
        this.equipment = equipment;
        this.numberOfStops = numberOfStops;
        this.checkInTime = checkInTime;
        this.duration = duration;
        this.blacklistedInEU = blacklistedInEU;
        this.eligibleForElectronicTicketing = eligibleForElectronicTicketing;
    }

    /**
     * Obtiene el valor de la propiedad departureAirport.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Define el valor de la propiedad departureAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setDepartureAirport(Airport value) {
        this.departureAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalAirport.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Define el valor de la propiedad arrivalAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setArrivalAirport(Airport value) {
        this.arrivalAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad stops.
     * 
     * @return
     *     possible object is
     *     {@link DetailedSegment.Stops }
     *     
     */
    public DetailedSegment.Stops getStops() {
        return stops;
    }

    /**
     * Define el valor de la propiedad stops.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedSegment.Stops }
     *     
     */
    public void setStops(DetailedSegment.Stops value) {
        this.stops = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Define el valor de la propiedad arrivalDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad equipment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Define el valor de la propiedad equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfStops.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Define el valor de la propiedad numberOfStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfStops(Short value) {
        this.numberOfStops = value;
    }

    /**
     * Obtiene el valor de la propiedad checkInTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInTime() {
        return checkInTime;
    }

    /**
     * Define el valor de la propiedad checkInTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInTime(XMLGregorianCalendar value) {
        this.checkInTime = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Obtiene el valor de la propiedad blacklistedInEU.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlacklistedInEU() {
        return blacklistedInEU;
    }

    /**
     * Define el valor de la propiedad blacklistedInEU.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlacklistedInEU(Boolean value) {
        this.blacklistedInEU = value;
    }

    /**
     * Obtiene el valor de la propiedad eligibleForElectronicTicketing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForElectronicTicketing() {
        return eligibleForElectronicTicketing;
    }

    /**
     * Define el valor de la propiedad eligibleForElectronicTicketing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForElectronicTicketing(Boolean value) {
        this.eligibleForElectronicTicketing = value;
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
     *         &lt;element name="stop" type="{http://ws.amadeus.fr/air}Stop" maxOccurs="99" minOccurs="0"/&gt;
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
        "stop"
    })
    public static class Stops {

        protected List<Stop> stop;

        /**
         * Default no-arg constructor
         * 
         */
        public Stops() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Stops(final List<Stop> stop) {
            this.stop = stop;
        }

        /**
         * Gets the value of the stop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Stop }
         * 
         * 
         */
        public List<Stop> getStop() {
            if (stop == null) {
                stop = new ArrayList<Stop>();
            }
            return this.stop;
        }

    }

}
