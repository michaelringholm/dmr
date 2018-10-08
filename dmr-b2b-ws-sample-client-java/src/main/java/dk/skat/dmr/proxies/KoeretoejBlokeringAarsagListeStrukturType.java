
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejBlokeringAarsagListeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejBlokeringAarsagListeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejBlokeringAarsagListe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KoeretoejBlokeringAarsag" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNummer"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNavn"/&gt;
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
@XmlType(name = "KoeretoejBlokeringAarsagListeStrukturType", propOrder = {
    "koeretoejBlokeringAarsagListe"
})
public class KoeretoejBlokeringAarsagListeStrukturType {

    @XmlElement(name = "KoeretoejBlokeringAarsagListe")
    protected KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe koeretoejBlokeringAarsagListe;

    /**
     * Gets the value of the koeretoejBlokeringAarsagListe property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe }
     *     
     */
    public KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe getKoeretoejBlokeringAarsagListe() {
        return koeretoejBlokeringAarsagListe;
    }

    /**
     * Sets the value of the koeretoejBlokeringAarsagListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe }
     *     
     */
    public void setKoeretoejBlokeringAarsagListe(KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe value) {
        this.koeretoejBlokeringAarsagListe = value;
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
     *         &lt;element name="KoeretoejBlokeringAarsag" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNummer"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNavn"/&gt;
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
        "koeretoejBlokeringAarsag"
    })
    public static class KoeretoejBlokeringAarsagListe {

        @XmlElement(name = "KoeretoejBlokeringAarsag", required = true)
        protected List<KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag> koeretoejBlokeringAarsag;

        /**
         * Gets the value of the koeretoejBlokeringAarsag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejBlokeringAarsag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejBlokeringAarsag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag }
         * 
         * 
         */
        public List<KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag> getKoeretoejBlokeringAarsag() {
            if (koeretoejBlokeringAarsag == null) {
                koeretoejBlokeringAarsag = new ArrayList<KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag>();
            }
            return this.koeretoejBlokeringAarsag;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNummer"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNavn"/&gt;
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
            "koeretoejBlokeringAarsagTypeNummer",
            "koeretoejBlokeringAarsagTypeNavn"
        })
        public static class KoeretoejBlokeringAarsag {

            @XmlElement(name = "KoeretoejBlokeringAarsagTypeNummer")
            @XmlSchemaType(name = "integer")
            protected long koeretoejBlokeringAarsagTypeNummer;
            @XmlElement(name = "KoeretoejBlokeringAarsagTypeNavn", required = true)
            protected String koeretoejBlokeringAarsagTypeNavn;

            /**
             * Gets the value of the koeretoejBlokeringAarsagTypeNummer property.
             * 
             */
            public long getKoeretoejBlokeringAarsagTypeNummer() {
                return koeretoejBlokeringAarsagTypeNummer;
            }

            /**
             * Sets the value of the koeretoejBlokeringAarsagTypeNummer property.
             * 
             */
            public void setKoeretoejBlokeringAarsagTypeNummer(long value) {
                this.koeretoejBlokeringAarsagTypeNummer = value;
            }

            /**
             * Gets the value of the koeretoejBlokeringAarsagTypeNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKoeretoejBlokeringAarsagTypeNavn() {
                return koeretoejBlokeringAarsagTypeNavn;
            }

            /**
             * Sets the value of the koeretoejBlokeringAarsagTypeNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKoeretoejBlokeringAarsagTypeNavn(String value) {
                this.koeretoejBlokeringAarsagTypeNavn = value;
            }

        }

    }

}
