
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * For a specific passenger, pricing information to be defined for each segment.
 * 
 * <p>Clase Java para SearchPassengerPricingSegmentDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchPassengerPricingSegmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="luggageAllowance" type="{http://ws.amadeus.fr/air}SearchLuggageAllowance" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attGroup ref="{http://ws.amadeus.fr/air}SegmentDetailAttribute"/&gt;
 *       &lt;attribute name="travelClass" type="{http://ws.amadeus.fr/air}TravelClass" /&gt;
 *       &lt;attribute name="sliceDiceIndicator" type="{http://ws.amadeus.fr/air}SliceDiceIndicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPassengerPricingSegmentDetail", propOrder = {

})
public class SearchPassengerPricingSegmentDetail implements Serializable
{

    protected SearchLuggageAllowance luggageAllowance;
    @XmlAttribute(name = "travelClass")
    protected TravelClass travelClass;
    @XmlAttribute(name = "sliceDiceIndicator")
    protected SliceDiceIndicator sliceDiceIndicator;
    @XmlAttribute(name = "segmentId", required = true)
    protected int segmentId;
    @XmlAttribute(name = "fareBasis")
    protected String fareBasis;
    @XmlAttribute(name = "bookingClassCode")
    protected String bookingClassCode;

    /**
     * Default no-arg constructor
     * 
     */
    public SearchPassengerPricingSegmentDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchPassengerPricingSegmentDetail(final SearchLuggageAllowance luggageAllowance, final TravelClass travelClass, final SliceDiceIndicator sliceDiceIndicator, final int segmentId, final String fareBasis, final String bookingClassCode) {
        this.luggageAllowance = luggageAllowance;
        this.travelClass = travelClass;
        this.sliceDiceIndicator = sliceDiceIndicator;
        this.segmentId = segmentId;
        this.fareBasis = fareBasis;
        this.bookingClassCode = bookingClassCode;
    }

    /**
     * Obtiene el valor de la propiedad luggageAllowance.
     * 
     * @return
     *     possible object is
     *     {@link SearchLuggageAllowance }
     *     
     */
    public SearchLuggageAllowance getLuggageAllowance() {
        return luggageAllowance;
    }

    /**
     * Define el valor de la propiedad luggageAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLuggageAllowance }
     *     
     */
    public void setLuggageAllowance(SearchLuggageAllowance value) {
        this.luggageAllowance = value;
    }

    /**
     * Obtiene el valor de la propiedad travelClass.
     * 
     * @return
     *     possible object is
     *     {@link TravelClass }
     *     
     */
    public TravelClass getTravelClass() {
        return travelClass;
    }

    /**
     * Define el valor de la propiedad travelClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClass }
     *     
     */
    public void setTravelClass(TravelClass value) {
        this.travelClass = value;
    }

    /**
     * Obtiene el valor de la propiedad sliceDiceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SliceDiceIndicator }
     *     
     */
    public SliceDiceIndicator getSliceDiceIndicator() {
        return sliceDiceIndicator;
    }

    /**
     * Define el valor de la propiedad sliceDiceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SliceDiceIndicator }
     *     
     */
    public void setSliceDiceIndicator(SliceDiceIndicator value) {
        this.sliceDiceIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentId.
     * 
     */
    public int getSegmentId() {
        return segmentId;
    }

    /**
     * Define el valor de la propiedad segmentId.
     * 
     */
    public void setSegmentId(int value) {
        this.segmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad fareBasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Define el valor de la propiedad fareBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingClassCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClassCode() {
        return bookingClassCode;
    }

    /**
     * Define el valor de la propiedad bookingClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClassCode(String value) {
        this.bookingClassCode = value;
    }

}
