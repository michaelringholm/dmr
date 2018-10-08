
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejBetegnelseHierarkiListeHent_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBetegnelseHierarkiListeHent_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PeriodeSoegStruktur" minOccurs="0"/&gt;
 *         &lt;element name="HierarkiValg" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Maerke"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Model"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Variant"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
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
@XmlType(name = "USKoeretoejBetegnelseHierarkiListeHent_IType", propOrder = {
    "hovedOplysninger",
    "periodeSoegStruktur",
    "hierarkiValg"
})
@XmlSeeAlso({
    USKoeretoejBetegnelseHierarkiListeHentI.class
})
public class USKoeretoejBetegnelseHierarkiListeHentIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "PeriodeSoegStruktur")
    protected PeriodeSoegStrukturType periodeSoegStruktur;
    @XmlElement(name = "HierarkiValg")
    protected USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg hierarkiValg;

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
     * Gets the value of the periodeSoegStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodeSoegStrukturType }
     *     
     */
    public PeriodeSoegStrukturType getPeriodeSoegStruktur() {
        return periodeSoegStruktur;
    }

    /**
     * Sets the value of the periodeSoegStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodeSoegStrukturType }
     *     
     */
    public void setPeriodeSoegStruktur(PeriodeSoegStrukturType value) {
        this.periodeSoegStruktur = value;
    }

    /**
     * Gets the value of the hierarkiValg property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg }
     *     
     */
    public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg getHierarkiValg() {
        return hierarkiValg;
    }

    /**
     * Sets the value of the hierarkiValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg }
     *     
     */
    public void setHierarkiValg(USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg value) {
        this.hierarkiValg = value;
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
     *         &lt;sequence&gt;
     *           &lt;element name="Maerke"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="Model"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="Variant"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
        "maerke",
        "model",
        "variant"
    })
    public static class HierarkiValg {

        @XmlElement(name = "Maerke")
        protected USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke maerke;
        @XmlElement(name = "Model")
        protected USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model model;
        @XmlElement(name = "Variant")
        protected USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant variant;

        /**
         * Gets the value of the maerke property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke }
         *     
         */
        public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke getMaerke() {
            return maerke;
        }

        /**
         * Sets the value of the maerke property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke }
         *     
         */
        public void setMaerke(USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke value) {
            this.maerke = value;
        }

        /**
         * Gets the value of the model property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model }
         *     
         */
        public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model getModel() {
            return model;
        }

        /**
         * Sets the value of the model property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model }
         *     
         */
        public void setModel(USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model value) {
            this.model = value;
        }

        /**
         * Gets the value of the variant property.
         * 
         * @return
         *     possible object is
         *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant }
         *     
         */
        public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant getVariant() {
            return variant;
        }

        /**
         * Sets the value of the variant property.
         * 
         * @param value
         *     allowed object is
         *     {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant }
         *     
         */
        public void setVariant(USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant value) {
            this.variant = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
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
            "koeretoejMaerkeTypeNavn",
            "koeretoejModelTypeNavn"
        })
        public static class Maerke {

            @XmlElement(name = "KoeretoejMaerkeTypeNavn", required = true)
            protected String koeretoejMaerkeTypeNavn;
            @XmlElement(name = "KoeretoejModelTypeNavn")
            protected String koeretoejModelTypeNavn;

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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn" minOccurs="0"/&gt;
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
            "koeretoejModelTypeNavn",
            "koeretoejVariantTypeNavn"
        })
        public static class Model {

            @XmlElement(name = "KoeretoejModelTypeNavn", required = true)
            protected String koeretoejModelTypeNavn;
            @XmlElement(name = "KoeretoejVariantTypeNavn")
            protected String koeretoejVariantTypeNavn;

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
            "koeretoejVariantTypeNavn"
        })
        public static class Variant {

            @XmlElement(name = "KoeretoejVariantTypeNavn", required = true)
            protected String koeretoejVariantTypeNavn;

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

}
