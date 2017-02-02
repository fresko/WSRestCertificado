/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.idu.ws.rest;

import co.idu.cliente.soap.GetCertificadoElement;
import co.idu.cliente.soap.GetCertificadoResponseElement;
import co.idu.modelo.Opciones;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.map.ObjectMapper;



/**
 * REST Web Service
 *
 * @author jcpazh
 */
@Path("/catastro")
public class WSCc {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WSCc
     */
    public WSCc() {
    }

    /**
     * Retrieves representation of an instance of co.idu.ws.rest.WSCc
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of WSCc
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    @POST
    @Path("/obtenerCertificado")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response getCertificados(Opciones op) throws Exception{
         System.out.print("Testing..."  );
      ObjectMapper mapper;
       String respuestaJSON = "faild";
      mapper = new ObjectMapper();
        
       try {
              respuestaJSON = mapper.writeValueAsString(op);
              
              //llamado a ws soap de catastro que envia certificado pdf
              
                GetCertificadoResponseElement resultado = new GetCertificadoResponseElement();
                GetCertificadoElement parameters = new GetCertificadoElement();
                parameters.setCedulaCatastral("");
                parameters.setChip("AAA0179HKBR");
                parameters.setClave("8999990816");
                parameters.setDireccion("");
                parameters.setCorreousuario("wsidu@idu.gov.co");
                parameters.setIpRemoto("200.93.146.198");
       
                
                resultado = this.getCertificado(parameters);
                
               generateFile(resultado); 
            return Response.status(Response.Status.OK).entity(respuestaJSON).build();
          
            
        } catch (IOException exc){
            exc.printStackTrace();
            op.setOpciones(respuestaJSON);
            return Response.status(Response.Status.BAD_REQUEST).entity(op).build();
        }
    } 

    private static GetCertificadoResponseElement getCertificado(co.idu.cliente.soap.GetCertificadoElement parameters) {
        co.idu.cliente.soap.WSCertificadoCatastralCL_Service service = new co.idu.cliente.soap.WSCertificadoCatastralCL_Service();
        co.idu.cliente.soap.WSCertificadoCatastralCL port = service.getWSCertificadoCatastralCLSoapHttpPort();
        return port.getCertificado(parameters);
    }
    
    public void generateFile(GetCertificadoResponseElement r) throws FileNotFoundException, IOException{
       
        System.out.print("Testing..." + r.getResult().getPdfCertificado().toString() );
        FileOutputStream fos = new FileOutputStream("E:\\SONY\\Datos_JCPH\\IDU\\workspace\\cc.pdf");
        fos.write(r.getResult().getPdfCertificado());
        fos.close();
       
       
    }
}
