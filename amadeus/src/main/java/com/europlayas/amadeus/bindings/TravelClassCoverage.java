
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TravelClassCoverage.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelClassCoverage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOST_SEGMENTS"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_SEGMENT"/&gt;
 *     &lt;enumeration value="ALL_SEGMENTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelClassCoverage")
@XmlEnum
public enum TravelClassCoverage {

    MOST_SEGMENTS,
    AT_LEAST_ONE_SEGMENT,
    ALL_SEGMENTS;

    public String value() {
        return name();
    }

    public static TravelClassCoverage fromValue(String v) {
        return valueOf(v);
    }

}
