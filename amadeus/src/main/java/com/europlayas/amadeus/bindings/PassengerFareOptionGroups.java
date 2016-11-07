
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group composed of one or more passenger fare option sets. Each set contains fare options applied to one or more distinct passengers.
 * 
 * <p>Clase Java para PassengerFareOptionGroups complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareOptionGroups"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerFareOptionGroup" type="{http://ws.amadeus.fr/air}PassengerFareOptionList" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareOptionGroups", propOrder = {
    "passengerFareOptionGroup"
})
public class PassengerFareOptionGroups {

    @XmlElement(required = true)
    protected List<PassengerFareOptionList> passengerFareOptionGroup;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerFareOptionGroups() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerFareOptionGroups(final List<PassengerFareOptionList> passengerFareOptionGroup) {
        this.passengerFareOptionGroup = passengerFareOptionGroup;
    }

    /**
     * Gets the value of the passengerFareOptionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerFareOptionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerFareOptionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFareOptionList }
     * 
     * 
     */
    public List<PassengerFareOptionList> getPassengerFareOptionGroup() {
        if (passengerFareOptionGroup == null) {
            passengerFareOptionGroup = new ArrayList<PassengerFareOptionList>();
        }
        return this.passengerFareOptionGroup;
    }

}
