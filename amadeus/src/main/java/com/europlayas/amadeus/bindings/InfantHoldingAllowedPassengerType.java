
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfantHoldingAllowedPassengerType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InfantHoldingAllowedPassengerType"&gt;
 *   &lt;restriction base="{http://ws.amadeus.fr/air}PassengerType"&gt;
 *     &lt;enumeration value="ADULT"/&gt;
 *     &lt;enumeration value="SENIOR"/&gt;
 *     &lt;enumeration value="STUDENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InfantHoldingAllowedPassengerType")
@XmlEnum(PassengerType.class)
public enum InfantHoldingAllowedPassengerType {

    ADULT,
    SENIOR,
    STUDENT;

    public String value() {
        return name();
    }

    public static InfantHoldingAllowedPassengerType fromValue(String v) {
        return valueOf(v);
    }

}
