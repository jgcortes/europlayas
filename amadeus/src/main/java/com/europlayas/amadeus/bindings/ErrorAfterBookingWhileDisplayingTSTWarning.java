
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The booking hasn't been finalised.
 * 
 * <p>Clase Java para ErrorAfterBookingWhileDisplayingTSTWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorAfterBookingWhileDisplayingTSTWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="records"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="record" type="{http://ws.amadeus.fr/common}AmadeusRecordLocator" maxOccurs="100"/&gt;
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
@XmlType(name = "ErrorAfterBookingWhileDisplayingTSTWarning", propOrder = {
    "records"
})
public class ErrorAfterBookingWhileDisplayingTSTWarning
    extends BookWarning
{

    @XmlElement(required = true)
    protected ErrorAfterBookingWhileDisplayingTSTWarning.Records records;

    /**
     * Default no-arg constructor
     * 
     */
    public ErrorAfterBookingWhileDisplayingTSTWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ErrorAfterBookingWhileDisplayingTSTWarning(final String message, final ItineraryIdList itineraries, final ErrorAfterBookingWhileDisplayingTSTWarning.Records records) {
        super(message, itineraries);
        this.records = records;
    }

    /**
     * Obtiene el valor de la propiedad records.
     * 
     * @return
     *     possible object is
     *     {@link ErrorAfterBookingWhileDisplayingTSTWarning.Records }
     *     
     */
    public ErrorAfterBookingWhileDisplayingTSTWarning.Records getRecords() {
        return records;
    }

    /**
     * Define el valor de la propiedad records.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorAfterBookingWhileDisplayingTSTWarning.Records }
     *     
     */
    public void setRecords(ErrorAfterBookingWhileDisplayingTSTWarning.Records value) {
        this.records = value;
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
     *         &lt;element name="record" type="{http://ws.amadeus.fr/common}AmadeusRecordLocator" maxOccurs="100"/&gt;
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
        "record"
    })
    public static class Records {

        @XmlElement(required = true)
        protected List<String> record;

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
        public Records(final List<String> record) {
            this.record = record;
        }

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRecord() {
            if (record == null) {
                record = new ArrayList<String>();
            }
            return this.record;
        }

    }

}
