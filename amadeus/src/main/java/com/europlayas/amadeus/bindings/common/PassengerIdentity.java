
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information related to passenger identity. 
 * 
 * Currently, due to provider constraints, first name and surname are intended to be machine readable. Basic Latin letters (A to Z) in upper or lower case, with or without diacritical marks, are the only letters supported. 
 * 
 * Furthermore, separator characters may include: 
 * apostrophe (')
 * dash (-)
 * coma (,)
 * underscore (_)
 * space ( )
 * dot (.)
 * 
 * Surname must be between 2 and 66 letters.
 * First name must be between 1 and 65 letters.
 * Multiple spaces or separators between one or more letters count as one letter (*).
 * However, the real maximum length may vary since it may depend on other passenger information (when holding an infant for example).
 * 
 * The system will try to normalize and truncate names, if truncation is enabled, with respect to provider limitations, taking into account other passenger information.
 * 
 * (*) Separator characters are replaced with spaces, leading and trailing spaces are removed, and multiple spaces are reduced to a single space.
 * 
 * <p>Clase Java para PassengerIdentity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="firstName" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;pattern value="[ ,\-'_.]*\p{L}((\p{L}|[ ,\-'_.]+){0,63}\p{L})?[ ,\-'_.]*"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="middleName"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="surname" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;pattern value="[ ,\-'_.]*\p{L}(\p{L}|[ ,\-'_.]+){0,64}\p{L}[ ,\-'_.]*"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="dateOfBirth" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *       &lt;attribute name="gender" type="{http://ws.amadeus.fr/common}Gender" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerIdentity")
@XmlSeeAlso({
    InfantPassengerIdentity.class
})
public class PassengerIdentity {

    @XmlAttribute(name = "firstName", required = true)
    protected String firstName;
    @XmlAttribute(name = "middleName")
    protected String middleName;
    @XmlAttribute(name = "surname", required = true)
    protected String surname;
    @XmlAttribute(name = "dateOfBirth")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlAttribute(name = "gender")
    protected Gender gender;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerIdentity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerIdentity(final String firstName, final String middleName, final String surname, final XMLGregorianCalendar dateOfBirth, final Gender gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad surname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Define el valor de la propiedad surname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Define el valor de la propiedad dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

}
