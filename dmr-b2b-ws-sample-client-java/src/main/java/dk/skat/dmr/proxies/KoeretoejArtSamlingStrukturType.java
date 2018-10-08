
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejArtSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejArtSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejArtSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "KoeretoejArtSamlingStrukturType", propOrder = {
    "koeretoejArtSamling"
})
public class KoeretoejArtSamlingStrukturType {

    @XmlElement(name = "KoeretoejArtSamling", required = true)
    protected KoeretoejArtSamlingStrukturType.KoeretoejArtSamling koeretoejArtSamling;

    /**
     * Gets the value of the koeretoejArtSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejArtSamlingStrukturType.KoeretoejArtSamling }
     *     
     */
    public KoeretoejArtSamlingStrukturType.KoeretoejArtSamling getKoeretoejArtSamling() {
        return koeretoejArtSamling;
    }

    /**
     * Sets the value of the koeretoejArtSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejArtSamlingStrukturType.KoeretoejArtSamling }
     *     
     */
    public void setKoeretoejArtSamling(KoeretoejArtSamlingStrukturType.KoeretoejArtSamling value) {
        this.koeretoejArtSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "koeretoejArtStruktur"
    })
    public static class KoeretoejArtSamling {

        @XmlElement(name = "KoeretoejArtStruktur")
        protected List<KoeretoejArtStrukturType> koeretoejArtStruktur;

        /**
         * Gets the value of the koeretoejArtStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejArtStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejArtStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejArtStrukturType }
         * 
         * 
         */
        public List<KoeretoejArtStrukturType> getKoeretoejArtStruktur() {
            if (koeretoejArtStruktur == null) {
                koeretoejArtStruktur = new ArrayList<KoeretoejArtStrukturType>();
            }
            return this.koeretoejArtStruktur;
        }

    }

}
