
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information related to a search option.
 * 
 * <p>Clase Java para SearchOptionInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchOptionInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cause" type="{http://ws.amadeus.fr/air}SearchOptionInconsistencyCause"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptionInconsistency", propOrder = {
    "cause"
})
public class SearchOptionInconsistency implements Serializable
{

    @XmlSchemaType(name = "string")
    protected SearchOptionInconsistencyCause cause;

    /**
     * Default no-arg constructor
     * 
     */
    public SearchOptionInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchOptionInconsistency(final SearchOptionInconsistencyCause cause) {
        this.cause = cause;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptionInconsistencyCause }
     *     
     */
    public SearchOptionInconsistencyCause getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptionInconsistencyCause }
     *     
     */
    public void setCause(SearchOptionInconsistencyCause value) {
        this.cause = value;
    }

}
