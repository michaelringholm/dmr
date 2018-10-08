
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejOplysningStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejOplysningStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="100"/&gt;
 *     &lt;enumeration value="UnderOprettelse"/&gt;
 *     &lt;enumeration value="Oprettet"/&gt;
 *     &lt;enumeration value="Registreret"/&gt;
 *     &lt;enumeration value="Afmeldt"/&gt;
 *     &lt;enumeration value="Eksportmarkering"/&gt;
 *     &lt;enumeration value="Skrottet"/&gt;
 *     &lt;enumeration value="Eksporteret"/&gt;
 *     &lt;enumeration value="AdministrativOprettelse"/&gt;
 *     &lt;enumeration value="Erklæretafimportør"/&gt;
 *     &lt;enumeration value="Erklæretafimportørogforhandler"/&gt;
 *     &lt;enumeration value="Slettet"/&gt;
 *     &lt;enumeration value="HarGennemførtRegistreringssyn"/&gt;
 *     &lt;enumeration value="DelvistOprettet"/&gt;
 *     &lt;whiteSpace value="preserve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejOplysningStatusType")
@XmlEnum
public enum KoeretoejOplysningStatusType {

    @XmlEnumValue("UnderOprettelse")
    UNDER_OPRETTELSE("UnderOprettelse"),
    @XmlEnumValue("Oprettet")
    OPRETTET("Oprettet"),
    @XmlEnumValue("Registreret")
    REGISTRERET("Registreret"),
    @XmlEnumValue("Afmeldt")
    AFMELDT("Afmeldt"),
    @XmlEnumValue("Eksportmarkering")
    EKSPORTMARKERING("Eksportmarkering"),
    @XmlEnumValue("Skrottet")
    SKROTTET("Skrottet"),
    @XmlEnumValue("Eksporteret")
    EKSPORTERET("Eksporteret"),
    @XmlEnumValue("AdministrativOprettelse")
    ADMINISTRATIV_OPRETTELSE("AdministrativOprettelse"),
    @XmlEnumValue("Erkl\u00e6retafimport\u00f8r")
    ERKLÆRETAFIMPORTØR("Erkl\u00e6retafimport\u00f8r"),
    @XmlEnumValue("Erkl\u00e6retafimport\u00f8rogforhandler")
    ERKLÆRETAFIMPORTØROGFORHANDLER("Erkl\u00e6retafimport\u00f8rogforhandler"),
    @XmlEnumValue("Slettet")
    SLETTET("Slettet"),
    @XmlEnumValue("HarGennemf\u00f8rtRegistreringssyn")
    HAR_GENNEMFØRT_REGISTRERINGSSYN("HarGennemf\u00f8rtRegistreringssyn"),
    @XmlEnumValue("DelvistOprettet")
    DELVIST_OPRETTET("DelvistOprettet");
    private final String value;

    KoeretoejOplysningStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejOplysningStatusType fromValue(String v) {
        for (KoeretoejOplysningStatusType c: KoeretoejOplysningStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
