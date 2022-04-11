

/*
Program: Stats2.java          Last Date of this Revision: April 11, 2022

Purpose: An application that has a toString() method
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/



//Put StuName into MyRoster Package
package MyRoster;


import java.io.*;



//Create class called StuName that implements Serializable
public class StuName implements Serializable
{
	
	
	//Variables for first Name Last Name
	private String firstName;
	private String lastName;
	
	
	//constructor method
	public StuName(String fn, String ln) 
	{
		firstName = fn;
		lastName = ln;
	}
	
	
	
	//toString() Method that returns first name and last name
	public String toString() 
	{
		String stuString;
		
		
		stuString = firstName + " " + lastName;
		return(stuString);
	}

}
