
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * For a specific passenger, list of segment pricing information, for one or more segments.
 * 
 * <p>Clase Java para PriceWithInfoRequestPassengerPricingSegmentDetailList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceWithInfoRequestPassengerPricingSegmentDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segmentDetail" type="{http://ws.amadeus.fr/air}PriceWithInfoRequestPassengerPricingSegmentDetail" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithInfoRequestPassengerPricingSegmentDetailList", propOrder = {
    "segmentDetails"
})
public class PriceWithInfoRequestPassengerPricingSegmentDetailList implements Serializable
{

    @XmlElement(name = "segmentDetail", required = true)
    protected List<PriceWithInfoRequestPassengerPricingSegmentDetail> segmentDetails;

    /**
     * Default no-arg constructor
     * 
     */
    public PriceWithInfoRequestPassengerPricingSegmentDetailList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PriceWithInfoRequestPassengerPricingSegmentDetailList(final List<PriceWithInfoRequestPassengerPricingSegmentDetail> segmentDetails) {
        this.segmentDetails = segmentDetails;
    }

    /**
     * Gets the value of the segmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceWithInfoRequestPassengerPricingSegmentDetail }
     * 
     * 
     */
    public List<PriceWithInfoRequestPassengerPricingSegmentDetail> getSegmentDetails() {
        if (segmentDetails == null) {
            segmentDetails = new ArrayList<PriceWithInfoRequestPassengerPricingSegmentDetail>();
        }
        return this.segmentDetails;
    }

}
