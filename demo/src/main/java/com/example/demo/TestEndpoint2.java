package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("test2")
public class TestEndpoint2 {

	@GET
	public Response get() {
		return Response.ok("------TestEndpoint2-------").build();
	}
}
