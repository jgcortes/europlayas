
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItineraryInconsistencyCause.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ItineraryInconsistencyCause"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOO_MANY_ITINERARIES"/&gt;
 *     &lt;enumeration value="INVALID_ITINERARY"/&gt;
 *     &lt;enumeration value="ITINERARY_NOT_FOUND"/&gt;
 *     &lt;enumeration value="INVALID_AIRLINE"/&gt;
 *     &lt;enumeration value="OPERATING_AIRLINE_MANDATORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItineraryInconsistencyCause")
@XmlEnum
public enum ItineraryInconsistencyCause {

    TOO_MANY_ITINERARIES,
    INVALID_ITINERARY,
    ITINERARY_NOT_FOUND,
    INVALID_AIRLINE,
    OPERATING_AIRLINE_MANDATORY;

    public String value() {
        return name();
    }

    public static ItineraryInconsistencyCause fromValue(String v) {
        return valueOf(v);
    }

}
