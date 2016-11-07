
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para UnticketedCancellation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnticketedCancellation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="segmentIds" type="{http://ws.amadeus.fr/air}SegmentIdList" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="dateTime" type="{http://ws.amadeus.fr/common}UtcDateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnticketedCancellation", propOrder = {

})
public class UnticketedCancellation {

    protected SegmentIdList segmentIds;
    @XmlAttribute(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public UnticketedCancellation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnticketedCancellation(final SegmentIdList segmentIds, final XMLGregorianCalendar dateTime) {
        this.segmentIds = segmentIds;
        this.dateTime = dateTime;
    }

    /**
     * Obtiene el valor de la propiedad segmentIds.
     * 
     * @return
     *     possible object is
     *     {@link SegmentIdList }
     *     
     */
    public SegmentIdList getSegmentIds() {
        return segmentIds;
    }

    /**
     * Define el valor de la propiedad segmentIds.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentIdList }
     *     
     */
    public void setSegmentIds(SegmentIdList value) {
        this.segmentIds = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
