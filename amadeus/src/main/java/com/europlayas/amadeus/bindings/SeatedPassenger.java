
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic passenger information, for a passenger occupying a seat.
 * 
 * <p>Clase Java para SeatedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeatedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Passenger"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatedPassenger")
@XmlSeeAlso({
    NonInfantHoldingSeatedPassenger.class,
    InfantHoldingSeatedPassenger.class
})
public abstract class SeatedPassenger
    extends Passenger
{


    /**
     * Default no-arg constructor
     * 
     */
    public SeatedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeatedPassenger(final int id) {
        super(id);
    }

}
