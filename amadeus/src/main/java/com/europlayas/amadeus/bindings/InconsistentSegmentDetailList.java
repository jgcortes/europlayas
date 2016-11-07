
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of inconsistent segment details.
 * 
 * <p>Clase Java para InconsistentSegmentDetailList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentSegmentDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inconsistentSegmentDetail" type="{http://ws.amadeus.fr/air}InconsistentSegmentDetail" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentSegmentDetailList", propOrder = {
    "inconsistentSegmentDetail"
})
public class InconsistentSegmentDetailList {

    @XmlElement(required = true)
    protected List<InconsistentSegmentDetail> inconsistentSegmentDetail;

    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentSegmentDetailList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentSegmentDetailList(final List<InconsistentSegmentDetail> inconsistentSegmentDetail) {
        this.inconsistentSegmentDetail = inconsistentSegmentDetail;
    }

    /**
     * Gets the value of the inconsistentSegmentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inconsistentSegmentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInconsistentSegmentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InconsistentSegmentDetail }
     * 
     * 
     */
    public List<InconsistentSegmentDetail> getInconsistentSegmentDetail() {
        if (inconsistentSegmentDetail == null) {
            inconsistentSegmentDetail = new ArrayList<InconsistentSegmentDetail>();
        }
        return this.inconsistentSegmentDetail;
    }

}
