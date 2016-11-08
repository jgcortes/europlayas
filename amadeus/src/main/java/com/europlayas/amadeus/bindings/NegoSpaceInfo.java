
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NegoSpaceInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NegoSpaceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="negotiatedSpaceMode" use="required" type="{http://ws.amadeus.fr/air}NegotiatedSpaceType" /&gt;
 *       &lt;attribute name="numberOfRemainingSeats" use="required" type="{http://ws.amadeus.fr/common}Unsigned1To100Byte" /&gt;
 *       &lt;attribute name="tourName"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="15"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tourReference"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="40"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegoSpaceInfo")
public class NegoSpaceInfo implements Serializable
{

    @XmlAttribute(name = "negotiatedSpaceMode", required = true)
    protected NegotiatedSpaceType negotiatedSpaceMode;
    @XmlAttribute(name = "numberOfRemainingSeats", required = true)
    protected short numberOfRemainingSeats;
    @XmlAttribute(name = "tourName")
    protected String tourName;
    @XmlAttribute(name = "tourReference")
    protected String tourReference;

    /**
     * Default no-arg constructor
     * 
     */
    public NegoSpaceInfo() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NegoSpaceInfo(final NegotiatedSpaceType negotiatedSpaceMode, final short numberOfRemainingSeats, final String tourName, final String tourReference) {
        this.negotiatedSpaceMode = negotiatedSpaceMode;
        this.numberOfRemainingSeats = numberOfRemainingSeats;
        this.tourName = tourName;
        this.tourReference = tourReference;
    }

    /**
     * Obtiene el valor de la propiedad negotiatedSpaceMode.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedSpaceType }
     *     
     */
    public NegotiatedSpaceType getNegotiatedSpaceMode() {
        return negotiatedSpaceMode;
    }

    /**
     * Define el valor de la propiedad negotiatedSpaceMode.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedSpaceType }
     *     
     */
    public void setNegotiatedSpaceMode(NegotiatedSpaceType value) {
        this.negotiatedSpaceMode = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfRemainingSeats.
     * 
     */
    public short getNumberOfRemainingSeats() {
        return numberOfRemainingSeats;
    }

    /**
     * Define el valor de la propiedad numberOfRemainingSeats.
     * 
     */
    public void setNumberOfRemainingSeats(short value) {
        this.numberOfRemainingSeats = value;
    }

    /**
     * Obtiene el valor de la propiedad tourName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Define el valor de la propiedad tourName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourName(String value) {
        this.tourName = value;
    }

    /**
     * Obtiene el valor de la propiedad tourReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourReference() {
        return tourReference;
    }

    /**
     * Define el valor de la propiedad tourReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourReference(String value) {
        this.tourReference = value;
    }

}
