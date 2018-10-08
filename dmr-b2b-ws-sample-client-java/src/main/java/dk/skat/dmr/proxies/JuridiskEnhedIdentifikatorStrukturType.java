
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JuridiskEnhedIdentifikatorStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuridiskEnhedIdentifikatorStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JuridiskEnhedValg"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonCPRNummer"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer"/&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="PENummerCVR"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedCVRNummer"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ProduktionEnhedNummer" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID"/&gt;
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
@XmlType(name = "JuridiskEnhedIdentifikatorStrukturType", propOrder = {
    "juridiskEnhedValg"
})
public class JuridiskEnhedIdentifikatorStrukturType {

    @XmlElement(name = "JuridiskEnhedValg", required = true)
    protected JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg juridiskEnhedValg;

    /**
     * Gets the value of the juridiskEnhedValg property.
     * 
     * @return
     *     possible object is
     *     {@link JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg }
     *     
     */
    public JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg getJuridiskEnhedValg() {
        return juridiskEnhedValg;
    }

    /**
     * Sets the value of the juridiskEnhedValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg }
     *     
     */
    public void setJuridiskEnhedValg(JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg value) {
        this.juridiskEnhedValg = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonCPRNummer"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer"/&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="PENummerCVR"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedCVRNummer"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ProduktionEnhedNummer" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID"/&gt;
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
        "personCPRNummer",
        "virksomhedSENummer",
        "peNummerCVR",
        "alternativKontaktID"
    })
    public static class JuridiskEnhedValg {

        @XmlElement(name = "PersonCPRNummer")
        protected String personCPRNummer;
        @XmlElement(name = "VirksomhedSENummer")
        protected BigInteger virksomhedSENummer;
        @XmlElement(name = "PENummerCVR")
        protected JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR peNummerCVR;
        @XmlElement(name = "AlternativKontaktID")
        protected BigInteger alternativKontaktID;

        /**
         * Gets the value of the personCPRNummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonCPRNummer() {
            return personCPRNummer;
        }

        /**
         * Sets the value of the personCPRNummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonCPRNummer(String value) {
            this.personCPRNummer = value;
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
         * Gets the value of the peNummerCVR property.
         * 
         * @return
         *     possible object is
         *     {@link JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR }
         *     
         */
        public JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR getPENummerCVR() {
            return peNummerCVR;
        }

        /**
         * Sets the value of the peNummerCVR property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR }
         *     
         */
        public void setPENummerCVR(JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR value) {
            this.peNummerCVR = value;
        }

        /**
         * Gets the value of the alternativKontaktID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAlternativKontaktID() {
            return alternativKontaktID;
        }

        /**
         * Sets the value of the alternativKontaktID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAlternativKontaktID(BigInteger value) {
            this.alternativKontaktID = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedCVRNummer"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ProduktionEnhedNummer" minOccurs="0"/&gt;
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
            "virksomhedCVRNummer",
            "produktionEnhedNummer"
        })
        public static class PENummerCVR {

            @XmlElement(name = "VirksomhedCVRNummer", required = true)
            protected String virksomhedCVRNummer;
            @XmlElement(name = "ProduktionEnhedNummer")
            protected BigInteger produktionEnhedNummer;

            /**
             * Gets the value of the virksomhedCVRNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVirksomhedCVRNummer() {
                return virksomhedCVRNummer;
            }

            /**
             * Sets the value of the virksomhedCVRNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVirksomhedCVRNummer(String value) {
                this.virksomhedCVRNummer = value;
            }

            /**
             * Gets the value of the produktionEnhedNummer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getProduktionEnhedNummer() {
                return produktionEnhedNummer;
            }

            /**
             * Sets the value of the produktionEnhedNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setProduktionEnhedNummer(BigInteger value) {
                this.produktionEnhedNummer = value;
            }

        }

    }

}
