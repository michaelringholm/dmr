
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TypeAttestVariantStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeAttestVariantStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSiddepladserMinimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSiddepladserMaksimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantEgenVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantKoereklarVaegtMaksimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantTekniskTotalVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantTotalVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStoersteAkselTryk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantTilkoblingsvaegtMedBremser" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantTilkoblingsvaegtUdenBremser" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStatusDatoTid" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStaapladserMinimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStaapladserMaksimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantPassagerAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantAkselAntal"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantFaelgDaek" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantMaksimumHastighed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStelNummerAnbringelse"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantVVaerdiLuft" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantVVaerdiMekanisk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantTraekkendeAksler" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantAntalGear" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantAntalDoere" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantCO2Udslip" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantRoegtaethed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantRoegtaethedOmdrejningstal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantPartikelFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantCylinderAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantMaerkning" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStandStoej" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStandStoejOmdrejningstal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantKoerselStoej" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantKoereklarVaegtMinimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantEgnetTilTaxi" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantPartikler" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantKmPerLiter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantStoersteEffekt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantInnovativTeknik" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantInnovativTeknikAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantNCAPTest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSkammelBelastning" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSkatteAkselAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSkatteAkselTryk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSaettevognTilladtAkselTryk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantVogntogVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantAkselAfstand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSporviddenForrest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSporviddenBagest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantSlagVolumen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TypeAttestVariantElektriskForbrug" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}NormTypeStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KarrosseriTypeStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeAttestVariantStrukturType", propOrder = {
    "typeAttestVariantNummer",
    "typeAttestVariantSiddepladserMinimum",
    "typeAttestVariantSiddepladserMaksimum",
    "typeAttestVariantEgenVaegt",
    "typeAttestVariantKoereklarVaegtMaksimum",
    "typeAttestVariantTekniskTotalVaegt",
    "typeAttestVariantTotalVaegt",
    "typeAttestVariantStoersteAkselTryk",
    "typeAttestVariantTilkoblingsvaegtMedBremser",
    "typeAttestVariantTilkoblingsvaegtUdenBremser",
    "typeAttestVariantStatus",
    "typeAttestVariantStatusDatoTid",
    "typeAttestVariantStaapladserMinimum",
    "typeAttestVariantStaapladserMaksimum",
    "typeAttestVariantPassagerAntal",
    "typeAttestVariantAkselAntal",
    "typeAttestVariantFaelgDaek",
    "typeAttestVariantMaksimumHastighed",
    "typeAttestVariantStelNummerAnbringelse",
    "typeAttestVariantVVaerdiLuft",
    "typeAttestVariantVVaerdiMekanisk",
    "typeAttestVariantTraekkendeAksler",
    "typeAttestVariantAntalGear",
    "typeAttestVariantAntalDoere",
    "typeAttestVariantCO2Udslip",
    "typeAttestVariantRoegtaethed",
    "typeAttestVariantRoegtaethedOmdrejningstal",
    "typeAttestVariantPartikelFilter",
    "typeAttestVariantCylinderAntal",
    "typeAttestVariantMaerkning",
    "typeAttestVariantStandStoej",
    "typeAttestVariantStandStoejOmdrejningstal",
    "typeAttestVariantKoerselStoej",
    "typeAttestVariantKoereklarVaegtMinimum",
    "typeAttestVariantEgnetTilTaxi",
    "typeAttestVariantPartikler",
    "typeAttestVariantKmPerLiter",
    "typeAttestVariantStoersteEffekt",
    "typeAttestVariantInnovativTeknik",
    "typeAttestVariantInnovativTeknikAntal",
    "typeAttestVariantNCAPTest",
    "typeAttestVariantSkammelBelastning",
    "typeAttestVariantSkatteAkselAntal",
    "typeAttestVariantSkatteAkselTryk",
    "typeAttestVariantSaettevognTilladtAkselTryk",
    "typeAttestVariantVogntogVaegt",
    "typeAttestVariantAkselAfstand",
    "typeAttestVariantSporviddenForrest",
    "typeAttestVariantSporviddenBagest",
    "typeAttestVariantSlagVolumen",
    "typeAttestVariantElektriskForbrug",
    "drivkraftTypeStruktur",
    "normTypeStruktur",
    "karrosseriTypeStruktur",
    "koeretoejVariantTypeNummer",
    "koeretoejTypeTypeNummer"
})
public class TypeAttestVariantStrukturType {

