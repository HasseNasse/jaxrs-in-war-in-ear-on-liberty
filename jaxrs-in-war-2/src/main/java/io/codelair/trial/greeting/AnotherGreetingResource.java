package io.codelair.trial.greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("greeting")
public class AnotherGreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGreeting(){
        return Response.ok("Hello World").build();
    }
}
