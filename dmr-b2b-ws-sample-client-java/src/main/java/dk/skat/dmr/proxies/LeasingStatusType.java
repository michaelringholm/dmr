
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeasingStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LeasingStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="25"/&gt;
 *     &lt;enumeration value="Oprettet"/&gt;
 *     &lt;enumeration value="TilknyttetRegistrering"/&gt;
 *     &lt;enumeration value="TilknytningAnnulleret"/&gt;
 *     &lt;enumeration value="Annulleret"/&gt;
 *     &lt;enumeration value="Berigtiget"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LeasingStatusType")
@XmlEnum
public enum LeasingStatusType {

    @XmlEnumValue("Oprettet")
    OPRETTET("Oprettet"),
    @XmlEnumValue("TilknyttetRegistrering")
    TILKNYTTET_REGISTRERING("TilknyttetRegistrering"),
    @XmlEnumValue("TilknytningAnnulleret")
    TILKNYTNING_ANNULLERET("TilknytningAnnulleret"),
    @XmlEnumValue("Annulleret")
    ANNULLERET("Annulleret"),
    @XmlEnumValue("Berigtiget")
    BERIGTIGET("Berigtiget");
    private final String value;

    LeasingStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LeasingStatusType fromValue(String v) {
        for (LeasingStatusType c: LeasingStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
