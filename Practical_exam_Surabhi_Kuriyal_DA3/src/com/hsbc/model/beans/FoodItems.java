package com.hsbc.model.beans;

public class FoodItems {
	
	private int itemCode, quantity;
	private String itemName, manufacturDate, expiryDate, vegetarian;
	private double unitPrice;
	/**
	 * 
	 */
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getManufacturDate() {
		return manufacturDate;
	}
	public void setManufacturDate(String manufacturDate) {
		this.manufacturDate = manufacturDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", quantity=" + quantity + ", itemName=" + itemName + ", vegetarian="
				+ vegetarian + "]";
	}
}
