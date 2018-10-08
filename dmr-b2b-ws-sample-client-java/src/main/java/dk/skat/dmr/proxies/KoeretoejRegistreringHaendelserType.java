
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejRegistreringHaendelserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejRegistreringHaendelserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="50"/&gt;
 *     &lt;enumeration value="Registrering"/&gt;
 *     &lt;enumeration value="EjerBrugerskifte"/&gt;
 *     &lt;enumeration value="Afmelding"/&gt;
 *     &lt;enumeration value="TilbagedateretRegistrering"/&gt;
 *     &lt;enumeration value="TilbagedateretEjerBrugerskifte"/&gt;
 *     &lt;enumeration value="TilbagedateretAfmelding"/&gt;
 *     &lt;enumeration value="TilbagedateringEksisterendeRegistrering"/&gt;
 *     &lt;enumeration value="TilbagedateringEksisterendeEjerBrugerskifte"/&gt;
 *     &lt;enumeration value="TilbagedateringEksisterendeAfmelding"/&gt;
 *     &lt;enumeration value="AnnulleringRegistrering"/&gt;
 *     &lt;enumeration value="AnnulleringEjerBrugerskifte"/&gt;
 *     &lt;enumeration value="AnnulleringAfmelding"/&gt;
 *     &lt;enumeration value="KonverteretRegistrering"/&gt;
 *     &lt;enumeration value="Pladeskift"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejRegistreringHaendelserType")
@XmlEnum
public enum KoeretoejRegistreringHaendelserType {

    @XmlEnumValue("Registrering")
    REGISTRERING("Registrering"),
    @XmlEnumValue("EjerBrugerskifte")
    EJER_BRUGERSKIFTE("EjerBrugerskifte"),
    @XmlEnumValue("Afmelding")
    AFMELDING("Afmelding"),
    @XmlEnumValue("TilbagedateretRegistrering")
    TILBAGEDATERET_REGISTRERING("TilbagedateretRegistrering"),
    @XmlEnumValue("TilbagedateretEjerBrugerskifte")
    TILBAGEDATERET_EJER_BRUGERSKIFTE("TilbagedateretEjerBrugerskifte"),
    @XmlEnumValue("TilbagedateretAfmelding")
    TILBAGEDATERET_AFMELDING("TilbagedateretAfmelding"),
    @XmlEnumValue("TilbagedateringEksisterendeRegistrering")
    TILBAGEDATERING_EKSISTERENDE_REGISTRERING("TilbagedateringEksisterendeRegistrering"),
    @XmlEnumValue("TilbagedateringEksisterendeEjerBrugerskifte")
    TILBAGEDATERING_EKSISTERENDE_EJER_BRUGERSKIFTE("TilbagedateringEksisterendeEjerBrugerskifte"),
    @XmlEnumValue("TilbagedateringEksisterendeAfmelding")
    TILBAGEDATERING_EKSISTERENDE_AFMELDING("TilbagedateringEksisterendeAfmelding"),
    @XmlEnumValue("AnnulleringRegistrering")
    ANNULLERING_REGISTRERING("AnnulleringRegistrering"),
    @XmlEnumValue("AnnulleringEjerBrugerskifte")
    ANNULLERING_EJER_BRUGERSKIFTE("AnnulleringEjerBrugerskifte"),
    @XmlEnumValue("AnnulleringAfmelding")
    ANNULLERING_AFMELDING("AnnulleringAfmelding"),
    @XmlEnumValue("KonverteretRegistrering")
    KONVERTERET_REGISTRERING("KonverteretRegistrering"),
    @XmlEnumValue("Pladeskift")
    PLADESKIFT("Pladeskift");
    private final String value;

    KoeretoejRegistreringHaendelserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejRegistreringHaendelserType fromValue(String v) {
        for (KoeretoejRegistreringHaendelserType c: KoeretoejRegistreringHaendelserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
