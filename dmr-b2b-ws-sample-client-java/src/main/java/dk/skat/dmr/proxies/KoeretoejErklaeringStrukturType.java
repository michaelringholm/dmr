
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KoeretoejErklaeringStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejErklaeringStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringGyldigFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringGyldigTil"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringForetagneAendringer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringOprettetAfRolle"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagIdent"/&gt;
 *         &lt;element name="Forhandler" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
@XmlType(name = "KoeretoejErklaeringStrukturType", propOrder = {
    "koeretoejErklaeringNummer",
    "koeretoejErklaeringGyldigFra",
    "koeretoejErklaeringGyldigTil",
    "koeretoejErklaeringForetagneAendringer",
    "koeretoejErklaeringOprettetAfRolle",
    "juridiskEnhedStruktur",
    "koeretoejRegistreringGrundlagIdent",
    "forhandler"
})
public class KoeretoejErklaeringStrukturType {

    @XmlElement(name = "KoeretoejErklaeringNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejErklaeringNummer;
    @XmlElement(name = "KoeretoejErklaeringGyldigFra", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejErklaeringGyldigFra;
    @XmlElement(name = "KoeretoejErklaeringGyldigTil", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejErklaeringGyldigTil;
    @XmlElement(name = "KoeretoejErklaeringForetagneAendringer")
    protected String koeretoejErklaeringForetagneAendringer;
    @XmlElement(name = "KoeretoejErklaeringOprettetAfRolle", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejErklaeringOpretterRolleType koeretoejErklaeringOprettetAfRolle;
    @XmlElement(name = "JuridiskEnhedStruktur", required = true)
    protected JuridiskEnhedStrukturType juridiskEnhedStruktur;
    @XmlElement(name = "KoeretoejRegistreringGrundlagIdent")
    @XmlSchemaType(name = "integer")
    protected long koeretoejRegistreringGrundlagIdent;
    @XmlElement(name = "Forhandler")
    protected KoeretoejErklaeringStrukturType.Forhandler forhandler;

    /**
     * Gets the value of the koeretoejErklaeringNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejErklaeringNummer() {
        return koeretoejErklaeringNummer;
    }

    /**
     * Sets the value of the koeretoejErklaeringNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejErklaeringNummer(Long value) {
        this.koeretoejErklaeringNummer = value;
    }

    /**
     * Gets the value of the koeretoejErklaeringGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejErklaeringGyldigFra() {
        return koeretoejErklaeringGyldigFra;
    }

    /**
     * Sets the value of the koeretoejErklaeringGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejErklaeringGyldigFra(XMLGregorianCalendar value) {
        this.koeretoejErklaeringGyldigFra = value;
    }

    /**
     * Gets the value of the koeretoejErklaeringGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejErklaeringGyldigTil() {
        return koeretoejErklaeringGyldigTil;
    }

    /**
     * Sets the value of the koeretoejErklaeringGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejErklaeringGyldigTil(XMLGregorianCalendar value) {
        this.koeretoejErklaeringGyldigTil = value;
    }

    /**
     * Gets the value of the koeretoejErklaeringForetagneAendringer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejErklaeringForetagneAendringer() {
        return koeretoejErklaeringForetagneAendringer;
    }

    /**
     * Sets the value of the koeretoejErklaeringForetagneAendringer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejErklaeringForetagneAendringer(String value) {
        this.koeretoejErklaeringForetagneAendringer = value;
    }

    /**
     * Gets the value of the koeretoejErklaeringOprettetAfRolle property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejErklaeringOpretterRolleType }
     *     
     */
    public KoeretoejErklaeringOpretterRolleType getKoeretoejErklaeringOprettetAfRolle() {
        return koeretoejErklaeringOprettetAfRolle;
    }

    /**
     * Sets the value of the koeretoejErklaeringOprettetAfRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejErklaeringOpretterRolleType }
     *     
     */
    public void setKoeretoejErklaeringOprettetAfRolle(KoeretoejErklaeringOpretterRolleType value) {
        this.koeretoejErklaeringOprettetAfRolle = value;
    }

    /**
     * Gets the value of the juridiskEnhedStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link JuridiskEnhedStrukturType }
     *     
     */
    public JuridiskEnhedStrukturType getJuridiskEnhedStruktur() {
        return juridiskEnhedStruktur;
    }

    /**
     * Sets the value of the juridiskEnhedStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuridiskEnhedStrukturType }
     *     
     */
    public void setJuridiskEnhedStruktur(JuridiskEnhedStrukturType value) {
        this.juridiskEnhedStruktur = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagIdent property.
     * 
     */
    public long getKoeretoejRegistreringGrundlagIdent() {
        return koeretoejRegistreringGrundlagIdent;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagIdent property.
     * 
     */
    public void setKoeretoejRegistreringGrundlagIdent(long value) {
        this.koeretoejRegistreringGrundlagIdent = value;
    }

    /**
     * Gets the value of the forhandler property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejErklaeringStrukturType.Forhandler }
     *     
     */
    public KoeretoejErklaeringStrukturType.Forhandler getForhandler() {
        return forhandler;
    }

    /**
     * Sets the value of the forhandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejErklaeringStrukturType.Forhandler }
     *     
     */
    public void setForhandler(KoeretoejErklaeringStrukturType.Forhandler value) {
        this.forhandler = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
        "juridiskEnhedStruktur"
    })
    public static class Forhandler {

        @XmlElement(name = "JuridiskEnhedStruktur", required = true)
        protected JuridiskEnhedStrukturType juridiskEnhedStruktur;

        /**
         * Gets the value of the juridiskEnhedStruktur property.
         * 
         * @return
         *     possible object is
         *     {@link JuridiskEnhedStrukturType }
         *     
         */
        public JuridiskEnhedStrukturType getJuridiskEnhedStruktur() {
            return juridiskEnhedStruktur;
        }

        /**
         * Sets the value of the juridiskEnhedStruktur property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuridiskEnhedStrukturType }
         *     
         */
        public void setJuridiskEnhedStruktur(JuridiskEnhedStrukturType value) {
            this.juridiskEnhedStruktur = value;
        }

    }

}
