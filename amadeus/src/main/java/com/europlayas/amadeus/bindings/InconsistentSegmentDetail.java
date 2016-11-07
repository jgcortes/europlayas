
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information for a segment detail.
 * 
 * <p>Clase Java para InconsistentSegmentDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentSegmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="segmentDetailInconsistencies"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="segmentDetailInconsistency" type="{http://ws.amadeus.fr/air}SegmentDetailInconsistency" maxOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="segmentId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentSegmentDetail", propOrder = {

})
public class InconsistentSegmentDetail {

    @XmlElement(required = true)
    protected InconsistentSegmentDetail.SegmentDetailInconsistencies segmentDetailInconsistencies;
    @XmlAttribute(name = "segmentId", required = true)
    protected int segmentId;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentSegmentDetail() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentSegmentDetail(final InconsistentSegmentDetail.SegmentDetailInconsistencies segmentDetailInconsistencies, final int segmentId) {
        this.segmentDetailInconsistencies = segmentDetailInconsistencies;
        this.segmentId = segmentId;
    }

    /**
     * Obtiene el valor de la propiedad segmentDetailInconsistencies.
     * 
     * @return
     *     possible object is
     *     {@link InconsistentSegmentDetail.SegmentDetailInconsistencies }
     *     
     */
    public InconsistentSegmentDetail.SegmentDetailInconsistencies getSegmentDetailInconsistencies() {
        return segmentDetailInconsistencies;
    }

    /**
     * Define el valor de la propiedad segmentDetailInconsistencies.
     * 
     * @param value
     *     allowed object is
     *     {@link InconsistentSegmentDetail.SegmentDetailInconsistencies }
     *     
     */
    public void setSegmentDetailInconsistencies(InconsistentSegmentDetail.SegmentDetailInconsistencies value) {
        this.segmentDetailInconsistencies = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentId.
     * 
     */
    public int getSegmentId() {
        return segmentId;
    }

    /**
     * Define el valor de la propiedad segmentId.
     * 
     */
    public void setSegmentId(int value) {
        this.segmentId = value;
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
     *         &lt;element name="segmentDetailInconsistency" type="{http://ws.amadeus.fr/air}SegmentDetailInconsistency" maxOccurs="2"/&gt;
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
        "segmentDetailInconsistency"
    })
    public static class SegmentDetailInconsistencies {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<SegmentDetailInconsistency> segmentDetailInconsistency;

        /**
         * Default no-arg constructor
         * 
         */
        public SegmentDetailInconsistencies() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SegmentDetailInconsistencies(final List<SegmentDetailInconsistency> segmentDetailInconsistency) {
            this.segmentDetailInconsistency = segmentDetailInconsistency;
        }

        /**
         * Gets the value of the segmentDetailInconsistency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentDetailInconsistency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentDetailInconsistency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentDetailInconsistency }
         * 
         * 
         */
        public List<SegmentDetailInconsistency> getSegmentDetailInconsistency() {
            if (segmentDetailInconsistency == null) {
                segmentDetailInconsistency = new ArrayList<SegmentDetailInconsistency>();
            }
            return this.segmentDetailInconsistency;
        }

    }

}
