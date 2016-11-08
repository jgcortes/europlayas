
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LowFareSearchFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originDestinations" type="{http://ws.amadeus.fr/air}OriginDestinationIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFareSearchFault", propOrder = {
    "originDestinations"
})
@XmlSeeAlso({
    InconsistentLowFareSearchRequestFault.class
})
public class LowFareSearchFault
    extends Fault
    implements Serializable
{

    protected OriginDestinationIdList originDestinations;

    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchFault(final ItineraryIdList itineraries, final OriginDestinationIdList originDestinations) {
        super(itineraries);
        this.originDestinations = originDestinations;
    }

    /**
     * Obtiene el valor de la propiedad originDestinations.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationIdList }
     *     
     */
    public OriginDestinationIdList getOriginDestinations() {
        return originDestinations;
    }

    /**
     * Define el valor de la propiedad originDestinations.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationIdList }
     *     
     */
    public void setOriginDestinations(OriginDestinationIdList value) {
        this.originDestinations = value;
    }

}
