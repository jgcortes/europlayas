
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoyaltyProgramList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgramList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loyaltyProgram" type="{http://ws.amadeus.fr/air}FrequentFlyer" maxOccurs="10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramList", propOrder = {
    "loyaltyPrograms"
})
public class LoyaltyProgramList implements Serializable
{

    @XmlElement(name = "loyaltyProgram", required = true)
    protected List<FrequentFlyer> loyaltyPrograms;

    /**
     * Default no-arg constructor
     * 
     */
    public LoyaltyProgramList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoyaltyProgramList(final List<FrequentFlyer> loyaltyPrograms) {
        this.loyaltyPrograms = loyaltyPrograms;
    }

    /**
     * Gets the value of the loyaltyPrograms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPrograms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentFlyer }
     * 
     * 
     */
    public List<FrequentFlyer> getLoyaltyPrograms() {
        if (loyaltyPrograms == null) {
            loyaltyPrograms = new ArrayList<FrequentFlyer>();
        }
        return this.loyaltyPrograms;
    }

}
