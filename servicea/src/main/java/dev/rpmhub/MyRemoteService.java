package dev.rpmhub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// @RegisterRestClient(baseUri = "http://localhost:4444/serviceb")
public interface MyRemoteService {

    @GET
    @Path("/person/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("name") String name);

}
