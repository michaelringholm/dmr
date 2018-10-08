
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejUdstyrTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejUdstyrTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeNavn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeVisesVedSyn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeVisesVedForespoergsel"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeVisesVedStandardOprettelse"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeStandardAntal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejUdstyrTypeStrukturType", propOrder = {
    "koeretoejUdstyrTypeNummer",
    "koeretoejUdstyrTypeNavn",
    "koeretoejUdstyrTypeVisesVedSyn",
    "koeretoejUdstyrTypeVisesVedForespoergsel",
    "koeretoejUdstyrTypeVisesVedStandardOprettelse",
    "koeretoejUdstyrTypeStandardAntal"
})
public class KoeretoejUdstyrTypeStrukturType {

    @XmlElement(name = "KoeretoejUdstyrTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long koeretoejUdstyrTypeNummer;
    @XmlElement(name = "KoeretoejUdstyrTypeNavn", required = true)
    protected String koeretoejUdstyrTypeNavn;
    @XmlElement(name = "KoeretoejUdstyrTypeVisesVedSyn")
    protected boolean koeretoejUdstyrTypeVisesVedSyn;
    @XmlElement(name = "KoeretoejUdstyrTypeVisesVedForespoergsel")
    protected boolean koeretoejUdstyrTypeVisesVedForespoergsel;
    @XmlElement(name = "KoeretoejUdstyrTypeVisesVedStandardOprettelse")
    protected boolean koeretoejUdstyrTypeVisesVedStandardOprettelse;
    @XmlElement(name = "KoeretoejUdstyrTypeStandardAntal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejUdstyrTypeStandardAntal;

    /**
     * Gets the value of the koeretoejUdstyrTypeNummer property.
     * 
     */
    public long getKoeretoejUdstyrTypeNummer() {
        return koeretoejUdstyrTypeNummer;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeNummer property.
     * 
     */
    public void setKoeretoejUdstyrTypeNummer(long value) {
        this.koeretoejUdstyrTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejUdstyrTypeNavn() {
        return koeretoejUdstyrTypeNavn;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejUdstyrTypeNavn(String value) {
        this.koeretoejUdstyrTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrTypeVisesVedSyn property.
     * 
     */
    public boolean isKoeretoejUdstyrTypeVisesVedSyn() {
        return koeretoejUdstyrTypeVisesVedSyn;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeVisesVedSyn property.
     * 
     */
    public void setKoeretoejUdstyrTypeVisesVedSyn(boolean value) {
        this.koeretoejUdstyrTypeVisesVedSyn = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrTypeVisesVedForespoergsel property.
     * 
     */
    public boolean isKoeretoejUdstyrTypeVisesVedForespoergsel() {
        return koeretoejUdstyrTypeVisesVedForespoergsel;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeVisesVedForespoergsel property.
     * 
     */
    public void setKoeretoejUdstyrTypeVisesVedForespoergsel(boolean value) {
        this.koeretoejUdstyrTypeVisesVedForespoergsel = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrTypeVisesVedStandardOprettelse property.
     * 
     */
    public boolean isKoeretoejUdstyrTypeVisesVedStandardOprettelse() {
        return koeretoejUdstyrTypeVisesVedStandardOprettelse;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeVisesVedStandardOprettelse property.
     * 
     */
    public void setKoeretoejUdstyrTypeVisesVedStandardOprettelse(boolean value) {
        this.koeretoejUdstyrTypeVisesVedStandardOprettelse = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrTypeStandardAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejUdstyrTypeStandardAntal() {
        return koeretoejUdstyrTypeStandardAntal;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeStandardAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejUdstyrTypeStandardAntal(Long value) {
        this.koeretoejUdstyrTypeStandardAntal = value;
    }

}
