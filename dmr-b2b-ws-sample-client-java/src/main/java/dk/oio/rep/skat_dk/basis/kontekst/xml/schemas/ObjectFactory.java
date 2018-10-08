
package dk.oio.rep.skat_dk.basis.kontekst.xml.schemas;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransaktionIdentifikator_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "TransaktionIdentifikator");
    private final static QName _FejlTekst_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "FejlTekst");
    private final static QName _AdvisTekst_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "AdvisTekst");
    private final static QName _FejlIdentifikator_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "FejlIdentifikator");
    private final static QName _AdvisIdentifikator_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "AdvisIdentifikator");
    private final static QName _AdvisStruktur_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "AdvisStruktur");
    private final static QName _FejlStruktur_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "FejlStruktur");
    private final static QName _SvarStruktur_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "SvarStruktur");
    private final static QName _TransaktionTid_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "TransaktionTid");
    private final static QName _ServiceIdentifikator_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "ServiceIdentifikator");
    private final static QName _HovedOplysningerSvar_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "HovedOplysningerSvar");
    private final static QName _HovedOplysninger_QNAME = new QName("http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", "HovedOplysninger");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdvisStrukturType }
     * 
     */
    public AdvisStrukturType createAdvisStrukturType() {
        return new AdvisStrukturType();
    }

    /**
     * Create an instance of {@link FejlStrukturType }
     * 
     */
    public FejlStrukturType createFejlStrukturType() {
        return new FejlStrukturType();
    }

    /**
     * Create an instance of {@link SvarStrukturType }
     * 
     */
    public SvarStrukturType createSvarStrukturType() {
        return new SvarStrukturType();
    }

    /**
     * Create an instance of {@link HovedOplysningerSvarType }
     * 
     */
    public HovedOplysningerSvarType createHovedOplysningerSvarType() {
        return new HovedOplysningerSvarType();
    }

    /**
     * Create an instance of {@link HovedOplysningerType }
     * 
     */
    public HovedOplysningerType createHovedOplysningerType() {
        return new HovedOplysningerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "TransaktionIdentifikator")
    public JAXBElement<String> createTransaktionIdentifikator(String value) {
        return new JAXBElement<String>(_TransaktionIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "FejlTekst")
    public JAXBElement<String> createFejlTekst(String value) {
        return new JAXBElement<String>(_FejlTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "AdvisTekst")
    public JAXBElement<String> createAdvisTekst(String value) {
        return new JAXBElement<String>(_AdvisTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "FejlIdentifikator")
    public JAXBElement<BigInteger> createFejlIdentifikator(BigInteger value) {
        return new JAXBElement<BigInteger>(_FejlIdentifikator_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "AdvisIdentifikator")
    public JAXBElement<BigInteger> createAdvisIdentifikator(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdvisIdentifikator_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvisStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "AdvisStruktur")
    public JAXBElement<AdvisStrukturType> createAdvisStruktur(AdvisStrukturType value) {
        return new JAXBElement<AdvisStrukturType>(_AdvisStruktur_QNAME, AdvisStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FejlStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "FejlStruktur")
    public JAXBElement<FejlStrukturType> createFejlStruktur(FejlStrukturType value) {
        return new JAXBElement<FejlStrukturType>(_FejlStruktur_QNAME, FejlStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvarStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "SvarStruktur")
    public JAXBElement<SvarStrukturType> createSvarStruktur(SvarStrukturType value) {
        return new JAXBElement<SvarStrukturType>(_SvarStruktur_QNAME, SvarStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "TransaktionTid")
    public JAXBElement<XMLGregorianCalendar> createTransaktionTid(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransaktionTid_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "ServiceIdentifikator")
    public JAXBElement<String> createServiceIdentifikator(String value) {
        return new JAXBElement<String>(_ServiceIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HovedOplysningerSvarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "HovedOplysningerSvar")
    public JAXBElement<HovedOplysningerSvarType> createHovedOplysningerSvar(HovedOplysningerSvarType value) {
        return new JAXBElement<HovedOplysningerSvarType>(_HovedOplysningerSvar_QNAME, HovedOplysningerSvarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HovedOplysningerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", name = "HovedOplysninger")
    public JAXBElement<HovedOplysningerType> createHovedOplysninger(HovedOplysningerType value) {
        return new JAXBElement<HovedOplysningerType>(_HovedOplysninger_QNAME, HovedOplysningerType.class, null, value);
    }

}
