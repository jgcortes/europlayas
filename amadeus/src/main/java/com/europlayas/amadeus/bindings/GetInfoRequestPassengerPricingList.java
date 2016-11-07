
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of get info request passenger information, for one or more passengers. This type can include information for all passenger / segment pairs, related to a pricing solution for a recommendation.
 * 
 * <p>Clase Java para GetInfoRequestPassengerPricingList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoRequestPassengerPricingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerPricing" type="{http://ws.amadeus.fr/air}GetInfoRequestPassengerPricing" maxOccurs="18"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoRequestPassengerPricingList", propOrder = {
    "passengerPricing"
})
public class GetInfoRequestPassengerPricingList {

    @XmlElement(required = true)
    protected List<GetInfoRequestPassengerPricing> passengerPricing;

    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoRequestPassengerPricingList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoRequestPassengerPricingList(final List<GetInfoRequestPassengerPricing> passengerPricing) {
        this.passengerPricing = passengerPricing;
    }

    /**
     * Gets the value of the passengerPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetInfoRequestPassengerPricing }
     * 
     * 
     */
    public List<GetInfoRequestPassengerPricing> getPassengerPricing() {
        if (passengerPricing == null) {
            passengerPricing = new ArrayList<GetInfoRequestPassengerPricing>();
        }
        return this.passengerPricing;
    }

}
