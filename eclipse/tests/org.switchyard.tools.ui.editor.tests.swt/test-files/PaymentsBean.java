package com.example.switchyard.SWTBot_Project;

import org.switchyard.component.bean.Service;

@Service(Payments.class)
public class PaymentsBean implements Payments {

	@Override
	public void submit(Invoice invoice) {
		if (invoice.daysOut > 90) {
			System.out.println("Bean : Pay it now!");
		} else {
			System.out.println("Bean : Maybe later ....");
		}
	}

}
