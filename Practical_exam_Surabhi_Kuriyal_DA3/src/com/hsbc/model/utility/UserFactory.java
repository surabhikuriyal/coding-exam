package com.hsbc.model.utility;

import com.hsbc.model.service.DataStorageServiceImpl;
import com.hsbc.model.dao.DataStorageDaoImpl;


public class UserFactory {
	// it can return dao, service or controller instance
	
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new DataStorageDaoImpl();
			break;
		case SERVICE :
			obj = new DataStorageServiceImpl();
			break;
		}
		return obj;
	}
}
