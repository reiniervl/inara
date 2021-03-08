package com.rvlstudio.inara.jayne.rs;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.rvlstudio.inara.river.Hello;

import nz.sodium.Cell;

@Stateless
@Path("hello")
public class HelloWorld {
	@EJB
	private Hello hello;

	@GET
	public Response get() {
		hello.sworld.listen(System.out::println);
		Cell<String> w = hello.sworld.hold("still empty");
		hello.world("world");
		return Response.ok(w.sample()).build();
	}
}
