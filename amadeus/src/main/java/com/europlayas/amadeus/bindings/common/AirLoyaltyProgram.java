
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information regarding membership in a loyalty program offered by an airline or another actor in air industry.
 * 
 * <p>Clase Java para AirLoyaltyProgram complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirLoyaltyProgram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}LoyaltyProgram"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirLoyaltyProgram")
@XmlSeeAlso({
    FrequentFlyer.class
})
public abstract class AirLoyaltyProgram
    extends LoyaltyProgram
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public AirLoyaltyProgram() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirLoyaltyProgram(final String number) {
        super(number);
    }

}
