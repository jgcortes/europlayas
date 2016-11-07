
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Queue information to queue an Amadeus GDS booking recod with a delay or date
 * 
 * <p>Clase Java para DelayedAmadeusRecordQueuing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DelayedAmadeusRecordQueuing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AbstractAirAmadeusRecordQueuing"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remark" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="delay" type="{http://ws.amadeus.fr/air}Unsigned1To300Days"/&gt;
 *           &lt;element name="date" type="{http://ws.amadeus.fr/common}LocalDate"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayedAmadeusRecordQueuing", propOrder = {
    "remark",
    "delay",
    "date"
})
public class DelayedAmadeusRecordQueuing
    extends AbstractAirAmadeusRecordQueuing
{

    protected String remark;
    protected Duration delay;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Default no-arg constructor
     * 
     */
    public DelayedAmadeusRecordQueuing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DelayedAmadeusRecordQueuing(final AirAmadeusQueue queue, final String targetOfficeId, final String remark, final Duration delay, final XMLGregorianCalendar date) {
        super(queue, targetOfficeId);
        this.remark = remark;
        this.delay = delay;
        this.date = date;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Obtiene el valor de la propiedad delay.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Define el valor de la propiedad delay.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
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
