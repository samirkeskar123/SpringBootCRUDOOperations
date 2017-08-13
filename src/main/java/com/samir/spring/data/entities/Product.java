package com.samir.spring.data.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	 @Id
	 private long id;
	 private String name;
	 private String description;
	 private Double price;
	 
	 
	 public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	 
}
