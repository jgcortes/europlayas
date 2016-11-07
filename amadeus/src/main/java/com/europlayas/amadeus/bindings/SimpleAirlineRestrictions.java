
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Restriction towards airlines
 * 
 * <p>Clase Java para SimpleAirlineRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SimpleAirlineRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="airlineCodeRestrictions" type="{http://ws.amadeus.fr/air}SimpleAirlineCodeRestrictions" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="blacklistedInEUAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleAirlineRestrictions", propOrder = {

})
public class SimpleAirlineRestrictions {

    protected SimpleAirlineCodeRestrictions airlineCodeRestrictions;
    @XmlAttribute(name = "blacklistedInEUAllowed")
    protected Boolean blacklistedInEUAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public SimpleAirlineRestrictions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SimpleAirlineRestrictions(final SimpleAirlineCodeRestrictions airlineCodeRestrictions, final Boolean blacklistedInEUAllowed) {
        this.airlineCodeRestrictions = airlineCodeRestrictions;
        this.blacklistedInEUAllowed = blacklistedInEUAllowed;
    }

    /**
     * Obtiene el valor de la propiedad airlineCodeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAirlineCodeRestrictions }
     *     
     */
    public SimpleAirlineCodeRestrictions getAirlineCodeRestrictions() {
        return airlineCodeRestrictions;
    }

    /**
     * Define el valor de la propiedad airlineCodeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAirlineCodeRestrictions }
     *     
     */
    public void setAirlineCodeRestrictions(SimpleAirlineCodeRestrictions value) {
        this.airlineCodeRestrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad blacklistedInEUAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlacklistedInEUAllowed() {
        return blacklistedInEUAllowed;
    }

    /**
     * Define el valor de la propiedad blacklistedInEUAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlacklistedInEUAllowed(Boolean value) {
        this.blacklistedInEUAllowed = value;
    }

}
