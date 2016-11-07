
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of incomplete solution passenger pricings, due to unpriced segments.
 * 
 * <p>Clase Java para IncompleteBookPassengerPricingList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteBookPassengerPricingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incompletePassengerPricing" type="{http://ws.amadeus.fr/air}IncompleteBookPassengerPricing" maxOccurs="18"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteBookPassengerPricingList", propOrder = {
    "incompletePassengerPricing"
})
public class IncompleteBookPassengerPricingList {

    @XmlElement(required = true)
    protected List<IncompleteBookPassengerPricing> incompletePassengerPricing;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteBookPassengerPricingList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteBookPassengerPricingList(final List<IncompleteBookPassengerPricing> incompletePassengerPricing) {
        this.incompletePassengerPricing = incompletePassengerPricing;
    }

    /**
     * Gets the value of the incompletePassengerPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incompletePassengerPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncompletePassengerPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncompleteBookPassengerPricing }
     * 
     * 
     */
    public List<IncompleteBookPassengerPricing> getIncompletePassengerPricing() {
        if (incompletePassengerPricing == null) {
            incompletePassengerPricing = new ArrayList<IncompleteBookPassengerPricing>();
        }
        return this.incompletePassengerPricing;
    }

}
