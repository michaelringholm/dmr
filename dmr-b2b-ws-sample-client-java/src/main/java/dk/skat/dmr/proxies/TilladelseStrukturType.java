
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TilladelseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilladelseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseGyldigFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseGyldigTil" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseKommentar" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeStruktur"/&gt;
 *         &lt;element name="TilladelseTypeDetaljeValg" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="VariabelKombination"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejGenerelIdentifikatorStruktur"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="FastTilkobling"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;choice&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="KunGodkendtForJuridiskEnhed"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedIdentifikatorStruktur"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "TilladelseStrukturType", propOrder = {
    "tilladelseGyldigFra",
    "tilladelseGyldigTil",
    "tilladelseKommentar",
    "tilladelseTypeStruktur",
    "tilladelseTypeDetaljeValg"
})
public class TilladelseStrukturType {

    @XmlElement(name = "TilladelseGyldigFra", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tilladelseGyldigFra;
    @XmlElement(name = "TilladelseGyldigTil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tilladelseGyldigTil;
    @XmlElement(name = "TilladelseKommentar")
    protected String tilladelseKommentar;
    @XmlElement(name = "TilladelseTypeStruktur", required = true)
    protected TilladelseTypeStrukturType tilladelseTypeStruktur;
    @XmlElement(name = "TilladelseTypeDetaljeValg")
    protected TilladelseStrukturType.TilladelseTypeDetaljeValg tilladelseTypeDetaljeValg;

    /**
     * Gets the value of the tilladelseGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTilladelseGyldigFra() {
        return tilladelseGyldigFra;
    }

    /**
     * Sets the value of the tilladelseGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTilladelseGyldigFra(XMLGregorianCalendar value) {
        this.tilladelseGyldigFra = value;
    }

    /**
     * Gets the value of the tilladelseGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTilladelseGyldigTil() {
        return tilladelseGyldigTil;
    }

    /**
     * Sets the value of the tilladelseGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTilladelseGyldigTil(XMLGregorianCalendar value) {
        this.tilladelseGyldigTil = value;
    }

    /**
     * Gets the value of the tilladelseKommentar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilladelseKommentar() {
        return tilladelseKommentar;
    }

    /**
     * Sets the value of the tilladelseKommentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilladelseKommentar(String value) {
        this.tilladelseKommentar = value;
    }

    /**
     * Gets the value of the tilladelseTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link TilladelseTypeStrukturType }
     *     
     */
    public TilladelseTypeStrukturType getTilladelseTypeStruktur() {
        return tilladelseTypeStruktur;
    }

    /**
     * Sets the value of the tilladelseTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilladelseTypeStrukturType }
     *     
     */
    public void setTilladelseTypeStruktur(TilladelseTypeStrukturType value) {
        this.tilladelseTypeStruktur = value;
    }

    /**
     * Gets the value of the tilladelseTypeDetaljeValg property.
     * 
     * @return
     *     possible object is
     *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg }
     *     
     */
    public TilladelseStrukturType.TilladelseTypeDetaljeValg getTilladelseTypeDetaljeValg() {
        return tilladelseTypeDetaljeValg;
    }

    /**
     * Sets the value of the tilladelseTypeDetaljeValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg }
     *     
     */
    public void setTilladelseTypeDetaljeValg(TilladelseStrukturType.TilladelseTypeDetaljeValg value) {
        this.tilladelseTypeDetaljeValg = value;
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
     *       &lt;choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="VariabelKombination"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejGenerelIdentifikatorStruktur"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="FastTilkobling"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;choice&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="KunGodkendtForJuridiskEnhed"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedIdentifikatorStruktur"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variabelKombination",
        "fastTilkobling",
        "kunGodkendtForJuridiskEnhed"
    })
    public static class TilladelseTypeDetaljeValg {

        @XmlElement(name = "VariabelKombination")
        protected TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination variabelKombination;
        @XmlElement(name = "FastTilkobling")
        protected TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling fastTilkobling;
        @XmlElement(name = "KunGodkendtForJuridiskEnhed")
        protected TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed kunGodkendtForJuridiskEnhed;

        /**
         * Gets the value of the variabelKombination property.
         * 
         * @return
         *     possible object is
         *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination }
         *     
         */
        public TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination getVariabelKombination() {
            return variabelKombination;
        }

        /**
         * Sets the value of the variabelKombination property.
         * 
         * @param value
         *     allowed object is
         *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination }
         *     
         */
        public void setVariabelKombination(TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination value) {
            this.variabelKombination = value;
        }

        /**
         * Gets the value of the fastTilkobling property.
         * 
         * @return
         *     possible object is
         *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling }
         *     
         */
        public TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling getFastTilkobling() {
            return fastTilkobling;
        }

        /**
         * Sets the value of the fastTilkobling property.
         * 
         * @param value
         *     allowed object is
         *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling }
         *     
         */
        public void setFastTilkobling(TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling value) {
            this.fastTilkobling = value;
        }

        /**
         * Gets the value of the kunGodkendtForJuridiskEnhed property.
         * 
         * @return
         *     possible object is
         *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed }
         *     
         */
        public TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed getKunGodkendtForJuridiskEnhed() {
            return kunGodkendtForJuridiskEnhed;
        }

        /**
         * Sets the value of the kunGodkendtForJuridiskEnhed property.
         * 
         * @param value
         *     allowed object is
         *     {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed }
         *     
         */
        public void setKunGodkendtForJuridiskEnhed(TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed value) {
            this.kunGodkendtForJuridiskEnhed = value;
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
         *       &lt;choice&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "koeretoejIdent",
            "koeretoejOplysningStelNummer"
        })
        public static class FastTilkobling {

            @XmlElement(name = "KoeretoejIdent")
            protected BigInteger koeretoejIdent;
            @XmlElement(name = "KoeretoejOplysningStelNummer")
            protected String koeretoejOplysningStelNummer;

            /**
             * Gets the value of the koeretoejIdent property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getKoeretoejIdent() {
                return koeretoejIdent;
            }

            /**
             * Sets the value of the koeretoejIdent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setKoeretoejIdent(BigInteger value) {
                this.koeretoejIdent = value;
            }

            /**
             * Gets the value of the koeretoejOplysningStelNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKoeretoejOplysningStelNummer() {
                return koeretoejOplysningStelNummer;
            }

            /**
             * Sets the value of the koeretoejOplysningStelNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKoeretoejOplysningStelNummer(String value) {
                this.koeretoejOplysningStelNummer = value;
            }

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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedIdentifikatorStruktur"/&gt;
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
            "juridiskEnhedIdentifikatorStruktur"
        })
        public static class KunGodkendtForJuridiskEnhed {

            @XmlElement(name = "JuridiskEnhedIdentifikatorStruktur", required = true)
            protected JuridiskEnhedIdentifikatorStrukturType juridiskEnhedIdentifikatorStruktur;

            /**
             * Gets the value of the juridiskEnhedIdentifikatorStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link JuridiskEnhedIdentifikatorStrukturType }
             *     
             */
            public JuridiskEnhedIdentifikatorStrukturType getJuridiskEnhedIdentifikatorStruktur() {
                return juridiskEnhedIdentifikatorStruktur;
            }

            /**
             * Sets the value of the juridiskEnhedIdentifikatorStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link JuridiskEnhedIdentifikatorStrukturType }
             *     
             */
            public void setJuridiskEnhedIdentifikatorStruktur(JuridiskEnhedIdentifikatorStrukturType value) {
                this.juridiskEnhedIdentifikatorStruktur = value;
            }

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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejGenerelIdentifikatorStruktur"/&gt;
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
            "koeretoejGenerelIdentifikatorStruktur"
        })
        public static class VariabelKombination {

            @XmlElement(name = "KoeretoejGenerelIdentifikatorStruktur", required = true)
            protected KoeretoejGenerelIdentifikatorStrukturType koeretoejGenerelIdentifikatorStruktur;

            /**
             * Gets the value of the koeretoejGenerelIdentifikatorStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejGenerelIdentifikatorStrukturType }
             *     
             */
            public KoeretoejGenerelIdentifikatorStrukturType getKoeretoejGenerelIdentifikatorStruktur() {
                return koeretoejGenerelIdentifikatorStruktur;
            }

            /**
             * Sets the value of the koeretoejGenerelIdentifikatorStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejGenerelIdentifikatorStrukturType }
             *     
             */
            public void setKoeretoejGenerelIdentifikatorStruktur(KoeretoejGenerelIdentifikatorStrukturType value) {
                this.koeretoejGenerelIdentifikatorStruktur = value;
            }

        }

    }

}
