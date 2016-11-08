
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic passenger information, for an Infant passenger held in another passenger's lap, typically an adult or one of the parent.
 * 
 * <p>Clase Java para HeldInfantPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HeldInfantPassenger"&gt;
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
@XmlType(name = "HeldInfantPassenger")
public class HeldInfantPassenger
    extends Passenger
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public HeldInfantPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HeldInfantPassenger(final int id) {
        super(id);
    }

}
