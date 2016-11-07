
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BookingClass complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingClass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="negoSpaceInfo" type="{http://ws.amadeus.fr/air}NegoSpaceInfo" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="bookingClassCode" use="required" type="{http://ws.amadeus.fr/air}BookingClassCode" /&gt;
 *       &lt;attribute name="numberOfBookableSeats" type="{http://ws.amadeus.fr/air}NumberOfBookableSeats" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingClass", propOrder = {

})
public class BookingClass {

    protected NegoSpaceInfo negoSpaceInfo;
    @XmlAttribute(name = "bookingClassCode", required = true)
    protected String bookingClassCode;
    @XmlAttribute(name = "numberOfBookableSeats")
    protected Short numberOfBookableSeats;

    /**
     * Default no-arg constructor
     * 
     */
    public BookingClass() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookingClass(final NegoSpaceInfo negoSpaceInfo, final String bookingClassCode, final Short numberOfBookableSeats) {
        this.negoSpaceInfo = negoSpaceInfo;
        this.bookingClassCode = bookingClassCode;
        this.numberOfBookableSeats = numberOfBookableSeats;
    }

    /**
     * Obtiene el valor de la propiedad negoSpaceInfo.
     * 
     * @return
     *     possible object is
     *     {@link NegoSpaceInfo }
     *     
     */
    public NegoSpaceInfo getNegoSpaceInfo() {
        return negoSpaceInfo;
    }

    /**
     * Define el valor de la propiedad negoSpaceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NegoSpaceInfo }
     *     
     */
    public void setNegoSpaceInfo(NegoSpaceInfo value) {
        this.negoSpaceInfo = value;
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

    /**
     * Obtiene el valor de la propiedad numberOfBookableSeats.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfBookableSeats() {
        return numberOfBookableSeats;
    }

    /**
     * Define el valor de la propiedad numberOfBookableSeats.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfBookableSeats(Short value) {
        this.numberOfBookableSeats = value;
    }

}
