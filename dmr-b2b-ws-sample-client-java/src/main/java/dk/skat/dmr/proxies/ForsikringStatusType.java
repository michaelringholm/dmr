
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForsikringStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForsikringStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;enumeration value="Anmodet"/&gt;
 *     &lt;enumeration value="Aktiv"/&gt;
 *     &lt;enumeration value="Annulleret"/&gt;
 *     &lt;enumeration value="Ophørt"/&gt;
 *     &lt;enumeration value="Accepteret"/&gt;
 *     &lt;enumeration value="Afvis"/&gt;
 *     &lt;enumeration value="OphørtFraCRM3"/&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForsikringStatusType")
@XmlEnum
public enum ForsikringStatusType {

    @XmlEnumValue("Anmodet")
    ANMODET("Anmodet"),
    @XmlEnumValue("Aktiv")
    AKTIV("Aktiv"),
    @XmlEnumValue("Annulleret")
    ANNULLERET("Annulleret"),
    @XmlEnumValue("Oph\u00f8rt")
    OPHØRT("Oph\u00f8rt"),
    @XmlEnumValue("Accepteret")
    ACCEPTERET("Accepteret"),
    @XmlEnumValue("Afvis")
    AFVIS("Afvis"),
    @XmlEnumValue("Oph\u00f8rtFraCRM3")
    OPHØRT_FRA_CRM_3("Oph\u00f8rtFraCRM3");
    private final String value;

    ForsikringStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForsikringStatusType fromValue(String v) {
        for (ForsikringStatusType c: ForsikringStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
