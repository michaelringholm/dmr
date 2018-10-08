
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VirksomhedNavnStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedNavnStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VirksomhedNavnSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VirksomhedNavn" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnFirmaNavn"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnFirmaNavnKort"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnGyldigFra"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnGyldigTil" minOccurs="0"/&gt;
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
@XmlType(name = "VirksomhedNavnStrukturType", propOrder = {
    "virksomhedNavnSamling"
})
public class VirksomhedNavnStrukturType {

    @XmlElement(name = "VirksomhedNavnSamling", required = true)
    protected VirksomhedNavnStrukturType.VirksomhedNavnSamling virksomhedNavnSamling;

    /**
     * Gets the value of the virksomhedNavnSamling property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedNavnStrukturType.VirksomhedNavnSamling }
     *     
     */
    public VirksomhedNavnStrukturType.VirksomhedNavnSamling getVirksomhedNavnSamling() {
        return virksomhedNavnSamling;
    }

    /**
     * Sets the value of the virksomhedNavnSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedNavnStrukturType.VirksomhedNavnSamling }
     *     
     */
    public void setVirksomhedNavnSamling(VirksomhedNavnStrukturType.VirksomhedNavnSamling value) {
        this.virksomhedNavnSamling = value;
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
     *         &lt;element name="VirksomhedNavn" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnFirmaNavn"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnFirmaNavnKort"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnGyldigFra"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnGyldigTil" minOccurs="0"/&gt;
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
        "virksomhedNavn"
    })
    public static class VirksomhedNavnSamling {

        @XmlElement(name = "VirksomhedNavn", required = true)
        protected List<VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn> virksomhedNavn;

        /**
         * Gets the value of the virksomhedNavn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virksomhedNavn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirksomhedNavn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn }
         * 
         * 
         */
        public List<VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn> getVirksomhedNavn() {
            if (virksomhedNavn == null) {
                virksomhedNavn = new ArrayList<VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn>();
            }
            return this.virksomhedNavn;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnFirmaNavn"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnFirmaNavnKort"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnGyldigFra"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}VirksomhedNavnGyldigTil" minOccurs="0"/&gt;
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
            "virksomhedNavnFirmaNavn",
            "virksomhedNavnFirmaNavnKort",
            "virksomhedNavnGyldigFra",
            "virksomhedNavnGyldigTil"
        })
        public static class VirksomhedNavn {

            @XmlElement(name = "VirksomhedNavnFirmaNavn", required = true)
            protected String virksomhedNavnFirmaNavn;
            @XmlElement(name = "VirksomhedNavnFirmaNavnKort", required = true)
            protected String virksomhedNavnFirmaNavnKort;
            @XmlElement(name = "VirksomhedNavnGyldigFra", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar virksomhedNavnGyldigFra;
            @XmlElement(name = "VirksomhedNavnGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar virksomhedNavnGyldigTil;

            /**
             * Gets the value of the virksomhedNavnFirmaNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVirksomhedNavnFirmaNavn() {
                return virksomhedNavnFirmaNavn;
            }

            /**
             * Sets the value of the virksomhedNavnFirmaNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVirksomhedNavnFirmaNavn(String value) {
                this.virksomhedNavnFirmaNavn = value;
            }

            /**
             * Gets the value of the virksomhedNavnFirmaNavnKort property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVirksomhedNavnFirmaNavnKort() {
                return virksomhedNavnFirmaNavnKort;
            }

            /**
             * Sets the value of the virksomhedNavnFirmaNavnKort property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVirksomhedNavnFirmaNavnKort(String value) {
                this.virksomhedNavnFirmaNavnKort = value;
            }

            /**
             * Gets the value of the virksomhedNavnGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVirksomhedNavnGyldigFra() {
                return virksomhedNavnGyldigFra;
            }

            /**
             * Sets the value of the virksomhedNavnGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVirksomhedNavnGyldigFra(XMLGregorianCalendar value) {
                this.virksomhedNavnGyldigFra = value;
            }

            /**
             * Gets the value of the virksomhedNavnGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVirksomhedNavnGyldigTil() {
                return virksomhedNavnGyldigTil;
            }

            /**
             * Sets the value of the virksomhedNavnGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVirksomhedNavnGyldigTil(XMLGregorianCalendar value) {
                this.virksomhedNavnGyldigTil = value;
            }

        }

    }

}
