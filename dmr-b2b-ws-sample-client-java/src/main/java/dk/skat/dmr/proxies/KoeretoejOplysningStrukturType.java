
package dk.skat.dmr.proxies;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KoeretoejOplysningStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejOplysningStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningOprettetUdFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStatus"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStatusDato"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningFoersteRegistreringDato" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummerAnbringelse" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningModelAar" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTotalVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningEgenVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningKoereklarVaegtMinimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningKoereklarVaegtMaksimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTekniskTotalVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningVogntogVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningAkselAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStoersteAkselTryk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSkatteAkselAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSkatteAkselTryk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningPassagerAntal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSiddepladserMinimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSiddepladserMaksimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStaapladserMinimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStaapladserMaksimum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTilkoblingMulighed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTilkoblingsvaegtUdenBremser" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTilkoblingsvaegtMedBremser" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningPaahaengVognTotalVaegt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSkammelBelastning" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSaettevognTilladtAkselTryk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningMaksimumHastighed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningFaelgDaek" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTilkobletSidevognStelnr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningNCAPTest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningVVaerdiLuft" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningVVaerdiMekanisk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningOevrigtUdstyr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningKoeretoejstand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysning30PctVarevogn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTraekkendeAksler" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningEgnetTilTaxi" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningAkselAfstand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSporviddenForrest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningSporviddenBagest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTypeAnmeldelseNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTypeGodkendelseNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningEUVariant" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningEUVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningKommentar" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTypegodkendtKategori" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningAntalGear" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningAntalDoere" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningFabrikant" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningFrikoert" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningFredetForPladeInddragelse" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningVejvenligLuftaffjedring" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningDanskGodkendelseNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningAargang" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningIbrugtagningDato" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningTrafikskade" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningVeteranKoeretoejOriginal" minOccurs="0"/&gt;
 *         &lt;element name="KoeretoejFastKombination" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerIdent" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBetegnelseStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejFarveStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KarrosseriTypeStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejSupplerendeKarrosseriSamlingStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejNormStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMotorStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeSamlingStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejUdstyrSamlingStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagListeStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}PrisOplysningerStruktur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejOplysningStrukturType", propOrder = {
    "koeretoejOplysningOprettetUdFra",
    "koeretoejOplysningStatus",
    "koeretoejOplysningStatusDato",
    "koeretoejOplysningFoersteRegistreringDato",
    "koeretoejOplysningStelNummer",
    "koeretoejOplysningStelNummerAnbringelse",
    "koeretoejOplysningModelAar",
    "koeretoejOplysningTotalVaegt",
    "koeretoejOplysningEgenVaegt",
    "koeretoejOplysningKoereklarVaegtMinimum",
    "koeretoejOplysningKoereklarVaegtMaksimum",
    "koeretoejOplysningTekniskTotalVaegt",
    "koeretoejOplysningVogntogVaegt",
    "koeretoejOplysningAkselAntal",
    "koeretoejOplysningStoersteAkselTryk",
    "koeretoejOplysningSkatteAkselAntal",
    "koeretoejOplysningSkatteAkselTryk",
    "koeretoejOplysningPassagerAntal",
    "koeretoejOplysningSiddepladserMinimum",
    "koeretoejOplysningSiddepladserMaksimum",
    "koeretoejOplysningStaapladserMinimum",
    "koeretoejOplysningStaapladserMaksimum",
    "koeretoejOplysningTilkoblingMulighed",
    "koeretoejOplysningTilkoblingsvaegtUdenBremser",
    "koeretoejOplysningTilkoblingsvaegtMedBremser",
    "koeretoejOplysningPaahaengVognTotalVaegt",
    "koeretoejOplysningSkammelBelastning",
    "koeretoejOplysningSaettevognTilladtAkselTryk",
    "koeretoejOplysningMaksimumHastighed",
    "koeretoejOplysningFaelgDaek",
    "koeretoejOplysningTilkobletSidevognStelnr",
    "koeretoejOplysningNCAPTest",
    "koeretoejOplysningVVaerdiLuft",
    "koeretoejOplysningVVaerdiMekanisk",
    "koeretoejOplysningOevrigtUdstyr",
    "koeretoejOplysningKoeretoejstand",
    "koeretoejOplysning30PctVarevogn",
    "koeretoejOplysningTraekkendeAksler",
    "koeretoejOplysningEgnetTilTaxi",
    "koeretoejOplysningAkselAfstand",
    "koeretoejOplysningSporviddenForrest",
    "koeretoejOplysningSporviddenBagest",
    "koeretoejOplysningTypeAnmeldelseNummer",
    "koeretoejOplysningTypeGodkendelseNummer",
    "koeretoejOplysningEUVariant",
    "koeretoejOplysningEUVersion",
    "koeretoejOplysningKommentar",
    "koeretoejOplysningTypegodkendtKategori",
    "koeretoejOplysningAntalGear",
    "koeretoejOplysningAntalDoere",
    "koeretoejOplysningFabrikant",
    "koeretoejOplysningFrikoert",
    "koeretoejOplysningFredetForPladeInddragelse",
    "koeretoejOplysningVejvenligLuftaffjedring",
    "koeretoejOplysningDanskGodkendelseNummer",
    "koeretoejOplysningAargang",
    "koeretoejOplysningIbrugtagningDato",
    "koeretoejOplysningTrafikskade",
    "koeretoejOplysningVeteranKoeretoejOriginal",
    "koeretoejFastKombination",
    "koeretoejBetegnelseStruktur",
    "koeretoejFarveStruktur",
    "karrosseriTypeStruktur",
    "koeretoejSupplerendeKarrosseriSamlingStruktur",
    "koeretoejNormStruktur",
    "koeretoejMiljoeOplysningStruktur",
    "koeretoejMotorStruktur",
    "dispensationTypeSamlingStruktur",
    "koeretoejUdstyrSamlingStruktur",
    "koeretoejBlokeringAarsagListeStruktur",
    "prisOplysningerStruktur"
})
public class KoeretoejOplysningStrukturType {

