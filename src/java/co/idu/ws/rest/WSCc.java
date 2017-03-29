/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.idu.ws.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * REST Web Service
 *
 * @author jcpazh
 */
//@Path("/catastro")
@ApplicationPath("api")
public class WSCc extends ResourceConfig{

    /**
     * Creates a new instance of WSCc
     */
    public WSCc() {
        packages("co.idu.ws.rest");
        register(CORSResponseFilter.class); 
    }

  
    
}
