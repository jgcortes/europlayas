
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the search of fare notes could not be performed completely.
 * 
 * <p>Clase Java para IncompleteGetFareNotesRequestWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteGetFareNotesRequestWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}GetInfoWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cause" type="{http://ws.amadeus.fr/air}GetInfoFault" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteGetFareNotesRequestWarning", propOrder = {
    "cause"
})
public class IncompleteGetFareNotesRequestWarning
    extends GetInfoWarning
{

    protected GetInfoFault cause;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteGetFareNotesRequestWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteGetFareNotesRequestWarning(final String message, final ItineraryIdList itineraries, final GetInfoFault cause) {
        super(message, itineraries);
        this.cause = cause;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link GetInfoFault }
     *     
     */
    public GetInfoFault getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfoFault }
     *     
     */
    public void setCause(GetInfoFault value) {
        this.cause = value;
    }

}
