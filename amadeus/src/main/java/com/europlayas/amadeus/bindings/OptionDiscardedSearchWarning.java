
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when some options have been discarded during the search.
 * 
 * <p>Clase Java para OptionDiscardedSearchWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OptionDiscardedSearchWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}LowFareSearchWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchOptions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="searchOption" type="{http://ws.amadeus.fr/air}SearchOption"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDiscardedSearchWarning", propOrder = {
    "searchOptions"
})
public class OptionDiscardedSearchWarning
    extends LowFareSearchWarning
{

    @XmlElement(required = true)
    protected OptionDiscardedSearchWarning.SearchOptions searchOptions;

    /**
     * Default no-arg constructor
     * 
     */
    public OptionDiscardedSearchWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OptionDiscardedSearchWarning(final String message, final ItineraryIdList itineraries, final OptionDiscardedSearchWarning.SearchOptions searchOptions) {
        super(message, itineraries);
        this.searchOptions = searchOptions;
    }

    /**
     * Obtiene el valor de la propiedad searchOptions.
     * 
     * @return
     *     possible object is
     *     {@link OptionDiscardedSearchWarning.SearchOptions }
     *     
     */
    public OptionDiscardedSearchWarning.SearchOptions getSearchOptions() {
        return searchOptions;
    }

    /**
     * Define el valor de la propiedad searchOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDiscardedSearchWarning.SearchOptions }
     *     
     */
    public void setSearchOptions(OptionDiscardedSearchWarning.SearchOptions value) {
        this.searchOptions = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="searchOption" type="{http://ws.amadeus.fr/air}SearchOption"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "searchOption"
    })
    public static class SearchOptions {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<SearchOption> searchOption;

        /**
         * Default no-arg constructor
         * 
         */
        public SearchOptions() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SearchOptions(final List<SearchOption> searchOption) {
            this.searchOption = searchOption;
        }

        /**
         * Gets the value of the searchOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchOption }
         * 
         * 
         */
        public List<SearchOption> getSearchOption() {
            if (searchOption == null) {
                searchOption = new ArrayList<SearchOption>();
            }
            return this.searchOption;
        }

    }

}
