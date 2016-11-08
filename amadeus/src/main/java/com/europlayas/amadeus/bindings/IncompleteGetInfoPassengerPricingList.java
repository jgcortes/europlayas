
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of incomplete solution passenger pricings, due to unpriced segments.
 * 
 * <p>Clase Java para IncompleteGetInfoPassengerPricingList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteGetInfoPassengerPricingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incompletePassengerPricing" type="{http://ws.amadeus.fr/air}IncompleteGetInfoPassengerPricing" maxOccurs="18"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteGetInfoPassengerPricingList", propOrder = {
    "incompletePassengerPricings"
})
public class IncompleteGetInfoPassengerPricingList implements Serializable
{

    @XmlElement(name = "incompletePassengerPricing", required = true)
    protected List<IncompleteGetInfoPassengerPricing> incompletePassengerPricings;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteGetInfoPassengerPricingList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteGetInfoPassengerPricingList(final List<IncompleteGetInfoPassengerPricing> incompletePassengerPricings) {
        this.incompletePassengerPricings = incompletePassengerPricings;
    }

    /**
     * Gets the value of the incompletePassengerPricings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incompletePassengerPricings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncompletePassengerPricings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncompleteGetInfoPassengerPricing }
     * 
     * 
     */
    public List<IncompleteGetInfoPassengerPricing> getIncompletePassengerPricings() {
        if (incompletePassengerPricings == null) {
            incompletePassengerPricings = new ArrayList<IncompleteGetInfoPassengerPricing>();
        }
        return this.incompletePassengerPricings;
    }

}
