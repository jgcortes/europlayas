
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Journey, composed of one or more itineraries, each having its own origin and final destination. A one-way journey requires only one itinerary. A round trip requires two, the first one is the outbound trip, the second one is the inbound trip (origin city and final destination city reversed). An open-jaw journey requires two involving more than two distinct cities. A multi-destination journey requires three or more. 
 * 
 * <p>Clase Java para Journey complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Journey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="itineraries"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}Itinerary" maxOccurs="6"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journey", propOrder = {

})
public class Journey {

    @XmlElement(required = true)
    protected Journey.Itineraries itineraries;

    /**
     * Default no-arg constructor
     * 
     */
    public Journey() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Journey(final Journey.Itineraries itineraries) {
        this.itineraries = itineraries;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link Journey.Itineraries }
     *     
     */
    public Journey.Itineraries getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link Journey.Itineraries }
     *     
     */
    public void setItineraries(Journey.Itineraries value) {
        this.itineraries = value;
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
     *         &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}Itinerary" maxOccurs="6"/&gt;
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
        "itinerary"
    })
    public static class Itineraries {

        @XmlElement(required = true)
        protected List<Itinerary> itinerary;

        /**
         * Default no-arg constructor
         * 
         */
        public Itineraries() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Itineraries(final List<Itinerary> itinerary) {
            this.itinerary = itinerary;
        }

        /**
         * Gets the value of the itinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Itinerary }
         * 
         * 
         */
        public List<Itinerary> getItinerary() {
            if (itinerary == null) {
                itinerary = new ArrayList<Itinerary>();
            }
            return this.itinerary;
        }

    }

}
