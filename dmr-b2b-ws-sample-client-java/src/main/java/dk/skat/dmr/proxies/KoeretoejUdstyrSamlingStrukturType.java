
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejUdstyrSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejUdstyrSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejUdstyrSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "KoeretoejUdstyrSamlingStrukturType", propOrder = {
    "koeretoejUdstyrSamling"
})
public class KoeretoejUdstyrSamlingStrukturType {

    @XmlElement(name = "KoeretoejUdstyrSamling", required = true)
    protected KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling koeretoejUdstyrSamling;

    /**
     * Gets the value of the koeretoejUdstyrSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling }
     *     
     */
    public KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling getKoeretoejUdstyrSamling() {
        return koeretoejUdstyrSamling;
    }

    /**
     * Sets the value of the koeretoejUdstyrSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling }
     *     
     */
    public void setKoeretoejUdstyrSamling(KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling value) {
        this.koeretoejUdstyrSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "koeretoejUdstyrStruktur"
    })
    public static class KoeretoejUdstyrSamling {

        @XmlElement(name = "KoeretoejUdstyrStruktur")
        protected List<KoeretoejUdstyrStrukturType> koeretoejUdstyrStruktur;

        /**
         * Gets the value of the koeretoejUdstyrStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejUdstyrStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejUdstyrStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejUdstyrStrukturType }
         * 
         * 
         */
        public List<KoeretoejUdstyrStrukturType> getKoeretoejUdstyrStruktur() {
            if (koeretoejUdstyrStruktur == null) {
                koeretoejUdstyrStruktur = new ArrayList<KoeretoejUdstyrStrukturType>();
            }
            return this.koeretoejUdstyrStruktur;
        }

    }

}
