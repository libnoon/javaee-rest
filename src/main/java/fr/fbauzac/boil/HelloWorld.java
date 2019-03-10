package fr.fbauzac.boil;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * Root resource (exposed at "helloworld" path)
 */
@Path("helloworld")
@Produces("application/json")
@Consumes("application/json")
public class HelloWorld {
    @Context
    private UriInfo context;

    /** Creates a new instance of HelloWorld */
    public HelloWorld() {
    }

    /**
     * Retrieves representation of an instance of helloWorld.HelloWorld
     * @return an instance of java.lang.String
     */
    @GET
    @Path("add/{number}")
    public int httpGet(@PathParam("number") String num1, @QueryParam("number") String num2) {
        return Integer.valueOf(num1) + Integer.valueOf(num2);
    }
}
