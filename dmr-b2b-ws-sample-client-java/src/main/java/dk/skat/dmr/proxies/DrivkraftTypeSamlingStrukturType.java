
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrivkraftTypeSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrivkraftTypeSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrivkraftTypeSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DrivkraftTypeSamlingStrukturType", propOrder = {
    "drivkraftTypeSamling"
})
public class DrivkraftTypeSamlingStrukturType {

    @XmlElement(name = "DrivkraftTypeSamling", required = true)
    protected DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling drivkraftTypeSamling;

    /**
     * Gets the value of the drivkraftTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling }
     *     
     */
    public DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling getDrivkraftTypeSamling() {
        return drivkraftTypeSamling;
    }

    /**
     * Sets the value of the drivkraftTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling }
     *     
     */
    public void setDrivkraftTypeSamling(DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling value) {
        this.drivkraftTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "drivkraftTypeStruktur"
    })
    public static class DrivkraftTypeSamling {

        @XmlElement(name = "DrivkraftTypeStruktur")
        protected List<DrivkraftTypeStrukturType> drivkraftTypeStruktur;

        /**
         * Gets the value of the drivkraftTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drivkraftTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrivkraftTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DrivkraftTypeStrukturType }
         * 
         * 
         */
        public List<DrivkraftTypeStrukturType> getDrivkraftTypeStruktur() {
            if (drivkraftTypeStruktur == null) {
                drivkraftTypeStruktur = new ArrayList<DrivkraftTypeStrukturType>();
            }
            return this.drivkraftTypeStruktur;
        }

    }

}
