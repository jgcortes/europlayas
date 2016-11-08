
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary (or bound), composed of one or more connected segments, to reach final destination.
 * 
 * <p>Clase Java para Itinerary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="segments" type="{http://ws.amadeus.fr/air}SegmentList"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {

})
public class Itinerary implements Serializable
{

    @XmlElement(required = true)
    protected SegmentList segments;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Default no-arg constructor
     * 
     */
    public Itinerary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Itinerary(final SegmentList segments, final int id) {
        this.segments = segments;
        this.id = id;
    }

    /**
     * Obtiene el valor de la propiedad segments.
     * 
     * @return
     *     possible object is
     *     {@link SegmentList }
     *     
     */
    public SegmentList getSegments() {
        return segments;
    }

    /**
     * Define el valor de la propiedad segments.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentList }
     *     
     */
    public void setSegments(SegmentList value) {
        this.segments = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
