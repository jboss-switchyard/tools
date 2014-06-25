package com.switchyard.camel_route_tests;

import org.apache.camel.builder.RouteBuilder;

public abstract class ParentCamelServiceRoute extends RouteBuilder {

	public void configure() {
		doSomeFunkyRoute();
	}
	
	abstract protected void doSomeFunkyRoute();

}
