
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.EmergencyContactInformation;
import com.europlayas.amadeus.bindings.common.PassengerIdentity;
import com.europlayas.amadeus.bindings.common.PersonalContactInformation;


/**
 * Named passenger information, for a passenger occupying a seat.
 * 
 * <p>Clase Java para SeatedNamedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeatedNamedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}NamedPassenger"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accommodationPreferences" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="accommodationPreference" type="{http://ws.amadeus.fr/air}SegmentAccommodationPreference" maxOccurs="9"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalServices" type="{http://ws.amadeus.fr/air}SeatedPassengerAdditionalServices" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatedNamedPassenger", propOrder = {
    "accommodationPreferences",
    "additionalServices"
})
@XmlSeeAlso({
    NonInfantHoldingSeatedNamedPassenger.class,
    InfantHoldingSeatedNamedPassenger.class
})
public abstract class SeatedNamedPassenger
    extends NamedPassenger
{

    protected SeatedNamedPassenger.AccommodationPreferences accommodationPreferences;
    protected SeatedPassengerAdditionalServices additionalServices;

    /**
     * Default no-arg constructor
     * 
     */
    public SeatedNamedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeatedNamedPassenger(final int id, final PassengerIdentity identity, final Passport passport, final Redress redress, final PersonalContactInformation contactInformation, final EmergencyContactInformation emergencyContactInformation, final LoyaltyProgramList loyaltyPrograms, final DiscountList discounts, final NamedPassenger.Remarks remarks, final SeatedNamedPassenger.AccommodationPreferences accommodationPreferences, final SeatedPassengerAdditionalServices additionalServices) {
        super(id, identity, passport, redress, contactInformation, emergencyContactInformation, loyaltyPrograms, discounts, remarks);
        this.accommodationPreferences = accommodationPreferences;
        this.additionalServices = additionalServices;
    }

    /**
     * Obtiene el valor de la propiedad accommodationPreferences.
     * 
     * @return
     *     possible object is
     *     {@link SeatedNamedPassenger.AccommodationPreferences }
     *     
     */
    public SeatedNamedPassenger.AccommodationPreferences getAccommodationPreferences() {
        return accommodationPreferences;
    }

    /**
     * Define el valor de la propiedad accommodationPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatedNamedPassenger.AccommodationPreferences }
     *     
     */
    public void setAccommodationPreferences(SeatedNamedPassenger.AccommodationPreferences value) {
        this.accommodationPreferences = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalServices.
     * 
     * @return
     *     possible object is
     *     {@link SeatedPassengerAdditionalServices }
     *     
     */
    public SeatedPassengerAdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Define el valor de la propiedad additionalServices.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatedPassengerAdditionalServices }
     *     
     */
    public void setAdditionalServices(SeatedPassengerAdditionalServices value) {
        this.additionalServices = value;
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
     *         &lt;element name="accommodationPreference" type="{http://ws.amadeus.fr/air}SegmentAccommodationPreference" maxOccurs="9"/&gt;
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
        "accommodationPreference"
    })
    public static class AccommodationPreferences {

        @XmlElement(required = true)
        protected List<SegmentAccommodationPreference> accommodationPreference;

        /**
         * Default no-arg constructor
         * 
         */
        public AccommodationPreferences() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AccommodationPreferences(final List<SegmentAccommodationPreference> accommodationPreference) {
            this.accommodationPreference = accommodationPreference;
        }

        /**
         * Gets the value of the accommodationPreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationPreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationPreference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentAccommodationPreference }
         * 
         * 
         */
        public List<SegmentAccommodationPreference> getAccommodationPreference() {
            if (accommodationPreference == null) {
                accommodationPreference = new ArrayList<SegmentAccommodationPreference>();
            }
            return this.accommodationPreference;
        }

    }

}
