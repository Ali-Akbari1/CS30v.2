
/*
Program: Customer.java          Last Date of this Revision: April 28, 2022



Purpose: An application that changes the address of the user
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/







package MyLocalBank;

import java.util.Scanner;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName, street, city, province, post;



	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String ct, String prov, String zip) 
	{
		
		//variables
		firstName = fName;
		lastName = lName;
		street = str;
		city = ct;
		province = prov;
		post = zip;


	}
	
	
	//change city method to change the city of the user to the one passed in the Customer Class
	public void changeCity(String ct) 
	{
		
		city = ct;
		
	}
	
	//change street method to change the street of the user to the one passed in the Customer Class
	public void changeStreet(String str) 
	{
		street = str;
		
	}
	
	//change province method to change the province of the user to the one passed in the Customer Class
	public void changeProvince(String prov) 
	{
		
		province = prov;
		
	}
	
	//change postal code method to change the postal code of the user to the one passed in the Customer Class
	public void changePostalCode(String zip) 
	{
		
		post = zip;
		
		
	}
	



	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName +  " " +  street +  " " + city + " "
				+ province + " " + post + " " + "\n";
	 	return(custString);
	}

}