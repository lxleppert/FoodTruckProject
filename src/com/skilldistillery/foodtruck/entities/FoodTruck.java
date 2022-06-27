package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	private int truckId;
	private int truckRating;
	private String truckName;
	private String truckFoodType;
	private static int nextTruckId;

	static {
		nextTruckId = ((int) (Math.random() * 1000)) * 100;
	}

	public FoodTruck() {
		this.truckId = ++nextTruckId;
	}

	public FoodTruck(String truckName, String truckFoodType, int truckRating) {
		this();
		this.truckName = truckName;
		this.truckFoodType = truckFoodType;
		this.truckRating = truckRating;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckFoodType() {
		return truckFoodType;
	}

	public void setTruckFoodType(String truckFoodType) {
		this.truckFoodType = truckFoodType;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	@Override
	public String toString() {
		return "Food Truck [" + truckId + "], Truck Name: [" + truckName + "], Food Type: [" + truckFoodType
				+ "], Truck Rating: [" + truckRating + "]";
	}
}