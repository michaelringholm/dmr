
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejOprettelseAnnuller_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejOprettelseAnnuller_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagKode"/&gt;
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
@XmlType(name = "USKoeretoejOprettelseAnnuller_IType", propOrder = {
    "hovedOplysninger",
    "koeretoejIdent",
    "koeretoejRegistreringGrundlagKode",
    "virksomhedSENummer"
})
@XmlSeeAlso({
    USKoeretoejOprettelseAnnullerI.class
})
public class USKoeretoejOprettelseAnnullerIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "KoeretoejIdent", required = true)
    protected BigInteger koeretoejIdent;
    @XmlElement(name = "KoeretoejRegistreringGrundlagKode", required = true)
    protected String koeretoejRegistreringGrundlagKode;
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
     * Gets the value of the koeretoejRegistreringGrundlagKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejRegistreringGrundlagKode() {
        return koeretoejRegistreringGrundlagKode;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejRegistreringGrundlagKode(String value) {
        this.koeretoejRegistreringGrundlagKode = value;
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

}
