
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlternativAdresseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativAdresseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativAdresse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseFortloebendeNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAnvendelseKode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie1" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie3" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie4" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie5" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie6" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseAdresseLinie7" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigFra" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseGyldigTil" minOccurs="0"/&gt;
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
@XmlType(name = "AlternativAdresseStrukturType", propOrder = {
    "alternativAdresse"
})
public class AlternativAdresseStrukturType {

    @XmlElement(name = "AlternativAdresse", required = true)
    protected AlternativAdresseStrukturType.AlternativAdresse alternativAdresse;

    /**
     * Gets the value of the alternativAdresse property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativAdresseStrukturType.AlternativAdresse }
     *     
     */
    public AlternativAdresseStrukturType.AlternativAdresse getAlternativAdresse() {
        return alternativAdresse;
    }

    /**
     * Sets the value of the alternativAdresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativAdresseStrukturType.AlternativAdresse }
     *     
     */
    public void setAlternativAdresse(AlternativAdresseStrukturType.AlternativAdresse value) {
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
        "adresseTypeKode",
        "adresseTypeTekst",
        "adresseTypeGyldigFra",
        "adresseTypeGyldigTil",
        "landKode",
        "landNavn"
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
