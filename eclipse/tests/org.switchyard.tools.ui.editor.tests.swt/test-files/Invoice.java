package com.example.switchyard.SWTBot_Project;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Invoice {

	int daysOut;
	double amount;
	
	public int getDaysOut() {
		return daysOut;
	}
	public void setDaysOut(int daysOut) {
		this.daysOut = daysOut;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
