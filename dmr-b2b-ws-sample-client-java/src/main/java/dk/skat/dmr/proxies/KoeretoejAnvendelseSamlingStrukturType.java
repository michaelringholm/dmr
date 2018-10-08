
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejAnvendelseSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejAnvendelseSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejAnvendelseSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejAnvendelseSamlingStrukturType", propOrder = {
    "koeretoejAnvendelseSamling"
})
public class KoeretoejAnvendelseSamlingStrukturType {

    @XmlElement(name = "KoeretoejAnvendelseSamling", required = true)
    protected KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling koeretoejAnvendelseSamling;

    /**
     * Gets the value of the koeretoejAnvendelseSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling }
     *     
     */
    public KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling getKoeretoejAnvendelseSamling() {
        return koeretoejAnvendelseSamling;
    }

    /**
     * Sets the value of the koeretoejAnvendelseSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling }
     *     
     */
    public void setKoeretoejAnvendelseSamling(KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling value) {
        this.koeretoejAnvendelseSamling = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "koeretoejAnvendelseStruktur"
    })
    public static class KoeretoejAnvendelseSamling {

        @XmlElement(name = "KoeretoejAnvendelseStruktur")
        protected List<KoeretoejAnvendelseStrukturType> koeretoejAnvendelseStruktur;

        /**
         * Gets the value of the koeretoejAnvendelseStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejAnvendelseStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejAnvendelseStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejAnvendelseStrukturType }
         * 
         * 
         */
        public List<KoeretoejAnvendelseStrukturType> getKoeretoejAnvendelseStruktur() {
            if (koeretoejAnvendelseStruktur == null) {
                koeretoejAnvendelseStruktur = new ArrayList<KoeretoejAnvendelseStrukturType>();
            }
            return this.koeretoejAnvendelseStruktur;
        }

    }

}
