package com.jsp.carDekhoCaseStudy.properties;

public class Car {
	private int id;
	private String name;
	private String model;
	private double price;
	
	@Override
	public String toString() {
		return "car [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

}
