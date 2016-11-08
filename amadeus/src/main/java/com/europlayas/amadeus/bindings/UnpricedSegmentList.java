
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of unpriced segments, as specified in request. 
 * 
 * <p>Clase Java para UnpricedSegmentList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnpricedSegmentList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/air}SegmentList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segment" type="{http://ws.amadeus.fr/air}Segment" maxOccurs="8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnpricedSegmentList")
public class UnpricedSegmentList
    extends SegmentList
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public UnpricedSegmentList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnpricedSegmentList(final List<Segment> segments) {
        super(segments);
    }

}
