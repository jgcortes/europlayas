
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Postal Address.
 * 
 * <p>Clase Java para PostalAddress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://ws.amadeus.fr/common}String1To20" /&gt;
 *       &lt;attribute name="company" type="{http://ws.amadeus.fr/common}String1To20" /&gt;
 *       &lt;attribute name="addressLine1" use="required" type="{http://ws.amadeus.fr/common}AddressLine" /&gt;
 *       &lt;attribute name="addressLine2" type="{http://ws.amadeus.fr/common}AddressLine" /&gt;
 *       &lt;attribute name="city" use="required" type="{http://ws.amadeus.fr/common}String1To35" /&gt;
 *       &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
 *       &lt;attribute name="stateOrProvince" type="{http://ws.amadeus.fr/common}String1To35" /&gt;
 *       &lt;attribute name="postalCode" type="{http://ws.amadeus.fr/common}String1To17" /&gt;
 *       &lt;attribute name="postalBox" type="{http://ws.amadeus.fr/common}String1To10" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress")
@XmlSeeAlso({
    NamedPostalAddress.class,
    ResidencePostalAddress.class
})
public class PostalAddress {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "company")
    protected String company;
    @XmlAttribute(name = "addressLine1", required = true)
    protected String addressLine1;
    @XmlAttribute(name = "addressLine2")
    protected String addressLine2;
    @XmlAttribute(name = "city", required = true)
    protected String city;
    @XmlAttribute(name = "countryCode", required = true)
    protected CountryCode countryCode;
    @XmlAttribute(name = "stateOrProvince")
    protected String stateOrProvince;
    @XmlAttribute(name = "postalCode")
    protected String postalCode;
    @XmlAttribute(name = "postalBox")
    protected String postalBox;

    /**
     * Default no-arg constructor
     * 
     */
    public PostalAddress() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PostalAddress(final String name, final String company, final String addressLine1, final String addressLine2, final String city, final CountryCode countryCode, final String stateOrProvince, final String postalCode, final String postalBox) {
        this.name = name;
        this.company = company;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.countryCode = countryCode;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.postalBox = postalBox;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad addressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Define el valor de la propiedad addressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Obtiene el valor de la propiedad addressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Define el valor de la propiedad addressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad stateOrProvince.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Define el valor de la propiedad stateOrProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad postalBox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalBox() {
        return postalBox;
    }

    /**
     * Define el valor de la propiedad postalBox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalBox(String value) {
        this.postalBox = value;
    }

}
