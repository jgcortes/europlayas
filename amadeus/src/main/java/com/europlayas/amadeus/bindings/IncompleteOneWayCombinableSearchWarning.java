
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the one way combinable search could not be performed completely.
 * 
 * <p>Clase Java para IncompleteOneWayCombinableSearchWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteOneWayCombinableSearchWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}LowFareSearchWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originDestinationId" type="{http://ws.amadeus.fr/common}Identifier" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteOneWayCombinableSearchWarning", propOrder = {
    "originDestinationIds"
})
public class IncompleteOneWayCombinableSearchWarning
    extends LowFareSearchWarning
    implements Serializable
{

    @XmlElement(name = "originDestinationId", type = Integer.class)
    protected List<Integer> originDestinationIds;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteOneWayCombinableSearchWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteOneWayCombinableSearchWarning(final String message, final ItineraryIdList itineraries, final List<Integer> originDestinationIds) {
        super(message, itineraries);
        this.originDestinationIds = originDestinationIds;
    }

    /**
     * Gets the value of the originDestinationIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOriginDestinationIds() {
        if (originDestinationIds == null) {
            originDestinationIds = new ArrayList<Integer>();
        }
        return this.originDestinationIds;
    }

}
