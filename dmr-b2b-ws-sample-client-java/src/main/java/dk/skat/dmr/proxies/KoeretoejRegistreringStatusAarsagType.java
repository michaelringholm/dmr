
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejRegistreringStatusAarsagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejRegistreringStatusAarsagType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;enumeration value="IkkeRelevant"/&gt;
 *     &lt;enumeration value="RegistreretAlmindeligt"/&gt;
 *     &lt;enumeration value="AfmeldtAlmindeligt"/&gt;
 *     &lt;enumeration value="AfmeldtGrundetMangler"/&gt;
 *     &lt;enumeration value="NummerpladerOverførtTilAndetKøretøj"/&gt;
 *     &lt;enumeration value="AfmeldtUdenAfleveringAfNummerplader"/&gt;
 *     &lt;enumeration value="KlargøringTilRegistrering"/&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejRegistreringStatusAarsagType")
@XmlEnum
public enum KoeretoejRegistreringStatusAarsagType {

    @XmlEnumValue("IkkeRelevant")
    IKKE_RELEVANT("IkkeRelevant"),
    @XmlEnumValue("RegistreretAlmindeligt")
    REGISTRERET_ALMINDELIGT("RegistreretAlmindeligt"),
    @XmlEnumValue("AfmeldtAlmindeligt")
    AFMELDT_ALMINDELIGT("AfmeldtAlmindeligt"),
    @XmlEnumValue("AfmeldtGrundetMangler")
    AFMELDT_GRUNDET_MANGLER("AfmeldtGrundetMangler"),
    @XmlEnumValue("NummerpladerOverf\u00f8rtTilAndetK\u00f8ret\u00f8j")
    NUMMERPLADER_OVERFØRT_TIL_ANDET_KØRETØJ("NummerpladerOverf\u00f8rtTilAndetK\u00f8ret\u00f8j"),
    @XmlEnumValue("AfmeldtUdenAfleveringAfNummerplader")
    AFMELDT_UDEN_AFLEVERING_AF_NUMMERPLADER("AfmeldtUdenAfleveringAfNummerplader"),
    @XmlEnumValue("Klarg\u00f8ringTilRegistrering")
    KLARGØRING_TIL_REGISTRERING("Klarg\u00f8ringTilRegistrering");
    private final String value;

    KoeretoejRegistreringStatusAarsagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejRegistreringStatusAarsagType fromValue(String v) {
        for (KoeretoejRegistreringStatusAarsagType c: KoeretoejRegistreringStatusAarsagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
