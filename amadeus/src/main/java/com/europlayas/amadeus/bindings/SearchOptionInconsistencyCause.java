
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchOptionInconsistencyCause.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchOptionInconsistencyCause"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEARCH_WITH_ADDITIONAL_SERVICES_NOT_PERMITTED"/&gt;
 *     &lt;enumeration value="SEARCH_BY_FREE_BAGAGE_ALLOWANCE_NOT_PERMITTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchOptionInconsistencyCause")
@XmlEnum
public enum SearchOptionInconsistencyCause {

    SEARCH_WITH_ADDITIONAL_SERVICES_NOT_PERMITTED,
    SEARCH_BY_FREE_BAGAGE_ALLOWANCE_NOT_PERMITTED;

    public String value() {
        return name();
    }

    public static SearchOptionInconsistencyCause fromValue(String v) {
        return valueOf(v);
    }

}
