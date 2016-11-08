
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Information regarding a passenger having a spanish resident discount.
 * 
 * <p>Clase Java para SpanishResidentDiscount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpanishResidentDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AirDiscount"&gt;
 *       &lt;attribute name="city" use="required" type="{http://ws.amadeus.fr/air}SpanishCity" /&gt;
 *       &lt;attribute name="passengerType" use="required" type="{http://ws.amadeus.fr/air}SpanishResidentPassengerType" /&gt;
 *       &lt;attribute name="residentCardNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[0-9A-Z][0-9]{0,12}[A-Z]"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="certificateNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[0-9]{1,20}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpanishResidentDiscount")
public class SpanishResidentDiscount
    extends AirDiscount
    implements Serializable
{

    @XmlAttribute(name = "city", required = true)
    protected SpanishCity city;
    @XmlAttribute(name = "passengerType", required = true)
    protected SpanishResidentPassengerType passengerType;
    @XmlAttribute(name = "residentCardNumber")
    protected String residentCardNumber;
    @XmlAttribute(name = "certificateNumber")
    protected String certificateNumber;

    /**
     * Default no-arg constructor
     * 
     */
    public SpanishResidentDiscount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SpanishResidentDiscount(final SpanishCity city, final SpanishResidentPassengerType passengerType, final String residentCardNumber, final String certificateNumber) {
        super();
        this.city = city;
        this.passengerType = passengerType;
        this.residentCardNumber = residentCardNumber;
        this.certificateNumber = certificateNumber;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link SpanishCity }
     *     
     */
    public SpanishCity getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link SpanishCity }
     *     
     */
    public void setCity(SpanishCity value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerType.
     * 
     * @return
     *     possible object is
     *     {@link SpanishResidentPassengerType }
     *     
     */
    public SpanishResidentPassengerType getPassengerType() {
        return passengerType;
    }

    /**
     * Define el valor de la propiedad passengerType.
     * 
     * @param value
     *     allowed object is
     *     {@link SpanishResidentPassengerType }
     *     
     */
    public void setPassengerType(SpanishResidentPassengerType value) {
        this.passengerType = value;
    }

    /**
     * Obtiene el valor de la propiedad residentCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentCardNumber() {
        return residentCardNumber;
    }

    /**
     * Define el valor de la propiedad residentCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentCardNumber(String value) {
        this.residentCardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad certificateNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Define el valor de la propiedad certificateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

}
