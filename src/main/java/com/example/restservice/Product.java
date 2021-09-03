package com.example.restservice;

public class Product {

	private final long Id;
	private final String ProductName;
	private final String Description;

	public Product(long id, String productName, String description) {
		this.Id = id;
		this.ProductName = productName;
		this.Description = description;
	}

	public long getId() {
		return Id;
	}

	public String getProductName() {
		return ProductName;
	}
	
	
	public String getDescription() {
		return Description;
	}
}
