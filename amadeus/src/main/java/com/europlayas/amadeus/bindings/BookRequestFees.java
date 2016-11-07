
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details for applicable fees (sum for all segments of all itineraries and for all passengers).
 * 
 * <p>Clase Java para BookRequestFees complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookRequestFees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="supplierFee" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardFee" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="ticketingServiceFee" type="{http://ws.amadeus.fr/air}CurrencyAmount" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookRequestFees", propOrder = {

})
public class BookRequestFees {

    protected CurrencyAmount supplierFee;
    protected CurrencyAmount paymentCardFee;
    protected CurrencyAmount ticketingServiceFee;

    /**
     * Default no-arg constructor
     * 
     */
    public BookRequestFees() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookRequestFees(final CurrencyAmount supplierFee, final CurrencyAmount paymentCardFee, final CurrencyAmount ticketingServiceFee) {
        this.supplierFee = supplierFee;
        this.paymentCardFee = paymentCardFee;
        this.ticketingServiceFee = ticketingServiceFee;
    }

    /**
     * Obtiene el valor de la propiedad supplierFee.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getSupplierFee() {
        return supplierFee;
    }

    /**
     * Define el valor de la propiedad supplierFee.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setSupplierFee(CurrencyAmount value) {
        this.supplierFee = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardFee.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getPaymentCardFee() {
        return paymentCardFee;
    }

    /**
     * Define el valor de la propiedad paymentCardFee.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setPaymentCardFee(CurrencyAmount value) {
        this.paymentCardFee = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketingServiceFee.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTicketingServiceFee() {
        return ticketingServiceFee;
    }

    /**
     * Define el valor de la propiedad ticketingServiceFee.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTicketingServiceFee(CurrencyAmount value) {
        this.ticketingServiceFee = value;
    }

}
