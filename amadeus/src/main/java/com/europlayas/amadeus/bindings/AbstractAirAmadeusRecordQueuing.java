
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Amadeus GDS booking record queuing information.
 * 
 * <p>Clase Java para AbstractAirAmadeusRecordQueuing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AbstractAirAmadeusRecordQueuing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queue" type="{http://ws.amadeus.fr/air}AirAmadeusQueue"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="targetOfficeId" type="{http://ws.amadeus.fr/common}AmadeusOfficeId" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAirAmadeusRecordQueuing", propOrder = {
    "queue"
})
@XmlSeeAlso({
    ImmediateAmadeusRecordQueuing.class,
    DelayedAmadeusRecordQueuing.class
})
public abstract class AbstractAirAmadeusRecordQueuing {

    @XmlElement(required = true)
    protected AirAmadeusQueue queue;
    @XmlAttribute(name = "targetOfficeId")
    protected String targetOfficeId;

    /**
     * Default no-arg constructor
     * 
     */
    public AbstractAirAmadeusRecordQueuing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AbstractAirAmadeusRecordQueuing(final AirAmadeusQueue queue, final String targetOfficeId) {
        this.queue = queue;
        this.targetOfficeId = targetOfficeId;
    }

    /**
     * Obtiene el valor de la propiedad queue.
     * 
     * @return
     *     possible object is
     *     {@link AirAmadeusQueue }
     *     
     */
    public AirAmadeusQueue getQueue() {
        return queue;
    }

    /**
     * Define el valor de la propiedad queue.
     * 
     * @param value
     *     allowed object is
     *     {@link AirAmadeusQueue }
     *     
     */
    public void setQueue(AirAmadeusQueue value) {
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

}