    @XmlElement(name = "KoeretoejOplysningOprettetUdFra", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejOplysningOprettetUdFraType koeretoejOplysningOprettetUdFra;
    @XmlElement(name = "KoeretoejOplysningStatus", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejOplysningStatusType koeretoejOplysningStatus;
    @XmlElement(name = "KoeretoejOplysningStatusDato", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejOplysningStatusDato;
    @XmlElement(name = "KoeretoejOplysningFoersteRegistreringDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar koeretoejOplysningFoersteRegistreringDato;
    @XmlElement(name = "KoeretoejOplysningStelNummer", required = true)
    protected String koeretoejOplysningStelNummer;
    @XmlElement(name = "KoeretoejOplysningStelNummerAnbringelse")
    protected String koeretoejOplysningStelNummerAnbringelse;
    @XmlElement(name = "KoeretoejOplysningModelAar")
    @XmlSchemaType(name = "integer")
    protected Integer koeretoejOplysningModelAar;
    @XmlElement(name = "KoeretoejOplysningTotalVaegt")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningTotalVaegt;
    @XmlElement(name = "KoeretoejOplysningEgenVaegt")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningEgenVaegt;
    @XmlElement(name = "KoeretoejOplysningKoereklarVaegtMinimum")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningKoereklarVaegtMinimum;
    @XmlElement(name = "KoeretoejOplysningKoereklarVaegtMaksimum")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningKoereklarVaegtMaksimum;
    @XmlElement(name = "KoeretoejOplysningTekniskTotalVaegt")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningTekniskTotalVaegt;
    @XmlElement(name = "KoeretoejOplysningVogntogVaegt")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningVogntogVaegt;
    @XmlElement(name = "KoeretoejOplysningAkselAntal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningAkselAntal;
    @XmlElement(name = "KoeretoejOplysningStoersteAkselTryk")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningStoersteAkselTryk;
    @XmlElement(name = "KoeretoejOplysningSkatteAkselAntal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSkatteAkselAntal;
    @XmlElement(name = "KoeretoejOplysningSkatteAkselTryk")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSkatteAkselTryk;
    @XmlElement(name = "KoeretoejOplysningPassagerAntal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningPassagerAntal;
    @XmlElement(name = "KoeretoejOplysningSiddepladserMinimum")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSiddepladserMinimum;
    @XmlElement(name = "KoeretoejOplysningSiddepladserMaksimum")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSiddepladserMaksimum;
    @XmlElement(name = "KoeretoejOplysningStaapladserMinimum")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningStaapladserMinimum;
    @XmlElement(name = "KoeretoejOplysningStaapladserMaksimum")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningStaapladserMaksimum;
    @XmlElement(name = "KoeretoejOplysningTilkoblingMulighed")
    protected Boolean koeretoejOplysningTilkoblingMulighed;
    @XmlElement(name = "KoeretoejOplysningTilkoblingsvaegtUdenBremser")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningTilkoblingsvaegtUdenBremser;
    @XmlElement(name = "KoeretoejOplysningTilkoblingsvaegtMedBremser")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningTilkoblingsvaegtMedBremser;
    @XmlElement(name = "KoeretoejOplysningPaahaengVognTotalVaegt")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningPaahaengVognTotalVaegt;
    @XmlElement(name = "KoeretoejOplysningSkammelBelastning")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSkammelBelastning;
    @XmlElement(name = "KoeretoejOplysningSaettevognTilladtAkselTryk")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSaettevognTilladtAkselTryk;
    @XmlElement(name = "KoeretoejOplysningMaksimumHastighed")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningMaksimumHastighed;
    @XmlElement(name = "KoeretoejOplysningFaelgDaek")
    protected String koeretoejOplysningFaelgDaek;
    @XmlElement(name = "KoeretoejOplysningTilkobletSidevognStelnr")
    protected String koeretoejOplysningTilkobletSidevognStelnr;
    @XmlElement(name = "KoeretoejOplysningNCAPTest")
    protected Boolean koeretoejOplysningNCAPTest;
    @XmlElement(name = "KoeretoejOplysningVVaerdiLuft")
    protected Float koeretoejOplysningVVaerdiLuft;
    @XmlElement(name = "KoeretoejOplysningVVaerdiMekanisk")
    protected Float koeretoejOplysningVVaerdiMekanisk;
    @XmlElement(name = "KoeretoejOplysningOevrigtUdstyr")
    protected String koeretoejOplysningOevrigtUdstyr;
    @XmlElement(name = "KoeretoejOplysningKoeretoejstand")
    @XmlSchemaType(name = "string")
    protected KoeretoejstandType koeretoejOplysningKoeretoejstand;
    @XmlElement(name = "KoeretoejOplysning30PctVarevogn")
    protected Boolean koeretoejOplysning30PctVarevogn;
    @XmlElement(name = "KoeretoejOplysningTraekkendeAksler")
    protected String koeretoejOplysningTraekkendeAksler;
    @XmlElement(name = "KoeretoejOplysningEgnetTilTaxi")
    protected Boolean koeretoejOplysningEgnetTilTaxi;
    @XmlElement(name = "KoeretoejOplysningAkselAfstand")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningAkselAfstand;
    @XmlElement(name = "KoeretoejOplysningSporviddenForrest")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSporviddenForrest;
    @XmlElement(name = "KoeretoejOplysningSporviddenBagest")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningSporviddenBagest;
    @XmlElement(name = "KoeretoejOplysningTypeAnmeldelseNummer")
    protected String koeretoejOplysningTypeAnmeldelseNummer;
    @XmlElement(name = "KoeretoejOplysningTypeGodkendelseNummer")
    protected String koeretoejOplysningTypeGodkendelseNummer;
    @XmlElement(name = "KoeretoejOplysningEUVariant")
    protected String koeretoejOplysningEUVariant;
    @XmlElement(name = "KoeretoejOplysningEUVersion")
    protected String koeretoejOplysningEUVersion;
    @XmlElement(name = "KoeretoejOplysningKommentar")
    protected String koeretoejOplysningKommentar;
    @XmlElement(name = "KoeretoejOplysningTypegodkendtKategori")
    protected String koeretoejOplysningTypegodkendtKategori;
    @XmlElement(name = "KoeretoejOplysningAntalGear")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningAntalGear;
    @XmlElement(name = "KoeretoejOplysningAntalDoere")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejOplysningAntalDoere;
    @XmlElement(name = "KoeretoejOplysningFabrikant")
    protected String koeretoejOplysningFabrikant;
    @XmlElement(name = "KoeretoejOplysningFrikoert")
    protected Boolean koeretoejOplysningFrikoert;
    @XmlElement(name = "KoeretoejOplysningFredetForPladeInddragelse")
    protected Boolean koeretoejOplysningFredetForPladeInddragelse;
    @XmlElement(name = "KoeretoejOplysningVejvenligLuftaffjedring")
    protected Boolean koeretoejOplysningVejvenligLuftaffjedring;
    @XmlElement(name = "KoeretoejOplysningDanskGodkendelseNummer")
    protected String koeretoejOplysningDanskGodkendelseNummer;
    @XmlElement(name = "KoeretoejOplysningAargang")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar koeretoejOplysningAargang;
    @XmlElement(name = "KoeretoejOplysningIbrugtagningDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar koeretoejOplysningIbrugtagningDato;
    @XmlElement(name = "KoeretoejOplysningTrafikskade")
    protected Boolean koeretoejOplysningTrafikskade;
    @XmlElement(name = "KoeretoejOplysningVeteranKoeretoejOriginal")
    protected Boolean koeretoejOplysningVeteranKoeretoejOriginal;
    @XmlElement(name = "KoeretoejFastKombination")
    protected KoeretoejOplysningStrukturType.KoeretoejFastKombination koeretoejFastKombination;
    @XmlElement(name = "KoeretoejBetegnelseStruktur")
    protected KoeretoejBetegnelseStrukturType koeretoejBetegnelseStruktur;
    @XmlElement(name = "KoeretoejFarveStruktur")
    protected KoeretoejFarveStrukturType koeretoejFarveStruktur;
    @XmlElement(name = "KarrosseriTypeStruktur")
    protected KarrosseriTypeStrukturType karrosseriTypeStruktur;
    @XmlElement(name = "KoeretoejSupplerendeKarrosseriSamlingStruktur")
    protected KoeretoejSupplerendeKarrosseriSamlingStrukturType koeretoejSupplerendeKarrosseriSamlingStruktur;
    @XmlElement(name = "KoeretoejNormStruktur")
    protected KoeretoejNormStrukturType koeretoejNormStruktur;
    @XmlElement(name = "KoeretoejMiljoeOplysningStruktur")
    protected KoeretoejMiljoeOplysningStrukturType koeretoejMiljoeOplysningStruktur;
    @XmlElement(name = "KoeretoejMotorStruktur")
    protected KoeretoejMotorStrukturType koeretoejMotorStruktur;
    @XmlElement(name = "DispensationTypeSamlingStruktur")
    protected DispensationTypeSamlingStrukturType dispensationTypeSamlingStruktur;
    @XmlElement(name = "KoeretoejUdstyrSamlingStruktur")
    protected KoeretoejUdstyrSamlingStrukturType koeretoejUdstyrSamlingStruktur;
    @XmlElement(name = "KoeretoejBlokeringAarsagListeStruktur")
    protected KoeretoejBlokeringAarsagListeStrukturType koeretoejBlokeringAarsagListeStruktur;
    @XmlElement(name = "PrisOplysningerStruktur")
    protected PrisOplysningerStrukturType prisOplysningerStruktur;

    /**
     * Gets the value of the koeretoejOplysningOprettetUdFra property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejOplysningOprettetUdFraType }
     *     
     */
    public KoeretoejOplysningOprettetUdFraType getKoeretoejOplysningOprettetUdFra() {
        return koeretoejOplysningOprettetUdFra;
    }

    /**
     * Sets the value of the koeretoejOplysningOprettetUdFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejOplysningOprettetUdFraType }
     *     
     */
    public void setKoeretoejOplysningOprettetUdFra(KoeretoejOplysningOprettetUdFraType value) {
        this.koeretoejOplysningOprettetUdFra = value;
    }

    /**
     * Gets the value of the koeretoejOplysningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejOplysningStatusType }
     *     
     */
    public KoeretoejOplysningStatusType getKoeretoejOplysningStatus() {
        return koeretoejOplysningStatus;
    }

    /**
     * Sets the value of the koeretoejOplysningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejOplysningStatusType }
     *     
     */
    public void setKoeretoejOplysningStatus(KoeretoejOplysningStatusType value) {
        this.koeretoejOplysningStatus = value;
    }

    /**
     * Gets the value of the koeretoejOplysningStatusDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejOplysningStatusDato() {
        return koeretoejOplysningStatusDato;
    }

    /**
     * Sets the value of the koeretoejOplysningStatusDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejOplysningStatusDato(XMLGregorianCalendar value) {
        this.koeretoejOplysningStatusDato = value;
    }

    /**
     * Gets the value of the koeretoejOplysningFoersteRegistreringDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejOplysningFoersteRegistreringDato() {
        return koeretoejOplysningFoersteRegistreringDato;
    }

    /**
     * Sets the value of the koeretoejOplysningFoersteRegistreringDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejOplysningFoersteRegistreringDato(XMLGregorianCalendar value) {
        this.koeretoejOplysningFoersteRegistreringDato = value;
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

    /**
     * Gets the value of the koeretoejOplysningStelNummerAnbringelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningStelNummerAnbringelse() {
        return koeretoejOplysningStelNummerAnbringelse;
    }

    /**
     * Sets the value of the koeretoejOplysningStelNummerAnbringelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningStelNummerAnbringelse(String value) {
        this.koeretoejOplysningStelNummerAnbringelse = value;
    }

    /**
     * Gets the value of the koeretoejOplysningModelAar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKoeretoejOplysningModelAar() {
        return koeretoejOplysningModelAar;
    }

    /**
     * Sets the value of the koeretoejOplysningModelAar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKoeretoejOplysningModelAar(Integer value) {
        this.koeretoejOplysningModelAar = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTotalVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningTotalVaegt() {
        return koeretoejOplysningTotalVaegt;
    }

    /**
     * Sets the value of the koeretoejOplysningTotalVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningTotalVaegt(Long value) {
        this.koeretoejOplysningTotalVaegt = value;
    }

    /**
     * Gets the value of the koeretoejOplysningEgenVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningEgenVaegt() {
        return koeretoejOplysningEgenVaegt;
    }

    /**
     * Sets the value of the koeretoejOplysningEgenVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningEgenVaegt(Long value) {
        this.koeretoejOplysningEgenVaegt = value;
    }

    /**
     * Gets the value of the koeretoejOplysningKoereklarVaegtMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningKoereklarVaegtMinimum() {
        return koeretoejOplysningKoereklarVaegtMinimum;
    }

    /**
     * Sets the value of the koeretoejOplysningKoereklarVaegtMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningKoereklarVaegtMinimum(Long value) {
        this.koeretoejOplysningKoereklarVaegtMinimum = value;
    }

    /**
     * Gets the value of the koeretoejOplysningKoereklarVaegtMaksimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningKoereklarVaegtMaksimum() {
        return koeretoejOplysningKoereklarVaegtMaksimum;
    }

    /**
     * Sets the value of the koeretoejOplysningKoereklarVaegtMaksimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningKoereklarVaegtMaksimum(Long value) {
        this.koeretoejOplysningKoereklarVaegtMaksimum = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTekniskTotalVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningTekniskTotalVaegt() {
        return koeretoejOplysningTekniskTotalVaegt;
    }

    /**
     * Sets the value of the koeretoejOplysningTekniskTotalVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningTekniskTotalVaegt(Long value) {
        this.koeretoejOplysningTekniskTotalVaegt = value;
    }

    /**
     * Gets the value of the koeretoejOplysningVogntogVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningVogntogVaegt() {
        return koeretoejOplysningVogntogVaegt;
    }

    /**
     * Sets the value of the koeretoejOplysningVogntogVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningVogntogVaegt(Long value) {
        this.koeretoejOplysningVogntogVaegt = value;
    }

    /**
     * Gets the value of the koeretoejOplysningAkselAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningAkselAntal() {
        return koeretoejOplysningAkselAntal;
    }

    /**
     * Sets the value of the koeretoejOplysningAkselAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningAkselAntal(Long value) {
        this.koeretoejOplysningAkselAntal = value;
    }

    /**
     * Gets the value of the koeretoejOplysningStoersteAkselTryk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningStoersteAkselTryk() {
        return koeretoejOplysningStoersteAkselTryk;
    }

    /**
     * Sets the value of the koeretoejOplysningStoersteAkselTryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningStoersteAkselTryk(Long value) {
        this.koeretoejOplysningStoersteAkselTryk = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSkatteAkselAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSkatteAkselAntal() {
        return koeretoejOplysningSkatteAkselAntal;
    }

    /**
     * Sets the value of the koeretoejOplysningSkatteAkselAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSkatteAkselAntal(Long value) {
        this.koeretoejOplysningSkatteAkselAntal = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSkatteAkselTryk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSkatteAkselTryk() {
        return koeretoejOplysningSkatteAkselTryk;
    }

    /**
     * Sets the value of the koeretoejOplysningSkatteAkselTryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSkatteAkselTryk(Long value) {
        this.koeretoejOplysningSkatteAkselTryk = value;
    }

    /**
     * Gets the value of the koeretoejOplysningPassagerAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningPassagerAntal() {
        return koeretoejOplysningPassagerAntal;
    }

    /**
     * Sets the value of the koeretoejOplysningPassagerAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningPassagerAntal(Long value) {
        this.koeretoejOplysningPassagerAntal = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSiddepladserMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSiddepladserMinimum() {
        return koeretoejOplysningSiddepladserMinimum;
    }

    /**
     * Sets the value of the koeretoejOplysningSiddepladserMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSiddepladserMinimum(Long value) {
        this.koeretoejOplysningSiddepladserMinimum = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSiddepladserMaksimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSiddepladserMaksimum() {
        return koeretoejOplysningSiddepladserMaksimum;
    }

    /**
     * Sets the value of the koeretoejOplysningSiddepladserMaksimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSiddepladserMaksimum(Long value) {
        this.koeretoejOplysningSiddepladserMaksimum = value;
    }

    /**
     * Gets the value of the koeretoejOplysningStaapladserMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningStaapladserMinimum() {
        return koeretoejOplysningStaapladserMinimum;
    }

    /**
     * Sets the value of the koeretoejOplysningStaapladserMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningStaapladserMinimum(Long value) {
        this.koeretoejOplysningStaapladserMinimum = value;
    }

    /**
     * Gets the value of the koeretoejOplysningStaapladserMaksimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningStaapladserMaksimum() {
        return koeretoejOplysningStaapladserMaksimum;
    }

    /**
     * Sets the value of the koeretoejOplysningStaapladserMaksimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningStaapladserMaksimum(Long value) {
        this.koeretoejOplysningStaapladserMaksimum = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTilkoblingMulighed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningTilkoblingMulighed() {
        return koeretoejOplysningTilkoblingMulighed;
    }

    /**
     * Sets the value of the koeretoejOplysningTilkoblingMulighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningTilkoblingMulighed(Boolean value) {
        this.koeretoejOplysningTilkoblingMulighed = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTilkoblingsvaegtUdenBremser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningTilkoblingsvaegtUdenBremser() {
        return koeretoejOplysningTilkoblingsvaegtUdenBremser;
    }

    /**
     * Sets the value of the koeretoejOplysningTilkoblingsvaegtUdenBremser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningTilkoblingsvaegtUdenBremser(Long value) {
        this.koeretoejOplysningTilkoblingsvaegtUdenBremser = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTilkoblingsvaegtMedBremser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningTilkoblingsvaegtMedBremser() {
        return koeretoejOplysningTilkoblingsvaegtMedBremser;
    }

    /**
     * Sets the value of the koeretoejOplysningTilkoblingsvaegtMedBremser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningTilkoblingsvaegtMedBremser(Long value) {
        this.koeretoejOplysningTilkoblingsvaegtMedBremser = value;
    }

    /**
     * Gets the value of the koeretoejOplysningPaahaengVognTotalVaegt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningPaahaengVognTotalVaegt() {
        return koeretoejOplysningPaahaengVognTotalVaegt;
    }

    /**
     * Sets the value of the koeretoejOplysningPaahaengVognTotalVaegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningPaahaengVognTotalVaegt(Long value) {
        this.koeretoejOplysningPaahaengVognTotalVaegt = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSkammelBelastning property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSkammelBelastning() {
        return koeretoejOplysningSkammelBelastning;
    }

    /**
     * Sets the value of the koeretoejOplysningSkammelBelastning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSkammelBelastning(Long value) {
        this.koeretoejOplysningSkammelBelastning = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSaettevognTilladtAkselTryk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSaettevognTilladtAkselTryk() {
        return koeretoejOplysningSaettevognTilladtAkselTryk;
    }

    /**
     * Sets the value of the koeretoejOplysningSaettevognTilladtAkselTryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSaettevognTilladtAkselTryk(Long value) {
        this.koeretoejOplysningSaettevognTilladtAkselTryk = value;
    }

    /**
     * Gets the value of the koeretoejOplysningMaksimumHastighed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningMaksimumHastighed() {
        return koeretoejOplysningMaksimumHastighed;
    }

    /**
     * Sets the value of the koeretoejOplysningMaksimumHastighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningMaksimumHastighed(Long value) {
        this.koeretoejOplysningMaksimumHastighed = value;
    }

    /**
     * Gets the value of the koeretoejOplysningFaelgDaek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningFaelgDaek() {
        return koeretoejOplysningFaelgDaek;
    }

    /**
     * Sets the value of the koeretoejOplysningFaelgDaek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningFaelgDaek(String value) {
        this.koeretoejOplysningFaelgDaek = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTilkobletSidevognStelnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningTilkobletSidevognStelnr() {
        return koeretoejOplysningTilkobletSidevognStelnr;
    }

    /**
     * Sets the value of the koeretoejOplysningTilkobletSidevognStelnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningTilkobletSidevognStelnr(String value) {
        this.koeretoejOplysningTilkobletSidevognStelnr = value;
    }

    /**
     * Gets the value of the koeretoejOplysningNCAPTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningNCAPTest() {
        return koeretoejOplysningNCAPTest;
    }

    /**
     * Sets the value of the koeretoejOplysningNCAPTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningNCAPTest(Boolean value) {
        this.koeretoejOplysningNCAPTest = value;
    }

    /**
     * Gets the value of the koeretoejOplysningVVaerdiLuft property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejOplysningVVaerdiLuft() {
        return koeretoejOplysningVVaerdiLuft;
    }

    /**
     * Sets the value of the koeretoejOplysningVVaerdiLuft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejOplysningVVaerdiLuft(Float value) {
        this.koeretoejOplysningVVaerdiLuft = value;
    }

    /**
     * Gets the value of the koeretoejOplysningVVaerdiMekanisk property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejOplysningVVaerdiMekanisk() {
        return koeretoejOplysningVVaerdiMekanisk;
    }

    /**
     * Sets the value of the koeretoejOplysningVVaerdiMekanisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejOplysningVVaerdiMekanisk(Float value) {
        this.koeretoejOplysningVVaerdiMekanisk = value;
    }

    /**
     * Gets the value of the koeretoejOplysningOevrigtUdstyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningOevrigtUdstyr() {
        return koeretoejOplysningOevrigtUdstyr;
    }

    /**
     * Sets the value of the koeretoejOplysningOevrigtUdstyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningOevrigtUdstyr(String value) {
        this.koeretoejOplysningOevrigtUdstyr = value;
    }

    /**
     * Gets the value of the koeretoejOplysningKoeretoejstand property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejstandType }
     *     
     */
    public KoeretoejstandType getKoeretoejOplysningKoeretoejstand() {
        return koeretoejOplysningKoeretoejstand;
    }

    /**
     * Sets the value of the koeretoejOplysningKoeretoejstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejstandType }
     *     
     */
    public void setKoeretoejOplysningKoeretoejstand(KoeretoejstandType value) {
        this.koeretoejOplysningKoeretoejstand = value;
    }

    /**
     * Gets the value of the koeretoejOplysning30PctVarevogn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysning30PctVarevogn() {
        return koeretoejOplysning30PctVarevogn;
    }

    /**
     * Sets the value of the koeretoejOplysning30PctVarevogn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysning30PctVarevogn(Boolean value) {
        this.koeretoejOplysning30PctVarevogn = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTraekkendeAksler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningTraekkendeAksler() {
        return koeretoejOplysningTraekkendeAksler;
    }

    /**
     * Sets the value of the koeretoejOplysningTraekkendeAksler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningTraekkendeAksler(String value) {
        this.koeretoejOplysningTraekkendeAksler = value;
    }

    /**
     * Gets the value of the koeretoejOplysningEgnetTilTaxi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningEgnetTilTaxi() {
        return koeretoejOplysningEgnetTilTaxi;
    }

    /**
     * Sets the value of the koeretoejOplysningEgnetTilTaxi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningEgnetTilTaxi(Boolean value) {
        this.koeretoejOplysningEgnetTilTaxi = value;
    }

    /**
     * Gets the value of the koeretoejOplysningAkselAfstand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningAkselAfstand() {
        return koeretoejOplysningAkselAfstand;
    }

    /**
     * Sets the value of the koeretoejOplysningAkselAfstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningAkselAfstand(Long value) {
        this.koeretoejOplysningAkselAfstand = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSporviddenForrest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSporviddenForrest() {
        return koeretoejOplysningSporviddenForrest;
    }

    /**
     * Sets the value of the koeretoejOplysningSporviddenForrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSporviddenForrest(Long value) {
        this.koeretoejOplysningSporviddenForrest = value;
    }

    /**
     * Gets the value of the koeretoejOplysningSporviddenBagest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningSporviddenBagest() {
        return koeretoejOplysningSporviddenBagest;
    }

    /**
     * Sets the value of the koeretoejOplysningSporviddenBagest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningSporviddenBagest(Long value) {
        this.koeretoejOplysningSporviddenBagest = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTypeAnmeldelseNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningTypeAnmeldelseNummer() {
        return koeretoejOplysningTypeAnmeldelseNummer;
    }

    /**
     * Sets the value of the koeretoejOplysningTypeAnmeldelseNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningTypeAnmeldelseNummer(String value) {
        this.koeretoejOplysningTypeAnmeldelseNummer = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTypeGodkendelseNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningTypeGodkendelseNummer() {
        return koeretoejOplysningTypeGodkendelseNummer;
    }

    /**
     * Sets the value of the koeretoejOplysningTypeGodkendelseNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningTypeGodkendelseNummer(String value) {
        this.koeretoejOplysningTypeGodkendelseNummer = value;
    }

    /**
     * Gets the value of the koeretoejOplysningEUVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningEUVariant() {
        return koeretoejOplysningEUVariant;
    }

    /**
     * Sets the value of the koeretoejOplysningEUVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningEUVariant(String value) {
        this.koeretoejOplysningEUVariant = value;
    }

    /**
     * Gets the value of the koeretoejOplysningEUVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningEUVersion() {
        return koeretoejOplysningEUVersion;
    }

    /**
     * Sets the value of the koeretoejOplysningEUVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningEUVersion(String value) {
        this.koeretoejOplysningEUVersion = value;
    }

    /**
     * Gets the value of the koeretoejOplysningKommentar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningKommentar() {
        return koeretoejOplysningKommentar;
    }

    /**
     * Sets the value of the koeretoejOplysningKommentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningKommentar(String value) {
        this.koeretoejOplysningKommentar = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTypegodkendtKategori property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningTypegodkendtKategori() {
        return koeretoejOplysningTypegodkendtKategori;
    }

    /**
     * Sets the value of the koeretoejOplysningTypegodkendtKategori property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningTypegodkendtKategori(String value) {
        this.koeretoejOplysningTypegodkendtKategori = value;
    }

    /**
     * Gets the value of the koeretoejOplysningAntalGear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningAntalGear() {
        return koeretoejOplysningAntalGear;
    }

    /**
     * Sets the value of the koeretoejOplysningAntalGear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningAntalGear(Long value) {
        this.koeretoejOplysningAntalGear = value;
    }

    /**
     * Gets the value of the koeretoejOplysningAntalDoere property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejOplysningAntalDoere() {
        return koeretoejOplysningAntalDoere;
    }

    /**
     * Sets the value of the koeretoejOplysningAntalDoere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejOplysningAntalDoere(Long value) {
        this.koeretoejOplysningAntalDoere = value;
    }

    /**
     * Gets the value of the koeretoejOplysningFabrikant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningFabrikant() {
        return koeretoejOplysningFabrikant;
    }

    /**
     * Sets the value of the koeretoejOplysningFabrikant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningFabrikant(String value) {
        this.koeretoejOplysningFabrikant = value;
    }

    /**
     * Gets the value of the koeretoejOplysningFrikoert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningFrikoert() {
        return koeretoejOplysningFrikoert;
    }

    /**
     * Sets the value of the koeretoejOplysningFrikoert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningFrikoert(Boolean value) {
        this.koeretoejOplysningFrikoert = value;
    }

    /**
     * Gets the value of the koeretoejOplysningFredetForPladeInddragelse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningFredetForPladeInddragelse() {
        return koeretoejOplysningFredetForPladeInddragelse;
    }

    /**
     * Sets the value of the koeretoejOplysningFredetForPladeInddragelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningFredetForPladeInddragelse(Boolean value) {
        this.koeretoejOplysningFredetForPladeInddragelse = value;
    }

    /**
     * Gets the value of the koeretoejOplysningVejvenligLuftaffjedring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningVejvenligLuftaffjedring() {
        return koeretoejOplysningVejvenligLuftaffjedring;
    }

    /**
     * Sets the value of the koeretoejOplysningVejvenligLuftaffjedring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningVejvenligLuftaffjedring(Boolean value) {
        this.koeretoejOplysningVejvenligLuftaffjedring = value;
    }

    /**
     * Gets the value of the koeretoejOplysningDanskGodkendelseNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejOplysningDanskGodkendelseNummer() {
        return koeretoejOplysningDanskGodkendelseNummer;
    }

    /**
     * Sets the value of the koeretoejOplysningDanskGodkendelseNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejOplysningDanskGodkendelseNummer(String value) {
        this.koeretoejOplysningDanskGodkendelseNummer = value;
    }

    /**
     * Gets the value of the koeretoejOplysningAargang property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejOplysningAargang() {
        return koeretoejOplysningAargang;
    }

    /**
     * Sets the value of the koeretoejOplysningAargang property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejOplysningAargang(XMLGregorianCalendar value) {
        this.koeretoejOplysningAargang = value;
    }

    /**
     * Gets the value of the koeretoejOplysningIbrugtagningDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejOplysningIbrugtagningDato() {
        return koeretoejOplysningIbrugtagningDato;
    }

    /**
     * Sets the value of the koeretoejOplysningIbrugtagningDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejOplysningIbrugtagningDato(XMLGregorianCalendar value) {
        this.koeretoejOplysningIbrugtagningDato = value;
    }

    /**
     * Gets the value of the koeretoejOplysningTrafikskade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningTrafikskade() {
        return koeretoejOplysningTrafikskade;
    }

    /**
     * Sets the value of the koeretoejOplysningTrafikskade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningTrafikskade(Boolean value) {
        this.koeretoejOplysningTrafikskade = value;
    }

    /**
     * Gets the value of the koeretoejOplysningVeteranKoeretoejOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejOplysningVeteranKoeretoejOriginal() {
        return koeretoejOplysningVeteranKoeretoejOriginal;
    }

    /**
     * Sets the value of the koeretoejOplysningVeteranKoeretoejOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejOplysningVeteranKoeretoejOriginal(Boolean value) {
        this.koeretoejOplysningVeteranKoeretoejOriginal = value;
    }

    /**
     * Gets the value of the koeretoejFastKombination property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejOplysningStrukturType.KoeretoejFastKombination }
     *     
     */
    public KoeretoejOplysningStrukturType.KoeretoejFastKombination getKoeretoejFastKombination() {
        return koeretoejFastKombination;
    }

    /**
     * Sets the value of the koeretoejFastKombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejOplysningStrukturType.KoeretoejFastKombination }
     *     
     */
    public void setKoeretoejFastKombination(KoeretoejOplysningStrukturType.KoeretoejFastKombination value) {
        this.koeretoejFastKombination = value;
    }

    /**
     * Gets the value of the koeretoejBetegnelseStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBetegnelseStrukturType }
     *     
     */
    public KoeretoejBetegnelseStrukturType getKoeretoejBetegnelseStruktur() {
        return koeretoejBetegnelseStruktur;
    }

    /**
     * Sets the value of the koeretoejBetegnelseStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBetegnelseStrukturType }
     *     
     */
    public void setKoeretoejBetegnelseStruktur(KoeretoejBetegnelseStrukturType value) {
        this.koeretoejBetegnelseStruktur = value;
    }

    /**
     * Gets the value of the koeretoejFarveStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejFarveStrukturType }
     *     
     */
    public KoeretoejFarveStrukturType getKoeretoejFarveStruktur() {
        return koeretoejFarveStruktur;
    }

    /**
     * Sets the value of the koeretoejFarveStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejFarveStrukturType }
     *     
     */
    public void setKoeretoejFarveStruktur(KoeretoejFarveStrukturType value) {
        this.koeretoejFarveStruktur = value;
    }

    /**
     * Gets the value of the karrosseriTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KarrosseriTypeStrukturType }
     *     
     */
    public KarrosseriTypeStrukturType getKarrosseriTypeStruktur() {
        return karrosseriTypeStruktur;
    }

    /**
     * Sets the value of the karrosseriTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KarrosseriTypeStrukturType }
     *     
     */
    public void setKarrosseriTypeStruktur(KarrosseriTypeStrukturType value) {
        this.karrosseriTypeStruktur = value;
    }

    /**
     * Gets the value of the koeretoejSupplerendeKarrosseriSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType }
     *     
     */
    public KoeretoejSupplerendeKarrosseriSamlingStrukturType getKoeretoejSupplerendeKarrosseriSamlingStruktur() {
        return koeretoejSupplerendeKarrosseriSamlingStruktur;
    }

    /**
     * Sets the value of the koeretoejSupplerendeKarrosseriSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejSupplerendeKarrosseriSamlingStrukturType }
     *     
     */
    public void setKoeretoejSupplerendeKarrosseriSamlingStruktur(KoeretoejSupplerendeKarrosseriSamlingStrukturType value) {
        this.koeretoejSupplerendeKarrosseriSamlingStruktur = value;
    }

    /**
     * Gets the value of the koeretoejNormStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejNormStrukturType }
     *     
     */
    public KoeretoejNormStrukturType getKoeretoejNormStruktur() {
        return koeretoejNormStruktur;
    }

    /**
     * Sets the value of the koeretoejNormStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejNormStrukturType }
     *     
     */
    public void setKoeretoejNormStruktur(KoeretoejNormStrukturType value) {
        this.koeretoejNormStruktur = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejMiljoeOplysningStrukturType }
     *     
     */
    public KoeretoejMiljoeOplysningStrukturType getKoeretoejMiljoeOplysningStruktur() {
        return koeretoejMiljoeOplysningStruktur;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejMiljoeOplysningStrukturType }
     *     
     */
    public void setKoeretoejMiljoeOplysningStruktur(KoeretoejMiljoeOplysningStrukturType value) {
        this.koeretoejMiljoeOplysningStruktur = value;
    }

    /**
     * Gets the value of the koeretoejMotorStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejMotorStrukturType }
     *     
     */
    public KoeretoejMotorStrukturType getKoeretoejMotorStruktur() {
        return koeretoejMotorStruktur;
    }

    /**
     * Sets the value of the koeretoejMotorStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejMotorStrukturType }
     *     
     */
    public void setKoeretoejMotorStruktur(KoeretoejMotorStrukturType value) {
        this.koeretoejMotorStruktur = value;
    }

    /**
     * Gets the value of the dispensationTypeSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link DispensationTypeSamlingStrukturType }
     *     
     */
    public DispensationTypeSamlingStrukturType getDispensationTypeSamlingStruktur() {
        return dispensationTypeSamlingStruktur;
    }

    /**
     * Sets the value of the dispensationTypeSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispensationTypeSamlingStrukturType }
     *     
     */
    public void setDispensationTypeSamlingStruktur(DispensationTypeSamlingStrukturType value) {
        this.dispensationTypeSamlingStruktur = value;
    }

    /**
     * Gets the value of the koeretoejUdstyrSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejUdstyrSamlingStrukturType }
     *     
     */
    public KoeretoejUdstyrSamlingStrukturType getKoeretoejUdstyrSamlingStruktur() {
        return koeretoejUdstyrSamlingStruktur;
    }

    /**
     * Sets the value of the koeretoejUdstyrSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejUdstyrSamlingStrukturType }
     *     
     */
    public void setKoeretoejUdstyrSamlingStruktur(KoeretoejUdstyrSamlingStrukturType value) {
        this.koeretoejUdstyrSamlingStruktur = value;
    }

    /**
     * Gets the value of the koeretoejBlokeringAarsagListeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejBlokeringAarsagListeStrukturType }
     *     
     */
    public KoeretoejBlokeringAarsagListeStrukturType getKoeretoejBlokeringAarsagListeStruktur() {
        return koeretoejBlokeringAarsagListeStruktur;
    }

    /**
     * Sets the value of the koeretoejBlokeringAarsagListeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejBlokeringAarsagListeStrukturType }
     *     
     */
    public void setKoeretoejBlokeringAarsagListeStruktur(KoeretoejBlokeringAarsagListeStrukturType value) {
        this.koeretoejBlokeringAarsagListeStruktur = value;
    }

    /**
     * Gets the value of the prisOplysningerStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link PrisOplysningerStrukturType }
     *     
     */
    public PrisOplysningerStrukturType getPrisOplysningerStruktur() {
        return prisOplysningerStruktur;
    }

    /**
     * Sets the value of the prisOplysningerStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrisOplysningerStrukturType }
     *     
     */
    public void setPrisOplysningerStruktur(PrisOplysningerStrukturType value) {
        this.prisOplysningerStruktur = value;
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
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer" minOccurs="0"/&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerIdent" minOccurs="0"/&gt;
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
        "koeretoejIdent",
        "registreringNummerNummer",
        "registreringNummerIdent"
    })
    public static class KoeretoejFastKombination {

        @XmlElement(name = "KoeretoejIdent", required = true)
        protected BigInteger koeretoejIdent;
        @XmlElement(name = "RegistreringNummerNummer")
        protected String registreringNummerNummer;
        @XmlElement(name = "RegistreringNummerIdent")
        @XmlSchemaType(name = "integer")
        protected Long registreringNummerIdent;

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
         * Gets the value of the registreringNummerIdent property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRegistreringNummerIdent() {
            return registreringNummerIdent;
        }

        /**
         * Sets the value of the registreringNummerIdent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRegistreringNummerIdent(Long value) {
            this.registreringNummerIdent = value;
        }

    }

}
