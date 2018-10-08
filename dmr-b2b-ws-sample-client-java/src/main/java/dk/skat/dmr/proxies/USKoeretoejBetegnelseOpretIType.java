
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejBetegnelseOpret_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBetegnelseOpret_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
 *         &lt;element name="Variant" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
 *                   &lt;element name="Type" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNavn"/&gt;
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
@XmlType(name = "USKoeretoejBetegnelseOpret_IType", propOrder = {
    "hovedOplysninger",
    "koeretoejMaerkeTypeNummer",
    "koeretoejMaerkeTypeNavn",
    "koeretoejModelTypeNummer",
    "koeretoejModelTypeNavn",
    "variant",
    "virksomhedSENummer"
})
@XmlSeeAlso({
    USKoeretoejBetegnelseOpretI.class
})
public class USKoeretoejBetegnelseOpretIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "KoeretoejMaerkeTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMaerkeTypeNummer;
    @XmlElement(name = "KoeretoejMaerkeTypeNavn", required = true)
    protected String koeretoejMaerkeTypeNavn;
    @XmlElement(name = "KoeretoejModelTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejModelTypeNummer;
    @XmlElement(name = "KoeretoejModelTypeNavn", required = true)
    protected String koeretoejModelTypeNavn;
    @XmlElement(name = "Variant")
    protected USKoeretoejBetegnelseOpretIType.Variant variant;
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
     * Gets the value of the koeretoejMaerkeTypeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejMaerkeTypeNummer() {
        return koeretoejMaerkeTypeNummer;
    }

    /**
     * Sets the value of the koeretoejMaerkeTypeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejMaerkeTypeNummer(Long value) {
        this.koeretoejMaerkeTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejMaerkeTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejMaerkeTypeNavn() {
        return koeretoejMaerkeTypeNavn;
    }

    /**
     * Sets the value of the koeretoejMaerkeTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejMaerkeTypeNavn(String value) {
        this.koeretoejMaerkeTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejModelTypeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejModelTypeNummer() {
        return koeretoejModelTypeNummer;
    }

    /**
     * Sets the value of the koeretoejModelTypeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejModelTypeNummer(Long value) {
        this.koeretoejModelTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejModelTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejModelTypeNavn() {
        return koeretoejModelTypeNavn;
    }

    /**
     * Sets the value of the koeretoejModelTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejModelTypeNavn(String value) {
        this.koeretoejModelTypeNavn = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBetegnelseOpretIType.Variant }
     *     
     */
    public USKoeretoejBetegnelseOpretIType.Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBetegnelseOpretIType.Variant }
     *     
     */
    public void setVariant(USKoeretoejBetegnelseOpretIType.Variant value) {
        this.variant = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNummer" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
     *         &lt;element name="Type" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNavn"/&gt;
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
        "koeretoejVariantTypeNummer",
        "koeretoejVariantTypeNavn",
        "type"
    })
    public static class Variant {

        @XmlElement(name = "KoeretoejVariantTypeNummer")
        @XmlSchemaType(name = "integer")
        protected Long koeretoejVariantTypeNummer;
        @XmlElement(name = "KoeretoejVariantTypeNavn", required = true)
        protected String koeretoejVariantTypeNavn;
        @XmlElement(name = "Type")
        protected USKoeretoejBetegnelseOpretIType.Variant.Type type;

        /**
         * Gets the value of the koeretoejVariantTypeNummer property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getKoeretoejVariantTypeNummer() {
            return koeretoejVariantTypeNummer;
        }

        /**
         * Sets the value of the koeretoejVariantTypeNummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setKoeretoejVariantTypeNummer(Long value) {
            this.koeretoejVariantTypeNummer = value;
        }

        /**
         * Gets the value of the koeretoejVariantTypeNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKoeretoejVariantTypeNavn() {
            return koeretoejVariantTypeNavn;
        }

        /**
         * Sets the value of the koeretoejVariantTypeNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKoeretoejVariantTypeNavn(String value) {
            this.koeretoejVariantTypeNavn = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejBetegnelseOpretIType.Variant.Type }
         *     
         */
        public USKoeretoejBetegnelseOpretIType.Variant.Type getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejBetegnelseOpretIType.Variant.Type }
         *     
         */
        public void setType(USKoeretoejBetegnelseOpretIType.Variant.Type value) {
            this.type = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNavn"/&gt;
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
            "koeretoejTypeTypeNummer",
            "koeretoejTypeTypeNavn"
        })
        public static class Type {

            @XmlElement(name = "KoeretoejTypeTypeNummer")
            @XmlSchemaType(name = "integer")
            protected Long koeretoejTypeTypeNummer;
            @XmlElement(name = "KoeretoejTypeTypeNavn", required = true)
            protected String koeretoejTypeTypeNavn;

            /**
             * Gets the value of the koeretoejTypeTypeNummer property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getKoeretoejTypeTypeNummer() {
                return koeretoejTypeTypeNummer;
            }

            /**
             * Sets the value of the koeretoejTypeTypeNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setKoeretoejTypeTypeNummer(Long value) {
                this.koeretoejTypeTypeNummer = value;
            }

            /**
             * Gets the value of the koeretoejTypeTypeNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKoeretoejTypeTypeNavn() {
                return koeretoejTypeTypeNavn;
            }

            /**
             * Sets the value of the koeretoejTypeTypeNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKoeretoejTypeTypeNavn(String value) {
                this.koeretoejTypeTypeNavn = value;
            }

        }

    }

}
