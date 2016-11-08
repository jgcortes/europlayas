
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The luggage allowance, that is the free baggage allowance.
 * 
 * <p>Clase Java para LuggageAllowance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LuggageAllowance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
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
 *         &lt;element name="segments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="segmentId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="18"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="numberOfPieces" type="{http://ws.amadeus.fr/common}Unsigned0To99Byte" /&gt;
 *       &lt;attribute name="totalWeightAllowed" type="{http://ws.amadeus.fr/common}Unsigned0To1000Short" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageAllowance", propOrder = {

})
public class LuggageAllowance implements Serializable
{

    @XmlElement(required = true)
    protected LuggageAllowance.Passengers passengers;
    @XmlElement(required = true)
    protected LuggageAllowance.Segments segments;
    @XmlAttribute(name = "numberOfPieces")
    protected Short numberOfPieces;
    @XmlAttribute(name = "totalWeightAllowed")
    protected Integer totalWeightAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public LuggageAllowance() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LuggageAllowance(final LuggageAllowance.Passengers passengers, final LuggageAllowance.Segments segments, final Short numberOfPieces, final Integer totalWeightAllowed) {
        this.passengers = passengers;
        this.segments = segments;
        this.numberOfPieces = numberOfPieces;
        this.totalWeightAllowed = totalWeightAllowed;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link LuggageAllowance.Passengers }
     *     
     */
    public LuggageAllowance.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageAllowance.Passengers }
     *     
     */
    public void setPassengers(LuggageAllowance.Passengers value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad segments.
     * 
     * @return
     *     possible object is
     *     {@link LuggageAllowance.Segments }
     *     
     */
    public LuggageAllowance.Segments getSegments() {
        return segments;
    }

    /**
     * Define el valor de la propiedad segments.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageAllowance.Segments }
     *     
     */
    public void setSegments(LuggageAllowance.Segments value) {
        this.segments = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfPieces.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Define el valor de la propiedad numberOfPieces.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfPieces(Short value) {
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
     *         &lt;element name="segmentId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="18"/&gt;
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
        "segmentIds"
    })
    public static class Segments implements Serializable
    {

        @XmlElement(name = "segmentId", type = Integer.class)
        protected List<Integer> segmentIds;

        /**
         * Default no-arg constructor
         * 
         */
        public Segments() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Segments(final List<Integer> segmentIds) {
            this.segmentIds = segmentIds;
        }

        /**
         * Gets the value of the segmentIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getSegmentIds() {
            if (segmentIds == null) {
                segmentIds = new ArrayList<Integer>();
            }
            return this.segmentIds;
        }

    }

}
