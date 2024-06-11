package com.pace.staticmembers.main;

import com.pace.staticmembers.Customer;

public class MainCustomers {

	public static void main(String[] args) {
		Customer nesha = new Customer(1234,"Nesha",698753.25f);
		Customer sagar = new Customer(1111,"Sagar",6687453.21f);
		System.out.println( nesha.getId() + "  " + nesha.getName() + "  " + 
								nesha.getBillAmt() );

		System.out.println( sagar.getId() + "  " + sagar.getName() + "  " + 
				sagar.getBillAmt() );
		System.out.println(Customer.companyName);
		System.out.println( nesha.hashCode());
		System.out.println( sagar.hashCode()); 
		
		boolean isEqual = nesha.hashCode()
				== sagar.hashCode();
		
		System.out.println("nesha and sagar objects are equal ? "  +  isEqual);
		boolean isEqual2 =nesha.equals(sagar);
		System.out.println("nesha and sagar objects are equal ? "  +  isEqual2);
		
	//	System.out.println(nesha.toString());
	//	System.out.println(sagar.toString());
		
		System.out.println(nesha);
		System.out.println(sagar);
		
		
		
		
		
		
		
	}

}
