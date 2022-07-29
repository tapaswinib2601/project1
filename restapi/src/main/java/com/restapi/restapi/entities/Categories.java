package com.restapi.restapi.entities;

public class Categories {

	private long id;
	private String type;
	private String name;
	private String brand;

	public long getId() {
		return id;

	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Categories(long id, String type, String name, String brand) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.brand = brand;
	}

	public Categories() {
		super();

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ",type=" + type + ", name=" + name + ", brand=" + brand + "]";
	}

}
