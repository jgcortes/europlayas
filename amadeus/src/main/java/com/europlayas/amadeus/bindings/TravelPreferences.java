
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TravelPreferences complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TravelPreferences"&gt;
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
 *         &lt;element name="travelClassRestriction" type="{http://ws.amadeus.fr/air}TravelClass" minOccurs="0"/&gt;
 *         &lt;element name="bookingClassCode" type="{http://ws.amadeus.fr/air}BookingClassCode" minOccurs="0"/&gt;
 *         &lt;element name="negotiatedSpace" type="{http://ws.amadeus.fr/air}NegotiatedSpace" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPreferences", propOrder = {
    "airlineRestrictions",
    "directItineraryRestriction",
    "connectionRestriction",
    "travelClassRestriction",
    "bookingClassCode",
    "negotiatedSpace"
})
public class TravelPreferences {

    protected SimpleAirlineRestrictions airlineRestrictions;
    protected TravelPreferences.DirectItineraryRestriction directItineraryRestriction;
    protected ConnectionRestriction connectionRestriction;
    @XmlSchemaType(name = "string")
    protected TravelClass travelClassRestriction;
    protected String bookingClassCode;
    protected NegotiatedSpace negotiatedSpace;

    /**
     * Default no-arg constructor
     * 
     */
    public TravelPreferences() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TravelPreferences(final SimpleAirlineRestrictions airlineRestrictions, final TravelPreferences.DirectItineraryRestriction directItineraryRestriction, final ConnectionRestriction connectionRestriction, final TravelClass travelClassRestriction, final String bookingClassCode, final NegotiatedSpace negotiatedSpace) {
        this.airlineRestrictions = airlineRestrictions;
        this.directItineraryRestriction = directItineraryRestriction;
        this.connectionRestriction = connectionRestriction;
        this.travelClassRestriction = travelClassRestriction;
        this.bookingClassCode = bookingClassCode;
        this.negotiatedSpace = negotiatedSpace;
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
     * Obtiene el valor de la propiedad directItineraryRestriction.
     * 
     * @return
     *     possible object is
     *     {@link TravelPreferences.DirectItineraryRestriction }
     *     
     */
    public TravelPreferences.DirectItineraryRestriction getDirectItineraryRestriction() {
        return directItineraryRestriction;
    }

    /**
     * Define el valor de la propiedad directItineraryRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPreferences.DirectItineraryRestriction }
     *     
     */
    public void setDirectItineraryRestriction(TravelPreferences.DirectItineraryRestriction value) {
        this.directItineraryRestriction = value;
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
     * Obtiene el valor de la propiedad travelClassRestriction.
     * 
     * @return
     *     possible object is
     *     {@link TravelClass }
     *     
     */
    public TravelClass getTravelClassRestriction() {
        return travelClassRestriction;
    }

    /**
     * Define el valor de la propiedad travelClassRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClass }
     *     
     */
    public void setTravelClassRestriction(TravelClass value) {
        this.travelClassRestriction = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingClassCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClassCode() {
        return bookingClassCode;
    }

    /**
     * Define el valor de la propiedad bookingClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClassCode(String value) {
        this.bookingClassCode = value;
    }

    /**
     * Obtiene el valor de la propiedad negotiatedSpace.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedSpace }
     *     
     */
    public NegotiatedSpace getNegotiatedSpace() {
        return negotiatedSpace;
    }

    /**
     * Define el valor de la propiedad negotiatedSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedSpace }
     *     
     */
    public void setNegotiatedSpace(NegotiatedSpace value) {
        this.negotiatedSpace = value;
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
    public static class DirectItineraryRestriction {

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
