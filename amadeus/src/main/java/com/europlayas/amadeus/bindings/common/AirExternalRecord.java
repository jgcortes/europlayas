
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirExternalRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirExternalRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}ExternalProviderRecord"&gt;
 *       &lt;attribute name="company" use="required" type="{http://ws.amadeus.fr/common}AirlineCode" /&gt;
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
    implements Serializable
{

    @XmlAttribute(name = "company", required = true)
    protected String company;

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
    public AirExternalRecord(final String locator, final LocalDateTime creationDateTime, final String company) {
        super(locator, creationDateTime);
        this.company = company;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

}
