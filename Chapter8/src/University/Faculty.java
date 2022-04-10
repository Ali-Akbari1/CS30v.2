/*
Program: Faculty.java          Last Date of this Revision: March 31, 2022
Purpose: An application that gets and returns department name
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/


//Put Faculty into package called University
package University;


//Faculty class inherits UEmployee class
public class Faculty extends UEmployee {
	
	
	
	//initialize department variable
	private String dept;

	
	//constructor method
	public Faculty(String fn, String ln, String d, double s) 
	{
		super(fn, ln,s);
		dept = d;
	}
	
	
	//String method to return department
	String getDept() 
	{
		return dept;
	}
	
	
	//String Method to return Faculty Department
	public String toString()
	{
	return(super.toString()+ "\nFaculty Department: " + getDept());
	}
	
	
}