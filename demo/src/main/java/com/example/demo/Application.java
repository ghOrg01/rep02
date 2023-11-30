package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Application extends ResourceConfig {

	public Application() {
		register(TestEndpoint2.class);
		packages("com.example");
	}
}
