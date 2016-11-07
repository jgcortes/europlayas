
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PassengerType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADULT"/&gt;
 *     &lt;enumeration value="CHILD"/&gt;
 *     &lt;enumeration value="SENIOR"/&gt;
 *     &lt;enumeration value="YOUNG"/&gt;
 *     &lt;enumeration value="INFANT"/&gt;
 *     &lt;enumeration value="STUDENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerType")
@XmlEnum
public enum PassengerType {

    ADULT,
    CHILD,
    SENIOR,
    YOUNG,
    INFANT,
    STUDENT;

    public String value() {
        return name();
    }

    public static PassengerType fromValue(String v) {
        return valueOf(v);
    }

}
