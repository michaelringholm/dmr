
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejErklaeringOpret_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejErklaeringOpret_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element name="KoeretoejErklaeringSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KoeretoejErklaering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringStruktur"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagKode"/&gt;
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
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USKoeretoejErklaeringOpret_IType", propOrder = {
    "hovedOplysninger",
    "koeretoejErklaeringSamling",
    "virksomhedSENummer"
})
@XmlSeeAlso({
    USKoeretoejErklaeringOpretI.class
})
public class USKoeretoejErklaeringOpretIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "KoeretoejErklaeringSamling", required = true)
    protected USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling koeretoejErklaeringSamling;
    @XmlElement(name = "VirksomhedSENummer")
    protected BigInteger virksomhedSENummer;

    /**
     * Gets the value of the hovedOplysninger property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerType }
     *     
     */
    public HovedOplysningerType getHovedOplysninger() {
        return hovedOplysninger;
    }

    /**
     * Sets the value of the hovedOplysninger property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerType }
     *     
     */
    public void setHovedOplysninger(HovedOplysningerType value) {
        this.hovedOplysninger = value;
    }

    /**
     * Gets the value of the koeretoejErklaeringSamling property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling }
     *     
     */
    public USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling getKoeretoejErklaeringSamling() {
        return koeretoejErklaeringSamling;
    }

    /**
     * Sets the value of the koeretoejErklaeringSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling }
     *     
     */
    public void setKoeretoejErklaeringSamling(USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling value) {
        this.koeretoejErklaeringSamling = value;
    }

    /**
     * Gets the value of the virksomhedSENummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVirksomhedSENummer() {
        return virksomhedSENummer;
    }

    /**
     * Sets the value of the virksomhedSENummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVirksomhedSENummer(BigInteger value) {
        this.virksomhedSENummer = value;
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
     *         &lt;element name="KoeretoejErklaering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringStruktur"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagKode"/&gt;
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
        "koeretoejErklaering"
    })
    public static class KoeretoejErklaeringSamling {

        @XmlElement(name = "KoeretoejErklaering")
        protected List<USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering> koeretoejErklaering;

        /**
         * Gets the value of the koeretoejErklaering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoejErklaering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoejErklaering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering }
         * 
         * 
         */
        public List<USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering> getKoeretoejErklaering() {
            if (koeretoejErklaering == null) {
                koeretoejErklaering = new ArrayList<USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering>();
            }
            return this.koeretoejErklaering;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejErklaeringStruktur"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagKode"/&gt;
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
            "koeretoejErklaeringStruktur",
            "koeretoejRegistreringGrundlagKode"
        })
        public static class KoeretoejErklaering {

            @XmlElement(name = "KoeretoejErklaeringStruktur", required = true)
            protected KoeretoejErklaeringStrukturType koeretoejErklaeringStruktur;
            @XmlElement(name = "KoeretoejRegistreringGrundlagKode", required = true)
            protected String koeretoejRegistreringGrundlagKode;

            /**
             * Gets the value of the koeretoejErklaeringStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link KoeretoejErklaeringStrukturType }
             *     
             */
            public KoeretoejErklaeringStrukturType getKoeretoejErklaeringStruktur() {
                return koeretoejErklaeringStruktur;
            }

            /**
             * Sets the value of the koeretoejErklaeringStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link KoeretoejErklaeringStrukturType }
             *     
             */
            public void setKoeretoejErklaeringStruktur(KoeretoejErklaeringStrukturType value) {
                this.koeretoejErklaeringStruktur = value;
            }

            /**
             * Gets the value of the koeretoejRegistreringGrundlagKode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKoeretoejRegistreringGrundlagKode() {
                return koeretoejRegistreringGrundlagKode;
            }

            /**
             * Sets the value of the koeretoejRegistreringGrundlagKode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKoeretoejRegistreringGrundlagKode(String value) {
                this.koeretoejRegistreringGrundlagKode = value;
            }

        }

    }

}
