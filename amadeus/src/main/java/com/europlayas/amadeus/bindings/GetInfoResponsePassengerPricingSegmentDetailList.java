
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
 * <p>Clase Java para GetInfoResponsePassengerPricingSegmentDetailList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoResponsePassengerPricingSegmentDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segmentDetail" type="{http://ws.amadeus.fr/air}GetInfoResponsePassengerPricingSegmentDetail" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoResponsePassengerPricingSegmentDetailList", propOrder = {
    "segmentDetails"
})
public class GetInfoResponsePassengerPricingSegmentDetailList implements Serializable
{

    @XmlElement(name = "segmentDetail", required = true)
    protected List<GetInfoResponsePassengerPricingSegmentDetail> segmentDetails;

    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoResponsePassengerPricingSegmentDetailList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoResponsePassengerPricingSegmentDetailList(final List<GetInfoResponsePassengerPricingSegmentDetail> segmentDetails) {
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
     * {@link GetInfoResponsePassengerPricingSegmentDetail }
     * 
     * 
     */
    public List<GetInfoResponsePassengerPricingSegmentDetail> getSegmentDetails() {
        if (segmentDetails == null) {
            segmentDetails = new ArrayList<GetInfoResponsePassengerPricingSegmentDetail>();
        }
        return this.segmentDetails;
    }

}
