
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of segment identifiers.
 * 
 * <p>Clase Java para SegmentIdList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SegmentIdList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segmentId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="54"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentIdList", propOrder = {
    "segmentIds"
})
public class SegmentIdList implements Serializable
{

    @XmlElement(name = "segmentId", type = Integer.class)
    protected List<Integer> segmentIds;

    /**
     * Default no-arg constructor
     * 
     */
    public SegmentIdList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SegmentIdList(final List<Integer> segmentIds) {
        this.segmentIds = segmentIds;
    }

    /**
     * Gets the value of the segmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSegmentIds() {
        if (segmentIds == null) {
            segmentIds = new ArrayList<Integer>();
        }
        return this.segmentIds;
    }

}
