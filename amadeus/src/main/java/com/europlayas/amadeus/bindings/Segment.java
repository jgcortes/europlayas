
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.europlayas.amadeus.util.DateTimeAdapter;


/**
 * Flight segment, as defined by IATA. The operation of a flight with a single flight designator between the point where passengers first board an aircraft and the passengers' destination, may be a part of a longer itinerary (or bound), the latter thus involving more than one segment. A flight designator includes an airline code and a flight number. A flight segment can include any number of stops where some passengers may board and others may deplane the same aircraft operated by a single airline (though it may be marketed by several airlines, each using its own unique designator).
 * 
 * <p>Clase Java para Segment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Segment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originLocation" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
 *         &lt;element name="destinationLocation" type="{http://ws.amadeus.fr/air}IataLocation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="marketingAirlineCode" type="{http://ws.amadeus.fr/air}AirlineCode" /&gt;
 *       &lt;attribute name="operatingAirlineCode" type="{http://ws.amadeus.fr/air}AirlineCode" /&gt;
 *       &lt;attribute name="flightNumber" use="required" type="{http://ws.amadeus.fr/air}FlightNumber" /&gt;
 *       &lt;attribute name="departureDateTime" use="required" type="{http://ws.amadeus.fr/common}LocalDateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "originLocation",
    "destinationLocation"
})
@XmlSeeAlso({
    DetailedSegment.class
})
public class Segment implements Serializable
{

    @XmlElement(required = true)
    protected IataLocation originLocation;
    @XmlElement(required = true)
    protected IataLocation destinationLocation;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "marketingAirlineCode")
    protected String marketingAirlineCode;
    @XmlAttribute(name = "operatingAirlineCode")
    protected String operatingAirlineCode;
    @XmlAttribute(name = "flightNumber", required = true)
    protected String flightNumber;
    @XmlAttribute(name = "departureDateTime", required = true)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    protected LocalDateTime departureDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public Segment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Segment(final IataLocation originLocation, final IataLocation destinationLocation, final int id, final String marketingAirlineCode, final String operatingAirlineCode, final String flightNumber, final LocalDateTime departureDateTime) {
        this.originLocation = originLocation;
        this.destinationLocation = destinationLocation;
        this.id = id;
        this.marketingAirlineCode = marketingAirlineCode;
        this.operatingAirlineCode = operatingAirlineCode;
        this.flightNumber = flightNumber;
        this.departureDateTime = departureDateTime;
    }

    /**
     * Obtiene el valor de la propiedad originLocation.
     * 
     * @return
     *     possible object is
     *     {@link IataLocation }
     *     
     */
    public IataLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Define el valor de la propiedad originLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link IataLocation }
     *     
     */
    public void setOriginLocation(IataLocation value) {
        this.originLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationLocation.
     * 
     * @return
     *     possible object is
     *     {@link IataLocation }
     *     
     */
    public IataLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Define el valor de la propiedad destinationLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link IataLocation }
     *     
     */
    public void setDestinationLocation(IataLocation value) {
        this.destinationLocation = value;
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
     * Obtiene el valor de la propiedad marketingAirlineCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingAirlineCode() {
        return marketingAirlineCode;
    }

    /**
     * Define el valor de la propiedad marketingAirlineCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingAirlineCode(String value) {
        this.marketingAirlineCode = value;
    }

    /**
     * Obtiene el valor de la propiedad operatingAirlineCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAirlineCode() {
        return operatingAirlineCode;
    }

    /**
     * Define el valor de la propiedad operatingAirlineCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingAirlineCode(String value) {
        this.operatingAirlineCode = value;
    }

    /**
     * Obtiene el valor de la propiedad flightNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Define el valor de la propiedad flightNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Define el valor de la propiedad departureDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(LocalDateTime value) {
        this.departureDateTime = value;
    }

}
