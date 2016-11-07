
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details for additional services (sum for all segments of all itineraries and for all passengers).
 * 
 * <p>Clase Java para BookRequestAdditionalServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookRequestAdditionalServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="luggage" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="seat" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="meal" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookRequestAdditionalServices", propOrder = {

})
public class BookRequestAdditionalServices {

    protected CurrencyAmount luggage;
    protected CurrencyAmount seat;
    protected CurrencyAmount meal;

    /**
     * Default no-arg constructor
     * 
     */
    public BookRequestAdditionalServices() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookRequestAdditionalServices(final CurrencyAmount luggage, final CurrencyAmount seat, final CurrencyAmount meal) {
        this.luggage = luggage;
        this.seat = seat;
        this.meal = meal;
    }

    /**
     * Obtiene el valor de la propiedad luggage.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getLuggage() {
        return luggage;
    }

    /**
     * Define el valor de la propiedad luggage.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setLuggage(CurrencyAmount value) {
        this.luggage = value;
    }

    /**
     * Obtiene el valor de la propiedad seat.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getSeat() {
        return seat;
    }

    /**
     * Define el valor de la propiedad seat.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setSeat(CurrencyAmount value) {
        this.seat = value;
    }

    /**
     * Obtiene el valor de la propiedad meal.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getMeal() {
        return meal;
    }

    /**
     * Define el valor de la propiedad meal.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setMeal(CurrencyAmount value) {
        this.meal = value;
    }

}
