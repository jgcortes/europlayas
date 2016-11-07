
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Provider.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Provider"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMADEUS"/&gt;
 *     &lt;enumeration value="TRAVELFUSION"/&gt;
 *     &lt;enumeration value="LCRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Provider")
@XmlEnum
public enum Provider {

    AMADEUS,
    TRAVELFUSION,
    LCRS;

    public String value() {
        return name();
    }

    public static Provider fromValue(String v) {
        return valueOf(v);
    }

}
