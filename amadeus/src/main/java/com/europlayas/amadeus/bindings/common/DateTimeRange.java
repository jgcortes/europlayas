
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific local date or range of local dates, at a single specific local time or during a local time window when applicable.
 * 
 * <p>Clase Java para DateTimeRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateTimeRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateRange" type="{http://ws.amadeus.fr/common}DateRange" form="unqualified"/&gt;
 *         &lt;element name="timeRange" type="{http://ws.amadeus.fr/common}TimeRange" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeRange", propOrder = {
    "dateRange",
    "timeRange"
})
public class DateTimeRange implements Serializable
{

    @XmlElement(namespace = "", required = true)
    protected DateRange dateRange;
    @XmlElement(namespace = "")
    protected TimeRange timeRange;

    /**
     * Default no-arg constructor
     * 
     */
    public DateTimeRange() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DateTimeRange(final DateRange dateRange, final TimeRange timeRange) {
        this.dateRange = dateRange;
        this.timeRange = timeRange;
    }

    /**
     * Obtiene el valor de la propiedad dateRange.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Define el valor de la propiedad dateRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateRange(DateRange value) {
        this.dateRange = value;
    }

    /**
     * Obtiene el valor de la propiedad timeRange.
     * 
     * @return
     *     possible object is
     *     {@link TimeRange }
     *     
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Define el valor de la propiedad timeRange.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRange }
     *     
     */
    public void setTimeRange(TimeRange value) {
        this.timeRange = value;
    }

}
