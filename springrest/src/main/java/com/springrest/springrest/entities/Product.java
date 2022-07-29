package com.springrest.springrest.entities;

public class Product {
    
	private long id;
	private String name;
	private String description;
	private String brand;
	
	
    public long getId() {
		return id;
		
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public Product(long id, String name, String description, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.brand = brand;
	}
	public Product() {
		super();
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + "]";
	}
	
}
