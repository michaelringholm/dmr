
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LigeUligeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LigeUligeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="10"/&gt;
 *     &lt;pattern value="[a-zA-ZøæåØÆÅ]*"/&gt;
 *     &lt;enumeration value="Lige"/&gt;
 *     &lt;enumeration value="Ulige"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LigeUligeType")
@XmlEnum
public enum LigeUligeType {

    @XmlEnumValue("Lige")
    LIGE("Lige"),
    @XmlEnumValue("Ulige")
    ULIGE("Ulige");
    private final String value;

    LigeUligeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LigeUligeType fromValue(String v) {
        for (LigeUligeType c: LigeUligeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
