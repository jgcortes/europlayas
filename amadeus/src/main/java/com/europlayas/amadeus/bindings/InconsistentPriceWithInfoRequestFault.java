
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out inconsistencies in the pricing request to the requestor. These inconsistencies have caused a pricing failure. Composed of at least one inconsistency.
 * 
 * <p>Clase Java para InconsistentPriceWithInfoRequestFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentPriceWithInfoRequestFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="itineraryInconsistency" type="{http://ws.amadeus.fr/air}ItineraryInconsistency" minOccurs="0"/&gt;
 *           &lt;element name="passengersInconsistency" type="{http://ws.amadeus.fr/air}PassengersInconsistency" minOccurs="0"/&gt;
 *           &lt;element name="fareTypeInconsistency" type="{http://ws.amadeus.fr/air}FareTypeInconsistency" minOccurs="0"/&gt;
 *           &lt;element name="pricingInconsistency" type="{http://ws.amadeus.fr/air}PriceWithInfoPricingInconsistency" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="inconsistentSegments" type="{http://ws.amadeus.fr/air}SegmentList"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentPriceWithInfoRequestFault", propOrder = {
    "itineraryInconsistency",
    "passengersInconsistency",
    "fareTypeInconsistency",
    "pricingInconsistency",
    "inconsistentSegments"
})
public class InconsistentPriceWithInfoRequestFault
    extends Fault
{

    protected ItineraryInconsistency itineraryInconsistency;
    protected PassengersInconsistency passengersInconsistency;
    protected FareTypeInconsistency fareTypeInconsistency;
    protected PriceWithInfoPricingInconsistency pricingInconsistency;
    protected SegmentList inconsistentSegments;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentPriceWithInfoRequestFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentPriceWithInfoRequestFault(final ItineraryIdList itineraries, final ItineraryInconsistency itineraryInconsistency, final PassengersInconsistency passengersInconsistency, final FareTypeInconsistency fareTypeInconsistency, final PriceWithInfoPricingInconsistency pricingInconsistency, final SegmentList inconsistentSegments) {
        super(itineraries);
        this.itineraryInconsistency = itineraryInconsistency;
        this.passengersInconsistency = passengersInconsistency;
        this.fareTypeInconsistency = fareTypeInconsistency;
        this.pricingInconsistency = pricingInconsistency;
        this.inconsistentSegments = inconsistentSegments;
    }

    /**
     * Obtiene el valor de la propiedad itineraryInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInconsistency }
     *     
     */
    public ItineraryInconsistency getItineraryInconsistency() {
        return itineraryInconsistency;
    }

    /**
     * Define el valor de la propiedad itineraryInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInconsistency }
     *     
     */
    public void setItineraryInconsistency(ItineraryInconsistency value) {
        this.itineraryInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad passengersInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link PassengersInconsistency }
     *     
     */
    public PassengersInconsistency getPassengersInconsistency() {
        return passengersInconsistency;
    }

    /**
     * Define el valor de la propiedad passengersInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengersInconsistency }
     *     
     */
    public void setPassengersInconsistency(PassengersInconsistency value) {
        this.passengersInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad fareTypeInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeInconsistency }
     *     
     */
    public FareTypeInconsistency getFareTypeInconsistency() {
        return fareTypeInconsistency;
    }

    /**
     * Define el valor de la propiedad fareTypeInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeInconsistency }
     *     
     */
    public void setFareTypeInconsistency(FareTypeInconsistency value) {
        this.fareTypeInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad pricingInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link PriceWithInfoPricingInconsistency }
     *     
     */
    public PriceWithInfoPricingInconsistency getPricingInconsistency() {
        return pricingInconsistency;
    }

    /**
     * Define el valor de la propiedad pricingInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceWithInfoPricingInconsistency }
     *     
     */
    public void setPricingInconsistency(PriceWithInfoPricingInconsistency value) {
        this.pricingInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentSegments.
     * 
     * @return
     *     possible object is
     *     {@link SegmentList }
     *     
     */
    public SegmentList getInconsistentSegments() {
        return inconsistentSegments;
    }

    /**
     * Define el valor de la propiedad inconsistentSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentList }
     *     
     */
    public void setInconsistentSegments(SegmentList value) {
        this.inconsistentSegments = value;
    }

}
