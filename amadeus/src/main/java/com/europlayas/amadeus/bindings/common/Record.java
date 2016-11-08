
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.europlayas.amadeus.util.DateTimeAdapter;


/**
 * Booking information, confirmed and stored in a record, typically a Passenger Name Record (PNR), in the provider GDS or system.
 * 
 * <p>Clase Java para Record complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="creationDateTime" type="{http://ws.amadeus.fr/common}UtcDateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record")
@XmlSeeAlso({
    AmadeusRecord.class,
    ExternalProviderRecord.class
})
public abstract class Record implements Serializable
{

    @XmlAttribute(name = "locator", required = true)
    protected String locator;
    @XmlAttribute(name = "creationDateTime")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    protected LocalDateTime creationDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public Record() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Record(final String locator, final LocalDateTime creationDateTime) {
        this.locator = locator;
        this.creationDateTime = creationDateTime;
    }

    /**
     * Obtiene el valor de la propiedad locator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Define el valor de la propiedad locator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Define el valor de la propiedad creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(LocalDateTime value) {
        this.creationDateTime = value;
    }

}
