
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Restriction towards airlines.
 * 
 * <p>Clase Java para AirlineRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AirlinesRestrictionsList"&gt;
 *       &lt;attribute name="blacklistedInEuropeanUnionAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineRestrictions")
@XmlSeeAlso({
    ProviderAirlineRestrictions.class
})
public class AirlineRestrictions
    extends AirlinesRestrictionsList
    implements Serializable
{

    @XmlAttribute(name = "blacklistedInEuropeanUnionAllowed")
    protected Boolean blacklistedInEuropeanUnionAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public AirlineRestrictions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirlineRestrictions(final List<AirlineCodeRestrictions> airlineCodeRestrictions, final Boolean blacklistedInEuropeanUnionAllowed) {
        super(airlineCodeRestrictions);
        this.blacklistedInEuropeanUnionAllowed = blacklistedInEuropeanUnionAllowed;
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
