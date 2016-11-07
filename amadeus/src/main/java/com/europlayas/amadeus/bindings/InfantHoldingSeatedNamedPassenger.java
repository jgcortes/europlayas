
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.EmergencyContactInformation;
import com.europlayas.amadeus.bindings.common.PassengerIdentity;
import com.europlayas.amadeus.bindings.common.PersonalContactInformation;


/**
 * Named passenger information, for a passenger occupying a seat and holding an infant.
 * 
 * <p>Clase Java para InfantHoldingSeatedNamedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfantHoldingSeatedNamedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}SeatedNamedPassenger"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heldInfant" type="{http://ws.amadeus.fr/air}HeldInfantNamedPassenger"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="passengerType" use="required" type="{http://ws.amadeus.fr/air}InfantHoldingAllowedPassengerType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfantHoldingSeatedNamedPassenger", propOrder = {
    "heldInfant"
})
public class InfantHoldingSeatedNamedPassenger
    extends SeatedNamedPassenger
{

    @XmlElement(required = true)
    protected HeldInfantNamedPassenger heldInfant;
    @XmlAttribute(name = "passengerType", required = true)
    protected InfantHoldingAllowedPassengerType passengerType;

    /**
     * Default no-arg constructor
     * 
     */
    public InfantHoldingSeatedNamedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InfantHoldingSeatedNamedPassenger(final int id, final PassengerIdentity identity, final Passport passport, final Redress redress, final PersonalContactInformation contactInformation, final EmergencyContactInformation emergencyContactInformation, final LoyaltyProgramList loyaltyPrograms, final DiscountList discounts, final com.europlayas.amadeus.bindings.NamedPassenger.Remarks remarks, final SeatedNamedPassenger.AccommodationPreferences accommodationPreferences, final SeatedPassengerAdditionalServices additionalServices, final HeldInfantNamedPassenger heldInfant, final InfantHoldingAllowedPassengerType passengerType) {
        super(id, identity, passport, redress, contactInformation, emergencyContactInformation, loyaltyPrograms, discounts, remarks, accommodationPreferences, additionalServices);
        this.heldInfant = heldInfant;
        this.passengerType = passengerType;
    }

    /**
     * Obtiene el valor de la propiedad heldInfant.
     * 
     * @return
     *     possible object is
     *     {@link HeldInfantNamedPassenger }
     *     
     */
    public HeldInfantNamedPassenger getHeldInfant() {
        return heldInfant;
    }

    /**
     * Define el valor de la propiedad heldInfant.
     * 
     * @param value
     *     allowed object is
     *     {@link HeldInfantNamedPassenger }
     *     
     */
    public void setHeldInfant(HeldInfantNamedPassenger value) {
        this.heldInfant = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerType.
     * 
     * @return
     *     possible object is
     *     {@link InfantHoldingAllowedPassengerType }
     *     
     */
    public InfantHoldingAllowedPassengerType getPassengerType() {
        return passengerType;
    }

    /**
     * Define el valor de la propiedad passengerType.
     * 
     * @param value
     *     allowed object is
     *     {@link InfantHoldingAllowedPassengerType }
     *     
     */
    public void setPassengerType(InfantHoldingAllowedPassengerType value) {
        this.passengerType = value;
    }

}
