
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LowFareSearchTravelClassRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchTravelClassRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="travelClassRestriction" maxOccurs="3"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="originDestinations" type="{http://ws.amadeus.fr/air}OriginDestinationIdList"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="travelClass" use="required" type="{http://ws.amadeus.fr/air}TravelClass" /&gt;
 *                 &lt;attribute name="coverage" type="{http://ws.amadeus.fr/air}TravelClassCoverage" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFareSearchTravelClassRestrictions", propOrder = {
    "travelClassRestriction"
})
public class LowFareSearchTravelClassRestrictions {

    @XmlElement(required = true)
    protected List<LowFareSearchTravelClassRestrictions.TravelClassRestriction> travelClassRestriction;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchTravelClassRestrictions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchTravelClassRestrictions(final List<LowFareSearchTravelClassRestrictions.TravelClassRestriction> travelClassRestriction) {
        this.travelClassRestriction = travelClassRestriction;
    }

    /**
     * Gets the value of the travelClassRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelClassRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelClassRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LowFareSearchTravelClassRestrictions.TravelClassRestriction }
     * 
     * 
     */
    public List<LowFareSearchTravelClassRestrictions.TravelClassRestriction> getTravelClassRestriction() {
        if (travelClassRestriction == null) {
            travelClassRestriction = new ArrayList<LowFareSearchTravelClassRestrictions.TravelClassRestriction>();
        }
        return this.travelClassRestriction;
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
     *         &lt;element name="originDestinations" type="{http://ws.amadeus.fr/air}OriginDestinationIdList"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="travelClass" use="required" type="{http://ws.amadeus.fr/air}TravelClass" /&gt;
     *       &lt;attribute name="coverage" type="{http://ws.amadeus.fr/air}TravelClassCoverage" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestinations"
    })
    public static class TravelClassRestriction {

        @XmlElement(required = true)
        protected OriginDestinationIdList originDestinations;
        @XmlAttribute(name = "travelClass", required = true)
        protected TravelClass travelClass;
        @XmlAttribute(name = "coverage")
        protected TravelClassCoverage coverage;

        /**
         * Default no-arg constructor
         * 
         */
        public TravelClassRestriction() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TravelClassRestriction(final OriginDestinationIdList originDestinations, final TravelClass travelClass, final TravelClassCoverage coverage) {
            this.originDestinations = originDestinations;
            this.travelClass = travelClass;
            this.coverage = coverage;
        }

        /**
         * Obtiene el valor de la propiedad originDestinations.
         * 
         * @return
         *     possible object is
         *     {@link OriginDestinationIdList }
         *     
         */
        public OriginDestinationIdList getOriginDestinations() {
            return originDestinations;
        }

        /**
         * Define el valor de la propiedad originDestinations.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginDestinationIdList }
         *     
         */
        public void setOriginDestinations(OriginDestinationIdList value) {
            this.originDestinations = value;
        }

        /**
         * Obtiene el valor de la propiedad travelClass.
         * 
         * @return
         *     possible object is
         *     {@link TravelClass }
         *     
         */
        public TravelClass getTravelClass() {
            return travelClass;
        }

        /**
         * Define el valor de la propiedad travelClass.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelClass }
         *     
         */
        public void setTravelClass(TravelClass value) {
            this.travelClass = value;
        }

        /**
         * Obtiene el valor de la propiedad coverage.
         * 
         * @return
         *     possible object is
         *     {@link TravelClassCoverage }
         *     
         */
        public TravelClassCoverage getCoverage() {
            return coverage;
        }

        /**
         * Define el valor de la propiedad coverage.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelClassCoverage }
         *     
         */
        public void setCoverage(TravelClassCoverage value) {
            this.coverage = value;
        }

    }

}
