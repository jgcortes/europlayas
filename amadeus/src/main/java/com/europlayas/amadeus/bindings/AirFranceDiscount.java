
package com.europlayas.amadeus.bindings;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirFranceDiscount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirFranceDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AirDiscount"&gt;
 *       &lt;attribute name="number" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirFranceDiscount")
@XmlSeeAlso({
    AirFranceMetropolitanDiscount.class,
    AirFranceDomDiscount.class,
    AirFranceCombinedDiscount.class
})
public abstract class AirFranceDiscount
    extends AirDiscount
{

    @XmlAttribute(name = "number", required = true)
    protected BigInteger number;

    /**
     * Default no-arg constructor
     * 
     */
    public AirFranceDiscount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirFranceDiscount(final BigInteger number) {
        super();
        this.number = number;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}
