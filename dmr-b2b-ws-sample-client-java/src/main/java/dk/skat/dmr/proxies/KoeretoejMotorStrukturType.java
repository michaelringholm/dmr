
package dk.skat.dmr.proxies;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejMotorStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejMotorStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorCylinderAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorSlagVolumen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorSlagVolumenIkkeTilgaengelig" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorStoersteEffekt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorStoersteEffektIkkeTilgaengelig" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorKmPerLiter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorKMPerLiterPreCalc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorPlugInHybrid" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorKilometerstand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorKilometerstandDokumentation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorKilometerstandIkkeTilgaengelig" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorMaerkning" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorStandStoej" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorKoerselStoej" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorStandStoejOmdrejningstal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorInnovativTeknik" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorInnovativTeknikAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorElektriskForbrug" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorFuelmode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeStruktur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejMotorStrukturType", propOrder = {
    "koeretoejMotorCylinderAntal",
    "koeretoejMotorSlagVolumen",
    "koeretoejMotorSlagVolumenIkkeTilgaengelig",
    "koeretoejMotorStoersteEffekt",
    "koeretoejMotorStoersteEffektIkkeTilgaengelig",
    "koeretoejMotorKmPerLiter",
    "koeretoejMotorKMPerLiterPreCalc",
    "koeretoejMotorPlugInHybrid",
    "koeretoejMotorKilometerstand",
    "koeretoejMotorKilometerstandDokumentation",
    "koeretoejMotorKilometerstandIkkeTilgaengelig",
    "koeretoejMotorMaerkning",
    "koeretoejMotorStandStoej",
    "koeretoejMotorKoerselStoej",
    "koeretoejMotorStandStoejOmdrejningstal",
    "koeretoejMotorInnovativTeknik",
    "koeretoejMotorInnovativTeknikAntal",
    "koeretoejMotorElektriskForbrug",
    "koeretoejMotorFuelmode",
    "drivkraftTypeStruktur"
})
public class KoeretoejMotorStrukturType {

