
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConnectionPoint complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConnectionPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="firstPoint" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
 *         &lt;element name="secondPoint" type="{http://ws.amadeus.fr/air}IataLocation" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="pointType" use="required" type="{http://ws.amadeus.fr/air}ConnectionPointType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionPoint", propOrder = {

})
public class ConnectionPoint implements Serializable
{

    @XmlElement(required = true)
    protected IataLocation firstPoint;
    protected IataLocation secondPoint;
    @XmlAttribute(name = "pointType", required = true)
    protected ConnectionPointType pointType;

    /**
     * Default no-arg constructor
     * 
     */
    public ConnectionPoint() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ConnectionPoint(final IataLocation firstPoint, final IataLocation secondPoint, final ConnectionPointType pointType) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.pointType = pointType;
    }

    /**
     * Obtiene el valor de la propiedad firstPoint.
     * 
     * @return
     *     possible object is
     *     {@link IataLocation }
     *     
     */
    public IataLocation getFirstPoint() {
        return firstPoint;
    }

    /**
     * Define el valor de la propiedad firstPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link IataLocation }
     *     
     */
    public void setFirstPoint(IataLocation value) {
        this.firstPoint = value;
    }

    /**
     * Obtiene el valor de la propiedad secondPoint.
     * 
     * @return
     *     possible object is
     *     {@link IataLocation }
     *     
     */
    public IataLocation getSecondPoint() {
        return secondPoint;
    }

    /**
     * Define el valor de la propiedad secondPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link IataLocation }
     *     
     */
    public void setSecondPoint(IataLocation value) {
        this.secondPoint = value;
    }

    /**
     * Obtiene el valor de la propiedad pointType.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionPointType }
     *     
     */
    public ConnectionPointType getPointType() {
        return pointType;
    }

    /**
     * Define el valor de la propiedad pointType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionPointType }
     *     
     */
    public void setPointType(ConnectionPointType value) {
        this.pointType = value;
    }

}
