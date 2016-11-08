
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
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
    "connectionPoints"
})
public class ConnectionPoints implements Serializable
{

    @XmlElement(name = "connectionPoint", required = true)
    protected List<ConnectionPoint> connectionPoints;

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
    public ConnectionPoints(final List<ConnectionPoint> connectionPoints) {
        this.connectionPoints = connectionPoints;
    }

    /**
     * Gets the value of the connectionPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionPoint }
     * 
     * 
     */
    public List<ConnectionPoint> getConnectionPoints() {
        if (connectionPoints == null) {
            connectionPoints = new ArrayList<ConnectionPoint>();
        }
        return this.connectionPoints;
    }

}
