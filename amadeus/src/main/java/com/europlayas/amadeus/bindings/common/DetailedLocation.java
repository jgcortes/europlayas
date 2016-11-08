
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.IataDetailedLocation;


/**
 * Detailed location defined in a context. Such context can be the geographic coding scheme, standard, system or industry group (e.g. UN/LOCODE, ISO, 1A, IATA, UIC) using this code for this location. Optional information include city code (typically when the location code is an airport or a rail station) and country code.
 * 
 * <p>Clase Java para DetailedLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetailedLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}Location"&gt;
 *       &lt;attribute name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="countryCode" type="{http://ws.amadeus.fr/common}CountryCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedLocation")
@XmlSeeAlso({
    IataDetailedLocation.class
})
public abstract class DetailedLocation
    extends Location
    implements Serializable
{

    @XmlAttribute(name = "cityCode")
    protected String cityCode;
    @XmlAttribute(name = "countryCode")
    protected CountryCode countryCode;

    /**
     * Default no-arg constructor
     * 
     */
    public DetailedLocation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DetailedLocation(final String code, final String cityCode, final CountryCode countryCode) {
        super(code);
        this.cityCode = cityCode;
        this.countryCode = countryCode;
    }

    /**
     * Obtiene el valor de la propiedad cityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Define el valor de la propiedad cityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

}
