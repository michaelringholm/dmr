
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistreringNummerRettighedTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistreringNummerRettighedTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;enumeration value="Ønskeplade"/&gt;
 *     &lt;enumeration value="FastPrøveskilt"/&gt;
 *     &lt;enumeration value="Ferietilladelse"/&gt;
 *     &lt;enumeration value="Prøvemærke"/&gt;
 *     &lt;whiteSpace value="preserve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistreringNummerRettighedTypeType")
@XmlEnum
public enum RegistreringNummerRettighedTypeType {

    @XmlEnumValue("\u00d8nskeplade")
    ØNSKEPLADE("\u00d8nskeplade"),
    @XmlEnumValue("FastPr\u00f8veskilt")
    FAST_PRØVESKILT("FastPr\u00f8veskilt"),
    @XmlEnumValue("Ferietilladelse")
    FERIETILLADELSE("Ferietilladelse"),
    @XmlEnumValue("Pr\u00f8vem\u00e6rke")
    PRØVEMÆRKE("Pr\u00f8vem\u00e6rke");
    private final String value;

    RegistreringNummerRettighedTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegistreringNummerRettighedTypeType fromValue(String v) {
        for (RegistreringNummerRettighedTypeType c: RegistreringNummerRettighedTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
