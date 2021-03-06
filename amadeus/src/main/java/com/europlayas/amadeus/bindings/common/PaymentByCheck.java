
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment by check.
 * 
 * <p>Clase Java para PaymentByCheck complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentByCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}DefaultablePaymentMethod"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentByCheck")
public class PaymentByCheck
    extends DefaultablePaymentMethod
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public PaymentByCheck() {
        super();
    }

}
