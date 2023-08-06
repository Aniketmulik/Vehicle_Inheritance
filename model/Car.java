package com_aurionpro.model;

public class Car extends FourWheeler {
	private double price;

	public Car(String companyName, double mileage, double price) {
		super(companyName, mileage);
		this.price = price;
	}

	public void showCarDetails() {
		System.out.println("Company Name : " + companyName);
		System.out.println("Mileage : " + mileage);
		System.out.println("Price : " + price);
	}
}