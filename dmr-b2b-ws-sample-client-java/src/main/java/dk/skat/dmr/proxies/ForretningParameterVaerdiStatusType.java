
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForretningParameterVaerdiStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForretningParameterVaerdiStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="0"/&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;pattern value="([a-zA-ZåæøÅÆØ])*"/&gt;
 *     &lt;enumeration value="Aktiv"/&gt;
 *     &lt;enumeration value="Inaktiv"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForretningParameterVaerdiStatusType")
@XmlEnum
public enum ForretningParameterVaerdiStatusType {

    @XmlEnumValue("Aktiv")
    AKTIV("Aktiv"),
    @XmlEnumValue("Inaktiv")
    INAKTIV("Inaktiv");
    private final String value;

    ForretningParameterVaerdiStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForretningParameterVaerdiStatusType fromValue(String v) {
        for (ForretningParameterVaerdiStatusType c: ForretningParameterVaerdiStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
