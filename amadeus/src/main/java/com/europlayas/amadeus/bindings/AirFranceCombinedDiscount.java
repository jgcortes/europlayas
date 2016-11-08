
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirFranceCombinedDiscount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirFranceCombinedDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AirFranceDiscount"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirFranceCombinedDiscount")
public class AirFranceCombinedDiscount
    extends AirFranceDiscount
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public AirFranceCombinedDiscount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirFranceCombinedDiscount(final BigInteger number) {
        super(number);
    }

}
