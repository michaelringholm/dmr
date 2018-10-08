
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejRegistreringGrundlagStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejRegistreringGrundlagStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="100"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagUnderUdarbejdelse"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagFastlagt"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagGyldigt"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagForældet"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagUgyldigt"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagTilknyttetRegistrering"/&gt;
 *     &lt;enumeration value="RegistreringsgrundlagMidlertidigViaForespørgsel"/&gt;
 *     &lt;whiteSpace value="preserve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejRegistreringGrundlagStatusType")
@XmlEnum
public enum KoeretoejRegistreringGrundlagStatusType {

    @XmlEnumValue("RegistreringsgrundlagUnderUdarbejdelse")
    REGISTRERINGSGRUNDLAG_UNDER_UDARBEJDELSE("RegistreringsgrundlagUnderUdarbejdelse"),
    @XmlEnumValue("RegistreringsgrundlagFastlagt")
    REGISTRERINGSGRUNDLAG_FASTLAGT("RegistreringsgrundlagFastlagt"),
    @XmlEnumValue("RegistreringsgrundlagGyldigt")
    REGISTRERINGSGRUNDLAG_GYLDIGT("RegistreringsgrundlagGyldigt"),
    @XmlEnumValue("RegistreringsgrundlagFor\u00e6ldet")
    REGISTRERINGSGRUNDLAG_FORÆLDET("RegistreringsgrundlagFor\u00e6ldet"),
    @XmlEnumValue("RegistreringsgrundlagUgyldigt")
    REGISTRERINGSGRUNDLAG_UGYLDIGT("RegistreringsgrundlagUgyldigt"),
    @XmlEnumValue("RegistreringsgrundlagTilknyttetRegistrering")
    REGISTRERINGSGRUNDLAG_TILKNYTTET_REGISTRERING("RegistreringsgrundlagTilknyttetRegistrering"),
    @XmlEnumValue("RegistreringsgrundlagMidlertidigViaForesp\u00f8rgsel")
    REGISTRERINGSGRUNDLAG_MIDLERTIDIG_VIA_FORESPØRGSEL("RegistreringsgrundlagMidlertidigViaForesp\u00f8rgsel");
    private final String value;

    KoeretoejRegistreringGrundlagStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejRegistreringGrundlagStatusType fromValue(String v) {
        for (KoeretoejRegistreringGrundlagStatusType c: KoeretoejRegistreringGrundlagStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
