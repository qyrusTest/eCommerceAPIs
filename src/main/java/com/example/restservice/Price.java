package com.example.restservice;

public class Price {
	private final long Id;
	private final String productName;
	private final int Quantity;
	private final String Price;
	
	public Price(long id, String productName, int quantity) {
		this.Id = id;
		this.productName = productName;
		this.Quantity= quantity;

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
	}
	
	public long getId() {
		return Id;
	}

	public String getProductName() {
		return productName;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	
	public String getPrice() {
		return Price;
	}
	
	
}
