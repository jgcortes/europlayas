
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TravelClass.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECONOMY"/&gt;
 *     &lt;enumeration value="PREMIUM_ECONOMY"/&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="FIRST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelClass")
@XmlEnum
public enum TravelClass {

    ECONOMY,
    PREMIUM_ECONOMY,
    BUSINESS,
    FIRST;

    public String value() {
        return name();
    }

    public static TravelClass fromValue(String v) {
        return valueOf(v);
    }

}
