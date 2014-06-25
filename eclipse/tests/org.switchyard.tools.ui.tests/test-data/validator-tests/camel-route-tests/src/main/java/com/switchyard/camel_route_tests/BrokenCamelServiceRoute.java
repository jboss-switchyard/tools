package com.switchyard.camel_route_tests;

public class BrokenCamelServiceRoute {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		System.out.println("Broken");
	}

}
