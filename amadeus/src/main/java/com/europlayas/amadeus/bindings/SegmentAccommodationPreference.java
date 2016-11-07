
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Accommodation preference, applying to a segment.
 * 
 * <p>Clase Java para SegmentAccommodationPreference complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SegmentAccommodationPreference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AccommodationPreference"&gt;
 *       &lt;attribute name="segmentId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentAccommodationPreference")
public class SegmentAccommodationPreference
    extends AccommodationPreference
{

    @XmlAttribute(name = "segmentId", required = true)
    protected int segmentId;

    /**
     * Default no-arg constructor
     * 
     */
    public SegmentAccommodationPreference() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SegmentAccommodationPreference(final String seatNumber, final SeatPosition seatPosition, final MealCode mealCode, final int segmentId) {
        super(seatNumber, seatPosition, mealCode);
        this.segmentId = segmentId;
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

}
