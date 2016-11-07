
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Detailed itinerary (see type Itinerary), composed of one or more detailed segments used by the AvailabilitySearchResponse.
 * 
 * <p>Clase Java para AvailabilitySearchResponseDetailedItinerary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchResponseDetailedItinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="segments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="segment" type="{http://ws.amadeus.fr/air}AvailabilitySearchResponseDetailedSegment" maxOccurs="9"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySearchResponseDetailedItinerary", propOrder = {

})
public class AvailabilitySearchResponseDetailedItinerary {

    @XmlElement(required = true)
    protected AvailabilitySearchResponseDetailedItinerary.Segments segments;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "duration")
    protected Duration duration;

    /**
     * Default no-arg constructor
     * 
     */
    public AvailabilitySearchResponseDetailedItinerary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AvailabilitySearchResponseDetailedItinerary(final AvailabilitySearchResponseDetailedItinerary.Segments segments, final int id, final Duration duration) {
        this.segments = segments;
        this.id = id;
        this.duration = duration;
    }

    /**
     * Obtiene el valor de la propiedad segments.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilitySearchResponseDetailedItinerary.Segments }
     *     
     */
    public AvailabilitySearchResponseDetailedItinerary.Segments getSegments() {
        return segments;
    }

    /**
     * Define el valor de la propiedad segments.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilitySearchResponseDetailedItinerary.Segments }
     *     
     */
    public void setSegments(AvailabilitySearchResponseDetailedItinerary.Segments value) {
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

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="segment" type="{http://ws.amadeus.fr/air}AvailabilitySearchResponseDetailedSegment" maxOccurs="9"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "segment"
    })
    public static class Segments {

        @XmlElement(required = true)
        protected List<AvailabilitySearchResponseDetailedSegment> segment;

        /**
         * Default no-arg constructor
         * 
         */
        public Segments() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Segments(final List<AvailabilitySearchResponseDetailedSegment> segment) {
            this.segment = segment;
        }

        /**
         * Gets the value of the segment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailabilitySearchResponseDetailedSegment }
         * 
         * 
         */
        public List<AvailabilitySearchResponseDetailedSegment> getSegment() {
            if (segment == null) {
                segment = new ArrayList<AvailabilitySearchResponseDetailedSegment>();
            }
            return this.segment;
        }

    }

}
