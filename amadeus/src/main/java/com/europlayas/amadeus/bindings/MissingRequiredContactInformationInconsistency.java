
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MissingRequiredContactInformationInconsistency.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MissingRequiredContactInformationInconsistency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTACT_INFORMATION_REQUIRED"/&gt;
 *     &lt;enumeration value="POSTAL_CODE_REQUIRED"/&gt;
 *     &lt;enumeration value="PHONE_NUMBER_REQUIRED"/&gt;
 *     &lt;enumeration value="INVOICE_ADDRESS_REQUIRED"/&gt;
 *     &lt;enumeration value="MAILING_ADDRESS_REQUIRED"/&gt;
 *     &lt;enumeration value="MOBILE_PHONE_NUMBER_REQUIRED"/&gt;
 *     &lt;enumeration value="PHONE_COUNTRY_CODE_REQUIRED"/&gt;
 *     &lt;enumeration value="EMAIL_ADDRESS_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MissingRequiredContactInformationInconsistency")
@XmlEnum
public enum MissingRequiredContactInformationInconsistency {

    CONTACT_INFORMATION_REQUIRED,
    POSTAL_CODE_REQUIRED,
    PHONE_NUMBER_REQUIRED,
    INVOICE_ADDRESS_REQUIRED,
    MAILING_ADDRESS_REQUIRED,
    MOBILE_PHONE_NUMBER_REQUIRED,
    PHONE_COUNTRY_CODE_REQUIRED,
    EMAIL_ADDRESS_REQUIRED;

    public String value() {
        return name();
    }

    public static MissingRequiredContactInformationInconsistency fromValue(String v) {
        return valueOf(v);
    }

}
