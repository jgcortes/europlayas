
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Incomplete solution passenger pricing. Composed of at least one more accurate inconsistency.
 * 
 * <p>Clase Java para IncompleteBookPassengerPricing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteBookPassengerPricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerPricing" type="{http://ws.amadeus.fr/air}BookResponsePassengerPricing"/&gt;
 *         &lt;group ref="{http://ws.amadeus.fr/air}IncompletePassengerPricingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteBookPassengerPricing", propOrder = {
    "passengerPricing",
    "unpricedSegments",
    "inconsistentSegmentDetails"
})
public class IncompleteBookPassengerPricing implements Serializable
{

    @XmlElement(required = true)
    protected BookResponsePassengerPricing passengerPricing;
    protected UnpricedSegmentList unpricedSegments;
    protected InconsistentSegmentDetailList inconsistentSegmentDetails;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteBookPassengerPricing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteBookPassengerPricing(final BookResponsePassengerPricing passengerPricing, final UnpricedSegmentList unpricedSegments, final InconsistentSegmentDetailList inconsistentSegmentDetails) {
        this.passengerPricing = passengerPricing;
        this.unpricedSegments = unpricedSegments;
        this.inconsistentSegmentDetails = inconsistentSegmentDetails;
    }

    /**
     * Obtiene el valor de la propiedad passengerPricing.
     * 
     * @return
     *     possible object is
     *     {@link BookResponsePassengerPricing }
     *     
     */
    public BookResponsePassengerPricing getPassengerPricing() {
        return passengerPricing;
    }

    /**
     * Define el valor de la propiedad passengerPricing.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponsePassengerPricing }
     *     
     */
    public void setPassengerPricing(BookResponsePassengerPricing value) {
        this.passengerPricing = value;
    }

    /**
     * Obtiene el valor de la propiedad unpricedSegments.
     * 
     * @return
     *     possible object is
     *     {@link UnpricedSegmentList }
     *     
     */
    public UnpricedSegmentList getUnpricedSegments() {
        return unpricedSegments;
    }

    /**
     * Define el valor de la propiedad unpricedSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpricedSegmentList }
     *     
     */
    public void setUnpricedSegments(UnpricedSegmentList value) {
        this.unpricedSegments = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentSegmentDetails.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentSegmentDetailList }
     *     
     */
    public InconsistentSegmentDetailList getInconsistentSegmentDetails() {
        return inconsistentSegmentDetails;
    }

    /**
     * Define el valor de la propiedad inconsistentSegmentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentSegmentDetailList }
     *     
     */
    public void setInconsistentSegmentDetails(InconsistentSegmentDetailList value) {
        this.inconsistentSegmentDetails = value;
    }

}
