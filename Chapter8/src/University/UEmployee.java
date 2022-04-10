/*
Program: UEmployee.java          Last Date of this Revision: March 31, 2022
Purpose: An application that returns an Employee name and salary
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/


//Put UEmployee into University Package
package University;


//Create abstract class called UEmployee
public abstract class UEmployee {

	
	
	//initialize variables
	private String firstName;
	private String lastName;
	private double salary;
	

//constructor method 
public UEmployee(String fn, String ln, double s)
{
	firstName = fn;
	lastName = ln;
	salary = s;
}


//String Method to return a string that has first name last name and salary, it prints UEmployee Object
public String toString()
{
	return("University Employee Name: " + firstName + " " + lastName + "\nSalary: " + salary);
}



}