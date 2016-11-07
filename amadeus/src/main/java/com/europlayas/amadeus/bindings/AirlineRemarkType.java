
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineRemarkType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AirlineRemarkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OSI"/&gt;
 *     &lt;enumeration value="SSR"/&gt;
 *     &lt;enumeration value="KEYWORD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AirlineRemarkType")
@XmlEnum
public enum AirlineRemarkType {

    OSI,
    SSR,
    KEYWORD;

    public String value() {
        return name();
    }

    public static AirlineRemarkType fromValue(String v) {
        return valueOf(v);
    }

}
