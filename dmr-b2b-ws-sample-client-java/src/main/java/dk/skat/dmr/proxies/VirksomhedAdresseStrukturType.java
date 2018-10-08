
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VirksomhedAdresseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedAdresseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseTypeKode"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeKode"/&gt;
 *         &lt;element name="AdresseValg"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Adresse"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFortloebendeNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejNavn" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusBogstav" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusBogstav" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseEtageTekst" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseSideDoerTekst" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseCONavn" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseByNavn" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostDistrikt" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejKode" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostBox" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigFra" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigTil" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}MyndighedNummer" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="AlternativAdresse"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseFortloebendeNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAnvendelseKode" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie1" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie2" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie3" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie4" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie5" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie6" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie7" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigFra" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigTil" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
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
@XmlType(name = "VirksomhedAdresseStrukturType", propOrder = {
    "virksomhedAdresseTypeKode",
    "adresseTypeKode",
    "adresseValg"
})
public class VirksomhedAdresseStrukturType {

    @XmlElement(name = "VirksomhedAdresseTypeKode", required = true)
    protected BigInteger virksomhedAdresseTypeKode;
    @XmlElement(name = "AdresseTypeKode", required = true)
    protected BigInteger adresseTypeKode;
    @XmlElement(name = "AdresseValg", required = true)
    protected VirksomhedAdresseStrukturType.AdresseValg adresseValg;

    /**
     * Gets the value of the virksomhedAdresseTypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVirksomhedAdresseTypeKode() {
        return virksomhedAdresseTypeKode;
    }

    /**
     * Sets the value of the virksomhedAdresseTypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVirksomhedAdresseTypeKode(BigInteger value) {
        this.virksomhedAdresseTypeKode = value;
    }

    /**
     * Gets the value of the adresseTypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdresseTypeKode() {
        return adresseTypeKode;
    }

    /**
     * Sets the value of the adresseTypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdresseTypeKode(BigInteger value) {
        this.adresseTypeKode = value;
    }

    /**
     * Gets the value of the adresseValg property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedAdresseStrukturType.AdresseValg }
     *     
     */
    public VirksomhedAdresseStrukturType.AdresseValg getAdresseValg() {
        return adresseValg;
    }

