
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Present when currency is inconsistent.
 * 
 * <p>Clase Java para CurrencyInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CurrencyInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="noDefaultCurrencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyInconsistency")
public class CurrencyInconsistency implements Serializable
{

    @XmlAttribute(name = "noDefaultCurrencyCode", required = true)
    protected boolean noDefaultCurrencyCode;

    /**
     * Default no-arg constructor
     * 
     */
    public CurrencyInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CurrencyInconsistency(final boolean noDefaultCurrencyCode) {
        this.noDefaultCurrencyCode = noDefaultCurrencyCode;
    }

    /**
     * Obtiene el valor de la propiedad noDefaultCurrencyCode.
     * 
     */
    public boolean isNoDefaultCurrencyCode() {
        return noDefaultCurrencyCode;
    }

    /**
     * Define el valor de la propiedad noDefaultCurrencyCode.
     * 
     */
    public void setNoDefaultCurrencyCode(boolean value) {
        this.noDefaultCurrencyCode = value;
    }

}
