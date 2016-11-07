
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information for passenger information (including basic, personal and accommodation preference information).
 * 
 * <p>Clase Java para InconsistentPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passenger" type="{http://ws.amadeus.fr/air}NamedPassenger"/&gt;
 *         &lt;element name="personalInformationInconsistencies"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="personalInformationInconsistency" type="{http://ws.amadeus.fr/air}PersonalInformationInconsistency" maxOccurs="24"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "InconsistentPassenger", propOrder = {
    "passenger",
    "personalInformationInconsistencies"
})
public class InconsistentPassenger {

    @XmlElement(required = true)
    protected NamedPassenger passenger;
    @XmlElement(required = true)
    protected InconsistentPassenger.PersonalInformationInconsistencies personalInformationInconsistencies;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentPassenger(final NamedPassenger passenger, final InconsistentPassenger.PersonalInformationInconsistencies personalInformationInconsistencies) {
        this.passenger = passenger;
        this.personalInformationInconsistencies = personalInformationInconsistencies;
    }

    /**
     * Obtiene el valor de la propiedad passenger.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassenger }
     *     
     */
    public NamedPassenger getPassenger() {
        return passenger;
    }

    /**
     * Define el valor de la propiedad passenger.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassenger }
     *     
     */
    public void setPassenger(NamedPassenger value) {
        this.passenger = value;
    }

    /**
     * Obtiene el valor de la propiedad personalInformationInconsistencies.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentPassenger.PersonalInformationInconsistencies }
     *     
     */
    public InconsistentPassenger.PersonalInformationInconsistencies getPersonalInformationInconsistencies() {
        return personalInformationInconsistencies;
    }

    /**
     * Define el valor de la propiedad personalInformationInconsistencies.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentPassenger.PersonalInformationInconsistencies }
     *     
     */
    public void setPersonalInformationInconsistencies(InconsistentPassenger.PersonalInformationInconsistencies value) {
        this.personalInformationInconsistencies = value;
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
     *         &lt;element name="personalInformationInconsistency" type="{http://ws.amadeus.fr/air}PersonalInformationInconsistency" maxOccurs="24"/&gt;
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
        "personalInformationInconsistency"
    })
    public static class PersonalInformationInconsistencies {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<PersonalInformationInconsistency> personalInformationInconsistency;

        /**
         * Default no-arg constructor
         * 
         */
        public PersonalInformationInconsistencies() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PersonalInformationInconsistencies(final List<PersonalInformationInconsistency> personalInformationInconsistency) {
            this.personalInformationInconsistency = personalInformationInconsistency;
        }

        /**
         * Gets the value of the personalInformationInconsistency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personalInformationInconsistency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonalInformationInconsistency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonalInformationInconsistency }
         * 
         * 
         */
        public List<PersonalInformationInconsistency> getPersonalInformationInconsistency() {
            if (personalInformationInconsistency == null) {
                personalInformationInconsistency = new ArrayList<PersonalInformationInconsistency>();
            }
            return this.personalInformationInconsistency;
        }

    }

}
