
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FarveTypeSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarveTypeSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FarveTypeSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}FarveTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FarveTypeSamlingStrukturType", propOrder = {
    "farveTypeSamling"
})
public class FarveTypeSamlingStrukturType {

    @XmlElement(name = "FarveTypeSamling", required = true)
    protected FarveTypeSamlingStrukturType.FarveTypeSamling farveTypeSamling;

    /**
     * Gets the value of the farveTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link FarveTypeSamlingStrukturType.FarveTypeSamling }
     *     
     */
    public FarveTypeSamlingStrukturType.FarveTypeSamling getFarveTypeSamling() {
        return farveTypeSamling;
    }

    /**
     * Sets the value of the farveTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarveTypeSamlingStrukturType.FarveTypeSamling }
     *     
     */
    public void setFarveTypeSamling(FarveTypeSamlingStrukturType.FarveTypeSamling value) {
        this.farveTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}FarveTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "farveTypeStruktur"
    })
    public static class FarveTypeSamling {

        @XmlElement(name = "FarveTypeStruktur")
        protected List<FarveTypeStrukturType> farveTypeStruktur;

        /**
         * Gets the value of the farveTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the farveTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFarveTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarveTypeStrukturType }
         * 
         * 
         */
        public List<FarveTypeStrukturType> getFarveTypeStruktur() {
            if (farveTypeStruktur == null) {
                farveTypeStruktur = new ArrayList<FarveTypeStrukturType>();
            }
            return this.farveTypeStruktur;
        }

    }

}
