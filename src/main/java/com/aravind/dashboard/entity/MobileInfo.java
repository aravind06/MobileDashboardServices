package com.aravind.dashboard.entity;

public class MobileInfo {
	public int serial_id;
	public String brand;
	public String Description;
	public String imageUrl;
	public String name;
	public int price;
	public int storage;
	
	public int getSerial_id() {
		return serial_id;
	}
	public void setSerial_id(int serial_id) {
		this.serial_id = serial_id;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
