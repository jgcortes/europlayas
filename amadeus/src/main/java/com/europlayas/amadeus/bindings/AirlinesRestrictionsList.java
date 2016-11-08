
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlinesRestrictionsList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlinesRestrictionsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineCodeRestrictions" type="{http://ws.amadeus.fr/air}AirlineCodeRestrictions" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlinesRestrictionsList", propOrder = {
    "airlineCodeRestrictions"
})
@XmlSeeAlso({
    AirlineRestrictions.class
})
public class AirlinesRestrictionsList implements Serializable
{

    protected List<AirlineCodeRestrictions> airlineCodeRestrictions;

    /**
     * Default no-arg constructor
     * 
     */
    public AirlinesRestrictionsList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirlinesRestrictionsList(final List<AirlineCodeRestrictions> airlineCodeRestrictions) {
        this.airlineCodeRestrictions = airlineCodeRestrictions;
    }

    /**
     * Gets the value of the airlineCodeRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineCodeRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineCodeRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineCodeRestrictions }
     * 
     * 
     */
    public List<AirlineCodeRestrictions> getAirlineCodeRestrictions() {
        if (airlineCodeRestrictions == null) {
            airlineCodeRestrictions = new ArrayList<AirlineCodeRestrictions>();
        }
        return this.airlineCodeRestrictions;
    }

}
