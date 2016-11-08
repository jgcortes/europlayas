
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Frequent Flyer information.
 * 
 * <p>Clase Java para FrequentFlyer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FrequentFlyer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}AirLoyaltyProgram"&gt;
 *       &lt;attribute name="airlineCode" use="required" type="{http://ws.amadeus.fr/common}AirlineCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyer")
public class FrequentFlyer
    extends AirLoyaltyProgram
    implements Serializable
{

    @XmlAttribute(name = "airlineCode", required = true)
    protected String airlineCode;

    /**
     * Default no-arg constructor
     * 
     */
    public FrequentFlyer() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FrequentFlyer(final String number, final String airlineCode) {
        super(number);
        this.airlineCode = airlineCode;
    }

    /**
     * Obtiene el valor de la propiedad airlineCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Define el valor de la propiedad airlineCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

}
