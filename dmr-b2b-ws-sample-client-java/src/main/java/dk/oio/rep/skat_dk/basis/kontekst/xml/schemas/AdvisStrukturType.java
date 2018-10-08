
package dk.oio.rep.skat_dk.basis.kontekst.xml.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvisStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvisStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}AdvisIdentifikator"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}AdvisTekst" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvisStrukturType", propOrder = {
    "advisIdentifikator",
    "advisTekst"
})
public class AdvisStrukturType {

    @XmlElement(name = "AdvisIdentifikator", required = true)
    protected BigInteger advisIdentifikator;
    @XmlElement(name = "AdvisTekst")
    protected String advisTekst;

    /**
     * Gets the value of the advisIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvisIdentifikator() {
        return advisIdentifikator;
    }

    /**
     * Sets the value of the advisIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvisIdentifikator(BigInteger value) {
        this.advisIdentifikator = value;
    }

    /**
     * Gets the value of the advisTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisTekst() {
        return advisTekst;
    }

    /**
     * Sets the value of the advisTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisTekst(String value) {
        this.advisTekst = value;
    }

}
