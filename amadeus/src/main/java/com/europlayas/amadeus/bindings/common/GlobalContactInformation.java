
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Contact information global in the booking (i.e. not related to passengers), e.g. travel agency contact.
 * 
 * <p>Clase Java para GlobalContactInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GlobalContactInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="postalAddress" type="{http://ws.amadeus.fr/common}NamedPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="travelAgentPhoneNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="otherPhoneNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="otherMobilePhoneNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="faxNumber" type="{http://ws.amadeus.fr/common}InternationalPhoneNumber" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="otherEmailAddress" type="{http://ws.amadeus.fr/common}EmailAddress" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalContactInformation", propOrder = {

})
public class GlobalContactInformation {

    protected NamedPostalAddress postalAddress;
    protected InternationalPhoneNumber travelAgentPhoneNumber;
    protected InternationalPhoneNumber otherPhoneNumber;
    protected InternationalPhoneNumber otherMobilePhoneNumber;
    protected InternationalPhoneNumber faxNumber;
    @XmlAttribute(name = "otherEmailAddress")
    protected String otherEmailAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public GlobalContactInformation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GlobalContactInformation(final NamedPostalAddress postalAddress, final InternationalPhoneNumber travelAgentPhoneNumber, final InternationalPhoneNumber otherPhoneNumber, final InternationalPhoneNumber otherMobilePhoneNumber, final InternationalPhoneNumber faxNumber, final String otherEmailAddress) {
        this.postalAddress = postalAddress;
        this.travelAgentPhoneNumber = travelAgentPhoneNumber;
        this.otherPhoneNumber = otherPhoneNumber;
        this.otherMobilePhoneNumber = otherMobilePhoneNumber;
        this.faxNumber = faxNumber;
        this.otherEmailAddress = otherEmailAddress;
    }

    /**
     * Obtiene el valor de la propiedad postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link NamedPostalAddress }
     *     
     */
    public NamedPostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Define el valor de la propiedad postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPostalAddress }
     *     
     */
    public void setPostalAddress(NamedPostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad travelAgentPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getTravelAgentPhoneNumber() {
        return travelAgentPhoneNumber;
    }

    /**
     * Define el valor de la propiedad travelAgentPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setTravelAgentPhoneNumber(InternationalPhoneNumber value) {
        this.travelAgentPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad otherPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getOtherPhoneNumber() {
        return otherPhoneNumber;
    }

    /**
     * Define el valor de la propiedad otherPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setOtherPhoneNumber(InternationalPhoneNumber value) {
        this.otherPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad otherMobilePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getOtherMobilePhoneNumber() {
        return otherMobilePhoneNumber;
    }

    /**
     * Define el valor de la propiedad otherMobilePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setOtherMobilePhoneNumber(InternationalPhoneNumber value) {
        this.otherMobilePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad faxNumber.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getFaxNumber() {
        return faxNumber;
    }

    /**
     * Define el valor de la propiedad faxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setFaxNumber(InternationalPhoneNumber value) {
        this.faxNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad otherEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEmailAddress() {
        return otherEmailAddress;
    }

    /**
     * Define el valor de la propiedad otherEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEmailAddress(String value) {
        this.otherEmailAddress = value;
    }

}
