
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejSupplerendeKarrosseriSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejSupplerendeKarrosseriSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejSupplerendeKarrosseriSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejSupplerendeKarrosseriTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "KoeretoejSupplerendeKarrosseriSamlingStrukturType", propOrder = {
    "koeretoejSupplerendeKarrosseriSamling"
})
public class KoeretoejSupplerendeKarrosseriSamlingStrukturType {

    @XmlElement(name = "KoeretoejSupplerendeKarrosseriSamling", required = true)
    protected KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling koeretoejSupplerendeKarrosseriSamling;

    /**
     * Gets the value of the koeretoejSupplerendeKarrosseriSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling }
     *     
     */
    public KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling getKoeretoejSupplerendeKarrosseriSamling() {
        return koeretoejSupplerendeKarrosseriSamling;
    }

    /**
     * Sets the value of the koeretoejSupplerendeKarrosseriSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling }
     *     
     */
    public void setKoeretoejSupplerendeKarrosseriSamling(KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling value) {
        this.koeretoejSupplerendeKarrosseriSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejSupplerendeKarrosseriTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "koeretoejSupplerendeKarrosseriTypeStruktur"
    })
    public static class KoeretoejSupplerendeKarrosseriSamling {

        @XmlElement(name = "KoeretoejSupplerendeKarrosseriTypeStruktur")
        protected List<KoeretoejSupplerendeKarrosseriTypeStrukturType> koeretoejSupplerendeKarrosseriTypeStruktur;

        /**
         * Gets the value of the koeretoejSupplerendeKarrosseriTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejSupplerendeKarrosseriTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejSupplerendeKarrosseriTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejSupplerendeKarrosseriTypeStrukturType }
         * 
         * 
         */
        public List<KoeretoejSupplerendeKarrosseriTypeStrukturType> getKoeretoejSupplerendeKarrosseriTypeStruktur() {
            if (koeretoejSupplerendeKarrosseriTypeStruktur == null) {
                koeretoejSupplerendeKarrosseriTypeStruktur = new ArrayList<KoeretoejSupplerendeKarrosseriTypeStrukturType>();
            }
            return this.koeretoejSupplerendeKarrosseriTypeStruktur;
        }

    }

}
