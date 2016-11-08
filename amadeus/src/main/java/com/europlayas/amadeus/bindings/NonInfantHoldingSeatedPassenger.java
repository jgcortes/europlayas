
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic passenger information, for a passenger occupying a seat and not holding an infant.
 * 
 * <p>Clase Java para NonInfantHoldingSeatedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NonInfantHoldingSeatedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}SeatedPassenger"&gt;
 *       &lt;attribute name="passengerType" use="required" type="{http://ws.amadeus.fr/air}PassengerType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonInfantHoldingSeatedPassenger")
public class NonInfantHoldingSeatedPassenger
    extends SeatedPassenger
    implements Serializable
{

    @XmlAttribute(name = "passengerType", required = true)
    protected PassengerType passengerType;

    /**
     * Default no-arg constructor
     * 
     */
    public NonInfantHoldingSeatedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NonInfantHoldingSeatedPassenger(final int id, final PassengerType passengerType) {
        super(id);
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
