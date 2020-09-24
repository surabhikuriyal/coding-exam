package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public class DataStorageDaoImpl implements DataStorageDao{
	List<FoodItems> listFood = new ArrayList<FoodItems>();
	List<Apparel> listApparel = new ArrayList<Apparel>();
	List<Electronics> listElectronics = new ArrayList<Electronics>();

	@Override
	public FoodItems addFoodItems(FoodItems foodItems) {
		// TODO Auto-generated method stub
		listFood.add(foodItems);
		return foodItems;
	}

	@Override
	public Apparel addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		listApparel.add(apparel);
		return apparel;
	}

	@Override
	public Electronics addElectronics(Electronics electronics) {
		// TODO Auto-generated method stub
		listElectronics.add(electronics);
		return electronics;
	}
	
	@Override
	public FoodItems[] retrieveFoodItems() {
		// TODO Auto-generated method stub
		FoodItems[] foodArray = new FoodItems[listFood.size()];
        foodArray = listFood.toArray(foodArray);
		return foodArray;
	}

	@Override
	public Apparel[] retrieveApparel() {
		// TODO Auto-generated method stub
		Apparel[] apparelArray = new Apparel[listApparel.size()];
        apparelArray = listApparel.toArray(apparelArray);
		return apparelArray;
	}

	@Override
	public Electronics[] retrieveElectronics() {
		// TODO Auto-generated method stub
		Electronics[] electronicsArray = new Electronics[listElectronics.size()];
        electronicsArray = listElectronics.toArray(electronicsArray);
		return electronicsArray;
	}

}
