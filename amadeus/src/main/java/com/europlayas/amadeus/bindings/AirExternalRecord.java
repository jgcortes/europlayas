
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.europlayas.amadeus.bindings.common.ExternalProviderRecord;


/**
 * <p>Clase Java para AirExternalRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirExternalRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}ExternalProviderRecord"&gt;
 *       &lt;attribute name="airline" use="required" type="{http://ws.amadeus.fr/air}AirlineCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirExternalRecord")
public class AirExternalRecord
    extends ExternalProviderRecord
{

    @XmlAttribute(name = "airline", required = true)
    protected String airline;

    /**
     * Default no-arg constructor
     * 
     */
    public AirExternalRecord() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirExternalRecord(final String locator, final XMLGregorianCalendar creationDateTime, final String airline) {
        super(locator, creationDateTime);
        this.airline = airline;
    }

    /**
     * Obtiene el valor de la propiedad airline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Define el valor de la propiedad airline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

}
