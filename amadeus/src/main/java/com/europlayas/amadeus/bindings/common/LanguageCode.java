
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LanguageCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="zh"/&gt;
 *     &lt;enumeration value="ja"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageCode")
@XmlEnum
public enum LanguageCode {

    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("zh")
    ZH("zh"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("pl")
    PL("pl");
    private final String value;

    LanguageCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageCode fromValue(String v) {
        for (LanguageCode c: LanguageCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
