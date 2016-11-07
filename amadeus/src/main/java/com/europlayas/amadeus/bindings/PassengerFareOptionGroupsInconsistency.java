
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to a group of passenger fare options.
 * 
 * <p>Clase Java para PassengerFareOptionGroupsInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareOptionGroupsInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="noDefaultFareOption"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="1|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="incompleteGroups" type="{http://ws.amadeus.fr/air}PassengerFareOptionGroups" minOccurs="0"/&gt;
 *           &lt;element name="duplicatedGroups" type="{http://ws.amadeus.fr/air}PassengerFareOptionGroups" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareOptionGroupsInconsistency", propOrder = {
    "noDefaultFareOption",
    "incompleteGroups",
    "duplicatedGroups"
})
public class PassengerFareOptionGroupsInconsistency {

    protected Boolean noDefaultFareOption;
    protected PassengerFareOptionGroups incompleteGroups;
    protected PassengerFareOptionGroups duplicatedGroups;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerFareOptionGroupsInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerFareOptionGroupsInconsistency(final Boolean noDefaultFareOption, final PassengerFareOptionGroups incompleteGroups, final PassengerFareOptionGroups duplicatedGroups) {
        this.noDefaultFareOption = noDefaultFareOption;
        this.incompleteGroups = incompleteGroups;
        this.duplicatedGroups = duplicatedGroups;
    }

    /**
     * Obtiene el valor de la propiedad noDefaultFareOption.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoDefaultFareOption() {
        return noDefaultFareOption;
    }

    /**
     * Define el valor de la propiedad noDefaultFareOption.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoDefaultFareOption(Boolean value) {
        this.noDefaultFareOption = value;
    }

    /**
     * Obtiene el valor de la propiedad incompleteGroups.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFareOptionGroups }
     *     
     */
    public PassengerFareOptionGroups getIncompleteGroups() {
        return incompleteGroups;
    }

    /**
     * Define el valor de la propiedad incompleteGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFareOptionGroups }
     *     
     */
    public void setIncompleteGroups(PassengerFareOptionGroups value) {
        this.incompleteGroups = value;
    }

    /**
     * Obtiene el valor de la propiedad duplicatedGroups.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFareOptionGroups }
     *     
     */
    public PassengerFareOptionGroups getDuplicatedGroups() {
        return duplicatedGroups;
    }

    /**
     * Define el valor de la propiedad duplicatedGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFareOptionGroups }
     *     
     */
    public void setDuplicatedGroups(PassengerFareOptionGroups value) {
        this.duplicatedGroups = value;
    }

}
