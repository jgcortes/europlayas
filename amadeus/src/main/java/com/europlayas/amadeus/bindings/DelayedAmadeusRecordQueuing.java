
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import com.europlayas.amadeus.util.DateAdapter;


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
    "date",
    "delay"
})
public class DelayedAmadeusRecordQueuing
    extends AbstractAirAmadeusRecordQueuing
    implements Serializable
{

    protected String remark;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    protected Duration delay;

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
    public DelayedAmadeusRecordQueuing(final AirAmadeusQueue queue, final String targetOfficeId, final String remark, final LocalDate date, final Duration delay) {
        super(queue, targetOfficeId);
        this.remark = remark;
        this.date = date;
        this.delay = delay;
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
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(LocalDate value) {
        this.date = value;
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

}
