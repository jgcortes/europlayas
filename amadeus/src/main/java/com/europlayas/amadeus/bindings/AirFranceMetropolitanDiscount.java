
package com.europlayas.amadeus.bindings;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirFranceMetropolitanDiscount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirFranceMetropolitanDiscount"&gt;
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
@XmlType(name = "AirFranceMetropolitanDiscount")
public class AirFranceMetropolitanDiscount
    extends AirFranceDiscount
{


    /**
     * Default no-arg constructor
     * 
     */
    public AirFranceMetropolitanDiscount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirFranceMetropolitanDiscount(final BigInteger number) {
        super(number);
    }

}
