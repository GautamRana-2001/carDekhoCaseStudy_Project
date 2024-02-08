package com.jsp.carDekhoCaseStudy.Operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsp.carDekhoCaseStudy.properties.Car;

public class CarOperation {
	
	ArrayList<Car> arrayList=new ArrayList<Car>();
	Car car = new Car();
	
	public void addCar(Scanner scanner) {
		System.out.println("Enter car Id");
		car.setId(scanner.nextInt());
		System.out.println("Enter car Name");
		car.setName(scanner.next());
		System.out.println("Enter car Model");
		car.setModel(scanner.next());
		System.out.println("Enter car Price");
		car.setPrice(scanner.nextDouble());
		arrayList.add(car);
	}
	
	public void removeCar(Scanner scanner) {
		System.out.println("You the car Id Which you want to delete");
		boolean remove=false;
		while(!remove) {
			System.out.println("Enter Id");
			int removeId=scanner.nextInt();
			boolean found=false;
			for(Car cars:arrayList) {
				if (removeId==cars.getId()) {
					arrayList.remove(cars);
					System.out.println("Id of Your car Detail is "+cars.getId()+" here\n");
					found=true;
					remove=true;
					break;
				}
		}
		if (!found) {
			System.out.println("Please Enter Correct Id\n");
		
								
		}
	}
}


public void updateCar(Scanner scanner) {
	System.out.println("Enter Old Car id to update");
	boolean update=false;
	
	while(!update) {
		int oldCarid=scanner.nextInt();
		boolean found=false;
		
		for(Car cars2:arrayList) {
			if (cars2.getId()==oldCarid) {
				System.out.println("Please enter new Id");
				int updateId=scanner.nextInt();
				car.setId(updateId);
				
				System.out.println("Enter New Car Name");
				String updateName=scanner.next();
				car.setName(updateName);
				
				System.out.println("Enter New Car Model");
				String updateModel=scanner.next();
				car.setModel(updateModel);
				
				System.out.println("Enter the New Car Price");
				double updatePrice=scanner.nextDouble();
				car.setPrice(updatePrice);
				
				System.out.println("Your Car is Updated Sucessfully");
				found=true;
				update=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Enter the Correct Old Id ");
		}
	}
}
public void searchCar(Scanner scanner) {
	System.out.println("Watch Your Car Collection");
	boolean found=false;
	while(!found) {
		System.out.println("Enter Car id You want");
		boolean search=false;
		int searchId=scanner.nextInt();
		
		for(Car cars3:arrayList) {
			if (cars3.getId()==searchId) {
			System.out.println(cars3);
			search=true;
			found=true;
			break;
		}
	}
		if(!search) {
			System.out.println("Please enter Correct Id");};
		}
}
	
}










