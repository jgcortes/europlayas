
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TimeRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimeRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="time" use="required" type="{http://ws.amadeus.fr/common}LocalTime" /&gt;
 *       &lt;attribute name="extraHoursAround" type="{http://ws.amadeus.fr/common}Unsigned1To12HoursDuration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeRange")
public class TimeRange implements Serializable
{

    @XmlAttribute(name = "time", required = true)
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "extraHoursAround")
    protected Duration extraHoursAround;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeRange() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeRange(final XMLGregorianCalendar time, final Duration extraHoursAround) {
        this.time = time;
        this.extraHoursAround = extraHoursAround;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad extraHoursAround.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExtraHoursAround() {
        return extraHoursAround;
    }

    /**
     * Define el valor de la propiedad extraHoursAround.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExtraHoursAround(Duration value) {
        this.extraHoursAround = value;
    }

}
