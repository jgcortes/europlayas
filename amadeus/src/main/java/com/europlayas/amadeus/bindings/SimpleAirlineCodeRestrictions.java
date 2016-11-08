
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SimpleAirlineCodeRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SimpleAirlineCodeRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://ws.amadeus.fr/air}AirlineRestrictionsGroup" minOccurs="0"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleAirlineCodeRestrictions", propOrder = {
    "excludedAirlines",
    "includedAirlines"
})
public class SimpleAirlineCodeRestrictions implements Serializable
{

    protected AirlineCodeList excludedAirlines;
    protected AirlineCodeList includedAirlines;

    /**
     * Default no-arg constructor
     * 
     */
    public SimpleAirlineCodeRestrictions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SimpleAirlineCodeRestrictions(final AirlineCodeList excludedAirlines, final AirlineCodeList includedAirlines) {
        this.excludedAirlines = excludedAirlines;
        this.includedAirlines = includedAirlines;
    }

    /**
     * Obtiene el valor de la propiedad excludedAirlines.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCodeList }
     *     
     */
    public AirlineCodeList getExcludedAirlines() {
        return excludedAirlines;
    }

    /**
     * Define el valor de la propiedad excludedAirlines.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCodeList }
     *     
     */
    public void setExcludedAirlines(AirlineCodeList value) {
        this.excludedAirlines = value;
    }

    /**
     * Obtiene el valor de la propiedad includedAirlines.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCodeList }
     *     
     */
    public AirlineCodeList getIncludedAirlines() {
        return includedAirlines;
    }

    /**
     * Define el valor de la propiedad includedAirlines.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCodeList }
     *     
     */
    public void setIncludedAirlines(AirlineCodeList value) {
        this.includedAirlines = value;
    }

}
