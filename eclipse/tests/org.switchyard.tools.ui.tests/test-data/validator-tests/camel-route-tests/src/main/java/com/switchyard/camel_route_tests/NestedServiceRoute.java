package com.switchyard.camel_route_tests;

public class NestedServiceRoute extends ParentCamelServiceRoute {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	protected void doSomeFunkyRoute() {
        from("switchyard://MySecondService")
        	.log("Received message for MySecondService: ${body}");
	}

}
