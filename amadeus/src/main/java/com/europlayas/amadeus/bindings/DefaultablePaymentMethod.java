
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment method that can be set by default.
 * 
 * <p>Clase Java para DefaultablePaymentMethod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DefaultablePaymentMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}PaymentMethod"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultablePaymentMethod")
@XmlSeeAlso({
    CashPayment.class,
    PaymentOnAccount.class,
    PaymentByCheck.class,
    NonRefundablePayment.class
})
public abstract class DefaultablePaymentMethod
    extends PaymentMethod
{


    /**
     * Default no-arg constructor
     * 
     */
    public DefaultablePaymentMethod() {
        super();
    }

}
