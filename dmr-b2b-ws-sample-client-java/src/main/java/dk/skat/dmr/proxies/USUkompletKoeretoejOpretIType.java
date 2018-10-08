
package dk.skat.dmr.proxies;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USUkompletKoeretoejOpret_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USUkompletKoeretoejOpret_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element name="KoeretoejSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Koeretoej" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNummer"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNummer"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerStandardPris" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerIndkoebsPris" minOccurs="0"/&gt;
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
@XmlType(name = "USUkompletKoeretoejOpret_IType", propOrder = {
    "hovedOplysninger",
    "koeretoejSamling"
})
@XmlSeeAlso({
    USUkompletKoeretoejOpretI.class
})
public class USUkompletKoeretoejOpretIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "KoeretoejSamling", required = true)
    protected USUkompletKoeretoejOpretIType.KoeretoejSamling koeretoejSamling;

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
     * Gets the value of the koeretoejSamling property.
     * 
     * @return
     *     possible object is
     *     {@link USUkompletKoeretoejOpretIType.KoeretoejSamling }
     *     
     */
    public USUkompletKoeretoejOpretIType.KoeretoejSamling getKoeretoejSamling() {
        return koeretoejSamling;
    }

    /**
     * Sets the value of the koeretoejSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link USUkompletKoeretoejOpretIType.KoeretoejSamling }
     *     
     */
    public void setKoeretoejSamling(USUkompletKoeretoejOpretIType.KoeretoejSamling value) {
        this.koeretoejSamling = value;
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
     *         &lt;element name="Koeretoej" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNummer"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNummer"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerStandardPris" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerIndkoebsPris" minOccurs="0"/&gt;
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
        "koeretoej"
    })
    public static class KoeretoejSamling {

        @XmlElement(name = "Koeretoej", required = true)
        protected List<USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej> koeretoej;

        /**
         * Gets the value of the koeretoej property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koeretoej property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoeretoej().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej }
         * 
         * 
         */
        public List<USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej> getKoeretoej() {
            if (koeretoej == null) {
                koeretoej = new ArrayList<USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej>();
            }
            return this.koeretoej;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNummer"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNummer"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerStandardPris" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerIndkoebsPris" minOccurs="0"/&gt;
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
            "koeretoejOplysningStelNummer",
            "koeretoejArtNummer",
            "koeretoejMaerkeTypeNummer",
            "koeretoejModelTypeNummer",
            "koeretoejArtNavn",
            "koeretoejMaerkeTypeNavn",
            "koeretoejModelTypeNavn",
            "prisOplysningerStandardPris",
            "prisOplysningerIndkoebsPris"
        })
        public static class Koeretoej {

            @XmlElement(name = "KoeretoejOplysningStelNummer", required = true)
            protected String koeretoejOplysningStelNummer;
            @XmlElement(name = "KoeretoejArtNummer")
            @XmlSchemaType(name = "integer")
            protected long koeretoejArtNummer;
            @XmlElement(name = "KoeretoejMaerkeTypeNummer")
            @XmlSchemaType(name = "integer")
            protected long koeretoejMaerkeTypeNummer;
            @XmlElement(name = "KoeretoejModelTypeNummer")
            @XmlSchemaType(name = "integer")
            protected Long koeretoejModelTypeNummer;
            @XmlElement(name = "KoeretoejArtNavn", required = true)
            protected String koeretoejArtNavn;
            @XmlElement(name = "KoeretoejMaerkeTypeNavn", required = true)
            protected String koeretoejMaerkeTypeNavn;
            @XmlElement(name = "KoeretoejModelTypeNavn")
            protected String koeretoejModelTypeNavn;
            @XmlElement(name = "PrisOplysningerStandardPris")
            protected BigDecimal prisOplysningerStandardPris;
            @XmlElement(name = "PrisOplysningerIndkoebsPris")
            protected BigDecimal prisOplysningerIndkoebsPris;

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

            /**
             * Gets the value of the koeretoejArtNummer property.
             * 
             */
            public long getKoeretoejArtNummer() {
                return koeretoejArtNummer;
            }

            /**
             * Sets the value of the koeretoejArtNummer property.
             * 
             */
            public void setKoeretoejArtNummer(long value) {
                this.koeretoejArtNummer = value;
            }

            /**
             * Gets the value of the koeretoejMaerkeTypeNummer property.
             * 
             */
            public long getKoeretoejMaerkeTypeNummer() {
                return koeretoejMaerkeTypeNummer;
            }

            /**
             * Sets the value of the koeretoejMaerkeTypeNummer property.
             * 
             */
            public void setKoeretoejMaerkeTypeNummer(long value) {
                this.koeretoejMaerkeTypeNummer = value;
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
             * Gets the value of the koeretoejArtNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKoeretoejArtNavn() {
                return koeretoejArtNavn;
            }

            /**
             * Sets the value of the koeretoejArtNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKoeretoejArtNavn(String value) {
                this.koeretoejArtNavn = value;
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
             * Gets the value of the prisOplysningerStandardPris property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrisOplysningerStandardPris() {
                return prisOplysningerStandardPris;
            }

            /**
             * Sets the value of the prisOplysningerStandardPris property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrisOplysningerStandardPris(BigDecimal value) {
                this.prisOplysningerStandardPris = value;
            }

            /**
             * Gets the value of the prisOplysningerIndkoebsPris property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrisOplysningerIndkoebsPris() {
                return prisOplysningerIndkoebsPris;
            }

            /**
             * Sets the value of the prisOplysningerIndkoebsPris property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrisOplysningerIndkoebsPris(BigDecimal value) {
                this.prisOplysningerIndkoebsPris = value;
            }

        }

    }

}
