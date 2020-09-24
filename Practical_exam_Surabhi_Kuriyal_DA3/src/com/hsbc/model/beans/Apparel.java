package com.hsbc.model.beans;

public class Apparel {
	private int itemCode, quantity;
	private String itemName, size, material;
	private double unitPrice;
	/**
	 * 
	 */
	public Apparel() {
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", quantity=" + quantity + ", itemName=" + itemName + ", size=" + size
				+ ", material=" + material + "]";
	}

}
