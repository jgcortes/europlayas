
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SeatPosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AISLE"/&gt;
 *     &lt;enumeration value="BULKHEAD"/&gt;
 *     &lt;enumeration value="WINDOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeatPosition")
@XmlEnum
public enum SeatPosition {

    AISLE,
    BULKHEAD,
    WINDOW;

    public String value() {
        return name();
    }

    public static SeatPosition fromValue(String v) {
        return valueOf(v);
    }

}
