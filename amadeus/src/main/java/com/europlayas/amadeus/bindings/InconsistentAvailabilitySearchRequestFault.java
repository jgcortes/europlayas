
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out inconsistencies in the availability search request to the requestor. These inconsistencies have caused a search failure. Composed of at least one inconsistency.
 * 
 * <p>Clase Java para InconsistentAvailabilitySearchRequestFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentAvailabilitySearchRequestFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AvailabilitySearchFault"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="originDestinationInconsistency" type="{http://ws.amadeus.fr/air}OriginDestinationInconsistency"/&gt;
 *         &lt;element name="passengersInconsistency" type="{http://ws.amadeus.fr/air}SearchPassengersInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="connectionInconsistency" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="connectionPoints" type="{http://ws.amadeus.fr/air}ConnectionPoints"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="directItineraryRestriction"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="stopsAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="connectionRestriction" type="{http://ws.amadeus.fr/air}ConnectionRestriction"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentAvailabilitySearchRequestFault", propOrder = {
    "connectionInconsistency",
    "passengersInconsistency",
    "originDestinationInconsistency"
})
@XmlRootElement(name = "inconsistentAvailabilitySearchRequestFault")
public class InconsistentAvailabilitySearchRequestFault
    extends AvailabilitySearchFault
    implements Serializable
{

    protected InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency connectionInconsistency;
    protected SearchPassengersInconsistency passengersInconsistency;
    protected OriginDestinationInconsistency originDestinationInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentAvailabilitySearchRequestFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentAvailabilitySearchRequestFault(final ItineraryIdList itineraries, final InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency connectionInconsistency, final SearchPassengersInconsistency passengersInconsistency, final OriginDestinationInconsistency originDestinationInconsistency) {
        super(itineraries);
        this.connectionInconsistency = connectionInconsistency;
        this.passengersInconsistency = passengersInconsistency;
        this.originDestinationInconsistency = originDestinationInconsistency;
    }

    /**
     * Obtiene el valor de la propiedad connectionInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency }
     *     
     */
    public InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency getConnectionInconsistency() {
        return connectionInconsistency;
    }

    /**
     * Define el valor de la propiedad connectionInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency }
     *     
     */
    public void setConnectionInconsistency(InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency value) {
        this.connectionInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad passengersInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link SearchPassengersInconsistency }
     *     
     */
    public SearchPassengersInconsistency getPassengersInconsistency() {
        return passengersInconsistency;
    }

    /**
     * Define el valor de la propiedad passengersInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPassengersInconsistency }
     *     
     */
    public void setPassengersInconsistency(SearchPassengersInconsistency value) {
        this.passengersInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad originDestinationInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInconsistency }
     *     
     */
    public OriginDestinationInconsistency getOriginDestinationInconsistency() {
        return originDestinationInconsistency;
    }

    /**
     * Define el valor de la propiedad originDestinationInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInconsistency }
     *     
     */
    public void setOriginDestinationInconsistency(OriginDestinationInconsistency value) {
        this.originDestinationInconsistency = value;
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
     *         &lt;element name="connectionPoints" type="{http://ws.amadeus.fr/air}ConnectionPoints"/&gt;
     *         &lt;choice&gt;
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
        "connectionPoints",
        "connectionRestriction",
        "directItineraryRestriction"
    })
    public static class ConnectionInconsistency implements Serializable
    {

        @XmlElement(required = true)
        protected ConnectionPoints connectionPoints;
        protected ConnectionRestriction connectionRestriction;
        protected InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction directItineraryRestriction;

        /**
         * Default no-arg constructor
         * 
         */
        public ConnectionInconsistency() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ConnectionInconsistency(final ConnectionPoints connectionPoints, final ConnectionRestriction connectionRestriction, final InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction directItineraryRestriction) {
            this.connectionPoints = connectionPoints;
            this.connectionRestriction = connectionRestriction;
            this.directItineraryRestriction = directItineraryRestriction;
        }

        /**
         * Obtiene el valor de la propiedad connectionPoints.
         * 
         * @return
         *     possible object is
         *     {@link ConnectionPoints }
         *     
         */
        public ConnectionPoints getConnectionPoints() {
            return connectionPoints;
        }

        /**
         * Define el valor de la propiedad connectionPoints.
         * 
         * @param value
         *     allowed object is
         *     {@link ConnectionPoints }
         *     
         */
        public void setConnectionPoints(ConnectionPoints value) {
            this.connectionPoints = value;
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
         *     {@link InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction }
         *     
         */
        public InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction getDirectItineraryRestriction() {
            return directItineraryRestriction;
        }

        /**
         * Define el valor de la propiedad directItineraryRestriction.
         * 
         * @param value
         *     allowed object is
         *     {@link InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction }
         *     
         */
        public void setDirectItineraryRestriction(InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction value) {
            this.directItineraryRestriction = value;
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

}
