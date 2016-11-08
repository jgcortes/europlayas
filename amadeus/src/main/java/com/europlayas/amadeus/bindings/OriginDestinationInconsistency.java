
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to origin / destination pairs.
 * 
 * <p>Clase Java para OriginDestinationInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="cause" use="required" type="{http://ws.amadeus.fr/air}OriginDestinationInconsistencyCause" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInconsistency")
public class OriginDestinationInconsistency implements Serializable
{

    @XmlAttribute(name = "cause", required = true)
    protected OriginDestinationInconsistencyCause cause;

    /**
     * Default no-arg constructor
     * 
     */
    public OriginDestinationInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OriginDestinationInconsistency(final OriginDestinationInconsistencyCause cause) {
        this.cause = cause;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInconsistencyCause }
     *     
     */
    public OriginDestinationInconsistencyCause getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInconsistencyCause }
     *     
     */
    public void setCause(OriginDestinationInconsistencyCause value) {
        this.cause = value;
    }

}
