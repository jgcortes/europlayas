
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to itineraries.
 * 
 * <p>Clase Java para ItineraryInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItineraryInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="cause" use="required" type="{http://ws.amadeus.fr/air}ItineraryInconsistencyCause" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryInconsistency")
public class ItineraryInconsistency implements Serializable
{

    @XmlAttribute(name = "cause", required = true)
    protected ItineraryInconsistencyCause cause;

    /**
     * Default no-arg constructor
     * 
     */
    public ItineraryInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ItineraryInconsistency(final ItineraryInconsistencyCause cause) {
        this.cause = cause;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInconsistencyCause }
     *     
     */
    public ItineraryInconsistencyCause getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInconsistencyCause }
     *     
     */
    public void setCause(ItineraryInconsistencyCause value) {
        this.cause = value;
    }

}
