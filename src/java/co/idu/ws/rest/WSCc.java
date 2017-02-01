/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.idu.ws.rest;

import co.idu.modelo.Opciones;
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
      ObjectMapper mapper;
       String respuestaJSON = "faild";
      mapper = new ObjectMapper();
        
       try {
              
              respuestaJSON = mapper.writeValueAsString(op);
              return Response.status(Response.Status.OK).entity(respuestaJSON).build();
           /* return Response.status(Response.Status.OK)
                           .header("uuid", solicitud.getUuid())
                           .header("usuario", credencial.getUsuario())
                           .header("aplicacion", credencial.getAplicacion())
                           .header("accessToken", solicitud.getAccessToken())
                           .entity(respuestaJSON).build(); */
            
        } catch (Exception exc){
            exc.printStackTrace();
            op.setOpciones(respuestaJSON);
            return Response.status(Response.Status.BAD_REQUEST).entity(op).build();
        }
    } 
}
