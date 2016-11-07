
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Amadeus GDS booking record queuing information.
 * 
 * <p>Clase Java para AmadeusRecordQueuing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmadeusRecordQueuing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="queue" type="{http://ws.amadeus.fr/common}AmadeusQueue"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="targetOfficeId" type="{http://ws.amadeus.fr/common}AmadeusOfficeId" /&gt;
 *       &lt;attribute name="useTargetAsQueuingOfficeId" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="delay" type="{http://ws.amadeus.fr/common}Unsigned0To31DaysDuration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmadeusRecordQueuing", propOrder = {

})
public class AmadeusRecordQueuing {

    @XmlElement(required = true)
    protected AmadeusQueue queue;
    @XmlAttribute(name = "targetOfficeId")
    protected String targetOfficeId;
    @XmlAttribute(name = "useTargetAsQueuingOfficeId")
    protected Boolean useTargetAsQueuingOfficeId;
    @XmlAttribute(name = "delay")
    protected Duration delay;

    /**
     * Default no-arg constructor
     * 
     */
    public AmadeusRecordQueuing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AmadeusRecordQueuing(final AmadeusQueue queue, final String targetOfficeId, final Boolean useTargetAsQueuingOfficeId, final Duration delay) {
        this.queue = queue;
        this.targetOfficeId = targetOfficeId;
        this.useTargetAsQueuingOfficeId = useTargetAsQueuingOfficeId;
        this.delay = delay;
    }

    /**
     * Obtiene el valor de la propiedad queue.
     * 
     * @return
     *     possible object is
     *     {@link AmadeusQueue }
     *     
     */
    public AmadeusQueue getQueue() {
        return queue;
    }

    /**
     * Define el valor de la propiedad queue.
     * 
     * @param value
     *     allowed object is
     *     {@link AmadeusQueue }
     *     
     */
    public void setQueue(AmadeusQueue value) {
        this.queue = value;
    }

    /**
     * Obtiene el valor de la propiedad targetOfficeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOfficeId() {
        return targetOfficeId;
    }

    /**
     * Define el valor de la propiedad targetOfficeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOfficeId(String value) {
        this.targetOfficeId = value;
    }

    /**
     * Obtiene el valor de la propiedad useTargetAsQueuingOfficeId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTargetAsQueuingOfficeId() {
        return useTargetAsQueuingOfficeId;
    }

    /**
     * Define el valor de la propiedad useTargetAsQueuingOfficeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTargetAsQueuingOfficeId(Boolean value) {
        this.useTargetAsQueuingOfficeId = value;
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