    @XmlElement(name = "TypeAttestVariantNummer")
    @XmlSchemaType(name = "integer")
    protected long typeAttestVariantNummer;
    @XmlElement(name = "TypeAttestVariantSiddepladserMinimum")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSiddepladserMinimum;
    @XmlElement(name = "TypeAttestVariantSiddepladserMaksimum")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSiddepladserMaksimum;
    @XmlElement(name = "TypeAttestVariantEgenVaegt")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantEgenVaegt;
    @XmlElement(name = "TypeAttestVariantKoereklarVaegtMaksimum")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantKoereklarVaegtMaksimum;
    @XmlElement(name = "TypeAttestVariantTekniskTotalVaegt")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantTekniskTotalVaegt;
    @XmlElement(name = "TypeAttestVariantTotalVaegt")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantTotalVaegt;
    @XmlElement(name = "TypeAttestVariantStoersteAkselTryk")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantStoersteAkselTryk;
    @XmlElement(name = "TypeAttestVariantTilkoblingsvaegtMedBremser")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantTilkoblingsvaegtMedBremser;
    @XmlElement(name = "TypeAttestVariantTilkoblingsvaegtUdenBremser")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantTilkoblingsvaegtUdenBremser;
    @XmlElement(name = "TypeAttestVariantStatus")
    @XmlSchemaType(name = "string")
    protected TypeAttestVariantStatusType typeAttestVariantStatus;
    @XmlElement(name = "TypeAttestVariantStatusDatoTid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar typeAttestVariantStatusDatoTid;
    @XmlElement(name = "TypeAttestVariantStaapladserMinimum")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantStaapladserMinimum;
    @XmlElement(name = "TypeAttestVariantStaapladserMaksimum")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantStaapladserMaksimum;
    @XmlElement(name = "TypeAttestVariantPassagerAntal")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantPassagerAntal;
    @XmlElement(name = "TypeAttestVariantAkselAntal")
    @XmlSchemaType(name = "integer")
    protected long typeAttestVariantAkselAntal;
    @XmlElement(name = "TypeAttestVariantFaelgDaek")
    protected String typeAttestVariantFaelgDaek;
    @XmlElement(name = "TypeAttestVariantMaksimumHastighed")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantMaksimumHastighed;
    @XmlElement(name = "TypeAttestVariantStelNummerAnbringelse", required = true)
    protected String typeAttestVariantStelNummerAnbringelse;
    @XmlElement(name = "TypeAttestVariantVVaerdiLuft")
    protected Float typeAttestVariantVVaerdiLuft;
    @XmlElement(name = "TypeAttestVariantVVaerdiMekanisk")
    protected Float typeAttestVariantVVaerdiMekanisk;
    @XmlElement(name = "TypeAttestVariantTraekkendeAksler")
    protected String typeAttestVariantTraekkendeAksler;
    @XmlElement(name = "TypeAttestVariantAntalGear")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantAntalGear;
    @XmlElement(name = "TypeAttestVariantAntalDoere")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantAntalDoere;
    @XmlElement(name = "TypeAttestVariantCO2Udslip")
    protected Float typeAttestVariantCO2Udslip;
    @XmlElement(name = "TypeAttestVariantRoegtaethed")
    protected Float typeAttestVariantRoegtaethed;
    @XmlElement(name = "TypeAttestVariantRoegtaethedOmdrejningstal")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantRoegtaethedOmdrejningstal;
    @XmlElement(name = "TypeAttestVariantPartikelFilter")
    protected Boolean typeAttestVariantPartikelFilter;
    @XmlElement(name = "TypeAttestVariantCylinderAntal")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantCylinderAntal;
    @XmlElement(name = "TypeAttestVariantMaerkning")
    protected String typeAttestVariantMaerkning;
    @XmlElement(name = "TypeAttestVariantStandStoej")
    protected Float typeAttestVariantStandStoej;
    @XmlElement(name = "TypeAttestVariantStandStoejOmdrejningstal")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantStandStoejOmdrejningstal;
    @XmlElement(name = "TypeAttestVariantKoerselStoej")
    protected Float typeAttestVariantKoerselStoej;
    @XmlElement(name = "TypeAttestVariantKoereklarVaegtMinimum")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantKoereklarVaegtMinimum;
    @XmlElement(name = "TypeAttestVariantEgnetTilTaxi")
    protected Boolean typeAttestVariantEgnetTilTaxi;
    @XmlElement(name = "TypeAttestVariantPartikler")
    protected Float typeAttestVariantPartikler;
    @XmlElement(name = "TypeAttestVariantKmPerLiter")
    protected Float typeAttestVariantKmPerLiter;
    @XmlElement(name = "TypeAttestVariantStoersteEffekt")
    protected Float typeAttestVariantStoersteEffekt;
    @XmlElement(name = "TypeAttestVariantInnovativTeknik")
    protected Boolean typeAttestVariantInnovativTeknik;
    @XmlElement(name = "TypeAttestVariantInnovativTeknikAntal")
    protected Float typeAttestVariantInnovativTeknikAntal;
    @XmlElement(name = "TypeAttestVariantNCAPTest")
    protected Boolean typeAttestVariantNCAPTest;
    @XmlElement(name = "TypeAttestVariantSkammelBelastning")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSkammelBelastning;
    @XmlElement(name = "TypeAttestVariantSkatteAkselAntal")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSkatteAkselAntal;
    @XmlElement(name = "TypeAttestVariantSkatteAkselTryk")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSkatteAkselTryk;
    @XmlElement(name = "TypeAttestVariantSaettevognTilladtAkselTryk")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSaettevognTilladtAkselTryk;
    @XmlElement(name = "TypeAttestVariantVogntogVaegt")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantVogntogVaegt;
    @XmlElement(name = "TypeAttestVariantAkselAfstand")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantAkselAfstand;
    @XmlElement(name = "TypeAttestVariantSporviddenForrest")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSporviddenForrest;
    @XmlElement(name = "TypeAttestVariantSporviddenBagest")
    @XmlSchemaType(name = "integer")
    protected Long typeAttestVariantSporviddenBagest;
    @XmlElement(name = "TypeAttestVariantSlagVolumen")
    protected Float typeAttestVariantSlagVolumen;
    @XmlElement(name = "TypeAttestVariantElektriskForbrug")
    protected Float typeAttestVariantElektriskForbrug;
    @XmlElement(name = "DrivkraftTypeStruktur")
    protected DrivkraftTypeStrukturType drivkraftTypeStruktur;
    @XmlElement(name = "NormTypeStruktur")
    protected NormTypeStrukturType normTypeStruktur;
    @XmlElement(name = "KarrosseriTypeStruktur")
    protected KarrosseriTypeStrukturType karrosseriTypeStruktur;
    @XmlElement(name = "KoeretoejVariantTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long koeretoejVariantTypeNummer;
    @XmlElement(name = "KoeretoejTypeTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long koeretoejTypeTypeNummer;

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
     * Gets the value of the typeAttestVariantSiddepladserMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSiddepladserMinimum() {
        return typeAttestVariantSiddepladserMinimum;
    }

    /**
     * Sets the value of the typeAttestVariantSiddepladserMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSiddepladserMinimum(Long value) {
        this.typeAttestVariantSiddepladserMinimum = value;
    }

    /**
     * Gets the value of the typeAttestVariantSiddepladserMaksimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSiddepladserMaksimum() {
        return typeAttestVariantSiddepladserMaksimum;
    }

    /**
     * Sets the value of the typeAttestVariantSiddepladserMaksimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSiddepladserMaksimum(Long value) {
        this.typeAttestVariantSiddepladserMaksimum = value;
    }

    /**
     * Gets the value of the typeAttestVariantEgenVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantEgenVaegt() {
        return typeAttestVariantEgenVaegt;
    }

    /**
     * Sets the value of the typeAttestVariantEgenVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantEgenVaegt(Long value) {
        this.typeAttestVariantEgenVaegt = value;
    }

    /**
     * Gets the value of the typeAttestVariantKoereklarVaegtMaksimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantKoereklarVaegtMaksimum() {
        return typeAttestVariantKoereklarVaegtMaksimum;
    }

    /**
     * Sets the value of the typeAttestVariantKoereklarVaegtMaksimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantKoereklarVaegtMaksimum(Long value) {
        this.typeAttestVariantKoereklarVaegtMaksimum = value;
    }

    /**
     * Gets the value of the typeAttestVariantTekniskTotalVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantTekniskTotalVaegt() {
        return typeAttestVariantTekniskTotalVaegt;
    }

    /**
     * Sets the value of the typeAttestVariantTekniskTotalVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantTekniskTotalVaegt(Long value) {
        this.typeAttestVariantTekniskTotalVaegt = value;
    }

    /**
     * Gets the value of the typeAttestVariantTotalVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantTotalVaegt() {
        return typeAttestVariantTotalVaegt;
    }

    /**
     * Sets the value of the typeAttestVariantTotalVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantTotalVaegt(Long value) {
        this.typeAttestVariantTotalVaegt = value;
    }

    /**
     * Gets the value of the typeAttestVariantStoersteAkselTryk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantStoersteAkselTryk() {
        return typeAttestVariantStoersteAkselTryk;
    }

    /**
     * Sets the value of the typeAttestVariantStoersteAkselTryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantStoersteAkselTryk(Long value) {
        this.typeAttestVariantStoersteAkselTryk = value;
    }

    /**
     * Gets the value of the typeAttestVariantTilkoblingsvaegtMedBremser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantTilkoblingsvaegtMedBremser() {
        return typeAttestVariantTilkoblingsvaegtMedBremser;
    }

    /**
     * Sets the value of the typeAttestVariantTilkoblingsvaegtMedBremser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantTilkoblingsvaegtMedBremser(Long value) {
        this.typeAttestVariantTilkoblingsvaegtMedBremser = value;
    }

    /**
     * Gets the value of the typeAttestVariantTilkoblingsvaegtUdenBremser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantTilkoblingsvaegtUdenBremser() {
        return typeAttestVariantTilkoblingsvaegtUdenBremser;
    }

    /**
     * Sets the value of the typeAttestVariantTilkoblingsvaegtUdenBremser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantTilkoblingsvaegtUdenBremser(Long value) {
        this.typeAttestVariantTilkoblingsvaegtUdenBremser = value;
    }

    /**
     * Gets the value of the typeAttestVariantStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAttestVariantStatusType }
     *     
     */
    public TypeAttestVariantStatusType getTypeAttestVariantStatus() {
        return typeAttestVariantStatus;
    }

    /**
     * Sets the value of the typeAttestVariantStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttestVariantStatusType }
     *     
     */
    public void setTypeAttestVariantStatus(TypeAttestVariantStatusType value) {
        this.typeAttestVariantStatus = value;
    }

    /**
     * Gets the value of the typeAttestVariantStatusDatoTid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTypeAttestVariantStatusDatoTid() {
        return typeAttestVariantStatusDatoTid;
    }

    /**
     * Sets the value of the typeAttestVariantStatusDatoTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTypeAttestVariantStatusDatoTid(XMLGregorianCalendar value) {
        this.typeAttestVariantStatusDatoTid = value;
    }

    /**
     * Gets the value of the typeAttestVariantStaapladserMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantStaapladserMinimum() {
        return typeAttestVariantStaapladserMinimum;
    }

    /**
     * Sets the value of the typeAttestVariantStaapladserMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantStaapladserMinimum(Long value) {
        this.typeAttestVariantStaapladserMinimum = value;
    }

    /**
     * Gets the value of the typeAttestVariantStaapladserMaksimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantStaapladserMaksimum() {
        return typeAttestVariantStaapladserMaksimum;
    }

    /**
     * Sets the value of the typeAttestVariantStaapladserMaksimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantStaapladserMaksimum(Long value) {
        this.typeAttestVariantStaapladserMaksimum = value;
    }

    /**
     * Gets the value of the typeAttestVariantPassagerAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantPassagerAntal() {
        return typeAttestVariantPassagerAntal;
    }

    /**
     * Sets the value of the typeAttestVariantPassagerAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantPassagerAntal(Long value) {
        this.typeAttestVariantPassagerAntal = value;
    }

    /**
     * Gets the value of the typeAttestVariantAkselAntal property.
     * 
     */
    public long getTypeAttestVariantAkselAntal() {
        return typeAttestVariantAkselAntal;
    }

    /**
     * Sets the value of the typeAttestVariantAkselAntal property.
     * 
     */
    public void setTypeAttestVariantAkselAntal(long value) {
        this.typeAttestVariantAkselAntal = value;
    }

    /**
     * Gets the value of the typeAttestVariantFaelgDaek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttestVariantFaelgDaek() {
        return typeAttestVariantFaelgDaek;
    }

    /**
     * Sets the value of the typeAttestVariantFaelgDaek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttestVariantFaelgDaek(String value) {
        this.typeAttestVariantFaelgDaek = value;
    }

    /**
     * Gets the value of the typeAttestVariantMaksimumHastighed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantMaksimumHastighed() {
        return typeAttestVariantMaksimumHastighed;
    }

    /**
     * Sets the value of the typeAttestVariantMaksimumHastighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantMaksimumHastighed(Long value) {
        this.typeAttestVariantMaksimumHastighed = value;
    }

    /**
     * Gets the value of the typeAttestVariantStelNummerAnbringelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttestVariantStelNummerAnbringelse() {
        return typeAttestVariantStelNummerAnbringelse;
    }

    /**
     * Sets the value of the typeAttestVariantStelNummerAnbringelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttestVariantStelNummerAnbringelse(String value) {
        this.typeAttestVariantStelNummerAnbringelse = value;
    }

    /**
     * Gets the value of the typeAttestVariantVVaerdiLuft property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantVVaerdiLuft() {
        return typeAttestVariantVVaerdiLuft;
    }

    /**
     * Sets the value of the typeAttestVariantVVaerdiLuft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantVVaerdiLuft(Float value) {
        this.typeAttestVariantVVaerdiLuft = value;
    }

    /**
     * Gets the value of the typeAttestVariantVVaerdiMekanisk property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantVVaerdiMekanisk() {
        return typeAttestVariantVVaerdiMekanisk;
    }

    /**
     * Sets the value of the typeAttestVariantVVaerdiMekanisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantVVaerdiMekanisk(Float value) {
        this.typeAttestVariantVVaerdiMekanisk = value;
    }

    /**
     * Gets the value of the typeAttestVariantTraekkendeAksler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttestVariantTraekkendeAksler() {
        return typeAttestVariantTraekkendeAksler;
    }

    /**
     * Sets the value of the typeAttestVariantTraekkendeAksler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttestVariantTraekkendeAksler(String value) {
        this.typeAttestVariantTraekkendeAksler = value;
    }

    /**
     * Gets the value of the typeAttestVariantAntalGear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantAntalGear() {
        return typeAttestVariantAntalGear;
    }

    /**
     * Sets the value of the typeAttestVariantAntalGear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantAntalGear(Long value) {
        this.typeAttestVariantAntalGear = value;
    }

    /**
     * Gets the value of the typeAttestVariantAntalDoere property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantAntalDoere() {
        return typeAttestVariantAntalDoere;
    }

    /**
     * Sets the value of the typeAttestVariantAntalDoere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantAntalDoere(Long value) {
        this.typeAttestVariantAntalDoere = value;
    }

    /**
     * Gets the value of the typeAttestVariantCO2Udslip property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantCO2Udslip() {
        return typeAttestVariantCO2Udslip;
    }

    /**
     * Sets the value of the typeAttestVariantCO2Udslip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantCO2Udslip(Float value) {
        this.typeAttestVariantCO2Udslip = value;
    }

    /**
     * Gets the value of the typeAttestVariantRoegtaethed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantRoegtaethed() {
        return typeAttestVariantRoegtaethed;
    }

    /**
     * Sets the value of the typeAttestVariantRoegtaethed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantRoegtaethed(Float value) {
        this.typeAttestVariantRoegtaethed = value;
    }

    /**
     * Gets the value of the typeAttestVariantRoegtaethedOmdrejningstal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantRoegtaethedOmdrejningstal() {
        return typeAttestVariantRoegtaethedOmdrejningstal;
    }

    /**
     * Sets the value of the typeAttestVariantRoegtaethedOmdrejningstal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantRoegtaethedOmdrejningstal(Long value) {
        this.typeAttestVariantRoegtaethedOmdrejningstal = value;
    }

    /**
     * Gets the value of the typeAttestVariantPartikelFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTypeAttestVariantPartikelFilter() {
        return typeAttestVariantPartikelFilter;
    }

    /**
     * Sets the value of the typeAttestVariantPartikelFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTypeAttestVariantPartikelFilter(Boolean value) {
        this.typeAttestVariantPartikelFilter = value;
    }

    /**
     * Gets the value of the typeAttestVariantCylinderAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantCylinderAntal() {
        return typeAttestVariantCylinderAntal;
    }

    /**
     * Sets the value of the typeAttestVariantCylinderAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantCylinderAntal(Long value) {
        this.typeAttestVariantCylinderAntal = value;
    }

    /**
     * Gets the value of the typeAttestVariantMaerkning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttestVariantMaerkning() {
        return typeAttestVariantMaerkning;
    }

    /**
     * Sets the value of the typeAttestVariantMaerkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttestVariantMaerkning(String value) {
        this.typeAttestVariantMaerkning = value;
    }

    /**
     * Gets the value of the typeAttestVariantStandStoej property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantStandStoej() {
        return typeAttestVariantStandStoej;
    }

    /**
     * Sets the value of the typeAttestVariantStandStoej property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantStandStoej(Float value) {
        this.typeAttestVariantStandStoej = value;
    }

    /**
     * Gets the value of the typeAttestVariantStandStoejOmdrejningstal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantStandStoejOmdrejningstal() {
        return typeAttestVariantStandStoejOmdrejningstal;
    }

    /**
     * Sets the value of the typeAttestVariantStandStoejOmdrejningstal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantStandStoejOmdrejningstal(Long value) {
        this.typeAttestVariantStandStoejOmdrejningstal = value;
    }

    /**
     * Gets the value of the typeAttestVariantKoerselStoej property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantKoerselStoej() {
        return typeAttestVariantKoerselStoej;
    }

    /**
     * Sets the value of the typeAttestVariantKoerselStoej property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantKoerselStoej(Float value) {
        this.typeAttestVariantKoerselStoej = value;
    }

    /**
     * Gets the value of the typeAttestVariantKoereklarVaegtMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantKoereklarVaegtMinimum() {
        return typeAttestVariantKoereklarVaegtMinimum;
    }

    /**
     * Sets the value of the typeAttestVariantKoereklarVaegtMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantKoereklarVaegtMinimum(Long value) {
        this.typeAttestVariantKoereklarVaegtMinimum = value;
    }

    /**
     * Gets the value of the typeAttestVariantEgnetTilTaxi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTypeAttestVariantEgnetTilTaxi() {
        return typeAttestVariantEgnetTilTaxi;
    }

    /**
     * Sets the value of the typeAttestVariantEgnetTilTaxi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTypeAttestVariantEgnetTilTaxi(Boolean value) {
        this.typeAttestVariantEgnetTilTaxi = value;
    }

    /**
     * Gets the value of the typeAttestVariantPartikler property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantPartikler() {
        return typeAttestVariantPartikler;
    }

    /**
     * Sets the value of the typeAttestVariantPartikler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantPartikler(Float value) {
        this.typeAttestVariantPartikler = value;
    }

    /**
     * Gets the value of the typeAttestVariantKmPerLiter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantKmPerLiter() {
        return typeAttestVariantKmPerLiter;
    }

    /**
     * Sets the value of the typeAttestVariantKmPerLiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantKmPerLiter(Float value) {
        this.typeAttestVariantKmPerLiter = value;
    }

    /**
     * Gets the value of the typeAttestVariantStoersteEffekt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantStoersteEffekt() {
        return typeAttestVariantStoersteEffekt;
    }

    /**
     * Sets the value of the typeAttestVariantStoersteEffekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantStoersteEffekt(Float value) {
        this.typeAttestVariantStoersteEffekt = value;
    }

    /**
     * Gets the value of the typeAttestVariantInnovativTeknik property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTypeAttestVariantInnovativTeknik() {
        return typeAttestVariantInnovativTeknik;
    }

    /**
     * Sets the value of the typeAttestVariantInnovativTeknik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTypeAttestVariantInnovativTeknik(Boolean value) {
        this.typeAttestVariantInnovativTeknik = value;
    }

    /**
     * Gets the value of the typeAttestVariantInnovativTeknikAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantInnovativTeknikAntal() {
        return typeAttestVariantInnovativTeknikAntal;
    }

    /**
     * Sets the value of the typeAttestVariantInnovativTeknikAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantInnovativTeknikAntal(Float value) {
        this.typeAttestVariantInnovativTeknikAntal = value;
    }

    /**
     * Gets the value of the typeAttestVariantNCAPTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTypeAttestVariantNCAPTest() {
        return typeAttestVariantNCAPTest;
    }

    /**
     * Sets the value of the typeAttestVariantNCAPTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTypeAttestVariantNCAPTest(Boolean value) {
        this.typeAttestVariantNCAPTest = value;
    }

    /**
     * Gets the value of the typeAttestVariantSkammelBelastning property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSkammelBelastning() {
        return typeAttestVariantSkammelBelastning;
    }

    /**
     * Sets the value of the typeAttestVariantSkammelBelastning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSkammelBelastning(Long value) {
        this.typeAttestVariantSkammelBelastning = value;
    }

    /**
     * Gets the value of the typeAttestVariantSkatteAkselAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSkatteAkselAntal() {
        return typeAttestVariantSkatteAkselAntal;
    }

    /**
     * Sets the value of the typeAttestVariantSkatteAkselAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSkatteAkselAntal(Long value) {
        this.typeAttestVariantSkatteAkselAntal = value;
    }

    /**
     * Gets the value of the typeAttestVariantSkatteAkselTryk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSkatteAkselTryk() {
        return typeAttestVariantSkatteAkselTryk;
    }

    /**
     * Sets the value of the typeAttestVariantSkatteAkselTryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSkatteAkselTryk(Long value) {
        this.typeAttestVariantSkatteAkselTryk = value;
    }

    /**
     * Gets the value of the typeAttestVariantSaettevognTilladtAkselTryk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSaettevognTilladtAkselTryk() {
        return typeAttestVariantSaettevognTilladtAkselTryk;
    }

    /**
     * Sets the value of the typeAttestVariantSaettevognTilladtAkselTryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSaettevognTilladtAkselTryk(Long value) {
        this.typeAttestVariantSaettevognTilladtAkselTryk = value;
    }

    /**
     * Gets the value of the typeAttestVariantVogntogVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantVogntogVaegt() {
        return typeAttestVariantVogntogVaegt;
    }

    /**
     * Sets the value of the typeAttestVariantVogntogVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantVogntogVaegt(Long value) {
        this.typeAttestVariantVogntogVaegt = value;
    }

    /**
     * Gets the value of the typeAttestVariantAkselAfstand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantAkselAfstand() {
        return typeAttestVariantAkselAfstand;
    }

    /**
     * Sets the value of the typeAttestVariantAkselAfstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantAkselAfstand(Long value) {
        this.typeAttestVariantAkselAfstand = value;
    }

    /**
     * Gets the value of the typeAttestVariantSporviddenForrest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSporviddenForrest() {
        return typeAttestVariantSporviddenForrest;
    }

    /**
     * Sets the value of the typeAttestVariantSporviddenForrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSporviddenForrest(Long value) {
        this.typeAttestVariantSporviddenForrest = value;
    }

    /**
     * Gets the value of the typeAttestVariantSporviddenBagest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeAttestVariantSporviddenBagest() {
        return typeAttestVariantSporviddenBagest;
    }

    /**
     * Sets the value of the typeAttestVariantSporviddenBagest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeAttestVariantSporviddenBagest(Long value) {
        this.typeAttestVariantSporviddenBagest = value;
    }

    /**
     * Gets the value of the typeAttestVariantSlagVolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantSlagVolumen() {
        return typeAttestVariantSlagVolumen;
    }

    /**
     * Sets the value of the typeAttestVariantSlagVolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantSlagVolumen(Float value) {
        this.typeAttestVariantSlagVolumen = value;
    }

    /**
     * Gets the value of the typeAttestVariantElektriskForbrug property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTypeAttestVariantElektriskForbrug() {
        return typeAttestVariantElektriskForbrug;
    }

    /**
     * Sets the value of the typeAttestVariantElektriskForbrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTypeAttestVariantElektriskForbrug(Float value) {
        this.typeAttestVariantElektriskForbrug = value;
    }

    /**
     * Gets the value of the drivkraftTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link DrivkraftTypeStrukturType }
     *     
     */
    public DrivkraftTypeStrukturType getDrivkraftTypeStruktur() {
        return drivkraftTypeStruktur;
    }

    /**
     * Sets the value of the drivkraftTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivkraftTypeStrukturType }
     *     
     */
    public void setDrivkraftTypeStruktur(DrivkraftTypeStrukturType value) {
        this.drivkraftTypeStruktur = value;
    }

    /**
     * Gets the value of the normTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link NormTypeStrukturType }
     *     
     */
    public NormTypeStrukturType getNormTypeStruktur() {
        return normTypeStruktur;
    }

    /**
     * Sets the value of the normTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormTypeStrukturType }
     *     
     */
    public void setNormTypeStruktur(NormTypeStrukturType value) {
        this.normTypeStruktur = value;
    }

    /**
     * Gets the value of the karrosseriTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KarrosseriTypeStrukturType }
     *     
     */
    public KarrosseriTypeStrukturType getKarrosseriTypeStruktur() {
        return karrosseriTypeStruktur;
    }

    /**
     * Sets the value of the karrosseriTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KarrosseriTypeStrukturType }
     *     
     */
    public void setKarrosseriTypeStruktur(KarrosseriTypeStrukturType value) {
        this.karrosseriTypeStruktur = value;
    }

    /**
     * Gets the value of the koeretoejVariantTypeNummer property.
     * 
     */
    public long getKoeretoejVariantTypeNummer() {
        return koeretoejVariantTypeNummer;
    }

    /**
     * Sets the value of the koeretoejVariantTypeNummer property.
     * 
     */
    public void setKoeretoejVariantTypeNummer(long value) {
        this.koeretoejVariantTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejTypeTypeNummer property.
     * 
     */
    public long getKoeretoejTypeTypeNummer() {
        return koeretoejTypeTypeNummer;
    }

    /**
     * Sets the value of the koeretoejTypeTypeNummer property.
     * 
     */
    public void setKoeretoejTypeTypeNummer(long value) {
        this.koeretoejTypeTypeNummer = value;
    }

}
