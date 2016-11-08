
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out a passenger price discrepancy to the requestor (between actual and requested prices, and/or pricing conditions, for a passenger). This passenger price mismatch has caused a booking failure.
 * 
 * <p>Clase Java para PassengerPriceDiscrepancyFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PassengerPriceDiscrepancyFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discrepancies"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="discrepancy" type="{http://ws.amadeus.fr/air}PassengerPriceDiscrepancy" maxOccurs="18"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerPriceDiscrepancyFault", propOrder = {
    "discrepancies"
})
@XmlRootElement(name = "passengerPriceDiscrepancyFault")
public class PassengerPriceDiscrepancyFault
    extends BookFault
    implements Serializable
{

    @XmlElement(required = true)
    protected PassengerPriceDiscrepancyFault.Discrepancies discrepancies;

    /**
     * Default no-arg constructor
     * 
     */
    public PassengerPriceDiscrepancyFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PassengerPriceDiscrepancyFault(final ItineraryIdList itineraries, final PassengerPriceDiscrepancyFault.Discrepancies discrepancies) {
        super(itineraries);
        this.discrepancies = discrepancies;
    }

    /**
     * Obtiene el valor de la propiedad discrepancies.
     * 
     * @return
     *     possible object is
     *     {@link PassengerPriceDiscrepancyFault.Discrepancies }
     *     
     */
    public PassengerPriceDiscrepancyFault.Discrepancies getDiscrepancies() {
        return discrepancies;
    }

    /**
     * Define el valor de la propiedad discrepancies.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerPriceDiscrepancyFault.Discrepancies }
     *     
     */
    public void setDiscrepancies(PassengerPriceDiscrepancyFault.Discrepancies value) {
        this.discrepancies = value;
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
     *         &lt;element name="discrepancy" type="{http://ws.amadeus.fr/air}PassengerPriceDiscrepancy" maxOccurs="18"/&gt;
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
        "discrepancies"
    })
    public static class Discrepancies implements Serializable
    {

        @XmlElement(name = "discrepancy", required = true)
        protected List<PassengerPriceDiscrepancy> discrepancies;

        /**
         * Default no-arg constructor
         * 
         */
        public Discrepancies() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Discrepancies(final List<PassengerPriceDiscrepancy> discrepancies) {
            this.discrepancies = discrepancies;
        }

        /**
         * Gets the value of the discrepancies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discrepancies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiscrepancies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerPriceDiscrepancy }
         * 
         * 
         */
        public List<PassengerPriceDiscrepancy> getDiscrepancies() {
            if (discrepancies == null) {
                discrepancies = new ArrayList<PassengerPriceDiscrepancy>();
            }
            return this.discrepancies;
        }

    }

}
