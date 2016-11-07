
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConnectionPointType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCLUDED"/&gt;
 *     &lt;enumeration value="EXCLUDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectionPointType")
@XmlEnum
public enum ConnectionPointType {

    INCLUDED,
    EXCLUDED;

    public String value() {
        return name();
    }

    public static ConnectionPointType fromValue(String v) {
        return valueOf(v);
    }

}
