
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonalInformationInconsistency.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalInformationInconsistency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_BORN_YET"/&gt;
 *     &lt;enumeration value="TOO_OLD"/&gt;
 *     &lt;enumeration value="TOO_YOUNG"/&gt;
 *     &lt;enumeration value="FIRST_NAME_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="MIDDLE_NAME_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="SURNAME_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="NAMES_REQUIRE_TRUNCATION"/&gt;
 *     &lt;enumeration value="FULL_NAME_TOO_LONG"/&gt;
 *     &lt;enumeration value="PASSPORT_EXPIRED"/&gt;
 *     &lt;enumeration value="PASSPORT_NOT_ISSUED_YET"/&gt;
 *     &lt;enumeration value="REDRESS_NUMBER_NOT_ISSUED_YET"/&gt;
 *     &lt;enumeration value="RESIDENCE_REQUIRED"/&gt;
 *     &lt;enumeration value="RESIDENCE_ADDRESS_LINE_1_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="RESIDENCE_CITY_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="RESIDENCE_STATE_OR_PROVINCE_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="LOYALTY_PROGRAM_NUMBER_INVALID_FORMAT"/&gt;
 *     &lt;enumeration value="LOYALTY_PROGRAM_USED_BY_SEVERAL_PASSENGERS"/&gt;
 *     &lt;enumeration value="DISCOUNT_NUMBER_INVALID_FORMAT"/&gt;
 *     &lt;enumeration value="DISCOUNT_USED_BY_SEVERAL_PASSENGERS"/&gt;
 *     &lt;enumeration value="FORM_OF_IDENTIFICATION_REQUIRED"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_COMBINED_DISCOUNT_REQUIRED"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_METROPOLITAN_DISCOUNT_REQUIRED"/&gt;
 *     &lt;enumeration value="AIR_FRANCE_DOM_DISCOUNT_REQUIRED"/&gt;
 *     &lt;enumeration value="SPANISH_RESIDENT_DISCOUNT_REQUIRED"/&gt;
 *     &lt;enumeration value="DATE_OF_BIRTH_REQUIRED"/&gt;
 *     &lt;enumeration value="GENDER_REQUIRED"/&gt;
 *     &lt;enumeration value="PHONE_NUMBER_CONTAINS_INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="PASSPORT_REQUIRED"/&gt;
 *     &lt;enumeration value="PASSPORT_CITY_ISSUANCE_REQUIRED"/&gt;
 *     &lt;enumeration value="PHONE_COUNTRY_CODE_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonalInformationInconsistency")
@XmlEnum
public enum PersonalInformationInconsistency {

    NOT_BORN_YET,
    TOO_OLD,
    TOO_YOUNG,
    FIRST_NAME_CONTAINS_INVALID_CHARACTERS,
    MIDDLE_NAME_CONTAINS_INVALID_CHARACTERS,
    SURNAME_CONTAINS_INVALID_CHARACTERS,
    NAMES_REQUIRE_TRUNCATION,
    FULL_NAME_TOO_LONG,
    PASSPORT_EXPIRED,
    PASSPORT_NOT_ISSUED_YET,
    REDRESS_NUMBER_NOT_ISSUED_YET,
    RESIDENCE_REQUIRED,
    RESIDENCE_ADDRESS_LINE_1_CONTAINS_INVALID_CHARACTERS,
    RESIDENCE_CITY_CONTAINS_INVALID_CHARACTERS,
    RESIDENCE_STATE_OR_PROVINCE_CONTAINS_INVALID_CHARACTERS,
    LOYALTY_PROGRAM_NUMBER_INVALID_FORMAT,
    LOYALTY_PROGRAM_USED_BY_SEVERAL_PASSENGERS,
    DISCOUNT_NUMBER_INVALID_FORMAT,
    DISCOUNT_USED_BY_SEVERAL_PASSENGERS,
    FORM_OF_IDENTIFICATION_REQUIRED,
    AIR_FRANCE_COMBINED_DISCOUNT_REQUIRED,
    AIR_FRANCE_METROPOLITAN_DISCOUNT_REQUIRED,
    AIR_FRANCE_DOM_DISCOUNT_REQUIRED,
    SPANISH_RESIDENT_DISCOUNT_REQUIRED,
    DATE_OF_BIRTH_REQUIRED,
    GENDER_REQUIRED,
    PHONE_NUMBER_CONTAINS_INVALID_CHARACTERS,
    PASSPORT_REQUIRED,
    PASSPORT_CITY_ISSUANCE_REQUIRED,
    PHONE_COUNTRY_CODE_REQUIRED;

    public String value() {
        return name();
    }

    public static PersonalInformationInconsistency fromValue(String v) {
        return valueOf(v);
    }

}
