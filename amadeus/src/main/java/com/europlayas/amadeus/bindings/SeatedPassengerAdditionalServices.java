
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional services info for a passenger occupying a seat.
 * 
 * <p>Clase Java para SeatedPassengerAdditionalServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeatedPassengerAdditionalServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="luggages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="luggage" type="{http://ws.amadeus.fr/air}Luggage" maxOccurs="20"/&gt;
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
@XmlType(name = "SeatedPassengerAdditionalServices", propOrder = {

})
public class SeatedPassengerAdditionalServices {

    protected SeatedPassengerAdditionalServices.Luggages luggages;

    /**
     * Default no-arg constructor
     * 
     */
    public SeatedPassengerAdditionalServices() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeatedPassengerAdditionalServices(final SeatedPassengerAdditionalServices.Luggages luggages) {
        this.luggages = luggages;
    }

    /**
     * Obtiene el valor de la propiedad luggages.
     * 
     * @return
     *     possible object is
     *     {@link SeatedPassengerAdditionalServices.Luggages }
     *     
     */
    public SeatedPassengerAdditionalServices.Luggages getLuggages() {
        return luggages;
    }

    /**
     * Define el valor de la propiedad luggages.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatedPassengerAdditionalServices.Luggages }
     *     
     */
    public void setLuggages(SeatedPassengerAdditionalServices.Luggages value) {
        this.luggages = value;
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
     *         &lt;element name="luggage" type="{http://ws.amadeus.fr/air}Luggage" maxOccurs="20"/&gt;
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
        "luggage"
    })
    public static class Luggages {

        @XmlElement(required = true)
        protected List<Luggage> luggage;

        /**
         * Default no-arg constructor
         * 
         */
        public Luggages() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Luggages(final List<Luggage> luggage) {
            this.luggage = luggage;
        }

        /**
         * Gets the value of the luggage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the luggage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLuggage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Luggage }
         * 
         * 
         */
        public List<Luggage> getLuggage() {
            if (luggage == null) {
                luggage = new ArrayList<Luggage>();
            }
            return this.luggage;
        }

    }

}
