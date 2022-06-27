package com.skilldistillery.foodtruck.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FoodTruckTests {
	private FoodTruck ft1;
	private FoodTruck ft2;

	@Before
	public void setUp() throws Exception {
		ft1 = new FoodTruck();
		ft2 = new FoodTruck("Truck Name", "Truck Food Type", 9);
	}

	@After
	public void tearDown() throws Exception {
		ft1 = null;
		ft2 = null;
	}

	@Test
	public void test_FoodTruck_constructor_empty() {
		assertEquals(null, ft1.getTruckName());
		assertEquals(null, ft1.getTruckFoodType());
		assertEquals(0, ft1.getTruckRating());
	}

	@Test
	public void test_FoodTruck_constructor_String_String_int() {
		String expectedName = "Truck Name";
		String expectedType = "Truck Food Type";
		int expectedRating = 9;
		String name = ft2.getTruckName();
		String type = ft2.getTruckFoodType();
		int rating = ft2.getTruckRating();
		assertEquals(expectedName, name);
		assertEquals(expectedType, type);
		assertEquals(expectedRating, rating);
	}

	@Test
	public void test_getTruckName() {
		String expectedName = "Truck Name";
		String name = ft2.getTruckName();
		assertEquals(expectedName, name);
	}

	@Test
	public void test_setTruckName() {
		String name = "Set Truck Name";
		ft1.setTruckName(name);
		String getName = ft1.getTruckName();
		assertEquals(name, getName);
	}

	@Test
	public void test_getTruckFoodType() {
		String expectedType = "Truck Food Type";
		String getType = ft2.getTruckFoodType();
		assertEquals(expectedType, getType);
	}

	@Test
	public void test_setTruckFoodType() {
		String type = "Set Truck Food Type";
		ft1.setTruckFoodType(type);
		String getType = ft1.getTruckFoodType();
		assertEquals(type, getType);
	}

	@Test
	public void test_getTruckRating() {
		int rating = 9;
		int expectedRating = ft2.getTruckRating();
		assertEquals(expectedRating, rating);
	}

	@Test
	public void test_setTruckRating() {
		int rating = 9;
		ft1.setTruckRating(rating);
		int expectedRating = ft1.getTruckRating();
		assertEquals(expectedRating, rating);
	}
	
	@Test
	public void test_truckId_is_set() {
		String regex = "^Food Truck \\[[\\d]+\\],.*";
		String output = ft2.toString();
		assertTrue(output.matches(regex));
	}

	@Test
	public void test_toString() {
		String regex = "^Food Truck \\[[\\d]+\\], Truck Name: \\[Truck Name\\], "
				+ "Food Type: \\[Truck Food Type\\], Truck Rating: \\[9\\]$";
		String output = ft2.toString();
		assertTrue(output.matches(regex));
	}

}
