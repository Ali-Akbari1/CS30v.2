/*
Program: BusinesslAcct.java          Last Date of this Revision: March 31, 2022

Purpose: An application that inherits Account class
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/



//Put BusinessAcct into Bank Package
package Bank;



//BusinesslAcct Class inherits Account Class
public class BusinessAcct extends Account


{
	
	//constructor method
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
		
	}

}