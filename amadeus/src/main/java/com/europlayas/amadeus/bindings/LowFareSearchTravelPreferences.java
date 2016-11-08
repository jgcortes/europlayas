
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LowFareSearchTravelPreferences complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchTravelPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineRestrictions" type="{http://ws.amadeus.fr/air}SimpleAirlineRestrictions" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="directItineraryRestriction"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="stopsAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="connectionRestriction" type="{http://ws.amadeus.fr/air}ConnectionRestriction"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="travelClassRestrictions" type="{http://ws.amadeus.fr/air}LowFareSearchTravelClassRestrictions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="crossBorderAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFareSearchTravelPreferences", propOrder = {
    "airlineRestrictions",
    "connectionRestriction",
    "directItineraryRestriction",
    "travelClassRestrictions"
})
public class LowFareSearchTravelPreferences implements Serializable
{

    protected SimpleAirlineRestrictions airlineRestrictions;
    protected ConnectionRestriction connectionRestriction;
    protected LowFareSearchTravelPreferences.DirectItineraryRestriction directItineraryRestriction;
    protected LowFareSearchTravelClassRestrictions travelClassRestrictions;
    @XmlAttribute(name = "crossBorderAllowed")
    protected Boolean crossBorderAllowed;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchTravelPreferences() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchTravelPreferences(final SimpleAirlineRestrictions airlineRestrictions, final ConnectionRestriction connectionRestriction, final LowFareSearchTravelPreferences.DirectItineraryRestriction directItineraryRestriction, final LowFareSearchTravelClassRestrictions travelClassRestrictions, final Boolean crossBorderAllowed) {
        this.airlineRestrictions = airlineRestrictions;
        this.connectionRestriction = connectionRestriction;
        this.directItineraryRestriction = directItineraryRestriction;
        this.travelClassRestrictions = travelClassRestrictions;
        this.crossBorderAllowed = crossBorderAllowed;
    }

    /**
     * Obtiene el valor de la propiedad airlineRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAirlineRestrictions }
     *     
     */
    public SimpleAirlineRestrictions getAirlineRestrictions() {
        return airlineRestrictions;
    }

    /**
     * Define el valor de la propiedad airlineRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAirlineRestrictions }
     *     
     */
    public void setAirlineRestrictions(SimpleAirlineRestrictions value) {
        this.airlineRestrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad connectionRestriction.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRestriction }
     *     
     */
    public ConnectionRestriction getConnectionRestriction() {
        return connectionRestriction;
    }

    /**
     * Define el valor de la propiedad connectionRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRestriction }
     *     
     */
    public void setConnectionRestriction(ConnectionRestriction value) {
        this.connectionRestriction = value;
    }

    /**
     * Obtiene el valor de la propiedad directItineraryRestriction.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchTravelPreferences.DirectItineraryRestriction }
     *     
     */
    public LowFareSearchTravelPreferences.DirectItineraryRestriction getDirectItineraryRestriction() {
        return directItineraryRestriction;
    }

    /**
     * Define el valor de la propiedad directItineraryRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchTravelPreferences.DirectItineraryRestriction }
     *     
     */
    public void setDirectItineraryRestriction(LowFareSearchTravelPreferences.DirectItineraryRestriction value) {
        this.directItineraryRestriction = value;
    }

    /**
     * Obtiene el valor de la propiedad travelClassRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link LowFareSearchTravelClassRestrictions }
     *     
     */
    public LowFareSearchTravelClassRestrictions getTravelClassRestrictions() {
        return travelClassRestrictions;
    }

    /**
     * Define el valor de la propiedad travelClassRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareSearchTravelClassRestrictions }
     *     
     */
    public void setTravelClassRestrictions(LowFareSearchTravelClassRestrictions value) {
        this.travelClassRestrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad crossBorderAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderAllowed() {
        return crossBorderAllowed;
    }

    /**
     * Define el valor de la propiedad crossBorderAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderAllowed(Boolean value) {
        this.crossBorderAllowed = value;
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
     *       &lt;attribute name="stopsAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DirectItineraryRestriction implements Serializable
    {

        @XmlAttribute(name = "stopsAllowed", required = true)
        protected boolean stopsAllowed;

        /**
         * Default no-arg constructor
         * 
         */
        public DirectItineraryRestriction() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public DirectItineraryRestriction(final boolean stopsAllowed) {
            this.stopsAllowed = stopsAllowed;
        }

        /**
         * Obtiene el valor de la propiedad stopsAllowed.
         * 
         */
        public boolean isStopsAllowed() {
            return stopsAllowed;
        }

        /**
         * Define el valor de la propiedad stopsAllowed.
         * 
         */
        public void setStopsAllowed(boolean value) {
            this.stopsAllowed = value;
        }

    }

}
