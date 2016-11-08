
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.EmergencyContactInformation;
import com.europlayas.amadeus.bindings.common.PassengerIdentity;
import com.europlayas.amadeus.bindings.common.PersonalContactInformation;


/**
 * Named passenger information, for an Infant passenger held in another passenger's lap, typically an adult or one of the parent.
 * 
 * <p>Clase Java para HeldInfantNamedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HeldInfantNamedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/air}NamedPassenger"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identity" type="{http://ws.amadeus.fr/common}InfantPassengerIdentity"/&gt;
 *         &lt;element name="passport" type="{http://ws.amadeus.fr/air}Passport" minOccurs="0"/&gt;
 *         &lt;element name="redress" type="{http://ws.amadeus.fr/air}Redress" minOccurs="0"/&gt;
 *         &lt;element name="discounts" type="{http://ws.amadeus.fr/air}DiscountList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeldInfantNamedPassenger")
public class HeldInfantNamedPassenger
    extends NamedPassenger
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public HeldInfantNamedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HeldInfantNamedPassenger(final int id, final PassengerIdentity identity, final Passport passport, final Redress redress, final PersonalContactInformation contactInformation, final EmergencyContactInformation emergencyContactInformation, final LoyaltyProgramList loyaltyPrograms, final DiscountList discounts, final NamedPassenger.Remarks remarks) {
        super(id, identity, passport, redress, contactInformation, emergencyContactInformation, loyaltyPrograms, discounts, remarks);
    }

}
