
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Restriction towards airlines.
 * 
 * <p>Clase Java para LowFareSearchAirlineRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchAirlineRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://ws.amadeus.fr/air}AirlineRestrictionsGroup" minOccurs="0"/&gt;
 *       &lt;attribute name="blacklistedInEuropeanUnionAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFareSearchAirlineRestrictions", propOrder = {
    "excludedAirlines",
    "includedAirlines"
})
public class LowFareSearchAirlineRestrictions implements Serializable
{

    protected AirlineCodeList excludedAirlines;
    protected AirlineCodeList includedAirlines;
    @XmlAttribute(name = "blacklistedInEuropeanUnionAllowed")
    protected Boolean blacklistedInEuropeanUnionAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchAirlineRestrictions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchAirlineRestrictions(final AirlineCodeList excludedAirlines, final AirlineCodeList includedAirlines, final Boolean blacklistedInEuropeanUnionAllowed) {
        this.excludedAirlines = excludedAirlines;
        this.includedAirlines = includedAirlines;
        this.blacklistedInEuropeanUnionAllowed = blacklistedInEuropeanUnionAllowed;
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

    /**
     * Obtiene el valor de la propiedad blacklistedInEuropeanUnionAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlacklistedInEuropeanUnionAllowed() {
        return blacklistedInEuropeanUnionAllowed;
    }

    /**
     * Define el valor de la propiedad blacklistedInEuropeanUnionAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlacklistedInEuropeanUnionAllowed(Boolean value) {
        this.blacklistedInEuropeanUnionAllowed = value;
    }

}
