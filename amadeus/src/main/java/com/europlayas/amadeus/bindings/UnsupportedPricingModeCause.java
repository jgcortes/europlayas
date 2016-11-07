
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnsupportedPricingModeCause.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="UnsupportedPricingModeCause"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASIC_PRICING_MODE_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="EXPERT_PRICING_MODE_UNSUPPORTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnsupportedPricingModeCause")
@XmlEnum
public enum UnsupportedPricingModeCause {

    BASIC_PRICING_MODE_UNSUPPORTED,
    EXPERT_PRICING_MODE_UNSUPPORTED;

    public String value() {
        return name();
    }

    public static UnsupportedPricingModeCause fromValue(String v) {
        return valueOf(v);
    }

}
