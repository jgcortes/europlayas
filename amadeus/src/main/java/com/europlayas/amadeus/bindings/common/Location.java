
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.IataLocation;


/**
 * Location defined in a context. Such context can be the geographic coding scheme, standard, system or industry group (e.g. UN/LOCODE, ISO, 1A, IATA, UIC) using this code for this location.
 * 
 * <p>Clase Java para Location complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location")
@XmlSeeAlso({
    IataLocation.class,
    DetailedLocation.class,
    UnLocodeLocation.class
})
public abstract class Location implements Serializable
{

    @XmlAttribute(name = "code", required = true)
    protected String code;

    /**
     * Default no-arg constructor
     * 
     */
    public Location() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Location(final String code) {
        this.code = code;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
