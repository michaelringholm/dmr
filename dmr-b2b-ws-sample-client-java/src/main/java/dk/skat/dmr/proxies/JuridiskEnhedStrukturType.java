
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JuridiskEnhedStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuridiskEnhedStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JuridiskEnhedValg"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Person"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonNavnAdresseBeskyttelseMarkering" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonCPRNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonFoedselDato" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonKoen" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonNavnNavn" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonAdresseStruktur" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Virksomhed"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedCVRNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ProduktionEnhedNummer" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnStruktur"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseStruktur"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="UdenlandskPerson"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonFoedselDato" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonKoen" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktNavn"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonNavnAdresseBeskyttelseMarkering" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonAdresseStruktur"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="UdenlandskVirksomhed"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktNavn"/&gt;
 *                               &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseStruktur"/&gt;
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
@XmlType(name = "JuridiskEnhedStrukturType", propOrder = {
    "juridiskEnhedValg"
})
public class JuridiskEnhedStrukturType {

    @XmlElement(name = "JuridiskEnhedValg", required = true)
    protected JuridiskEnhedStrukturType.JuridiskEnhedValg juridiskEnhedValg;

    /**
     * Gets the value of the juridiskEnhedValg property.
     * 
     * @return
     *     possible object is
     *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg }
     *     
     */
    public JuridiskEnhedStrukturType.JuridiskEnhedValg getJuridiskEnhedValg() {
        return juridiskEnhedValg;
    }

