
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requirements to book this journey for these passengers, while applying this pricing solution. If these requirements are not fully met, the booking might fail, the ticketing might not be performed properly, or some passengers may not be able to travel. Only the required informations will be informed in this element.
 * 
 * <p>Clase Java para BookingRequirements complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingRequirements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="passenger" maxOccurs="18"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="contactInformation" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="residenceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *                           &lt;attribute name="genderRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="documentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="documentIssuanceCityRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="dateOfBirthRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="redressRequiredIfAny" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="airFranceDiscountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="spanishResidentDiscountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentCardRequired" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="invoiceAddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="mailingAddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="emailAddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="phoneCountryCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="mobilePhoneNumberRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="phoneNumberRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="postalCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingRequirements", propOrder = {
    "passengers",
    "paymentCardRequired"
})
public class BookingRequirements {

    @XmlElement(required = true)
    protected BookingRequirements.Passengers passengers;
    protected BookingRequirements.PaymentCardRequired paymentCardRequired;
    @XmlAttribute(name = "invoiceAddressRequired")
    protected Boolean invoiceAddressRequired;
    @XmlAttribute(name = "mailingAddressRequired")
    protected Boolean mailingAddressRequired;
    @XmlAttribute(name = "emailAddressRequired")
    protected Boolean emailAddressRequired;
    @XmlAttribute(name = "phoneCountryCodeRequired")
    protected Boolean phoneCountryCodeRequired;
    @XmlAttribute(name = "mobilePhoneNumberRequired")
    protected Boolean mobilePhoneNumberRequired;
    @XmlAttribute(name = "phoneNumberRequired")
    protected Boolean phoneNumberRequired;
    @XmlAttribute(name = "postalCodeRequired")
    protected Boolean postalCodeRequired;

