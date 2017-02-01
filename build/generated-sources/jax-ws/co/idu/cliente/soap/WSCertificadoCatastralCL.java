
package co.idu.cliente.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSCertificadoCatastralCL", targetNamespace = "http://facade.uaecd.gov.co/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCertificadoCatastralCL {


    /**
     * 
     * @param parameters
     * @return
     *     returns co.idu.cliente.soap.GetCertificadoResponseElement
     */
    @WebMethod(action = "http://facade.uaecd.gov.co//getCertificado")
    @WebResult(name = "getCertificadoResponseElement", targetNamespace = "http://facade.uaecd.gov.co/", partName = "parameters")
    public GetCertificadoResponseElement getCertificado(
        @WebParam(name = "getCertificadoElement", targetNamespace = "http://facade.uaecd.gov.co/", partName = "parameters")
        GetCertificadoElement parameters);

}