    /**
     * Sets the value of the adresseValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedAdresseStrukturType.AdresseValg }
     *     
     */
    public void setAdresseValg(VirksomhedAdresseStrukturType.AdresseValg value) {
        this.adresseValg = value;
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
     *           &lt;element name="Adresse"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFortloebendeNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejNavn" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusBogstav" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusBogstav" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseEtageTekst" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseSideDoerTekst" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseCONavn" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseByNavn" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostDistrikt" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejKode" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostBox" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigFra" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigTil" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}MyndighedNummer" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="AlternativAdresse"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseFortloebendeNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAnvendelseKode" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie1" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie2" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie3" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie4" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie5" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie6" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie7" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigFra" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigTil" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
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
        "adresse",
        "alternativAdresse"
    })
    public static class AdresseValg {

        @XmlElement(name = "Adresse")
        protected VirksomhedAdresseStrukturType.AdresseValg.Adresse adresse;
        @XmlElement(name = "AlternativAdresse")
        protected VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse alternativAdresse;

        /**
         * Gets the value of the adresse property.
         * 
         * @return
         *     possible object is
         *     {@link VirksomhedAdresseStrukturType.AdresseValg.Adresse }
         *     
         */
        public VirksomhedAdresseStrukturType.AdresseValg.Adresse getAdresse() {
            return adresse;
        }

        /**
         * Sets the value of the adresse property.
         * 
         * @param value
         *     allowed object is
         *     {@link VirksomhedAdresseStrukturType.AdresseValg.Adresse }
         *     
         */
        public void setAdresse(VirksomhedAdresseStrukturType.AdresseValg.Adresse value) {
            this.adresse = value;
        }

        /**
         * Gets the value of the alternativAdresse property.
         * 
         * @return
         *     possible object is
         *     {@link VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse }
         *     
         */
        public VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse getAlternativAdresse() {
            return alternativAdresse;
        }

        /**
         * Sets the value of the alternativAdresse property.
         * 
         * @param value
         *     allowed object is
         *     {@link VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse }
         *     
         */
        public void setAlternativAdresse(VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse value) {
            this.alternativAdresse = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFortloebendeNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejNavn" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusBogstav" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusBogstav" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseEtageTekst" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseSideDoerTekst" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseCONavn" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseByNavn" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostDistrikt" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejKode" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostBox" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigFra" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigTil" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}MyndighedNummer" minOccurs="0"/&gt;
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
            "adresseFortloebendeNummer",
            "adresseVejNavn",
            "adresseFraHusNummer",
            "adresseFraHusBogstav",
            "adresseTilHusNummer",
            "adresseTilHusBogstav",
            "adresseEtageTekst",
            "adresseSideDoerTekst",
            "adresseCONavn",
            "adresseByNavn",
            "adressePostNummer",
            "adressePostDistrikt",
            "adresseVejKode",
            "adressePostBox",
            "adresseGyldigFra",
            "adresseGyldigTil",
            "landKode",
            "myndighedNummer"
        })
        public static class Adresse {

            @XmlElement(name = "AdresseFortloebendeNummer")
            protected BigInteger adresseFortloebendeNummer;
            @XmlElement(name = "AdresseVejNavn")
            protected String adresseVejNavn;
            @XmlElement(name = "AdresseFraHusNummer")
            protected BigInteger adresseFraHusNummer;
            @XmlElement(name = "AdresseFraHusBogstav")
            protected String adresseFraHusBogstav;
            @XmlElement(name = "AdresseTilHusNummer")
            protected BigInteger adresseTilHusNummer;
            @XmlElement(name = "AdresseTilHusBogstav")
            protected String adresseTilHusBogstav;
            @XmlElement(name = "AdresseEtageTekst")
            protected String adresseEtageTekst;
            @XmlElement(name = "AdresseSideDoerTekst")
            protected String adresseSideDoerTekst;
            @XmlElement(name = "AdresseCONavn")
            protected String adresseCONavn;
            @XmlElement(name = "AdresseByNavn")
            protected String adresseByNavn;
            @XmlElement(name = "AdressePostNummer")
            protected BigInteger adressePostNummer;
            @XmlElement(name = "AdressePostDistrikt")
            protected String adressePostDistrikt;
            @XmlElement(name = "AdresseVejKode")
            protected BigInteger adresseVejKode;
            @XmlElement(name = "AdressePostBox")
            protected BigInteger adressePostBox;
            @XmlElement(name = "AdresseGyldigFra")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar adresseGyldigFra;
            @XmlElement(name = "AdresseGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar adresseGyldigTil;
            @XmlElement(name = "LandKode")
            protected String landKode;
            @XmlElement(name = "MyndighedNummer")
            protected BigInteger myndighedNummer;

            /**
             * Gets the value of the adresseFortloebendeNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdresseFortloebendeNummer() {
                return adresseFortloebendeNummer;
            }

            /**
             * Sets the value of the adresseFortloebendeNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdresseFortloebendeNummer(BigInteger value) {
                this.adresseFortloebendeNummer = value;
            }

            /**
             * Gets the value of the adresseVejNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseVejNavn() {
                return adresseVejNavn;
            }

            /**
             * Sets the value of the adresseVejNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseVejNavn(String value) {
                this.adresseVejNavn = value;
            }

            /**
             * Gets the value of the adresseFraHusNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdresseFraHusNummer() {
                return adresseFraHusNummer;
            }

            /**
             * Sets the value of the adresseFraHusNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdresseFraHusNummer(BigInteger value) {
                this.adresseFraHusNummer = value;
            }

            /**
             * Gets the value of the adresseFraHusBogstav property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseFraHusBogstav() {
                return adresseFraHusBogstav;
            }

            /**
             * Sets the value of the adresseFraHusBogstav property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseFraHusBogstav(String value) {
                this.adresseFraHusBogstav = value;
            }

            /**
             * Gets the value of the adresseTilHusNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdresseTilHusNummer() {
                return adresseTilHusNummer;
            }

            /**
             * Sets the value of the adresseTilHusNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdresseTilHusNummer(BigInteger value) {
                this.adresseTilHusNummer = value;
            }

            /**
             * Gets the value of the adresseTilHusBogstav property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseTilHusBogstav() {
                return adresseTilHusBogstav;
            }

            /**
             * Sets the value of the adresseTilHusBogstav property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseTilHusBogstav(String value) {
                this.adresseTilHusBogstav = value;
            }

            /**
             * Gets the value of the adresseEtageTekst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseEtageTekst() {
                return adresseEtageTekst;
            }

            /**
             * Sets the value of the adresseEtageTekst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseEtageTekst(String value) {
                this.adresseEtageTekst = value;
            }

            /**
             * Gets the value of the adresseSideDoerTekst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseSideDoerTekst() {
                return adresseSideDoerTekst;
            }

            /**
             * Sets the value of the adresseSideDoerTekst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseSideDoerTekst(String value) {
                this.adresseSideDoerTekst = value;
            }

            /**
             * Gets the value of the adresseCONavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseCONavn() {
                return adresseCONavn;
            }

            /**
             * Sets the value of the adresseCONavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseCONavn(String value) {
                this.adresseCONavn = value;
            }

            /**
             * Gets the value of the adresseByNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresseByNavn() {
                return adresseByNavn;
            }

            /**
             * Sets the value of the adresseByNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresseByNavn(String value) {
                this.adresseByNavn = value;
            }

            /**
             * Gets the value of the adressePostNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdressePostNummer() {
                return adressePostNummer;
            }

            /**
             * Sets the value of the adressePostNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdressePostNummer(BigInteger value) {
                this.adressePostNummer = value;
            }

            /**
             * Gets the value of the adressePostDistrikt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdressePostDistrikt() {
                return adressePostDistrikt;
            }

            /**
             * Sets the value of the adressePostDistrikt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdressePostDistrikt(String value) {
                this.adressePostDistrikt = value;
            }

            /**
             * Gets the value of the adresseVejKode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdresseVejKode() {
                return adresseVejKode;
            }

            /**
             * Sets the value of the adresseVejKode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdresseVejKode(BigInteger value) {
                this.adresseVejKode = value;
            }

            /**
             * Gets the value of the adressePostBox property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdressePostBox() {
                return adressePostBox;
            }

            /**
             * Sets the value of the adressePostBox property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdressePostBox(BigInteger value) {
                this.adressePostBox = value;
            }

            /**
             * Gets the value of the adresseGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAdresseGyldigFra() {
                return adresseGyldigFra;
            }

            /**
             * Sets the value of the adresseGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAdresseGyldigFra(XMLGregorianCalendar value) {
                this.adresseGyldigFra = value;
            }

            /**
             * Gets the value of the adresseGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAdresseGyldigTil() {
                return adresseGyldigTil;
            }

            /**
             * Sets the value of the adresseGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAdresseGyldigTil(XMLGregorianCalendar value) {
                this.adresseGyldigTil = value;
            }

            /**
             * Gets the value of the landKode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLandKode() {
                return landKode;
            }

            /**
             * Sets the value of the landKode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLandKode(String value) {
                this.landKode = value;
            }

            /**
             * Gets the value of the myndighedNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMyndighedNummer() {
                return myndighedNummer;
            }

            /**
             * Sets the value of the myndighedNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMyndighedNummer(BigInteger value) {
                this.myndighedNummer = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseFortloebendeNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAnvendelseKode" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie1" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie2" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie3" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie4" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie5" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie6" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie7" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigFra" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigTil" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
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
            "alternativAdresseFortloebendeNummer",
            "alternativAdresseAnvendelseKode",
            "alternativAdresseAdresseLinie1",
            "alternativAdresseAdresseLinie2",
            "alternativAdresseAdresseLinie3",
            "alternativAdresseAdresseLinie4",
            "alternativAdresseAdresseLinie5",
            "alternativAdresseAdresseLinie6",
            "alternativAdresseAdresseLinie7",
            "alternativAdresseGyldigFra",
            "alternativAdresseGyldigTil",
            "landKode"
        })
        public static class AlternativAdresse {

            @XmlElement(name = "AlternativAdresseFortloebendeNummer")
            protected BigInteger alternativAdresseFortloebendeNummer;
            @XmlElement(name = "AlternativAdresseAnvendelseKode")
            protected BigInteger alternativAdresseAnvendelseKode;
            @XmlElement(name = "AlternativAdresseAdresseLinie1")
            protected String alternativAdresseAdresseLinie1;
            @XmlElement(name = "AlternativAdresseAdresseLinie2")
            protected String alternativAdresseAdresseLinie2;
            @XmlElement(name = "AlternativAdresseAdresseLinie3")
            protected String alternativAdresseAdresseLinie3;
            @XmlElement(name = "AlternativAdresseAdresseLinie4")
            protected String alternativAdresseAdresseLinie4;
            @XmlElement(name = "AlternativAdresseAdresseLinie5")
            protected String alternativAdresseAdresseLinie5;
            @XmlElement(name = "AlternativAdresseAdresseLinie6")
            protected String alternativAdresseAdresseLinie6;
            @XmlElement(name = "AlternativAdresseAdresseLinie7")
            protected String alternativAdresseAdresseLinie7;
            @XmlElement(name = "AlternativAdresseGyldigFra")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar alternativAdresseGyldigFra;
            @XmlElement(name = "AlternativAdresseGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar alternativAdresseGyldigTil;
            @XmlElement(name = "LandKode")
            protected String landKode;

            /**
             * Gets the value of the alternativAdresseFortloebendeNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAlternativAdresseFortloebendeNummer() {
                return alternativAdresseFortloebendeNummer;
            }

            /**
             * Sets the value of the alternativAdresseFortloebendeNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAlternativAdresseFortloebendeNummer(BigInteger value) {
                this.alternativAdresseFortloebendeNummer = value;
            }

            /**
             * Gets the value of the alternativAdresseAnvendelseKode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAlternativAdresseAnvendelseKode() {
                return alternativAdresseAnvendelseKode;
            }

            /**
             * Sets the value of the alternativAdresseAnvendelseKode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAlternativAdresseAnvendelseKode(BigInteger value) {
                this.alternativAdresseAnvendelseKode = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie1() {
                return alternativAdresseAdresseLinie1;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie1(String value) {
                this.alternativAdresseAdresseLinie1 = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie2() {
                return alternativAdresseAdresseLinie2;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie2(String value) {
                this.alternativAdresseAdresseLinie2 = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie3() {
                return alternativAdresseAdresseLinie3;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie3(String value) {
                this.alternativAdresseAdresseLinie3 = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie4() {
                return alternativAdresseAdresseLinie4;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie4(String value) {
                this.alternativAdresseAdresseLinie4 = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie5() {
                return alternativAdresseAdresseLinie5;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie5(String value) {
                this.alternativAdresseAdresseLinie5 = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie6() {
                return alternativAdresseAdresseLinie6;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie6(String value) {
                this.alternativAdresseAdresseLinie6 = value;
            }

            /**
             * Gets the value of the alternativAdresseAdresseLinie7 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativAdresseAdresseLinie7() {
                return alternativAdresseAdresseLinie7;
            }

            /**
             * Sets the value of the alternativAdresseAdresseLinie7 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativAdresseAdresseLinie7(String value) {
                this.alternativAdresseAdresseLinie7 = value;
            }

            /**
             * Gets the value of the alternativAdresseGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAlternativAdresseGyldigFra() {
                return alternativAdresseGyldigFra;
            }

            /**
             * Sets the value of the alternativAdresseGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAlternativAdresseGyldigFra(XMLGregorianCalendar value) {
                this.alternativAdresseGyldigFra = value;
            }

            /**
             * Gets the value of the alternativAdresseGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAlternativAdresseGyldigTil() {
                return alternativAdresseGyldigTil;
            }

            /**
             * Sets the value of the alternativAdresseGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAlternativAdresseGyldigTil(XMLGregorianCalendar value) {
                this.alternativAdresseGyldigTil = value;
            }

            /**
             * Gets the value of the landKode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLandKode() {
                return landKode;
            }

            /**
             * Sets the value of the landKode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLandKode(String value) {
                this.landKode = value;
            }

        }

    }

}
