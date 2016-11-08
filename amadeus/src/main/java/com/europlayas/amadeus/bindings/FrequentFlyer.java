
package com.europlayas.amadeus.bindings;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="frequentFlyerNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="airlineCode" use="required" type="{http://ws.amadeus.fr/common}AirlineCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyer")
public class FrequentFlyer implements Serializable
{

    @XmlAttribute(name = "frequentFlyerNumber", required = true)
    protected String frequentFlyerNumber;
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
    public FrequentFlyer(final String frequentFlyerNumber, final String airlineCode) {
        this.frequentFlyerNumber = frequentFlyerNumber;
        this.airlineCode = airlineCode;
    }

    /**
     * Obtiene el valor de la propiedad frequentFlyerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    /**
     * Define el valor de la propiedad frequentFlyerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyerNumber(String value) {
        this.frequentFlyerNumber = value;
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
