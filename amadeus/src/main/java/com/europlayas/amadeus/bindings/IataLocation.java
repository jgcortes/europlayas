
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.Location;


/**
 * Location defined in IATA.
 * 
 * <p>Clase Java para IataLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IataLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/common}Location"&gt;
 *       &lt;attribute name="code" use="required" type="{http://ws.amadeus.fr/air}IataLocationCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IataLocation")
public class IataLocation
    extends Location
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public IataLocation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IataLocation(final String code) {
        super(code);
    }

}
