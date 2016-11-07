
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when some SSRDocs could not be added in the PNR.
 * 
 * <p>Clase Java para RecordWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RecordWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segmentIds" type="{http://ws.amadeus.fr/air}SegmentIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordWarning", propOrder = {
    "segmentIds"
})
public class RecordWarning
    extends BookWarning
{

    protected SegmentIdList segmentIds;

    /**
     * Default no-arg constructor
     * 
     */
    public RecordWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RecordWarning(final String message, final ItineraryIdList itineraries, final SegmentIdList segmentIds) {
        super(message, itineraries);
        this.segmentIds = segmentIds;
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

}
