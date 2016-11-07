
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Phone numbers with country code
 * 
 * <p>Clase Java para InternationalPhoneNumber complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InternationalPhoneNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="internationalCode" type="{http://ws.amadeus.fr/common}PhoneAreaCode" /&gt;
 *       &lt;attribute name="phoneNumber" use="required" type="{http://ws.amadeus.fr/common}PhoneNumber" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalPhoneNumber")
public class InternationalPhoneNumber {

    @XmlAttribute(name = "internationalCode")
    protected String internationalCode;
    @XmlAttribute(name = "phoneNumber", required = true)
    protected String phoneNumber;

    /**
     * Default no-arg constructor
     * 
     */
    public InternationalPhoneNumber() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InternationalPhoneNumber(final String internationalCode, final String phoneNumber) {
        this.internationalCode = internationalCode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Obtiene el valor de la propiedad internationalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalCode() {
        return internationalCode;
    }

    /**
     * Define el valor de la propiedad internationalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalCode(String value) {
        this.internationalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
