
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Contact information for a person.
 * 
 * <p>Clase Java para PersonalContactInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonalContactInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="residence" type="{http://ws.amadeus.fr/common}ResidencePostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="homePhoneNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="businessPhoneNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="emailAddress" type="{http://ws.amadeus.fr/common}EmailAddress" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalContactInformation", propOrder = {

})
public class PersonalContactInformation implements Serializable
{

    protected ResidencePostalAddress residence;
    protected InternationalPhoneNumber homePhoneNumber;
    protected InternationalPhoneNumber businessPhoneNumber;
    protected InternationalPhoneNumber mobilePhoneNumber;
    @XmlAttribute(name = "emailAddress")
    protected String emailAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public PersonalContactInformation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PersonalContactInformation(final ResidencePostalAddress residence, final InternationalPhoneNumber homePhoneNumber, final InternationalPhoneNumber businessPhoneNumber, final InternationalPhoneNumber mobilePhoneNumber, final String emailAddress) {
        this.residence = residence;
        this.homePhoneNumber = homePhoneNumber;
        this.businessPhoneNumber = businessPhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * Obtiene el valor de la propiedad residence.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePostalAddress }
     *     
     */
    public ResidencePostalAddress getResidence() {
        return residence;
    }

    /**
     * Define el valor de la propiedad residence.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePostalAddress }
     *     
     */
    public void setResidence(ResidencePostalAddress value) {
        this.residence = value;
    }

    /**
     * Obtiene el valor de la propiedad homePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Define el valor de la propiedad homePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setHomePhoneNumber(InternationalPhoneNumber value) {
        this.homePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    /**
     * Define el valor de la propiedad businessPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setBusinessPhoneNumber(InternationalPhoneNumber value) {
        this.businessPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Define el valor de la propiedad mobilePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setMobilePhoneNumber(InternationalPhoneNumber value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define el valor de la propiedad emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
