
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormTypeSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormTypeSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NormTypeSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}NormTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "NormTypeSamlingStrukturType", propOrder = {
    "normTypeSamling"
})
public class NormTypeSamlingStrukturType {

    @XmlElement(name = "NormTypeSamling", required = true)
    protected NormTypeSamlingStrukturType.NormTypeSamling normTypeSamling;

    /**
     * Gets the value of the normTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link NormTypeSamlingStrukturType.NormTypeSamling }
     *     
     */
    public NormTypeSamlingStrukturType.NormTypeSamling getNormTypeSamling() {
        return normTypeSamling;
    }

    /**
     * Sets the value of the normTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormTypeSamlingStrukturType.NormTypeSamling }
     *     
     */
    public void setNormTypeSamling(NormTypeSamlingStrukturType.NormTypeSamling value) {
        this.normTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}NormTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "normTypeStruktur"
    })
    public static class NormTypeSamling {

        @XmlElement(name = "NormTypeStruktur")
        protected List<NormTypeStrukturType> normTypeStruktur;

        /**
         * Gets the value of the normTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the normTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNormTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NormTypeStrukturType }
         * 
         * 
         */
        public List<NormTypeStrukturType> getNormTypeStruktur() {
            if (normTypeStruktur == null) {
                normTypeStruktur = new ArrayList<NormTypeStrukturType>();
            }
            return this.normTypeStruktur;
        }

    }

}
