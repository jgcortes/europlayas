
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchOption.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TICKET_AVAILIBILITY_PRE_CHECK"/&gt;
 *     &lt;enumeration value="MULTIPLE_RECORDS"/&gt;
 *     &lt;enumeration value="RETURN_TO_DEPARTURE_AIRPORT"/&gt;
 *     &lt;enumeration value="TRAVEL_CLASS_COVERAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchOption")
@XmlEnum
public enum SearchOption {

    TICKET_AVAILIBILITY_PRE_CHECK,
    MULTIPLE_RECORDS,
    RETURN_TO_DEPARTURE_AIRPORT,
    TRAVEL_CLASS_COVERAGE;

    public String value() {
        return name();
    }

    public static SearchOption fromValue(String v) {
        return valueOf(v);
    }

}
