
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SegmentDetailInconsistency.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SegmentDetailInconsistency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOOKING_CLASS_CODE_REQUIRED"/&gt;
 *     &lt;enumeration value="FARE_BASIS_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SegmentDetailInconsistency")
@XmlEnum
public enum SegmentDetailInconsistency {

    BOOKING_CLASS_CODE_REQUIRED,
    FARE_BASIS_REQUIRED;

    public String value() {
        return name();
    }

    public static SegmentDetailInconsistency fromValue(String v) {
        return valueOf(v);
    }

}
