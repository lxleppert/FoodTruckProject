package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] foodTruckFleet;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		String inputString = "";
		int numberOfTrucks = 0;
		int truckRating = 0;

		foodTruckFleet = new FoodTruck[5];

		System.out.println("Welcome to the Food Truck Reviewer\n  Please enter up to five trucks:\n");

		for (int i = 0; i < foodTruckFleet.length; i++) {
			System.out.println("Enter the Food Truck's Name: ");
			inputString = kb.nextLine();

			if (inputString.equals("quit")) {
				break;

			} else {
				numberOfTrucks++;

				foodTruckFleet[i] = new FoodTruck();
				foodTruckFleet[i].setTruckName(inputString);

				System.out.println("Enter the Truck's Food Type: ");
				foodTruckFleet[i].setTruckFoodType(kb.nextLine());

				while (true) {
					System.out.println("Enter the Truck's Rating (1-10): ");
					inputString = kb.nextLine();
					truckRating = stringToInt(inputString);

					if (truckRating < 1 || truckRating > 10) {
						System.err.println("INVALID ENTRY");

					} else {
						foodTruckFleet[i].setTruckRating(truckRating);
						break;
					}
				}
			}
		}

		inputString = "";

		while (!inputString.equals("4")) {
			int highestRating = 0;
			double total = 0;

			System.out.println("\nMENU\n" + "  Select one of the following:" + "\n    1 List Food Trucks\n"
					+ "    2 Show Average Rating\n" + "    3 Show Highest Rated Food Truck(s)\n" + "    4 Quit");
			inputString = kb.next();

			if (numberOfTrucks == 0 && !inputString.equals("4")) {
				System.err.println("TRUCK LIST IS EMPTY");

			} else {
				switch (inputString) {
				case "1":
					System.out.println("FOOD TRUCK LIST\n---------------");
					for (FoodTruck ft : foodTruckFleet) {
						if (ft != null) {
							System.out.println(ft.toString());
						}
					}
					break;

				case "2":
					total = 0;

					for (FoodTruck ft : foodTruckFleet) {
						if (ft != null) {
							total += ft.getTruckRating();
						}
					}
					System.out.printf("Average Food Truck Rating is: %.1f\n", total / numberOfTrucks);
					break;

				case "3":
					highestRating = 0;

					System.out.println("The Highest Rated Food Truck(s):");

					for (int i = 0; i < numberOfTrucks; i++) {
						if (foodTruckFleet[i].getTruckRating() > highestRating) {
							highestRating = foodTruckFleet[i].getTruckRating();
						}
					}
					for (int i = 0; i < numberOfTrucks; i++) {
						if (foodTruckFleet[i].getTruckRating() == highestRating) {
							System.out.println(foodTruckFleet[i].toString());
						}
					}					
					break;

				case "4":
					System.out.println("Enjoy the food!");
					break;

				default:
					System.err.println("INVALID CHOICE");
				}
			}
		}
		kb.close();
	}

	public int stringToInt(String str) {
		int intFromString;

		if (str.matches("^[\\d]+$")) {
			intFromString = Integer.parseInt(str);
			return intFromString;
		}
		return 0;
	}
}
