
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DispensationTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispensationTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeNavn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejDispensationTypeKommentar"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispensationTypeStrukturType", propOrder = {
    "dispensationTypeNummer",
    "dispensationTypeNavn",
    "koeretoejDispensationTypeKommentar"
})
public class DispensationTypeStrukturType {

    @XmlElement(name = "DispensationTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long dispensationTypeNummer;
    @XmlElement(name = "DispensationTypeNavn", required = true)
    protected String dispensationTypeNavn;
    @XmlElement(name = "KoeretoejDispensationTypeKommentar", required = true)
    protected String koeretoejDispensationTypeKommentar;

    /**
     * Gets the value of the dispensationTypeNummer property.
     * 
     */
    public long getDispensationTypeNummer() {
        return dispensationTypeNummer;
    }

    /**
     * Sets the value of the dispensationTypeNummer property.
     * 
     */
    public void setDispensationTypeNummer(long value) {
        this.dispensationTypeNummer = value;
    }

    /**
     * Gets the value of the dispensationTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispensationTypeNavn() {
        return dispensationTypeNavn;
    }

    /**
     * Sets the value of the dispensationTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispensationTypeNavn(String value) {
        this.dispensationTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejDispensationTypeKommentar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejDispensationTypeKommentar() {
        return koeretoejDispensationTypeKommentar;
    }

    /**
     * Sets the value of the koeretoejDispensationTypeKommentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejDispensationTypeKommentar(String value) {
        this.koeretoejDispensationTypeKommentar = value;
    }

}
