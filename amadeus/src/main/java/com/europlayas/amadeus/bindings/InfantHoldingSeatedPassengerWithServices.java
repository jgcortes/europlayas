
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic passenger information, for a passenger occupying a seat, holding an infant and having additional services.
 * 
 * <p>Clase Java para InfantHoldingSeatedPassengerWithServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfantHoldingSeatedPassengerWithServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}SeatedPassengerWithServices"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heldInfant" type="{http://ws.amadeus.fr/air}HeldInfantPassenger"/&gt;
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
@XmlType(name = "InfantHoldingSeatedPassengerWithServices", propOrder = {
    "heldInfant"
})
public class InfantHoldingSeatedPassengerWithServices
    extends SeatedPassengerWithServices
{

    @XmlElement(required = true)
    protected HeldInfantPassenger heldInfant;
    @XmlAttribute(name = "passengerType", required = true)
    protected InfantHoldingAllowedPassengerType passengerType;

    /**
     * Default no-arg constructor
     * 
     */
    public InfantHoldingSeatedPassengerWithServices() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InfantHoldingSeatedPassengerWithServices(final int id, final SeatedPassengerAdditionalServices additionalServices, final HeldInfantPassenger heldInfant, final InfantHoldingAllowedPassengerType passengerType) {
        super(id, additionalServices);
        this.heldInfant = heldInfant;
        this.passengerType = passengerType;
    }

    /**
     * Obtiene el valor de la propiedad heldInfant.
     * 
     * @return
     *     possible object is
     *     {@link HeldInfantPassenger }
     *     
     */
    public HeldInfantPassenger getHeldInfant() {
        return heldInfant;
    }

    /**
     * Define el valor de la propiedad heldInfant.
     * 
     * @param value
     *     allowed object is
     *     {@link HeldInfantPassenger }
     *     
     */
    public void setHeldInfant(HeldInfantPassenger value) {
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
