
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Delay ticketing, until unspecified delay (a.k.a. TKXL). Can be used to place booking on hold.  After the given delay, the booking is cancelled.
 * 
 * <p>Clase Java para DelayToCancelTicketing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DelayToCancelTicketing"&gt;
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
@XmlType(name = "DelayToCancelTicketing")
public class DelayToCancelTicketing
    extends TicketingAgreement
    implements Serializable
{

    @XmlAttribute(name = "delay", required = true)
    protected Duration delay;

    /**
     * Default no-arg constructor
     * 
     */
    public DelayToCancelTicketing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DelayToCancelTicketing(final Duration delay) {
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
