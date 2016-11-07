
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnusedLowFareSearchParameter.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="UnusedLowFareSearchParameter"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DATE_TIME_RANGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnusedLowFareSearchParameter")
@XmlEnum
public enum UnusedLowFareSearchParameter {

    DATE_TIME_RANGE;

    public String value() {
        return name();
    }

    public static UnusedLowFareSearchParameter fromValue(String v) {
        return valueOf(v);
    }

}
