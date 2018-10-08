
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdresseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adresse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFortloebendeNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseAnvendelseKode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejNavn" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejKode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusBogstav" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusBogstav" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseLigeUlige" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseEtageTekst" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseSideDoerTekst" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseCONavn" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostDistrikt" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseByNavn" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostBox" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigFra" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigTil" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeKode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeTekst" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeGyldigFra" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeGyldigTil" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandNavn" minOccurs="0"/&gt;
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
@XmlType(name = "AdresseStrukturType", propOrder = {
    "adresse"
})
public class AdresseStrukturType {

    @XmlElement(name = "Adresse", required = true)
    protected AdresseStrukturType.Adresse adresse;

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseStrukturType.Adresse }
     *     
     */
    public AdresseStrukturType.Adresse getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseStrukturType.Adresse }
     *     
     */
    public void setAdresse(AdresseStrukturType.Adresse value) {
        this.adresse = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseAnvendelseKode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejNavn" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseVejKode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusNummer" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusNummer" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseFraHusBogstav" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTilHusBogstav" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseLigeUlige" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseEtageTekst" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseSideDoerTekst" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseCONavn" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostNummer" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostDistrikt" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseByNavn" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdressePostBox" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigFra" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseGyldigTil" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeKode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeTekst" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeGyldigFra" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseTypeGyldigTil" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandKode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}LandNavn" minOccurs="0"/&gt;
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
        "adresseAnvendelseKode",
        "adresseVejNavn",
        "adresseVejKode",
        "adresseFraHusNummer",
        "adresseTilHusNummer",
        "adresseFraHusBogstav",
        "adresseTilHusBogstav",
        "adresseLigeUlige",
        "adresseEtageTekst",
        "adresseSideDoerTekst",
        "adresseCONavn",
        "adressePostNummer",
        "adressePostDistrikt",
        "adresseByNavn",
        "adressePostBox",
        "adresseGyldigFra",
        "adresseGyldigTil",
        "adresseTypeKode",
        "adresseTypeTekst",
        "adresseTypeGyldigFra",
        "adresseTypeGyldigTil",
        "landKode",
        "landNavn"
    })
    public static class Adresse {

        @XmlElement(name = "AdresseFortloebendeNummer")
        protected BigInteger adresseFortloebendeNummer;
        @XmlElement(name = "AdresseAnvendelseKode")
        protected BigInteger adresseAnvendelseKode;
        @XmlElement(name = "AdresseVejNavn")
        protected String adresseVejNavn;
        @XmlElement(name = "AdresseVejKode")
        protected BigInteger adresseVejKode;
        @XmlElement(name = "AdresseFraHusNummer")
        protected BigInteger adresseFraHusNummer;
        @XmlElement(name = "AdresseTilHusNummer")
        protected BigInteger adresseTilHusNummer;
        @XmlElement(name = "AdresseFraHusBogstav")
        protected String adresseFraHusBogstav;
        @XmlElement(name = "AdresseTilHusBogstav")
        protected String adresseTilHusBogstav;
        @XmlElement(name = "AdresseLigeUlige")
        @XmlSchemaType(name = "string")
        protected LigeUligeType adresseLigeUlige;
        @XmlElement(name = "AdresseEtageTekst")
        protected String adresseEtageTekst;
        @XmlElement(name = "AdresseSideDoerTekst")
        protected String adresseSideDoerTekst;
        @XmlElement(name = "AdresseCONavn")
        protected String adresseCONavn;
        @XmlElement(name = "AdressePostNummer")
        protected BigInteger adressePostNummer;
        @XmlElement(name = "AdressePostDistrikt")
        protected String adressePostDistrikt;
        @XmlElement(name = "AdresseByNavn")
        protected String adresseByNavn;
        @XmlElement(name = "AdressePostBox")
        protected BigInteger adressePostBox;
        @XmlElement(name = "AdresseGyldigFra")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar adresseGyldigFra;
        @XmlElement(name = "AdresseGyldigTil")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar adresseGyldigTil;
        @XmlElement(name = "AdresseTypeKode")
        protected BigInteger adresseTypeKode;
        @XmlElement(name = "AdresseTypeTekst")
        protected String adresseTypeTekst;
        @XmlElement(name = "AdresseTypeGyldigFra")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar adresseTypeGyldigFra;
        @XmlElement(name = "AdresseTypeGyldigTil")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar adresseTypeGyldigTil;
        @XmlElement(name = "LandKode")
        protected String landKode;
        @XmlElement(name = "LandNavn")
        protected String landNavn;

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
         * Gets the value of the adresseAnvendelseKode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAdresseAnvendelseKode() {
            return adresseAnvendelseKode;
        }

        /**
         * Sets the value of the adresseAnvendelseKode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAdresseAnvendelseKode(BigInteger value) {
            this.adresseAnvendelseKode = value;
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
         * Gets the value of the adresseLigeUlige property.
         * 
         * @return
         *     possible object is
         *     {@link LigeUligeType }
         *     
         */
        public LigeUligeType getAdresseLigeUlige() {
            return adresseLigeUlige;
        }

        /**
         * Sets the value of the adresseLigeUlige property.
         * 
         * @param value
         *     allowed object is
         *     {@link LigeUligeType }
         *     
         */
        public void setAdresseLigeUlige(LigeUligeType value) {
            this.adresseLigeUlige = value;
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
         * Gets the value of the adresseTypeTekst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdresseTypeTekst() {
            return adresseTypeTekst;
        }

        /**
         * Sets the value of the adresseTypeTekst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdresseTypeTekst(String value) {
            this.adresseTypeTekst = value;
        }

        /**
         * Gets the value of the adresseTypeGyldigFra property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAdresseTypeGyldigFra() {
            return adresseTypeGyldigFra;
        }

        /**
         * Sets the value of the adresseTypeGyldigFra property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAdresseTypeGyldigFra(XMLGregorianCalendar value) {
            this.adresseTypeGyldigFra = value;
        }

        /**
         * Gets the value of the adresseTypeGyldigTil property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAdresseTypeGyldigTil() {
            return adresseTypeGyldigTil;
        }

        /**
         * Sets the value of the adresseTypeGyldigTil property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAdresseTypeGyldigTil(XMLGregorianCalendar value) {
            this.adresseTypeGyldigTil = value;
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
         * Gets the value of the landNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLandNavn() {
            return landNavn;
        }

        /**
         * Sets the value of the landNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLandNavn(String value) {
            this.landNavn = value;
        }

    }

}
