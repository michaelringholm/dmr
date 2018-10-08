
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejUdstyrStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejUdstyrStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrAntal"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeStruktur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejUdstyrStrukturType", propOrder = {
    "koeretoejUdstyrAntal",
    "koeretoejUdstyrTypeStruktur"
})
public class KoeretoejUdstyrStrukturType {

    @XmlElement(name = "KoeretoejUdstyrAntal")
    @XmlSchemaType(name = "integer")
    protected long koeretoejUdstyrAntal;
    @XmlElement(name = "KoeretoejUdstyrTypeStruktur", required = true)
    protected KoeretoejUdstyrTypeStrukturType koeretoejUdstyrTypeStruktur;

    /**
     * Gets the value of the koeretoejUdstyrAntal property.
     * 
     */
    public long getKoeretoejUdstyrAntal() {
        return koeretoejUdstyrAntal;
    }

    /**
     * Sets the value of the koeretoejUdstyrAntal property.
     * 
     */
    public void setKoeretoejUdstyrAntal(long value) {
        this.koeretoejUdstyrAntal = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejUdstyrTypeStrukturType }
     *     
     */
    public KoeretoejUdstyrTypeStrukturType getKoeretoejUdstyrTypeStruktur() {
        return koeretoejUdstyrTypeStruktur;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejUdstyrTypeStrukturType }
     *     
     */
    public void setKoeretoejUdstyrTypeStruktur(KoeretoejUdstyrTypeStrukturType value) {
        this.koeretoejUdstyrTypeStruktur = value;
    }

}
