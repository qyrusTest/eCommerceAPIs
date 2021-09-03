package com.example.restservice;

import java.util.Random;

public class PaymentVendor {

	private final long Id;
	private final String Payment_Status;

	public PaymentVendor(String status) {
		
		this.Id =  100000 + new Random().nextInt(900000);
		this.Payment_Status = status;
	}
	
	public long getId() {
		return Id;
	}

	public String getPayment_Status() {
		return Payment_Status;
	}
}
