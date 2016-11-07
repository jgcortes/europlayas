
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.PaymentCard;


/**
 * Payment by single use virtual card.
 * 
 * <p>Clase Java para SingleUseVirtualCardPayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SingleUseVirtualCardPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}PaymentMethod"&gt;
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
@XmlType(name = "SingleUseVirtualCardPayment", propOrder = {
    "card"
})
public class SingleUseVirtualCardPayment
    extends PaymentMethod
{

    @XmlElement(required = true)
    protected PaymentCard card;

    /**
     * Default no-arg constructor
     * 
     */
    public SingleUseVirtualCardPayment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SingleUseVirtualCardPayment(final PaymentCard card) {
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
