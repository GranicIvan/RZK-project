package com.ig.rzk.config;


import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

@Configuration
public class ApiGatewayConfiguration {
	
	Function<PredicateSpec, Buildable<Route>> routerFunction = 
			p->p.path("/get")
			.filters(f->f.addRequestHeader("MyHeader", "MyURI"))
			.uri("http://httpbin.org:80");
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		

		return builder.routes()
				.route(routerFunction)
				.build();
	}
}
