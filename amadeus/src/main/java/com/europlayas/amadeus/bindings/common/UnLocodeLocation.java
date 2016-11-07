
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Location defined in UN/LOCODE.
 * 
 * <p>Clase Java para UnLocodeLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnLocodeLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/common}Location"&gt;
 *       &lt;attribute name="code" use="required" type="{http://ws.amadeus.fr/common}UnLocode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnLocodeLocation")
public class UnLocodeLocation
    extends Location
{


    /**
     * Default no-arg constructor
     * 
     */
    public UnLocodeLocation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnLocodeLocation(final String code) {
        super(code);
    }

}
