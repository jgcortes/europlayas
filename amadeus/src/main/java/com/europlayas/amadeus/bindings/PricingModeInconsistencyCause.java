
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PricingModeInconsistencyCause.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingModeInconsistencyCause"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISABLE_PRICING_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="INVALID_AIRLINE"/&gt;
 *     &lt;enumeration value="PASSENGER_OF_SAME_TYPE_MUST_HAVE_SAME_FARE"/&gt;
 *     &lt;enumeration value="PASSENGER_OF_SAME_TYPE_MUST_HAVE_SAME_FARE_OPTION_AND_FARE_BASIS"/&gt;
 *     &lt;enumeration value="MISSING_ITINERARY_IN_PRICING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PricingModeInconsistencyCause")
@XmlEnum
public enum PricingModeInconsistencyCause {

    DISABLE_PRICING_UNSUPPORTED,
    INVALID_AIRLINE,
    PASSENGER_OF_SAME_TYPE_MUST_HAVE_SAME_FARE,
    PASSENGER_OF_SAME_TYPE_MUST_HAVE_SAME_FARE_OPTION_AND_FARE_BASIS,
    MISSING_ITINERARY_IN_PRICING;

    public String value() {
        return name();
    }

    public static PricingModeInconsistencyCause fromValue(String v) {
        return valueOf(v);
    }

}
