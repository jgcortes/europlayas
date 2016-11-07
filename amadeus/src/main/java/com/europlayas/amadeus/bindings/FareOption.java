
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FareOption.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FareOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="INCLUSIVE_TOUR"/&gt;
 *     &lt;enumeration value="SPANISH_MELILLA_RESIDENT"/&gt;
 *     &lt;enumeration value="SPANISH_CEUTA_RESIDENT"/&gt;
 *     &lt;enumeration value="SPANISH_CANARY_RESIDENT"/&gt;
 *     &lt;enumeration value="SPANISH_BALEARIC_RESIDENT"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_METROPOLITAN_DISCOUNT_PASS"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_DOM_DISCOUNT_PASS"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_COMBINED_DISCOUNT_PASS"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_FAMILY"/&gt;
 *     &lt;enumeration value="ADULT_WITH_COMPANION"/&gt;
 *     &lt;enumeration value="COMPANION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareOption")
@XmlEnum
public enum FareOption {

    STANDARD,
    INCLUSIVE_TOUR,
    SPANISH_MELILLA_RESIDENT,
    SPANISH_CEUTA_RESIDENT,
    SPANISH_CANARY_RESIDENT,
    SPANISH_BALEARIC_RESIDENT,
    AIR_FRANCE_METROPOLITAN_DISCOUNT_PASS,
    AIR_FRANCE_DOM_DISCOUNT_PASS,
    AIR_FRANCE_COMBINED_DISCOUNT_PASS,
    AIR_FRANCE_FAMILY,
    ADULT_WITH_COMPANION,
    COMPANION;

    public String value() {
        return name();
    }

    public static FareOption fromValue(String v) {
        return valueOf(v);
    }

}
