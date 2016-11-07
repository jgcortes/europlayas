
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemarkType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RemarkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENERAL_MISCELLANEOUS"/&gt;
 *     &lt;enumeration value="CONFIDENTIAL"/&gt;
 *     &lt;enumeration value="INVOICE"/&gt;
 *     &lt;enumeration value="QUALITY_CONTROL"/&gt;
 *     &lt;enumeration value="ALL_AIRLINES"/&gt;
 *     &lt;enumeration value="BACKOFFICE"/&gt;
 *     &lt;enumeration value="FULFILLMENT"/&gt;
 *     &lt;enumeration value="ITINERARY"/&gt;
 *     &lt;enumeration value="TICKETING_MISCELLANEOUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RemarkType")
@XmlEnum
public enum RemarkType {

    GENERAL_MISCELLANEOUS,
    CONFIDENTIAL,
    INVOICE,
    QUALITY_CONTROL,
    ALL_AIRLINES,
    BACKOFFICE,
    FULFILLMENT,
    ITINERARY,
    TICKETING_MISCELLANEOUS;

    public String value() {
        return name();
    }

    public static RemarkType fromValue(String v) {
        return valueOf(v);
    }

}
