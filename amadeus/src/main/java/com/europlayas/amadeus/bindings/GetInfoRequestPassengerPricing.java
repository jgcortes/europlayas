
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Passenger pricing information, for a specific passenger, based on type PassengerPricing, with appropriate restrictions related to a pricing solution for a recommendation.
 * 
 * <p>Clase Java para GetInfoRequestPassengerPricing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoRequestPassengerPricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segmentDetails" type="{http://ws.amadeus.fr/air}GetInfoRequestPassengerPricingSegmentDetailList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ws.amadeus.fr/air}PassengerPricingAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoRequestPassengerPricing", propOrder = {
    "segmentDetails"
})
public class GetInfoRequestPassengerPricing implements Serializable
{

    @XmlElement(required = true)
    protected GetInfoRequestPassengerPricingSegmentDetailList segmentDetails;
    @XmlAttribute(name = "fareOption", required = true)
    protected FareOption fareOption;
    @XmlAttribute(name = "passengerId", required = true)
    protected int passengerId;

    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoRequestPassengerPricing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoRequestPassengerPricing(final GetInfoRequestPassengerPricingSegmentDetailList segmentDetails, final FareOption fareOption, final int passengerId) {
        this.segmentDetails = segmentDetails;
        this.fareOption = fareOption;
        this.passengerId = passengerId;
    }

    /**
     * Obtiene el valor de la propiedad segmentDetails.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoRequestPassengerPricingSegmentDetailList }
     *     
     */
    public GetInfoRequestPassengerPricingSegmentDetailList getSegmentDetails() {
        return segmentDetails;
    }

    /**
     * Define el valor de la propiedad segmentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoRequestPassengerPricingSegmentDetailList }
     *     
     */
    public void setSegmentDetails(GetInfoRequestPassengerPricingSegmentDetailList value) {
        this.segmentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad fareOption.
     * 
     * @return
     *     possible object is
     *     {@link FareOption }
     *     
     */
    public FareOption getFareOption() {
        return fareOption;
    }

    /**
     * Define el valor de la propiedad fareOption.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOption }
     *     
     */
    public void setFareOption(FareOption value) {
        this.fareOption = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerId.
     * 
     */
    public int getPassengerId() {
        return passengerId;
    }

    /**
     * Define el valor de la propiedad passengerId.
     * 
     */
    public void setPassengerId(int value) {
        this.passengerId = value;
    }

}
