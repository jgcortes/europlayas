
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpanishResidentPassengerType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SpanishResidentPassengerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPANISH_CITIZEN"/&gt;
 *     &lt;enumeration value="EUROPEAN_CITIZEN"/&gt;
 *     &lt;enumeration value="GOVERNMENT_WORKER"/&gt;
 *     &lt;enumeration value="MILITARY"/&gt;
 *     &lt;enumeration value="MINOR_WITHOUT_ID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpanishResidentPassengerType")
@XmlEnum
public enum SpanishResidentPassengerType {


    /**
     * Adult resident with National identity card (DNI).
     * 
     */
    SPANISH_CITIZEN,

    /**
     * Foreign resident, whose nationality belongs to a European country.
     * 
     */
    EUROPEAN_CITIZEN,

    /**
     * Foreign resident, whose nationality belongs to a European country.
     * 
     */
    GOVERNMENT_WORKER,

    /**
     * Temporary residents, military.
     * 
     */
    MILITARY,

    /**
     * Minor residents without Identity card (DNI).
     * 
     */
    MINOR_WITHOUT_ID;

    public String value() {
        return name();
    }

    public static SpanishResidentPassengerType fromValue(String v) {
        return valueOf(v);
    }

}
