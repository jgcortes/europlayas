
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentCardBrand.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCardBrand"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="AMERICAN_EXPRESS"/&gt;
 *     &lt;enumeration value="MASTERCARD_EUROCARD"/&gt;
 *     &lt;enumeration value="VISA_ELECTRON"/&gt;
 *     &lt;enumeration value="VISA_DEBIT"/&gt;
 *     &lt;enumeration value="MASTERCARD_DEBIT"/&gt;
 *     &lt;enumeration value="MAESTRO"/&gt;
 *     &lt;enumeration value="DINERS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardBrand")
@XmlEnum
public enum PaymentCardBrand {

    VISA,
    AMERICAN_EXPRESS,
    MASTERCARD_EUROCARD,
    VISA_ELECTRON,
    VISA_DEBIT,
    MASTERCARD_DEBIT,
    MAESTRO,
    DINERS;

    public String value() {
        return name();
    }

    public static PaymentCardBrand fromValue(String v) {
        return valueOf(v);
    }

}
