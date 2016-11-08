
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Successfull booking.
 * 
 * <p>Clase Java para Booking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Booking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journey" type="{http://ws.amadeus.fr/air}DetailedJourney"/&gt;
 *         &lt;element name="pricing" type="{http://ws.amadeus.fr/air}BookResponsePricing" minOccurs="0"/&gt;
 *         &lt;element name="records"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="record" type="{http://ws.amadeus.fr/air}AirRecord" maxOccurs="100" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="luggageAllowances" type="{http://ws.amadeus.fr/air}LuggageAllowances" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking", propOrder = {
    "journey",
    "pricing",
    "records",
    "luggageAllowances"
})
public class Booking implements Serializable
{

    @XmlElement(required = true)
    protected DetailedJourney journey;
    protected BookResponsePricing pricing;
    @XmlElement(required = true)
    protected Booking.Records records;
    protected LuggageAllowances luggageAllowances;

    /**
     * Default no-arg constructor
     * 
     */
    public Booking() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Booking(final DetailedJourney journey, final BookResponsePricing pricing, final Booking.Records records, final LuggageAllowances luggageAllowances) {
        this.journey = journey;
        this.pricing = pricing;
        this.records = records;
        this.luggageAllowances = luggageAllowances;
    }

    /**
     * Obtiene el valor de la propiedad journey.
     * 
     * @return
     *     possible object is
     *     {@link DetailedJourney }
     *     
     */
    public DetailedJourney getJourney() {
        return journey;
    }

    /**
     * Define el valor de la propiedad journey.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedJourney }
     *     
     */
    public void setJourney(DetailedJourney value) {
        this.journey = value;
    }

    /**
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link BookResponsePricing }
     *     
     */
    public BookResponsePricing getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResponsePricing }
     *     
     */
    public void setPricing(BookResponsePricing value) {
        this.pricing = value;
    }

    /**
     * Obtiene el valor de la propiedad records.
     * 
     * @return
     *     possible object is
     *     {@link Booking.Records }
     *     
     */
    public Booking.Records getRecords() {
        return records;
    }

    /**
     * Define el valor de la propiedad records.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking.Records }
     *     
     */
    public void setRecords(Booking.Records value) {
        this.records = value;
    }

    /**
     * Obtiene el valor de la propiedad luggageAllowances.
     * 
     * @return
     *     possible object is
     *     {@link LuggageAllowances }
     *     
     */
    public LuggageAllowances getLuggageAllowances() {
        return luggageAllowances;
    }

    /**
     * Define el valor de la propiedad luggageAllowances.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageAllowances }
     *     
     */
    public void setLuggageAllowances(LuggageAllowances value) {
        this.luggageAllowances = value;
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
     *         &lt;element name="record" type="{http://ws.amadeus.fr/air}AirRecord" maxOccurs="100" minOccurs="0"/&gt;
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
        "records"
    })
    public static class Records implements Serializable
    {

        @XmlElement(name = "record")
        protected List<AirRecord> records;

        /**
         * Default no-arg constructor
         * 
         */
        public Records() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Records(final List<AirRecord> records) {
            this.records = records;
        }

        /**
         * Gets the value of the records property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the records property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecords().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRecord }
         * 
         * 
         */
        public List<AirRecord> getRecords() {
            if (records == null) {
                records = new ArrayList<AirRecord>();
            }
            return this.records;
        }

    }

}
