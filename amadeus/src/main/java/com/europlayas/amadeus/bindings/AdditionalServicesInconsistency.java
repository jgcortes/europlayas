
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Use when the AdditionalServices node is not correctly filled. 
 * 
 * <p>Clase Java para AdditionalServicesInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServicesInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="luggageInconsistency" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="tooManyLuggages" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="inconsistentItineraryList" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "AdditionalServicesInconsistency", propOrder = {

})
public class AdditionalServicesInconsistency {

    protected AdditionalServicesInconsistency.LuggageInconsistency luggageInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public AdditionalServicesInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AdditionalServicesInconsistency(final AdditionalServicesInconsistency.LuggageInconsistency luggageInconsistency) {
        this.luggageInconsistency = luggageInconsistency;
    }

    /**
     * Obtiene el valor de la propiedad luggageInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServicesInconsistency.LuggageInconsistency }
     *     
     */
    public AdditionalServicesInconsistency.LuggageInconsistency getLuggageInconsistency() {
        return luggageInconsistency;
    }

    /**
     * Define el valor de la propiedad luggageInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServicesInconsistency.LuggageInconsistency }
     *     
     */
    public void setLuggageInconsistency(AdditionalServicesInconsistency.LuggageInconsistency value) {
        this.luggageInconsistency = value;
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
     *       &lt;attribute name="tooManyLuggages" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="inconsistentItineraryList" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LuggageInconsistency {

        @XmlAttribute(name = "tooManyLuggages")
        protected Boolean tooManyLuggages;
        @XmlAttribute(name = "inconsistentItineraryList")
        protected Boolean inconsistentItineraryList;

        /**
         * Default no-arg constructor
         * 
         */
        public LuggageInconsistency() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public LuggageInconsistency(final Boolean tooManyLuggages, final Boolean inconsistentItineraryList) {
            this.tooManyLuggages = tooManyLuggages;
            this.inconsistentItineraryList = inconsistentItineraryList;
        }

        /**
         * Obtiene el valor de la propiedad tooManyLuggages.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTooManyLuggages() {
            return tooManyLuggages;
        }

        /**
         * Define el valor de la propiedad tooManyLuggages.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTooManyLuggages(Boolean value) {
            this.tooManyLuggages = value;
        }

        /**
         * Obtiene el valor de la propiedad inconsistentItineraryList.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInconsistentItineraryList() {
            return inconsistentItineraryList;
        }

        /**
         * Define el valor de la propiedad inconsistentItineraryList.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInconsistentItineraryList(Boolean value) {
            this.inconsistentItineraryList = value;
        }

    }

}
