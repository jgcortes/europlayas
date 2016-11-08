
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Detailed flight segment (see type Segment) used by the AvailabilitySearchResponse.
 * 
 * <p>Clase Java para AvailabilitySearchResponseDetailedSegment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchResponseDetailedSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}DetailedSegment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingClasses"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bookingClass" type="{http://ws.amadeus.fr/air}BookingClass" maxOccurs="50"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySearchResponseDetailedSegment", propOrder = {
    "bookingClasses"
})
public class AvailabilitySearchResponseDetailedSegment
    extends DetailedSegment
    implements Serializable
{

    @XmlElement(required = true)
    protected AvailabilitySearchResponseDetailedSegment.BookingClasses bookingClasses;

    /**
     * Default no-arg constructor
     * 
     */
    public AvailabilitySearchResponseDetailedSegment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AvailabilitySearchResponseDetailedSegment(final IataLocation originLocation, final IataLocation destinationLocation, final int id, final String marketingAirlineCode, final String operatingAirlineCode, final String flightNumber, final LocalDateTime departureDateTime, final Airport departureAirport, final Airport arrivalAirport, final DetailedSegment.Stops stops, final LocalDateTime arrivalDateTime, final String equipment, final Short numberOfStops, final XMLGregorianCalendar checkInTime, final Duration duration, final Boolean blacklistedInEU, final Boolean eligibleForElectronicTicketing, final AvailabilitySearchResponseDetailedSegment.BookingClasses bookingClasses) {
        super(originLocation, destinationLocation, id, marketingAirlineCode, operatingAirlineCode, flightNumber, departureDateTime, departureAirport, arrivalAirport, stops, arrivalDateTime, equipment, numberOfStops, checkInTime, duration, blacklistedInEU, eligibleForElectronicTicketing);
        this.bookingClasses = bookingClasses;
    }

    /**
     * Obtiene el valor de la propiedad bookingClasses.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilitySearchResponseDetailedSegment.BookingClasses }
     *     
     */
    public AvailabilitySearchResponseDetailedSegment.BookingClasses getBookingClasses() {
        return bookingClasses;
    }

    /**
     * Define el valor de la propiedad bookingClasses.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilitySearchResponseDetailedSegment.BookingClasses }
     *     
     */
    public void setBookingClasses(AvailabilitySearchResponseDetailedSegment.BookingClasses value) {
        this.bookingClasses = value;
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
     *         &lt;element name="bookingClass" type="{http://ws.amadeus.fr/air}BookingClass" maxOccurs="50"/&gt;
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
        "bookingClasses"
    })
    public static class BookingClasses implements Serializable
    {

        @XmlElement(name = "bookingClass", required = true)
        protected List<BookingClass> bookingClasses;

        /**
         * Default no-arg constructor
         * 
         */
        public BookingClasses() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public BookingClasses(final List<BookingClass> bookingClasses) {
            this.bookingClasses = bookingClasses;
        }

        /**
         * Gets the value of the bookingClasses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingClasses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingClasses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingClass }
         * 
         * 
         */
        public List<BookingClass> getBookingClasses() {
            if (bookingClasses == null) {
                bookingClasses = new ArrayList<BookingClass>();
            }
            return this.bookingClasses;
        }

    }

}
