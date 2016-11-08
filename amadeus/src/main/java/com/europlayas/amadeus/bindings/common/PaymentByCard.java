
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment by card.
 * 
 * <p>Clase Java para PaymentByCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentByCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}PaymentMethod"&gt;
 *       &lt;all&gt;
 *         &lt;element name="card" type="{http://ws.amadeus.fr/common}PaymentCard"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentByCard", propOrder = {
    "card"
})
public class PaymentByCard
    extends PaymentMethod
    implements Serializable
{

    @XmlElement(required = true)
    protected PaymentCard card;

    /**
     * Default no-arg constructor
     * 
     */
    public PaymentByCard() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PaymentByCard(final PaymentCard card) {
        super();
        this.card = card;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setCard(PaymentCard value) {
        this.card = value;
    }

}
