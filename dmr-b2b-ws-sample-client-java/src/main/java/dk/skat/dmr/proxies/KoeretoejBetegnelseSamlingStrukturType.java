
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejBetegnelseSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejBetegnelseSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejBetegnelseSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KoeretoejBetegnelse" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBetegnelseStruktur"/&gt;
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
@XmlType(name = "KoeretoejBetegnelseSamlingStrukturType", propOrder = {
    "koeretoejBetegnelseSamling"
})
public class KoeretoejBetegnelseSamlingStrukturType {

    @XmlElement(name = "KoeretoejBetegnelseSamling", required = true)
    protected KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling koeretoejBetegnelseSamling;

    /**
     * Gets the value of the koeretoejBetegnelseSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling }
     *     
     */
    public KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling getKoeretoejBetegnelseSamling() {
        return koeretoejBetegnelseSamling;
    }

    /**
     * Sets the value of the koeretoejBetegnelseSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling }
     *     
     */
    public void setKoeretoejBetegnelseSamling(KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling value) {
        this.koeretoejBetegnelseSamling = value;
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
     *         &lt;element name="KoeretoejBetegnelse" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBetegnelseStruktur"/&gt;
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
        "koeretoejBetegnelse"
    })
    public static class KoeretoejBetegnelseSamling {

        @XmlElement(name = "KoeretoejBetegnelse")
        protected List<KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse> koeretoejBetegnelse;

        /**
         * Gets the value of the koeretoejBetegnelse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejBetegnelse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejBetegnelse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse }
         * 
         * 
         */
        public List<KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse> getKoeretoejBetegnelse() {
            if (koeretoejBetegnelse == null) {
                koeretoejBetegnelse = new ArrayList<KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse>();
            }
            return this.koeretoejBetegnelse;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBetegnelseStruktur"/&gt;
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
            "koeretoejBetegnelseStruktur"
        })
        public static class KoeretoejBetegnelse {

            @XmlElement(name = "KoeretoejBetegnelseStruktur", required = true)
            protected KoeretoejBetegnelseStrukturType koeretoejBetegnelseStruktur;

            /**
             * Gets the value of the koeretoejBetegnelseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejBetegnelseStrukturType }
             *     
             */
            public KoeretoejBetegnelseStrukturType getKoeretoejBetegnelseStruktur() {
                return koeretoejBetegnelseStruktur;
            }

            /**
             * Sets the value of the koeretoejBetegnelseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejBetegnelseStrukturType }
             *     
             */
            public void setKoeretoejBetegnelseStruktur(KoeretoejBetegnelseStrukturType value) {
                this.koeretoejBetegnelseStruktur = value;
            }

        }

    }

}
