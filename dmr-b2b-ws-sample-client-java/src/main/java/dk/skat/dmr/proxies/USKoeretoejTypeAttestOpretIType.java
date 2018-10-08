
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejTypeAttestOpret_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejTypeAttestOpret_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejFarveStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrSamlingStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningModelAar" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTilkoblingMulighed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysning30PctVarevogn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningNCAPTest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejSupplerendeKarrosseriSamlingStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningVejvenligLuftaffjedring" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorFuelmode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningEftermonteretPartikelfilter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeSamlingStruktur" minOccurs="0"/&gt;
 *         &lt;element name="TypeGodkendelseAttest"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantNummer"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestTypeAnmeldelseNummer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USKoeretoejTypeAttestOpret_IType", propOrder = {
    "hovedOplysninger",
    "koeretoejOplysningStelNummer",
    "koeretoejFarveStruktur",
    "koeretoejUdstyrSamlingStruktur",
    "prisOplysningerStruktur",
    "koeretoejOplysningModelAar",
    "koeretoejOplysningTilkoblingMulighed",
    "koeretoejOplysning30PctVarevogn",
    "koeretoejOplysningNCAPTest",
    "koeretoejAnvendelseStruktur",
    "koeretoejSupplerendeKarrosseriSamlingStruktur",
    "koeretoejOplysningVejvenligLuftaffjedring",
    "koeretoejMotorFuelmode",
    "koeretoejMiljoeOplysningEftermonteretPartikelfilter",
    "dispensationTypeSamlingStruktur",
    "typeGodkendelseAttest",
    "virksomhedSENummer"
})
@XmlSeeAlso({
    USKoeretoejTypeAttestOpretI.class
})
public class USKoeretoejTypeAttestOpretIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "KoeretoejOplysningStelNummer", required = true)
    protected String koeretoejOplysningStelNummer;
    @XmlElement(name = "KoeretoejFarveStruktur")
    protected KoeretoejFarveStrukturType koeretoejFarveStruktur;
    @XmlElement(name = "KoeretoejUdstyrSamlingStruktur")
    protected KoeretoejUdstyrSamlingStrukturType koeretoejUdstyrSamlingStruktur;
    @XmlElement(name = "PrisOplysningerStruktur")
    protected PrisOplysningerStrukturType prisOplysningerStruktur;
    @XmlElement(name = "KoeretoejOplysningModelAar")
    @XmlSchemaType(name = "integer")
    protected Integer koeretoejOplysningModelAar;
    @XmlElement(name = "KoeretoejOplysningTilkoblingMulighed")
    protected Boolean koeretoejOplysningTilkoblingMulighed;
    @XmlElement(name = "KoeretoejOplysning30PctVarevogn")
    protected boolean koeretoejOplysning30PctVarevogn;
    @XmlElement(name = "KoeretoejOplysningNCAPTest")
    protected Boolean koeretoejOplysningNCAPTest;
    @XmlElement(name = "KoeretoejAnvendelseStruktur")
    protected KoeretoejAnvendelseStrukturType koeretoejAnvendelseStruktur;
    @XmlElement(name = "KoeretoejSupplerendeKarrosseriSamlingStruktur")
    protected KoeretoejSupplerendeKarrosseriSamlingStrukturType koeretoejSupplerendeKarrosseriSamlingStruktur;
    @XmlElement(name = "KoeretoejOplysningVejvenligLuftaffjedring")
    protected Boolean koeretoejOplysningVejvenligLuftaffjedring;
    @XmlElement(name = "KoeretoejMotorFuelmode")
    @XmlSchemaType(name = "string")
    protected FuelmodeTypeType koeretoejMotorFuelmode;
    @XmlElement(name = "KoeretoejMiljoeOplysningEftermonteretPartikelfilter")
    protected Boolean koeretoejMiljoeOplysningEftermonteretPartikelfilter;
    @XmlElement(name = "DispensationTypeSamlingStruktur")
    protected DispensationTypeSamlingStrukturType dispensationTypeSamlingStruktur;
    @XmlElement(name = "TypeGodkendelseAttest", required = true)
    protected USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest typeGodkendelseAttest;
    @XmlElement(name = "VirksomhedSENummer")
    protected BigInteger virksomhedSENummer;

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
     * Gets the value of the koeretoejFarveStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejFarveStrukturType }
     *     
     */
    public KoeretoejFarveStrukturType getKoeretoejFarveStruktur() {
        return koeretoejFarveStruktur;
    }

    /**
     * Sets the value of the koeretoejFarveStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejFarveStrukturType }
     *     
     */
    public void setKoeretoejFarveStruktur(KoeretoejFarveStrukturType value) {
        this.koeretoejFarveStruktur = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejUdstyrSamlingStrukturType }
     *     
     */
    public KoeretoejUdstyrSamlingStrukturType getKoeretoejUdstyrSamlingStruktur() {
        return koeretoejUdstyrSamlingStruktur;
    }

    /**
     * Sets the value of the koeretoejUdstyrSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejUdstyrSamlingStrukturType }
     *     
     */
    public void setKoeretoejUdstyrSamlingStruktur(KoeretoejUdstyrSamlingStrukturType value) {
        this.koeretoejUdstyrSamlingStruktur = value;
    }

    /**
     * Gets the value of the prisOplysningerStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link PrisOplysningerStrukturType }
     *     
     */
    public PrisOplysningerStrukturType getPrisOplysningerStruktur() {
        return prisOplysningerStruktur;
    }

    /**
     * Sets the value of the prisOplysningerStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrisOplysningerStrukturType }
     *     
     */
    public void setPrisOplysningerStruktur(PrisOplysningerStrukturType value) {
        this.prisOplysningerStruktur = value;
    }

    /**
     * Gets the value of the koeretoejOplysningModelAar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKoeretoejOplysningModelAar() {
        return koeretoejOplysningModelAar;
    }

    /**
     * Sets the value of the koeretoejOplysningModelAar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKoeretoejOplysningModelAar(Integer value) {
        this.koeretoejOplysningModelAar = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTilkoblingMulighed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningTilkoblingMulighed() {
        return koeretoejOplysningTilkoblingMulighed;
    }

    /**
     * Sets the value of the koeretoejOplysningTilkoblingMulighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningTilkoblingMulighed(Boolean value) {
        this.koeretoejOplysningTilkoblingMulighed = value;
    }

    /**
     * Gets the value of the koeretoejOplysning30PctVarevogn property.
     * 
     */
    public boolean isKoeretoejOplysning30PctVarevogn() {
        return koeretoejOplysning30PctVarevogn;
    }

    /**
     * Sets the value of the koeretoejOplysning30PctVarevogn property.
     * 
     */
    public void setKoeretoejOplysning30PctVarevogn(boolean value) {
        this.koeretoejOplysning30PctVarevogn = value;
    }

    /**
     * Gets the value of the koeretoejOplysningNCAPTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningNCAPTest() {
        return koeretoejOplysningNCAPTest;
    }

    /**
     * Sets the value of the koeretoejOplysningNCAPTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningNCAPTest(Boolean value) {
        this.koeretoejOplysningNCAPTest = value;
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

    /**
     * Gets the value of the koeretoejSupplerendeKarrosseriSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType }
     *     
     */
    public KoeretoejSupplerendeKarrosseriSamlingStrukturType getKoeretoejSupplerendeKarrosseriSamlingStruktur() {
        return koeretoejSupplerendeKarrosseriSamlingStruktur;
    }

    /**
     * Sets the value of the koeretoejSupplerendeKarrosseriSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType }
     *     
     */
    public void setKoeretoejSupplerendeKarrosseriSamlingStruktur(KoeretoejSupplerendeKarrosseriSamlingStrukturType value) {
        this.koeretoejSupplerendeKarrosseriSamlingStruktur = value;
    }

    /**
     * Gets the value of the koeretoejOplysningVejvenligLuftaffjedring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningVejvenligLuftaffjedring() {
        return koeretoejOplysningVejvenligLuftaffjedring;
    }

    /**
     * Sets the value of the koeretoejOplysningVejvenligLuftaffjedring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningVejvenligLuftaffjedring(Boolean value) {
        this.koeretoejOplysningVejvenligLuftaffjedring = value;
    }

    /**
     * Gets the value of the koeretoejMotorFuelmode property.
     * 
     * @return
     *     possible object is
     *     {@link FuelmodeTypeType }
     *     
     */
    public FuelmodeTypeType getKoeretoejMotorFuelmode() {
        return koeretoejMotorFuelmode;
    }

    /**
     * Sets the value of the koeretoejMotorFuelmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelmodeTypeType }
     *     
     */
    public void setKoeretoejMotorFuelmode(FuelmodeTypeType value) {
        this.koeretoejMotorFuelmode = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningEftermonteretPartikelfilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMiljoeOplysningEftermonteretPartikelfilter() {
        return koeretoejMiljoeOplysningEftermonteretPartikelfilter;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningEftermonteretPartikelfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMiljoeOplysningEftermonteretPartikelfilter(Boolean value) {
        this.koeretoejMiljoeOplysningEftermonteretPartikelfilter = value;
    }

    /**
     * Gets the value of the dispensationTypeSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link DispensationTypeSamlingStrukturType }
     *     
     */
    public DispensationTypeSamlingStrukturType getDispensationTypeSamlingStruktur() {
        return dispensationTypeSamlingStruktur;
    }

    /**
     * Sets the value of the dispensationTypeSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispensationTypeSamlingStrukturType }
     *     
     */
    public void setDispensationTypeSamlingStruktur(DispensationTypeSamlingStrukturType value) {
        this.dispensationTypeSamlingStruktur = value;
    }

    /**
     * Gets the value of the typeGodkendelseAttest property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest }
     *     
     */
    public USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest getTypeGodkendelseAttest() {
        return typeGodkendelseAttest;
    }

    /**
     * Sets the value of the typeGodkendelseAttest property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest }
     *     
     */
    public void setTypeGodkendelseAttest(USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest value) {
        this.typeGodkendelseAttest = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantNummer"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestTypeAnmeldelseNummer"/&gt;
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
        "typeAttestVariantNummer",
        "typeAttestTypeAnmeldelseNummer"
    })
    public static class TypeGodkendelseAttest {

        @XmlElement(name = "TypeAttestVariantNummer")
        @XmlSchemaType(name = "integer")
        protected long typeAttestVariantNummer;
        @XmlElement(name = "TypeAttestTypeAnmeldelseNummer", required = true)
        protected String typeAttestTypeAnmeldelseNummer;

        /**
         * Gets the value of the typeAttestVariantNummer property.
         * 
         */
        public long getTypeAttestVariantNummer() {
            return typeAttestVariantNummer;
        }

        /**
         * Sets the value of the typeAttestVariantNummer property.
         * 
         */
        public void setTypeAttestVariantNummer(long value) {
            this.typeAttestVariantNummer = value;
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

    }

}
