
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SliceDiceIndicator.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SliceDiceIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCAL_AVAILABILITY"/&gt;
 *     &lt;enumeration value="SUB_OD_AVAILABILITY_1"/&gt;
 *     &lt;enumeration value="SUB_OD_AVAILABILITY_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SliceDiceIndicator")
@XmlEnum
public enum SliceDiceIndicator {


    /**
     * In the example above,  local availabilities AB, BC and CD
     * 
     */
    LOCAL_AVAILABILITY,

    /**
     * In the example above, Sub OnD availability AC, named Sub OnD 1
     * 
     */
    SUB_OD_AVAILABILITY_1,

    /**
     * In the example above, Sub OnD availability BD, named Sub OnD 2
     * 
     */
    SUB_OD_AVAILABILITY_2;

    public String value() {
        return name();
    }

    public static SliceDiceIndicator fromValue(String v) {
        return valueOf(v);
    }

}
