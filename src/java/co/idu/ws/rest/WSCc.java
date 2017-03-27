/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.idu.ws.rest;

import co.idu.cliente.soap.GetCertificadoElement;
import co.idu.cliente.soap.GetCertificadoResponseElement;
import co.idu.modelo.Opciones;
import co.idu.modelo.Respuesta;
//import co.idu.modelo.Respuesta;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.ws.rs.ApplicationPath;
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
import javax.ws.rs.core.Response.ResponseBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.glassfish.jersey.server.ResourceConfig;




/**
 * REST Web Service
 *
 * @author jcpazh
 */
//@Path("/catastro")
@ApplicationPath("/catastro")
public class WSCc extends ResourceConfig{

    @Context
    private UriInfo context; 
   // String FILE_PATH = "/home/weblogic/Oracle/Middleware/Oracle_Home/user_projects/domains/base_domain/servers/AdminServer/upload/certificadoc.pdf";
    String FILE_PATH = "D:\\SOPORTES\\Certificado\\certificadoc.pdf";       
    FileOutputStream fos;
    Respuesta respuesta = new Respuesta();
    

    /**
     * Creates a new instance of WSCc
     */
    public WSCc() {
        packages("co.idu.ws.rest");
        register(CORSResponseFilter.class);
    }

    /**
     * Retrieves representation of an instance of co.idu.ws.rest.WSCc
     *
     * @return an instance of java.lang.String
     
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }*/
    
    @GET
    @Path("/getPdf")
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getFile() {
        File file = new File(FILE_PATH);
            ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=newfile.pdf");
        return response.build();

    }

    
    @POST
    @Path("/obtenerCertificado")
    @Consumes({MediaType.APPLICATION_JSON})
    //@Produces({MediaType.APPLICATION_OCTET_STREAM,MediaType.APPLICATION_JSON})
    public Response getCertificados(Opciones op) throws Exception {
        ObjectMapper mapper;
        String respuestaJSON ="{'error':'faild'}";
        mapper = new ObjectMapper();
        GetCertificadoResponseElement resultado = new GetCertificadoResponseElement();
        respuestaJSON = mapper.writeValueAsString(op);
        
       try {
        if (op.getOpcion().equals("1")) {
            
             //llamado a ws soap de catastro que envia certificado pdf
                GetCertificadoElement parameters = new GetCertificadoElement();
                parameters.setCedulaCatastral(op.getDato());
                    //parameters.setChip("AAA0179HKBR");
                parameters.setChip("");
                parameters.setClave("8999990816");
                parameters.setDireccion("");
                parameters.setCorreousuario("wsidu@idu.gov.co");
                parameters.setIpRemoto("200.93.146.198");

                resultado = this.getCertificado(parameters);
            
        }
        if (op.getOpcion().equals("2")) {
              
                //llamado a ws soap de catastro que envia certificado pdf
                GetCertificadoElement parameters = new GetCertificadoElement();
                parameters.setCedulaCatastral("");
                //parameters.setChip("AAA0179HKBR");
                parameters.setChip(op.getDato());
                parameters.setClave("8999990816");
                parameters.setDireccion("");
                parameters.setCorreousuario("wsidu@idu.gov.co");
                parameters.setIpRemoto("200.93.146.198");

                resultado = this.getCertificado(parameters);
           } 
           
            //generateFile(resultado);
            return Response.status(Response.Status.OK).entity(resultado).header("Access-Control-Allow-Origin", "*")
			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
            /*   File file = new File(FILE_PATH);
               ResponseBuilder response = Response.ok((Object) file);
               response.header("Content-Disposition", "attachment; filename=certificado.pdf");
               return response.build();
            */
            
          /*} catch (IOException exc) {
                respuesta.setCodigo("001");
                respuesta.setDescripcion("Verificar conexion o parametros a servicio de catastro");
                return Response.status(Response.Status.BAD_REQUEST).entity(respuesta).build();
          */} catch (Exception ex) {
              ex.printStackTrace();
              respuesta.setCodigo("002");
              respuesta.setDescripcion("Verificar parametros ingresados");
              return Response.status(Response.Status.BAD_REQUEST).entity(respuesta).header("Access-Control-Allow-Origin", "*")
			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
          }
        } 

     private static GetCertificadoResponseElement getCertificado(co.idu.cliente.soap.GetCertificadoElement parameters) {
        co.idu.cliente.soap.WSCertificadoCatastralCL_Service service = new co.idu.cliente.soap.WSCertificadoCatastralCL_Service();
        co.idu.cliente.soap.WSCertificadoCatastralCL port = service.getWSCertificadoCatastralCLSoapHttpPort();
        return port.getCertificado(parameters);
    }

    public void generateFile(GetCertificadoResponseElement r) throws FileNotFoundException, IOException {
        System.out.print("Testing..." + r.getResult().getPdfCertificado().toString());
        fos = new FileOutputStream(FILE_PATH);
        fos.write(r.getResult().getPdfCertificado());
        fos.close();

    }
    
    
}
