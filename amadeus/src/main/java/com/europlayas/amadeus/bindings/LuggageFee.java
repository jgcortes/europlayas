
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fee due to luggage.
 * 
 * <p>Clase Java para LuggageFee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LuggageFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="totalAmount" type="{http://ws.amadeus.fr/air}CurrencyAmount"/&gt;
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
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="numberOfPieces" use="required" type="{http://ws.amadeus.fr/air}NumberOfPiecesOfLuggage" /&gt;
 *       &lt;attribute name="totalWeightAllowed" type="{http://ws.amadeus.fr/air}LuggageTotalWeightAllowed" /&gt;
 *       &lt;attribute name="bookablePerItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageFee", propOrder = {

})
public class LuggageFee {

    @XmlElement(required = true)
    protected CurrencyAmount totalAmount;
    @XmlElement(required = true)
    protected LuggageFee.Passengers passengers;
    @XmlElement(required = true)
    protected ItineraryIdList itineraries;
    @XmlAttribute(name = "numberOfPieces", required = true)
    protected short numberOfPieces;
    @XmlAttribute(name = "totalWeightAllowed")
    protected Integer totalWeightAllowed;
    @XmlAttribute(name = "bookablePerItinerary")
    protected Boolean bookablePerItinerary;

    /**
     * Default no-arg constructor
     * 
     */
    public LuggageFee() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LuggageFee(final CurrencyAmount totalAmount, final LuggageFee.Passengers passengers, final ItineraryIdList itineraries, final short numberOfPieces, final Integer totalWeightAllowed, final Boolean bookablePerItinerary) {
        this.totalAmount = totalAmount;
        this.passengers = passengers;
        this.itineraries = itineraries;
        this.numberOfPieces = numberOfPieces;
        this.totalWeightAllowed = totalWeightAllowed;
        this.bookablePerItinerary = bookablePerItinerary;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalAmount(CurrencyAmount value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link LuggageFee.Passengers }
     *     
     */
    public LuggageFee.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageFee.Passengers }
     *     
     */
    public void setPassengers(LuggageFee.Passengers value) {
        this.passengers = value;
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
     * Obtiene el valor de la propiedad numberOfPieces.
     * 
     */
    public short getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Define el valor de la propiedad numberOfPieces.
     * 
     */
    public void setNumberOfPieces(short value) {
        this.numberOfPieces = value;
    }

    /**
     * Obtiene el valor de la propiedad totalWeightAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalWeightAllowed() {
        return totalWeightAllowed;
    }

    /**
     * Define el valor de la propiedad totalWeightAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalWeightAllowed(Integer value) {
        this.totalWeightAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad bookablePerItinerary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBookablePerItinerary() {
        if (bookablePerItinerary == null) {
            return false;
        } else {
            return bookablePerItinerary;
        }
    }

    /**
     * Define el valor de la propiedad bookablePerItinerary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookablePerItinerary(Boolean value) {
        this.bookablePerItinerary = value;
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
        "passengerId"
    })
    public static class Passengers {

        @XmlElement(type = Integer.class)
        protected List<Integer> passengerId;

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
        public Passengers(final List<Integer> passengerId) {
            this.passengerId = passengerId;
        }

        /**
         * Gets the value of the passengerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getPassengerId() {
            if (passengerId == null) {
                passengerId = new ArrayList<Integer>();
            }
            return this.passengerId;
        }

    }

}
