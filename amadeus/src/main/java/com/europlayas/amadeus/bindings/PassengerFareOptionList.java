
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare options applied to one or more passengers.
 * 
 * <p>Clase Java para PassengerFareOptionList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareOptionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerFareOption" type="{http://ws.amadeus.fr/air}PassengerFareOption" maxOccurs="18"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="defaultToStandard" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareOptionList", propOrder = {
    "passengerFareOption"
})
public class PassengerFareOptionList {

    @XmlElement(required = true)
    protected List<PassengerFareOption> passengerFareOption;
    @XmlAttribute(name = "defaultToStandard")
    protected Boolean defaultToStandard;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerFareOptionList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerFareOptionList(final List<PassengerFareOption> passengerFareOption, final Boolean defaultToStandard) {
        this.passengerFareOption = passengerFareOption;
        this.defaultToStandard = defaultToStandard;
    }

    /**
     * Gets the value of the passengerFareOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerFareOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerFareOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFareOption }
     * 
     * 
     */
    public List<PassengerFareOption> getPassengerFareOption() {
        if (passengerFareOption == null) {
            passengerFareOption = new ArrayList<PassengerFareOption>();
        }
        return this.passengerFareOption;
    }

    /**
     * Obtiene el valor de la propiedad defaultToStandard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultToStandard() {
        return defaultToStandard;
    }

    /**
     * Define el valor de la propiedad defaultToStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultToStandard(Boolean value) {
        this.defaultToStandard = value;
    }

}
