package com.switchyard.camel_route_tests;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
        from("switchyard://MySecondService")
        	.log("Received message for MySecondService: ${body}")
        	.split(body(String.class).tokenize("\n"))
	        .filter(body(String.class).startsWith("sally:"))
	        .to("switchyard://MyThirdService");
        from("switchyard://MyFirstService")
	    	.log("Received message for MyFirstService: ${body}");
	}

}
