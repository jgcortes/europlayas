
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PassengerPricingWithFareBasisDiscrepancy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerPricingWithFareBasisDiscrepancy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="requestedSolutionPassengerPricing" type="{http://ws.amadeus.fr/air}PassengerPricing"/&gt;
 *         &lt;element name="actualSolutionPassengerPricing" type="{http://ws.amadeus.fr/air}BookRequestPassengerPricing"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerPricingWithFareBasisDiscrepancy", propOrder = {

})
public class PassengerPricingWithFareBasisDiscrepancy implements Serializable
{

    @XmlElement(required = true)
    protected PassengerPricing requestedSolutionPassengerPricing;
    @XmlElement(required = true)
    protected BookRequestPassengerPricing actualSolutionPassengerPricing;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerPricingWithFareBasisDiscrepancy() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerPricingWithFareBasisDiscrepancy(final PassengerPricing requestedSolutionPassengerPricing, final BookRequestPassengerPricing actualSolutionPassengerPricing) {
        this.requestedSolutionPassengerPricing = requestedSolutionPassengerPricing;
        this.actualSolutionPassengerPricing = actualSolutionPassengerPricing;
    }

    /**
     * Obtiene el valor de la propiedad requestedSolutionPassengerPricing.
     * 
     * @return
     *     possible object is
     *     {@link PassengerPricing }
     *     
     */
    public PassengerPricing getRequestedSolutionPassengerPricing() {
        return requestedSolutionPassengerPricing;
    }

    /**
     * Define el valor de la propiedad requestedSolutionPassengerPricing.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerPricing }
     *     
     */
    public void setRequestedSolutionPassengerPricing(PassengerPricing value) {
        this.requestedSolutionPassengerPricing = value;
    }

    /**
     * Obtiene el valor de la propiedad actualSolutionPassengerPricing.
     * 
     * @return
     *     possible object is
     *     {@link BookRequestPassengerPricing }
     *     
     */
    public BookRequestPassengerPricing getActualSolutionPassengerPricing() {
        return actualSolutionPassengerPricing;
    }

    /**
     * Define el valor de la propiedad actualSolutionPassengerPricing.
     * 
     * @param value
     *     allowed object is
     *     {@link BookRequestPassengerPricing }
     *     
     */
    public void setActualSolutionPassengerPricing(BookRequestPassengerPricing value) {
        this.actualSolutionPassengerPricing = value;
    }

}
