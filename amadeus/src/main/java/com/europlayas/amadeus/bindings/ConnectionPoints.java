
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConnectionPoints complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConnectionPoints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="3"&gt;
 *         &lt;element name="connectionPoint" type="{http://ws.amadeus.fr/air}ConnectionPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionPoints", propOrder = {
    "connectionPoint"
})
public class ConnectionPoints {

    @XmlElement(required = true)
    protected List<ConnectionPoint> connectionPoint;

    /**
     * Default no-arg constructor
     * 
     */
    public ConnectionPoints() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ConnectionPoints(final List<ConnectionPoint> connectionPoint) {
        this.connectionPoint = connectionPoint;
    }

    /**
     * Gets the value of the connectionPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionPoint }
     * 
     * 
     */
    public List<ConnectionPoint> getConnectionPoint() {
        if (connectionPoint == null) {
            connectionPoint = new ArrayList<ConnectionPoint>();
        }
        return this.connectionPoint;
    }

}
