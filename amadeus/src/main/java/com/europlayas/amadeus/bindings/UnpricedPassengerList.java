
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of passengers missing pricing information.
 * 
 * <p>Clase Java para UnpricedPassengerList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnpricedPassengerList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unpricedPassenger" type="{http://ws.amadeus.fr/air}Passenger" maxOccurs="17"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnpricedPassengerList", propOrder = {
    "unpricedPassenger"
})
public class UnpricedPassengerList {

    @XmlElement(required = true)
    protected List<Passenger> unpricedPassenger;

    /**
     * Default no-arg constructor
     * 
     */
    public UnpricedPassengerList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnpricedPassengerList(final List<Passenger> unpricedPassenger) {
        this.unpricedPassenger = unpricedPassenger;
    }

    /**
     * Gets the value of the unpricedPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unpricedPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnpricedPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passenger }
     * 
     * 
     */
    public List<Passenger> getUnpricedPassenger() {
        if (unpricedPassenger == null) {
            unpricedPassenger = new ArrayList<Passenger>();
        }
        return this.unpricedPassenger;
    }

}
