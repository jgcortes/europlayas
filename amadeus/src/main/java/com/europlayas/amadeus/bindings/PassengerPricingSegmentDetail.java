
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * For a specific passenger, pricing information to be defined for each segment.
 * 
 * <p>Clase Java para PassengerPricingSegmentDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerPricingSegmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://ws.amadeus.fr/air}SegmentDetailAttribute"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerPricingSegmentDetail")
public class PassengerPricingSegmentDetail {

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
    public PassengerPricingSegmentDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerPricingSegmentDetail(final int segmentId, final String fareBasis, final String bookingClassCode) {
        this.segmentId = segmentId;
        this.fareBasis = fareBasis;
        this.bookingClassCode = bookingClassCode;
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
