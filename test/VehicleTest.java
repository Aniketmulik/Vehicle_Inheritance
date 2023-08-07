package com_aurionpro.test;
import com_aurionpro.model.*;

import java.util.Scanner;

public class VehicleTest {
	
	private static void setCarDetails(Car[] c) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			System.out.println("CAR " +(i+1)+ " : ");
			System.out.println("Enter the name of the company : ");
			String companyName = sc.next();
			System.out.println("Enter the mileage of the car  : ");
			double mileage = sc.nextDouble();
			System.out.println("Enter the price of the car : ");
			double price = sc.nextDouble();

			c[i] = new Car(companyName, mileage, price);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of cars : ");
		int n = sc.nextInt();
		Car[] c = new Car[n];
		setCarDetails(c);
		for (int i = 0; i < n; i++) {
			System.out.println("CAR " +(i+1)+ " : ");
			c[i].showCarDetails();
		}
	}

}
