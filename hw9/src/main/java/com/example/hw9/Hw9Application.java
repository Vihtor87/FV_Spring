package com.example.hw9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw9Application.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocator builder) {
		return builder.routes()
				.route("Microservice1",r->r.path("/serviceA/**"))
				.uri("http://localhost:8081/")
				.build();
	}
}
