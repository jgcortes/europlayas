
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.GlobalContactInformation;
import com.europlayas.amadeus.bindings.common.InvoiceInformation;
import com.europlayas.amadeus.bindings.common.TicketingAgreement;


/**
 * Additional information to store in booking records. Optional remarks are in addition to the default settings.
 * 
 * <p>Clase Java para AdditionalRecordData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalRecordData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remarks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="remark" type="{http://ws.amadeus.fr/air}AbstractRemark" maxOccurs="100"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contactInformation" type="{http://ws.amadeus.fr/common}GlobalContactInformation" minOccurs="0"/&gt;
 *         &lt;element name="invoiceInformation" type="{http://ws.amadeus.fr/common}InvoiceInformation" minOccurs="0"/&gt;
 *         &lt;element name="ticketingAgreement" type="{http://ws.amadeus.fr/common}TicketingAgreement" minOccurs="0"/&gt;
 *         &lt;element name="payments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="payment" type="{http://ws.amadeus.fr/air}PaymentByItineraryGroup" maxOccurs="6"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "AdditionalRecordData", propOrder = {
    "remarks",
    "contactInformation",
    "invoiceInformation",
    "ticketingAgreement",
    "payments"
})
public class AdditionalRecordData {

    protected AdditionalRecordData.Remarks remarks;
    protected GlobalContactInformation contactInformation;
    protected InvoiceInformation invoiceInformation;
    protected TicketingAgreement ticketingAgreement;
    protected AdditionalRecordData.Payments payments;

    /**
     * Default no-arg constructor
     * 
     */
    public AdditionalRecordData() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AdditionalRecordData(final AdditionalRecordData.Remarks remarks, final GlobalContactInformation contactInformation, final InvoiceInformation invoiceInformation, final TicketingAgreement ticketingAgreement, final AdditionalRecordData.Payments payments) {
        this.remarks = remarks;
        this.contactInformation = contactInformation;
        this.invoiceInformation = invoiceInformation;
        this.ticketingAgreement = ticketingAgreement;
        this.payments = payments;
    }

    /**
     * Obtiene el valor de la propiedad remarks.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRecordData.Remarks }
     *     
     */
    public AdditionalRecordData.Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define el valor de la propiedad remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRecordData.Remarks }
     *     
     */
    public void setRemarks(AdditionalRecordData.Remarks value) {
        this.remarks = value;
    }

    /**
     * Obtiene el valor de la propiedad contactInformation.
     * 
     * @return
     *     possible object is
     *     {@link GlobalContactInformation }
     *     
     */
    public GlobalContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Define el valor de la propiedad contactInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalContactInformation }
     *     
     */
    public void setContactInformation(GlobalContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceInformation.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInformation }
     *     
     */
    public InvoiceInformation getInvoiceInformation() {
        return invoiceInformation;
    }

    /**
     * Define el valor de la propiedad invoiceInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInformation }
     *     
     */
    public void setInvoiceInformation(InvoiceInformation value) {
        this.invoiceInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketingAgreement.
     * 
     * @return
     *     possible object is
     *     {@link TicketingAgreement }
     *     
     */
    public TicketingAgreement getTicketingAgreement() {
        return ticketingAgreement;
    }

    /**
     * Define el valor de la propiedad ticketingAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingAgreement }
     *     
     */
    public void setTicketingAgreement(TicketingAgreement value) {
        this.ticketingAgreement = value;
    }

    /**
     * Obtiene el valor de la propiedad payments.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRecordData.Payments }
     *     
     */
    public AdditionalRecordData.Payments getPayments() {
        return payments;
    }

    /**
     * Define el valor de la propiedad payments.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRecordData.Payments }
     *     
     */
    public void setPayments(AdditionalRecordData.Payments value) {
        this.payments = value;
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
     *         &lt;element name="payment" type="{http://ws.amadeus.fr/air}PaymentByItineraryGroup" maxOccurs="6"/&gt;
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
        "payment"
    })
    public static class Payments {

        @XmlElement(required = true)
        protected List<PaymentByItineraryGroup> payment;

        /**
         * Default no-arg constructor
         * 
         */
        public Payments() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Payments(final List<PaymentByItineraryGroup> payment) {
            this.payment = payment;
        }

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentByItineraryGroup }
         * 
         * 
         */
        public List<PaymentByItineraryGroup> getPayment() {
            if (payment == null) {
                payment = new ArrayList<PaymentByItineraryGroup>();
            }
            return this.payment;
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
     *         &lt;element name="remark" type="{http://ws.amadeus.fr/air}AbstractRemark" maxOccurs="100"/&gt;
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
        "remark"
    })
    public static class Remarks {

        @XmlElement(required = true)
        protected List<AbstractRemark> remark;

        /**
         * Default no-arg constructor
         * 
         */
        public Remarks() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Remarks(final List<AbstractRemark> remark) {
            this.remark = remark;
        }

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractRemark }
         * 
         * 
         */
        public List<AbstractRemark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<AbstractRemark>();
            }
            return this.remark;
        }

    }

}
