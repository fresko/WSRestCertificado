
package co.idu.cliente.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correousuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ipRemoto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "direccion",
    "chip",
    "cedulaCatastral",
    "correousuario",
    "clave",
    "ipRemoto"
})
@XmlRootElement(name = "getCertificadoElement")
public class GetCertificadoElement {

    @XmlElement(required = true, nillable = true)
    protected String direccion;
    @XmlElement(required = true, nillable = true)
    protected String chip;
    @XmlElement(required = true, nillable = true)
    protected String cedulaCatastral;
    @XmlElement(required = true, nillable = true)
    protected String correousuario;
    @XmlElement(required = true, nillable = true)
    protected String clave;
    @XmlElement(required = true, nillable = true)
    protected String ipRemoto;

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
     * Obtiene el valor de la propiedad correousuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreousuario() {
        return correousuario;
    }

    /**
     * Define el valor de la propiedad correousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreousuario(String value) {
        this.correousuario = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad ipRemoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRemoto() {
        return ipRemoto;
    }

    /**
     * Define el valor de la propiedad ipRemoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRemoto(String value) {
        this.ipRemoto = value;
    }

}
