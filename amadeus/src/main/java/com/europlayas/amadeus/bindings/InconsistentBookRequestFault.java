
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out inconsistencies in the booking request to the requestor. These inconsistencies have caused a booking failure. Composed of at least one inconsistency.
 * 
 * <p>Clase Java para InconsistentBookRequestFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentBookRequestFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingInconsistency" type="{http://ws.amadeus.fr/air}BookPricingInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="passengersInconsistency" type="{http://ws.amadeus.fr/air}NamedPassengersInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="additionalRecordDataInconsistency" type="{http://ws.amadeus.fr/air}AdditionalRecordDataInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="currencyInconsistency" type="{http://ws.amadeus.fr/air}CurrencyInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="contactInformationInconsistency" type="{http://ws.amadeus.fr/air}ContactInformationInconsistency" minOccurs="0"/&gt;
 *         &lt;element name="inconsistentSegments" type="{http://ws.amadeus.fr/air}SegmentList" minOccurs="0"/&gt;
 *         &lt;element name="itineraryInconsistency" type="{http://ws.amadeus.fr/air}ItineraryInconsistency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentBookRequestFault", propOrder = {
    "pricingInconsistency",
    "passengersInconsistency",
    "additionalRecordDataInconsistency",
    "currencyInconsistency",
    "contactInformationInconsistency",
    "inconsistentSegments",
    "itineraryInconsistency"
})
@XmlRootElement(name = "inconsistentBookRequestFault")
public class InconsistentBookRequestFault
    extends BookFault
    implements Serializable
{

    protected BookPricingInconsistency pricingInconsistency;
    protected NamedPassengersInconsistency passengersInconsistency;
    protected AdditionalRecordDataInconsistency additionalRecordDataInconsistency;
    protected CurrencyInconsistency currencyInconsistency;
    protected ContactInformationInconsistency contactInformationInconsistency;
    protected SegmentList inconsistentSegments;
    protected ItineraryInconsistency itineraryInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentBookRequestFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentBookRequestFault(final ItineraryIdList itineraries, final BookPricingInconsistency pricingInconsistency, final NamedPassengersInconsistency passengersInconsistency, final AdditionalRecordDataInconsistency additionalRecordDataInconsistency, final CurrencyInconsistency currencyInconsistency, final ContactInformationInconsistency contactInformationInconsistency, final SegmentList inconsistentSegments, final ItineraryInconsistency itineraryInconsistency) {
        super(itineraries);
        this.pricingInconsistency = pricingInconsistency;
        this.passengersInconsistency = passengersInconsistency;
        this.additionalRecordDataInconsistency = additionalRecordDataInconsistency;
        this.currencyInconsistency = currencyInconsistency;
        this.contactInformationInconsistency = contactInformationInconsistency;
        this.inconsistentSegments = inconsistentSegments;
        this.itineraryInconsistency = itineraryInconsistency;
    }

    /**
     * Obtiene el valor de la propiedad pricingInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link BookPricingInconsistency }
     *     
     */
    public BookPricingInconsistency getPricingInconsistency() {
        return pricingInconsistency;
    }

    /**
     * Define el valor de la propiedad pricingInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPricingInconsistency }
     *     
     */
    public void setPricingInconsistency(BookPricingInconsistency value) {
        this.pricingInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad passengersInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassengersInconsistency }
     *     
     */
    public NamedPassengersInconsistency getPassengersInconsistency() {
        return passengersInconsistency;
    }

    /**
     * Define el valor de la propiedad passengersInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassengersInconsistency }
     *     
     */
    public void setPassengersInconsistency(NamedPassengersInconsistency value) {
        this.passengersInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalRecordDataInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRecordDataInconsistency }
     *     
     */
    public AdditionalRecordDataInconsistency getAdditionalRecordDataInconsistency() {
        return additionalRecordDataInconsistency;
    }

    /**
     * Define el valor de la propiedad additionalRecordDataInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRecordDataInconsistency }
     *     
     */
    public void setAdditionalRecordDataInconsistency(AdditionalRecordDataInconsistency value) {
        this.additionalRecordDataInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInconsistency }
     *     
     */
    public CurrencyInconsistency getCurrencyInconsistency() {
        return currencyInconsistency;
    }

    /**
     * Define el valor de la propiedad currencyInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInconsistency }
     *     
     */
    public void setCurrencyInconsistency(CurrencyInconsistency value) {
        this.currencyInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad contactInformationInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationInconsistency }
     *     
     */
    public ContactInformationInconsistency getContactInformationInconsistency() {
        return contactInformationInconsistency;
    }

    /**
     * Define el valor de la propiedad contactInformationInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationInconsistency }
     *     
     */
    public void setContactInformationInconsistency(ContactInformationInconsistency value) {
        this.contactInformationInconsistency = value;
    }

    /**
     * Obtiene el valor de la propiedad inconsistentSegments.
     * 
     * @return
     *     possible object is
     *     {@link SegmentList }
     *     
     */
    public SegmentList getInconsistentSegments() {
        return inconsistentSegments;
    }

    /**
     * Define el valor de la propiedad inconsistentSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentList }
     *     
     */
    public void setInconsistentSegments(SegmentList value) {
        this.inconsistentSegments = value;
    }

    /**
     * Obtiene el valor de la propiedad itineraryInconsistency.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInconsistency }
     *     
     */
    public ItineraryInconsistency getItineraryInconsistency() {
        return itineraryInconsistency;
    }

    /**
     * Define el valor de la propiedad itineraryInconsistency.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInconsistency }
     *     
     */
    public void setItineraryInconsistency(ItineraryInconsistency value) {
        this.itineraryInconsistency = value;
    }

}