    /**
     * Sets the value of the juridiskEnhedValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg }
     *     
     */
    public void setJuridiskEnhedValg(JuridiskEnhedStrukturType.JuridiskEnhedValg value) {
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
     *         &lt;sequence&gt;
     *           &lt;element name="Person"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonNavnAdresseBeskyttelseMarkering" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonCPRNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonFoedselDato" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonKoen" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonNavnNavn" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonAdresseStruktur" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="Virksomhed"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedCVRNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ProduktionEnhedNummer" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnStruktur"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseStruktur"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="UdenlandskPerson"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonFoedselDato" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonKoen" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktNavn"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonNavnAdresseBeskyttelseMarkering" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonAdresseStruktur"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="UdenlandskVirksomhed"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID" minOccurs="0"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktNavn"/&gt;
     *                     &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseStruktur"/&gt;
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
        "person",
        "virksomhed",
        "udenlandskPerson",
        "udenlandskVirksomhed"
    })
    public static class JuridiskEnhedValg {

        @XmlElement(name = "Person")
        protected JuridiskEnhedStrukturType.JuridiskEnhedValg.Person person;
        @XmlElement(name = "Virksomhed")
        protected JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed virksomhed;
        @XmlElement(name = "UdenlandskPerson")
        protected JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson udenlandskPerson;
        @XmlElement(name = "UdenlandskVirksomhed")
        protected JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed udenlandskVirksomhed;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.Person }
         *     
         */
        public JuridiskEnhedStrukturType.JuridiskEnhedValg.Person getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.Person }
         *     
         */
        public void setPerson(JuridiskEnhedStrukturType.JuridiskEnhedValg.Person value) {
            this.person = value;
        }

        /**
         * Gets the value of the virksomhed property.
         * 
         * @return
         *     possible object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed }
         *     
         */
        public JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed getVirksomhed() {
            return virksomhed;
        }

        /**
         * Sets the value of the virksomhed property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed }
         *     
         */
        public void setVirksomhed(JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed value) {
            this.virksomhed = value;
        }

        /**
         * Gets the value of the udenlandskPerson property.
         * 
         * @return
         *     possible object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson }
         *     
         */
        public JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson getUdenlandskPerson() {
            return udenlandskPerson;
        }

        /**
         * Sets the value of the udenlandskPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson }
         *     
         */
        public void setUdenlandskPerson(JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson value) {
            this.udenlandskPerson = value;
        }

        /**
         * Gets the value of the udenlandskVirksomhed property.
         * 
         * @return
         *     possible object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed }
         *     
         */
        public JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed getUdenlandskVirksomhed() {
            return udenlandskVirksomhed;
        }

        /**
         * Sets the value of the udenlandskVirksomhed property.
         * 
         * @param value
         *     allowed object is
         *     {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed }
         *     
         */
        public void setUdenlandskVirksomhed(JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed value) {
            this.udenlandskVirksomhed = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonNavnAdresseBeskyttelseMarkering" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonCPRNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonFoedselDato" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonKoen" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonNavnNavn" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonAdresseStruktur" minOccurs="0"/&gt;
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
            "personNavnAdresseBeskyttelseMarkering",
            "personCPRNummer",
            "personFoedselDato",
            "personKoen",
            "personNavnNavn",
            "personAdresseStruktur"
        })
        public static class Person {

            @XmlElement(name = "PersonNavnAdresseBeskyttelseMarkering")
            protected Boolean personNavnAdresseBeskyttelseMarkering;
            @XmlElement(name = "PersonCPRNummer")
            protected String personCPRNummer;
            @XmlElement(name = "PersonFoedselDato")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar personFoedselDato;
            @XmlElement(name = "PersonKoen")
            protected BigInteger personKoen;
            @XmlElement(name = "PersonNavnNavn")
            protected String personNavnNavn;
            @XmlElement(name = "PersonAdresseStruktur")
            protected PersonAdresseStrukturType personAdresseStruktur;

            /**
             * Gets the value of the personNavnAdresseBeskyttelseMarkering property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPersonNavnAdresseBeskyttelseMarkering() {
                return personNavnAdresseBeskyttelseMarkering;
            }

            /**
             * Sets the value of the personNavnAdresseBeskyttelseMarkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPersonNavnAdresseBeskyttelseMarkering(Boolean value) {
                this.personNavnAdresseBeskyttelseMarkering = value;
            }

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
             * Gets the value of the personFoedselDato property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPersonFoedselDato() {
                return personFoedselDato;
            }

            /**
             * Sets the value of the personFoedselDato property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPersonFoedselDato(XMLGregorianCalendar value) {
                this.personFoedselDato = value;
            }

            /**
             * Gets the value of the personKoen property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPersonKoen() {
                return personKoen;
            }

            /**
             * Sets the value of the personKoen property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPersonKoen(BigInteger value) {
                this.personKoen = value;
            }

            /**
             * Gets the value of the personNavnNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonNavnNavn() {
                return personNavnNavn;
            }

            /**
             * Sets the value of the personNavnNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonNavnNavn(String value) {
                this.personNavnNavn = value;
            }

            /**
             * Gets the value of the personAdresseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link PersonAdresseStrukturType }
             *     
             */
            public PersonAdresseStrukturType getPersonAdresseStruktur() {
                return personAdresseStruktur;
            }

            /**
             * Sets the value of the personAdresseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonAdresseStrukturType }
             *     
             */
            public void setPersonAdresseStruktur(PersonAdresseStrukturType value) {
                this.personAdresseStruktur = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonFoedselDato" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonKoen" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktPersonNavnAdresseBeskyttelseMarkering" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PersonAdresseStruktur"/&gt;
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
            "alternativKontaktID",
            "alternativKontaktPersonFoedselDato",
            "alternativKontaktPersonKoen",
            "alternativKontaktNavn",
            "alternativKontaktPersonNavnAdresseBeskyttelseMarkering",
            "personAdresseStruktur"
        })
        public static class UdenlandskPerson {

            @XmlElement(name = "AlternativKontaktID")
            protected BigInteger alternativKontaktID;
            @XmlElement(name = "AlternativKontaktPersonFoedselDato")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar alternativKontaktPersonFoedselDato;
            @XmlElement(name = "AlternativKontaktPersonKoen")
            protected BigInteger alternativKontaktPersonKoen;
            @XmlElement(name = "AlternativKontaktNavn", required = true)
            protected String alternativKontaktNavn;
            @XmlElement(name = "AlternativKontaktPersonNavnAdresseBeskyttelseMarkering")
            protected Boolean alternativKontaktPersonNavnAdresseBeskyttelseMarkering;
            @XmlElement(name = "PersonAdresseStruktur", required = true)
            protected PersonAdresseStrukturType personAdresseStruktur;

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
             * Gets the value of the alternativKontaktPersonFoedselDato property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAlternativKontaktPersonFoedselDato() {
                return alternativKontaktPersonFoedselDato;
            }

            /**
             * Sets the value of the alternativKontaktPersonFoedselDato property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAlternativKontaktPersonFoedselDato(XMLGregorianCalendar value) {
                this.alternativKontaktPersonFoedselDato = value;
            }

            /**
             * Gets the value of the alternativKontaktPersonKoen property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAlternativKontaktPersonKoen() {
                return alternativKontaktPersonKoen;
            }

            /**
             * Sets the value of the alternativKontaktPersonKoen property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAlternativKontaktPersonKoen(BigInteger value) {
                this.alternativKontaktPersonKoen = value;
            }

            /**
             * Gets the value of the alternativKontaktNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativKontaktNavn() {
                return alternativKontaktNavn;
            }

            /**
             * Sets the value of the alternativKontaktNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativKontaktNavn(String value) {
                this.alternativKontaktNavn = value;
            }

            /**
             * Gets the value of the alternativKontaktPersonNavnAdresseBeskyttelseMarkering property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAlternativKontaktPersonNavnAdresseBeskyttelseMarkering() {
                return alternativKontaktPersonNavnAdresseBeskyttelseMarkering;
            }

            /**
             * Sets the value of the alternativKontaktPersonNavnAdresseBeskyttelseMarkering property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAlternativKontaktPersonNavnAdresseBeskyttelseMarkering(Boolean value) {
                this.alternativKontaktPersonNavnAdresseBeskyttelseMarkering = value;
            }

            /**
             * Gets the value of the personAdresseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link PersonAdresseStrukturType }
             *     
             */
            public PersonAdresseStrukturType getPersonAdresseStruktur() {
                return personAdresseStruktur;
            }

            /**
             * Sets the value of the personAdresseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonAdresseStrukturType }
             *     
             */
            public void setPersonAdresseStruktur(PersonAdresseStrukturType value) {
                this.personAdresseStruktur = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktID" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativKontaktNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseStruktur"/&gt;
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
            "alternativKontaktID",
            "alternativKontaktNavn",
            "virksomhedAdresseStruktur"
        })
        public static class UdenlandskVirksomhed {

            @XmlElement(name = "AlternativKontaktID")
            protected BigInteger alternativKontaktID;
            @XmlElement(name = "AlternativKontaktNavn", required = true)
            protected String alternativKontaktNavn;
            @XmlElement(name = "VirksomhedAdresseStruktur", required = true)
            protected VirksomhedAdresseStrukturType virksomhedAdresseStruktur;

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
             * Gets the value of the alternativKontaktNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternativKontaktNavn() {
                return alternativKontaktNavn;
            }

            /**
             * Sets the value of the alternativKontaktNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternativKontaktNavn(String value) {
                this.alternativKontaktNavn = value;
            }

            /**
             * Gets the value of the virksomhedAdresseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedAdresseStrukturType }
             *     
             */
            public VirksomhedAdresseStrukturType getVirksomhedAdresseStruktur() {
                return virksomhedAdresseStruktur;
            }

            /**
             * Sets the value of the virksomhedAdresseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedAdresseStrukturType }
             *     
             */
            public void setVirksomhedAdresseStruktur(VirksomhedAdresseStrukturType value) {
                this.virksomhedAdresseStruktur = value;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedCVRNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedSENummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ProduktionEnhedNummer" minOccurs="0"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnStruktur"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedAdresseStruktur"/&gt;
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
            "virksomhedSENummer",
            "produktionEnhedNummer",
            "virksomhedNavnStruktur",
            "virksomhedAdresseStruktur"
        })
        public static class Virksomhed {

            @XmlElement(name = "VirksomhedCVRNummer")
            protected String virksomhedCVRNummer;
            @XmlElement(name = "VirksomhedSENummer")
            protected BigInteger virksomhedSENummer;
            @XmlElement(name = "ProduktionEnhedNummer")
            protected BigInteger produktionEnhedNummer;
            @XmlElement(name = "VirksomhedNavnStruktur", required = true)
            protected VirksomhedNavnStrukturType virksomhedNavnStruktur;
            @XmlElement(name = "VirksomhedAdresseStruktur", required = true)
            protected VirksomhedAdresseStrukturType virksomhedAdresseStruktur;

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

            /**
             * Gets the value of the virksomhedNavnStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedNavnStrukturType }
             *     
             */
            public VirksomhedNavnStrukturType getVirksomhedNavnStruktur() {
                return virksomhedNavnStruktur;
            }

            /**
             * Sets the value of the virksomhedNavnStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedNavnStrukturType }
             *     
             */
            public void setVirksomhedNavnStruktur(VirksomhedNavnStrukturType value) {
                this.virksomhedNavnStruktur = value;
            }

            /**
             * Gets the value of the virksomhedAdresseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedAdresseStrukturType }
             *     
             */
            public VirksomhedAdresseStrukturType getVirksomhedAdresseStruktur() {
                return virksomhedAdresseStruktur;
            }

            /**
             * Sets the value of the virksomhedAdresseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedAdresseStrukturType }
             *     
             */
            public void setVirksomhedAdresseStruktur(VirksomhedAdresseStrukturType value) {
                this.virksomhedAdresseStruktur = value;
            }

        }

    }

}
