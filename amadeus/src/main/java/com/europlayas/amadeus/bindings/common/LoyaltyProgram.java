
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information regarding membership of a loyalty program (or subscription to such program), e.g. loyalty card, rewards card, points card, advantage card, club card, etc. including online loyalty program without traditional card (i.e. having an electronic equivalent).
 * 
 * <p>Clase Java para LoyaltyProgram complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgram")
@XmlSeeAlso({
    AirLoyaltyProgram.class
})
public abstract class LoyaltyProgram implements Serializable
{

    @XmlAttribute(name = "number", required = true)
    protected String number;

    /**
     * Default no-arg constructor
     * 
     */
    public LoyaltyProgram() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoyaltyProgram(final String number) {
        this.number = number;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
