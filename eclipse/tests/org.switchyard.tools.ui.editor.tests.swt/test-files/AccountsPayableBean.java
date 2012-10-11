package com.example.switchyard.SWTBot_Project;

import org.switchyard.component.bean.Service;

@Service(value = Payments.class, name = "AccountsPayable")
public class AccountsPayableBean implements Payments {

	@Override
	public void submit(Invoice invoice) {
		System.out.println("Accounts payable is on vacation");
	}

}
