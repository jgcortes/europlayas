
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LuggageAllowances complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LuggageAllowances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="luggageAllowance" type="{http://ws.amadeus.fr/air}LuggageAllowance" maxOccurs="1000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageAllowances", propOrder = {
    "luggageAllowance"
})
public class LuggageAllowances {

    protected List<LuggageAllowance> luggageAllowance;

    /**
     * Default no-arg constructor
     * 
     */
    public LuggageAllowances() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LuggageAllowances(final List<LuggageAllowance> luggageAllowance) {
        this.luggageAllowance = luggageAllowance;
    }

    /**
     * Gets the value of the luggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageAllowance }
     * 
     * 
     */
    public List<LuggageAllowance> getLuggageAllowance() {
        if (luggageAllowance == null) {
            luggageAllowance = new ArrayList<LuggageAllowance>();
        }
        return this.luggageAllowance;
    }

}
