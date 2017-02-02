
package co.idu.ws.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSCertificadoCatastralCL", targetNamespace = "http://facade.uaecd.gov.co/", wsdlLocation = "http://servicios.catastrobogota.gov.co/WSCertificadoCatastroCL/WSCertificadoCatastralCLSoapHttpPort?WSDL")
public class WSCertificadoCatastralCL_Service
    extends Service
{

    private final static URL WSCERTIFICADOCATASTRALCL_WSDL_LOCATION;
    private final static WebServiceException WSCERTIFICADOCATASTRALCL_EXCEPTION;
    private final static QName WSCERTIFICADOCATASTRALCL_QNAME = new QName("http://facade.uaecd.gov.co/", "WSCertificadoCatastralCL");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://servicios.catastrobogota.gov.co/WSCertificadoCatastroCL/WSCertificadoCatastralCLSoapHttpPort?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCERTIFICADOCATASTRALCL_WSDL_LOCATION = url;
        WSCERTIFICADOCATASTRALCL_EXCEPTION = e;
    }

    public WSCertificadoCatastralCL_Service() {
        super(__getWsdlLocation(), WSCERTIFICADOCATASTRALCL_QNAME);
    }

    public WSCertificadoCatastralCL_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCERTIFICADOCATASTRALCL_QNAME, features);
    }

    public WSCertificadoCatastralCL_Service(URL wsdlLocation) {
        super(wsdlLocation, WSCERTIFICADOCATASTRALCL_QNAME);
    }

    public WSCertificadoCatastralCL_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCERTIFICADOCATASTRALCL_QNAME, features);
    }

    public WSCertificadoCatastralCL_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCertificadoCatastralCL_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSCertificadoCatastralCL
     */
    @WebEndpoint(name = "WSCertificadoCatastralCLSoapHttpPort")
    public WSCertificadoCatastralCL getWSCertificadoCatastralCLSoapHttpPort() {
        return super.getPort(new QName("http://facade.uaecd.gov.co/", "WSCertificadoCatastralCLSoapHttpPort"), WSCertificadoCatastralCL.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSCertificadoCatastralCL
     */
    @WebEndpoint(name = "WSCertificadoCatastralCLSoapHttpPort")
    public WSCertificadoCatastralCL getWSCertificadoCatastralCLSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://facade.uaecd.gov.co/", "WSCertificadoCatastralCLSoapHttpPort"), WSCertificadoCatastralCL.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCERTIFICADOCATASTRALCL_EXCEPTION!= null) {
            throw WSCERTIFICADOCATASTRALCL_EXCEPTION;
        }
        return WSCERTIFICADOCATASTRALCL_WSDL_LOCATION;
    }

}
