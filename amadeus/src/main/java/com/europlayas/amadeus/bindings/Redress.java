
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.europlayas.amadeus.bindings.common.CountryCode;
import com.europlayas.amadeus.util.DateAdapter;


/**
 * Information related to redress through the DHS Travel Redress Inquiry Program (DHS TRIP).
 * 
 * <p>Clase Java para Redress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Redress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="issuance"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *                 &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="validity"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="countryCode" use="required" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="personalInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="placeOfBirth" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="controlNumber" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[0-9]{7}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Redress", propOrder = {

})
public class Redress implements Serializable
{

    @XmlElement(required = true)
    protected Redress.Issuance issuance;
    @XmlElement(required = true)
    protected Redress.Validity validity;
    protected Redress.PersonalInformation personalInformation;
    @XmlAttribute(name = "controlNumber", required = true)
    protected String controlNumber;

    /**
     * Default no-arg constructor
     * 
     */
    public Redress() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Redress(final Redress.Issuance issuance, final Redress.Validity validity, final Redress.PersonalInformation personalInformation, final String controlNumber) {
        this.issuance = issuance;
        this.validity = validity;
        this.personalInformation = personalInformation;
        this.controlNumber = controlNumber;
    }

    /**
     * Obtiene el valor de la propiedad issuance.
     * 
     * @return
     *     possible object is
     *     {@link Redress.Issuance }
     *     
     */
    public Redress.Issuance getIssuance() {
        return issuance;
    }

    /**
     * Define el valor de la propiedad issuance.
     * 
     * @param value
     *     allowed object is
     *     {@link Redress.Issuance }
     *     
     */
    public void setIssuance(Redress.Issuance value) {
        this.issuance = value;
    }

    /**
     * Obtiene el valor de la propiedad validity.
     * 
     * @return
     *     possible object is
     *     {@link Redress.Validity }
     *     
     */
    public Redress.Validity getValidity() {
        return validity;
    }

    /**
     * Define el valor de la propiedad validity.
     * 
     * @param value
     *     allowed object is
     *     {@link Redress.Validity }
     *     
     */
    public void setValidity(Redress.Validity value) {
        this.validity = value;
    }

    /**
     * Obtiene el valor de la propiedad personalInformation.
     * 
     * @return
     *     possible object is
     *     {@link Redress.PersonalInformation }
     *     
     */
    public Redress.PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    /**
     * Define el valor de la propiedad personalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link Redress.PersonalInformation }
     *     
     */
    public void setPersonalInformation(Redress.PersonalInformation value) {
        this.personalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad controlNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Define el valor de la propiedad controlNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
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
     *       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
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
    public static class Issuance implements Serializable
    {

        @XmlAttribute(name = "date", required = true)
        @XmlJavaTypeAdapter(DateAdapter.class)
        protected LocalDate date;
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
        public Issuance(final LocalDate date, final CountryCode countryCode) {
            this.date = date;
            this.countryCode = countryCode;
        }

        /**
         * Obtiene el valor de la propiedad date.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDate getDate() {
            return date;
        }

        /**
         * Define el valor de la propiedad date.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(LocalDate value) {
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
     *       &lt;attribute name="placeOfBirth" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PersonalInformation implements Serializable
    {

        @XmlAttribute(name = "placeOfBirth", required = true)
        protected String placeOfBirth;

        /**
         * Default no-arg constructor
         * 
         */
        public PersonalInformation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PersonalInformation(final String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
        }

        /**
         * Obtiene el valor de la propiedad placeOfBirth.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceOfBirth() {
            return placeOfBirth;
        }

        /**
         * Define el valor de la propiedad placeOfBirth.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceOfBirth(String value) {
            this.placeOfBirth = value;
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
    public static class Validity implements Serializable
    {

        @XmlAttribute(name = "countryCode", required = true)
        protected CountryCode countryCode;

        /**
         * Default no-arg constructor
         * 
         */
        public Validity() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Validity(final CountryCode countryCode) {
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
