
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
 * <p>Java class for USKoeretoejBlokeringAarsagTypeListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBlokeringAarsagTypeListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="KoeretoejBlokeringAarsagTypeSamling" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "USKoeretoejBlokeringAarsagTypeListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "koeretoejBlokeringAarsagTypeSamling"
})
@XmlSeeAlso({
    USKoeretoejBlokeringAarsagTypeListeHentO.class
})
public class USKoeretoejBlokeringAarsagTypeListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "KoeretoejBlokeringAarsagTypeSamling")
    protected USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling koeretoejBlokeringAarsagTypeSamling;

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
     * Gets the value of the koeretoejBlokeringAarsagTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling }
     *     
     */
    public USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling getKoeretoejBlokeringAarsagTypeSamling() {
        return koeretoejBlokeringAarsagTypeSamling;
    }

    /**
     * Sets the value of the koeretoejBlokeringAarsagTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling }
     *     
     */
    public void setKoeretoejBlokeringAarsagTypeSamling(USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling value) {
        this.koeretoejBlokeringAarsagTypeSamling = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "koeretoejBlokeringAarsagTypeStruktur"
    })
    public static class KoeretoejBlokeringAarsagTypeSamling {

        @XmlElement(name = "KoeretoejBlokeringAarsagTypeStruktur")
        protected List<KoeretoejBlokeringAarsagTypeStrukturType> koeretoejBlokeringAarsagTypeStruktur;

        /**
         * Gets the value of the koeretoejBlokeringAarsagTypeStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejBlokeringAarsagTypeStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejBlokeringAarsagTypeStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KoeretoejBlokeringAarsagTypeStrukturType }
         * 
         * 
         */
        public List<KoeretoejBlokeringAarsagTypeStrukturType> getKoeretoejBlokeringAarsagTypeStruktur() {
            if (koeretoejBlokeringAarsagTypeStruktur == null) {
                koeretoejBlokeringAarsagTypeStruktur = new ArrayList<KoeretoejBlokeringAarsagTypeStrukturType>();
            }
            return this.koeretoejBlokeringAarsagTypeStruktur;
        }

    }

}
