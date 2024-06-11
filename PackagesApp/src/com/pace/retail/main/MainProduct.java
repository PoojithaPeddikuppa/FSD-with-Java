package com.pace.retail.main;

import com.pace.retail.Product;

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mobile = new Product(123,"iPhone",154234.25f);
		Product laptop = new Product(456,"Hp",4356.89f);
		System.out.println("Mobile Phone Details");
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
		System.out.println(mobile.getPrice());
		System.out.println("Laptop Details");
		System.out.println(laptop.getId());
		System.out.println(laptop.getName());
		System.out.println(laptop.getPrice());
		mobile.setPrice(150000.00f);
		System.out.println(mobile.getPrice());
		}
}
