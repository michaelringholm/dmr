
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejNormStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejNormStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}NormTypeStruktur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejNormStrukturType", propOrder = {
    "normTypeStruktur"
})
public class KoeretoejNormStrukturType {

    @XmlElement(name = "NormTypeStruktur", required = true)
    protected NormTypeStrukturType normTypeStruktur;

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

}
