package com.hsbc.model.service;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.dao.DataStorageDao;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class DataStorageServiceImpl implements DataStorageService{
	private DataStorageDao dao;
	public DataStorageServiceImpl() {
		// this is the way you get different instance
		dao = (DataStorageDao)UserFactory.getInstance(Type.DAO);
	}

	@Override
	public FoodItems addFoodItems(FoodItems foodItems) {
		// TODO Auto-generated method stub
		FoodItems createdFoodItem =  dao.addFoodItems(foodItems);
		return createdFoodItem;
	}

	@Override
	public Apparel addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		Apparel createdApparel =  dao.addApparel(apparel);
		return createdApparel;
	}

	@Override
	public Electronics addElectronics(Electronics electronics) {
		// TODO Auto-generated method stub
		Electronics createdElectronics =  dao.addElectronics(electronics);
		return createdElectronics;
	}

	@Override
	public FoodItems[] retrieveFoodItems() {
		// TODO Auto-generated method stub
		return dao.retrieveFoodItems();
	}

	@Override
	public Apparel[] retrieveApparel() {
		// TODO Auto-generated method stub
		return dao.retrieveApparel();
	}

	@Override
	public Electronics[] retrieveElectronics() {
		// TODO Auto-generated method stub
		return dao.retrieveElectronics();
	}

	@Override
	public FoodItems displayFoodReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Apparel displayApparelReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Electronics displayElectronicsReport() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
