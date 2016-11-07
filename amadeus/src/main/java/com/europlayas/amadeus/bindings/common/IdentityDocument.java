
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Identity document of an individual.
 * 
 * <p>Clase Java para IdentityDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="issuance"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="date" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *                 &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="residence"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="PASSPORT"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="number" use="required" type="{http://ws.amadeus.fr/common}StringAlphaNumeric1To15" /&gt;
 *       &lt;attribute name="expirationDate" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *       &lt;attribute name="holder" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocument", propOrder = {

})
public class IdentityDocument {

    @XmlElement(required = true)
    protected IdentityDocument.Issuance issuance;
    @XmlElement(required = true)
    protected IdentityDocument.Residence residence;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "expirationDate", required = true)
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "holder", required = true)
    protected boolean holder;

    /**
     * Default no-arg constructor
     * 
     */
    public IdentityDocument() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IdentityDocument(final IdentityDocument.Issuance issuance, final IdentityDocument.Residence residence, final String type, final String number, final XMLGregorianCalendar expirationDate, final boolean holder) {
        this.issuance = issuance;
        this.residence = residence;
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.holder = holder;
    }

    /**
     * Obtiene el valor de la propiedad issuance.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocument.Issuance }
     *     
     */
    public IdentityDocument.Issuance getIssuance() {
        return issuance;
    }

    /**
     * Define el valor de la propiedad issuance.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocument.Issuance }
     *     
     */
    public void setIssuance(IdentityDocument.Issuance value) {
        this.issuance = value;
    }

    /**
     * Obtiene el valor de la propiedad residence.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocument.Residence }
     *     
     */
    public IdentityDocument.Residence getResidence() {
        return residence;
    }

    /**
     * Define el valor de la propiedad residence.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocument.Residence }
     *     
     */
    public void setResidence(IdentityDocument.Residence value) {
        this.residence = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Obtiene el valor de la propiedad holder.
     * 
     */
    public boolean isHolder() {
        return holder;
    }

    /**
     * Define el valor de la propiedad holder.
     * 
     */
    public void setHolder(boolean value) {
        this.holder = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="date" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
     *       &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Issuance {

        @XmlAttribute(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "countryCode", required = true)
        protected CountryCode countryCode;

        /**
         * Default no-arg constructor
         * 
         */
        public Issuance() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Issuance(final XMLGregorianCalendar date, final CountryCode countryCode) {
            this.date = date;
            this.countryCode = countryCode;
        }

        /**
         * Obtiene el valor de la propiedad date.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Define el valor de la propiedad date.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Residence {

        @XmlAttribute(name = "countryCode", required = true)
        protected CountryCode countryCode;

        /**
         * Default no-arg constructor
         * 
         */
        public Residence() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Residence(final CountryCode countryCode) {
            this.countryCode = countryCode;
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

    }

}
