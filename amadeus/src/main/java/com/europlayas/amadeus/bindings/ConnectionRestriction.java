
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Restriction towards number of connections. This option ensures that the system will only search for itineraries composed of segments that ensure the restriction is not violated.
 * 
 * <p>Clase Java para ConnectionRestriction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConnectionRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="maximumNumberOfConnections"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="airportChangeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionRestriction")
public class ConnectionRestriction implements Serializable
{

    @XmlAttribute(name = "maximumNumberOfConnections")
    protected BigInteger maximumNumberOfConnections;
    @XmlAttribute(name = "airportChangeAllowed")
    protected Boolean airportChangeAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public ConnectionRestriction() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ConnectionRestriction(final BigInteger maximumNumberOfConnections, final Boolean airportChangeAllowed) {
        this.maximumNumberOfConnections = maximumNumberOfConnections;
        this.airportChangeAllowed = airportChangeAllowed;
    }

    /**
     * Obtiene el valor de la propiedad maximumNumberOfConnections.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfConnections() {
        return maximumNumberOfConnections;
    }

    /**
     * Define el valor de la propiedad maximumNumberOfConnections.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfConnections(BigInteger value) {
        this.maximumNumberOfConnections = value;
    }

    /**
     * Obtiene el valor de la propiedad airportChangeAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirportChangeAllowed() {
        return airportChangeAllowed;
    }

    /**
     * Define el valor de la propiedad airportChangeAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirportChangeAllowed(Boolean value) {
        this.airportChangeAllowed = value;
    }

}
