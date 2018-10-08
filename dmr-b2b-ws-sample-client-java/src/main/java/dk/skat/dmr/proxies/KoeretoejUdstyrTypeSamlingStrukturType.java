
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejUdstyrTypeSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejUdstyrTypeSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejUdstyrTypeSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "KoeretoejUdstyrTypeSamlingStrukturType", propOrder = {
    "koeretoejUdstyrTypeSamling"
})
public class KoeretoejUdstyrTypeSamlingStrukturType {

    @XmlElement(name = "KoeretoejUdstyrTypeSamling", required = true)
    protected KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling koeretoejUdstyrTypeSamling;

    /**
     * Gets the value of the koeretoejUdstyrTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling }
     *     
     */
    public KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling getKoeretoejUdstyrTypeSamling() {
        return koeretoejUdstyrTypeSamling;
    }

    /**
     * Sets the value of the koeretoejUdstyrTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling }
     *     
     */
    public void setKoeretoejUdstyrTypeSamling(KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling value) {
        this.koeretoejUdstyrTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "koeretoejUdstyrTypeStruktur"
    })
    public static class KoeretoejUdstyrTypeSamling {

        @XmlElement(name = "KoeretoejUdstyrTypeStruktur")
        protected List<KoeretoejUdstyrTypeStrukturType> koeretoejUdstyrTypeStruktur;

        /**
         * Gets the value of the koeretoejUdstyrTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejUdstyrTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejUdstyrTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejUdstyrTypeStrukturType }
         * 
         * 
         */
        public List<KoeretoejUdstyrTypeStrukturType> getKoeretoejUdstyrTypeStruktur() {
            if (koeretoejUdstyrTypeStruktur == null) {
                koeretoejUdstyrTypeStruktur = new ArrayList<KoeretoejUdstyrTypeStrukturType>();
            }
            return this.koeretoejUdstyrTypeStruktur;
        }

    }

}
