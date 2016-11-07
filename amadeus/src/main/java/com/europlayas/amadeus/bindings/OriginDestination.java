
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Origin area / destination area pair (OD).
 * 
 * <p>Clase Java para OriginDestination complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OriginDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origin" type="{http://ws.amadeus.fr/air}Area"/&gt;
 *         &lt;element name="destination" type="{http://ws.amadeus.fr/air}Area"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="departureDateTimeRange" type="{http://ws.amadeus.fr/air}DateTimeRange"/&gt;
 *           &lt;element name="arrivalDateTimeRange" type="{http://ws.amadeus.fr/air}DateTimeRange"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestination", propOrder = {
    "origin",
    "destination",
    "departureDateTimeRange",
    "arrivalDateTimeRange"
})
public class OriginDestination {

    @XmlElement(required = true)
    protected Area origin;
    @XmlElement(required = true)
    protected Area destination;
    protected DateTimeRange departureDateTimeRange;
    protected DateTimeRange arrivalDateTimeRange;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Default no-arg constructor
     * 
     */
    public OriginDestination() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OriginDestination(final Area origin, final Area destination, final DateTimeRange departureDateTimeRange, final DateTimeRange arrivalDateTimeRange, final int id) {
        this.origin = origin;
        this.destination = destination;
        this.departureDateTimeRange = departureDateTimeRange;
        this.arrivalDateTimeRange = arrivalDateTimeRange;
        this.id = id;
    }

    /**
     * Obtiene el valor de la propiedad origin.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setOrigin(Area value) {
        this.origin = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setDestination(Area value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDateTimeRange.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRange }
     *     
     */
    public DateTimeRange getDepartureDateTimeRange() {
        return departureDateTimeRange;
    }

    /**
     * Define el valor de la propiedad departureDateTimeRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRange }
     *     
     */
    public void setDepartureDateTimeRange(DateTimeRange value) {
        this.departureDateTimeRange = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDateTimeRange.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRange }
     *     
     */
    public DateTimeRange getArrivalDateTimeRange() {
        return arrivalDateTimeRange;
    }

    /**
     * Define el valor de la propiedad arrivalDateTimeRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRange }
     *     
     */
    public void setArrivalDateTimeRange(DateTimeRange value) {
        this.arrivalDateTimeRange = value;
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
