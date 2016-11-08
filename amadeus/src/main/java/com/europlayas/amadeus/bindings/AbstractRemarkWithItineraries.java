
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract remark for a list of itineraries.
 * 
 * <p>Clase Java para AbstractRemarkWithItineraries complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AbstractRemarkWithItineraries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AbstractRemark"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRemarkWithItineraries", propOrder = {
    "itineraries"
})
@XmlSeeAlso({
    Remark.class,
    CategorisedRemark.class
})
public abstract class AbstractRemarkWithItineraries
    extends AbstractRemark
    implements Serializable
{

    protected ItineraryIdList itineraries;

    /**
     * Default no-arg constructor
     * 
     */
    public AbstractRemarkWithItineraries() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AbstractRemarkWithItineraries(final String text, final ItineraryIdList itineraries) {
        super(text);
        this.itineraries = itineraries;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryIdList }
     *     
     */
    public ItineraryIdList getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryIdList }
     *     
     */
    public void setItineraries(ItineraryIdList value) {
        this.itineraries = value;
    }

}
