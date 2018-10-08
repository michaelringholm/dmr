
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USKoeretoejCoCOpret_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejCoCOpret_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagKode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USKoeretoejCoCOpret_OType", propOrder = {
    "hovedOplysningerSvar",
    "koeretoejIdent",
    "koeretoejRegistreringGrundlagKode",
    "koeretoejRegistreringGrundlagIdent"
})
@XmlSeeAlso({
    USKoeretoejCoCOpretO.class
})
public class USKoeretoejCoCOpretOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "KoeretoejIdent")
    protected BigInteger koeretoejIdent;
    @XmlElement(name = "KoeretoejRegistreringGrundlagKode")
    protected String koeretoejRegistreringGrundlagKode;
    @XmlElement(name = "KoeretoejRegistreringGrundlagIdent")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejRegistreringGrundlagIdent;

    /**
     * Gets the value of the hovedOplysningerSvar property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public HovedOplysningerSvarType getHovedOplysningerSvar() {
        return hovedOplysningerSvar;
    }

    /**
     * Sets the value of the hovedOplysningerSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvar = value;
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

}
