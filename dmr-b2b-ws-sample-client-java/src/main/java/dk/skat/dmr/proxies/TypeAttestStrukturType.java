
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TypeAttestStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeAttestStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestGyldigFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestGyldigTil" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestTypeGodkendelseNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestTypeAnmeldelseNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBetegnelseStruktur"/&gt;
 *         &lt;element name="TypeAttestVariantListe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TilladelseTypeListe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeNummer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TypeAttestStrukturType", propOrder = {
    "typeAttestGyldigFra",
    "typeAttestGyldigTil",
    "typeAttestTypeGodkendelseNummer",
    "typeAttestTypeAnmeldelseNummer",
    "koeretoejArtStruktur",
    "koeretoejBetegnelseStruktur",
    "typeAttestVariantListe",
    "tilladelseTypeListe"
})
public class TypeAttestStrukturType {

    @XmlElement(name = "TypeAttestGyldigFra", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar typeAttestGyldigFra;
    @XmlElement(name = "TypeAttestGyldigTil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar typeAttestGyldigTil;
    @XmlElement(name = "TypeAttestTypeGodkendelseNummer")
    protected String typeAttestTypeGodkendelseNummer;
    @XmlElement(name = "TypeAttestTypeAnmeldelseNummer", required = true)
    protected String typeAttestTypeAnmeldelseNummer;
    @XmlElement(name = "KoeretoejArtStruktur", required = true)
    protected KoeretoejArtStrukturType koeretoejArtStruktur;
    @XmlElement(name = "KoeretoejBetegnelseStruktur", required = true)
    protected KoeretoejBetegnelseStrukturType koeretoejBetegnelseStruktur;
    @XmlElement(name = "TypeAttestVariantListe", required = true)
    protected TypeAttestStrukturType.TypeAttestVariantListe typeAttestVariantListe;
    @XmlElement(name = "TilladelseTypeListe", required = true)
    protected TypeAttestStrukturType.TilladelseTypeListe tilladelseTypeListe;

    /**
     * Gets the value of the typeAttestGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTypeAttestGyldigFra() {
        return typeAttestGyldigFra;
    }

    /**
     * Sets the value of the typeAttestGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTypeAttestGyldigFra(XMLGregorianCalendar value) {
        this.typeAttestGyldigFra = value;
    }

    /**
     * Gets the value of the typeAttestGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTypeAttestGyldigTil() {
        return typeAttestGyldigTil;
    }

    /**
     * Sets the value of the typeAttestGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTypeAttestGyldigTil(XMLGregorianCalendar value) {
        this.typeAttestGyldigTil = value;
    }

    /**
     * Gets the value of the typeAttestTypeGodkendelseNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttestTypeGodkendelseNummer() {
        return typeAttestTypeGodkendelseNummer;
    }

    /**
     * Sets the value of the typeAttestTypeGodkendelseNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttestTypeGodkendelseNummer(String value) {
        this.typeAttestTypeGodkendelseNummer = value;
    }

    /**
     * Gets the value of the typeAttestTypeAnmeldelseNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttestTypeAnmeldelseNummer() {
        return typeAttestTypeAnmeldelseNummer;
    }

    /**
     * Sets the value of the typeAttestTypeAnmeldelseNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttestTypeAnmeldelseNummer(String value) {
        this.typeAttestTypeAnmeldelseNummer = value;
    }

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
     * Gets the value of the koeretoejBetegnelseStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBetegnelseStrukturType }
     *     
     */
    public KoeretoejBetegnelseStrukturType getKoeretoejBetegnelseStruktur() {
        return koeretoejBetegnelseStruktur;
    }

    /**
     * Sets the value of the koeretoejBetegnelseStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBetegnelseStrukturType }
     *     
     */
    public void setKoeretoejBetegnelseStruktur(KoeretoejBetegnelseStrukturType value) {
        this.koeretoejBetegnelseStruktur = value;
    }

    /**
     * Gets the value of the typeAttestVariantListe property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAttestStrukturType.TypeAttestVariantListe }
     *     
     */
    public TypeAttestStrukturType.TypeAttestVariantListe getTypeAttestVariantListe() {
        return typeAttestVariantListe;
    }

    /**
     * Sets the value of the typeAttestVariantListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttestStrukturType.TypeAttestVariantListe }
     *     
     */
    public void setTypeAttestVariantListe(TypeAttestStrukturType.TypeAttestVariantListe value) {
        this.typeAttestVariantListe = value;
    }

    /**
     * Gets the value of the tilladelseTypeListe property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAttestStrukturType.TilladelseTypeListe }
     *     
     */
    public TypeAttestStrukturType.TilladelseTypeListe getTilladelseTypeListe() {
        return tilladelseTypeListe;
    }

    /**
     * Sets the value of the tilladelseTypeListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttestStrukturType.TilladelseTypeListe }
     *     
     */
    public void setTilladelseTypeListe(TypeAttestStrukturType.TilladelseTypeListe value) {
        this.tilladelseTypeListe = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeNummer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "tilladelseTypeNummer"
    })
    public static class TilladelseTypeListe {

        @XmlElement(name = "TilladelseTypeNummer", type = Long.class)
        @XmlSchemaType(name = "integer")
        protected List<Long> tilladelseTypeNummer;

        /**
         * Gets the value of the tilladelseTypeNummer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tilladelseTypeNummer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTilladelseTypeNummer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTilladelseTypeNummer() {
            if (tilladelseTypeNummer == null) {
                tilladelseTypeNummer = new ArrayList<Long>();
            }
            return this.tilladelseTypeNummer;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "typeAttestVariantStruktur"
    })
    public static class TypeAttestVariantListe {

        @XmlElement(name = "TypeAttestVariantStruktur")
        protected List<TypeAttestVariantStrukturType> typeAttestVariantStruktur;

        /**
         * Gets the value of the typeAttestVariantStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeAttestVariantStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypeAttestVariantStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeAttestVariantStrukturType }
         * 
         * 
         */
        public List<TypeAttestVariantStrukturType> getTypeAttestVariantStruktur() {
            if (typeAttestVariantStruktur == null) {
                typeAttestVariantStruktur = new ArrayList<TypeAttestVariantStrukturType>();
            }
            return this.typeAttestVariantStruktur;
        }

    }

}
