
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Luggage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Luggage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="numberOfPieces" use="required" type="{http://ws.amadeus.fr/air}NumberOfPiecesOfLuggage" /&gt;
 *       &lt;attribute name="totalWeightAllowed" type="{http://ws.amadeus.fr/air}LuggageTotalWeightAllowed" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Luggage", propOrder = {

})
public class Luggage {

    @XmlElement(required = true)
    protected ItineraryIdList itineraries;
    @XmlAttribute(name = "numberOfPieces", required = true)
    protected short numberOfPieces;
    @XmlAttribute(name = "totalWeightAllowed")
    protected Integer totalWeightAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public Luggage() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Luggage(final ItineraryIdList itineraries, final short numberOfPieces, final Integer totalWeightAllowed) {
        this.itineraries = itineraries;
        this.numberOfPieces = numberOfPieces;
        this.totalWeightAllowed = totalWeightAllowed;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryIdList }
     *     
     */
    public ItineraryIdList getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryIdList }
     *     
     */
    public void setItineraries(ItineraryIdList value) {
        this.itineraries = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfPieces.
     * 
     */
    public short getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Define el valor de la propiedad numberOfPieces.
     * 
     */
    public void setNumberOfPieces(short value) {
        this.numberOfPieces = value;
    }

    /**
     * Obtiene el valor de la propiedad totalWeightAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalWeightAllowed() {
        return totalWeightAllowed;
    }

    /**
     * Define el valor de la propiedad totalWeightAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalWeightAllowed(Integer value) {
        this.totalWeightAllowed = value;
    }

}
