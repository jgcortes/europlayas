
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information for a list of named passenger information.
 * 
 * <p>Clase Java para NamedPassengersInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NamedPassengersInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}PassengersInconsistency"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inconsistentPassengers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="inconsistentPassenger" type="{http://ws.amadeus.fr/air}InconsistentPassenger" maxOccurs="18"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accommodationPreferenceInconsistency" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="mealCodes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="mealCode" type="{http://ws.amadeus.fr/air}MealCode" maxOccurs="25"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="seatNumbers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="seatNumber" type="{http://ws.amadeus.fr/air}SeatNumber" maxOccurs="81"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="loyaltyProgramInconsistency" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedPassengersInconsistency", propOrder = {
    "inconsistentPassengers",
    "accommodationPreferenceInconsistency",
    "loyaltyProgramInconsistency"
})
public class NamedPassengersInconsistency
    extends PassengersInconsistency
{

    protected NamedPassengersInconsistency.InconsistentPassengers inconsistentPassengers;
    protected NamedPassengersInconsistency.AccommodationPreferenceInconsistency accommodationPreferenceInconsistency;
    protected NamedPassengersInconsistency.LoyaltyProgramInconsistency loyaltyProgramInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public NamedPassengersInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NamedPassengersInconsistency(final PassengersInconsistency.UnsupportedPassengers unsupportedPassengers, final AdditionalServicesInconsistency additionalServicesInconsistency, final InconsistentRemark inconsistentRemark, final boolean notEnoughAccompanyingAdults, final NamedPassengersInconsistency.InconsistentPassengers inconsistentPassengers, final NamedPassengersInconsistency.AccommodationPreferenceInconsistency accommodationPreferenceInconsistency, final NamedPassengersInconsistency.LoyaltyProgramInconsistency loyaltyProgramInconsistency) {
        super(unsupportedPassengers, additionalServicesInconsistency, inconsistentRemark, notEnoughAccompanyingAdults);
        this.inconsistentPassengers = inconsistentPassengers;
        this.accommodationPreferenceInconsistency = accommodationPreferenceInconsistency;
        this.loyaltyProgramInconsistency = loyaltyProgramInconsistency;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentPassengers.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassengersInconsistency.InconsistentPassengers }
     *     
     */
    public NamedPassengersInconsistency.InconsistentPassengers getInconsistentPassengers() {
        return inconsistentPassengers;
    }

    /**
     * Define el valor de la propiedad inconsistentPassengers.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassengersInconsistency.InconsistentPassengers }
     *     
     */
    public void setInconsistentPassengers(NamedPassengersInconsistency.InconsistentPassengers value) {
        this.inconsistentPassengers = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodationPreferenceInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency }
     *     
     */
    public NamedPassengersInconsistency.AccommodationPreferenceInconsistency getAccommodationPreferenceInconsistency() {
        return accommodationPreferenceInconsistency;
    }

    /**
     * Define el valor de la propiedad accommodationPreferenceInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency }
     *     
     */
    public void setAccommodationPreferenceInconsistency(NamedPassengersInconsistency.AccommodationPreferenceInconsistency value) {
        this.accommodationPreferenceInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad loyaltyProgramInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassengersInconsistency.LoyaltyProgramInconsistency }
     *     
     */
    public NamedPassengersInconsistency.LoyaltyProgramInconsistency getLoyaltyProgramInconsistency() {
        return loyaltyProgramInconsistency;
    }

    /**
     * Define el valor de la propiedad loyaltyProgramInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassengersInconsistency.LoyaltyProgramInconsistency }
     *     
     */
    public void setLoyaltyProgramInconsistency(NamedPassengersInconsistency.LoyaltyProgramInconsistency value) {
        this.loyaltyProgramInconsistency = value;
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
     *         &lt;element name="mealCodes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="mealCode" type="{http://ws.amadeus.fr/air}MealCode" maxOccurs="25"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="seatNumbers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="seatNumber" type="{http://ws.amadeus.fr/air}SeatNumber" maxOccurs="81"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
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
    public static class AccommodationPreferenceInconsistency {

        protected NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes mealCodes;
        protected NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers seatNumbers;

        /**
         * Default no-arg constructor
         * 
         */
        public AccommodationPreferenceInconsistency() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AccommodationPreferenceInconsistency(final NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes mealCodes, final NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers seatNumbers) {
            this.mealCodes = mealCodes;
            this.seatNumbers = seatNumbers;
        }

        /**
         * Obtiene el valor de la propiedad mealCodes.
         * 
         * @return
         *     possible object is
         *     {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes }
         *     
         */
        public NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes getMealCodes() {
            return mealCodes;
        }

        /**
         * Define el valor de la propiedad mealCodes.
         * 
         * @param value
         *     allowed object is
         *     {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes }
         *     
         */
        public void setMealCodes(NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes value) {
            this.mealCodes = value;
        }

        /**
         * Obtiene el valor de la propiedad seatNumbers.
         * 
         * @return
         *     possible object is
         *     {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers }
         *     
         */
        public NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers getSeatNumbers() {
            return seatNumbers;
        }

        /**
         * Define el valor de la propiedad seatNumbers.
         * 
         * @param value
         *     allowed object is
         *     {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers }
         *     
         */
        public void setSeatNumbers(NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers value) {
            this.seatNumbers = value;
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
         *         &lt;element name="mealCode" type="{http://ws.amadeus.fr/air}MealCode" maxOccurs="25"/&gt;
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
            "mealCode"
        })
        public static class MealCodes {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected List<MealCode> mealCode;

            /**
             * Default no-arg constructor
             * 
             */
            public MealCodes() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public MealCodes(final List<MealCode> mealCode) {
                this.mealCode = mealCode;
            }

            /**
             * Gets the value of the mealCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MealCode }
             * 
             * 
             */
            public List<MealCode> getMealCode() {
                if (mealCode == null) {
                    mealCode = new ArrayList<MealCode>();
                }
                return this.mealCode;
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
         *         &lt;element name="seatNumber" type="{http://ws.amadeus.fr/air}SeatNumber" maxOccurs="81"/&gt;
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
            "seatNumber"
        })
        public static class SeatNumbers {

            @XmlElement(required = true)
            protected List<String> seatNumber;

            /**
             * Default no-arg constructor
             * 
             */
            public SeatNumbers() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public SeatNumbers(final List<String> seatNumber) {
                this.seatNumber = seatNumber;
            }

            /**
             * Gets the value of the seatNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSeatNumber() {
                if (seatNumber == null) {
                    seatNumber = new ArrayList<String>();
                }
                return this.seatNumber;
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
     *         &lt;element name="inconsistentPassenger" type="{http://ws.amadeus.fr/air}InconsistentPassenger" maxOccurs="18"/&gt;
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
        "inconsistentPassenger"
    })
    public static class InconsistentPassengers {

        @XmlElement(required = true)
        protected List<InconsistentPassenger> inconsistentPassenger;

        /**
         * Default no-arg constructor
         * 
         */
        public InconsistentPassengers() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public InconsistentPassengers(final List<InconsistentPassenger> inconsistentPassenger) {
            this.inconsistentPassenger = inconsistentPassenger;
        }

        /**
         * Gets the value of the inconsistentPassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inconsistentPassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInconsistentPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InconsistentPassenger }
         * 
         * 
         */
        public List<InconsistentPassenger> getInconsistentPassenger() {
            if (inconsistentPassenger == null) {
                inconsistentPassenger = new ArrayList<InconsistentPassenger>();
            }
            return this.inconsistentPassenger;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyProgramInconsistency {


        /**
         * Default no-arg constructor
         * 
         */
        public LoyaltyProgramInconsistency() {
            super();
        }

    }

}
