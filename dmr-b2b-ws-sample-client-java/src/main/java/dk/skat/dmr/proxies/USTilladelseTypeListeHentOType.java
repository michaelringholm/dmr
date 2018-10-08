
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USTilladelseTypeListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USTilladelseTypeListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="TilladelseTypeSamling" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "USTilladelseTypeListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "tilladelseTypeSamling"
})
@XmlSeeAlso({
    USTilladelseTypeListeHentO.class
})
public class USTilladelseTypeListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "TilladelseTypeSamling")
    protected USTilladelseTypeListeHentOType.TilladelseTypeSamling tilladelseTypeSamling;

    /**
     * Gets the value of the hovedOplysningerSvar property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public HovedOplysningerSvarType getHovedOplysningerSvar() {
        return hovedOplysningerSvar;
    }

    /**
     * Sets the value of the hovedOplysningerSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvar = value;
    }

    /**
     * Gets the value of the tilladelseTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link USTilladelseTypeListeHentOType.TilladelseTypeSamling }
     *     
     */
    public USTilladelseTypeListeHentOType.TilladelseTypeSamling getTilladelseTypeSamling() {
        return tilladelseTypeSamling;
    }

    /**
     * Sets the value of the tilladelseTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link USTilladelseTypeListeHentOType.TilladelseTypeSamling }
     *     
     */
    public void setTilladelseTypeSamling(USTilladelseTypeListeHentOType.TilladelseTypeSamling value) {
        this.tilladelseTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "tilladelseTypeStruktur"
    })
    public static class TilladelseTypeSamling {

        @XmlElement(name = "TilladelseTypeStruktur")
        protected List<TilladelseTypeStrukturType> tilladelseTypeStruktur;

        /**
         * Gets the value of the tilladelseTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tilladelseTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTilladelseTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TilladelseTypeStrukturType }
         * 
         * 
         */
        public List<TilladelseTypeStrukturType> getTilladelseTypeStruktur() {
            if (tilladelseTypeStruktur == null) {
                tilladelseTypeStruktur = new ArrayList<TilladelseTypeStrukturType>();
            }
            return this.tilladelseTypeStruktur;
        }

    }

}
