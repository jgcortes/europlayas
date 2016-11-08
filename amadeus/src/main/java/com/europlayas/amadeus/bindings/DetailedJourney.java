
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailed journey (see type Journey), composed of one or more detailed itineraries.
 * 
 * <p>Clase Java para DetailedJourney complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetailedJourney"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="itineraries"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}DetailedItinerary" maxOccurs="6"/&gt;
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
@XmlType(name = "DetailedJourney", propOrder = {

})
public class DetailedJourney implements Serializable
{

    @XmlElement(required = true)
    protected DetailedJourney.Itineraries itineraries;

    /**
     * Default no-arg constructor
     * 
     */
    public DetailedJourney() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DetailedJourney(final DetailedJourney.Itineraries itineraries) {
        this.itineraries = itineraries;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link DetailedJourney.Itineraries }
     *     
     */
    public DetailedJourney.Itineraries getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedJourney.Itineraries }
     *     
     */
    public void setItineraries(DetailedJourney.Itineraries value) {
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
     *         &lt;element name="itinerary" type="{http://ws.amadeus.fr/air}DetailedItinerary" maxOccurs="6"/&gt;
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
        "itineraries"
    })
    public static class Itineraries implements Serializable
    {

        @XmlElement(name = "itinerary", required = true)
        protected List<DetailedItinerary> itineraries;

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
        public Itineraries(final List<DetailedItinerary> itineraries) {
            this.itineraries = itineraries;
        }

        /**
         * Gets the value of the itineraries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itineraries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItineraries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DetailedItinerary }
         * 
         * 
         */
        public List<DetailedItinerary> getItineraries() {
            if (itineraries == null) {
                itineraries = new ArrayList<DetailedItinerary>();
            }
            return this.itineraries;
        }

    }

}
