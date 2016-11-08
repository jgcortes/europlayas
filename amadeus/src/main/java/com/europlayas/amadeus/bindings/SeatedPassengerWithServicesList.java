
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of basic passenger information with additional services (see type SeatedPassengerWithServices).
 * 
 * <p>Clase Java para SeatedPassengerWithServicesList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeatedPassengerWithServicesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passenger" type="{http://ws.amadeus.fr/air}SeatedPassengerWithServices" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatedPassengerWithServicesList", propOrder = {
    "passengers"
})
public class SeatedPassengerWithServicesList implements Serializable
{

    @XmlElement(name = "passenger", required = true)
    protected List<SeatedPassengerWithServices> passengers;

    /**
     * Default no-arg constructor
     * 
     */
    public SeatedPassengerWithServicesList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeatedPassengerWithServicesList(final List<SeatedPassengerWithServices> passengers) {
        this.passengers = passengers;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatedPassengerWithServices }
     * 
     * 
     */
    public List<SeatedPassengerWithServices> getPassengers() {
        if (passengers == null) {
            passengers = new ArrayList<SeatedPassengerWithServices>();
        }
        return this.passengers;
    }

}
