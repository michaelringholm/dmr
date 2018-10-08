
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KoeretoejTekniskDataStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejTekniskDataStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseSamlingStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestStruktur" minOccurs="0"/&gt;
 *         &lt;element name="KoeretoejRegistreringGrundlag"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagIdent" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStruktur" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStruktur" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagPeriodiskSyn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagPeriodiskSynGyldigTil" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejTekniskDataStrukturType", propOrder = {
    "koeretoejIdent",
    "koeretoejOplysningStruktur",
    "tilladelseSamlingStruktur",
    "typeAttestStruktur",
    "koeretoejRegistreringGrundlag",
    "koeretoejRegistreringGrundlagPeriodiskSyn",
    "koeretoejRegistreringGrundlagPeriodiskSynGyldigTil"
})
public class KoeretoejTekniskDataStrukturType {

    @XmlElement(name = "KoeretoejIdent", required = true)
    protected BigInteger koeretoejIdent;
    @XmlElement(name = "KoeretoejOplysningStruktur", required = true)
    protected KoeretoejOplysningStrukturType koeretoejOplysningStruktur;
    @XmlElement(name = "TilladelseSamlingStruktur", required = true)
    protected TilladelseSamlingStrukturType tilladelseSamlingStruktur;
    @XmlElement(name = "TypeAttestStruktur")
    protected TypeAttestStrukturType typeAttestStruktur;
    @XmlElement(name = "KoeretoejRegistreringGrundlag", required = true)
    protected KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag koeretoejRegistreringGrundlag;
    @XmlElement(name = "KoeretoejRegistreringGrundlagPeriodiskSyn")
    @XmlSchemaType(name = "string")
    protected PeriodiskSynTypeType koeretoejRegistreringGrundlagPeriodiskSyn;
    @XmlElement(name = "KoeretoejRegistreringGrundlagPeriodiskSynGyldigTil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar koeretoejRegistreringGrundlagPeriodiskSynGyldigTil;

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
     * Gets the value of the koeretoejOplysningStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejOplysningStrukturType }
     *     
     */
    public KoeretoejOplysningStrukturType getKoeretoejOplysningStruktur() {
        return koeretoejOplysningStruktur;
    }

    /**
     * Sets the value of the koeretoejOplysningStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejOplysningStrukturType }
     *     
     */
    public void setKoeretoejOplysningStruktur(KoeretoejOplysningStrukturType value) {
        this.koeretoejOplysningStruktur = value;
    }

    /**
     * Gets the value of the tilladelseSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link TilladelseSamlingStrukturType }
     *     
     */
    public TilladelseSamlingStrukturType getTilladelseSamlingStruktur() {
        return tilladelseSamlingStruktur;
    }

    /**
     * Sets the value of the tilladelseSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilladelseSamlingStrukturType }
     *     
     */
    public void setTilladelseSamlingStruktur(TilladelseSamlingStrukturType value) {
        this.tilladelseSamlingStruktur = value;
    }

    /**
     * Gets the value of the typeAttestStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAttestStrukturType }
     *     
     */
    public TypeAttestStrukturType getTypeAttestStruktur() {
        return typeAttestStruktur;
    }

    /**
     * Sets the value of the typeAttestStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttestStrukturType }
     *     
     */
    public void setTypeAttestStruktur(TypeAttestStrukturType value) {
        this.typeAttestStruktur = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlag property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag }
     *     
     */
    public KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag getKoeretoejRegistreringGrundlag() {
        return koeretoejRegistreringGrundlag;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag }
     *     
     */
    public void setKoeretoejRegistreringGrundlag(KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag value) {
        this.koeretoejRegistreringGrundlag = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagPeriodiskSyn property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodiskSynTypeType }
     *     
     */
    public PeriodiskSynTypeType getKoeretoejRegistreringGrundlagPeriodiskSyn() {
        return koeretoejRegistreringGrundlagPeriodiskSyn;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagPeriodiskSyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodiskSynTypeType }
     *     
     */
    public void setKoeretoejRegistreringGrundlagPeriodiskSyn(PeriodiskSynTypeType value) {
        this.koeretoejRegistreringGrundlagPeriodiskSyn = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagPeriodiskSynGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringGrundlagPeriodiskSynGyldigTil() {
        return koeretoejRegistreringGrundlagPeriodiskSynGyldigTil;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagPeriodiskSynGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringGrundlagPeriodiskSynGyldigTil(XMLGregorianCalendar value) {
        this.koeretoejRegistreringGrundlagPeriodiskSynGyldigTil = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagIdent" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStruktur" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStruktur" minOccurs="0"/&gt;
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
        "koeretoejRegistreringGrundlagIdent",
        "koeretoejRegistreringGrundlagStruktur",
        "koeretoejRegistreringStruktur"
    })
    public static class KoeretoejRegistreringGrundlag {

        @XmlElement(name = "KoeretoejRegistreringGrundlagIdent")
        @XmlSchemaType(name = "integer")
        protected Long koeretoejRegistreringGrundlagIdent;
        @XmlElement(name = "KoeretoejRegistreringGrundlagStruktur")
        protected KoeretoejRegistreringGrundlagStrukturType koeretoejRegistreringGrundlagStruktur;
        @XmlElement(name = "KoeretoejRegistreringStruktur")
        protected KoeretoejRegistreringStrukturType koeretoejRegistreringStruktur;

        /**
         * Gets the value of the koeretoejRegistreringGrundlagIdent property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getKoeretoejRegistreringGrundlagIdent() {
            return koeretoejRegistreringGrundlagIdent;
        }

        /**
         * Sets the value of the koeretoejRegistreringGrundlagIdent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setKoeretoejRegistreringGrundlagIdent(Long value) {
            this.koeretoejRegistreringGrundlagIdent = value;
        }

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

    }

}
