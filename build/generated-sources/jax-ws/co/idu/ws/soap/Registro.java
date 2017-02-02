
package co.idu.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Registro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Registro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdfCertificado" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registro", namespace = "http://facade.uaecd.gov.co/types/", propOrder = {
    "matricula",
    "pdfCertificado",
    "cedulaCatastral",
    "direccion",
    "chip"
})
public class Registro {

    @XmlElement(required = true, nillable = true)
    protected String matricula;
    @XmlElement(required = true, nillable = true)
    protected byte[] pdfCertificado;
    @XmlElement(required = true, nillable = true)
    protected String cedulaCatastral;
    @XmlElement(required = true, nillable = true)
    protected String direccion;
    @XmlElement(required = true, nillable = true)
    protected String chip;

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad pdfCertificado.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfCertificado() {
        return pdfCertificado;
    }

    /**
     * Define el valor de la propiedad pdfCertificado.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfCertificado(byte[] value) {
        this.pdfCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaCatastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    /**
     * Define el valor de la propiedad cedulaCatastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCatastral(String value) {
        this.cedulaCatastral = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad chip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChip() {
        return chip;
    }

    /**
     * Define el valor de la propiedad chip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChip(String value) {
        this.chip = value;
    }

}
