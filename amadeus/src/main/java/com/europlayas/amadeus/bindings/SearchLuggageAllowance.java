
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchLuggageAllowance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchLuggageAllowance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="numberOfPieces" type="{http://ws.amadeus.fr/common}Unsigned0To99Byte"/&gt;
 *         &lt;element name="totalWeightAllowed" type="{http://ws.amadeus.fr/common}Unsigned0To1000Short"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLuggageAllowance", propOrder = {
    "totalWeightAllowed",
    "numberOfPieces"
})
public class SearchLuggageAllowance implements Serializable
{

    @XmlSchemaType(name = "unsignedShort")
    protected Integer totalWeightAllowed;
    @XmlSchemaType(name = "unsignedByte")
    protected Short numberOfPieces;

    /**
     * Default no-arg constructor
     * 
     */
    public SearchLuggageAllowance() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchLuggageAllowance(final Integer totalWeightAllowed, final Short numberOfPieces) {
        this.totalWeightAllowed = totalWeightAllowed;
        this.numberOfPieces = numberOfPieces;
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

    /**
     * Obtiene el valor de la propiedad numberOfPieces.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Define el valor de la propiedad numberOfPieces.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfPieces(Short value) {
        this.numberOfPieces = value;
    }

}
