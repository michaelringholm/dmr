
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USSupplerendeKarrosseriTypeListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USSupplerendeKarrosseriTypeListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="SupplerendeKarrosseriTypeSamling" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SupplerendeKarrosseriType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNummer"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNavn"/&gt;
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
@XmlType(name = "USSupplerendeKarrosseriTypeListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "supplerendeKarrosseriTypeSamling"
})
@XmlSeeAlso({
    USSupplerendeKarrosseriTypeListeHentO.class
})
public class USSupplerendeKarrosseriTypeListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "SupplerendeKarrosseriTypeSamling")
    protected USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling supplerendeKarrosseriTypeSamling;

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
     * Gets the value of the supplerendeKarrosseriTypeSamling property.
     * 
     * @return
     *     possible object is
     *     {@link USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling }
     *     
     */
    public USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling getSupplerendeKarrosseriTypeSamling() {
        return supplerendeKarrosseriTypeSamling;
    }

    /**
     * Sets the value of the supplerendeKarrosseriTypeSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling }
     *     
     */
    public void setSupplerendeKarrosseriTypeSamling(USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling value) {
        this.supplerendeKarrosseriTypeSamling = value;
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
     *         &lt;element name="SupplerendeKarrosseriType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNummer"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNavn"/&gt;
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
        "supplerendeKarrosseriType"
    })
    public static class SupplerendeKarrosseriTypeSamling {

        @XmlElement(name = "SupplerendeKarrosseriType")
        protected List<USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType> supplerendeKarrosseriType;

        /**
         * Gets the value of the supplerendeKarrosseriType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplerendeKarrosseriType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplerendeKarrosseriType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType }
         * 
         * 
         */
        public List<USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType> getSupplerendeKarrosseriType() {
            if (supplerendeKarrosseriType == null) {
                supplerendeKarrosseriType = new ArrayList<USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType>();
            }
            return this.supplerendeKarrosseriType;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNummer"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNavn"/&gt;
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
            "supplerendeKarrosseriTypeNummer",
            "supplerendeKarrosseriTypeNavn"
        })
        public static class SupplerendeKarrosseriType {

            @XmlElement(name = "SupplerendeKarrosseriTypeNummer")
            @XmlSchemaType(name = "integer")
            protected long supplerendeKarrosseriTypeNummer;
            @XmlElement(name = "SupplerendeKarrosseriTypeNavn", required = true)
            protected String supplerendeKarrosseriTypeNavn;

            /**
             * Gets the value of the supplerendeKarrosseriTypeNummer property.
             * 
             */
            public long getSupplerendeKarrosseriTypeNummer() {
                return supplerendeKarrosseriTypeNummer;
            }

            /**
             * Sets the value of the supplerendeKarrosseriTypeNummer property.
             * 
             */
            public void setSupplerendeKarrosseriTypeNummer(long value) {
                this.supplerendeKarrosseriTypeNummer = value;
            }

            /**
             * Gets the value of the supplerendeKarrosseriTypeNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplerendeKarrosseriTypeNavn() {
                return supplerendeKarrosseriTypeNavn;
            }

            /**
             * Sets the value of the supplerendeKarrosseriTypeNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplerendeKarrosseriTypeNavn(String value) {
                this.supplerendeKarrosseriTypeNavn = value;
            }

        }

    }

}
