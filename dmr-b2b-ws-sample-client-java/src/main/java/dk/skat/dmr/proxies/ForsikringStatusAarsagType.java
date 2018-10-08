
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForsikringStatusAarsagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForsikringStatusAarsagType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="50"/&gt;
 *     &lt;enumeration value="Genetablering"/&gt;
 *     &lt;enumeration value="Registrering"/&gt;
 *     &lt;enumeration value="OphørtAfForsikringsSelskab"/&gt;
 *     &lt;enumeration value="Afmelding"/&gt;
 *     &lt;enumeration value="Selskabsskifte"/&gt;
 *     &lt;enumeration value="ÆndretLeasingPeriode"/&gt;
 *     &lt;enumeration value="EjerBrugerSkifte"/&gt;
 *     &lt;enumeration value="PladeskiftUdenEjerBrugerskifte"/&gt;
 *     &lt;enumeration value="ÆndringAnvendelse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForsikringStatusAarsagType")
@XmlEnum
public enum ForsikringStatusAarsagType {

    @XmlEnumValue("Genetablering")
    GENETABLERING("Genetablering"),
    @XmlEnumValue("Registrering")
    REGISTRERING("Registrering"),
    @XmlEnumValue("Oph\u00f8rtAfForsikringsSelskab")
    OPHØRT_AF_FORSIKRINGS_SELSKAB("Oph\u00f8rtAfForsikringsSelskab"),
    @XmlEnumValue("Afmelding")
    AFMELDING("Afmelding"),
    @XmlEnumValue("Selskabsskifte")
    SELSKABSSKIFTE("Selskabsskifte"),
    @XmlEnumValue("\u00c6ndretLeasingPeriode")
    ÆNDRET_LEASING_PERIODE("\u00c6ndretLeasingPeriode"),
    @XmlEnumValue("EjerBrugerSkifte")
    EJER_BRUGER_SKIFTE("EjerBrugerSkifte"),
    @XmlEnumValue("PladeskiftUdenEjerBrugerskifte")
    PLADESKIFT_UDEN_EJER_BRUGERSKIFTE("PladeskiftUdenEjerBrugerskifte"),
    @XmlEnumValue("\u00c6ndringAnvendelse")
    ÆNDRING_ANVENDELSE("\u00c6ndringAnvendelse");
    private final String value;

    ForsikringStatusAarsagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForsikringStatusAarsagType fromValue(String v) {
        for (ForsikringStatusAarsagType c: ForsikringStatusAarsagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
