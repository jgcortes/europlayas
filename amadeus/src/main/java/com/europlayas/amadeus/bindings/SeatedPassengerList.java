
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of basic passenger information (see type SeatedPassenger).
 * 
 * <p>Clase Java para SeatedPassengerList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeatedPassengerList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passenger" type="{http://ws.amadeus.fr/air}SeatedPassenger" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatedPassengerList", propOrder = {
    "passenger"
})
public class SeatedPassengerList {

    @XmlElement(required = true)
    protected List<SeatedPassenger> passenger;

    /**
     * Default no-arg constructor
     * 
     */
    public SeatedPassengerList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeatedPassengerList(final List<SeatedPassenger> passenger) {
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
     * {@link SeatedPassenger }
     * 
     * 
     */
    public List<SeatedPassenger> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<SeatedPassenger>();
        }
        return this.passenger;
    }

}
