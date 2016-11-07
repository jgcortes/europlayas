
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out a segment sell failure to the requestor. Such failure may occur for the following reasons : the provider does not find this segment (e.g. the location code, the airline code or the flight number may be unknown, there may not be such flight departing on that date), there is not enough seats available to meet requested requirements (e.g. in accordance to the booking class codes), the provider or airline does not allow the sell for an unknown reason. This segment sell failure has caused a booking failure.
 * 
 * <p>Clase Java para SegmentSellFailureFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SegmentSellFailureFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segment" type="{http://ws.amadeus.fr/air}Segment"/&gt;
 *         &lt;element name="passengers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="passenger" type="{http://ws.amadeus.fr/air}NamedPassenger" maxOccurs="18"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passengerPricings" type="{http://ws.amadeus.fr/air}BookRequestPassengerPricingList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentSellFailureFault", propOrder = {
    "segment",
    "passengers",
    "passengerPricings"
})
public class SegmentSellFailureFault
    extends BookFault
{

    @XmlElement(required = true)
    protected Segment segment;
    @XmlElement(required = true)
    protected SegmentSellFailureFault.Passengers passengers;
    @XmlElement(required = true)
    protected BookRequestPassengerPricingList passengerPricings;

    /**
     * Default no-arg constructor
     * 
     */
    public SegmentSellFailureFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SegmentSellFailureFault(final ItineraryIdList itineraries, final Segment segment, final SegmentSellFailureFault.Passengers passengers, final BookRequestPassengerPricingList passengerPricings) {
        super(itineraries);
        this.segment = segment;
        this.passengers = passengers;
        this.passengerPricings = passengerPricings;
    }

    /**
     * Obtiene el valor de la propiedad segment.
     * 
     * @return
     *     possible object is
     *     {@link Segment }
     *     
     */
    public Segment getSegment() {
        return segment;
    }

    /**
     * Define el valor de la propiedad segment.
     * 
     * @param value
     *     allowed object is
     *     {@link Segment }
     *     
     */
    public void setSegment(Segment value) {
        this.segment = value;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSellFailureFault.Passengers }
     *     
     */
    public SegmentSellFailureFault.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSellFailureFault.Passengers }
     *     
     */
    public void setPassengers(SegmentSellFailureFault.Passengers value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerPricings.
     * 
     * @return
     *     possible object is
     *     {@link BookRequestPassengerPricingList }
     *     
     */
    public BookRequestPassengerPricingList getPassengerPricings() {
        return passengerPricings;
    }

    /**
     * Define el valor de la propiedad passengerPricings.
     * 
     * @param value
     *     allowed object is
     *     {@link BookRequestPassengerPricingList }
     *     
     */
    public void setPassengerPricings(BookRequestPassengerPricingList value) {
        this.passengerPricings = value;
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
     *         &lt;element name="passenger" type="{http://ws.amadeus.fr/air}NamedPassenger" maxOccurs="18"/&gt;
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
        protected List<NamedPassenger> passenger;

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
        public Passengers(final List<NamedPassenger> passenger) {
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
         * {@link NamedPassenger }
         * 
         * 
         */
        public List<NamedPassenger> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<NamedPassenger>();
            }
            return this.passenger;
        }

    }

}
