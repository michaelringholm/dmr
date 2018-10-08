
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejBetegnelseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejBetegnelseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn" minOccurs="0"/&gt;
 *         &lt;element name="Model" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Variant" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNummer"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer"/&gt;
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
@XmlType(name = "KoeretoejBetegnelseStrukturType", propOrder = {
    "koeretoejMaerkeTypeNummer",
    "koeretoejMaerkeTypeNavn",
    "model",
    "variant",
    "type"
})
public class KoeretoejBetegnelseStrukturType {

    @XmlElement(name = "KoeretoejMaerkeTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMaerkeTypeNummer;
    @XmlElement(name = "KoeretoejMaerkeTypeNavn")
    protected String koeretoejMaerkeTypeNavn;
    @XmlElement(name = "Model")
    protected KoeretoejBetegnelseStrukturType.Model model;
    @XmlElement(name = "Variant")
    protected KoeretoejBetegnelseStrukturType.Variant variant;
    @XmlElement(name = "Type")
    protected KoeretoejBetegnelseStrukturType.Type type;

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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBetegnelseStrukturType.Model }
     *     
     */
    public KoeretoejBetegnelseStrukturType.Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBetegnelseStrukturType.Model }
     *     
     */
    public void setModel(KoeretoejBetegnelseStrukturType.Model value) {
        this.model = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBetegnelseStrukturType.Variant }
     *     
     */
    public KoeretoejBetegnelseStrukturType.Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBetegnelseStrukturType.Variant }
     *     
     */
    public void setVariant(KoeretoejBetegnelseStrukturType.Variant value) {
        this.variant = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBetegnelseStrukturType.Type }
     *     
     */
    public KoeretoejBetegnelseStrukturType.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBetegnelseStrukturType.Type }
     *     
     */
    public void setType(KoeretoejBetegnelseStrukturType.Type value) {
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
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
        "koeretoejModelTypeNummer",
        "koeretoejModelTypeNavn"
    })
    public static class Model {

        @XmlElement(name = "KoeretoejModelTypeNummer")
        @XmlSchemaType(name = "integer")
        protected long koeretoejModelTypeNummer;
        @XmlElement(name = "KoeretoejModelTypeNavn", required = true)
        protected String koeretoejModelTypeNavn;

        /**
         * Gets the value of the koeretoejModelTypeNummer property.
         * 
         */
        public long getKoeretoejModelTypeNummer() {
            return koeretoejModelTypeNummer;
        }

        /**
         * Sets the value of the koeretoejModelTypeNummer property.
         * 
         */
        public void setKoeretoejModelTypeNummer(long value) {
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer"/&gt;
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
        protected long koeretoejTypeTypeNummer;
        @XmlElement(name = "KoeretoejTypeTypeNavn", required = true)
        protected String koeretoejTypeTypeNavn;

        /**
         * Gets the value of the koeretoejTypeTypeNummer property.
         * 
         */
        public long getKoeretoejTypeTypeNummer() {
            return koeretoejTypeTypeNummer;
        }

        /**
         * Sets the value of the koeretoejTypeTypeNummer property.
         * 
         */
        public void setKoeretoejTypeTypeNummer(long value) {
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNummer"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
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
        "koeretoejVariantTypeNavn"
    })
    public static class Variant {

        @XmlElement(name = "KoeretoejVariantTypeNummer")
        @XmlSchemaType(name = "integer")
        protected long koeretoejVariantTypeNummer;
        @XmlElement(name = "KoeretoejVariantTypeNavn", required = true)
        protected String koeretoejVariantTypeNavn;

        /**
         * Gets the value of the koeretoejVariantTypeNummer property.
         * 
         */
        public long getKoeretoejVariantTypeNummer() {
            return koeretoejVariantTypeNummer;
        }

        /**
         * Sets the value of the koeretoejVariantTypeNummer property.
         * 
         */
        public void setKoeretoejVariantTypeNummer(long value) {
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

    }

}
