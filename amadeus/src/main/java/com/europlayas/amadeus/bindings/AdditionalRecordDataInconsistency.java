
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.GlobalContactInformation;


/**
 * Inconsistency information for additional record data.
 * 
 * <p>Clase Java para AdditionalRecordDataInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalRecordDataInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inconsistentContactInformation" type="{http://ws.amadeus.fr/common}GlobalContactInformation" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="inconsistentPayments"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="inconsistentPayment" type="{http://ws.amadeus.fr/air}PaymentByItineraryGroup" maxOccurs="6"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="missingPaymentCard" type="{http://ws.amadeus.fr/air}MissingPaymentCard"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="inconsistentRemark" type="{http://ws.amadeus.fr/air}InconsistentRemark" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="noDefaultTicketingAgreement" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalRecordDataInconsistency", propOrder = {
    "inconsistentContactInformation",
    "inconsistentPayments",
    "missingPaymentCard",
    "inconsistentRemark"
})
public class AdditionalRecordDataInconsistency {

    protected GlobalContactInformation inconsistentContactInformation;
    protected AdditionalRecordDataInconsistency.InconsistentPayments inconsistentPayments;
    protected MissingPaymentCard missingPaymentCard;
    protected InconsistentRemark inconsistentRemark;
    @XmlAttribute(name = "noDefaultTicketingAgreement", required = true)
    protected boolean noDefaultTicketingAgreement;

    /**
     * Default no-arg constructor
     * 
     */
    public AdditionalRecordDataInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AdditionalRecordDataInconsistency(final GlobalContactInformation inconsistentContactInformation, final AdditionalRecordDataInconsistency.InconsistentPayments inconsistentPayments, final MissingPaymentCard missingPaymentCard, final InconsistentRemark inconsistentRemark, final boolean noDefaultTicketingAgreement) {
        this.inconsistentContactInformation = inconsistentContactInformation;
        this.inconsistentPayments = inconsistentPayments;
        this.missingPaymentCard = missingPaymentCard;
        this.inconsistentRemark = inconsistentRemark;
        this.noDefaultTicketingAgreement = noDefaultTicketingAgreement;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentContactInformation.
     * 
     * @return
     *     possible object is
     *     {@link GlobalContactInformation }
     *     
     */
    public GlobalContactInformation getInconsistentContactInformation() {
        return inconsistentContactInformation;
    }

    /**
     * Define el valor de la propiedad inconsistentContactInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalContactInformation }
     *     
     */
    public void setInconsistentContactInformation(GlobalContactInformation value) {
        this.inconsistentContactInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentPayments.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRecordDataInconsistency.InconsistentPayments }
     *     
     */
    public AdditionalRecordDataInconsistency.InconsistentPayments getInconsistentPayments() {
        return inconsistentPayments;
    }

    /**
     * Define el valor de la propiedad inconsistentPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRecordDataInconsistency.InconsistentPayments }
     *     
     */
    public void setInconsistentPayments(AdditionalRecordDataInconsistency.InconsistentPayments value) {
        this.inconsistentPayments = value;
    }

    /**
     * Obtiene el valor de la propiedad missingPaymentCard.
     * 
     * @return
     *     possible object is
     *     {@link MissingPaymentCard }
     *     
     */
    public MissingPaymentCard getMissingPaymentCard() {
        return missingPaymentCard;
    }

    /**
     * Define el valor de la propiedad missingPaymentCard.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingPaymentCard }
     *     
     */
    public void setMissingPaymentCard(MissingPaymentCard value) {
        this.missingPaymentCard = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentRemark.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentRemark }
     *     
     */
    public InconsistentRemark getInconsistentRemark() {
        return inconsistentRemark;
    }

    /**
     * Define el valor de la propiedad inconsistentRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentRemark }
     *     
     */
    public void setInconsistentRemark(InconsistentRemark value) {
        this.inconsistentRemark = value;
    }

    /**
     * Obtiene el valor de la propiedad noDefaultTicketingAgreement.
     * 
     */
    public boolean isNoDefaultTicketingAgreement() {
        return noDefaultTicketingAgreement;
    }

    /**
     * Define el valor de la propiedad noDefaultTicketingAgreement.
     * 
     */
    public void setNoDefaultTicketingAgreement(boolean value) {
        this.noDefaultTicketingAgreement = value;
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
     *         &lt;element name="inconsistentPayment" type="{http://ws.amadeus.fr/air}PaymentByItineraryGroup" maxOccurs="6"/&gt;
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
        "inconsistentPayment"
    })
    public static class InconsistentPayments {

        @XmlElement(required = true)
        protected List<PaymentByItineraryGroup> inconsistentPayment;

        /**
         * Default no-arg constructor
         * 
         */
        public InconsistentPayments() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public InconsistentPayments(final List<PaymentByItineraryGroup> inconsistentPayment) {
            this.inconsistentPayment = inconsistentPayment;
        }

        /**
         * Gets the value of the inconsistentPayment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inconsistentPayment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInconsistentPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentByItineraryGroup }
         * 
         * 
         */
        public List<PaymentByItineraryGroup> getInconsistentPayment() {
            if (inconsistentPayment == null) {
                inconsistentPayment = new ArrayList<PaymentByItineraryGroup>();
            }
            return this.inconsistentPayment;
        }

    }

}
