
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic passenger information, for a passenger occupying a seat and having additional services.
 * 
 * <p>Clase Java para SeatedPassengerWithServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeatedPassengerWithServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Passenger"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "SeatedPassengerWithServices", propOrder = {
    "additionalServices"
})
@XmlSeeAlso({
    NonInfantHoldingSeatedPassengerWithServices.class,
    InfantHoldingSeatedPassengerWithServices.class
})
public abstract class SeatedPassengerWithServices
    extends Passenger
{

    protected SeatedPassengerAdditionalServices additionalServices;

    /**
     * Default no-arg constructor
     * 
     */
    public SeatedPassengerWithServices() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeatedPassengerWithServices(final int id, final SeatedPassengerAdditionalServices additionalServices) {
        super(id);
        this.additionalServices = additionalServices;
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

}
