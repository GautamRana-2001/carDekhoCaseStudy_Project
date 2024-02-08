package com.jsp.carDekhoCaseStudy.Main;

import java.util.Scanner;

import com.jsp.carDekhoCaseStudy.Operation.CarOperation;

public class CarMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CarOperation carOperation = new CarOperation();
		
		System.out.println("\n********WELCOME TO MY CARDEKHO APP********\n");
		
		boolean condition=true;
		while(condition) {

			System.out.println("=======*******Enter your Choice*******=======");
			System.out.println("/nEnter 1 to Add Car Details");
			System.out.println("Enter 2 to Remove Car Details");
			System.out.println("Enter 3 to Update Car Details");
			System.out.println("Enter 4 to Search Car Collection");
			System.out.println("Enter 5 to Exit\n");
			System.out.println("Choose Your Option First");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
				
				case 1:{
					carOperation.addCar(scanner);
					break;
				}
				case 2:{
					carOperation.removeCar(scanner);
					break;
				}
				case 3:{
					carOperation.updateCar(scanner);
					break;
				}
				case 4:{
					carOperation.searchCar(scanner);
					break;
				}
				case 5:{
					condition=false;
					System.out.println("********Thank You*********");
					break;
				}
				default:
					System.out.println("You have enter invalid choice/n");
					System.out.println("Please enter the Valid Option");
				
			}
		}
	}

}
