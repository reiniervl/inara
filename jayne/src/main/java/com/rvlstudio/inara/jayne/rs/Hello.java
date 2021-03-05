package com.rlvstudio.inara.jayne.rs;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("hello")
public class Hello {
	@GET
	public Response get() {
		return Response.ok("Hello, World").build();
	}
}
