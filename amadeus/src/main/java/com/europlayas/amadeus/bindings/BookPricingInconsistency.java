
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BookPricingInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookPricingInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fareTypeInconsistency" type="{http://ws.amadeus.fr/air}FareTypeInconsistencyWithCause" minOccurs="0"/&gt;
 *         &lt;element name="passengerPricingInconsistencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="passengerPricingInconsistency" type="{http://ws.amadeus.fr/air}BookPassengerPricingInconsistency" maxOccurs="6"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="cause" type="{http://ws.amadeus.fr/air}PricingModeInconsistencyCause" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookPricingInconsistency", propOrder = {

})
public class BookPricingInconsistency {

    protected FareTypeInconsistencyWithCause fareTypeInconsistency;
    protected BookPricingInconsistency.PassengerPricingInconsistencies passengerPricingInconsistencies;
    @XmlAttribute(name = "cause")
    protected PricingModeInconsistencyCause cause;

    /**
     * Default no-arg constructor
     * 
     */
    public BookPricingInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookPricingInconsistency(final FareTypeInconsistencyWithCause fareTypeInconsistency, final BookPricingInconsistency.PassengerPricingInconsistencies passengerPricingInconsistencies, final PricingModeInconsistencyCause cause) {
        this.fareTypeInconsistency = fareTypeInconsistency;
        this.passengerPricingInconsistencies = passengerPricingInconsistencies;
        this.cause = cause;
    }

    /**
     * Obtiene el valor de la propiedad fareTypeInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeInconsistencyWithCause }
     *     
     */
    public FareTypeInconsistencyWithCause getFareTypeInconsistency() {
        return fareTypeInconsistency;
    }

    /**
     * Define el valor de la propiedad fareTypeInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeInconsistencyWithCause }
     *     
     */
    public void setFareTypeInconsistency(FareTypeInconsistencyWithCause value) {
        this.fareTypeInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerPricingInconsistencies.
     * 
     * @return
     *     possible object is
     *     {@link BookPricingInconsistency.PassengerPricingInconsistencies }
     *     
     */
    public BookPricingInconsistency.PassengerPricingInconsistencies getPassengerPricingInconsistencies() {
        return passengerPricingInconsistencies;
    }

    /**
     * Define el valor de la propiedad passengerPricingInconsistencies.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPricingInconsistency.PassengerPricingInconsistencies }
     *     
     */
    public void setPassengerPricingInconsistencies(BookPricingInconsistency.PassengerPricingInconsistencies value) {
        this.passengerPricingInconsistencies = value;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link PricingModeInconsistencyCause }
     *     
     */
    public PricingModeInconsistencyCause getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModeInconsistencyCause }
     *     
     */
    public void setCause(PricingModeInconsistencyCause value) {
        this.cause = value;
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
     *         &lt;element name="passengerPricingInconsistency" type="{http://ws.amadeus.fr/air}BookPassengerPricingInconsistency" maxOccurs="6"/&gt;
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
        "passengerPricingInconsistency"
    })
    public static class PassengerPricingInconsistencies {

        @XmlElement(required = true)
        protected List<BookPassengerPricingInconsistency> passengerPricingInconsistency;

        /**
         * Default no-arg constructor
         * 
         */
        public PassengerPricingInconsistencies() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PassengerPricingInconsistencies(final List<BookPassengerPricingInconsistency> passengerPricingInconsistency) {
            this.passengerPricingInconsistency = passengerPricingInconsistency;
        }

        /**
         * Gets the value of the passengerPricingInconsistency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerPricingInconsistency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerPricingInconsistency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookPassengerPricingInconsistency }
         * 
         * 
         */
        public List<BookPassengerPricingInconsistency> getPassengerPricingInconsistency() {
            if (passengerPricingInconsistency == null) {
                passengerPricingInconsistency = new ArrayList<BookPassengerPricingInconsistency>();
            }
            return this.passengerPricingInconsistency;
        }

    }

}
