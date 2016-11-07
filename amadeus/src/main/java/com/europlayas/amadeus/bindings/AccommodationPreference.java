
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Accommodation preference, which could be a seat, cabin or sleeping accommodation for example.
 * 
 * <p>Clase Java para AccommodationPreference complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccommodationPreference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="seatNumber" type="{http://ws.amadeus.fr/air}SeatNumber"/&gt;
 *         &lt;element name="seatPosition" type="{http://ws.amadeus.fr/air}SeatPosition"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="mealCode" type="{http://ws.amadeus.fr/air}MealCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationPreference", propOrder = {
    "seatNumber",
    "seatPosition"
})
@XmlSeeAlso({
    SegmentAccommodationPreference.class
})
public class AccommodationPreference {

    protected String seatNumber;
    @XmlSchemaType(name = "string")
    protected SeatPosition seatPosition;
    @XmlAttribute(name = "mealCode")
    protected MealCode mealCode;

    /**
     * Default no-arg constructor
     * 
     */
    public AccommodationPreference() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AccommodationPreference(final String seatNumber, final SeatPosition seatPosition, final MealCode mealCode) {
        this.seatNumber = seatNumber;
        this.seatPosition = seatPosition;
        this.mealCode = mealCode;
    }

    /**
     * Obtiene el valor de la propiedad seatNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Define el valor de la propiedad seatNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad seatPosition.
     * 
     * @return
     *     possible object is
     *     {@link SeatPosition }
     *     
     */
    public SeatPosition getSeatPosition() {
        return seatPosition;
    }

    /**
     * Define el valor de la propiedad seatPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatPosition }
     *     
     */
    public void setSeatPosition(SeatPosition value) {
        this.seatPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad mealCode.
     * 
     * @return
     *     possible object is
     *     {@link MealCode }
     *     
     */
    public MealCode getMealCode() {
        return mealCode;
    }

    /**
     * Define el valor de la propiedad mealCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MealCode }
     *     
     */
    public void setMealCode(MealCode value) {
        this.mealCode = value;
    }

}
