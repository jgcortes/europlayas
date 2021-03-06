
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardFeeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CardFeeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIXED"/&gt;
 *     &lt;enumeration value="VARIABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardFeeType")
@XmlEnum
public enum CardFeeType {

    FIXED,
    VARIABLE;

    public String value() {
        return name();
    }

    public static CardFeeType fromValue(String v) {
        return valueOf(v);
    }

}
