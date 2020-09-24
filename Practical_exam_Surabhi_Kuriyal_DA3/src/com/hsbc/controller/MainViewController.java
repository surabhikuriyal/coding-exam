package com.hsbc.controller;

import java.util.Scanner;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.DataStorageService;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class MainViewController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		// This is getting service object
		DataStorageService service = (DataStorageService) UserFactory.getInstance(Type.SERVICE);
		int option = 0;
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("1: Store Food 2: Store Apparel 3: Store Electronics 4: Retrieve All Food Items 5: Retrieve All Apparels 6: Retrieve All Electronics 7: View Food Items Report 8: View Apparels Report 9: View Electronics Report 10: Exit");
			System.out.println("*****************************************************************************************");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				FoodItems foodItems = new FoodItems();
				System.out.println("Enter Item Code");		
				foodItems.setItemCode(scanner.nextInt());
				System.out.println("Enter Item Name");
				foodItems.setItemName(scanner.next());
				System.out.println("Enter Unit Price");
				foodItems.setUnitPrice(scanner.nextDouble());
				System.out.println("Enter Date of Manufacture");
				foodItems.setManufacturDate(scanner.next());
				System.out.println("Enter Date of Expiry");
				foodItems.setExpiryDate(scanner.next());
				System.out.println("Vegetarian? Yes/No ?");
				foodItems.setItemName(scanner.next());
				System.out.println("Enter Quantity");
				foodItems.setQuantity(scanner.nextInt());
				FoodItems createdFoodItem = service.addFoodItems(foodItems);
				System.out.println("Food Item added with Item Code : "+createdFoodItem.getItemCode());
				break;
				
			case 2:
				Apparel apparel = new Apparel();
				System.out.println("Enter Item Code");		
				apparel.setItemCode(scanner.nextInt());
				System.out.println("Enter Item Name");
				apparel.setItemName(scanner.next());
				System.out.println("Enter Unit Price");
				apparel.setUnitPrice(scanner.nextDouble());
				System.out.println("Enter Size");
				apparel.setSize(scanner.next());
				System.out.println("Enter Material");
				apparel.setMaterial(scanner.next());
				System.out.println("Enter Quantity");
				apparel.setQuantity(scanner.nextInt());
				Apparel createdApparel = service.addApparel(apparel);
				System.out.println("Food Item added with Item Code : "+createdApparel.getItemCode());
				break;
				
			case 3:
				Electronics electronics = new Electronics();
				System.out.println("Enter Item Code");		
				electronics.setItemCode(scanner.nextInt());
				System.out.println("Enter Item Name");
				electronics.setItemName(scanner.next());
				System.out.println("Enter Unit Price");
				electronics.setUnitPrice(scanner.nextDouble());
				System.out.println("Enter Warranty");
				electronics.setWarranty(scanner.next());
				System.out.println("Enter Quantity");
				electronics.setQuantity(scanner.nextInt());
				Electronics createdElectronics = service.addElectronics(electronics);
				System.out.println("Food Item added with Item Code : "+createdElectronics.getItemCode());
				break;
			}
		}while(option!=10);
	}
}
