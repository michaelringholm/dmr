
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejCoCOpret_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejCoCOpret_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer" minOccurs="0"/&gt;
 *         &lt;element name="TilladelseSamlingListe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tilladelse" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
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
@XmlType(name = "USKoeretoejCoCOpret_IType", propOrder = {
    "hovedOplysninger",
    "koeretoejOplysningStruktur",
    "koeretoejRegistreringGrundlagStruktur",
    "virksomhedSENummer",
    "tilladelseSamlingListe"
})
@XmlSeeAlso({
    USKoeretoejCoCOpretI.class
})
public class USKoeretoejCoCOpretIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "KoeretoejOplysningStruktur", required = true)
    protected KoeretoejOplysningStrukturType koeretoejOplysningStruktur;
    @XmlElement(name = "KoeretoejRegistreringGrundlagStruktur")
    protected KoeretoejRegistreringGrundlagStrukturType koeretoejRegistreringGrundlagStruktur;
    @XmlElement(name = "VirksomhedSENummer")
    protected BigInteger virksomhedSENummer;
    @XmlElement(name = "TilladelseSamlingListe")
    protected USKoeretoejCoCOpretIType.TilladelseSamlingListe tilladelseSamlingListe;

    /**
     * Gets the value of the hovedOplysninger property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerType }
     *     
     */
    public HovedOplysningerType getHovedOplysninger() {
        return hovedOplysninger;
    }

    /**
     * Sets the value of the hovedOplysninger property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerType }
     *     
     */
    public void setHovedOplysninger(HovedOplysningerType value) {
        this.hovedOplysninger = value;
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
     * Gets the value of the virksomhedSENummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVirksomhedSENummer() {
        return virksomhedSENummer;
    }

    /**
     * Sets the value of the virksomhedSENummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVirksomhedSENummer(BigInteger value) {
        this.virksomhedSENummer = value;
    }

    /**
     * Gets the value of the tilladelseSamlingListe property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejCoCOpretIType.TilladelseSamlingListe }
     *     
     */
    public USKoeretoejCoCOpretIType.TilladelseSamlingListe getTilladelseSamlingListe() {
        return tilladelseSamlingListe;
    }

    /**
     * Sets the value of the tilladelseSamlingListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejCoCOpretIType.TilladelseSamlingListe }
     *     
     */
    public void setTilladelseSamlingListe(USKoeretoejCoCOpretIType.TilladelseSamlingListe value) {
        this.tilladelseSamlingListe = value;
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
    public static class TilladelseSamlingListe {

        @XmlElement(name = "Tilladelse")
        protected List<USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse> tilladelse;

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
         * {@link USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse }
         * 
         * 
         */
        public List<USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse> getTilladelse() {
            if (tilladelse == null) {
                tilladelse = new ArrayList<USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse>();
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
            "tilladelseStruktur"
        })
        public static class Tilladelse {

            @XmlElement(name = "TilladelseStruktur", required = true)
            protected TilladelseStrukturType tilladelseStruktur;

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
