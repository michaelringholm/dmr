
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeAttestVariantStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeAttestVariantStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="7"/&gt;
 *     &lt;enumeration value="Aktiv"/&gt;
 *     &lt;enumeration value="Inaktiv"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeAttestVariantStatusType")
@XmlEnum
public enum TypeAttestVariantStatusType {

    @XmlEnumValue("Aktiv")
    AKTIV("Aktiv"),
    @XmlEnumValue("Inaktiv")
    INAKTIV("Inaktiv");
    private final String value;

    TypeAttestVariantStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAttestVariantStatusType fromValue(String v) {
        for (TypeAttestVariantStatusType c: TypeAttestVariantStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
