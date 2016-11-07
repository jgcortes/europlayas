
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used where refund is restricted, or where other form of payment codes do not apply.
 * 
 * <p>Clase Java para NonRefundablePayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NonRefundablePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}DefaultablePaymentMethod"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonRefundablePayment")
public class NonRefundablePayment
    extends DefaultablePaymentMethod
{


    /**
     * Default no-arg constructor
     * 
     */
    public NonRefundablePayment() {
        super();
    }

}
