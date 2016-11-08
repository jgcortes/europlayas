
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.EmergencyContactInformation;
import com.europlayas.amadeus.bindings.common.PassengerIdentity;
import com.europlayas.amadeus.bindings.common.PersonalContactInformation;


/**
 * Named passenger information, for a passenger occupying a seat and not holding an infant.
 * 
 * <p>Clase Java para NonInfantHoldingSeatedNamedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NonInfantHoldingSeatedNamedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}SeatedNamedPassenger"&gt;
 *       &lt;attribute name="passengerType" use="required" type="{http://ws.amadeus.fr/air}PassengerType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonInfantHoldingSeatedNamedPassenger")
public class NonInfantHoldingSeatedNamedPassenger
    extends SeatedNamedPassenger
    implements Serializable
{

    @XmlAttribute(name = "passengerType", required = true)
    protected PassengerType passengerType;

    /**
     * Default no-arg constructor
     * 
     */
    public NonInfantHoldingSeatedNamedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NonInfantHoldingSeatedNamedPassenger(final int id, final PassengerIdentity identity, final Passport passport, final Redress redress, final PersonalContactInformation contactInformation, final EmergencyContactInformation emergencyContactInformation, final LoyaltyProgramList loyaltyPrograms, final DiscountList discounts, final com.europlayas.amadeus.bindings.NamedPassenger.Remarks remarks, final SeatedNamedPassenger.AccommodationPreferences accommodationPreferences, final SeatedPassengerAdditionalServices additionalServices, final PassengerType passengerType) {
        super(id, identity, passport, redress, contactInformation, emergencyContactInformation, loyaltyPrograms, discounts, remarks, accommodationPreferences, additionalServices);
        this.passengerType = passengerType;
    }

    /**
     * Obtiene el valor de la propiedad passengerType.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getPassengerType() {
        return passengerType;
    }

    /**
     * Define el valor de la propiedad passengerType.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setPassengerType(PassengerType value) {
        this.passengerType = value;
    }

}
