
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USKoeretoejArtAnvendelseListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejArtAnvendelseListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="KoeretoejArtAnvendelseListe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KoeretoejArtAnvendelse" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur"/&gt;
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
@XmlType(name = "USKoeretoejArtAnvendelseListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "koeretoejArtAnvendelseListe"
})
@XmlSeeAlso({
    USKoeretoejArtAnvendelseListeHentO.class
})
public class USKoeretoejArtAnvendelseListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "KoeretoejArtAnvendelseListe")
    protected USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe koeretoejArtAnvendelseListe;

    /**
     * Gets the value of the hovedOplysningerSvar property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public HovedOplysningerSvarType getHovedOplysningerSvar() {
        return hovedOplysningerSvar;
    }

    /**
     * Sets the value of the hovedOplysningerSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvar = value;
    }

    /**
     * Gets the value of the koeretoejArtAnvendelseListe property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe }
     *     
     */
    public USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe getKoeretoejArtAnvendelseListe() {
        return koeretoejArtAnvendelseListe;
    }

    /**
     * Sets the value of the koeretoejArtAnvendelseListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe }
     *     
     */
    public void setKoeretoejArtAnvendelseListe(USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe value) {
        this.koeretoejArtAnvendelseListe = value;
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
     *         &lt;element name="KoeretoejArtAnvendelse" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur"/&gt;
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
        "koeretoejArtAnvendelse"
    })
    public static class KoeretoejArtAnvendelseListe {

        @XmlElement(name = "KoeretoejArtAnvendelse")
        protected List<USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse> koeretoejArtAnvendelse;

        /**
         * Gets the value of the koeretoejArtAnvendelse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejArtAnvendelse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejArtAnvendelse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse }
         * 
         * 
         */
        public List<USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse> getKoeretoejArtAnvendelse() {
            if (koeretoejArtAnvendelse == null) {
                koeretoejArtAnvendelse = new ArrayList<USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse>();
            }
            return this.koeretoejArtAnvendelse;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur"/&gt;
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
            "koeretoejArtStruktur",
            "koeretoejAnvendelseStruktur"
        })
        public static class KoeretoejArtAnvendelse {

            @XmlElement(name = "KoeretoejArtStruktur", required = true)
            protected KoeretoejArtStrukturType koeretoejArtStruktur;
            @XmlElement(name = "KoeretoejAnvendelseStruktur", required = true)
            protected KoeretoejAnvendelseStrukturType koeretoejAnvendelseStruktur;

            /**
             * Gets the value of the koeretoejArtStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejArtStrukturType }
             *     
             */
            public KoeretoejArtStrukturType getKoeretoejArtStruktur() {
                return koeretoejArtStruktur;
            }

            /**
             * Sets the value of the koeretoejArtStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejArtStrukturType }
             *     
             */
            public void setKoeretoejArtStruktur(KoeretoejArtStrukturType value) {
                this.koeretoejArtStruktur = value;
            }

            /**
             * Gets the value of the koeretoejAnvendelseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejAnvendelseStrukturType }
             *     
             */
            public KoeretoejAnvendelseStrukturType getKoeretoejAnvendelseStruktur() {
                return koeretoejAnvendelseStruktur;
            }

            /**
             * Sets the value of the koeretoejAnvendelseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejAnvendelseStrukturType }
             *     
             */
            public void setKoeretoejAnvendelseStruktur(KoeretoejAnvendelseStrukturType value) {
                this.koeretoejAnvendelseStruktur = value;
            }

        }

    }

}
