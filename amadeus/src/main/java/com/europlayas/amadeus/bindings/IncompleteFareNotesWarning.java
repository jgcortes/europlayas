
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the search of fare notes could not be performed completely.
 * 
 * <p>Clase Java para IncompleteFareNotesWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteFareNotesWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}GetInfoWarning"&gt;
 *       &lt;attribute name="segmentId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="fareBasis" use="required" type="{http://ws.amadeus.fr/air}FareBasis" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteFareNotesWarning")
public class IncompleteFareNotesWarning
    extends GetInfoWarning
{

    @XmlAttribute(name = "segmentId", required = true)
    protected int segmentId;
    @XmlAttribute(name = "fareBasis", required = true)
    protected String fareBasis;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteFareNotesWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteFareNotesWarning(final String message, final ItineraryIdList itineraries, final int segmentId, final String fareBasis) {
        super(message, itineraries);
        this.segmentId = segmentId;
        this.fareBasis = fareBasis;
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
     * Obtiene el valor de la propiedad fareBasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Define el valor de la propiedad fareBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

}
