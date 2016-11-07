
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Detailed information about a stop somewhere at some location during a transport segment.
 * 
 * <p>Clase Java para Stop complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Stop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://ws.amadeus.fr/air}IataDetailedLocation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="arrivalDateTime" type="{http://ws.amadeus.fr/common}LocalDateTime" /&gt;
 *       &lt;attribute name="departureDateTime" type="{http://ws.amadeus.fr/common}LocalDateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stop", propOrder = {
    "location"
})
public class Stop {

    @XmlElement(required = true)
    protected IataDetailedLocation location;
    @XmlAttribute(name = "arrivalDateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlAttribute(name = "departureDateTime")
    protected XMLGregorianCalendar departureDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public Stop() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Stop(final IataDetailedLocation location, final XMLGregorianCalendar arrivalDateTime, final XMLGregorianCalendar departureDateTime) {
        this.location = location;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link IataDetailedLocation }
     *     
     */
    public IataDetailedLocation getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link IataDetailedLocation }
     *     
     */
    public void setLocation(IataDetailedLocation value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Define el valor de la propiedad arrivalDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Define el valor de la propiedad departureDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

}
