
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OriginDestinationInconsistencyCause.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OriginDestinationInconsistencyCause"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN_LOCATION"/&gt;
 *     &lt;enumeration value="PAST_DATE_TIME"/&gt;
 *     &lt;enumeration value="DATE_TIME_TOO_FAR"/&gt;
 *     &lt;enumeration value="DATES_TIMES_NOT_ORDERED_CHRONOLOGICALLY"/&gt;
 *     &lt;enumeration value="TOO_MANY_ORIGIN_DESTINATIONS"/&gt;
 *     &lt;enumeration value="OVERLAPPING_ORIGIN_DESTINATION_LOCATIONS"/&gt;
 *     &lt;enumeration value="REQUEST_NOT_ELIGIBLE_TO_ONE_WAY_COMBINABLE"/&gt;
 *     &lt;enumeration value="CRITERIA_NOT_COMPATIBLE_WITH_COMPLEX_JOURNEY_SEARCH"/&gt;
 *     &lt;enumeration value="INVALID_ORIGIN_DESTINATIONS"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_ARRIVAL_DATE_TIME"/&gt;
 *     &lt;enumeration value="NEGOCIATED_SPACE_NOT_COMPATIBLE_WITH_ARRIVAL_DATE_TIME_JOURNEY_SEARCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OriginDestinationInconsistencyCause")
@XmlEnum
public enum OriginDestinationInconsistencyCause {

    UNKNOWN_LOCATION,
    PAST_DATE_TIME,
    DATE_TIME_TOO_FAR,
    DATES_TIMES_NOT_ORDERED_CHRONOLOGICALLY,
    TOO_MANY_ORIGIN_DESTINATIONS,
    OVERLAPPING_ORIGIN_DESTINATION_LOCATIONS,
    REQUEST_NOT_ELIGIBLE_TO_ONE_WAY_COMBINABLE,
    CRITERIA_NOT_COMPATIBLE_WITH_COMPLEX_JOURNEY_SEARCH,
    INVALID_ORIGIN_DESTINATIONS,
    UNSUPPORTED_ARRIVAL_DATE_TIME,
    NEGOCIATED_SPACE_NOT_COMPATIBLE_WITH_ARRIVAL_DATE_TIME_JOURNEY_SEARCH;

    public String value() {
        return name();
    }

    public static OriginDestinationInconsistencyCause fromValue(String v) {
        return valueOf(v);
    }

}
