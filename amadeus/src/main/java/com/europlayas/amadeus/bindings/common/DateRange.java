
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DateRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="extraDaysBeforeOrAfter" type="{http://ws.amadeus.fr/common}YearMonthDayDuration" form="unqualified"/&gt;
 *         &lt;element name="extraDaysAround" type="{http://ws.amadeus.fr/common}UnsignedYearMonthDayDuration" form="unqualified"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRange", propOrder = {
    "extraDaysBeforeOrAfter",
    "extraDaysAround"
})
public class DateRange {

    @XmlElement(namespace = "")
    protected Duration extraDaysBeforeOrAfter;
    @XmlElement(namespace = "")
    protected Duration extraDaysAround;
    @XmlAttribute(name = "date", required = true)
    protected XMLGregorianCalendar date;

    /**
     * Default no-arg constructor
     * 
     */
    public DateRange() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DateRange(final Duration extraDaysBeforeOrAfter, final Duration extraDaysAround, final XMLGregorianCalendar date) {
        this.extraDaysBeforeOrAfter = extraDaysBeforeOrAfter;
        this.extraDaysAround = extraDaysAround;
        this.date = date;
    }

    /**
     * Obtiene el valor de la propiedad extraDaysBeforeOrAfter.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExtraDaysBeforeOrAfter() {
        return extraDaysBeforeOrAfter;
    }

    /**
     * Define el valor de la propiedad extraDaysBeforeOrAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExtraDaysBeforeOrAfter(Duration value) {
        this.extraDaysBeforeOrAfter = value;
    }

    /**
     * Obtiene el valor de la propiedad extraDaysAround.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExtraDaysAround() {
        return extraDaysAround;
    }

    /**
     * Define el valor de la propiedad extraDaysAround.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExtraDaysAround(Duration value) {
        this.extraDaysAround = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
