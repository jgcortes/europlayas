
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of fare types to be included during pricing.
 * 
 * <p>Clase Java para FareType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FareType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corporateCodes" type="{http://ws.amadeus.fr/air}CorporateCodeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="publishedFares" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="unifares" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="corporateUnifares" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareType", propOrder = {
    "corporateCodes"
})
public class FareType implements Serializable
{

    protected CorporateCodeList corporateCodes;
    @XmlAttribute(name = "publishedFares", required = true)
    protected boolean publishedFares;
    @XmlAttribute(name = "unifares", required = true)
    protected boolean unifares;
    @XmlAttribute(name = "corporateUnifares", required = true)
    protected boolean corporateUnifares;

    /**
     * Default no-arg constructor
     * 
     */
    public FareType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FareType(final CorporateCodeList corporateCodes, final boolean publishedFares, final boolean unifares, final boolean corporateUnifares) {
        this.corporateCodes = corporateCodes;
        this.publishedFares = publishedFares;
        this.unifares = unifares;
        this.corporateUnifares = corporateUnifares;
    }

    /**
     * Obtiene el valor de la propiedad corporateCodes.
     * 
     * @return
     *     possible object is
     *     {@link CorporateCodeList }
     *     
     */
    public CorporateCodeList getCorporateCodes() {
        return corporateCodes;
    }

    /**
     * Define el valor de la propiedad corporateCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateCodeList }
     *     
     */
    public void setCorporateCodes(CorporateCodeList value) {
        this.corporateCodes = value;
    }

    /**
     * Obtiene el valor de la propiedad publishedFares.
     * 
     */
    public boolean isPublishedFares() {
        return publishedFares;
    }

    /**
     * Define el valor de la propiedad publishedFares.
     * 
     */
    public void setPublishedFares(boolean value) {
        this.publishedFares = value;
    }

    /**
     * Obtiene el valor de la propiedad unifares.
     * 
     */
    public boolean isUnifares() {
        return unifares;
    }

    /**
     * Define el valor de la propiedad unifares.
     * 
     */
    public void setUnifares(boolean value) {
        this.unifares = value;
    }

    /**
     * Obtiene el valor de la propiedad corporateUnifares.
     * 
     */
    public boolean isCorporateUnifares() {
        return corporateUnifares;
    }

    /**
     * Define el valor de la propiedad corporateUnifares.
     * 
     */
    public void setCorporateUnifares(boolean value) {
        this.corporateUnifares = value;
    }

}
