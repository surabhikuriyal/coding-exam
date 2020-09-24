package com.hsbc.model.beans;

public class Electronics {
	private int itemCode, quantity;
	private String itemName, warranty;
	private double unitPrice;
	/**
	 * 
	 */
	public Electronics() {
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
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", quantity=" + quantity + ", itemName=" + itemName + ", warranty="
				+ warranty + "]";
	}

	
	

}
