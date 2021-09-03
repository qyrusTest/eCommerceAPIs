package com.example.restservice;

public class Order {

	private final String Customer;
	private final String Address;
	private final String productName;
	private final String City;
	private final long Id;
	private final int Quantity;
	private final String Price;
	private final String Status;
	
	
	public Order(String customer, String address, String productName, String city, long id, int quantity) {
		
		this.Customer = customer;
		this.Address = address;
		this.productName = productName;
		this.City = city;
		this.Id = id;
		this.Quantity = quantity;
		
		String totalPrice = null;
		if(id == 113355) {
			totalPrice = "$" + String.valueOf((double) Math.round(quantity*33.23 * 100) / 100);
		}
		else if(id == 226710) {
			totalPrice = "$" + String.valueOf((double) Math.round(quantity*81.12* 100) / 100);
		}
		else {
			totalPrice = "$" + String.valueOf((double) Math.round(quantity*57.11* 100) / 100);
		}
		this.Price = totalPrice;
		this.Status = "Success";
	}

	public String getCustomer() {
		return Customer;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getProductName() {
		return productName;
	}
	public String getCity() {
		return City;
	}
	public int getQuantity() {
		return Quantity;
	}

	public long getId() {
		return Id;
	}
	
	public String getPrice() {
		return Price;
	}

	public String getStatus() {
		return Status;
	}
}
