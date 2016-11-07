
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to a set of fare types.
 * 
 * <p>Clase Java para FareTypeInconsistencyWithCause complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FareTypeInconsistencyWithCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="requestedFareType" type="{http://ws.amadeus.fr/air}FareType"/&gt;
 *         &lt;element name="defaultFareType" type="{http://ws.amadeus.fr/air}FareType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="cause" use="required" type="{http://ws.amadeus.fr/air}FareTypeInconsistencyCause" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareTypeInconsistencyWithCause", propOrder = {

})
public class FareTypeInconsistencyWithCause {

    @XmlElement(required = true)
    protected FareType requestedFareType;
    @XmlElement(required = true)
    protected FareType defaultFareType;
    @XmlAttribute(name = "cause", required = true)
    protected FareTypeInconsistencyCause cause;

    /**
     * Default no-arg constructor
     * 
     */
    public FareTypeInconsistencyWithCause() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FareTypeInconsistencyWithCause(final FareType requestedFareType, final FareType defaultFareType, final FareTypeInconsistencyCause cause) {
        this.requestedFareType = requestedFareType;
        this.defaultFareType = defaultFareType;
        this.cause = cause;
    }

    /**
     * Obtiene el valor de la propiedad requestedFareType.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getRequestedFareType() {
        return requestedFareType;
    }

    /**
     * Define el valor de la propiedad requestedFareType.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setRequestedFareType(FareType value) {
        this.requestedFareType = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultFareType.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getDefaultFareType() {
        return defaultFareType;
    }

    /**
     * Define el valor de la propiedad defaultFareType.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setDefaultFareType(FareType value) {
        this.defaultFareType = value;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeInconsistencyCause }
     *     
     */
    public FareTypeInconsistencyCause getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeInconsistencyCause }
     *     
     */
    public void setCause(FareTypeInconsistencyCause value) {
        this.cause = value;
    }

}
