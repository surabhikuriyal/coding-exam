package com.hsbc.model.dao;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public interface DataStorageDao {
	public FoodItems addFoodItems(FoodItems foodItems);
	public Apparel addApparel(Apparel apparel);
	public Electronics addElectronics(Electronics electronics);
	

}
