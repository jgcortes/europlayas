
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about a list of solution passenger pricing information, which is inconsistent. Composed of at least one more accurate inconsistency.
 * 
 * <p>Clase Java para BookPassengerPricingInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookPassengerPricingInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://ws.amadeus.fr/air}SolutionPassengerPricingInconsistencyGroup"/&gt;
 *         &lt;element name="incompletePassengerPricings" type="{http://ws.amadeus.fr/air}IncompleteBookPassengerPricingList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookPassengerPricingInconsistency", propOrder = {
    "unpricedPassengers",
    "incompletePassengerPricings"
})
public class BookPassengerPricingInconsistency implements Serializable
{

    protected UnpricedPassengerList unpricedPassengers;
    protected IncompleteBookPassengerPricingList incompletePassengerPricings;

    /**
     * Default no-arg constructor
     * 
     */
    public BookPassengerPricingInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookPassengerPricingInconsistency(final UnpricedPassengerList unpricedPassengers, final IncompleteBookPassengerPricingList incompletePassengerPricings) {
        this.unpricedPassengers = unpricedPassengers;
        this.incompletePassengerPricings = incompletePassengerPricings;
    }

    /**
     * Obtiene el valor de la propiedad unpricedPassengers.
     * 
     * @return
     *     possible object is
     *     {@link UnpricedPassengerList }
     *     
     */
    public UnpricedPassengerList getUnpricedPassengers() {
        return unpricedPassengers;
    }

    /**
     * Define el valor de la propiedad unpricedPassengers.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpricedPassengerList }
     *     
     */
    public void setUnpricedPassengers(UnpricedPassengerList value) {
        this.unpricedPassengers = value;
    }

    /**
     * Obtiene el valor de la propiedad incompletePassengerPricings.
     * 
     * @return
     *     possible object is
     *     {@link IncompleteBookPassengerPricingList }
     *     
     */
    public IncompleteBookPassengerPricingList getIncompletePassengerPricings() {
        return incompletePassengerPricings;
    }

    /**
     * Define el valor de la propiedad incompletePassengerPricings.
     * 
     * @param value
     *     allowed object is
     *     {@link IncompleteBookPassengerPricingList }
     *     
     */
    public void setIncompletePassengerPricings(IncompleteBookPassengerPricingList value) {
        this.incompletePassengerPricings = value;
    }

}
