
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MealCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MealCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVML"/&gt;
 *     &lt;enumeration value="BBML"/&gt;
 *     &lt;enumeration value="BLML"/&gt;
 *     &lt;enumeration value="CHML"/&gt;
 *     &lt;enumeration value="DBML"/&gt;
 *     &lt;enumeration value="FPML"/&gt;
 *     &lt;enumeration value="GFML"/&gt;
 *     &lt;enumeration value="HNML"/&gt;
 *     &lt;enumeration value="IVML"/&gt;
 *     &lt;enumeration value="JPML"/&gt;
 *     &lt;enumeration value="KSML"/&gt;
 *     &lt;enumeration value="LCML"/&gt;
 *     &lt;enumeration value="LFML"/&gt;
 *     &lt;enumeration value="LSML"/&gt;
 *     &lt;enumeration value="MOML"/&gt;
 *     &lt;enumeration value="NFML"/&gt;
 *     &lt;enumeration value="NLML"/&gt;
 *     &lt;enumeration value="OBML"/&gt;
 *     &lt;enumeration value="RVML"/&gt;
 *     &lt;enumeration value="SFML"/&gt;
 *     &lt;enumeration value="SPML"/&gt;
 *     &lt;enumeration value="VGML"/&gt;
 *     &lt;enumeration value="VJML"/&gt;
 *     &lt;enumeration value="VOML"/&gt;
 *     &lt;enumeration value="VLML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MealCode")
@XmlEnum
public enum MealCode {


    /**
     * Vegetarian Hindu Meal
     * 
     */
    AVML,

    /**
     * Baby Meal
     * 
     */
    BBML,

    /**
     * Bland Meal
     * 
     */
    BLML,

    /**
     * Child Meal
     * 
     */
    CHML,

    /**
     * Diabetic Meal
     * 
     */
    DBML,

    /**
     * Fruit Platter Meal
     * 
     */
    FPML,

    /**
     * Gutten Intolerant Meal
     * 
     */
    GFML,

    /**
     * Indu Non Vegetarian Meal
     * 
     */
    HNML,

    /**
     * Indian Vegetarian Meal (UA Specific)
     * 
     */
    IVML,

    /**
     * Japanese Meal (LH Specific)
     * 
     */
    JPML,

    /**
     * Kosher Meal
     * 
     */
    KSML,

    /**
     * Low Calorie Meal
     * 
     */
    LCML,

    /**
     * Low Fat Meal
     * 
     */
    LFML,

    /**
     * Low Salt Meal
     * 
     */
    LSML,

    /**
     * Moslem Meal
     * 
     */
    MOML,

    /**
     * No Fish Meal (LH Specific)
     * 
     */
    NFML,

    /**
     * Low Lactose Meal
     * 
     */
    NLML,

    /**
     * Japanese Obento Meal (UA Specific)
     * 
     */
    OBML,

    /**
     * Vegetatian Raw Meal
     * 
     */
    RVML,

    /**
     * See Food Meal
     * 
     */
    SFML,

    /**
     * Special Meal
     * 
     */
    SPML,

    /**
     * Vegetarian Vegan Meal
     * 
     */
    VGML,

    /**
     * Vegetarian Jain Meal
     * 
     */
    VJML,

    /**
     * Vegetarian Oriental Meal
     * 
     */
    VOML,

    /**
     * Vegetarian Locto-Ovo Meal
     * 
     */
    VLML;

    public String value() {
        return name();
    }

    public static MealCode fromValue(String v) {
        return valueOf(v);
    }

}
