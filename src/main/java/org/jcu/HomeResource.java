package org.jcu;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.TemplateInstance;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class HomeResource {

	@Inject
	TemplateInstance layoutInstance;
	
    @GET
    public TemplateInstance dashboard() {
        return layoutInstance;
    }
}