
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out a price discrepancy to the requestor (between actual and requested prices, and/or pricing conditions). This price mismatch has caused a booking failure.
 * 
 * <p>Clase Java para PriceDiscrepancyFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceDiscrepancyFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestedPrice"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="priceMargin" type="{http://ws.amadeus.fr/air}NonNegativePercentage" minOccurs="0"/&gt;
 *                   &lt;element name="pricingDetail" type="{http://ws.amadeus.fr/air}BookRequestPricingDetail"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="actualPrice"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="priceMargin" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://ws.amadeus.fr/air}Percentage"&gt;
 *                         &lt;minExclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pricingDetail" type="{http://ws.amadeus.fr/air}BookResponsePricingDetail"/&gt;
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
@XmlType(name = "PriceDiscrepancyFault", propOrder = {
    "requestedPrice",
    "actualPrice"
})
@XmlRootElement(name = "priceDiscrepancyFault")
public class PriceDiscrepancyFault
    extends BookFault
    implements Serializable
{

    @XmlElement(required = true)
    protected PriceDiscrepancyFault.RequestedPrice requestedPrice;
    @XmlElement(required = true)
    protected PriceDiscrepancyFault.ActualPrice actualPrice;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceDiscrepancyFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceDiscrepancyFault(final ItineraryIdList itineraries, final PriceDiscrepancyFault.RequestedPrice requestedPrice, final PriceDiscrepancyFault.ActualPrice actualPrice) {
        super(itineraries);
        this.requestedPrice = requestedPrice;
        this.actualPrice = actualPrice;
    }

    /**
     * Obtiene el valor de la propiedad requestedPrice.
     * 
     * @return
     *     possible object is
     *     {@link PriceDiscrepancyFault.RequestedPrice }
     *     
     */
    public PriceDiscrepancyFault.RequestedPrice getRequestedPrice() {
        return requestedPrice;
    }

    /**
     * Define el valor de la propiedad requestedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDiscrepancyFault.RequestedPrice }
     *     
     */
    public void setRequestedPrice(PriceDiscrepancyFault.RequestedPrice value) {
        this.requestedPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPrice.
     * 
     * @return
     *     possible object is
     *     {@link PriceDiscrepancyFault.ActualPrice }
     *     
     */
    public PriceDiscrepancyFault.ActualPrice getActualPrice() {
        return actualPrice;
    }

    /**
     * Define el valor de la propiedad actualPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDiscrepancyFault.ActualPrice }
     *     
     */
    public void setActualPrice(PriceDiscrepancyFault.ActualPrice value) {
        this.actualPrice = value;
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
     *         &lt;element name="priceMargin" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://ws.amadeus.fr/air}Percentage"&gt;
     *               &lt;minExclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pricingDetail" type="{http://ws.amadeus.fr/air}BookResponsePricingDetail"/&gt;
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
        "priceMargin",
        "pricingDetail"
    })
    public static class ActualPrice implements Serializable
    {

        protected BigDecimal priceMargin;
        @XmlElement(required = true)
        protected BookResponsePricingDetail pricingDetail;

        /**
         * Default no-arg constructor
         * 
         */
        public ActualPrice() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ActualPrice(final BigDecimal priceMargin, final BookResponsePricingDetail pricingDetail) {
            this.priceMargin = priceMargin;
            this.pricingDetail = pricingDetail;
        }

        /**
         * Obtiene el valor de la propiedad priceMargin.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPriceMargin() {
            return priceMargin;
        }

        /**
         * Define el valor de la propiedad priceMargin.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPriceMargin(BigDecimal value) {
            this.priceMargin = value;
        }

        /**
         * Obtiene el valor de la propiedad pricingDetail.
         * 
         * @return
         *     possible object is
         *     {@link BookResponsePricingDetail }
         *     
         */
        public BookResponsePricingDetail getPricingDetail() {
            return pricingDetail;
        }

        /**
         * Define el valor de la propiedad pricingDetail.
         * 
         * @param value
         *     allowed object is
         *     {@link BookResponsePricingDetail }
         *     
         */
        public void setPricingDetail(BookResponsePricingDetail value) {
            this.pricingDetail = value;
        }

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
     *         &lt;element name="priceMargin" type="{http://ws.amadeus.fr/air}NonNegativePercentage" minOccurs="0"/&gt;
     *         &lt;element name="pricingDetail" type="{http://ws.amadeus.fr/air}BookRequestPricingDetail"/&gt;
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
        "priceMargin",
        "pricingDetail"
    })
    public static class RequestedPrice implements Serializable
    {

        protected BigDecimal priceMargin;
        @XmlElement(required = true)
        protected BookRequestPricingDetail pricingDetail;

        /**
         * Default no-arg constructor
         * 
         */
        public RequestedPrice() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public RequestedPrice(final BigDecimal priceMargin, final BookRequestPricingDetail pricingDetail) {
            this.priceMargin = priceMargin;
            this.pricingDetail = pricingDetail;
        }

        /**
         * Obtiene el valor de la propiedad priceMargin.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPriceMargin() {
            return priceMargin;
        }

        /**
         * Define el valor de la propiedad priceMargin.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPriceMargin(BigDecimal value) {
            this.priceMargin = value;
        }

        /**
         * Obtiene el valor de la propiedad pricingDetail.
         * 
         * @return
         *     possible object is
         *     {@link BookRequestPricingDetail }
         *     
         */
        public BookRequestPricingDetail getPricingDetail() {
            return pricingDetail;
        }

        /**
         * Define el valor de la propiedad pricingDetail.
         * 
         * @param value
         *     allowed object is
         *     {@link BookRequestPricingDetail }
         *     
         */
        public void setPricingDetail(BookRequestPricingDetail value) {
            this.pricingDetail = value;
        }

    }

}
