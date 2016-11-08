
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.CountryCode;


/**
 * Airport identified by a IATA code. The location can be more accurate, such as a terminal in this airport. 
 * 
 * <p>Clase Java para Airport complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Airport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}IataDetailedLocation"&gt;
 *       &lt;attribute name="terminal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Airport")
public class Airport
    extends IataDetailedLocation
    implements Serializable
{

    @XmlAttribute(name = "terminal")
    protected String terminal;

    /**
     * Default no-arg constructor
     * 
     */
    public Airport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Airport(final String code, final String cityCode, final CountryCode countryCode, final String terminal) {
        super(code, cityCode, countryCode);
        this.terminal = terminal;
    }

    /**
     * Obtiene el valor de la propiedad terminal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

}
