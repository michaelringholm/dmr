
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
 * <p>Java class for USKoeretoejTekniskDataHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejTekniskDataHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="KoeretoejTekniskDataListe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KoeretoejTekniskData" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTekniskDataStruktur"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "USKoeretoejTekniskDataHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "koeretoejTekniskDataListe"
})
@XmlSeeAlso({
    USKoeretoejTekniskDataHentO.class
})
public class USKoeretoejTekniskDataHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "KoeretoejTekniskDataListe")
    protected USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe koeretoejTekniskDataListe;

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
     * Gets the value of the koeretoejTekniskDataListe property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe }
     *     
     */
    public USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe getKoeretoejTekniskDataListe() {
        return koeretoejTekniskDataListe;
    }

    /**
     * Sets the value of the koeretoejTekniskDataListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe }
     *     
     */
    public void setKoeretoejTekniskDataListe(USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe value) {
        this.koeretoejTekniskDataListe = value;
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
     *         &lt;element name="KoeretoejTekniskData" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTekniskDataStruktur"/&gt;
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
    @XmlType(name = "", propOrder = {
        "koeretoejTekniskData"
    })
    public static class KoeretoejTekniskDataListe {

        @XmlElement(name = "KoeretoejTekniskData")
        protected List<USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData> koeretoejTekniskData;

        /**
         * Gets the value of the koeretoejTekniskData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejTekniskData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejTekniskData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData }
         * 
         * 
         */
        public List<USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData> getKoeretoejTekniskData() {
            if (koeretoejTekniskData == null) {
                koeretoejTekniskData = new ArrayList<USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData>();
            }
            return this.koeretoejTekniskData;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTekniskDataStruktur"/&gt;
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
            "koeretoejTekniskDataStruktur"
        })
        public static class KoeretoejTekniskData {

            @XmlElement(name = "KoeretoejTekniskDataStruktur", required = true)
            protected KoeretoejTekniskDataStrukturType koeretoejTekniskDataStruktur;

            /**
             * Gets the value of the koeretoejTekniskDataStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejTekniskDataStrukturType }
             *     
             */
            public KoeretoejTekniskDataStrukturType getKoeretoejTekniskDataStruktur() {
                return koeretoejTekniskDataStruktur;
            }

            /**
             * Sets the value of the koeretoejTekniskDataStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejTekniskDataStrukturType }
             *     
             */
            public void setKoeretoejTekniskDataStruktur(KoeretoejTekniskDataStrukturType value) {
                this.koeretoejTekniskDataStruktur = value;
            }

        }

    }

}
