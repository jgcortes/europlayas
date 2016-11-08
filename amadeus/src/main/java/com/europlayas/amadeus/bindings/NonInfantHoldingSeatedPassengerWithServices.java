
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic passenger information, for a passenger occupying a seat, not holding an infant and having additional services.
 * 
 * <p>Clase Java para NonInfantHoldingSeatedPassengerWithServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NonInfantHoldingSeatedPassengerWithServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}SeatedPassengerWithServices"&gt;
 *       &lt;attribute name="passengerType" use="required" type="{http://ws.amadeus.fr/air}PassengerType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonInfantHoldingSeatedPassengerWithServices")
public class NonInfantHoldingSeatedPassengerWithServices
    extends SeatedPassengerWithServices
    implements Serializable
{

    @XmlAttribute(name = "passengerType", required = true)
    protected PassengerType passengerType;

    /**
     * Default no-arg constructor
     * 
     */
    public NonInfantHoldingSeatedPassengerWithServices() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NonInfantHoldingSeatedPassengerWithServices(final int id, final SeatedPassengerAdditionalServices additionalServices, final PassengerType passengerType) {
        super(id, additionalServices);
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
