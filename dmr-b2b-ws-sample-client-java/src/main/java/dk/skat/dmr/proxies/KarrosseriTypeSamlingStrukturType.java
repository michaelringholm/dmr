
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KarrosseriTypeSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KarrosseriTypeSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KarrosseriTypeSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KarrosseriTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "KarrosseriTypeSamlingStrukturType", propOrder = {
    "karrosseriTypeSamling"
})
public class KarrosseriTypeSamlingStrukturType {

    @XmlElement(name = "KarrosseriTypeSamling", required = true)
    protected KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling karrosseriTypeSamling;

    /**
     * Gets the value of the karrosseriTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling }
     *     
     */
    public KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling getKarrosseriTypeSamling() {
        return karrosseriTypeSamling;
    }

    /**
     * Sets the value of the karrosseriTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling }
     *     
     */
    public void setKarrosseriTypeSamling(KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling value) {
        this.karrosseriTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KarrosseriTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "karrosseriTypeStruktur"
    })
    public static class KarrosseriTypeSamling {

        @XmlElement(name = "KarrosseriTypeStruktur")
        protected List<KarrosseriTypeStrukturType> karrosseriTypeStruktur;

        /**
         * Gets the value of the karrosseriTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the karrosseriTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKarrosseriTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KarrosseriTypeStrukturType }
         * 
         * 
         */
        public List<KarrosseriTypeStrukturType> getKarrosseriTypeStruktur() {
            if (karrosseriTypeStruktur == null) {
                karrosseriTypeStruktur = new ArrayList<KarrosseriTypeStrukturType>();
            }
            return this.karrosseriTypeStruktur;
        }

    }

}
