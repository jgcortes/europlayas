
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of itinerary identifiers.
 * 
 * <p>Clase Java para ItineraryIdList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItineraryIdList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itineraryId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryIdList", propOrder = {
    "itineraryId"
})
public class ItineraryIdList {

    @XmlElement(type = Integer.class)
    protected List<Integer> itineraryId;

    /**
     * Default no-arg constructor
     * 
     */
    public ItineraryIdList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ItineraryIdList(final List<Integer> itineraryId) {
        this.itineraryId = itineraryId;
    }

    /**
     * Gets the value of the itineraryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getItineraryId() {
        if (itineraryId == null) {
            itineraryId = new ArrayList<Integer>();
        }
        return this.itineraryId;
    }

}
