package com.switchyard.camel_route_tests;

import org.apache.camel.builder.RouteBuilder;

public class CorrectCamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://MyOtherFirstService").log(
				"Received message for 'MyFirstService' : ${body}")
				.to("switchyard://MyOtherSecondService?operationName=doSomethingElse");
	}

}
