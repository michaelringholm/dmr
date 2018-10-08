
package dk.skat.dmr.proxies;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.skat.dmr._2007._05._31 package. 
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

    private final static QName _NormTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "NormTypeNummer");
    private final static QName _NormTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "NormTypeNavn");
    private final static QName _NormTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "NormTypeStruktur");
    private final static QName _NormTypeSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "NormTypeSamlingStruktur");
    private final static QName _SupplerendeKarrosseriTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "SupplerendeKarrosseriTypeNummer");
    private final static QName _SupplerendeKarrosseriTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "SupplerendeKarrosseriTypeNavn");
    private final static QName _KoeretoejVariantTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejVariantTypeNummer");
    private final static QName _KoeretoejVariantTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejVariantTypeNavn");
    private final static QName _KoeretoejAnvendelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseNummer");
    private final static QName _KoeretoejAnvendelseNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseNavn");
    private final static QName _KoeretoejAnvendelseBeskrivelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseBeskrivelse");
    private final static QName _KoeretoejAnvendelseGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseGyldigFra");
    private final static QName _KoeretoejAnvendelseGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseGyldigTil");
    private final static QName _KoeretoejAnvendelseStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseStatus");
    private final static QName _KoeretoejAnvendelseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseStruktur");
    private final static QName _KoeretoejOplysningAkselAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningAkselAntal");
    private final static QName _KoeretoejOplysningTraekkendeAksler_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTraekkendeAksler");
    private final static QName _KoeretoejOplysningEgenVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningEgenVaegt");
    private final static QName _KoeretoejOplysningFaelgDaek_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningFaelgDaek");
    private final static QName _KoeretoejOplysningFoersteRegistreringDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningFoersteRegistreringDato");
    private final static QName _KoeretoejOplysningKommentar_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningKommentar");
    private final static QName _KoeretoejOplysningKoereklarVaegtMaksimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningKoereklarVaegtMaksimum");
    private final static QName _KoeretoejOplysningKoereklarVaegtMinimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningKoereklarVaegtMinimum");
    private final static QName _KoeretoejOplysningKoeretoejstand_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningKoeretoejstand");
    private final static QName _KoeretoejOplysningMaksimumHastighed_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningMaksimumHastighed");
    private final static QName _KoeretoejOplysningModelAar_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningModelAar");
    private final static QName _KoeretoejOplysningNCAPTest_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningNCAPTest");
    private final static QName _KoeretoejOplysningOprettetUdFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningOprettetUdFra");
    private final static QName _KoeretoejOplysningPassagerAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningPassagerAntal");
    private final static QName _KoeretoejOplysningPaahaengVognTotalVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningPaahaengVognTotalVaegt");
    private final static QName _KoeretoejOplysningSiddepladserMaksimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSiddepladserMaksimum");
    private final static QName _KoeretoejOplysningSiddepladserMinimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSiddepladserMinimum");
    private final static QName _KoeretoejOplysningSkammelBelastning_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSkammelBelastning");
    private final static QName _KoeretoejOplysningSkatteAkselAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSkatteAkselAntal");
    private final static QName _KoeretoejOplysningSkatteAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSkatteAkselTryk");
    private final static QName _KoeretoejOplysningStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStatus");
    private final static QName _KoeretoejOplysningStatusDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStatusDato");
    private final static QName _KoeretoejOplysningStelNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStelNummer");
    private final static QName _KoeretoejOplysningStelNummerAnbringelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStelNummerAnbringelse");
    private final static QName _KoeretoejOplysningStaapladserMaksimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStaapladserMaksimum");
    private final static QName _KoeretoejOplysningStaapladserMinimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStaapladserMinimum");
    private final static QName _KoeretoejOplysningStoersteAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStoersteAkselTryk");
    private final static QName _KoeretoejOplysningSaettevognTilladtAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSaettevognTilladtAkselTryk");
    private final static QName _KoeretoejOplysningTotalVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTotalVaegt");
    private final static QName _KoeretoejOplysningTekniskTotalVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTekniskTotalVaegt");
    private final static QName _KoeretoejOplysningTilkoblingMulighed_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTilkoblingMulighed");
    private final static QName _KoeretoejOplysningTilkoblingsvaegtUdenBremser_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTilkoblingsvaegtUdenBremser");
    private final static QName _KoeretoejOplysningTilkoblingsvaegtMedBremser_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTilkoblingsvaegtMedBremser");
    private final static QName _KoeretoejOplysningTilkobletSidevognStelnr_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTilkobletSidevognStelnr");
    private final static QName _KoeretoejOplysningTypeGodkendelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTypeGodkendelseNummer");
    private final static QName _KoeretoejOplysningVogntogVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningVogntogVaegt");
    private final static QName _KoeretoejOplysningVVaerdiLuft_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningVVaerdiLuft");
    private final static QName _KoeretoejOplysningVVaerdiMekanisk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningVVaerdiMekanisk");
    private final static QName _KoeretoejOplysningOevrigtUdstyr_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningOevrigtUdstyr");
    private final static QName _KoeretoejOplysning30PctVarevogn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysning30PctVarevogn");
    private final static QName _KoeretoejOplysningBlokvognAkselType_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognAkselType");
    private final static QName _KoeretoejOplysningBlokvognHovedboltTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognHovedboltTryk");
    private final static QName _KoeretoejOplysningBlokvognSkammelTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognSkammelTryk");
    private final static QName _KoeretoejOplysningBlokvognSamletAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognSamletAkselTryk");
    private final static QName _KoeretoejOplysningBlokvognMaxVogntog_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognMaxVogntog");
    private final static QName _KoeretoejOplysningBlokvognBreddeFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognBreddeFra");
    private final static QName _KoeretoejOplysningBlokvognKoblingshoejdeFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognKoblingshoejdeFra");
    private final static QName _KoeretoejOplysningBlokvognKoblingslaengdeFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognKoblingslaengdeFra");
    private final static QName _KoeretoejOplysningBlokvognSammenkoblingType_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognSammenkoblingType");
    private final static QName _KoeretoejOplysningBlokvognTilladeligHastighed_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognTilladeligHastighed");
    private final static QName _KoeretoejOplysningBlokvognBreddeTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognBreddeTil");
    private final static QName _KoeretoejOplysningBlokvognKoblingshoejdeTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognKoblingshoejdeTil");
    private final static QName _KoeretoejOplysningBlokvognKoblingslaengdeTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningBlokvognKoblingslaengdeTil");
    private final static QName _KoeretoejOplysningEgnetTilTaxi_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningEgnetTilTaxi");
    private final static QName _KoeretoejOplysningAkselAfstand_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningAkselAfstand");
    private final static QName _KoeretoejOplysningSporviddenForrest_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSporviddenForrest");
    private final static QName _KoeretoejOplysningSporviddenBagest_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningSporviddenBagest");
    private final static QName _KoeretoejOplysningTypeAnmeldelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTypeAnmeldelseNummer");
    private final static QName _KoeretoejOplysningEUVariant_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningEUVariant");
    private final static QName _KoeretoejOplysningEUVersion_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningEUVersion");
    private final static QName _KoeretoejOplysningTypegodkendtKategori_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTypegodkendtKategori");
    private final static QName _KoeretoejOplysningAntalGear_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningAntalGear");
    private final static QName _KoeretoejOplysningAntalDoere_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningAntalDoere");
    private final static QName _KoeretoejOplysningFabrikant_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningFabrikant");
    private final static QName _KoeretoejOplysningVejvenligLuftaffjedring_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningVejvenligLuftaffjedring");
    private final static QName _KoeretoejOplysningDanskGodkendelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningDanskGodkendelseNummer");
    private final static QName _KoeretoejOplysningAargang_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningAargang");
    private final static QName _KoeretoejOplysningIbrugtagningDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningIbrugtagningDato");
    private final static QName _KoeretoejOplysningTrafikskade_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningTrafikskade");
    private final static QName _KoeretoejOplysningVeteranKoeretoejOriginal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningVeteranKoeretoejOriginal");
    private final static QName _KarrosseriTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KarrosseriTypeNummer");
    private final static QName _KarrosseriTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KarrosseriTypeNavn");
    private final static QName _KarrosseriTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KarrosseriTypeStruktur");
    private final static QName _KarrosseriTypeSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KarrosseriTypeSamlingStruktur");
    private final static QName _KoeretoejErklaeringForetagneAendringer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejErklaeringForetagneAendringer");
    private final static QName _KoeretoejErklaeringNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejErklaeringNummer");
    private final static QName _KoeretoejErklaeringOprettetAfRolle_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejErklaeringOprettetAfRolle");
    private final static QName _KoeretoejErklaeringGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejErklaeringGyldigFra");
    private final static QName _KoeretoejErklaeringGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejErklaeringGyldigTil");
    private final static QName _KoeretoejRegistreringGrundlagGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagGyldigFra");
    private final static QName _KoeretoejRegistreringGrundlagGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagGyldigTil");
    private final static QName _KoeretoejRegistreringGrundlagIdent_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagIdent");
    private final static QName _KoeretoejRegistreringGrundlagKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagKode");
    private final static QName _KoeretoejRegistreringGrundlagStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagStatus");
    private final static QName _KoeretoejRegistreringGrundlagStatusDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagStatusDato");
    private final static QName _KoeretoejRegistreringGrundlagTilknyttetFasteProeveskilte_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagTilknyttetFasteProeveskilte");
    private final static QName _KoeretoejRegistreringGrundlagPeriodiskSyn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagPeriodiskSyn");
    private final static QName _KoeretoejRegistreringGrundlagPeriodiskSynGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagPeriodiskSynGyldigTil");
    private final static QName _PersonCPRNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonCPRNummer");
    private final static QName _PersonNavnAdresseBeskyttelseMarkering_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonNavnAdresseBeskyttelseMarkering");
    private final static QName _PersonFoedselDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonFoedselDato");
    private final static QName _PersonFoedeSted_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonFoedeSted");
    private final static QName _PersonFoedeLandKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonFoedeLandKode");
    private final static QName _PersonGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonGyldigFra");
    private final static QName _PersonGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonGyldigTil");
    private final static QName _PersonKoen_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonKoen");
    private final static QName _PersonNavnNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonNavnNavn");
    private final static QName _PersonNavnForNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonNavnForNavn");
    private final static QName _PersonNavnEfterNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonNavnEfterNavn");
    private final static QName _PersonNavnGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonNavnGyldigFra");
    private final static QName _PersonNavnGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonNavnGyldigTil");
    private final static QName _VirksomhedSENummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedSENummer");
    private final static QName _VirksomhedCVRNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedCVRNummer");
    private final static QName _VirksomhedStartDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedStartDato");
    private final static QName _VirksomhedOphoerDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedOphoerDato");
    private final static QName _ProduktionEnhedNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ProduktionEnhedNummer");
    private final static QName _ProduktionEnhedStartDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ProduktionEnhedStartDato");
    private final static QName _ProduktionEnhedOphoerDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ProduktionEnhedOphoerDato");
    private final static QName _ProduktionEnhedNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ProduktionEnhedNavn");
    private final static QName _AlternativKontaktID_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktID");
    private final static QName _AlternativKontaktNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktNavn");
    private final static QName _AlternativKontaktType_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktType");
    private final static QName _AlternativKontaktGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktGyldigFra");
    private final static QName _AlternativKontaktGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktGyldigTil");
    private final static QName _AlternativKontaktOprettetAfFagsystem_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktOprettetAfFagsystem");
    private final static QName _AlternativKontaktOprettetDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktOprettetDato");
    private final static QName _AlternativKontaktAendretDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktAendretDato");
    private final static QName _AlternativKontaktBemaerkning_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktBemaerkning");
    private final static QName _AlternativKontaktPersonFoedselDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktPersonFoedselDato");
    private final static QName _AlternativKontaktPersonKoen_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktPersonKoen");
    private final static QName _AlternativKontaktPersonNavnAdresseBeskyttelseMarkering_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativKontaktPersonNavnAdresseBeskyttelseMarkering");
    private final static QName _AdresseFortloebendeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseFortloebendeNummer");
    private final static QName _AdresseAnvendelseKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseAnvendelseKode");
    private final static QName _AdresseVejNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseVejNavn");
    private final static QName _AdresseVejKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseVejKode");
    private final static QName _AdresseFraHusNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseFraHusNummer");
    private final static QName _AdresseFraHusBogstav_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseFraHusBogstav");
    private final static QName _AdresseTilHusNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTilHusNummer");
    private final static QName _AdresseTilHusBogstav_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTilHusBogstav");
    private final static QName _AdresseLigeUlige_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseLigeUlige");
    private final static QName _AdresseLejlighedNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseLejlighedNummer");
    private final static QName _AdresseHusNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseHusNavn");
    private final static QName _AdresseEtage_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseEtage");
    private final static QName _AdresseEtageTekst_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseEtageTekst");
    private final static QName _AdresseSideDoerTekst_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseSideDoerTekst");
    private final static QName _AdresseCONavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseCONavn");
    private final static QName _AdressePostNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdressePostNummer");
    private final static QName _AdressePostDistrikt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdressePostDistrikt");
    private final static QName _AdresseLandsBy_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseLandsBy");
    private final static QName _AdresseByNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseByNavn");
    private final static QName _AdresseLandsDel_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseLandsDel");
    private final static QName _AdressePostBox_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdressePostBox");
    private final static QName _AdresseGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseGyldigFra");
    private final static QName _AdresseGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseGyldigTil");
    private final static QName _AdresseTypeKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTypeKode");
    private final static QName _AdresseTypeTekst_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTypeTekst");
    private final static QName _AdresseTypeBeskrivelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTypeBeskrivelse");
    private final static QName _AdresseTypeGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTypeGyldigFra");
    private final static QName _AdresseTypeGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseTypeGyldigTil");
    private final static QName _LandKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LandKode");
    private final static QName _LandNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LandNavn");
    private final static QName _LandNummerKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LandNummerKode");
    private final static QName _AdresseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AdresseStruktur");
    private final static QName _AlternativAdresseFortloebendeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseFortloebendeNummer");
    private final static QName _AlternativAdresseAnvendelseKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAnvendelseKode");
    private final static QName _AlternativAdresseAdresseLinie1_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie1");
    private final static QName _AlternativAdresseAdresseLinie2_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie2");
    private final static QName _AlternativAdresseAdresseLinie3_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie3");
    private final static QName _AlternativAdresseAdresseLinie4_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie4");
    private final static QName _AlternativAdresseAdresseLinie5_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie5");
    private final static QName _AlternativAdresseAdresseLinie6_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie6");
    private final static QName _AlternativAdresseAdresseLinie7_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseAdresseLinie7");
    private final static QName _AlternativAdresseGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseGyldigFra");
    private final static QName _AlternativAdresseGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseGyldigTil");
    private final static QName _AlternativAdresseReferenceNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseReferenceNummer");
    private final static QName _AlternativAdresseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "AlternativAdresseStruktur");
    private final static QName _PersonAdresseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PersonAdresseStruktur");
    private final static QName _VirksomhedNavnFirmaNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedNavnFirmaNavn");
    private final static QName _VirksomhedNavnFirmaNavnKort_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedNavnFirmaNavnKort");
    private final static QName _VirksomhedNavnGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedNavnGyldigFra");
    private final static QName _VirksomhedNavnGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedNavnGyldigTil");
    private final static QName _VirksomhedNavnStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedNavnStruktur");
    private final static QName _VirksomhedAdresseTypeKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseTypeKode");
    private final static QName _VirksomhedAdresseTypeTekst_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseTypeTekst");
    private final static QName _VirksomhedAdresseTypeBeskrivelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseTypeBeskrivelse");
    private final static QName _VirksomhedAdresseTypeLoebeNummerMarkering_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseTypeLoebeNummerMarkering");
    private final static QName _VirksomhedAdresseTypeGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseTypeGyldigFra");
    private final static QName _VirksomhedAdresseTypeGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseTypeGyldigTil");
    private final static QName _MyndighedNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "MyndighedNummer");
    private final static QName _VirksomhedAdresseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "VirksomhedAdresseStruktur");
    private final static QName _JuridiskEnhedStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "JuridiskEnhedStruktur");
    private final static QName _KoeretoejErklaeringStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejErklaeringStruktur");
    private final static QName _KoeretoejMotorCylinderAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorCylinderAntal");
    private final static QName _KoeretoejMotorKilometerstand_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorKilometerstand");
    private final static QName _KoeretoejMotorKilometerstandDokumentation_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorKilometerstandDokumentation");
    private final static QName _KoeretoejMotorKilometerstandIkkeTilgaengelig_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorKilometerstandIkkeTilgaengelig");
    private final static QName _KoeretoejMotorKmPerLiter_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorKmPerLiter");
    private final static QName _KoeretoejMotorKMPerLiterPreCalc_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorKMPerLiterPreCalc");
    private final static QName _KoeretoejMotorPlugInHybrid_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorPlugInHybrid");
    private final static QName _KoeretoejMotorKoerselStoej_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorKoerselStoej");
    private final static QName _KoeretoejMotorMaerkning_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorMaerkning");
    private final static QName _KoeretoejMotorSlagVolumen_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorSlagVolumen");
    private final static QName _KoeretoejMotorSlagVolumenIkkeTilgaengelig_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorSlagVolumenIkkeTilgaengelig");
    private final static QName _KoeretoejMotorStandStoej_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorStandStoej");
    private final static QName _KoeretoejMotorStandStoejOmdrejningstal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorStandStoejOmdrejningstal");
    private final static QName _KoeretoejMotorStoersteEffekt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorStoersteEffekt");
    private final static QName _KoeretoejMotorStoersteEffektIkkeTilgaengelig_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorStoersteEffektIkkeTilgaengelig");
    private final static QName _KoeretoejMotorInnovativTeknik_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorInnovativTeknik");
    private final static QName _KoeretoejMotorInnovativTeknikAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorInnovativTeknikAntal");
    private final static QName _KoeretoejMotorElektriskForbrug_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorElektriskForbrug");
    private final static QName _KoeretoejMotorFuelmode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorFuelmode");
    private final static QName _KoeretoejMiljoeOplysningCO2Udslip_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningCO2Udslip");
    private final static QName _KoeretoejMiljoeOplysningEmissionCO_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningEmissionCO");
    private final static QName _KoeretoejMiljoeOplysningEmissionHCPlusNOX_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningEmissionHCPlusNOX");
    private final static QName _KoeretoejMiljoeOplysningEmissionNOX_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningEmissionNOX");
    private final static QName _KoeretoejMiljoeOplysningPartikler_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningPartikler");
    private final static QName _KoeretoejMiljoeOplysningPartikelFilter_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningPartikelFilter");
    private final static QName _KoeretoejMiljoeOplysningRoegtaethed_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningRoegtaethed");
    private final static QName _KoeretoejMiljoeOplysningRoegtaethedOmdrejningstal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningRoegtaethedOmdrejningstal");
    private final static QName _KoeretoejMiljoeOplysningEftermonteretPartikelfilter_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningEftermonteretPartikelfilter");
    private final static QName _TypeAttestVariantAkselAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantAkselAntal");
    private final static QName _TypeAttestVariantTraekkendeAksler_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantTraekkendeAksler");
    private final static QName _TypeAttestVariantAntalDoere_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantAntalDoere");
    private final static QName _TypeAttestVariantAntalGear_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantAntalGear");
    private final static QName _TypeAttestVariantCO2Udslip_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantCO2Udslip");
    private final static QName _TypeAttestVariantCylinderAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantCylinderAntal");
    private final static QName _TypeAttestVariantEgenVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantEgenVaegt");
    private final static QName _TypeAttestVariantFaelgDaek_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantFaelgDaek");
    private final static QName _TypeAttestVariantKoerselStoej_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantKoerselStoej");
    private final static QName _TypeAttestVariantKoereklarVaegtMaksimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantKoereklarVaegtMaksimum");
    private final static QName _TypeAttestVariantKoereklarVaegtMinimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantKoereklarVaegtMinimum");
    private final static QName _TypeAttestVariantMaksimumHastighed_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantMaksimumHastighed");
    private final static QName _TypeAttestVariantMaerkning_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantMaerkning");
    private final static QName _TypeAttestVariantNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantNummer");
    private final static QName _TypeAttestVariantPartikelFilter_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantPartikelFilter");
    private final static QName _TypeAttestVariantPassagerAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantPassagerAntal");
    private final static QName _TypeAttestVariantRoegtaethed_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantRoegtaethed");
    private final static QName _TypeAttestVariantRoegtaethedOmdrejningstal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantRoegtaethedOmdrejningstal");
    private final static QName _TypeAttestVariantStandStoej_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStandStoej");
    private final static QName _TypeAttestVariantSiddepladserMinimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSiddepladserMinimum");
    private final static QName _TypeAttestVariantSiddepladserMaksimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSiddepladserMaksimum");
    private final static QName _TypeAttestVariantStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStatus");
    private final static QName _TypeAttestVariantStatusDatoTid_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStatusDatoTid");
    private final static QName _TypeAttestVariantStelNummerAnbringelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStelNummerAnbringelse");
    private final static QName _TypeAttestVariantStandStoejOmdrejningstal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStandStoejOmdrejningstal");
    private final static QName _TypeAttestVariantStoersteAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStoersteAkselTryk");
    private final static QName _TypeAttestVariantStaapladserMinimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStaapladserMinimum");
    private final static QName _TypeAttestVariantStaapladserMaksimum_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStaapladserMaksimum");
    private final static QName _TypeAttestVariantTekniskTotalVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantTekniskTotalVaegt");
    private final static QName _TypeAttestVariantTilkoblingsvaegtMedBremser_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantTilkoblingsvaegtMedBremser");
    private final static QName _TypeAttestVariantTilkoblingsvaegtUdenBremser_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantTilkoblingsvaegtUdenBremser");
    private final static QName _TypeAttestVariantTotalVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantTotalVaegt");
    private final static QName _TypeAttestVariantVVaerdiLuft_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantVVaerdiLuft");
    private final static QName _TypeAttestVariantVVaerdiMekanisk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantVVaerdiMekanisk");
    private final static QName _TypeAttestVariantEgnetTilTaxi_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantEgnetTilTaxi");
    private final static QName _TypeAttestVariantPartikler_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantPartikler");
    private final static QName _TypeAttestVariantKmPerLiter_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantKmPerLiter");
    private final static QName _TypeAttestVariantStoersteEffekt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStoersteEffekt");
    private final static QName _TypeAttestVariantInnovativTeknik_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantInnovativTeknik");
    private final static QName _TypeAttestVariantInnovativTeknikAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantInnovativTeknikAntal");
    private final static QName _TypeAttestVariantNCAPTest_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantNCAPTest");
    private final static QName _TypeAttestVariantSkammelBelastning_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSkammelBelastning");
    private final static QName _TypeAttestVariantSkatteAkselAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSkatteAkselAntal");
    private final static QName _TypeAttestVariantSkatteAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSkatteAkselTryk");
    private final static QName _TypeAttestVariantSaettevognTilladtAkselTryk_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSaettevognTilladtAkselTryk");
    private final static QName _TypeAttestVariantVogntogVaegt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantVogntogVaegt");
    private final static QName _TypeAttestVariantAkselAfstand_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantAkselAfstand");
    private final static QName _TypeAttestVariantSporviddenForrest_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSporviddenForrest");
    private final static QName _TypeAttestVariantSporviddenBagest_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSporviddenBagest");
    private final static QName _TypeAttestVariantSlagVolumen_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantSlagVolumen");
    private final static QName _TypeAttestVariantElektriskForbrug_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantElektriskForbrug");
    private final static QName _TypeAttestGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestGyldigFra");
    private final static QName _TypeAttestGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestGyldigTil");
    private final static QName _TypeAttestNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestNummer");
    private final static QName _TypeAttestTypeAnmeldelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestTypeAnmeldelseNummer");
    private final static QName _TypeAttestTypeGodkendelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestTypeGodkendelseNummer");
    private final static QName _FarveTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "FarveTypeNummer");
    private final static QName _FarveTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "FarveTypeNavn");
    private final static QName _FarveTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "FarveTypeStruktur");
    private final static QName _KoeretoejFarveStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejFarveStruktur");
    private final static QName _KoeretoejUdstyrAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrAntal");
    private final static QName _KoeretoejUdstyrTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeNummer");
    private final static QName _KoeretoejUdstyrTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeNavn");
    private final static QName _KoeretoejUdstyrTypeStandardAntal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeStandardAntal");
    private final static QName _KoeretoejUdstyrTypeVisesVedSyn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeVisesVedSyn");
    private final static QName _KoeretoejUdstyrTypeVisesVedForespoergsel_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeVisesVedForespoergsel");
    private final static QName _KoeretoejUdstyrTypeVisesVedStandardOprettelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeVisesVedStandardOprettelse");
    private final static QName _KoeretoejUdstyrTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeStruktur");
    private final static QName _KoeretoejUdstyrStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrStruktur");
    private final static QName _KoeretoejUdstyrSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrSamlingStruktur");
    private final static QName _PrisOplysningerMindsteBeskatningspris_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PrisOplysningerMindsteBeskatningspris");
    private final static QName _PrisOplysningerIndkoebsPris_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PrisOplysningerIndkoebsPris");
    private final static QName _PrisOplysningerStandardPris_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PrisOplysningerStandardPris");
    private final static QName _PrisOplysningerStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PrisOplysningerStruktur");
    private final static QName _KoeretoejSupplerendeKarrosseriTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejSupplerendeKarrosseriTypeStruktur");
    private final static QName _KoeretoejSupplerendeKarrosseriSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejSupplerendeKarrosseriSamlingStruktur");
    private final static QName _DispensationTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DispensationTypeNummer");
    private final static QName _DispensationTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DispensationTypeNavn");
    private final static QName _KoeretoejDispensationTypeKommentar_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejDispensationTypeKommentar");
    private final static QName _DispensationTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DispensationTypeStruktur");
    private final static QName _DispensationTypeSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DispensationTypeSamlingStruktur");
    private final static QName _KoeretoejMaerkeTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMaerkeTypeNummer");
    private final static QName _KoeretoejMaerkeTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMaerkeTypeNavn");
    private final static QName _FarveTypeSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "FarveTypeSamlingStruktur");
    private final static QName _RegistreringNummerIdent_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerIdent");
    private final static QName _RegistreringNummerAflangIndhold_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerAflangIndhold");
    private final static QName _RegistreringNummerGraensepladeDkDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerGraensepladeDkDato");
    private final static QName _RegistreringNummerKvadratiskIndhold1_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerKvadratiskIndhold1");
    private final static QName _RegistreringNummerKvadratiskIndhold2_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerKvadratiskIndhold2");
    private final static QName _RegistreringNummerNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerNummer");
    private final static QName _RegistreringNummerStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerStatus");
    private final static QName _RegistreringNummerStatusDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerStatusDato");
    private final static QName _RegistreringNummerType_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerType");
    private final static QName _RegistreringNummerUdloebDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerUdloebDato");
    private final static QName _RegistreringNummerFigurantPlade_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerFigurantPlade");
    private final static QName _KoeretoejModelTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejModelTypeNummer");
    private final static QName _KoeretoejModelTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejModelTypeNavn");
    private final static QName _KoeretoejTypeTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejTypeTypeNummer");
    private final static QName _KoeretoejTypeTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejTypeTypeNavn");
    private final static QName _KoeretoejArtNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtNummer");
    private final static QName _KoeretoejArtNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtNavn");
    private final static QName _KoeretoejArtKraeverForsikring_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtKraeverForsikring");
    private final static QName _KoeretoejArtBeskrivelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtBeskrivelse");
    private final static QName _KoeretoejArtGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtGyldigFra");
    private final static QName _KoeretoejArtGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtGyldigTil");
    private final static QName _KoeretoejArtStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtStatus");
    private final static QName _KoeretoejAnvendelseSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejAnvendelseSamlingStruktur");
    private final static QName _Kontekst_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "Kontekst");
    private final static QName _KompenserTrans_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KompenserTrans");
    private final static QName _KompenserTransSvar_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KompenserTransSvar");
    private final static QName _USKoeretoejAnvendelseListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejAnvendelseListeHentInterface");
    private final static QName _KoeretoejIdent_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejIdent");
    private final static QName _USUkompletKoeretoejOpretInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USUkompletKoeretoejOpretInterface");
    private final static QName _KoeretoejUdstyrTypeSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejUdstyrTypeSamlingStruktur");
    private final static QName _USKoeretoejUdstyrTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejUdstyrTypeListeHentInterface");
    private final static QName _KoeretoejBlokeringAarsagTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejBlokeringAarsagTypeNummer");
    private final static QName _KoeretoejBlokeringAarsagTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejBlokeringAarsagTypeNavn");
    private final static QName _KoeretoejBlokeringAarsagTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejBlokeringAarsagTypeStruktur");
    private final static QName _USKoeretoejBlokeringAarsagTypeListeHentFejlID_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejBlokeringAarsagTypeListeHent_FejlID");
    private final static QName _USKoeretoejBlokeringAarsagTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejBlokeringAarsagTypeListeHentInterface");
    private final static QName _KoeretoejBetegnelseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejBetegnelseStruktur");
    private final static QName _KoeretoejBetegnelseSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejBetegnelseSamlingStruktur");
    private final static QName _TilladelseGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseGyldigFra");
    private final static QName _TilladelseGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseGyldigTil");
    private final static QName _TilladelseKommentar_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseKommentar");
    private final static QName _TilladelseNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseNummer");
    private final static QName _TilladelseKunGodkendtForRegistreretEjer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseKunGodkendtForRegistreretEjer");
    private final static QName _TilladelseKombinationKoeretoejIdent_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseKombinationKoeretoejIdent");
    private final static QName _TilladelseTypeErPeriodeBegraenset_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseTypeErPeriodeBegraenset");
    private final static QName _TilladelseTypePeriodeLaengde_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseTypePeriodeLaengde");
    private final static QName _TilladelseTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseTypeNummer");
    private final static QName _TilladelseTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseTypeNavn");
    private final static QName _TilladelseTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseTypeStruktur");
    private final static QName _KoeretoejGenerelIdentifikatorStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejGenerelIdentifikatorStruktur");
    private final static QName _JuridiskEnhedIdentifikatorStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "JuridiskEnhedIdentifikatorStruktur");
    private final static QName _TilladelseStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseStruktur");
    private final static QName _DrivkraftTypeNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DrivkraftTypeNummer");
    private final static QName _DrivkraftTypeNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DrivkraftTypeNavn");
    private final static QName _DrivkraftTypeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DrivkraftTypeStruktur");
    private final static QName _DrivkraftTypeSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DrivkraftTypeSamlingStruktur");
    private final static QName _DatoTidSoegTidspunkt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DatoTidSoegTidspunkt");
    private final static QName _TypeAttestVariantStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestVariantStruktur");
    private final static QName _RegistreringNummerRettighedGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedGyldigFra");
    private final static QName _RegistreringNummerRettighedGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedGyldigTil");
    private final static QName _RegistreringNummerRettighedNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedNummer");
    private final static QName _RegistreringNummerRettighedSidstAdviseretDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedSidstAdviseretDato");
    private final static QName _RegistreringNummerRettighedType_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedType");
    private final static QName _RegistreringNummerRettighedKoerselFormaal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedKoerselFormaal");
    private final static QName _RegistreringNummerRettighedAntalFerieDageTilbage_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerRettighedAntalFerieDageTilbage");
    private final static QName _LeasingMaaneder_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingMaaneder");
    private final static QName _LeasingNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingNummer");
    private final static QName _LeasingGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingGyldigFra");
    private final static QName _LeasingGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingGyldigTil");
    private final static QName _LeasingReelOphoerDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingReelOphoerDato");
    private final static QName _LeasingKode_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingKode");
    private final static QName _LeasingStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingStatus");
    private final static QName _LeasingBemaerkning_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "LeasingBemaerkning");
    private final static QName _KoeretoejArtStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtStruktur");
    private final static QName _KoeretoejRegistreringGrundlagStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGrundlagStruktur");
    private final static QName _RegistreringNummerStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "RegistreringNummerStruktur");
    private final static QName _KoeretoejRegistreringGyldigFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGyldigFra");
    private final static QName _KoeretoejRegistreringGyldigTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringGyldigTil");
    private final static QName _KoeretoejRegistreringNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringNummer");
    private final static QName _KoeretoejRegistreringStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringStatus");
    private final static QName _KoeretoejRegistreringStatusDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringStatusDato");
    private final static QName _KoeretoejRegistreringStatusAarsag_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringStatusAarsag");
    private final static QName _KoeretoejRegistreringKontrolTal_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringKontrolTal");
    private final static QName _KoeretoejRegistreringSenesteHaendelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringSenesteHaendelse");
    private final static QName _KoeretoejRegistreringStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejRegistreringStruktur");
    private final static QName _EjerBrugerForholdForhold_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "EjerBrugerForholdForhold");
    private final static QName _EjerBrugerForholdPrimaer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "EjerBrugerForholdPrimaer");
    private final static QName _EjerBrugerForholdGrundStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "EjerBrugerForholdGrundStruktur");
    private final static QName _EjerBrugerSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "EjerBrugerSamlingStruktur");
    private final static QName _ForsikringSelskabNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringSelskabNummer");
    private final static QName _ForsikringSelskabNavn_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringSelskabNavn");
    private final static QName _ForsikringSelskabErMidlertidig_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringSelskabErMidlertidig");
    private final static QName _ForsikringSelskabIdentifikatorStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringSelskabIdentifikatorStruktur");
    private final static QName _ForsikringAfgangRegistreretDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringAfgangRegistreretDato");
    private final static QName _ForsikringBevisDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringBevisDato");
    private final static QName _ForsikringBevisNummer_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringBevisNummer");
    private final static QName _ForsikringIdent_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringIdent");
    private final static QName _ForsikringStatus_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringStatus");
    private final static QName _ForsikringStatusDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringStatusDato");
    private final static QName _ForsikringUdstedtDigitalt_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringUdstedtDigitalt");
    private final static QName _ForsikringUdstedtPapir_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringUdstedtPapir");
    private final static QName _ForsikringTilgangRegistreretDato_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringTilgangRegistreretDato");
    private final static QName _ForsikringErFejlhaandteret_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringErFejlhaandteret");
    private final static QName _ForsikringStatusAendringAarsag_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringStatusAendringAarsag");
    private final static QName _ForsikringStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "ForsikringStruktur");
    private final static QName _USKoeretoejRegistreringHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejRegistreringHentInterface");
    private final static QName _KoeretoejOplysningFrikoert_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningFrikoert");
    private final static QName _KoeretoejOplysningFredetForPladeInddragelse_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningFredetForPladeInddragelse");
    private final static QName _KoeretoejNormStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejNormStruktur");
    private final static QName _KoeretoejMiljoeOplysningStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMiljoeOplysningStruktur");
    private final static QName _KoeretoejMotorStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejMotorStruktur");
    private final static QName _KoeretoejBlokeringAarsagListeStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejBlokeringAarsagListeStruktur");
    private final static QName _KoeretoejOplysningStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejOplysningStruktur");
    private final static QName _TilladelseSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TilladelseSamlingStruktur");
    private final static QName _TypeAttestStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "TypeAttestStruktur");
    private final static QName _KoeretoejTekniskDataStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejTekniskDataStruktur");
    private final static QName _USKoeretoejArtAnvendelseListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejArtAnvendelseListeHentInterface");
    private final static QName _DatoTidSoegFra_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DatoTidSoegFra");
    private final static QName _DatoTidSoegTil_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "DatoTidSoegTil");
    private final static QName _PeriodeSoegStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "PeriodeSoegStruktur");
    private final static QName _USKoeretoejOprettelseAnnullerInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejOprettelseAnnullerInterface");
    private final static QName _USSupplerendeKarrosseriTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USSupplerendeKarrosseriTypeListeHentInterface");
    private final static QName _USKoeretoejCoCOpretInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejCoCOpretInterface");
    private final static QName _USKoeretoejBetegnelseHierarkiListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejBetegnelseHierarkiListeHentInterface");
    private final static QName _USTilladelseTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USTilladelseTypeListeHentInterface");
    private final static QName _USKoeretoejErklaeringOpretInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejErklaeringOpretInterface");
    private final static QName _KoeretoejArtSamlingStruktur_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "KoeretoejArtSamlingStruktur");
    private final static QName _USKoeretoejArtListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejArtListeHentInterface");
    private final static QName _USDrivkraftTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USDrivkraftTypeListeHentInterface");
    private final static QName _USFarveTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USFarveTypeListeHentInterface");
    private final static QName _USKoeretoejTekniskDataHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejTekniskDataHentInterface");
    private final static QName _USDispensationTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USDispensationTypeListeHentInterface");
    private final static QName _USKarrosseriTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKarrosseriTypeListeHentInterface");
    private final static QName _USKoeretoejTypeAttestOpretInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejTypeAttestOpretInterface");
    private final static QName _USKoeretoejBetegnelseOpretInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USKoeretoejBetegnelseOpretInterface");
    private final static QName _USNormTypeListeHentInterface_QNAME = new QName("http://skat.dk/dmr/2007/05/31/", "USNormTypeListeHentInterface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.skat.dmr._2007._05._31
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentOType }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentOType createUSSupplerendeKarrosseriTypeListeHentOType() {
        return new USSupplerendeKarrosseriTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejTypeAttestOpretIType }
     * 
     */
    public USKoeretoejTypeAttestOpretIType createUSKoeretoejTypeAttestOpretIType() {
        return new USKoeretoejTypeAttestOpretIType();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretIType }
     * 
     */
    public USUkompletKoeretoejOpretIType createUSUkompletKoeretoejOpretIType() {
        return new USUkompletKoeretoejOpretIType();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretOType }
     * 
     */
    public USUkompletKoeretoejOpretOType createUSUkompletKoeretoejOpretOType() {
        return new USUkompletKoeretoejOpretOType();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentOType }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentOType createUSKoeretoejBlokeringAarsagTypeListeHentOType() {
        return new USKoeretoejBlokeringAarsagTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentOType }
     * 
     */
    public USKoeretoejRegistreringHentOType createUSKoeretoejRegistreringHentOType() {
        return new USKoeretoejRegistreringHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentOType }
     * 
     */
    public USKoeretoejTekniskDataHentOType createUSKoeretoejTekniskDataHentOType() {
        return new USKoeretoejTekniskDataHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentOType }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentOType createUSKoeretoejArtAnvendelseListeHentOType() {
        return new USKoeretoejArtAnvendelseListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentIType }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentIType createUSKoeretoejBetegnelseHierarkiListeHentIType() {
        return new USKoeretoejBetegnelseHierarkiListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretIType }
     * 
     */
    public USKoeretoejCoCOpretIType createUSKoeretoejCoCOpretIType() {
        return new USKoeretoejCoCOpretIType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretIType }
     * 
     */
    public USKoeretoejBetegnelseOpretIType createUSKoeretoejBetegnelseOpretIType() {
        return new USKoeretoejBetegnelseOpretIType();
    }

    /**
     * Create an instance of {@link USTilladelseTypeListeHentOType }
     * 
     */
    public USTilladelseTypeListeHentOType createUSTilladelseTypeListeHentOType() {
        return new USTilladelseTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretIType }
     * 
     */
    public USKoeretoejErklaeringOpretIType createUSKoeretoejErklaeringOpretIType() {
        return new USKoeretoejErklaeringOpretIType();
    }

    /**
     * Create an instance of {@link KoeretoejArtSamlingStrukturType }
     * 
     */
    public KoeretoejArtSamlingStrukturType createKoeretoejArtSamlingStrukturType() {
        return new KoeretoejArtSamlingStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling }
     * 
     */
    public USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling createUSKoeretoejErklaeringOpretITypeKoeretoejErklaeringSamling() {
        return new USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretIType.Variant }
     * 
     */
    public USKoeretoejBetegnelseOpretIType.Variant createUSKoeretoejBetegnelseOpretITypeVariant() {
        return new USKoeretoejBetegnelseOpretIType.Variant();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretIType.TilladelseSamlingListe }
     * 
     */
    public USKoeretoejCoCOpretIType.TilladelseSamlingListe createUSKoeretoejCoCOpretITypeTilladelseSamlingListe() {
        return new USKoeretoejCoCOpretIType.TilladelseSamlingListe();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg createUSKoeretoejBetegnelseHierarkiListeHentITypeHierarkiValg() {
        return new USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe createUSKoeretoejArtAnvendelseListeHentOTypeKoeretoejArtAnvendelseListe() {
        return new USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe }
     * 
     */
    public USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe createUSKoeretoejTekniskDataHentOTypeKoeretoejTekniskDataListe() {
        return new USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe();
    }

    /**
     * Create an instance of {@link KoeretoejTekniskDataStrukturType }
     * 
     */
    public KoeretoejTekniskDataStrukturType createKoeretoejTekniskDataStrukturType() {
        return new KoeretoejTekniskDataStrukturType();
    }

    /**
     * Create an instance of {@link TypeAttestStrukturType }
     * 
     */
    public TypeAttestStrukturType createTypeAttestStrukturType() {
        return new TypeAttestStrukturType();
    }

    /**
     * Create an instance of {@link TilladelseSamlingStrukturType }
     * 
     */
    public TilladelseSamlingStrukturType createTilladelseSamlingStrukturType() {
        return new TilladelseSamlingStrukturType();
    }

    /**
     * Create an instance of {@link TilladelseSamlingStrukturType.TilladelseSamling }
     * 
     */
    public TilladelseSamlingStrukturType.TilladelseSamling createTilladelseSamlingStrukturTypeTilladelseSamling() {
        return new TilladelseSamlingStrukturType.TilladelseSamling();
    }

    /**
     * Create an instance of {@link KoeretoejOplysningStrukturType }
     * 
     */
    public KoeretoejOplysningStrukturType createKoeretoejOplysningStrukturType() {
        return new KoeretoejOplysningStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejBlokeringAarsagListeStrukturType }
     * 
     */
    public KoeretoejBlokeringAarsagListeStrukturType createKoeretoejBlokeringAarsagListeStrukturType() {
        return new KoeretoejBlokeringAarsagListeStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe }
     * 
     */
    public KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe createKoeretoejBlokeringAarsagListeStrukturTypeKoeretoejBlokeringAarsagListe() {
        return new KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentOType.Indhold }
     * 
     */
    public USKoeretoejRegistreringHentOType.Indhold createUSKoeretoejRegistreringHentOTypeIndhold() {
        return new USKoeretoejRegistreringHentOType.Indhold();
    }

    /**
     * Create an instance of {@link EjerBrugerSamlingStrukturType }
     * 
     */
    public EjerBrugerSamlingStrukturType createEjerBrugerSamlingStrukturType() {
        return new EjerBrugerSamlingStrukturType();
    }

    /**
     * Create an instance of {@link EjerBrugerSamlingStrukturType.EjerBrugerSamling }
     * 
     */
    public EjerBrugerSamlingStrukturType.EjerBrugerSamling createEjerBrugerSamlingStrukturTypeEjerBrugerSamling() {
        return new EjerBrugerSamlingStrukturType.EjerBrugerSamling();
    }

    /**
     * Create an instance of {@link DrivkraftTypeSamlingStrukturType }
     * 
     */
    public DrivkraftTypeSamlingStrukturType createDrivkraftTypeSamlingStrukturType() {
        return new DrivkraftTypeSamlingStrukturType();
    }

    /**
     * Create an instance of {@link TilladelseStrukturType }
     * 
     */
    public TilladelseStrukturType createTilladelseStrukturType() {
        return new TilladelseStrukturType();
    }

    /**
     * Create an instance of {@link TilladelseStrukturType.TilladelseTypeDetaljeValg }
     * 
     */
    public TilladelseStrukturType.TilladelseTypeDetaljeValg createTilladelseStrukturTypeTilladelseTypeDetaljeValg() {
        return new TilladelseStrukturType.TilladelseTypeDetaljeValg();
    }

    /**
     * Create an instance of {@link JuridiskEnhedIdentifikatorStrukturType }
     * 
     */
    public JuridiskEnhedIdentifikatorStrukturType createJuridiskEnhedIdentifikatorStrukturType() {
        return new JuridiskEnhedIdentifikatorStrukturType();
    }

    /**
     * Create an instance of {@link JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg }
     * 
     */
    public JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg createJuridiskEnhedIdentifikatorStrukturTypeJuridiskEnhedValg() {
        return new JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg();
    }

    /**
     * Create an instance of {@link KoeretoejGenerelIdentifikatorStrukturType }
     * 
     */
    public KoeretoejGenerelIdentifikatorStrukturType createKoeretoejGenerelIdentifikatorStrukturType() {
        return new KoeretoejGenerelIdentifikatorStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseSamlingStrukturType }
     * 
     */
    public KoeretoejBetegnelseSamlingStrukturType createKoeretoejBetegnelseSamlingStrukturType() {
        return new KoeretoejBetegnelseSamlingStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling }
     * 
     */
    public KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling createKoeretoejBetegnelseSamlingStrukturTypeKoeretoejBetegnelseSamling() {
        return new KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseStrukturType }
     * 
     */
    public KoeretoejBetegnelseStrukturType createKoeretoejBetegnelseStrukturType() {
        return new KoeretoejBetegnelseStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejUdstyrTypeSamlingStrukturType }
     * 
     */
    public KoeretoejUdstyrTypeSamlingStrukturType createKoeretoejUdstyrTypeSamlingStrukturType() {
        return new KoeretoejUdstyrTypeSamlingStrukturType();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretIType.KoeretoejSamling }
     * 
     */
    public USUkompletKoeretoejOpretIType.KoeretoejSamling createUSUkompletKoeretoejOpretITypeKoeretoejSamling() {
        return new USUkompletKoeretoejOpretIType.KoeretoejSamling();
    }

    /**
     * Create an instance of {@link KoeretoejAnvendelseSamlingStrukturType }
     * 
     */
    public KoeretoejAnvendelseSamlingStrukturType createKoeretoejAnvendelseSamlingStrukturType() {
        return new KoeretoejAnvendelseSamlingStrukturType();
    }

    /**
     * Create an instance of {@link FarveTypeSamlingStrukturType }
     * 
     */
    public FarveTypeSamlingStrukturType createFarveTypeSamlingStrukturType() {
        return new FarveTypeSamlingStrukturType();
    }

    /**
     * Create an instance of {@link DispensationTypeSamlingStrukturType }
     * 
     */
    public DispensationTypeSamlingStrukturType createDispensationTypeSamlingStrukturType() {
        return new DispensationTypeSamlingStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType }
     * 
     */
    public KoeretoejSupplerendeKarrosseriSamlingStrukturType createKoeretoejSupplerendeKarrosseriSamlingStrukturType() {
        return new KoeretoejSupplerendeKarrosseriSamlingStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejUdstyrSamlingStrukturType }
     * 
     */
    public KoeretoejUdstyrSamlingStrukturType createKoeretoejUdstyrSamlingStrukturType() {
        return new KoeretoejUdstyrSamlingStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejErklaeringStrukturType }
     * 
     */
    public KoeretoejErklaeringStrukturType createKoeretoejErklaeringStrukturType() {
        return new KoeretoejErklaeringStrukturType();
    }

    /**
     * Create an instance of {@link JuridiskEnhedStrukturType }
     * 
     */
    public JuridiskEnhedStrukturType createJuridiskEnhedStrukturType() {
        return new JuridiskEnhedStrukturType();
    }

    /**
     * Create an instance of {@link JuridiskEnhedStrukturType.JuridiskEnhedValg }
     * 
     */
    public JuridiskEnhedStrukturType.JuridiskEnhedValg createJuridiskEnhedStrukturTypeJuridiskEnhedValg() {
        return new JuridiskEnhedStrukturType.JuridiskEnhedValg();
    }

    /**
     * Create an instance of {@link VirksomhedAdresseStrukturType }
     * 
     */
    public VirksomhedAdresseStrukturType createVirksomhedAdresseStrukturType() {
        return new VirksomhedAdresseStrukturType();
    }

    /**
     * Create an instance of {@link VirksomhedAdresseStrukturType.AdresseValg }
     * 
     */
    public VirksomhedAdresseStrukturType.AdresseValg createVirksomhedAdresseStrukturTypeAdresseValg() {
        return new VirksomhedAdresseStrukturType.AdresseValg();
    }

    /**
     * Create an instance of {@link VirksomhedNavnStrukturType }
     * 
     */
    public VirksomhedNavnStrukturType createVirksomhedNavnStrukturType() {
        return new VirksomhedNavnStrukturType();
    }

    /**
     * Create an instance of {@link VirksomhedNavnStrukturType.VirksomhedNavnSamling }
     * 
     */
    public VirksomhedNavnStrukturType.VirksomhedNavnSamling createVirksomhedNavnStrukturTypeVirksomhedNavnSamling() {
        return new VirksomhedNavnStrukturType.VirksomhedNavnSamling();
    }

    /**
     * Create an instance of {@link PersonAdresseStrukturType }
     * 
     */
    public PersonAdresseStrukturType createPersonAdresseStrukturType() {
        return new PersonAdresseStrukturType();
    }

    /**
     * Create an instance of {@link AlternativAdresseStrukturType }
     * 
     */
    public AlternativAdresseStrukturType createAlternativAdresseStrukturType() {
        return new AlternativAdresseStrukturType();
    }

    /**
     * Create an instance of {@link AdresseStrukturType }
     * 
     */
    public AdresseStrukturType createAdresseStrukturType() {
        return new AdresseStrukturType();
    }

    /**
     * Create an instance of {@link KarrosseriTypeSamlingStrukturType }
     * 
     */
    public KarrosseriTypeSamlingStrukturType createKarrosseriTypeSamlingStrukturType() {
        return new KarrosseriTypeSamlingStrukturType();
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling createUSSupplerendeKarrosseriTypeListeHentOTypeSupplerendeKarrosseriTypeSamling() {
        return new USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling();
    }

    /**
     * Create an instance of {@link NormTypeSamlingStrukturType }
     * 
     */
    public NormTypeSamlingStrukturType createNormTypeSamlingStrukturType() {
        return new NormTypeSamlingStrukturType();
    }

    /**
     * Create an instance of {@link NormTypeStrukturType }
     * 
     */
    public NormTypeStrukturType createNormTypeStrukturType() {
        return new NormTypeStrukturType();
    }

    /**
     * Create an instance of {@link USNormTypeListeHentO }
     * 
     */
    public USNormTypeListeHentO createUSNormTypeListeHentO() {
        return new USNormTypeListeHentO();
    }

    /**
     * Create an instance of {@link USNormTypeListeHentOType }
     * 
     */
    public USNormTypeListeHentOType createUSNormTypeListeHentOType() {
        return new USNormTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentO }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentO createUSSupplerendeKarrosseriTypeListeHentO() {
        return new USSupplerendeKarrosseriTypeListeHentO();
    }

    /**
     * Create an instance of {@link KoeretoejAnvendelseStrukturType }
     * 
     */
    public KoeretoejAnvendelseStrukturType createKoeretoejAnvendelseStrukturType() {
        return new KoeretoejAnvendelseStrukturType();
    }

    /**
     * Create an instance of {@link USTilladelseTypeListeHentI }
     * 
     */
    public USTilladelseTypeListeHentI createUSTilladelseTypeListeHentI() {
        return new USTilladelseTypeListeHentI();
    }

    /**
     * Create an instance of {@link USTilladelseTypeListeHentIType }
     * 
     */
    public USTilladelseTypeListeHentIType createUSTilladelseTypeListeHentIType() {
        return new USTilladelseTypeListeHentIType();
    }

    /**
     * Create an instance of {@link KarrosseriTypeStrukturType }
     * 
     */
    public KarrosseriTypeStrukturType createKarrosseriTypeStrukturType() {
        return new KarrosseriTypeStrukturType();
    }

    /**
     * Create an instance of {@link USKarrosseriTypeListeHentO }
     * 
     */
    public USKarrosseriTypeListeHentO createUSKarrosseriTypeListeHentO() {
        return new USKarrosseriTypeListeHentO();
    }

    /**
     * Create an instance of {@link USKarrosseriTypeListeHentOType }
     * 
     */
    public USKarrosseriTypeListeHentOType createUSKarrosseriTypeListeHentOType() {
        return new USKarrosseriTypeListeHentOType();
    }

    /**
     * Create an instance of {@link FarveTypeStrukturType }
     * 
     */
    public FarveTypeStrukturType createFarveTypeStrukturType() {
        return new FarveTypeStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejFarveStrukturType }
     * 
     */
    public KoeretoejFarveStrukturType createKoeretoejFarveStrukturType() {
        return new KoeretoejFarveStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejUdstyrTypeStrukturType }
     * 
     */
    public KoeretoejUdstyrTypeStrukturType createKoeretoejUdstyrTypeStrukturType() {
        return new KoeretoejUdstyrTypeStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejUdstyrStrukturType }
     * 
     */
    public KoeretoejUdstyrStrukturType createKoeretoejUdstyrStrukturType() {
        return new KoeretoejUdstyrStrukturType();
    }

    /**
     * Create an instance of {@link PrisOplysningerStrukturType }
     * 
     */
    public PrisOplysningerStrukturType createPrisOplysningerStrukturType() {
        return new PrisOplysningerStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejSupplerendeKarrosseriTypeStrukturType }
     * 
     */
    public KoeretoejSupplerendeKarrosseriTypeStrukturType createKoeretoejSupplerendeKarrosseriTypeStrukturType() {
        return new KoeretoejSupplerendeKarrosseriTypeStrukturType();
    }

    /**
     * Create an instance of {@link DispensationTypeStrukturType }
     * 
     */
    public DispensationTypeStrukturType createDispensationTypeStrukturType() {
        return new DispensationTypeStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejTypeAttestOpretI }
     * 
     */
    public USKoeretoejTypeAttestOpretI createUSKoeretoejTypeAttestOpretI() {
        return new USKoeretoejTypeAttestOpretI();
    }

    /**
     * Create an instance of {@link USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest }
     * 
     */
    public USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest createUSKoeretoejTypeAttestOpretITypeTypeGodkendelseAttest() {
        return new USKoeretoejTypeAttestOpretIType.TypeGodkendelseAttest();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentI }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentI createUSKoeretoejArtAnvendelseListeHentI() {
        return new USKoeretoejArtAnvendelseListeHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentIType }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentIType createUSKoeretoejArtAnvendelseListeHentIType() {
        return new USKoeretoejArtAnvendelseListeHentIType();
    }

    /**
     * Create an instance of {@link USDrivkraftTypeListeHentI }
     * 
     */
    public USDrivkraftTypeListeHentI createUSDrivkraftTypeListeHentI() {
        return new USDrivkraftTypeListeHentI();
    }

    /**
     * Create an instance of {@link USDrivkraftTypeListeHentIType }
     * 
     */
    public USDrivkraftTypeListeHentIType createUSDrivkraftTypeListeHentIType() {
        return new USDrivkraftTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USFarveTypeListeHentO }
     * 
     */
    public USFarveTypeListeHentO createUSFarveTypeListeHentO() {
        return new USFarveTypeListeHentO();
    }

    /**
     * Create an instance of {@link USFarveTypeListeHentOType }
     * 
     */
    public USFarveTypeListeHentOType createUSFarveTypeListeHentOType() {
        return new USFarveTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretO }
     * 
     */
    public USKoeretoejBetegnelseOpretO createUSKoeretoejBetegnelseOpretO() {
        return new USKoeretoejBetegnelseOpretO();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretOType }
     * 
     */
    public USKoeretoejBetegnelseOpretOType createUSKoeretoejBetegnelseOpretOType() {
        return new USKoeretoejBetegnelseOpretOType();
    }

    /**
     * Create an instance of {@link USKoeretoejAnvendelseListeHentI }
     * 
     */
    public USKoeretoejAnvendelseListeHentI createUSKoeretoejAnvendelseListeHentI() {
        return new USKoeretoejAnvendelseListeHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejAnvendelseListeHentIType }
     * 
     */
    public USKoeretoejAnvendelseListeHentIType createUSKoeretoejAnvendelseListeHentIType() {
        return new USKoeretoejAnvendelseListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejAnvendelseListeHentO }
     * 
     */
    public USKoeretoejAnvendelseListeHentO createUSKoeretoejAnvendelseListeHentO() {
        return new USKoeretoejAnvendelseListeHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejAnvendelseListeHentOType }
     * 
     */
    public USKoeretoejAnvendelseListeHentOType createUSKoeretoejAnvendelseListeHentOType() {
        return new USKoeretoejAnvendelseListeHentOType();
    }

    /**
     * Create an instance of {@link KontekstType }
     * 
     */
    public KontekstType createKontekstType() {
        return new KontekstType();
    }

    /**
     * Create an instance of {@link KompenserTransType }
     * 
     */
    public KompenserTransType createKompenserTransType() {
        return new KompenserTransType();
    }

    /**
     * Create an instance of {@link KompenserTransSvarType }
     * 
     */
    public KompenserTransSvarType createKompenserTransSvarType() {
        return new KompenserTransSvarType();
    }

    /**
     * Create an instance of {@link USKoeretoejAnvendelseListeHentInterfaceType }
     * 
     */
    public USKoeretoejAnvendelseListeHentInterfaceType createUSKoeretoejAnvendelseListeHentInterfaceType() {
        return new USKoeretoejAnvendelseListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretI }
     * 
     */
    public USUkompletKoeretoejOpretI createUSUkompletKoeretoejOpretI() {
        return new USUkompletKoeretoejOpretI();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretO }
     * 
     */
    public USUkompletKoeretoejOpretO createUSUkompletKoeretoejOpretO() {
        return new USUkompletKoeretoejOpretO();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretOType.KoeretoejSamling }
     * 
     */
    public USUkompletKoeretoejOpretOType.KoeretoejSamling createUSUkompletKoeretoejOpretOTypeKoeretoejSamling() {
        return new USUkompletKoeretoejOpretOType.KoeretoejSamling();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretInterfaceType }
     * 
     */
    public USUkompletKoeretoejOpretInterfaceType createUSUkompletKoeretoejOpretInterfaceType() {
        return new USUkompletKoeretoejOpretInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejUdstyrTypeListeHentI }
     * 
     */
    public USKoeretoejUdstyrTypeListeHentI createUSKoeretoejUdstyrTypeListeHentI() {
        return new USKoeretoejUdstyrTypeListeHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejUdstyrTypeListeHentIType }
     * 
     */
    public USKoeretoejUdstyrTypeListeHentIType createUSKoeretoejUdstyrTypeListeHentIType() {
        return new USKoeretoejUdstyrTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejUdstyrTypeListeHentO }
     * 
     */
    public USKoeretoejUdstyrTypeListeHentO createUSKoeretoejUdstyrTypeListeHentO() {
        return new USKoeretoejUdstyrTypeListeHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejUdstyrTypeListeHentOType }
     * 
     */
    public USKoeretoejUdstyrTypeListeHentOType createUSKoeretoejUdstyrTypeListeHentOType() {
        return new USKoeretoejUdstyrTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejUdstyrTypeListeHentInterfaceType }
     * 
     */
    public USKoeretoejUdstyrTypeListeHentInterfaceType createUSKoeretoejUdstyrTypeListeHentInterfaceType() {
        return new USKoeretoejUdstyrTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentI }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentI createUSKoeretoejBlokeringAarsagTypeListeHentI() {
        return new USKoeretoejBlokeringAarsagTypeListeHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentIType }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentIType createUSKoeretoejBlokeringAarsagTypeListeHentIType() {
        return new USKoeretoejBlokeringAarsagTypeListeHentIType();
    }

    /**
     * Create an instance of {@link KoeretoejBlokeringAarsagTypeStrukturType }
     * 
     */
    public KoeretoejBlokeringAarsagTypeStrukturType createKoeretoejBlokeringAarsagTypeStrukturType() {
        return new KoeretoejBlokeringAarsagTypeStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentO }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentO createUSKoeretoejBlokeringAarsagTypeListeHentO() {
        return new USKoeretoejBlokeringAarsagTypeListeHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling createUSKoeretoejBlokeringAarsagTypeListeHentOTypeKoeretoejBlokeringAarsagTypeSamling() {
        return new USKoeretoejBlokeringAarsagTypeListeHentOType.KoeretoejBlokeringAarsagTypeSamling();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentFejlIDType }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentFejlIDType createUSKoeretoejBlokeringAarsagTypeListeHentFejlIDType() {
        return new USKoeretoejBlokeringAarsagTypeListeHentFejlIDType();
    }

    /**
     * Create an instance of {@link USKoeretoejBlokeringAarsagTypeListeHentInterfaceType }
     * 
     */
    public USKoeretoejBlokeringAarsagTypeListeHentInterfaceType createUSKoeretoejBlokeringAarsagTypeListeHentInterfaceType() {
        return new USKoeretoejBlokeringAarsagTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link TilladelseTypeStrukturType }
     * 
     */
    public TilladelseTypeStrukturType createTilladelseTypeStrukturType() {
        return new TilladelseTypeStrukturType();
    }

    /**
     * Create an instance of {@link DrivkraftTypeStrukturType }
     * 
     */
    public DrivkraftTypeStrukturType createDrivkraftTypeStrukturType() {
        return new DrivkraftTypeStrukturType();
    }

    /**
     * Create an instance of {@link USDrivkraftTypeListeHentO }
     * 
     */
    public USDrivkraftTypeListeHentO createUSDrivkraftTypeListeHentO() {
        return new USDrivkraftTypeListeHentO();
    }

    /**
     * Create an instance of {@link USDrivkraftTypeListeHentOType }
     * 
     */
    public USDrivkraftTypeListeHentOType createUSDrivkraftTypeListeHentOType() {
        return new USDrivkraftTypeListeHentOType();
    }

    /**
     * Create an instance of {@link TypeAttestVariantStrukturType }
     * 
     */
    public TypeAttestVariantStrukturType createTypeAttestVariantStrukturType() {
        return new TypeAttestVariantStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentI }
     * 
     */
    public USKoeretoejRegistreringHentI createUSKoeretoejRegistreringHentI() {
        return new USKoeretoejRegistreringHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentIType }
     * 
     */
    public USKoeretoejRegistreringHentIType createUSKoeretoejRegistreringHentIType() {
        return new USKoeretoejRegistreringHentIType();
    }

    /**
     * Create an instance of {@link KoeretoejArtStrukturType }
     * 
     */
    public KoeretoejArtStrukturType createKoeretoejArtStrukturType() {
        return new KoeretoejArtStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejRegistreringGrundlagStrukturType }
     * 
     */
    public KoeretoejRegistreringGrundlagStrukturType createKoeretoejRegistreringGrundlagStrukturType() {
        return new KoeretoejRegistreringGrundlagStrukturType();
    }

    /**
     * Create an instance of {@link RegistreringNummerStrukturType }
     * 
     */
    public RegistreringNummerStrukturType createRegistreringNummerStrukturType() {
        return new RegistreringNummerStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejRegistreringStrukturType }
     * 
     */
    public KoeretoejRegistreringStrukturType createKoeretoejRegistreringStrukturType() {
        return new KoeretoejRegistreringStrukturType();
    }

    /**
     * Create an instance of {@link EjerBrugerForholdGrundStrukturType }
     * 
     */
    public EjerBrugerForholdGrundStrukturType createEjerBrugerForholdGrundStrukturType() {
        return new EjerBrugerForholdGrundStrukturType();
    }

    /**
     * Create an instance of {@link ForsikringSelskabIdentifikatorStrukturType }
     * 
     */
    public ForsikringSelskabIdentifikatorStrukturType createForsikringSelskabIdentifikatorStrukturType() {
        return new ForsikringSelskabIdentifikatorStrukturType();
    }

    /**
     * Create an instance of {@link ForsikringStrukturType }
     * 
     */
    public ForsikringStrukturType createForsikringStrukturType() {
        return new ForsikringStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentO }
     * 
     */
    public USKoeretoejRegistreringHentO createUSKoeretoejRegistreringHentO() {
        return new USKoeretoejRegistreringHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentInterfaceType }
     * 
     */
    public USKoeretoejRegistreringHentInterfaceType createUSKoeretoejRegistreringHentInterfaceType() {
        return new USKoeretoejRegistreringHentInterfaceType();
    }

    /**
     * Create an instance of {@link KoeretoejNormStrukturType }
     * 
     */
    public KoeretoejNormStrukturType createKoeretoejNormStrukturType() {
        return new KoeretoejNormStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejMiljoeOplysningStrukturType }
     * 
     */
    public KoeretoejMiljoeOplysningStrukturType createKoeretoejMiljoeOplysningStrukturType() {
        return new KoeretoejMiljoeOplysningStrukturType();
    }

    /**
     * Create an instance of {@link KoeretoejMotorStrukturType }
     * 
     */
    public KoeretoejMotorStrukturType createKoeretoejMotorStrukturType() {
        return new KoeretoejMotorStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentO }
     * 
     */
    public USKoeretoejTekniskDataHentO createUSKoeretoejTekniskDataHentO() {
        return new USKoeretoejTekniskDataHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentO }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentO createUSKoeretoejArtAnvendelseListeHentO() {
        return new USKoeretoejArtAnvendelseListeHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentInterfaceType }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentInterfaceType createUSKoeretoejArtAnvendelseListeHentInterfaceType() {
        return new USKoeretoejArtAnvendelseListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link PeriodeSoegStrukturType }
     * 
     */
    public PeriodeSoegStrukturType createPeriodeSoegStrukturType() {
        return new PeriodeSoegStrukturType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentI }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentI createUSKoeretoejBetegnelseHierarkiListeHentI() {
        return new USKoeretoejBetegnelseHierarkiListeHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretO }
     * 
     */
    public USKoeretoejCoCOpretO createUSKoeretoejCoCOpretO() {
        return new USKoeretoejCoCOpretO();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretOType }
     * 
     */
    public USKoeretoejCoCOpretOType createUSKoeretoejCoCOpretOType() {
        return new USKoeretoejCoCOpretOType();
    }

    /**
     * Create an instance of {@link USDispensationTypeListeHentO }
     * 
     */
    public USDispensationTypeListeHentO createUSDispensationTypeListeHentO() {
        return new USDispensationTypeListeHentO();
    }

    /**
     * Create an instance of {@link USDispensationTypeListeHentOType }
     * 
     */
    public USDispensationTypeListeHentOType createUSDispensationTypeListeHentOType() {
        return new USDispensationTypeListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejOprettelseAnnullerI }
     * 
     */
    public USKoeretoejOprettelseAnnullerI createUSKoeretoejOprettelseAnnullerI() {
        return new USKoeretoejOprettelseAnnullerI();
    }

    /**
     * Create an instance of {@link USKoeretoejOprettelseAnnullerIType }
     * 
     */
    public USKoeretoejOprettelseAnnullerIType createUSKoeretoejOprettelseAnnullerIType() {
        return new USKoeretoejOprettelseAnnullerIType();
    }

    /**
     * Create an instance of {@link USKoeretoejOprettelseAnnullerO }
     * 
     */
    public USKoeretoejOprettelseAnnullerO createUSKoeretoejOprettelseAnnullerO() {
        return new USKoeretoejOprettelseAnnullerO();
    }

    /**
     * Create an instance of {@link USKoeretoejOprettelseAnnullerOType }
     * 
     */
    public USKoeretoejOprettelseAnnullerOType createUSKoeretoejOprettelseAnnullerOType() {
        return new USKoeretoejOprettelseAnnullerOType();
    }

    /**
     * Create an instance of {@link USKoeretoejOprettelseAnnullerInterfaceType }
     * 
     */
    public USKoeretoejOprettelseAnnullerInterfaceType createUSKoeretoejOprettelseAnnullerInterfaceType() {
        return new USKoeretoejOprettelseAnnullerInterfaceType();
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentI }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentI createUSSupplerendeKarrosseriTypeListeHentI() {
        return new USSupplerendeKarrosseriTypeListeHentI();
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentIType }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentIType createUSSupplerendeKarrosseriTypeListeHentIType() {
        return new USSupplerendeKarrosseriTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentInterfaceType }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentInterfaceType createUSSupplerendeKarrosseriTypeListeHentInterfaceType() {
        return new USSupplerendeKarrosseriTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretI }
     * 
     */
    public USKoeretoejCoCOpretI createUSKoeretoejCoCOpretI() {
        return new USKoeretoejCoCOpretI();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretI }
     * 
     */
    public USKoeretoejBetegnelseOpretI createUSKoeretoejBetegnelseOpretI() {
        return new USKoeretoejBetegnelseOpretI();
    }

    /**
     * Create an instance of {@link USKarrosseriTypeListeHentI }
     * 
     */
    public USKarrosseriTypeListeHentI createUSKarrosseriTypeListeHentI() {
        return new USKarrosseriTypeListeHentI();
    }

    /**
     * Create an instance of {@link USKarrosseriTypeListeHentIType }
     * 
     */
    public USKarrosseriTypeListeHentIType createUSKarrosseriTypeListeHentIType() {
        return new USKarrosseriTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretInterfaceType }
     * 
     */
    public USKoeretoejCoCOpretInterfaceType createUSKoeretoejCoCOpretInterfaceType() {
        return new USKoeretoejCoCOpretInterfaceType();
    }

    /**
     * Create an instance of {@link USFarveTypeListeHentI }
     * 
     */
    public USFarveTypeListeHentI createUSFarveTypeListeHentI() {
        return new USFarveTypeListeHentI();
    }

    /**
     * Create an instance of {@link USFarveTypeListeHentIType }
     * 
     */
    public USFarveTypeListeHentIType createUSFarveTypeListeHentIType() {
        return new USFarveTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentO }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentO createUSKoeretoejBetegnelseHierarkiListeHentO() {
        return new USKoeretoejBetegnelseHierarkiListeHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentOType }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentOType createUSKoeretoejBetegnelseHierarkiListeHentOType() {
        return new USKoeretoejBetegnelseHierarkiListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentInterfaceType }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentInterfaceType createUSKoeretoejBetegnelseHierarkiListeHentInterfaceType() {
        return new USKoeretoejBetegnelseHierarkiListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentI }
     * 
     */
    public USKoeretoejTekniskDataHentI createUSKoeretoejTekniskDataHentI() {
        return new USKoeretoejTekniskDataHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentIType }
     * 
     */
    public USKoeretoejTekniskDataHentIType createUSKoeretoejTekniskDataHentIType() {
        return new USKoeretoejTekniskDataHentIType();
    }

    /**
     * Create an instance of {@link USTilladelseTypeListeHentO }
     * 
     */
    public USTilladelseTypeListeHentO createUSTilladelseTypeListeHentO() {
        return new USTilladelseTypeListeHentO();
    }

    /**
     * Create an instance of {@link USTilladelseTypeListeHentOType.TilladelseTypeSamling }
     * 
     */
    public USTilladelseTypeListeHentOType.TilladelseTypeSamling createUSTilladelseTypeListeHentOTypeTilladelseTypeSamling() {
        return new USTilladelseTypeListeHentOType.TilladelseTypeSamling();
    }

    /**
     * Create an instance of {@link USTilladelseTypeListeHentInterfaceType }
     * 
     */
    public USTilladelseTypeListeHentInterfaceType createUSTilladelseTypeListeHentInterfaceType() {
        return new USTilladelseTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USDispensationTypeListeHentI }
     * 
     */
    public USDispensationTypeListeHentI createUSDispensationTypeListeHentI() {
        return new USDispensationTypeListeHentI();
    }

    /**
     * Create an instance of {@link USDispensationTypeListeHentIType }
     * 
     */
    public USDispensationTypeListeHentIType createUSDispensationTypeListeHentIType() {
        return new USDispensationTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretI }
     * 
     */
    public USKoeretoejErklaeringOpretI createUSKoeretoejErklaeringOpretI() {
        return new USKoeretoejErklaeringOpretI();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretO }
     * 
     */
    public USKoeretoejErklaeringOpretO createUSKoeretoejErklaeringOpretO() {
        return new USKoeretoejErklaeringOpretO();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretOType }
     * 
     */
    public USKoeretoejErklaeringOpretOType createUSKoeretoejErklaeringOpretOType() {
        return new USKoeretoejErklaeringOpretOType();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretInterfaceType }
     * 
     */
    public USKoeretoejErklaeringOpretInterfaceType createUSKoeretoejErklaeringOpretInterfaceType() {
        return new USKoeretoejErklaeringOpretInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejArtListeHentI }
     * 
     */
    public USKoeretoejArtListeHentI createUSKoeretoejArtListeHentI() {
        return new USKoeretoejArtListeHentI();
    }

    /**
     * Create an instance of {@link USKoeretoejArtListeHentIType }
     * 
     */
    public USKoeretoejArtListeHentIType createUSKoeretoejArtListeHentIType() {
        return new USKoeretoejArtListeHentIType();
    }

    /**
     * Create an instance of {@link USKoeretoejArtListeHentO }
     * 
     */
    public USKoeretoejArtListeHentO createUSKoeretoejArtListeHentO() {
        return new USKoeretoejArtListeHentO();
    }

    /**
     * Create an instance of {@link USKoeretoejArtListeHentOType }
     * 
     */
    public USKoeretoejArtListeHentOType createUSKoeretoejArtListeHentOType() {
        return new USKoeretoejArtListeHentOType();
    }

    /**
     * Create an instance of {@link USKoeretoejArtListeHentInterfaceType }
     * 
     */
    public USKoeretoejArtListeHentInterfaceType createUSKoeretoejArtListeHentInterfaceType() {
        return new USKoeretoejArtListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USDrivkraftTypeListeHentInterfaceType }
     * 
     */
    public USDrivkraftTypeListeHentInterfaceType createUSDrivkraftTypeListeHentInterfaceType() {
        return new USDrivkraftTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USFarveTypeListeHentInterfaceType }
     * 
     */
    public USFarveTypeListeHentInterfaceType createUSFarveTypeListeHentInterfaceType() {
        return new USFarveTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentInterfaceType }
     * 
     */
    public USKoeretoejTekniskDataHentInterfaceType createUSKoeretoejTekniskDataHentInterfaceType() {
        return new USKoeretoejTekniskDataHentInterfaceType();
    }

    /**
     * Create an instance of {@link USNormTypeListeHentI }
     * 
     */
    public USNormTypeListeHentI createUSNormTypeListeHentI() {
        return new USNormTypeListeHentI();
    }

    /**
     * Create an instance of {@link USNormTypeListeHentIType }
     * 
     */
    public USNormTypeListeHentIType createUSNormTypeListeHentIType() {
        return new USNormTypeListeHentIType();
    }

    /**
     * Create an instance of {@link USDispensationTypeListeHentInterfaceType }
     * 
     */
    public USDispensationTypeListeHentInterfaceType createUSDispensationTypeListeHentInterfaceType() {
        return new USDispensationTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejTypeAttestOpretO }
     * 
     */
    public USKoeretoejTypeAttestOpretO createUSKoeretoejTypeAttestOpretO() {
        return new USKoeretoejTypeAttestOpretO();
    }

    /**
     * Create an instance of {@link USKoeretoejTypeAttestOpretOType }
     * 
     */
    public USKoeretoejTypeAttestOpretOType createUSKoeretoejTypeAttestOpretOType() {
        return new USKoeretoejTypeAttestOpretOType();
    }

    /**
     * Create an instance of {@link USKarrosseriTypeListeHentInterfaceType }
     * 
     */
    public USKarrosseriTypeListeHentInterfaceType createUSKarrosseriTypeListeHentInterfaceType() {
        return new USKarrosseriTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejTypeAttestOpretInterfaceType }
     * 
     */
    public USKoeretoejTypeAttestOpretInterfaceType createUSKoeretoejTypeAttestOpretInterfaceType() {
        return new USKoeretoejTypeAttestOpretInterfaceType();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretInterfaceType }
     * 
     */
    public USKoeretoejBetegnelseOpretInterfaceType createUSKoeretoejBetegnelseOpretInterfaceType() {
        return new USKoeretoejBetegnelseOpretInterfaceType();
    }

    /**
     * Create an instance of {@link USNormTypeListeHentInterfaceType }
     * 
     */
    public USNormTypeListeHentInterfaceType createUSNormTypeListeHentInterfaceType() {
        return new USNormTypeListeHentInterfaceType();
    }

    /**
     * Create an instance of {@link KoeretoejArtSamlingStrukturType.KoeretoejArtSamling }
     * 
     */
    public KoeretoejArtSamlingStrukturType.KoeretoejArtSamling createKoeretoejArtSamlingStrukturTypeKoeretoejArtSamling() {
        return new KoeretoejArtSamlingStrukturType.KoeretoejArtSamling();
    }

    /**
     * Create an instance of {@link USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering }
     * 
     */
    public USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering createUSKoeretoejErklaeringOpretITypeKoeretoejErklaeringSamlingKoeretoejErklaering() {
        return new USKoeretoejErklaeringOpretIType.KoeretoejErklaeringSamling.KoeretoejErklaering();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseOpretIType.Variant.Type }
     * 
     */
    public USKoeretoejBetegnelseOpretIType.Variant.Type createUSKoeretoejBetegnelseOpretITypeVariantType() {
        return new USKoeretoejBetegnelseOpretIType.Variant.Type();
    }

    /**
     * Create an instance of {@link USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse }
     * 
     */
    public USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse createUSKoeretoejCoCOpretITypeTilladelseSamlingListeTilladelse() {
        return new USKoeretoejCoCOpretIType.TilladelseSamlingListe.Tilladelse();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke createUSKoeretoejBetegnelseHierarkiListeHentITypeHierarkiValgMaerke() {
        return new USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Maerke();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model createUSKoeretoejBetegnelseHierarkiListeHentITypeHierarkiValgModel() {
        return new USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Model();
    }

    /**
     * Create an instance of {@link USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant }
     * 
     */
    public USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant createUSKoeretoejBetegnelseHierarkiListeHentITypeHierarkiValgVariant() {
        return new USKoeretoejBetegnelseHierarkiListeHentIType.HierarkiValg.Variant();
    }

    /**
     * Create an instance of {@link USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse }
     * 
     */
    public USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse createUSKoeretoejArtAnvendelseListeHentOTypeKoeretoejArtAnvendelseListeKoeretoejArtAnvendelse() {
        return new USKoeretoejArtAnvendelseListeHentOType.KoeretoejArtAnvendelseListe.KoeretoejArtAnvendelse();
    }

    /**
     * Create an instance of {@link USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData }
     * 
     */
    public USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData createUSKoeretoejTekniskDataHentOTypeKoeretoejTekniskDataListeKoeretoejTekniskData() {
        return new USKoeretoejTekniskDataHentOType.KoeretoejTekniskDataListe.KoeretoejTekniskData();
    }

    /**
     * Create an instance of {@link KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag }
     * 
     */
    public KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag createKoeretoejTekniskDataStrukturTypeKoeretoejRegistreringGrundlag() {
        return new KoeretoejTekniskDataStrukturType.KoeretoejRegistreringGrundlag();
    }

    /**
     * Create an instance of {@link TypeAttestStrukturType.TypeAttestVariantListe }
     * 
     */
    public TypeAttestStrukturType.TypeAttestVariantListe createTypeAttestStrukturTypeTypeAttestVariantListe() {
        return new TypeAttestStrukturType.TypeAttestVariantListe();
    }

    /**
     * Create an instance of {@link TypeAttestStrukturType.TilladelseTypeListe }
     * 
     */
    public TypeAttestStrukturType.TilladelseTypeListe createTypeAttestStrukturTypeTilladelseTypeListe() {
        return new TypeAttestStrukturType.TilladelseTypeListe();
    }

    /**
     * Create an instance of {@link TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse }
     * 
     */
    public TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse createTilladelseSamlingStrukturTypeTilladelseSamlingTilladelse() {
        return new TilladelseSamlingStrukturType.TilladelseSamling.Tilladelse();
    }

    /**
     * Create an instance of {@link KoeretoejOplysningStrukturType.KoeretoejFastKombination }
     * 
     */
    public KoeretoejOplysningStrukturType.KoeretoejFastKombination createKoeretoejOplysningStrukturTypeKoeretoejFastKombination() {
        return new KoeretoejOplysningStrukturType.KoeretoejFastKombination();
    }

    /**
     * Create an instance of {@link KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag }
     * 
     */
    public KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag createKoeretoejBlokeringAarsagListeStrukturTypeKoeretoejBlokeringAarsagListeKoeretoejBlokeringAarsag() {
        return new KoeretoejBlokeringAarsagListeStrukturType.KoeretoejBlokeringAarsagListe.KoeretoejBlokeringAarsag();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat }
     * 
     */
    public USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat createUSKoeretoejRegistreringHentOTypeIndholdKoeretoejRegistreringGrundlagResultat() {
        return new USKoeretoejRegistreringHentOType.Indhold.KoeretoejRegistreringGrundlagResultat();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentOType.Indhold.Forsikring }
     * 
     */
    public USKoeretoejRegistreringHentOType.Indhold.Forsikring createUSKoeretoejRegistreringHentOTypeIndholdForsikring() {
        return new USKoeretoejRegistreringHentOType.Indhold.Forsikring();
    }

    /**
     * Create an instance of {@link USKoeretoejRegistreringHentOType.Indhold.Leasing }
     * 
     */
    public USKoeretoejRegistreringHentOType.Indhold.Leasing createUSKoeretoejRegistreringHentOTypeIndholdLeasing() {
        return new USKoeretoejRegistreringHentOType.Indhold.Leasing();
    }

    /**
     * Create an instance of {@link EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger }
     * 
     */
    public EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger createEjerBrugerSamlingStrukturTypeEjerBrugerSamlingEjerBruger() {
        return new EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger();
    }

    /**
     * Create an instance of {@link DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling }
     * 
     */
    public DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling createDrivkraftTypeSamlingStrukturTypeDrivkraftTypeSamling() {
        return new DrivkraftTypeSamlingStrukturType.DrivkraftTypeSamling();
    }

    /**
     * Create an instance of {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination }
     * 
     */
    public TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination createTilladelseStrukturTypeTilladelseTypeDetaljeValgVariabelKombination() {
        return new TilladelseStrukturType.TilladelseTypeDetaljeValg.VariabelKombination();
    }

    /**
     * Create an instance of {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling }
     * 
     */
    public TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling createTilladelseStrukturTypeTilladelseTypeDetaljeValgFastTilkobling() {
        return new TilladelseStrukturType.TilladelseTypeDetaljeValg.FastTilkobling();
    }

    /**
     * Create an instance of {@link TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed }
     * 
     */
    public TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed createTilladelseStrukturTypeTilladelseTypeDetaljeValgKunGodkendtForJuridiskEnhed() {
        return new TilladelseStrukturType.TilladelseTypeDetaljeValg.KunGodkendtForJuridiskEnhed();
    }

    /**
     * Create an instance of {@link JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR }
     * 
     */
    public JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR createJuridiskEnhedIdentifikatorStrukturTypeJuridiskEnhedValgPENummerCVR() {
        return new JuridiskEnhedIdentifikatorStrukturType.JuridiskEnhedValg.PENummerCVR();
    }

    /**
     * Create an instance of {@link KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg }
     * 
     */
    public KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg createKoeretoejGenerelIdentifikatorStrukturTypeKoeretoejGenerelIdentifikatorValg() {
        return new KoeretoejGenerelIdentifikatorStrukturType.KoeretoejGenerelIdentifikatorValg();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse }
     * 
     */
    public KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse createKoeretoejBetegnelseSamlingStrukturTypeKoeretoejBetegnelseSamlingKoeretoejBetegnelse() {
        return new KoeretoejBetegnelseSamlingStrukturType.KoeretoejBetegnelseSamling.KoeretoejBetegnelse();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseStrukturType.Model }
     * 
     */
    public KoeretoejBetegnelseStrukturType.Model createKoeretoejBetegnelseStrukturTypeModel() {
        return new KoeretoejBetegnelseStrukturType.Model();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseStrukturType.Variant }
     * 
     */
    public KoeretoejBetegnelseStrukturType.Variant createKoeretoejBetegnelseStrukturTypeVariant() {
        return new KoeretoejBetegnelseStrukturType.Variant();
    }

    /**
     * Create an instance of {@link KoeretoejBetegnelseStrukturType.Type }
     * 
     */
    public KoeretoejBetegnelseStrukturType.Type createKoeretoejBetegnelseStrukturTypeType() {
        return new KoeretoejBetegnelseStrukturType.Type();
    }

    /**
     * Create an instance of {@link KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling }
     * 
     */
    public KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling createKoeretoejUdstyrTypeSamlingStrukturTypeKoeretoejUdstyrTypeSamling() {
        return new KoeretoejUdstyrTypeSamlingStrukturType.KoeretoejUdstyrTypeSamling();
    }

    /**
     * Create an instance of {@link USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej }
     * 
     */
    public USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej createUSUkompletKoeretoejOpretITypeKoeretoejSamlingKoeretoej() {
        return new USUkompletKoeretoejOpretIType.KoeretoejSamling.Koeretoej();
    }

    /**
     * Create an instance of {@link KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling }
     * 
     */
    public KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling createKoeretoejAnvendelseSamlingStrukturTypeKoeretoejAnvendelseSamling() {
        return new KoeretoejAnvendelseSamlingStrukturType.KoeretoejAnvendelseSamling();
    }

    /**
     * Create an instance of {@link FarveTypeSamlingStrukturType.FarveTypeSamling }
     * 
     */
    public FarveTypeSamlingStrukturType.FarveTypeSamling createFarveTypeSamlingStrukturTypeFarveTypeSamling() {
        return new FarveTypeSamlingStrukturType.FarveTypeSamling();
    }

    /**
     * Create an instance of {@link DispensationTypeSamlingStrukturType.DispensationTypeSamling }
     * 
     */
    public DispensationTypeSamlingStrukturType.DispensationTypeSamling createDispensationTypeSamlingStrukturTypeDispensationTypeSamling() {
        return new DispensationTypeSamlingStrukturType.DispensationTypeSamling();
    }

    /**
     * Create an instance of {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling }
     * 
     */
    public KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling createKoeretoejSupplerendeKarrosseriSamlingStrukturTypeKoeretoejSupplerendeKarrosseriSamling() {
        return new KoeretoejSupplerendeKarrosseriSamlingStrukturType.KoeretoejSupplerendeKarrosseriSamling();
    }

    /**
     * Create an instance of {@link KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling }
     * 
     */
    public KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling createKoeretoejUdstyrSamlingStrukturTypeKoeretoejUdstyrSamling() {
        return new KoeretoejUdstyrSamlingStrukturType.KoeretoejUdstyrSamling();
    }

    /**
     * Create an instance of {@link KoeretoejErklaeringStrukturType.Forhandler }
     * 
     */
    public KoeretoejErklaeringStrukturType.Forhandler createKoeretoejErklaeringStrukturTypeForhandler() {
        return new KoeretoejErklaeringStrukturType.Forhandler();
    }

    /**
     * Create an instance of {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.Person }
     * 
     */
    public JuridiskEnhedStrukturType.JuridiskEnhedValg.Person createJuridiskEnhedStrukturTypeJuridiskEnhedValgPerson() {
        return new JuridiskEnhedStrukturType.JuridiskEnhedValg.Person();
    }

    /**
     * Create an instance of {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed }
     * 
     */
    public JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed createJuridiskEnhedStrukturTypeJuridiskEnhedValgVirksomhed() {
        return new JuridiskEnhedStrukturType.JuridiskEnhedValg.Virksomhed();
    }

    /**
     * Create an instance of {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson }
     * 
     */
    public JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson createJuridiskEnhedStrukturTypeJuridiskEnhedValgUdenlandskPerson() {
        return new JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskPerson();
    }

    /**
     * Create an instance of {@link JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed }
     * 
     */
    public JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed createJuridiskEnhedStrukturTypeJuridiskEnhedValgUdenlandskVirksomhed() {
        return new JuridiskEnhedStrukturType.JuridiskEnhedValg.UdenlandskVirksomhed();
    }

    /**
     * Create an instance of {@link VirksomhedAdresseStrukturType.AdresseValg.Adresse }
     * 
     */
    public VirksomhedAdresseStrukturType.AdresseValg.Adresse createVirksomhedAdresseStrukturTypeAdresseValgAdresse() {
        return new VirksomhedAdresseStrukturType.AdresseValg.Adresse();
    }

    /**
     * Create an instance of {@link VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse }
     * 
     */
    public VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse createVirksomhedAdresseStrukturTypeAdresseValgAlternativAdresse() {
        return new VirksomhedAdresseStrukturType.AdresseValg.AlternativAdresse();
    }

    /**
     * Create an instance of {@link VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn }
     * 
     */
    public VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn createVirksomhedNavnStrukturTypeVirksomhedNavnSamlingVirksomhedNavn() {
        return new VirksomhedNavnStrukturType.VirksomhedNavnSamling.VirksomhedNavn();
    }

    /**
     * Create an instance of {@link PersonAdresseStrukturType.Adresser }
     * 
     */
    public PersonAdresseStrukturType.Adresser createPersonAdresseStrukturTypeAdresser() {
        return new PersonAdresseStrukturType.Adresser();
    }

    /**
     * Create an instance of {@link PersonAdresseStrukturType.AlternativAdresser }
     * 
     */
    public PersonAdresseStrukturType.AlternativAdresser createPersonAdresseStrukturTypeAlternativAdresser() {
        return new PersonAdresseStrukturType.AlternativAdresser();
    }

    /**
     * Create an instance of {@link AlternativAdresseStrukturType.AlternativAdresse }
     * 
     */
    public AlternativAdresseStrukturType.AlternativAdresse createAlternativAdresseStrukturTypeAlternativAdresse() {
        return new AlternativAdresseStrukturType.AlternativAdresse();
    }

    /**
     * Create an instance of {@link AdresseStrukturType.Adresse }
     * 
     */
    public AdresseStrukturType.Adresse createAdresseStrukturTypeAdresse() {
        return new AdresseStrukturType.Adresse();
    }

    /**
     * Create an instance of {@link KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling }
     * 
     */
    public KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling createKarrosseriTypeSamlingStrukturTypeKarrosseriTypeSamling() {
        return new KarrosseriTypeSamlingStrukturType.KarrosseriTypeSamling();
    }

    /**
     * Create an instance of {@link USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType }
     * 
     */
    public USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType createUSSupplerendeKarrosseriTypeListeHentOTypeSupplerendeKarrosseriTypeSamlingSupplerendeKarrosseriType() {
        return new USSupplerendeKarrosseriTypeListeHentOType.SupplerendeKarrosseriTypeSamling.SupplerendeKarrosseriType();
    }

    /**
     * Create an instance of {@link NormTypeSamlingStrukturType.NormTypeSamling }
     * 
     */
    public NormTypeSamlingStrukturType.NormTypeSamling createNormTypeSamlingStrukturTypeNormTypeSamling() {
        return new NormTypeSamlingStrukturType.NormTypeSamling();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "NormTypeNummer")
    public JAXBElement<Long> createNormTypeNummer(Long value) {
        return new JAXBElement<Long>(_NormTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "NormTypeNavn")
    public JAXBElement<String> createNormTypeNavn(String value) {
        return new JAXBElement<String>(_NormTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "NormTypeStruktur")
    public JAXBElement<NormTypeStrukturType> createNormTypeStruktur(NormTypeStrukturType value) {
        return new JAXBElement<NormTypeStrukturType>(_NormTypeStruktur_QNAME, NormTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormTypeSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "NormTypeSamlingStruktur")
    public JAXBElement<NormTypeSamlingStrukturType> createNormTypeSamlingStruktur(NormTypeSamlingStrukturType value) {
        return new JAXBElement<NormTypeSamlingStrukturType>(_NormTypeSamlingStruktur_QNAME, NormTypeSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "SupplerendeKarrosseriTypeNummer")
    public JAXBElement<Long> createSupplerendeKarrosseriTypeNummer(Long value) {
        return new JAXBElement<Long>(_SupplerendeKarrosseriTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "SupplerendeKarrosseriTypeNavn")
    public JAXBElement<String> createSupplerendeKarrosseriTypeNavn(String value) {
        return new JAXBElement<String>(_SupplerendeKarrosseriTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejVariantTypeNummer")
    public JAXBElement<Long> createKoeretoejVariantTypeNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejVariantTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejVariantTypeNavn")
    public JAXBElement<String> createKoeretoejVariantTypeNavn(String value) {
        return new JAXBElement<String>(_KoeretoejVariantTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseNummer")
    public JAXBElement<Long> createKoeretoejAnvendelseNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejAnvendelseNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseNavn")
    public JAXBElement<String> createKoeretoejAnvendelseNavn(String value) {
        return new JAXBElement<String>(_KoeretoejAnvendelseNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseBeskrivelse")
    public JAXBElement<String> createKoeretoejAnvendelseBeskrivelse(String value) {
        return new JAXBElement<String>(_KoeretoejAnvendelseBeskrivelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejAnvendelseGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejAnvendelseGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejAnvendelseGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejAnvendelseGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForretningParameterVaerdiStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseStatus")
    public JAXBElement<ForretningParameterVaerdiStatusType> createKoeretoejAnvendelseStatus(ForretningParameterVaerdiStatusType value) {
        return new JAXBElement<ForretningParameterVaerdiStatusType>(_KoeretoejAnvendelseStatus_QNAME, ForretningParameterVaerdiStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejAnvendelseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseStruktur")
    public JAXBElement<KoeretoejAnvendelseStrukturType> createKoeretoejAnvendelseStruktur(KoeretoejAnvendelseStrukturType value) {
        return new JAXBElement<KoeretoejAnvendelseStrukturType>(_KoeretoejAnvendelseStruktur_QNAME, KoeretoejAnvendelseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningAkselAntal")
    public JAXBElement<Long> createKoeretoejOplysningAkselAntal(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningAkselAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTraekkendeAksler")
    public JAXBElement<String> createKoeretoejOplysningTraekkendeAksler(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningTraekkendeAksler_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningEgenVaegt")
    public JAXBElement<Long> createKoeretoejOplysningEgenVaegt(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningEgenVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningFaelgDaek")
    public JAXBElement<String> createKoeretoejOplysningFaelgDaek(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningFaelgDaek_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningFoersteRegistreringDato")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejOplysningFoersteRegistreringDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejOplysningFoersteRegistreringDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningKommentar")
    public JAXBElement<String> createKoeretoejOplysningKommentar(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningKommentar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningKoereklarVaegtMaksimum")
    public JAXBElement<Long> createKoeretoejOplysningKoereklarVaegtMaksimum(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningKoereklarVaegtMaksimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningKoereklarVaegtMinimum")
    public JAXBElement<Long> createKoeretoejOplysningKoereklarVaegtMinimum(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningKoereklarVaegtMinimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejstandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningKoeretoejstand")
    public JAXBElement<KoeretoejstandType> createKoeretoejOplysningKoeretoejstand(KoeretoejstandType value) {
        return new JAXBElement<KoeretoejstandType>(_KoeretoejOplysningKoeretoejstand_QNAME, KoeretoejstandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningMaksimumHastighed")
    public JAXBElement<Long> createKoeretoejOplysningMaksimumHastighed(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningMaksimumHastighed_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningModelAar")
    public JAXBElement<Integer> createKoeretoejOplysningModelAar(Integer value) {
        return new JAXBElement<Integer>(_KoeretoejOplysningModelAar_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningNCAPTest")
    public JAXBElement<Boolean> createKoeretoejOplysningNCAPTest(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningNCAPTest_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejOplysningOprettetUdFraType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningOprettetUdFra")
    public JAXBElement<KoeretoejOplysningOprettetUdFraType> createKoeretoejOplysningOprettetUdFra(KoeretoejOplysningOprettetUdFraType value) {
        return new JAXBElement<KoeretoejOplysningOprettetUdFraType>(_KoeretoejOplysningOprettetUdFra_QNAME, KoeretoejOplysningOprettetUdFraType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningPassagerAntal")
    public JAXBElement<Long> createKoeretoejOplysningPassagerAntal(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningPassagerAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningPaahaengVognTotalVaegt")
    public JAXBElement<Long> createKoeretoejOplysningPaahaengVognTotalVaegt(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningPaahaengVognTotalVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSiddepladserMaksimum")
    public JAXBElement<Long> createKoeretoejOplysningSiddepladserMaksimum(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSiddepladserMaksimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSiddepladserMinimum")
    public JAXBElement<Long> createKoeretoejOplysningSiddepladserMinimum(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSiddepladserMinimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSkammelBelastning")
    public JAXBElement<Long> createKoeretoejOplysningSkammelBelastning(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSkammelBelastning_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSkatteAkselAntal")
    public JAXBElement<Long> createKoeretoejOplysningSkatteAkselAntal(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSkatteAkselAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSkatteAkselTryk")
    public JAXBElement<Long> createKoeretoejOplysningSkatteAkselTryk(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSkatteAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejOplysningStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStatus")
    public JAXBElement<KoeretoejOplysningStatusType> createKoeretoejOplysningStatus(KoeretoejOplysningStatusType value) {
        return new JAXBElement<KoeretoejOplysningStatusType>(_KoeretoejOplysningStatus_QNAME, KoeretoejOplysningStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStatusDato")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejOplysningStatusDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejOplysningStatusDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStelNummer")
    public JAXBElement<String> createKoeretoejOplysningStelNummer(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningStelNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStelNummerAnbringelse")
    public JAXBElement<String> createKoeretoejOplysningStelNummerAnbringelse(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningStelNummerAnbringelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStaapladserMaksimum")
    public JAXBElement<Long> createKoeretoejOplysningStaapladserMaksimum(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningStaapladserMaksimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStaapladserMinimum")
    public JAXBElement<Long> createKoeretoejOplysningStaapladserMinimum(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningStaapladserMinimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStoersteAkselTryk")
    public JAXBElement<Long> createKoeretoejOplysningStoersteAkselTryk(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningStoersteAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSaettevognTilladtAkselTryk")
    public JAXBElement<Long> createKoeretoejOplysningSaettevognTilladtAkselTryk(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSaettevognTilladtAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTotalVaegt")
    public JAXBElement<Long> createKoeretoejOplysningTotalVaegt(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningTotalVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTekniskTotalVaegt")
    public JAXBElement<Long> createKoeretoejOplysningTekniskTotalVaegt(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningTekniskTotalVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTilkoblingMulighed")
    public JAXBElement<Boolean> createKoeretoejOplysningTilkoblingMulighed(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningTilkoblingMulighed_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTilkoblingsvaegtUdenBremser")
    public JAXBElement<Long> createKoeretoejOplysningTilkoblingsvaegtUdenBremser(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningTilkoblingsvaegtUdenBremser_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTilkoblingsvaegtMedBremser")
    public JAXBElement<Long> createKoeretoejOplysningTilkoblingsvaegtMedBremser(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningTilkoblingsvaegtMedBremser_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTilkobletSidevognStelnr")
    public JAXBElement<String> createKoeretoejOplysningTilkobletSidevognStelnr(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningTilkobletSidevognStelnr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTypeGodkendelseNummer")
    public JAXBElement<String> createKoeretoejOplysningTypeGodkendelseNummer(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningTypeGodkendelseNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningVogntogVaegt")
    public JAXBElement<Long> createKoeretoejOplysningVogntogVaegt(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningVogntogVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningVVaerdiLuft")
    public JAXBElement<Float> createKoeretoejOplysningVVaerdiLuft(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningVVaerdiLuft_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningVVaerdiMekanisk")
    public JAXBElement<Float> createKoeretoejOplysningVVaerdiMekanisk(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningVVaerdiMekanisk_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningOevrigtUdstyr")
    public JAXBElement<String> createKoeretoejOplysningOevrigtUdstyr(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningOevrigtUdstyr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysning30PctVarevogn")
    public JAXBElement<Boolean> createKoeretoejOplysning30PctVarevogn(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysning30PctVarevogn_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AkselTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognAkselType")
    public JAXBElement<AkselTypeType> createKoeretoejOplysningBlokvognAkselType(AkselTypeType value) {
        return new JAXBElement<AkselTypeType>(_KoeretoejOplysningBlokvognAkselType_QNAME, AkselTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognHovedboltTryk")
    public JAXBElement<Long> createKoeretoejOplysningBlokvognHovedboltTryk(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningBlokvognHovedboltTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognSkammelTryk")
    public JAXBElement<Long> createKoeretoejOplysningBlokvognSkammelTryk(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningBlokvognSkammelTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognSamletAkselTryk")
    public JAXBElement<Long> createKoeretoejOplysningBlokvognSamletAkselTryk(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningBlokvognSamletAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognMaxVogntog")
    public JAXBElement<Long> createKoeretoejOplysningBlokvognMaxVogntog(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningBlokvognMaxVogntog_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognBreddeFra")
    public JAXBElement<Float> createKoeretoejOplysningBlokvognBreddeFra(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningBlokvognBreddeFra_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognKoblingshoejdeFra")
    public JAXBElement<Float> createKoeretoejOplysningBlokvognKoblingshoejdeFra(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningBlokvognKoblingshoejdeFra_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognKoblingslaengdeFra")
    public JAXBElement<Float> createKoeretoejOplysningBlokvognKoblingslaengdeFra(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningBlokvognKoblingslaengdeFra_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognSammenkoblingType")
    public JAXBElement<String> createKoeretoejOplysningBlokvognSammenkoblingType(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningBlokvognSammenkoblingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognTilladeligHastighed")
    public JAXBElement<Long> createKoeretoejOplysningBlokvognTilladeligHastighed(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningBlokvognTilladeligHastighed_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognBreddeTil")
    public JAXBElement<Float> createKoeretoejOplysningBlokvognBreddeTil(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningBlokvognBreddeTil_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognKoblingshoejdeTil")
    public JAXBElement<Float> createKoeretoejOplysningBlokvognKoblingshoejdeTil(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningBlokvognKoblingshoejdeTil_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningBlokvognKoblingslaengdeTil")
    public JAXBElement<Float> createKoeretoejOplysningBlokvognKoblingslaengdeTil(Float value) {
        return new JAXBElement<Float>(_KoeretoejOplysningBlokvognKoblingslaengdeTil_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningEgnetTilTaxi")
    public JAXBElement<Boolean> createKoeretoejOplysningEgnetTilTaxi(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningEgnetTilTaxi_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningAkselAfstand")
    public JAXBElement<Long> createKoeretoejOplysningAkselAfstand(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningAkselAfstand_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSporviddenForrest")
    public JAXBElement<Long> createKoeretoejOplysningSporviddenForrest(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSporviddenForrest_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningSporviddenBagest")
    public JAXBElement<Long> createKoeretoejOplysningSporviddenBagest(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningSporviddenBagest_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTypeAnmeldelseNummer")
    public JAXBElement<String> createKoeretoejOplysningTypeAnmeldelseNummer(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningTypeAnmeldelseNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningEUVariant")
    public JAXBElement<String> createKoeretoejOplysningEUVariant(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningEUVariant_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningEUVersion")
    public JAXBElement<String> createKoeretoejOplysningEUVersion(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningEUVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTypegodkendtKategori")
    public JAXBElement<String> createKoeretoejOplysningTypegodkendtKategori(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningTypegodkendtKategori_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningAntalGear")
    public JAXBElement<Long> createKoeretoejOplysningAntalGear(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningAntalGear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningAntalDoere")
    public JAXBElement<Long> createKoeretoejOplysningAntalDoere(Long value) {
        return new JAXBElement<Long>(_KoeretoejOplysningAntalDoere_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningFabrikant")
    public JAXBElement<String> createKoeretoejOplysningFabrikant(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningFabrikant_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningVejvenligLuftaffjedring")
    public JAXBElement<Boolean> createKoeretoejOplysningVejvenligLuftaffjedring(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningVejvenligLuftaffjedring_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningDanskGodkendelseNummer")
    public JAXBElement<String> createKoeretoejOplysningDanskGodkendelseNummer(String value) {
        return new JAXBElement<String>(_KoeretoejOplysningDanskGodkendelseNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningAargang")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejOplysningAargang(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejOplysningAargang_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningIbrugtagningDato")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejOplysningIbrugtagningDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejOplysningIbrugtagningDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningTrafikskade")
    public JAXBElement<Boolean> createKoeretoejOplysningTrafikskade(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningTrafikskade_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningVeteranKoeretoejOriginal")
    public JAXBElement<Boolean> createKoeretoejOplysningVeteranKoeretoejOriginal(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningVeteranKoeretoejOriginal_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KarrosseriTypeNummer")
    public JAXBElement<Long> createKarrosseriTypeNummer(Long value) {
        return new JAXBElement<Long>(_KarrosseriTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KarrosseriTypeNavn")
    public JAXBElement<String> createKarrosseriTypeNavn(String value) {
        return new JAXBElement<String>(_KarrosseriTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KarrosseriTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KarrosseriTypeStruktur")
    public JAXBElement<KarrosseriTypeStrukturType> createKarrosseriTypeStruktur(KarrosseriTypeStrukturType value) {
        return new JAXBElement<KarrosseriTypeStrukturType>(_KarrosseriTypeStruktur_QNAME, KarrosseriTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KarrosseriTypeSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KarrosseriTypeSamlingStruktur")
    public JAXBElement<KarrosseriTypeSamlingStrukturType> createKarrosseriTypeSamlingStruktur(KarrosseriTypeSamlingStrukturType value) {
        return new JAXBElement<KarrosseriTypeSamlingStrukturType>(_KarrosseriTypeSamlingStruktur_QNAME, KarrosseriTypeSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejErklaeringForetagneAendringer")
    public JAXBElement<String> createKoeretoejErklaeringForetagneAendringer(String value) {
        return new JAXBElement<String>(_KoeretoejErklaeringForetagneAendringer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejErklaeringNummer")
    public JAXBElement<Long> createKoeretoejErklaeringNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejErklaeringNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejErklaeringOpretterRolleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejErklaeringOprettetAfRolle")
    public JAXBElement<KoeretoejErklaeringOpretterRolleType> createKoeretoejErklaeringOprettetAfRolle(KoeretoejErklaeringOpretterRolleType value) {
        return new JAXBElement<KoeretoejErklaeringOpretterRolleType>(_KoeretoejErklaeringOprettetAfRolle_QNAME, KoeretoejErklaeringOpretterRolleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejErklaeringGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejErklaeringGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejErklaeringGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejErklaeringGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejErklaeringGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejErklaeringGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringGrundlagGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringGrundlagGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringGrundlagGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringGrundlagGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagIdent")
    public JAXBElement<Long> createKoeretoejRegistreringGrundlagIdent(Long value) {
        return new JAXBElement<Long>(_KoeretoejRegistreringGrundlagIdent_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagKode")
    public JAXBElement<String> createKoeretoejRegistreringGrundlagKode(String value) {
        return new JAXBElement<String>(_KoeretoejRegistreringGrundlagKode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejRegistreringGrundlagStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagStatus")
    public JAXBElement<KoeretoejRegistreringGrundlagStatusType> createKoeretoejRegistreringGrundlagStatus(KoeretoejRegistreringGrundlagStatusType value) {
        return new JAXBElement<KoeretoejRegistreringGrundlagStatusType>(_KoeretoejRegistreringGrundlagStatus_QNAME, KoeretoejRegistreringGrundlagStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagStatusDato")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringGrundlagStatusDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringGrundlagStatusDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagTilknyttetFasteProeveskilte")
    public JAXBElement<Boolean> createKoeretoejRegistreringGrundlagTilknyttetFasteProeveskilte(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejRegistreringGrundlagTilknyttetFasteProeveskilte_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodiskSynTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagPeriodiskSyn")
    public JAXBElement<PeriodiskSynTypeType> createKoeretoejRegistreringGrundlagPeriodiskSyn(PeriodiskSynTypeType value) {
        return new JAXBElement<PeriodiskSynTypeType>(_KoeretoejRegistreringGrundlagPeriodiskSyn_QNAME, PeriodiskSynTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagPeriodiskSynGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringGrundlagPeriodiskSynGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringGrundlagPeriodiskSynGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonCPRNummer")
    public JAXBElement<String> createPersonCPRNummer(String value) {
        return new JAXBElement<String>(_PersonCPRNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonNavnAdresseBeskyttelseMarkering")
    public JAXBElement<Boolean> createPersonNavnAdresseBeskyttelseMarkering(Boolean value) {
        return new JAXBElement<Boolean>(_PersonNavnAdresseBeskyttelseMarkering_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonFoedselDato")
    public JAXBElement<XMLGregorianCalendar> createPersonFoedselDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonFoedselDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonFoedeSted")
    public JAXBElement<String> createPersonFoedeSted(String value) {
        return new JAXBElement<String>(_PersonFoedeSted_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonFoedeLandKode")
    public JAXBElement<String> createPersonFoedeLandKode(String value) {
        return new JAXBElement<String>(_PersonFoedeLandKode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createPersonGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createPersonGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonKoen")
    public JAXBElement<BigInteger> createPersonKoen(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonKoen_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonNavnNavn")
    public JAXBElement<String> createPersonNavnNavn(String value) {
        return new JAXBElement<String>(_PersonNavnNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonNavnForNavn")
    public JAXBElement<String> createPersonNavnForNavn(String value) {
        return new JAXBElement<String>(_PersonNavnForNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonNavnEfterNavn")
    public JAXBElement<String> createPersonNavnEfterNavn(String value) {
        return new JAXBElement<String>(_PersonNavnEfterNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonNavnGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createPersonNavnGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonNavnGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonNavnGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createPersonNavnGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonNavnGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedSENummer")
    public JAXBElement<BigInteger> createVirksomhedSENummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_VirksomhedSENummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedCVRNummer")
    public JAXBElement<String> createVirksomhedCVRNummer(String value) {
        return new JAXBElement<String>(_VirksomhedCVRNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedStartDato")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedStartDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedStartDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedOphoerDato")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedOphoerDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedOphoerDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ProduktionEnhedNummer")
    public JAXBElement<BigInteger> createProduktionEnhedNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_ProduktionEnhedNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ProduktionEnhedStartDato")
    public JAXBElement<XMLGregorianCalendar> createProduktionEnhedStartDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProduktionEnhedStartDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ProduktionEnhedOphoerDato")
    public JAXBElement<XMLGregorianCalendar> createProduktionEnhedOphoerDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProduktionEnhedOphoerDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ProduktionEnhedNavn")
    public JAXBElement<String> createProduktionEnhedNavn(String value) {
        return new JAXBElement<String>(_ProduktionEnhedNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktID")
    public JAXBElement<BigInteger> createAlternativKontaktID(BigInteger value) {
        return new JAXBElement<BigInteger>(_AlternativKontaktID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktNavn")
    public JAXBElement<String> createAlternativKontaktNavn(String value) {
        return new JAXBElement<String>(_AlternativKontaktNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternativKontaktTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktType")
    public JAXBElement<AlternativKontaktTypeType> createAlternativKontaktType(AlternativKontaktTypeType value) {
        return new JAXBElement<AlternativKontaktTypeType>(_AlternativKontaktType_QNAME, AlternativKontaktTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createAlternativKontaktGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativKontaktGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createAlternativKontaktGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativKontaktGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktOprettetAfFagsystem")
    public JAXBElement<String> createAlternativKontaktOprettetAfFagsystem(String value) {
        return new JAXBElement<String>(_AlternativKontaktOprettetAfFagsystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktOprettetDato")
    public JAXBElement<XMLGregorianCalendar> createAlternativKontaktOprettetDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativKontaktOprettetDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktAendretDato")
    public JAXBElement<XMLGregorianCalendar> createAlternativKontaktAendretDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativKontaktAendretDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktBemaerkning")
    public JAXBElement<String> createAlternativKontaktBemaerkning(String value) {
        return new JAXBElement<String>(_AlternativKontaktBemaerkning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktPersonFoedselDato")
    public JAXBElement<XMLGregorianCalendar> createAlternativKontaktPersonFoedselDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativKontaktPersonFoedselDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktPersonKoen")
    public JAXBElement<BigInteger> createAlternativKontaktPersonKoen(BigInteger value) {
        return new JAXBElement<BigInteger>(_AlternativKontaktPersonKoen_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativKontaktPersonNavnAdresseBeskyttelseMarkering")
    public JAXBElement<Boolean> createAlternativKontaktPersonNavnAdresseBeskyttelseMarkering(Boolean value) {
        return new JAXBElement<Boolean>(_AlternativKontaktPersonNavnAdresseBeskyttelseMarkering_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseFortloebendeNummer")
    public JAXBElement<BigInteger> createAdresseFortloebendeNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseFortloebendeNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseAnvendelseKode")
    public JAXBElement<BigInteger> createAdresseAnvendelseKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseAnvendelseKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseVejNavn")
    public JAXBElement<String> createAdresseVejNavn(String value) {
        return new JAXBElement<String>(_AdresseVejNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseVejKode")
    public JAXBElement<BigInteger> createAdresseVejKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseVejKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseFraHusNummer")
    public JAXBElement<BigInteger> createAdresseFraHusNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseFraHusNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseFraHusBogstav")
    public JAXBElement<String> createAdresseFraHusBogstav(String value) {
        return new JAXBElement<String>(_AdresseFraHusBogstav_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTilHusNummer")
    public JAXBElement<BigInteger> createAdresseTilHusNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseTilHusNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTilHusBogstav")
    public JAXBElement<String> createAdresseTilHusBogstav(String value) {
        return new JAXBElement<String>(_AdresseTilHusBogstav_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LigeUligeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseLigeUlige")
    public JAXBElement<LigeUligeType> createAdresseLigeUlige(LigeUligeType value) {
        return new JAXBElement<LigeUligeType>(_AdresseLigeUlige_QNAME, LigeUligeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseLejlighedNummer")
    public JAXBElement<BigInteger> createAdresseLejlighedNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseLejlighedNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseHusNavn")
    public JAXBElement<String> createAdresseHusNavn(String value) {
        return new JAXBElement<String>(_AdresseHusNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseEtage")
    public JAXBElement<String> createAdresseEtage(String value) {
        return new JAXBElement<String>(_AdresseEtage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseEtageTekst")
    public JAXBElement<String> createAdresseEtageTekst(String value) {
        return new JAXBElement<String>(_AdresseEtageTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseSideDoerTekst")
    public JAXBElement<String> createAdresseSideDoerTekst(String value) {
        return new JAXBElement<String>(_AdresseSideDoerTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseCONavn")
    public JAXBElement<String> createAdresseCONavn(String value) {
        return new JAXBElement<String>(_AdresseCONavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdressePostNummer")
    public JAXBElement<BigInteger> createAdressePostNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdressePostNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdressePostDistrikt")
    public JAXBElement<String> createAdressePostDistrikt(String value) {
        return new JAXBElement<String>(_AdressePostDistrikt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseLandsBy")
    public JAXBElement<String> createAdresseLandsBy(String value) {
        return new JAXBElement<String>(_AdresseLandsBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseByNavn")
    public JAXBElement<String> createAdresseByNavn(String value) {
        return new JAXBElement<String>(_AdresseByNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseLandsDel")
    public JAXBElement<String> createAdresseLandsDel(String value) {
        return new JAXBElement<String>(_AdresseLandsDel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdressePostBox")
    public JAXBElement<BigInteger> createAdressePostBox(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdressePostBox_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createAdresseGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdresseGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createAdresseGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdresseGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTypeKode")
    public JAXBElement<BigInteger> createAdresseTypeKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_AdresseTypeKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTypeTekst")
    public JAXBElement<String> createAdresseTypeTekst(String value) {
        return new JAXBElement<String>(_AdresseTypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTypeBeskrivelse")
    public JAXBElement<String> createAdresseTypeBeskrivelse(String value) {
        return new JAXBElement<String>(_AdresseTypeBeskrivelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTypeGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createAdresseTypeGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdresseTypeGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseTypeGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createAdresseTypeGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdresseTypeGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LandKode")
    public JAXBElement<String> createLandKode(String value) {
        return new JAXBElement<String>(_LandKode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LandNavn")
    public JAXBElement<String> createLandNavn(String value) {
        return new JAXBElement<String>(_LandNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LandNummerKode")
    public JAXBElement<BigInteger> createLandNummerKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_LandNummerKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AdresseStruktur")
    public JAXBElement<AdresseStrukturType> createAdresseStruktur(AdresseStrukturType value) {
        return new JAXBElement<AdresseStrukturType>(_AdresseStruktur_QNAME, AdresseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseFortloebendeNummer")
    public JAXBElement<BigInteger> createAlternativAdresseFortloebendeNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_AlternativAdresseFortloebendeNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAnvendelseKode")
    public JAXBElement<BigInteger> createAlternativAdresseAnvendelseKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_AlternativAdresseAnvendelseKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie1")
    public JAXBElement<String> createAlternativAdresseAdresseLinie1(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie2")
    public JAXBElement<String> createAlternativAdresseAdresseLinie2(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie3")
    public JAXBElement<String> createAlternativAdresseAdresseLinie3(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie4")
    public JAXBElement<String> createAlternativAdresseAdresseLinie4(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie5")
    public JAXBElement<String> createAlternativAdresseAdresseLinie5(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie5_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie6")
    public JAXBElement<String> createAlternativAdresseAdresseLinie6(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie6_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseAdresseLinie7")
    public JAXBElement<String> createAlternativAdresseAdresseLinie7(String value) {
        return new JAXBElement<String>(_AlternativAdresseAdresseLinie7_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createAlternativAdresseGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativAdresseGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createAlternativAdresseGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlternativAdresseGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseReferenceNummer")
    public JAXBElement<String> createAlternativAdresseReferenceNummer(String value) {
        return new JAXBElement<String>(_AlternativAdresseReferenceNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternativAdresseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "AlternativAdresseStruktur")
    public JAXBElement<AlternativAdresseStrukturType> createAlternativAdresseStruktur(AlternativAdresseStrukturType value) {
        return new JAXBElement<AlternativAdresseStrukturType>(_AlternativAdresseStruktur_QNAME, AlternativAdresseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonAdresseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PersonAdresseStruktur")
    public JAXBElement<PersonAdresseStrukturType> createPersonAdresseStruktur(PersonAdresseStrukturType value) {
        return new JAXBElement<PersonAdresseStrukturType>(_PersonAdresseStruktur_QNAME, PersonAdresseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedNavnFirmaNavn")
    public JAXBElement<String> createVirksomhedNavnFirmaNavn(String value) {
        return new JAXBElement<String>(_VirksomhedNavnFirmaNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedNavnFirmaNavnKort")
    public JAXBElement<String> createVirksomhedNavnFirmaNavnKort(String value) {
        return new JAXBElement<String>(_VirksomhedNavnFirmaNavnKort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedNavnGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedNavnGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedNavnGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedNavnGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedNavnGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedNavnGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirksomhedNavnStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedNavnStruktur")
    public JAXBElement<VirksomhedNavnStrukturType> createVirksomhedNavnStruktur(VirksomhedNavnStrukturType value) {
        return new JAXBElement<VirksomhedNavnStrukturType>(_VirksomhedNavnStruktur_QNAME, VirksomhedNavnStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseTypeKode")
    public JAXBElement<BigInteger> createVirksomhedAdresseTypeKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_VirksomhedAdresseTypeKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseTypeTekst")
    public JAXBElement<String> createVirksomhedAdresseTypeTekst(String value) {
        return new JAXBElement<String>(_VirksomhedAdresseTypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseTypeBeskrivelse")
    public JAXBElement<String> createVirksomhedAdresseTypeBeskrivelse(String value) {
        return new JAXBElement<String>(_VirksomhedAdresseTypeBeskrivelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseTypeLoebeNummerMarkering")
    public JAXBElement<Boolean> createVirksomhedAdresseTypeLoebeNummerMarkering(Boolean value) {
        return new JAXBElement<Boolean>(_VirksomhedAdresseTypeLoebeNummerMarkering_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseTypeGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedAdresseTypeGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedAdresseTypeGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseTypeGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedAdresseTypeGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedAdresseTypeGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "MyndighedNummer")
    public JAXBElement<BigInteger> createMyndighedNummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_MyndighedNummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirksomhedAdresseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "VirksomhedAdresseStruktur")
    public JAXBElement<VirksomhedAdresseStrukturType> createVirksomhedAdresseStruktur(VirksomhedAdresseStrukturType value) {
        return new JAXBElement<VirksomhedAdresseStrukturType>(_VirksomhedAdresseStruktur_QNAME, VirksomhedAdresseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuridiskEnhedStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "JuridiskEnhedStruktur")
    public JAXBElement<JuridiskEnhedStrukturType> createJuridiskEnhedStruktur(JuridiskEnhedStrukturType value) {
        return new JAXBElement<JuridiskEnhedStrukturType>(_JuridiskEnhedStruktur_QNAME, JuridiskEnhedStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejErklaeringStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejErklaeringStruktur")
    public JAXBElement<KoeretoejErklaeringStrukturType> createKoeretoejErklaeringStruktur(KoeretoejErklaeringStrukturType value) {
        return new JAXBElement<KoeretoejErklaeringStrukturType>(_KoeretoejErklaeringStruktur_QNAME, KoeretoejErklaeringStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorCylinderAntal")
    public JAXBElement<Long> createKoeretoejMotorCylinderAntal(Long value) {
        return new JAXBElement<Long>(_KoeretoejMotorCylinderAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorKilometerstand")
    public JAXBElement<Long> createKoeretoejMotorKilometerstand(Long value) {
        return new JAXBElement<Long>(_KoeretoejMotorKilometerstand_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorKilometerstandDokumentation")
    public JAXBElement<Boolean> createKoeretoejMotorKilometerstandDokumentation(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMotorKilometerstandDokumentation_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorKilometerstandIkkeTilgaengelig")
    public JAXBElement<Boolean> createKoeretoejMotorKilometerstandIkkeTilgaengelig(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMotorKilometerstandIkkeTilgaengelig_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorKmPerLiter")
    public JAXBElement<BigDecimal> createKoeretoejMotorKmPerLiter(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_KoeretoejMotorKmPerLiter_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorKMPerLiterPreCalc")
    public JAXBElement<Float> createKoeretoejMotorKMPerLiterPreCalc(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorKMPerLiterPreCalc_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorPlugInHybrid")
    public JAXBElement<Boolean> createKoeretoejMotorPlugInHybrid(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMotorPlugInHybrid_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorKoerselStoej")
    public JAXBElement<Float> createKoeretoejMotorKoerselStoej(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorKoerselStoej_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorMaerkning")
    public JAXBElement<String> createKoeretoejMotorMaerkning(String value) {
        return new JAXBElement<String>(_KoeretoejMotorMaerkning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorSlagVolumen")
    public JAXBElement<Float> createKoeretoejMotorSlagVolumen(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorSlagVolumen_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorSlagVolumenIkkeTilgaengelig")
    public JAXBElement<Boolean> createKoeretoejMotorSlagVolumenIkkeTilgaengelig(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMotorSlagVolumenIkkeTilgaengelig_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorStandStoej")
    public JAXBElement<Float> createKoeretoejMotorStandStoej(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorStandStoej_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorStandStoejOmdrejningstal")
    public JAXBElement<Long> createKoeretoejMotorStandStoejOmdrejningstal(Long value) {
        return new JAXBElement<Long>(_KoeretoejMotorStandStoejOmdrejningstal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorStoersteEffekt")
    public JAXBElement<Float> createKoeretoejMotorStoersteEffekt(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorStoersteEffekt_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorStoersteEffektIkkeTilgaengelig")
    public JAXBElement<Boolean> createKoeretoejMotorStoersteEffektIkkeTilgaengelig(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMotorStoersteEffektIkkeTilgaengelig_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorInnovativTeknik")
    public JAXBElement<Boolean> createKoeretoejMotorInnovativTeknik(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMotorInnovativTeknik_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorInnovativTeknikAntal")
    public JAXBElement<Float> createKoeretoejMotorInnovativTeknikAntal(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorInnovativTeknikAntal_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorElektriskForbrug")
    public JAXBElement<Float> createKoeretoejMotorElektriskForbrug(Float value) {
        return new JAXBElement<Float>(_KoeretoejMotorElektriskForbrug_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuelmodeTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorFuelmode")
    public JAXBElement<FuelmodeTypeType> createKoeretoejMotorFuelmode(FuelmodeTypeType value) {
        return new JAXBElement<FuelmodeTypeType>(_KoeretoejMotorFuelmode_QNAME, FuelmodeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningCO2Udslip")
    public JAXBElement<Float> createKoeretoejMiljoeOplysningCO2Udslip(Float value) {
        return new JAXBElement<Float>(_KoeretoejMiljoeOplysningCO2Udslip_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningEmissionCO")
    public JAXBElement<Float> createKoeretoejMiljoeOplysningEmissionCO(Float value) {
        return new JAXBElement<Float>(_KoeretoejMiljoeOplysningEmissionCO_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningEmissionHCPlusNOX")
    public JAXBElement<Float> createKoeretoejMiljoeOplysningEmissionHCPlusNOX(Float value) {
        return new JAXBElement<Float>(_KoeretoejMiljoeOplysningEmissionHCPlusNOX_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningEmissionNOX")
    public JAXBElement<Float> createKoeretoejMiljoeOplysningEmissionNOX(Float value) {
        return new JAXBElement<Float>(_KoeretoejMiljoeOplysningEmissionNOX_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningPartikler")
    public JAXBElement<Float> createKoeretoejMiljoeOplysningPartikler(Float value) {
        return new JAXBElement<Float>(_KoeretoejMiljoeOplysningPartikler_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningPartikelFilter")
    public JAXBElement<Boolean> createKoeretoejMiljoeOplysningPartikelFilter(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMiljoeOplysningPartikelFilter_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningRoegtaethed")
    public JAXBElement<Float> createKoeretoejMiljoeOplysningRoegtaethed(Float value) {
        return new JAXBElement<Float>(_KoeretoejMiljoeOplysningRoegtaethed_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningRoegtaethedOmdrejningstal")
    public JAXBElement<Long> createKoeretoejMiljoeOplysningRoegtaethedOmdrejningstal(Long value) {
        return new JAXBElement<Long>(_KoeretoejMiljoeOplysningRoegtaethedOmdrejningstal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningEftermonteretPartikelfilter")
    public JAXBElement<Boolean> createKoeretoejMiljoeOplysningEftermonteretPartikelfilter(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejMiljoeOplysningEftermonteretPartikelfilter_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantAkselAntal")
    public JAXBElement<Long> createTypeAttestVariantAkselAntal(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantAkselAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantTraekkendeAksler")
    public JAXBElement<String> createTypeAttestVariantTraekkendeAksler(String value) {
        return new JAXBElement<String>(_TypeAttestVariantTraekkendeAksler_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantAntalDoere")
    public JAXBElement<Long> createTypeAttestVariantAntalDoere(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantAntalDoere_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantAntalGear")
    public JAXBElement<Long> createTypeAttestVariantAntalGear(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantAntalGear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantCO2Udslip")
    public JAXBElement<Float> createTypeAttestVariantCO2Udslip(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantCO2Udslip_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantCylinderAntal")
    public JAXBElement<Long> createTypeAttestVariantCylinderAntal(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantCylinderAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantEgenVaegt")
    public JAXBElement<Long> createTypeAttestVariantEgenVaegt(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantEgenVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantFaelgDaek")
    public JAXBElement<String> createTypeAttestVariantFaelgDaek(String value) {
        return new JAXBElement<String>(_TypeAttestVariantFaelgDaek_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantKoerselStoej")
    public JAXBElement<Float> createTypeAttestVariantKoerselStoej(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantKoerselStoej_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantKoereklarVaegtMaksimum")
    public JAXBElement<Long> createTypeAttestVariantKoereklarVaegtMaksimum(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantKoereklarVaegtMaksimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantKoereklarVaegtMinimum")
    public JAXBElement<Long> createTypeAttestVariantKoereklarVaegtMinimum(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantKoereklarVaegtMinimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantMaksimumHastighed")
    public JAXBElement<Long> createTypeAttestVariantMaksimumHastighed(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantMaksimumHastighed_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantMaerkning")
    public JAXBElement<String> createTypeAttestVariantMaerkning(String value) {
        return new JAXBElement<String>(_TypeAttestVariantMaerkning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantNummer")
    public JAXBElement<Long> createTypeAttestVariantNummer(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantPartikelFilter")
    public JAXBElement<Boolean> createTypeAttestVariantPartikelFilter(Boolean value) {
        return new JAXBElement<Boolean>(_TypeAttestVariantPartikelFilter_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantPassagerAntal")
    public JAXBElement<Long> createTypeAttestVariantPassagerAntal(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantPassagerAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantRoegtaethed")
    public JAXBElement<Float> createTypeAttestVariantRoegtaethed(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantRoegtaethed_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantRoegtaethedOmdrejningstal")
    public JAXBElement<Long> createTypeAttestVariantRoegtaethedOmdrejningstal(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantRoegtaethedOmdrejningstal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStandStoej")
    public JAXBElement<Float> createTypeAttestVariantStandStoej(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantStandStoej_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSiddepladserMinimum")
    public JAXBElement<Long> createTypeAttestVariantSiddepladserMinimum(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSiddepladserMinimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSiddepladserMaksimum")
    public JAXBElement<Long> createTypeAttestVariantSiddepladserMaksimum(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSiddepladserMaksimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAttestVariantStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStatus")
    public JAXBElement<TypeAttestVariantStatusType> createTypeAttestVariantStatus(TypeAttestVariantStatusType value) {
        return new JAXBElement<TypeAttestVariantStatusType>(_TypeAttestVariantStatus_QNAME, TypeAttestVariantStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStatusDatoTid")
    public JAXBElement<XMLGregorianCalendar> createTypeAttestVariantStatusDatoTid(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TypeAttestVariantStatusDatoTid_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStelNummerAnbringelse")
    public JAXBElement<String> createTypeAttestVariantStelNummerAnbringelse(String value) {
        return new JAXBElement<String>(_TypeAttestVariantStelNummerAnbringelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStandStoejOmdrejningstal")
    public JAXBElement<Long> createTypeAttestVariantStandStoejOmdrejningstal(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantStandStoejOmdrejningstal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStoersteAkselTryk")
    public JAXBElement<Long> createTypeAttestVariantStoersteAkselTryk(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantStoersteAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStaapladserMinimum")
    public JAXBElement<Long> createTypeAttestVariantStaapladserMinimum(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantStaapladserMinimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStaapladserMaksimum")
    public JAXBElement<Long> createTypeAttestVariantStaapladserMaksimum(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantStaapladserMaksimum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantTekniskTotalVaegt")
    public JAXBElement<Long> createTypeAttestVariantTekniskTotalVaegt(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantTekniskTotalVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantTilkoblingsvaegtMedBremser")
    public JAXBElement<Long> createTypeAttestVariantTilkoblingsvaegtMedBremser(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantTilkoblingsvaegtMedBremser_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantTilkoblingsvaegtUdenBremser")
    public JAXBElement<Long> createTypeAttestVariantTilkoblingsvaegtUdenBremser(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantTilkoblingsvaegtUdenBremser_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantTotalVaegt")
    public JAXBElement<Long> createTypeAttestVariantTotalVaegt(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantTotalVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantVVaerdiLuft")
    public JAXBElement<Float> createTypeAttestVariantVVaerdiLuft(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantVVaerdiLuft_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantVVaerdiMekanisk")
    public JAXBElement<Float> createTypeAttestVariantVVaerdiMekanisk(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantVVaerdiMekanisk_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantEgnetTilTaxi")
    public JAXBElement<Boolean> createTypeAttestVariantEgnetTilTaxi(Boolean value) {
        return new JAXBElement<Boolean>(_TypeAttestVariantEgnetTilTaxi_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantPartikler")
    public JAXBElement<Float> createTypeAttestVariantPartikler(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantPartikler_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantKmPerLiter")
    public JAXBElement<Float> createTypeAttestVariantKmPerLiter(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantKmPerLiter_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStoersteEffekt")
    public JAXBElement<Float> createTypeAttestVariantStoersteEffekt(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantStoersteEffekt_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantInnovativTeknik")
    public JAXBElement<Boolean> createTypeAttestVariantInnovativTeknik(Boolean value) {
        return new JAXBElement<Boolean>(_TypeAttestVariantInnovativTeknik_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantInnovativTeknikAntal")
    public JAXBElement<Float> createTypeAttestVariantInnovativTeknikAntal(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantInnovativTeknikAntal_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantNCAPTest")
    public JAXBElement<Boolean> createTypeAttestVariantNCAPTest(Boolean value) {
        return new JAXBElement<Boolean>(_TypeAttestVariantNCAPTest_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSkammelBelastning")
    public JAXBElement<Long> createTypeAttestVariantSkammelBelastning(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSkammelBelastning_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSkatteAkselAntal")
    public JAXBElement<Long> createTypeAttestVariantSkatteAkselAntal(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSkatteAkselAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSkatteAkselTryk")
    public JAXBElement<Long> createTypeAttestVariantSkatteAkselTryk(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSkatteAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSaettevognTilladtAkselTryk")
    public JAXBElement<Long> createTypeAttestVariantSaettevognTilladtAkselTryk(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSaettevognTilladtAkselTryk_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantVogntogVaegt")
    public JAXBElement<Long> createTypeAttestVariantVogntogVaegt(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantVogntogVaegt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantAkselAfstand")
    public JAXBElement<Long> createTypeAttestVariantAkselAfstand(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantAkselAfstand_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSporviddenForrest")
    public JAXBElement<Long> createTypeAttestVariantSporviddenForrest(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSporviddenForrest_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSporviddenBagest")
    public JAXBElement<Long> createTypeAttestVariantSporviddenBagest(Long value) {
        return new JAXBElement<Long>(_TypeAttestVariantSporviddenBagest_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantSlagVolumen")
    public JAXBElement<Float> createTypeAttestVariantSlagVolumen(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantSlagVolumen_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantElektriskForbrug")
    public JAXBElement<Float> createTypeAttestVariantElektriskForbrug(Float value) {
        return new JAXBElement<Float>(_TypeAttestVariantElektriskForbrug_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createTypeAttestGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TypeAttestGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createTypeAttestGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TypeAttestGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestNummer")
    public JAXBElement<Long> createTypeAttestNummer(Long value) {
        return new JAXBElement<Long>(_TypeAttestNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestTypeAnmeldelseNummer")
    public JAXBElement<String> createTypeAttestTypeAnmeldelseNummer(String value) {
        return new JAXBElement<String>(_TypeAttestTypeAnmeldelseNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestTypeGodkendelseNummer")
    public JAXBElement<String> createTypeAttestTypeGodkendelseNummer(String value) {
        return new JAXBElement<String>(_TypeAttestTypeGodkendelseNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "FarveTypeNummer")
    public JAXBElement<Long> createFarveTypeNummer(Long value) {
        return new JAXBElement<Long>(_FarveTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "FarveTypeNavn")
    public JAXBElement<String> createFarveTypeNavn(String value) {
        return new JAXBElement<String>(_FarveTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarveTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "FarveTypeStruktur")
    public JAXBElement<FarveTypeStrukturType> createFarveTypeStruktur(FarveTypeStrukturType value) {
        return new JAXBElement<FarveTypeStrukturType>(_FarveTypeStruktur_QNAME, FarveTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejFarveStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejFarveStruktur")
    public JAXBElement<KoeretoejFarveStrukturType> createKoeretoejFarveStruktur(KoeretoejFarveStrukturType value) {
        return new JAXBElement<KoeretoejFarveStrukturType>(_KoeretoejFarveStruktur_QNAME, KoeretoejFarveStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrAntal")
    public JAXBElement<Long> createKoeretoejUdstyrAntal(Long value) {
        return new JAXBElement<Long>(_KoeretoejUdstyrAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeNummer")
    public JAXBElement<Long> createKoeretoejUdstyrTypeNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejUdstyrTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeNavn")
    public JAXBElement<String> createKoeretoejUdstyrTypeNavn(String value) {
        return new JAXBElement<String>(_KoeretoejUdstyrTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeStandardAntal")
    public JAXBElement<Long> createKoeretoejUdstyrTypeStandardAntal(Long value) {
        return new JAXBElement<Long>(_KoeretoejUdstyrTypeStandardAntal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeVisesVedSyn")
    public JAXBElement<Boolean> createKoeretoejUdstyrTypeVisesVedSyn(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejUdstyrTypeVisesVedSyn_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeVisesVedForespoergsel")
    public JAXBElement<Boolean> createKoeretoejUdstyrTypeVisesVedForespoergsel(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejUdstyrTypeVisesVedForespoergsel_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeVisesVedStandardOprettelse")
    public JAXBElement<Boolean> createKoeretoejUdstyrTypeVisesVedStandardOprettelse(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejUdstyrTypeVisesVedStandardOprettelse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejUdstyrTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeStruktur")
    public JAXBElement<KoeretoejUdstyrTypeStrukturType> createKoeretoejUdstyrTypeStruktur(KoeretoejUdstyrTypeStrukturType value) {
        return new JAXBElement<KoeretoejUdstyrTypeStrukturType>(_KoeretoejUdstyrTypeStruktur_QNAME, KoeretoejUdstyrTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejUdstyrStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrStruktur")
    public JAXBElement<KoeretoejUdstyrStrukturType> createKoeretoejUdstyrStruktur(KoeretoejUdstyrStrukturType value) {
        return new JAXBElement<KoeretoejUdstyrStrukturType>(_KoeretoejUdstyrStruktur_QNAME, KoeretoejUdstyrStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejUdstyrSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrSamlingStruktur")
    public JAXBElement<KoeretoejUdstyrSamlingStrukturType> createKoeretoejUdstyrSamlingStruktur(KoeretoejUdstyrSamlingStrukturType value) {
        return new JAXBElement<KoeretoejUdstyrSamlingStrukturType>(_KoeretoejUdstyrSamlingStruktur_QNAME, KoeretoejUdstyrSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PrisOplysningerMindsteBeskatningspris")
    public JAXBElement<BigDecimal> createPrisOplysningerMindsteBeskatningspris(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrisOplysningerMindsteBeskatningspris_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PrisOplysningerIndkoebsPris")
    public JAXBElement<BigDecimal> createPrisOplysningerIndkoebsPris(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrisOplysningerIndkoebsPris_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PrisOplysningerStandardPris")
    public JAXBElement<BigDecimal> createPrisOplysningerStandardPris(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrisOplysningerStandardPris_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrisOplysningerStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PrisOplysningerStruktur")
    public JAXBElement<PrisOplysningerStrukturType> createPrisOplysningerStruktur(PrisOplysningerStrukturType value) {
        return new JAXBElement<PrisOplysningerStrukturType>(_PrisOplysningerStruktur_QNAME, PrisOplysningerStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejSupplerendeKarrosseriTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejSupplerendeKarrosseriTypeStruktur")
    public JAXBElement<KoeretoejSupplerendeKarrosseriTypeStrukturType> createKoeretoejSupplerendeKarrosseriTypeStruktur(KoeretoejSupplerendeKarrosseriTypeStrukturType value) {
        return new JAXBElement<KoeretoejSupplerendeKarrosseriTypeStrukturType>(_KoeretoejSupplerendeKarrosseriTypeStruktur_QNAME, KoeretoejSupplerendeKarrosseriTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejSupplerendeKarrosseriSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejSupplerendeKarrosseriSamlingStruktur")
    public JAXBElement<KoeretoejSupplerendeKarrosseriSamlingStrukturType> createKoeretoejSupplerendeKarrosseriSamlingStruktur(KoeretoejSupplerendeKarrosseriSamlingStrukturType value) {
        return new JAXBElement<KoeretoejSupplerendeKarrosseriSamlingStrukturType>(_KoeretoejSupplerendeKarrosseriSamlingStruktur_QNAME, KoeretoejSupplerendeKarrosseriSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DispensationTypeNummer")
    public JAXBElement<Long> createDispensationTypeNummer(Long value) {
        return new JAXBElement<Long>(_DispensationTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DispensationTypeNavn")
    public JAXBElement<String> createDispensationTypeNavn(String value) {
        return new JAXBElement<String>(_DispensationTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejDispensationTypeKommentar")
    public JAXBElement<String> createKoeretoejDispensationTypeKommentar(String value) {
        return new JAXBElement<String>(_KoeretoejDispensationTypeKommentar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispensationTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DispensationTypeStruktur")
    public JAXBElement<DispensationTypeStrukturType> createDispensationTypeStruktur(DispensationTypeStrukturType value) {
        return new JAXBElement<DispensationTypeStrukturType>(_DispensationTypeStruktur_QNAME, DispensationTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispensationTypeSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DispensationTypeSamlingStruktur")
    public JAXBElement<DispensationTypeSamlingStrukturType> createDispensationTypeSamlingStruktur(DispensationTypeSamlingStrukturType value) {
        return new JAXBElement<DispensationTypeSamlingStrukturType>(_DispensationTypeSamlingStruktur_QNAME, DispensationTypeSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMaerkeTypeNummer")
    public JAXBElement<Long> createKoeretoejMaerkeTypeNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejMaerkeTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMaerkeTypeNavn")
    public JAXBElement<String> createKoeretoejMaerkeTypeNavn(String value) {
        return new JAXBElement<String>(_KoeretoejMaerkeTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarveTypeSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "FarveTypeSamlingStruktur")
    public JAXBElement<FarveTypeSamlingStrukturType> createFarveTypeSamlingStruktur(FarveTypeSamlingStrukturType value) {
        return new JAXBElement<FarveTypeSamlingStrukturType>(_FarveTypeSamlingStruktur_QNAME, FarveTypeSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerIdent")
    public JAXBElement<Long> createRegistreringNummerIdent(Long value) {
        return new JAXBElement<Long>(_RegistreringNummerIdent_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerAflangIndhold")
    public JAXBElement<String> createRegistreringNummerAflangIndhold(String value) {
        return new JAXBElement<String>(_RegistreringNummerAflangIndhold_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerGraensepladeDkDato")
    public JAXBElement<XMLGregorianCalendar> createRegistreringNummerGraensepladeDkDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringNummerGraensepladeDkDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerKvadratiskIndhold1")
    public JAXBElement<String> createRegistreringNummerKvadratiskIndhold1(String value) {
        return new JAXBElement<String>(_RegistreringNummerKvadratiskIndhold1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerKvadratiskIndhold2")
    public JAXBElement<String> createRegistreringNummerKvadratiskIndhold2(String value) {
        return new JAXBElement<String>(_RegistreringNummerKvadratiskIndhold2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerNummer")
    public JAXBElement<String> createRegistreringNummerNummer(String value) {
        return new JAXBElement<String>(_RegistreringNummerNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringNummerStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerStatus")
    public JAXBElement<RegistreringNummerStatusType> createRegistreringNummerStatus(RegistreringNummerStatusType value) {
        return new JAXBElement<RegistreringNummerStatusType>(_RegistreringNummerStatus_QNAME, RegistreringNummerStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerStatusDato")
    public JAXBElement<XMLGregorianCalendar> createRegistreringNummerStatusDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringNummerStatusDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringNummerTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerType")
    public JAXBElement<RegistreringNummerTypeType> createRegistreringNummerType(RegistreringNummerTypeType value) {
        return new JAXBElement<RegistreringNummerTypeType>(_RegistreringNummerType_QNAME, RegistreringNummerTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerUdloebDato")
    public JAXBElement<XMLGregorianCalendar> createRegistreringNummerUdloebDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringNummerUdloebDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerFigurantPlade")
    public JAXBElement<Boolean> createRegistreringNummerFigurantPlade(Boolean value) {
        return new JAXBElement<Boolean>(_RegistreringNummerFigurantPlade_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejModelTypeNummer")
    public JAXBElement<Long> createKoeretoejModelTypeNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejModelTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejModelTypeNavn")
    public JAXBElement<String> createKoeretoejModelTypeNavn(String value) {
        return new JAXBElement<String>(_KoeretoejModelTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejTypeTypeNummer")
    public JAXBElement<Long> createKoeretoejTypeTypeNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejTypeTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejTypeTypeNavn")
    public JAXBElement<String> createKoeretoejTypeTypeNavn(String value) {
        return new JAXBElement<String>(_KoeretoejTypeTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtNummer")
    public JAXBElement<Long> createKoeretoejArtNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejArtNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtNavn")
    public JAXBElement<String> createKoeretoejArtNavn(String value) {
        return new JAXBElement<String>(_KoeretoejArtNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtKraeverForsikring")
    public JAXBElement<Boolean> createKoeretoejArtKraeverForsikring(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejArtKraeverForsikring_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtBeskrivelse")
    public JAXBElement<String> createKoeretoejArtBeskrivelse(String value) {
        return new JAXBElement<String>(_KoeretoejArtBeskrivelse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejArtGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejArtGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejArtGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejArtGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForretningParameterVaerdiStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtStatus")
    public JAXBElement<ForretningParameterVaerdiStatusType> createKoeretoejArtStatus(ForretningParameterVaerdiStatusType value) {
        return new JAXBElement<ForretningParameterVaerdiStatusType>(_KoeretoejArtStatus_QNAME, ForretningParameterVaerdiStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejAnvendelseSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejAnvendelseSamlingStruktur")
    public JAXBElement<KoeretoejAnvendelseSamlingStrukturType> createKoeretoejAnvendelseSamlingStruktur(KoeretoejAnvendelseSamlingStrukturType value) {
        return new JAXBElement<KoeretoejAnvendelseSamlingStrukturType>(_KoeretoejAnvendelseSamlingStruktur_QNAME, KoeretoejAnvendelseSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontekstType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "Kontekst")
    public JAXBElement<KontekstType> createKontekst(KontekstType value) {
        return new JAXBElement<KontekstType>(_Kontekst_QNAME, KontekstType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KompenserTransType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KompenserTrans")
    public JAXBElement<KompenserTransType> createKompenserTrans(KompenserTransType value) {
        return new JAXBElement<KompenserTransType>(_KompenserTrans_QNAME, KompenserTransType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KompenserTransSvarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KompenserTransSvar")
    public JAXBElement<KompenserTransSvarType> createKompenserTransSvar(KompenserTransSvarType value) {
        return new JAXBElement<KompenserTransSvarType>(_KompenserTransSvar_QNAME, KompenserTransSvarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejAnvendelseListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejAnvendelseListeHentInterface")
    public JAXBElement<USKoeretoejAnvendelseListeHentInterfaceType> createUSKoeretoejAnvendelseListeHentInterface(USKoeretoejAnvendelseListeHentInterfaceType value) {
        return new JAXBElement<USKoeretoejAnvendelseListeHentInterfaceType>(_USKoeretoejAnvendelseListeHentInterface_QNAME, USKoeretoejAnvendelseListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejIdent")
    public JAXBElement<BigInteger> createKoeretoejIdent(BigInteger value) {
        return new JAXBElement<BigInteger>(_KoeretoejIdent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USUkompletKoeretoejOpretInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USUkompletKoeretoejOpretInterface")
    public JAXBElement<USUkompletKoeretoejOpretInterfaceType> createUSUkompletKoeretoejOpretInterface(USUkompletKoeretoejOpretInterfaceType value) {
        return new JAXBElement<USUkompletKoeretoejOpretInterfaceType>(_USUkompletKoeretoejOpretInterface_QNAME, USUkompletKoeretoejOpretInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejUdstyrTypeSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejUdstyrTypeSamlingStruktur")
    public JAXBElement<KoeretoejUdstyrTypeSamlingStrukturType> createKoeretoejUdstyrTypeSamlingStruktur(KoeretoejUdstyrTypeSamlingStrukturType value) {
        return new JAXBElement<KoeretoejUdstyrTypeSamlingStrukturType>(_KoeretoejUdstyrTypeSamlingStruktur_QNAME, KoeretoejUdstyrTypeSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejUdstyrTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejUdstyrTypeListeHentInterface")
    public JAXBElement<USKoeretoejUdstyrTypeListeHentInterfaceType> createUSKoeretoejUdstyrTypeListeHentInterface(USKoeretoejUdstyrTypeListeHentInterfaceType value) {
        return new JAXBElement<USKoeretoejUdstyrTypeListeHentInterfaceType>(_USKoeretoejUdstyrTypeListeHentInterface_QNAME, USKoeretoejUdstyrTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejBlokeringAarsagTypeNummer")
    public JAXBElement<Long> createKoeretoejBlokeringAarsagTypeNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejBlokeringAarsagTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejBlokeringAarsagTypeNavn")
    public JAXBElement<String> createKoeretoejBlokeringAarsagTypeNavn(String value) {
        return new JAXBElement<String>(_KoeretoejBlokeringAarsagTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejBlokeringAarsagTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejBlokeringAarsagTypeStruktur")
    public JAXBElement<KoeretoejBlokeringAarsagTypeStrukturType> createKoeretoejBlokeringAarsagTypeStruktur(KoeretoejBlokeringAarsagTypeStrukturType value) {
        return new JAXBElement<KoeretoejBlokeringAarsagTypeStrukturType>(_KoeretoejBlokeringAarsagTypeStruktur_QNAME, KoeretoejBlokeringAarsagTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejBlokeringAarsagTypeListeHentFejlIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejBlokeringAarsagTypeListeHent_FejlID")
    public JAXBElement<USKoeretoejBlokeringAarsagTypeListeHentFejlIDType> createUSKoeretoejBlokeringAarsagTypeListeHentFejlID(USKoeretoejBlokeringAarsagTypeListeHentFejlIDType value) {
        return new JAXBElement<USKoeretoejBlokeringAarsagTypeListeHentFejlIDType>(_USKoeretoejBlokeringAarsagTypeListeHentFejlID_QNAME, USKoeretoejBlokeringAarsagTypeListeHentFejlIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejBlokeringAarsagTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejBlokeringAarsagTypeListeHentInterface")
    public JAXBElement<USKoeretoejBlokeringAarsagTypeListeHentInterfaceType> createUSKoeretoejBlokeringAarsagTypeListeHentInterface(USKoeretoejBlokeringAarsagTypeListeHentInterfaceType value) {
        return new JAXBElement<USKoeretoejBlokeringAarsagTypeListeHentInterfaceType>(_USKoeretoejBlokeringAarsagTypeListeHentInterface_QNAME, USKoeretoejBlokeringAarsagTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejBetegnelseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejBetegnelseStruktur")
    public JAXBElement<KoeretoejBetegnelseStrukturType> createKoeretoejBetegnelseStruktur(KoeretoejBetegnelseStrukturType value) {
        return new JAXBElement<KoeretoejBetegnelseStrukturType>(_KoeretoejBetegnelseStruktur_QNAME, KoeretoejBetegnelseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejBetegnelseSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejBetegnelseSamlingStruktur")
    public JAXBElement<KoeretoejBetegnelseSamlingStrukturType> createKoeretoejBetegnelseSamlingStruktur(KoeretoejBetegnelseSamlingStrukturType value) {
        return new JAXBElement<KoeretoejBetegnelseSamlingStrukturType>(_KoeretoejBetegnelseSamlingStruktur_QNAME, KoeretoejBetegnelseSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createTilladelseGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TilladelseGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createTilladelseGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TilladelseGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseKommentar")
    public JAXBElement<String> createTilladelseKommentar(String value) {
        return new JAXBElement<String>(_TilladelseKommentar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseNummer")
    public JAXBElement<Long> createTilladelseNummer(Long value) {
        return new JAXBElement<Long>(_TilladelseNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseKunGodkendtForRegistreretEjer")
    public JAXBElement<String> createTilladelseKunGodkendtForRegistreretEjer(String value) {
        return new JAXBElement<String>(_TilladelseKunGodkendtForRegistreretEjer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseKombinationKoeretoejIdent")
    public JAXBElement<BigInteger> createTilladelseKombinationKoeretoejIdent(BigInteger value) {
        return new JAXBElement<BigInteger>(_TilladelseKombinationKoeretoejIdent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseTypeErPeriodeBegraenset")
    public JAXBElement<Boolean> createTilladelseTypeErPeriodeBegraenset(Boolean value) {
        return new JAXBElement<Boolean>(_TilladelseTypeErPeriodeBegraenset_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseTypePeriodeLaengde")
    public JAXBElement<Integer> createTilladelseTypePeriodeLaengde(Integer value) {
        return new JAXBElement<Integer>(_TilladelseTypePeriodeLaengde_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseTypeNummer")
    public JAXBElement<Long> createTilladelseTypeNummer(Long value) {
        return new JAXBElement<Long>(_TilladelseTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseTypeNavn")
    public JAXBElement<String> createTilladelseTypeNavn(String value) {
        return new JAXBElement<String>(_TilladelseTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TilladelseTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseTypeStruktur")
    public JAXBElement<TilladelseTypeStrukturType> createTilladelseTypeStruktur(TilladelseTypeStrukturType value) {
        return new JAXBElement<TilladelseTypeStrukturType>(_TilladelseTypeStruktur_QNAME, TilladelseTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejGenerelIdentifikatorStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejGenerelIdentifikatorStruktur")
    public JAXBElement<KoeretoejGenerelIdentifikatorStrukturType> createKoeretoejGenerelIdentifikatorStruktur(KoeretoejGenerelIdentifikatorStrukturType value) {
        return new JAXBElement<KoeretoejGenerelIdentifikatorStrukturType>(_KoeretoejGenerelIdentifikatorStruktur_QNAME, KoeretoejGenerelIdentifikatorStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuridiskEnhedIdentifikatorStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "JuridiskEnhedIdentifikatorStruktur")
    public JAXBElement<JuridiskEnhedIdentifikatorStrukturType> createJuridiskEnhedIdentifikatorStruktur(JuridiskEnhedIdentifikatorStrukturType value) {
        return new JAXBElement<JuridiskEnhedIdentifikatorStrukturType>(_JuridiskEnhedIdentifikatorStruktur_QNAME, JuridiskEnhedIdentifikatorStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TilladelseStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseStruktur")
    public JAXBElement<TilladelseStrukturType> createTilladelseStruktur(TilladelseStrukturType value) {
        return new JAXBElement<TilladelseStrukturType>(_TilladelseStruktur_QNAME, TilladelseStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DrivkraftTypeNummer")
    public JAXBElement<Long> createDrivkraftTypeNummer(Long value) {
        return new JAXBElement<Long>(_DrivkraftTypeNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DrivkraftTypeNavn")
    public JAXBElement<String> createDrivkraftTypeNavn(String value) {
        return new JAXBElement<String>(_DrivkraftTypeNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrivkraftTypeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DrivkraftTypeStruktur")
    public JAXBElement<DrivkraftTypeStrukturType> createDrivkraftTypeStruktur(DrivkraftTypeStrukturType value) {
        return new JAXBElement<DrivkraftTypeStrukturType>(_DrivkraftTypeStruktur_QNAME, DrivkraftTypeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrivkraftTypeSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DrivkraftTypeSamlingStruktur")
    public JAXBElement<DrivkraftTypeSamlingStrukturType> createDrivkraftTypeSamlingStruktur(DrivkraftTypeSamlingStrukturType value) {
        return new JAXBElement<DrivkraftTypeSamlingStrukturType>(_DrivkraftTypeSamlingStruktur_QNAME, DrivkraftTypeSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DatoTidSoegTidspunkt")
    public JAXBElement<XMLGregorianCalendar> createDatoTidSoegTidspunkt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatoTidSoegTidspunkt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAttestVariantStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestVariantStruktur")
    public JAXBElement<TypeAttestVariantStrukturType> createTypeAttestVariantStruktur(TypeAttestVariantStrukturType value) {
        return new JAXBElement<TypeAttestVariantStrukturType>(_TypeAttestVariantStruktur_QNAME, TypeAttestVariantStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createRegistreringNummerRettighedGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringNummerRettighedGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createRegistreringNummerRettighedGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringNummerRettighedGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedNummer")
    public JAXBElement<Long> createRegistreringNummerRettighedNummer(Long value) {
        return new JAXBElement<Long>(_RegistreringNummerRettighedNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedSidstAdviseretDato")
    public JAXBElement<XMLGregorianCalendar> createRegistreringNummerRettighedSidstAdviseretDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegistreringNummerRettighedSidstAdviseretDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringNummerRettighedTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedType")
    public JAXBElement<RegistreringNummerRettighedTypeType> createRegistreringNummerRettighedType(RegistreringNummerRettighedTypeType value) {
        return new JAXBElement<RegistreringNummerRettighedTypeType>(_RegistreringNummerRettighedType_QNAME, RegistreringNummerRettighedTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedKoerselFormaal")
    public JAXBElement<String> createRegistreringNummerRettighedKoerselFormaal(String value) {
        return new JAXBElement<String>(_RegistreringNummerRettighedKoerselFormaal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerRettighedAntalFerieDageTilbage")
    public JAXBElement<Long> createRegistreringNummerRettighedAntalFerieDageTilbage(Long value) {
        return new JAXBElement<Long>(_RegistreringNummerRettighedAntalFerieDageTilbage_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingMaaneder")
    public JAXBElement<Long> createLeasingMaaneder(Long value) {
        return new JAXBElement<Long>(_LeasingMaaneder_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingNummer")
    public JAXBElement<Long> createLeasingNummer(Long value) {
        return new JAXBElement<Long>(_LeasingNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createLeasingGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LeasingGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createLeasingGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LeasingGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingReelOphoerDato")
    public JAXBElement<XMLGregorianCalendar> createLeasingReelOphoerDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LeasingReelOphoerDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingKode")
    public JAXBElement<String> createLeasingKode(String value) {
        return new JAXBElement<String>(_LeasingKode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeasingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingStatus")
    public JAXBElement<LeasingStatusType> createLeasingStatus(LeasingStatusType value) {
        return new JAXBElement<LeasingStatusType>(_LeasingStatus_QNAME, LeasingStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "LeasingBemaerkning")
    public JAXBElement<String> createLeasingBemaerkning(String value) {
        return new JAXBElement<String>(_LeasingBemaerkning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejArtStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtStruktur")
    public JAXBElement<KoeretoejArtStrukturType> createKoeretoejArtStruktur(KoeretoejArtStrukturType value) {
        return new JAXBElement<KoeretoejArtStrukturType>(_KoeretoejArtStruktur_QNAME, KoeretoejArtStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejRegistreringGrundlagStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGrundlagStruktur")
    public JAXBElement<KoeretoejRegistreringGrundlagStrukturType> createKoeretoejRegistreringGrundlagStruktur(KoeretoejRegistreringGrundlagStrukturType value) {
        return new JAXBElement<KoeretoejRegistreringGrundlagStrukturType>(_KoeretoejRegistreringGrundlagStruktur_QNAME, KoeretoejRegistreringGrundlagStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringNummerStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "RegistreringNummerStruktur")
    public JAXBElement<RegistreringNummerStrukturType> createRegistreringNummerStruktur(RegistreringNummerStrukturType value) {
        return new JAXBElement<RegistreringNummerStrukturType>(_RegistreringNummerStruktur_QNAME, RegistreringNummerStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGyldigFra")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringGyldigFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringGyldigFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringGyldigTil")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringGyldigTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringGyldigTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringNummer")
    public JAXBElement<Long> createKoeretoejRegistreringNummer(Long value) {
        return new JAXBElement<Long>(_KoeretoejRegistreringNummer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejRegistreringStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringStatus")
    public JAXBElement<KoeretoejRegistreringStatusType> createKoeretoejRegistreringStatus(KoeretoejRegistreringStatusType value) {
        return new JAXBElement<KoeretoejRegistreringStatusType>(_KoeretoejRegistreringStatus_QNAME, KoeretoejRegistreringStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringStatusDato")
    public JAXBElement<XMLGregorianCalendar> createKoeretoejRegistreringStatusDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KoeretoejRegistreringStatusDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejRegistreringStatusAarsagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringStatusAarsag")
    public JAXBElement<KoeretoejRegistreringStatusAarsagType> createKoeretoejRegistreringStatusAarsag(KoeretoejRegistreringStatusAarsagType value) {
        return new JAXBElement<KoeretoejRegistreringStatusAarsagType>(_KoeretoejRegistreringStatusAarsag_QNAME, KoeretoejRegistreringStatusAarsagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringKontrolTal")
    public JAXBElement<String> createKoeretoejRegistreringKontrolTal(String value) {
        return new JAXBElement<String>(_KoeretoejRegistreringKontrolTal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejRegistreringHaendelserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringSenesteHaendelse")
    public JAXBElement<KoeretoejRegistreringHaendelserType> createKoeretoejRegistreringSenesteHaendelse(KoeretoejRegistreringHaendelserType value) {
        return new JAXBElement<KoeretoejRegistreringHaendelserType>(_KoeretoejRegistreringSenesteHaendelse_QNAME, KoeretoejRegistreringHaendelserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejRegistreringStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejRegistreringStruktur")
    public JAXBElement<KoeretoejRegistreringStrukturType> createKoeretoejRegistreringStruktur(KoeretoejRegistreringStrukturType value) {
        return new JAXBElement<KoeretoejRegistreringStrukturType>(_KoeretoejRegistreringStruktur_QNAME, KoeretoejRegistreringStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjerBrugerForholdForholdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "EjerBrugerForholdForhold")
    public JAXBElement<EjerBrugerForholdForholdType> createEjerBrugerForholdForhold(EjerBrugerForholdForholdType value) {
        return new JAXBElement<EjerBrugerForholdForholdType>(_EjerBrugerForholdForhold_QNAME, EjerBrugerForholdForholdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "EjerBrugerForholdPrimaer")
    public JAXBElement<Boolean> createEjerBrugerForholdPrimaer(Boolean value) {
        return new JAXBElement<Boolean>(_EjerBrugerForholdPrimaer_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjerBrugerForholdGrundStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "EjerBrugerForholdGrundStruktur")
    public JAXBElement<EjerBrugerForholdGrundStrukturType> createEjerBrugerForholdGrundStruktur(EjerBrugerForholdGrundStrukturType value) {
        return new JAXBElement<EjerBrugerForholdGrundStrukturType>(_EjerBrugerForholdGrundStruktur_QNAME, EjerBrugerForholdGrundStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjerBrugerSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "EjerBrugerSamlingStruktur")
    public JAXBElement<EjerBrugerSamlingStrukturType> createEjerBrugerSamlingStruktur(EjerBrugerSamlingStrukturType value) {
        return new JAXBElement<EjerBrugerSamlingStrukturType>(_EjerBrugerSamlingStruktur_QNAME, EjerBrugerSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringSelskabNummer")
    public JAXBElement<String> createForsikringSelskabNummer(String value) {
        return new JAXBElement<String>(_ForsikringSelskabNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringSelskabNavn")
    public JAXBElement<String> createForsikringSelskabNavn(String value) {
        return new JAXBElement<String>(_ForsikringSelskabNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringSelskabErMidlertidig")
    public JAXBElement<Boolean> createForsikringSelskabErMidlertidig(Boolean value) {
        return new JAXBElement<Boolean>(_ForsikringSelskabErMidlertidig_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForsikringSelskabIdentifikatorStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringSelskabIdentifikatorStruktur")
    public JAXBElement<ForsikringSelskabIdentifikatorStrukturType> createForsikringSelskabIdentifikatorStruktur(ForsikringSelskabIdentifikatorStrukturType value) {
        return new JAXBElement<ForsikringSelskabIdentifikatorStrukturType>(_ForsikringSelskabIdentifikatorStruktur_QNAME, ForsikringSelskabIdentifikatorStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringAfgangRegistreretDato")
    public JAXBElement<XMLGregorianCalendar> createForsikringAfgangRegistreretDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForsikringAfgangRegistreretDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringBevisDato")
    public JAXBElement<XMLGregorianCalendar> createForsikringBevisDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForsikringBevisDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringBevisNummer")
    public JAXBElement<String> createForsikringBevisNummer(String value) {
        return new JAXBElement<String>(_ForsikringBevisNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringIdent")
    public JAXBElement<Long> createForsikringIdent(Long value) {
        return new JAXBElement<Long>(_ForsikringIdent_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForsikringStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringStatus")
    public JAXBElement<ForsikringStatusType> createForsikringStatus(ForsikringStatusType value) {
        return new JAXBElement<ForsikringStatusType>(_ForsikringStatus_QNAME, ForsikringStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringStatusDato")
    public JAXBElement<XMLGregorianCalendar> createForsikringStatusDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForsikringStatusDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringUdstedtDigitalt")
    public JAXBElement<Boolean> createForsikringUdstedtDigitalt(Boolean value) {
        return new JAXBElement<Boolean>(_ForsikringUdstedtDigitalt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringUdstedtPapir")
    public JAXBElement<Boolean> createForsikringUdstedtPapir(Boolean value) {
        return new JAXBElement<Boolean>(_ForsikringUdstedtPapir_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringTilgangRegistreretDato")
    public JAXBElement<XMLGregorianCalendar> createForsikringTilgangRegistreretDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForsikringTilgangRegistreretDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringErFejlhaandteret")
    public JAXBElement<Boolean> createForsikringErFejlhaandteret(Boolean value) {
        return new JAXBElement<Boolean>(_ForsikringErFejlhaandteret_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForsikringStatusAarsagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringStatusAendringAarsag")
    public JAXBElement<ForsikringStatusAarsagType> createForsikringStatusAendringAarsag(ForsikringStatusAarsagType value) {
        return new JAXBElement<ForsikringStatusAarsagType>(_ForsikringStatusAendringAarsag_QNAME, ForsikringStatusAarsagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForsikringStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "ForsikringStruktur")
    public JAXBElement<ForsikringStrukturType> createForsikringStruktur(ForsikringStrukturType value) {
        return new JAXBElement<ForsikringStrukturType>(_ForsikringStruktur_QNAME, ForsikringStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejRegistreringHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejRegistreringHentInterface")
    public JAXBElement<USKoeretoejRegistreringHentInterfaceType> createUSKoeretoejRegistreringHentInterface(USKoeretoejRegistreringHentInterfaceType value) {
        return new JAXBElement<USKoeretoejRegistreringHentInterfaceType>(_USKoeretoejRegistreringHentInterface_QNAME, USKoeretoejRegistreringHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningFrikoert")
    public JAXBElement<Boolean> createKoeretoejOplysningFrikoert(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningFrikoert_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningFredetForPladeInddragelse")
    public JAXBElement<Boolean> createKoeretoejOplysningFredetForPladeInddragelse(Boolean value) {
        return new JAXBElement<Boolean>(_KoeretoejOplysningFredetForPladeInddragelse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejNormStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejNormStruktur")
    public JAXBElement<KoeretoejNormStrukturType> createKoeretoejNormStruktur(KoeretoejNormStrukturType value) {
        return new JAXBElement<KoeretoejNormStrukturType>(_KoeretoejNormStruktur_QNAME, KoeretoejNormStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejMiljoeOplysningStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMiljoeOplysningStruktur")
    public JAXBElement<KoeretoejMiljoeOplysningStrukturType> createKoeretoejMiljoeOplysningStruktur(KoeretoejMiljoeOplysningStrukturType value) {
        return new JAXBElement<KoeretoejMiljoeOplysningStrukturType>(_KoeretoejMiljoeOplysningStruktur_QNAME, KoeretoejMiljoeOplysningStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejMotorStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejMotorStruktur")
    public JAXBElement<KoeretoejMotorStrukturType> createKoeretoejMotorStruktur(KoeretoejMotorStrukturType value) {
        return new JAXBElement<KoeretoejMotorStrukturType>(_KoeretoejMotorStruktur_QNAME, KoeretoejMotorStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejBlokeringAarsagListeStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejBlokeringAarsagListeStruktur")
    public JAXBElement<KoeretoejBlokeringAarsagListeStrukturType> createKoeretoejBlokeringAarsagListeStruktur(KoeretoejBlokeringAarsagListeStrukturType value) {
        return new JAXBElement<KoeretoejBlokeringAarsagListeStrukturType>(_KoeretoejBlokeringAarsagListeStruktur_QNAME, KoeretoejBlokeringAarsagListeStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejOplysningStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejOplysningStruktur")
    public JAXBElement<KoeretoejOplysningStrukturType> createKoeretoejOplysningStruktur(KoeretoejOplysningStrukturType value) {
        return new JAXBElement<KoeretoejOplysningStrukturType>(_KoeretoejOplysningStruktur_QNAME, KoeretoejOplysningStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TilladelseSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TilladelseSamlingStruktur")
    public JAXBElement<TilladelseSamlingStrukturType> createTilladelseSamlingStruktur(TilladelseSamlingStrukturType value) {
        return new JAXBElement<TilladelseSamlingStrukturType>(_TilladelseSamlingStruktur_QNAME, TilladelseSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAttestStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "TypeAttestStruktur")
    public JAXBElement<TypeAttestStrukturType> createTypeAttestStruktur(TypeAttestStrukturType value) {
        return new JAXBElement<TypeAttestStrukturType>(_TypeAttestStruktur_QNAME, TypeAttestStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejTekniskDataStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejTekniskDataStruktur")
    public JAXBElement<KoeretoejTekniskDataStrukturType> createKoeretoejTekniskDataStruktur(KoeretoejTekniskDataStrukturType value) {
        return new JAXBElement<KoeretoejTekniskDataStrukturType>(_KoeretoejTekniskDataStruktur_QNAME, KoeretoejTekniskDataStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejArtAnvendelseListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejArtAnvendelseListeHentInterface")
    public JAXBElement<USKoeretoejArtAnvendelseListeHentInterfaceType> createUSKoeretoejArtAnvendelseListeHentInterface(USKoeretoejArtAnvendelseListeHentInterfaceType value) {
        return new JAXBElement<USKoeretoejArtAnvendelseListeHentInterfaceType>(_USKoeretoejArtAnvendelseListeHentInterface_QNAME, USKoeretoejArtAnvendelseListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DatoTidSoegFra")
    public JAXBElement<XMLGregorianCalendar> createDatoTidSoegFra(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatoTidSoegFra_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "DatoTidSoegTil")
    public JAXBElement<XMLGregorianCalendar> createDatoTidSoegTil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatoTidSoegTil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodeSoegStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "PeriodeSoegStruktur")
    public JAXBElement<PeriodeSoegStrukturType> createPeriodeSoegStruktur(PeriodeSoegStrukturType value) {
        return new JAXBElement<PeriodeSoegStrukturType>(_PeriodeSoegStruktur_QNAME, PeriodeSoegStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejOprettelseAnnullerInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejOprettelseAnnullerInterface")
    public JAXBElement<USKoeretoejOprettelseAnnullerInterfaceType> createUSKoeretoejOprettelseAnnullerInterface(USKoeretoejOprettelseAnnullerInterfaceType value) {
        return new JAXBElement<USKoeretoejOprettelseAnnullerInterfaceType>(_USKoeretoejOprettelseAnnullerInterface_QNAME, USKoeretoejOprettelseAnnullerInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USSupplerendeKarrosseriTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USSupplerendeKarrosseriTypeListeHentInterface")
    public JAXBElement<USSupplerendeKarrosseriTypeListeHentInterfaceType> createUSSupplerendeKarrosseriTypeListeHentInterface(USSupplerendeKarrosseriTypeListeHentInterfaceType value) {
        return new JAXBElement<USSupplerendeKarrosseriTypeListeHentInterfaceType>(_USSupplerendeKarrosseriTypeListeHentInterface_QNAME, USSupplerendeKarrosseriTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejCoCOpretInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejCoCOpretInterface")
    public JAXBElement<USKoeretoejCoCOpretInterfaceType> createUSKoeretoejCoCOpretInterface(USKoeretoejCoCOpretInterfaceType value) {
        return new JAXBElement<USKoeretoejCoCOpretInterfaceType>(_USKoeretoejCoCOpretInterface_QNAME, USKoeretoejCoCOpretInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejBetegnelseHierarkiListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejBetegnelseHierarkiListeHentInterface")
    public JAXBElement<USKoeretoejBetegnelseHierarkiListeHentInterfaceType> createUSKoeretoejBetegnelseHierarkiListeHentInterface(USKoeretoejBetegnelseHierarkiListeHentInterfaceType value) {
        return new JAXBElement<USKoeretoejBetegnelseHierarkiListeHentInterfaceType>(_USKoeretoejBetegnelseHierarkiListeHentInterface_QNAME, USKoeretoejBetegnelseHierarkiListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USTilladelseTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USTilladelseTypeListeHentInterface")
    public JAXBElement<USTilladelseTypeListeHentInterfaceType> createUSTilladelseTypeListeHentInterface(USTilladelseTypeListeHentInterfaceType value) {
        return new JAXBElement<USTilladelseTypeListeHentInterfaceType>(_USTilladelseTypeListeHentInterface_QNAME, USTilladelseTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejErklaeringOpretInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejErklaeringOpretInterface")
    public JAXBElement<USKoeretoejErklaeringOpretInterfaceType> createUSKoeretoejErklaeringOpretInterface(USKoeretoejErklaeringOpretInterfaceType value) {
        return new JAXBElement<USKoeretoejErklaeringOpretInterfaceType>(_USKoeretoejErklaeringOpretInterface_QNAME, USKoeretoejErklaeringOpretInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KoeretoejArtSamlingStrukturType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "KoeretoejArtSamlingStruktur")
    public JAXBElement<KoeretoejArtSamlingStrukturType> createKoeretoejArtSamlingStruktur(KoeretoejArtSamlingStrukturType value) {
        return new JAXBElement<KoeretoejArtSamlingStrukturType>(_KoeretoejArtSamlingStruktur_QNAME, KoeretoejArtSamlingStrukturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejArtListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejArtListeHentInterface")
    public JAXBElement<USKoeretoejArtListeHentInterfaceType> createUSKoeretoejArtListeHentInterface(USKoeretoejArtListeHentInterfaceType value) {
        return new JAXBElement<USKoeretoejArtListeHentInterfaceType>(_USKoeretoejArtListeHentInterface_QNAME, USKoeretoejArtListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USDrivkraftTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USDrivkraftTypeListeHentInterface")
    public JAXBElement<USDrivkraftTypeListeHentInterfaceType> createUSDrivkraftTypeListeHentInterface(USDrivkraftTypeListeHentInterfaceType value) {
        return new JAXBElement<USDrivkraftTypeListeHentInterfaceType>(_USDrivkraftTypeListeHentInterface_QNAME, USDrivkraftTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USFarveTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USFarveTypeListeHentInterface")
    public JAXBElement<USFarveTypeListeHentInterfaceType> createUSFarveTypeListeHentInterface(USFarveTypeListeHentInterfaceType value) {
        return new JAXBElement<USFarveTypeListeHentInterfaceType>(_USFarveTypeListeHentInterface_QNAME, USFarveTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejTekniskDataHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejTekniskDataHentInterface")
    public JAXBElement<USKoeretoejTekniskDataHentInterfaceType> createUSKoeretoejTekniskDataHentInterface(USKoeretoejTekniskDataHentInterfaceType value) {
        return new JAXBElement<USKoeretoejTekniskDataHentInterfaceType>(_USKoeretoejTekniskDataHentInterface_QNAME, USKoeretoejTekniskDataHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USDispensationTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USDispensationTypeListeHentInterface")
    public JAXBElement<USDispensationTypeListeHentInterfaceType> createUSDispensationTypeListeHentInterface(USDispensationTypeListeHentInterfaceType value) {
        return new JAXBElement<USDispensationTypeListeHentInterfaceType>(_USDispensationTypeListeHentInterface_QNAME, USDispensationTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKarrosseriTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKarrosseriTypeListeHentInterface")
    public JAXBElement<USKarrosseriTypeListeHentInterfaceType> createUSKarrosseriTypeListeHentInterface(USKarrosseriTypeListeHentInterfaceType value) {
        return new JAXBElement<USKarrosseriTypeListeHentInterfaceType>(_USKarrosseriTypeListeHentInterface_QNAME, USKarrosseriTypeListeHentInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejTypeAttestOpretInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejTypeAttestOpretInterface")
    public JAXBElement<USKoeretoejTypeAttestOpretInterfaceType> createUSKoeretoejTypeAttestOpretInterface(USKoeretoejTypeAttestOpretInterfaceType value) {
        return new JAXBElement<USKoeretoejTypeAttestOpretInterfaceType>(_USKoeretoejTypeAttestOpretInterface_QNAME, USKoeretoejTypeAttestOpretInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USKoeretoejBetegnelseOpretInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USKoeretoejBetegnelseOpretInterface")
    public JAXBElement<USKoeretoejBetegnelseOpretInterfaceType> createUSKoeretoejBetegnelseOpretInterface(USKoeretoejBetegnelseOpretInterfaceType value) {
        return new JAXBElement<USKoeretoejBetegnelseOpretInterfaceType>(_USKoeretoejBetegnelseOpretInterface_QNAME, USKoeretoejBetegnelseOpretInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USNormTypeListeHentInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/dmr/2007/05/31/", name = "USNormTypeListeHentInterface")
    public JAXBElement<USNormTypeListeHentInterfaceType> createUSNormTypeListeHentInterface(USNormTypeListeHentInterfaceType value) {
        return new JAXBElement<USNormTypeListeHentInterfaceType>(_USNormTypeListeHentInterface_QNAME, USNormTypeListeHentInterfaceType.class, null, value);
    }

}
