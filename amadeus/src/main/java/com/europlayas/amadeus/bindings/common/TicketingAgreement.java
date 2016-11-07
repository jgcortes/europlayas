
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of ticketing agreement (a.k.a. TKOK, TKXL, TKTL, etc.).
 * 
 * <p>Clase Java para TicketingAgreement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TicketingAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingAgreement")
@XmlSeeAlso({
    ConfirmTicketing.class,
    DelayToCancelTicketing.class,
    DelayToQueueTicketing.class
})
public abstract class TicketingAgreement {


    /**
     * Default no-arg constructor
     * 
     */
    public TicketingAgreement() {
        super();
    }

}
