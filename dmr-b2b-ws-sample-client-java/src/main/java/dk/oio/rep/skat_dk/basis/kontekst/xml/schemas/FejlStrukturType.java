package dk.oio.rep.skat_dk.basis.kontekst.xml.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FejlStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FejlStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}FejlIdentifikator"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}FejlTekst" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FejlStrukturType", propOrder = {
    "fejlIdentifikator",
    "fejlTekst"
})
public class FejlStrukturType {

    @XmlElement(name = "FejlIdentifikator", required = true)
    protected BigInteger fejlIdentifikator;
    @XmlElement(name = "FejlTekst")
    protected String fejlTekst;

    /**
     * Gets the value of the fejlIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFejlIdentifikator() {
        return fejlIdentifikator;
    }

    /**
     * Sets the value of the fejlIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFejlIdentifikator(BigInteger value) {
        this.fejlIdentifikator = value;
    }

    /**
     * Gets the value of the fejlTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFejlTekst() {
        return fejlTekst;
    }

    /**
     * Sets the value of the fejlTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFejlTekst(String value) {
        this.fejlTekst = value;
    }

}
