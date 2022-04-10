/*
Program: Staff.java          Last Date of this Revision: March 31, 2022
Purpose: An application that returns an Employees job title
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/



//Put Staff into University Package
package University;



//Staff class inherits UEmployee class
public class Staff extends UEmployee 
{
	
	//initialize job title variable
	private String jobtitle;

	
	//constructor method
	public Staff(String fn, String ln, String j, double s) 
	{
		super(fn, ln,s);
		jobtitle = j;

	}
	
	
	//String method to return job title
	String getJobTitle() 
	{
		return jobtitle;
	}
	

	//String Method to return Staff job title
	public String toString()
	{
		return(super.toString() + "\nStaff Member Job Title: " + getJobTitle());
	}

}