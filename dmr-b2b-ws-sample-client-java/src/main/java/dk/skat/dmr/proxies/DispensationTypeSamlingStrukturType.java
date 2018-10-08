
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DispensationTypeSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispensationTypeSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DispensationTypeSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DispensationTypeSamlingStrukturType", propOrder = {
    "dispensationTypeSamling"
})
public class DispensationTypeSamlingStrukturType {

    @XmlElement(name = "DispensationTypeSamling", required = true)
    protected DispensationTypeSamlingStrukturType.DispensationTypeSamling dispensationTypeSamling;

    /**
     * Gets the value of the dispensationTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link DispensationTypeSamlingStrukturType.DispensationTypeSamling }
     *     
     */
    public DispensationTypeSamlingStrukturType.DispensationTypeSamling getDispensationTypeSamling() {
        return dispensationTypeSamling;
    }

    /**
     * Sets the value of the dispensationTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispensationTypeSamlingStrukturType.DispensationTypeSamling }
     *     
     */
    public void setDispensationTypeSamling(DispensationTypeSamlingStrukturType.DispensationTypeSamling value) {
        this.dispensationTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "dispensationTypeStruktur"
    })
    public static class DispensationTypeSamling {

        @XmlElement(name = "DispensationTypeStruktur")
        protected List<DispensationTypeStrukturType> dispensationTypeStruktur;

        /**
         * Gets the value of the dispensationTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dispensationTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDispensationTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DispensationTypeStrukturType }
         * 
         * 
         */
        public List<DispensationTypeStrukturType> getDispensationTypeStruktur() {
            if (dispensationTypeStruktur == null) {
                dispensationTypeStruktur = new ArrayList<DispensationTypeStrukturType>();
            }
            return this.dispensationTypeStruktur;
        }

    }

}
