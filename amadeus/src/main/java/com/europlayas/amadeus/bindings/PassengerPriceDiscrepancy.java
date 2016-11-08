
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PassengerPriceDiscrepancy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerPriceDiscrepancy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="passenger" type="{http://ws.amadeus.fr/air}NamedPassenger"/&gt;
 *         &lt;element name="requestedPrice" type="{http://ws.amadeus.fr/air}BookRequestPassengerPricing"/&gt;
 *         &lt;element name="actualPassengerPrice" type="{http://ws.amadeus.fr/air}BookResponsePassengerPricing"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerPriceDiscrepancy", propOrder = {

})
public class PassengerPriceDiscrepancy implements Serializable
{

    @XmlElement(required = true)
    protected NamedPassenger passenger;
    @XmlElement(required = true)
    protected BookRequestPassengerPricing requestedPrice;
    @XmlElement(required = true)
    protected BookResponsePassengerPricing actualPassengerPrice;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerPriceDiscrepancy() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerPriceDiscrepancy(final NamedPassenger passenger, final BookRequestPassengerPricing requestedPrice, final BookResponsePassengerPricing actualPassengerPrice) {
        this.passenger = passenger;
        this.requestedPrice = requestedPrice;
        this.actualPassengerPrice = actualPassengerPrice;
    }

    /**
     * Obtiene el valor de la propiedad passenger.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassenger }
     *     
     */
    public NamedPassenger getPassenger() {
        return passenger;
    }

    /**
     * Define el valor de la propiedad passenger.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassenger }
     *     
     */
    public void setPassenger(NamedPassenger value) {
        this.passenger = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedPrice.
     * 
     * @return
     *     possible object is
     *     {@link BookRequestPassengerPricing }
     *     
     */
    public BookRequestPassengerPricing getRequestedPrice() {
        return requestedPrice;
    }

    /**
     * Define el valor de la propiedad requestedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BookRequestPassengerPricing }
     *     
     */
    public void setRequestedPrice(BookRequestPassengerPricing value) {
        this.requestedPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPassengerPrice.
     * 
     * @return
     *     possible object is
     *     {@link BookResponsePassengerPricing }
     *     
     */
    public BookResponsePassengerPricing getActualPassengerPrice() {
        return actualPassengerPrice;
    }

    /**
     * Define el valor de la propiedad actualPassengerPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponsePassengerPricing }
     *     
     */
    public void setActualPassengerPrice(BookResponsePassengerPricing value) {
        this.actualPassengerPrice = value;
    }

}
