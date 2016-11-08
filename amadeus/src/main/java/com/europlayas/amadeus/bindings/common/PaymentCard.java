
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Payment card.
 * 
 * <p>Clase Java para PaymentCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="holder" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="number" use="required" type="{http://ws.amadeus.fr/common}BankCardNumber" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://ws.amadeus.fr/common}PaymentCardBrand" /&gt;
 *       &lt;attribute name="expirationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" /&gt;
 *       &lt;attribute name="securityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard")
public class PaymentCard implements Serializable
{

    @XmlAttribute(name = "holder", required = true)
    protected String holder;
    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "type", required = true)
    protected PaymentCardBrand type;
    @XmlAttribute(name = "expirationDate", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "securityCode", required = true)
    protected String securityCode;

    /**
     * Default no-arg constructor
     * 
     */
    public PaymentCard() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PaymentCard(final String holder, final String number, final PaymentCardBrand type, final XMLGregorianCalendar expirationDate, final String securityCode) {
        this.holder = holder;
        this.number = number;
        this.type = type;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    /**
     * Obtiene el valor de la propiedad holder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolder() {
        return holder;
    }

    /**
     * Define el valor de la propiedad holder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolder(String value) {
        this.holder = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBrand }
     *     
     */
    public PaymentCardBrand getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBrand }
     *     
     */
    public void setType(PaymentCardBrand value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad securityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Define el valor de la propiedad securityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

}
