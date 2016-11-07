
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare option applied to a passenger.
 * 
 * <p>Clase Java para PassengerFareOption complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="passengerId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="fareOption" use="required" type="{http://ws.amadeus.fr/air}FareOption" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareOption")
public class PassengerFareOption {

    @XmlAttribute(name = "passengerId", required = true)
    protected int passengerId;
    @XmlAttribute(name = "fareOption", required = true)
    protected FareOption fareOption;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerFareOption() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerFareOption(final int passengerId, final FareOption fareOption) {
        this.passengerId = passengerId;
        this.fareOption = fareOption;
    }

    /**
     * Obtiene el valor de la propiedad passengerId.
     * 
     */
    public int getPassengerId() {
        return passengerId;
    }

    /**
     * Define el valor de la propiedad passengerId.
     * 
     */
    public void setPassengerId(int value) {
        this.passengerId = value;
    }

    /**
     * Obtiene el valor de la propiedad fareOption.
     * 
     * @return
     *     possible object is
     *     {@link FareOption }
     *     
     */
    public FareOption getFareOption() {
        return fareOption;
    }

    /**
     * Define el valor de la propiedad fareOption.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOption }
     *     
     */
    public void setFareOption(FareOption value) {
        this.fareOption = value;
    }

}
