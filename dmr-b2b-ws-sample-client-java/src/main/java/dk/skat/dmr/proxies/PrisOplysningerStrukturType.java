
package dk.skat.dmr.proxies;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrisOplysningerStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrisOplysningerStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerStandardPris" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerIndkoebsPris"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerMindsteBeskatningspris" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrisOplysningerStrukturType", propOrder = {
    "prisOplysningerStandardPris",
    "prisOplysningerIndkoebsPris",
    "prisOplysningerMindsteBeskatningspris"
})
public class PrisOplysningerStrukturType {

    @XmlElement(name = "PrisOplysningerStandardPris")
    protected BigDecimal prisOplysningerStandardPris;
    @XmlElement(name = "PrisOplysningerIndkoebsPris", required = true)
    protected BigDecimal prisOplysningerIndkoebsPris;
    @XmlElement(name = "PrisOplysningerMindsteBeskatningspris")
    protected BigDecimal prisOplysningerMindsteBeskatningspris;

    /**
     * Gets the value of the prisOplysningerStandardPris property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrisOplysningerStandardPris() {
        return prisOplysningerStandardPris;
    }

    /**
     * Sets the value of the prisOplysningerStandardPris property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrisOplysningerStandardPris(BigDecimal value) {
        this.prisOplysningerStandardPris = value;
    }

    /**
     * Gets the value of the prisOplysningerIndkoebsPris property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrisOplysningerIndkoebsPris() {
        return prisOplysningerIndkoebsPris;
    }

    /**
     * Sets the value of the prisOplysningerIndkoebsPris property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrisOplysningerIndkoebsPris(BigDecimal value) {
        this.prisOplysningerIndkoebsPris = value;
    }

    /**
     * Gets the value of the prisOplysningerMindsteBeskatningspris property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrisOplysningerMindsteBeskatningspris() {
        return prisOplysningerMindsteBeskatningspris;
    }

    /**
     * Sets the value of the prisOplysningerMindsteBeskatningspris property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrisOplysningerMindsteBeskatningspris(BigDecimal value) {
        this.prisOplysningerMindsteBeskatningspris = value;
    }

}
