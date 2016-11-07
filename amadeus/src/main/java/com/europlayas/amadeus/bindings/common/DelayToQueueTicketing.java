
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Delay ticketing, until specified delay (a.k.a. TKTL). Can be used to place booking on hold. After the given delay, the booking is stored on a queue 
 * 
 * <p>Clase Java para DelayToQueueTicketing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DelayToQueueTicketing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}TicketingAgreement"&gt;
 *       &lt;attribute name="delay" use="required" type="{http://ws.amadeus.fr/common}TicketingAgreementDelay" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayToQueueTicketing")
public class DelayToQueueTicketing
    extends TicketingAgreement
{

    @XmlAttribute(name = "delay", required = true)
    protected Duration delay;

    /**
     * Default no-arg constructor
     * 
     */
    public DelayToQueueTicketing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DelayToQueueTicketing(final Duration delay) {
        super();
        this.delay = delay;
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
