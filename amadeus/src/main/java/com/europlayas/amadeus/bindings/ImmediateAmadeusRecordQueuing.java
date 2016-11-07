
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Queue information to instantly queue an Amadeus GDS booking recod
 * 
 * <p>Clase Java para ImmediateAmadeusRecordQueuing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImmediateAmadeusRecordQueuing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AbstractAirAmadeusRecordQueuing"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmediateAmadeusRecordQueuing")
public class ImmediateAmadeusRecordQueuing
    extends AbstractAirAmadeusRecordQueuing
{


    /**
     * Default no-arg constructor
     * 
     */
    public ImmediateAmadeusRecordQueuing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ImmediateAmadeusRecordQueuing(final AirAmadeusQueue queue, final String targetOfficeId) {
        super(queue, targetOfficeId);
    }

}
