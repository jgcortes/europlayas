
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Remark for airline
 * 
 * <p>Clase Java para AirlineRemark complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineRemark"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AbstractRemark"&gt;
 *       &lt;attribute name="airlineCode" use="required" type="{http://ws.amadeus.fr/air}AirlineCode" /&gt;
 *       &lt;attribute name="type" type="{http://ws.amadeus.fr/air}AirlineRemarkType" default="OSI" /&gt;
 *       &lt;attribute name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineRemark")
public class AirlineRemark
    extends AbstractRemark
    implements Serializable
{

    @XmlAttribute(name = "airlineCode", required = true)
    protected String airlineCode;
    @XmlAttribute(name = "type")
    protected AirlineRemarkType type;
    @XmlAttribute(name = "keyword")
    protected String keyword;

    /**
     * Default no-arg constructor
     * 
     */
    public AirlineRemark() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirlineRemark(final String text, final String airlineCode, final AirlineRemarkType type, final String keyword) {
        super(text);
        this.airlineCode = airlineCode;
        this.type = type;
        this.keyword = keyword;
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

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link AirlineRemarkType }
     *     
     */
    public AirlineRemarkType getType() {
        if (type == null) {
            return AirlineRemarkType.OSI;
        } else {
            return type;
        }
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineRemarkType }
     *     
     */
    public void setType(AirlineRemarkType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad keyword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Define el valor de la propiedad keyword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

}
