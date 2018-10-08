
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejGenerelIdentifikatorStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejGenerelIdentifikatorStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KoeretoejGenerelIdentifikatorValg"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "KoeretoejGenerelIdentifikatorStrukturType", propOrder = {
    "koeretoejGenerelIdentifikatorValg"
})
public class KoeretoejGenerelIdentifikatorStrukturType {

    @XmlElement(name = "KoeretoejGenerelIdentifikatorValg", required = true)
    protected KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg koeretoejGenerelIdentifikatorValg;

    /**
     * Gets the value of the koeretoejGenerelIdentifikatorValg property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg }
     *     
     */
    public KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg getKoeretoejGenerelIdentifikatorValg() {
        return koeretoejGenerelIdentifikatorValg;
    }

    /**
     * Sets the value of the koeretoejGenerelIdentifikatorValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg }
     *     
     */
    public void setKoeretoejGenerelIdentifikatorValg(KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg value) {
        this.koeretoejGenerelIdentifikatorValg = value;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "koeretoejIdent",
        "registreringNummerNummer",
        "koeretoejOplysningStelNummer"
    })
    public static class KoeretoejGenerelIdentifikatorValg {

        @XmlElement(name = "KoeretoejIdent")
        protected BigInteger koeretoejIdent;
        @XmlElement(name = "RegistreringNummerNummer")
        protected String registreringNummerNummer;
        @XmlElement(name = "KoeretoejOplysningStelNummer")
        protected String koeretoejOplysningStelNummer;

        /**
         * Gets the value of the koeretoejIdent property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getKoeretoejIdent() {
            return koeretoejIdent;
        }

        /**
         * Sets the value of the koeretoejIdent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setKoeretoejIdent(BigInteger value) {
            this.koeretoejIdent = value;
        }

        /**
         * Gets the value of the registreringNummerNummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistreringNummerNummer() {
            return registreringNummerNummer;
        }

        /**
         * Sets the value of the registreringNummerNummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistreringNummerNummer(String value) {
            this.registreringNummerNummer = value;
        }

        /**
         * Gets the value of the koeretoejOplysningStelNummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKoeretoejOplysningStelNummer() {
            return koeretoejOplysningStelNummer;
        }

        /**
         * Sets the value of the koeretoejOplysningStelNummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKoeretoejOplysningStelNummer(String value) {
            this.koeretoejOplysningStelNummer = value;
        }

    }

}
