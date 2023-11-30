package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Path("test")
public class TestEndpoint {

	@GET
	public Response get() {
		return Response.ok("------TestEndpoint-------").build();
	}
}
