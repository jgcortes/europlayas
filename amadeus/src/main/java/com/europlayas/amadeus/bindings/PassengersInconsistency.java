
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information for a list of passenger information.
 * 
 * <p>Clase Java para PassengersInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengersInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unsupportedPassengers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unsupportedPassenger" type="{http://ws.amadeus.fr/air}Passenger" maxOccurs="9"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalServicesInconsistency" type="{http://ws.amadeus.fr/air}AdditionalServicesInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="inconsistentRemark" type="{http://ws.amadeus.fr/air}InconsistentRemark" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="notEnoughAccompanyingAdults" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengersInconsistency", propOrder = {
    "unsupportedPassengers",
    "additionalServicesInconsistency",
    "inconsistentRemark"
})
@XmlSeeAlso({
    SearchPassengersInconsistency.class,
    NamedPassengersInconsistency.class
})
public class PassengersInconsistency {

    protected PassengersInconsistency.UnsupportedPassengers unsupportedPassengers;
    protected AdditionalServicesInconsistency additionalServicesInconsistency;
    protected InconsistentRemark inconsistentRemark;
    @XmlAttribute(name = "notEnoughAccompanyingAdults", required = true)
    protected boolean notEnoughAccompanyingAdults;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengersInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengersInconsistency(final PassengersInconsistency.UnsupportedPassengers unsupportedPassengers, final AdditionalServicesInconsistency additionalServicesInconsistency, final InconsistentRemark inconsistentRemark, final boolean notEnoughAccompanyingAdults) {
        this.unsupportedPassengers = unsupportedPassengers;
        this.additionalServicesInconsistency = additionalServicesInconsistency;
        this.inconsistentRemark = inconsistentRemark;
        this.notEnoughAccompanyingAdults = notEnoughAccompanyingAdults;
    }

    /**
     * Obtiene el valor de la propiedad unsupportedPassengers.
     * 
     * @return
     *     possible object is
     *     {@link PassengersInconsistency.UnsupportedPassengers }
     *     
     */
    public PassengersInconsistency.UnsupportedPassengers getUnsupportedPassengers() {
        return unsupportedPassengers;
    }

    /**
     * Define el valor de la propiedad unsupportedPassengers.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengersInconsistency.UnsupportedPassengers }
     *     
     */
    public void setUnsupportedPassengers(PassengersInconsistency.UnsupportedPassengers value) {
        this.unsupportedPassengers = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalServicesInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServicesInconsistency }
     *     
     */
    public AdditionalServicesInconsistency getAdditionalServicesInconsistency() {
        return additionalServicesInconsistency;
    }

    /**
     * Define el valor de la propiedad additionalServicesInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServicesInconsistency }
     *     
     */
    public void setAdditionalServicesInconsistency(AdditionalServicesInconsistency value) {
        this.additionalServicesInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentRemark.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentRemark }
     *     
     */
    public InconsistentRemark getInconsistentRemark() {
        return inconsistentRemark;
    }

    /**
     * Define el valor de la propiedad inconsistentRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentRemark }
     *     
     */
    public void setInconsistentRemark(InconsistentRemark value) {
        this.inconsistentRemark = value;
    }

    /**
     * Obtiene el valor de la propiedad notEnoughAccompanyingAdults.
     * 
     */
    public boolean isNotEnoughAccompanyingAdults() {
        return notEnoughAccompanyingAdults;
    }

    /**
     * Define el valor de la propiedad notEnoughAccompanyingAdults.
     * 
     */
    public void setNotEnoughAccompanyingAdults(boolean value) {
        this.notEnoughAccompanyingAdults = value;
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
     *         &lt;element name="unsupportedPassenger" type="{http://ws.amadeus.fr/air}Passenger" maxOccurs="9"/&gt;
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
        "unsupportedPassenger"
    })
    public static class UnsupportedPassengers {

        @XmlElement(required = true)
        protected List<Passenger> unsupportedPassenger;

        /**
         * Default no-arg constructor
         * 
         */
        public UnsupportedPassengers() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public UnsupportedPassengers(final List<Passenger> unsupportedPassenger) {
            this.unsupportedPassenger = unsupportedPassenger;
        }

        /**
         * Gets the value of the unsupportedPassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unsupportedPassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnsupportedPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Passenger }
         * 
         * 
         */
        public List<Passenger> getUnsupportedPassenger() {
            if (unsupportedPassenger == null) {
                unsupportedPassenger = new ArrayList<Passenger>();
            }
            return this.unsupportedPassenger;
        }

    }

}
