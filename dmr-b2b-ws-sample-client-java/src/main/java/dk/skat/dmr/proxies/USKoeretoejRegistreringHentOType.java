
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USKoeretoejRegistreringHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejRegistreringHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="Indhold" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KoeretoejRegistreringGrundlagResultat" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStruktur"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerStruktur"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerRettighedType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerRettighedGyldigFra" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerRettighedGyldigTil" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStruktur" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerSamlingStruktur" minOccurs="0"/&gt;
 *                   &lt;element name="Forsikring" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStruktur"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Leasing" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LeasingGyldigFra"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LeasingGyldigTil"/&gt;
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
@XmlType(name = "USKoeretoejRegistreringHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "indhold"
})
@XmlSeeAlso({
    USKoeretoejRegistreringHentO.class
})
public class USKoeretoejRegistreringHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "Indhold")
    protected USKoeretoejRegistreringHentOType.Indhold indhold;

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
     * Gets the value of the indhold property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejRegistreringHentOType.Indhold }
     *     
     */
    public USKoeretoejRegistreringHentOType.Indhold getIndhold() {
        return indhold;
    }

    /**
     * Sets the value of the indhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejRegistreringHentOType.Indhold }
     *     
     */
    public void setIndhold(USKoeretoejRegistreringHentOType.Indhold value) {
        this.indhold = value;
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
     *         &lt;element name="KoeretoejRegistreringGrundlagResultat" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStruktur"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerStruktur"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerRettighedType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerRettighedGyldigFra" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerRettighedGyldigTil" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStruktur" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerSamlingStruktur" minOccurs="0"/&gt;
     *         &lt;element name="Forsikring" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStruktur"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Leasing" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LeasingGyldigFra"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LeasingGyldigTil"/&gt;
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
        "koeretoejRegistreringGrundlagResultat",
        "registreringNummerStruktur",
        "registreringNummerRettighedType",
        "registreringNummerRettighedGyldigFra",
        "registreringNummerRettighedGyldigTil",
        "koeretoejRegistreringStruktur",
        "koeretoejOplysningStelNummer",
        "ejerBrugerSamlingStruktur",
        "forsikring",
        "leasing"
    })
    public static class Indhold {

        @XmlElement(name = "KoeretoejRegistreringGrundlagResultat")
        protected USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat koeretoejRegistreringGrundlagResultat;
        @XmlElement(name = "RegistreringNummerStruktur", required = true)
        protected RegistreringNummerStrukturType registreringNummerStruktur;
        @XmlElement(name = "RegistreringNummerRettighedType")
        @XmlSchemaType(name = "string")
        protected RegistreringNummerRettighedTypeType registreringNummerRettighedType;
        @XmlElement(name = "RegistreringNummerRettighedGyldigFra")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registreringNummerRettighedGyldigFra;
        @XmlElement(name = "RegistreringNummerRettighedGyldigTil")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registreringNummerRettighedGyldigTil;
        @XmlElement(name = "KoeretoejRegistreringStruktur")
        protected KoeretoejRegistreringStrukturType koeretoejRegistreringStruktur;
        @XmlElement(name = "KoeretoejOplysningStelNummer")
        protected String koeretoejOplysningStelNummer;
        @XmlElement(name = "EjerBrugerSamlingStruktur")
        protected EjerBrugerSamlingStrukturType ejerBrugerSamlingStruktur;
        @XmlElement(name = "Forsikring")
        protected USKoeretoejRegistreringHentOType.Indhold.Forsikring forsikring;
        @XmlElement(name = "Leasing")
        protected USKoeretoejRegistreringHentOType.Indhold.Leasing leasing;

        /**
         * Gets the value of the koeretoejRegistreringGrundlagResultat property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat }
         *     
         */
        public USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat getKoeretoejRegistreringGrundlagResultat() {
            return koeretoejRegistreringGrundlagResultat;
        }

        /**
         * Sets the value of the koeretoejRegistreringGrundlagResultat property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat }
         *     
         */
        public void setKoeretoejRegistreringGrundlagResultat(USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat value) {
            this.koeretoejRegistreringGrundlagResultat = value;
        }

        /**
         * Gets the value of the registreringNummerStruktur property.
         * 
         * @return
         *     possible object is
         *     {@link RegistreringNummerStrukturType }
         *     
         */
        public RegistreringNummerStrukturType getRegistreringNummerStruktur() {
            return registreringNummerStruktur;
        }

        /**
         * Sets the value of the registreringNummerStruktur property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistreringNummerStrukturType }
         *     
         */
        public void setRegistreringNummerStruktur(RegistreringNummerStrukturType value) {
            this.registreringNummerStruktur = value;
        }

        /**
         * Gets the value of the registreringNummerRettighedType property.
         * 
         * @return
         *     possible object is
         *     {@link RegistreringNummerRettighedTypeType }
         *     
         */
        public RegistreringNummerRettighedTypeType getRegistreringNummerRettighedType() {
            return registreringNummerRettighedType;
        }

        /**
         * Sets the value of the registreringNummerRettighedType property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistreringNummerRettighedTypeType }
         *     
         */
        public void setRegistreringNummerRettighedType(RegistreringNummerRettighedTypeType value) {
            this.registreringNummerRettighedType = value;
        }

        /**
         * Gets the value of the registreringNummerRettighedGyldigFra property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistreringNummerRettighedGyldigFra() {
            return registreringNummerRettighedGyldigFra;
        }

        /**
         * Sets the value of the registreringNummerRettighedGyldigFra property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistreringNummerRettighedGyldigFra(XMLGregorianCalendar value) {
            this.registreringNummerRettighedGyldigFra = value;
        }

        /**
         * Gets the value of the registreringNummerRettighedGyldigTil property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistreringNummerRettighedGyldigTil() {
            return registreringNummerRettighedGyldigTil;
        }

        /**
         * Sets the value of the registreringNummerRettighedGyldigTil property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistreringNummerRettighedGyldigTil(XMLGregorianCalendar value) {
            this.registreringNummerRettighedGyldigTil = value;
        }

        /**
         * Gets the value of the koeretoejRegistreringStruktur property.
         * 
         * @return
         *     possible object is
         *     {@link KoeretoejRegistreringStrukturType }
         *     
         */
        public KoeretoejRegistreringStrukturType getKoeretoejRegistreringStruktur() {
            return koeretoejRegistreringStruktur;
        }

        /**
         * Sets the value of the koeretoejRegistreringStruktur property.
         * 
         * @param value
         *     allowed object is
         *     {@link KoeretoejRegistreringStrukturType }
         *     
         */
        public void setKoeretoejRegistreringStruktur(KoeretoejRegistreringStrukturType value) {
            this.koeretoejRegistreringStruktur = value;
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

        /**
         * Gets the value of the ejerBrugerSamlingStruktur property.
         * 
         * @return
         *     possible object is
         *     {@link EjerBrugerSamlingStrukturType }
         *     
         */
        public EjerBrugerSamlingStrukturType getEjerBrugerSamlingStruktur() {
            return ejerBrugerSamlingStruktur;
        }

        /**
         * Sets the value of the ejerBrugerSamlingStruktur property.
         * 
         * @param value
         *     allowed object is
         *     {@link EjerBrugerSamlingStrukturType }
         *     
         */
        public void setEjerBrugerSamlingStruktur(EjerBrugerSamlingStrukturType value) {
            this.ejerBrugerSamlingStruktur = value;
        }

        /**
         * Gets the value of the forsikring property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejRegistreringHentOType.Indhold.Forsikring }
         *     
         */
        public USKoeretoejRegistreringHentOType.Indhold.Forsikring getForsikring() {
            return forsikring;
        }

        /**
         * Sets the value of the forsikring property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejRegistreringHentOType.Indhold.Forsikring }
         *     
         */
        public void setForsikring(USKoeretoejRegistreringHentOType.Indhold.Forsikring value) {
            this.forsikring = value;
        }

        /**
         * Gets the value of the leasing property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejRegistreringHentOType.Indhold.Leasing }
         *     
         */
        public USKoeretoejRegistreringHentOType.Indhold.Leasing getLeasing() {
            return leasing;
        }

        /**
         * Sets the value of the leasing property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejRegistreringHentOType.Indhold.Leasing }
         *     
         */
        public void setLeasing(USKoeretoejRegistreringHentOType.Indhold.Leasing value) {
            this.leasing = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStruktur"/&gt;
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
            "forsikringSelskabIdentifikatorStruktur",
            "forsikringStruktur"
        })
        public static class Forsikring {

            @XmlElement(name = "ForsikringSelskabIdentifikatorStruktur", required = true)
            protected ForsikringSelskabIdentifikatorStrukturType forsikringSelskabIdentifikatorStruktur;
            @XmlElement(name = "ForsikringStruktur", required = true)
            protected ForsikringStrukturType forsikringStruktur;

            /**
             * Gets the value of the forsikringSelskabIdentifikatorStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link ForsikringSelskabIdentifikatorStrukturType }
             *     
             */
            public ForsikringSelskabIdentifikatorStrukturType getForsikringSelskabIdentifikatorStruktur() {
                return forsikringSelskabIdentifikatorStruktur;
            }

            /**
             * Sets the value of the forsikringSelskabIdentifikatorStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link ForsikringSelskabIdentifikatorStrukturType }
             *     
             */
            public void setForsikringSelskabIdentifikatorStruktur(ForsikringSelskabIdentifikatorStrukturType value) {
                this.forsikringSelskabIdentifikatorStruktur = value;
            }

            /**
             * Gets the value of the forsikringStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link ForsikringStrukturType }
             *     
             */
            public ForsikringStrukturType getForsikringStruktur() {
                return forsikringStruktur;
            }

            /**
             * Sets the value of the forsikringStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link ForsikringStrukturType }
             *     
             */
            public void setForsikringStruktur(ForsikringStrukturType value) {
                this.forsikringStruktur = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStruktur"/&gt;
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
            "koeretoejRegistreringGrundlagStruktur"
        })
        public static class KoeretoejRegistreringGrundlagResultat {

            @XmlElement(name = "KoeretoejRegistreringGrundlagStruktur", required = true)
            protected KoeretoejRegistreringGrundlagStrukturType koeretoejRegistreringGrundlagStruktur;

            /**
             * Gets the value of the koeretoejRegistreringGrundlagStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejRegistreringGrundlagStrukturType }
             *     
             */
            public KoeretoejRegistreringGrundlagStrukturType getKoeretoejRegistreringGrundlagStruktur() {
                return koeretoejRegistreringGrundlagStruktur;
            }

            /**
             * Sets the value of the koeretoejRegistreringGrundlagStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejRegistreringGrundlagStrukturType }
             *     
             */
            public void setKoeretoejRegistreringGrundlagStruktur(KoeretoejRegistreringGrundlagStrukturType value) {
                this.koeretoejRegistreringGrundlagStruktur = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LeasingGyldigFra"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LeasingGyldigTil"/&gt;
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
            "leasingGyldigFra",
            "leasingGyldigTil"
        })
        public static class Leasing {

            @XmlElement(name = "LeasingGyldigFra", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar leasingGyldigFra;
            @XmlElement(name = "LeasingGyldigTil", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar leasingGyldigTil;

            /**
             * Gets the value of the leasingGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLeasingGyldigFra() {
                return leasingGyldigFra;
            }

            /**
             * Sets the value of the leasingGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLeasingGyldigFra(XMLGregorianCalendar value) {
                this.leasingGyldigFra = value;
            }

            /**
             * Gets the value of the leasingGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLeasingGyldigTil() {
                return leasingGyldigTil;
            }

            /**
             * Sets the value of the leasingGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLeasingGyldigTil(XMLGregorianCalendar value) {
                this.leasingGyldigTil = value;
            }

        }

    }

}