    /**
     * Default no-arg constructor
     * 
     */
    public BookingRequirements() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookingRequirements(final BookingRequirements.Passengers passengers, final BookingRequirements.PaymentCardRequired paymentCardRequired, final Boolean invoiceAddressRequired, final Boolean mailingAddressRequired, final Boolean emailAddressRequired, final Boolean phoneCountryCodeRequired, final Boolean mobilePhoneNumberRequired, final Boolean phoneNumberRequired, final Boolean postalCodeRequired) {
        this.passengers = passengers;
        this.paymentCardRequired = paymentCardRequired;
        this.invoiceAddressRequired = invoiceAddressRequired;
        this.mailingAddressRequired = mailingAddressRequired;
        this.emailAddressRequired = emailAddressRequired;
        this.phoneCountryCodeRequired = phoneCountryCodeRequired;
        this.mobilePhoneNumberRequired = mobilePhoneNumberRequired;
        this.phoneNumberRequired = phoneNumberRequired;
        this.postalCodeRequired = postalCodeRequired;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link BookingRequirements.Passengers }
     *     
     */
    public BookingRequirements.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRequirements.Passengers }
     *     
     */
    public void setPassengers(BookingRequirements.Passengers value) {
        this.passengers = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardRequired.
     * 
     * @return
     *     possible object is
     *     {@link BookingRequirements.PaymentCardRequired }
     *     
     */
    public BookingRequirements.PaymentCardRequired getPaymentCardRequired() {
        return paymentCardRequired;
    }

    /**
     * Define el valor de la propiedad paymentCardRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRequirements.PaymentCardRequired }
     *     
     */
    public void setPaymentCardRequired(BookingRequirements.PaymentCardRequired value) {
        this.paymentCardRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceAddressRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiceAddressRequired() {
        return invoiceAddressRequired;
    }

    /**
     * Define el valor de la propiedad invoiceAddressRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiceAddressRequired(Boolean value) {
        this.invoiceAddressRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad mailingAddressRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMailingAddressRequired() {
        return mailingAddressRequired;
    }

    /**
     * Define el valor de la propiedad mailingAddressRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailingAddressRequired(Boolean value) {
        this.mailingAddressRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddressRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailAddressRequired() {
        return emailAddressRequired;
    }

    /**
     * Define el valor de la propiedad emailAddressRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailAddressRequired(Boolean value) {
        this.emailAddressRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneCountryCodeRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneCountryCodeRequired() {
        return phoneCountryCodeRequired;
    }

    /**
     * Define el valor de la propiedad phoneCountryCodeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneCountryCodeRequired(Boolean value) {
        this.phoneCountryCodeRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhoneNumberRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePhoneNumberRequired() {
        return mobilePhoneNumberRequired;
    }

    /**
     * Define el valor de la propiedad mobilePhoneNumberRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePhoneNumberRequired(Boolean value) {
        this.mobilePhoneNumberRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumberRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneNumberRequired() {
        return phoneNumberRequired;
    }

    /**
     * Define el valor de la propiedad phoneNumberRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneNumberRequired(Boolean value) {
        this.phoneNumberRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCodeRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostalCodeRequired() {
        return postalCodeRequired;
    }

    /**
     * Define el valor de la propiedad postalCodeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostalCodeRequired(Boolean value) {
        this.postalCodeRequired = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="passenger" maxOccurs="18"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="contactInformation" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="residenceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
     *                 &lt;attribute name="genderRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="documentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="documentIssuanceCityRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="dateOfBirthRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="redressRequiredIfAny" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="airFranceDiscountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="spanishResidentDiscountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passenger"
    })
    public static class Passengers {

        @XmlElement(required = true)
        protected List<BookingRequirements.Passengers.Passenger> passenger;

        /**
         * Default no-arg constructor
         * 
         */
        public Passengers() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Passengers(final List<BookingRequirements.Passengers.Passenger> passenger) {
            this.passenger = passenger;
        }

        /**
         * Gets the value of the passenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingRequirements.Passengers.Passenger }
         * 
         * 
         */
        public List<BookingRequirements.Passengers.Passenger> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<BookingRequirements.Passengers.Passenger>();
            }
            return this.passenger;
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
         *       &lt;all&gt;
         *         &lt;element name="contactInformation" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="residenceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
         *       &lt;attribute name="genderRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="documentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="documentIssuanceCityRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="dateOfBirthRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="redressRequiredIfAny" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="airFranceDiscountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="spanishResidentDiscountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Passenger {

            protected BookingRequirements.Passengers.Passenger.ContactInformation contactInformation;
            @XmlAttribute(name = "id", required = true)
            protected int id;
            @XmlAttribute(name = "genderRequired")
            protected Boolean genderRequired;
            @XmlAttribute(name = "documentRequired")
            protected Boolean documentRequired;
            @XmlAttribute(name = "documentIssuanceCityRequired")
            protected Boolean documentIssuanceCityRequired;
            @XmlAttribute(name = "dateOfBirthRequired")
            protected Boolean dateOfBirthRequired;
            @XmlAttribute(name = "redressRequiredIfAny")
            protected Boolean redressRequiredIfAny;
            @XmlAttribute(name = "airFranceDiscountRequired")
            protected Boolean airFranceDiscountRequired;
            @XmlAttribute(name = "spanishResidentDiscountRequired")
            protected Boolean spanishResidentDiscountRequired;

            /**
             * Default no-arg constructor
             * 
             */
            public Passenger() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public Passenger(final BookingRequirements.Passengers.Passenger.ContactInformation contactInformation, final int id, final Boolean genderRequired, final Boolean documentRequired, final Boolean documentIssuanceCityRequired, final Boolean dateOfBirthRequired, final Boolean redressRequiredIfAny, final Boolean airFranceDiscountRequired, final Boolean spanishResidentDiscountRequired) {
                this.contactInformation = contactInformation;
                this.id = id;
                this.genderRequired = genderRequired;
                this.documentRequired = documentRequired;
                this.documentIssuanceCityRequired = documentIssuanceCityRequired;
                this.dateOfBirthRequired = dateOfBirthRequired;
                this.redressRequiredIfAny = redressRequiredIfAny;
                this.airFranceDiscountRequired = airFranceDiscountRequired;
                this.spanishResidentDiscountRequired = spanishResidentDiscountRequired;
            }

            /**
             * Obtiene el valor de la propiedad contactInformation.
             * 
             * @return
             *     possible object is
             *     {@link BookingRequirements.Passengers.Passenger.ContactInformation }
             *     
             */
            public BookingRequirements.Passengers.Passenger.ContactInformation getContactInformation() {
                return contactInformation;
            }

            /**
             * Define el valor de la propiedad contactInformation.
             * 
             * @param value
             *     allowed object is
             *     {@link BookingRequirements.Passengers.Passenger.ContactInformation }
             *     
             */
            public void setContactInformation(BookingRequirements.Passengers.Passenger.ContactInformation value) {
                this.contactInformation = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             */
            public int getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             */
            public void setId(int value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad genderRequired.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isGenderRequired() {
                return genderRequired;
            }

            /**
             * Define el valor de la propiedad genderRequired.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setGenderRequired(Boolean value) {
                this.genderRequired = value;
            }

            /**
             * Obtiene el valor de la propiedad documentRequired.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDocumentRequired() {
                return documentRequired;
            }

            /**
             * Define el valor de la propiedad documentRequired.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDocumentRequired(Boolean value) {
                this.documentRequired = value;
            }

            /**
             * Obtiene el valor de la propiedad documentIssuanceCityRequired.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDocumentIssuanceCityRequired() {
                return documentIssuanceCityRequired;
            }

            /**
             * Define el valor de la propiedad documentIssuanceCityRequired.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDocumentIssuanceCityRequired(Boolean value) {
                this.documentIssuanceCityRequired = value;
            }

            /**
             * Obtiene el valor de la propiedad dateOfBirthRequired.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDateOfBirthRequired() {
                return dateOfBirthRequired;
            }

            /**
             * Define el valor de la propiedad dateOfBirthRequired.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDateOfBirthRequired(Boolean value) {
                this.dateOfBirthRequired = value;
            }

            /**
             * Obtiene el valor de la propiedad redressRequiredIfAny.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRedressRequiredIfAny() {
                return redressRequiredIfAny;
            }

            /**
             * Define el valor de la propiedad redressRequiredIfAny.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRedressRequiredIfAny(Boolean value) {
                this.redressRequiredIfAny = value;
            }

            /**
             * Obtiene el valor de la propiedad airFranceDiscountRequired.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAirFranceDiscountRequired() {
                return airFranceDiscountRequired;
            }

            /**
             * Define el valor de la propiedad airFranceDiscountRequired.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAirFranceDiscountRequired(Boolean value) {
                this.airFranceDiscountRequired = value;
            }

            /**
             * Obtiene el valor de la propiedad spanishResidentDiscountRequired.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSpanishResidentDiscountRequired() {
                return spanishResidentDiscountRequired;
            }

            /**
             * Define el valor de la propiedad spanishResidentDiscountRequired.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSpanishResidentDiscountRequired(Boolean value) {
                this.spanishResidentDiscountRequired = value;
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
             *       &lt;attribute name="residenceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ContactInformation {

                @XmlAttribute(name = "residenceRequired")
                protected Boolean residenceRequired;

                /**
                 * Default no-arg constructor
                 * 
                 */
                public ContactInformation() {
                    super();
                }

                /**
                 * Fully-initialising value constructor
                 * 
                 */
                public ContactInformation(final Boolean residenceRequired) {
                    this.residenceRequired = residenceRequired;
                }

                /**
                 * Obtiene el valor de la propiedad residenceRequired.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isResidenceRequired() {
                    return residenceRequired;
                }

                /**
                 * Define el valor de la propiedad residenceRequired.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setResidenceRequired(Boolean value) {
                    this.residenceRequired = value;
                }

            }

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
     *       &lt;sequence&gt;
     *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itineraries"
    })
    public static class PaymentCardRequired {

        @XmlElement(required = true)
        protected ItineraryIdList itineraries;

        /**
         * Default no-arg constructor
         * 
         */
        public PaymentCardRequired() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PaymentCardRequired(final ItineraryIdList itineraries) {
            this.itineraries = itineraries;
        }

        /**
         * Obtiene el valor de la propiedad itineraries.
         * 
         * @return
         *     possible object is
         *     {@link ItineraryIdList }
         *     
         */
        public ItineraryIdList getItineraries() {
            return itineraries;
        }

        /**
         * Define el valor de la propiedad itineraries.
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryIdList }
         *     
         */
        public void setItineraries(ItineraryIdList value) {
            this.itineraries = value;
        }

    }

}
