
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * List of airline codes.
 * 
 * <p>Clase Java para AirlineCodeList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineCodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineCode" type="{http://ws.amadeus.fr/air}AirlineCode" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineCodeList", propOrder = {
    "airlineCode"
})
@XmlSeeAlso({
    ValidatingAirlineCodeList.class
})
public class AirlineCodeList {

    @XmlElement(required = true)
    protected List<String> airlineCode;

    /**
     * Default no-arg constructor
     * 
     */
    public AirlineCodeList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirlineCodeList(final List<String> airlineCode) {
        this.airlineCode = airlineCode;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAirlineCode() {
        if (airlineCode == null) {
            airlineCode = new ArrayList<String>();
        }
        return this.airlineCode;
    }

}
