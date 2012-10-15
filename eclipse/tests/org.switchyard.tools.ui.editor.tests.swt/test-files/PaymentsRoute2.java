package com.example.switchyard.SWTBot_Project;

import org.apache.camel.builder.RouteBuilder;

public class PaymentsRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from:
	 * endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://Payments")
			.choice()
				.when(simple("${body.daysOut} > 90"))
					.to("switchyard://AccountsPayable")
				.otherwise()
					.log("Camel : pay later");
	}

}
