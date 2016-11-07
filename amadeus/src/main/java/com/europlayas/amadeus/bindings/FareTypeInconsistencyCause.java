
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FareTypeInconsistencyCause.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FareTypeInconsistencyCause"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_FARE_TYPE_ALLOWED"/&gt;
 *     &lt;enumeration value="UNDEFINED_CORPORATE_CODE"/&gt;
 *     &lt;enumeration value="PUBLISHED_FARES_MANDATORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareTypeInconsistencyCause")
@XmlEnum
public enum FareTypeInconsistencyCause {

    NO_FARE_TYPE_ALLOWED,
    UNDEFINED_CORPORATE_CODE,
    PUBLISHED_FARES_MANDATORY;

    public String value() {
        return name();
    }

    public static FareTypeInconsistencyCause fromValue(String v) {
        return valueOf(v);
    }

}
