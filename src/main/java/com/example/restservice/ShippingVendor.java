package com.example.restservice;

import java.util.Random;


public class ShippingVendor {

	private final long Id;
	private final String Ship_Status;

	public ShippingVendor(String status) {
		
		this.Id =  100000 + new Random().nextInt(900000);
		this.Ship_Status = status;
	}
	
	public long getId() {
		return Id;
	}

	public String getShip_Status() {
		return Ship_Status;
	}
}
