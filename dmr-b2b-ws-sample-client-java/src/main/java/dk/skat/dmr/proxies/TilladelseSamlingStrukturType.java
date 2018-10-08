
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TilladelseSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilladelseSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TilladelseSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tilladelse" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseNummer" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseStruktur"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilladelseSamlingStrukturType", propOrder = {
    "tilladelseSamling"
})
public class TilladelseSamlingStrukturType {

    @XmlElement(name = "TilladelseSamling", required = true)
    protected TilladelseSamlingStrukturType.TilladelseSamling tilladelseSamling;

    /**
     * Gets the value of the tilladelseSamling property.
     * 
     * @return
     *     possible object is
     *     {@link TilladelseSamlingStrukturType.TilladelseSamling }
     *     
     */
    public TilladelseSamlingStrukturType.TilladelseSamling getTilladelseSamling() {
        return tilladelseSamling;
    }

    /**
     * Sets the value of the tilladelseSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilladelseSamlingStrukturType.TilladelseSamling }
     *     
     */
    public void setTilladelseSamling(TilladelseSamlingStrukturType.TilladelseSamling value) {
        this.tilladelseSamling = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Tilladelse" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseNummer" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseStruktur"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "tilladelse"
    })
    public static class TilladelseSamling {

        @XmlElement(name = "Tilladelse")
        protected List<TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse> tilladelse;

        /**
         * Gets the value of the tilladelse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tilladelse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTilladelse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse }
         * 
         * 
         */
        public List<TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse> getTilladelse() {
            if (tilladelse == null) {
                tilladelse = new ArrayList<TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse>();
            }
            return this.tilladelse;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseStruktur"/&gt;
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
            "tilladelseNummer",
            "tilladelseStruktur"
        })
        public static class Tilladelse {

            @XmlElement(name = "TilladelseNummer")
            @XmlSchemaType(name = "integer")
            protected Long tilladelseNummer;
            @XmlElement(name = "TilladelseStruktur", required = true)
            protected TilladelseStrukturType tilladelseStruktur;

            /**
             * Gets the value of the tilladelseNummer property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTilladelseNummer() {
                return tilladelseNummer;
            }

            /**
             * Sets the value of the tilladelseNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTilladelseNummer(Long value) {
                this.tilladelseNummer = value;
            }

            /**
             * Gets the value of the tilladelseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link TilladelseStrukturType }
             *     
             */
            public TilladelseStrukturType getTilladelseStruktur() {
                return tilladelseStruktur;
            }

            /**
             * Sets the value of the tilladelseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link TilladelseStrukturType }
             *     
             */
            public void setTilladelseStruktur(TilladelseStrukturType value) {
                this.tilladelseStruktur = value;
            }

        }

    }

}