    @XmlElement(name = "KoeretoejMotorCylinderAntal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMotorCylinderAntal;
    @XmlElement(name = "KoeretoejMotorSlagVolumen")
    protected Float koeretoejMotorSlagVolumen;
    @XmlElement(name = "KoeretoejMotorSlagVolumenIkkeTilgaengelig")
    protected Boolean koeretoejMotorSlagVolumenIkkeTilgaengelig;
    @XmlElement(name = "KoeretoejMotorStoersteEffekt")
    protected Float koeretoejMotorStoersteEffekt;
    @XmlElement(name = "KoeretoejMotorStoersteEffektIkkeTilgaengelig")
    protected Boolean koeretoejMotorStoersteEffektIkkeTilgaengelig;
    @XmlElement(name = "KoeretoejMotorKmPerLiter")
    protected BigDecimal koeretoejMotorKmPerLiter;
    @XmlElement(name = "KoeretoejMotorKMPerLiterPreCalc")
    protected Float koeretoejMotorKMPerLiterPreCalc;
    @XmlElement(name = "KoeretoejMotorPlugInHybrid")
    protected Boolean koeretoejMotorPlugInHybrid;
    @XmlElement(name = "KoeretoejMotorKilometerstand")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMotorKilometerstand;
    @XmlElement(name = "KoeretoejMotorKilometerstandDokumentation")
    protected Boolean koeretoejMotorKilometerstandDokumentation;
    @XmlElement(name = "KoeretoejMotorKilometerstandIkkeTilgaengelig")
    protected Boolean koeretoejMotorKilometerstandIkkeTilgaengelig;
    @XmlElement(name = "KoeretoejMotorMaerkning")
    protected String koeretoejMotorMaerkning;
    @XmlElement(name = "KoeretoejMotorStandStoej")
    protected Float koeretoejMotorStandStoej;
    @XmlElement(name = "KoeretoejMotorKoerselStoej")
    protected Float koeretoejMotorKoerselStoej;
    @XmlElement(name = "KoeretoejMotorStandStoejOmdrejningstal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMotorStandStoejOmdrejningstal;
    @XmlElement(name = "KoeretoejMotorInnovativTeknik")
    protected Boolean koeretoejMotorInnovativTeknik;
    @XmlElement(name = "KoeretoejMotorInnovativTeknikAntal")
    protected Float koeretoejMotorInnovativTeknikAntal;
    @XmlElement(name = "KoeretoejMotorElektriskForbrug")
    protected Float koeretoejMotorElektriskForbrug;
    @XmlElement(name = "KoeretoejMotorFuelmode")
    @XmlSchemaType(name = "string")
    protected FuelmodeTypeType koeretoejMotorFuelmode;
    @XmlElement(name = "DrivkraftTypeStruktur")
    protected DrivkraftTypeStrukturType drivkraftTypeStruktur;

    /**
     * Gets the value of the koeretoejMotorCylinderAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejMotorCylinderAntal() {
        return koeretoejMotorCylinderAntal;
    }

    /**
     * Sets the value of the koeretoejMotorCylinderAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejMotorCylinderAntal(Long value) {
        this.koeretoejMotorCylinderAntal = value;
    }

    /**
     * Gets the value of the koeretoejMotorSlagVolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorSlagVolumen() {
        return koeretoejMotorSlagVolumen;
    }

    /**
     * Sets the value of the koeretoejMotorSlagVolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorSlagVolumen(Float value) {
        this.koeretoejMotorSlagVolumen = value;
    }

    /**
     * Gets the value of the koeretoejMotorSlagVolumenIkkeTilgaengelig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMotorSlagVolumenIkkeTilgaengelig() {
        return koeretoejMotorSlagVolumenIkkeTilgaengelig;
    }

    /**
     * Sets the value of the koeretoejMotorSlagVolumenIkkeTilgaengelig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMotorSlagVolumenIkkeTilgaengelig(Boolean value) {
        this.koeretoejMotorSlagVolumenIkkeTilgaengelig = value;
    }

    /**
     * Gets the value of the koeretoejMotorStoersteEffekt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorStoersteEffekt() {
        return koeretoejMotorStoersteEffekt;
    }

    /**
     * Sets the value of the koeretoejMotorStoersteEffekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorStoersteEffekt(Float value) {
        this.koeretoejMotorStoersteEffekt = value;
    }

    /**
     * Gets the value of the koeretoejMotorStoersteEffektIkkeTilgaengelig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMotorStoersteEffektIkkeTilgaengelig() {
        return koeretoejMotorStoersteEffektIkkeTilgaengelig;
    }

    /**
     * Sets the value of the koeretoejMotorStoersteEffektIkkeTilgaengelig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMotorStoersteEffektIkkeTilgaengelig(Boolean value) {
        this.koeretoejMotorStoersteEffektIkkeTilgaengelig = value;
    }

    /**
     * Gets the value of the koeretoejMotorKmPerLiter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKoeretoejMotorKmPerLiter() {
        return koeretoejMotorKmPerLiter;
    }

    /**
     * Sets the value of the koeretoejMotorKmPerLiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKoeretoejMotorKmPerLiter(BigDecimal value) {
        this.koeretoejMotorKmPerLiter = value;
    }

    /**
     * Gets the value of the koeretoejMotorKMPerLiterPreCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorKMPerLiterPreCalc() {
        return koeretoejMotorKMPerLiterPreCalc;
    }

    /**
     * Sets the value of the koeretoejMotorKMPerLiterPreCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorKMPerLiterPreCalc(Float value) {
        this.koeretoejMotorKMPerLiterPreCalc = value;
    }

    /**
     * Gets the value of the koeretoejMotorPlugInHybrid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMotorPlugInHybrid() {
        return koeretoejMotorPlugInHybrid;
    }

    /**
     * Sets the value of the koeretoejMotorPlugInHybrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMotorPlugInHybrid(Boolean value) {
        this.koeretoejMotorPlugInHybrid = value;
    }

    /**
     * Gets the value of the koeretoejMotorKilometerstand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejMotorKilometerstand() {
        return koeretoejMotorKilometerstand;
    }

    /**
     * Sets the value of the koeretoejMotorKilometerstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejMotorKilometerstand(Long value) {
        this.koeretoejMotorKilometerstand = value;
    }

    /**
     * Gets the value of the koeretoejMotorKilometerstandDokumentation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMotorKilometerstandDokumentation() {
        return koeretoejMotorKilometerstandDokumentation;
    }

    /**
     * Sets the value of the koeretoejMotorKilometerstandDokumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMotorKilometerstandDokumentation(Boolean value) {
        this.koeretoejMotorKilometerstandDokumentation = value;
    }

    /**
     * Gets the value of the koeretoejMotorKilometerstandIkkeTilgaengelig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMotorKilometerstandIkkeTilgaengelig() {
        return koeretoejMotorKilometerstandIkkeTilgaengelig;
    }

    /**
     * Sets the value of the koeretoejMotorKilometerstandIkkeTilgaengelig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMotorKilometerstandIkkeTilgaengelig(Boolean value) {
        this.koeretoejMotorKilometerstandIkkeTilgaengelig = value;
    }

    /**
     * Gets the value of the koeretoejMotorMaerkning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejMotorMaerkning() {
        return koeretoejMotorMaerkning;
    }

    /**
     * Sets the value of the koeretoejMotorMaerkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejMotorMaerkning(String value) {
        this.koeretoejMotorMaerkning = value;
    }

    /**
     * Gets the value of the koeretoejMotorStandStoej property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorStandStoej() {
        return koeretoejMotorStandStoej;
    }

    /**
     * Sets the value of the koeretoejMotorStandStoej property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorStandStoej(Float value) {
        this.koeretoejMotorStandStoej = value;
    }

    /**
     * Gets the value of the koeretoejMotorKoerselStoej property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorKoerselStoej() {
        return koeretoejMotorKoerselStoej;
    }

    /**
     * Sets the value of the koeretoejMotorKoerselStoej property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorKoerselStoej(Float value) {
        this.koeretoejMotorKoerselStoej = value;
    }

    /**
     * Gets the value of the koeretoejMotorStandStoejOmdrejningstal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejMotorStandStoejOmdrejningstal() {
        return koeretoejMotorStandStoejOmdrejningstal;
    }

    /**
     * Sets the value of the koeretoejMotorStandStoejOmdrejningstal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejMotorStandStoejOmdrejningstal(Long value) {
        this.koeretoejMotorStandStoejOmdrejningstal = value;
    }

    /**
     * Gets the value of the koeretoejMotorInnovativTeknik property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMotorInnovativTeknik() {
        return koeretoejMotorInnovativTeknik;
    }

    /**
     * Sets the value of the koeretoejMotorInnovativTeknik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMotorInnovativTeknik(Boolean value) {
        this.koeretoejMotorInnovativTeknik = value;
    }

    /**
     * Gets the value of the koeretoejMotorInnovativTeknikAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorInnovativTeknikAntal() {
        return koeretoejMotorInnovativTeknikAntal;
    }

    /**
     * Sets the value of the koeretoejMotorInnovativTeknikAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorInnovativTeknikAntal(Float value) {
        this.koeretoejMotorInnovativTeknikAntal = value;
    }

    /**
     * Gets the value of the koeretoejMotorElektriskForbrug property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMotorElektriskForbrug() {
        return koeretoejMotorElektriskForbrug;
    }

    /**
     * Sets the value of the koeretoejMotorElektriskForbrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMotorElektriskForbrug(Float value) {
        this.koeretoejMotorElektriskForbrug = value;
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

}
