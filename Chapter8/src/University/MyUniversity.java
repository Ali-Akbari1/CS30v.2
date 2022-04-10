
/*
Program: MyUniversity.java          Last Date of this Revision: March 31, 2022
Purpose: An application that gets user input and returns the variables
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/





//Put MyUniversity into University Package
package University;



import java.util.Scanner;



//Create class called MyUniversity
public class MyUniversity 

{

	
	//Main Method
	public static void main(String[] args) 
	{
		
		
		//Gets user Input from the user and asks for first name, 
		//last name, and salary
		String action;
		do 
		{ 
			
		
			
		//first name
		Scanner first = new Scanner(System.in);
		System.out.println("What is Your First Name?"); 
		String fn = first.nextLine();
		
		
		//last name
		Scanner last = new Scanner(System.in);
		System.out.println("What is Your Last Name?"); 
		String ln = last.nextLine();
		
		
		//salary
		Scanner sal = new Scanner(System.in);
		System.out.println("What is your Salary?"); 
		double s = sal.nextDouble();
		
		
		
		
		
		//Asks the user if they are a faculty member, staff member
		// or if they want to quit
		Scanner input = new Scanner(System.in);
		System.out.println("Are You a Faculty Member (F) \\ or a Staff Member (S) \\ Or Do you Want to Quit (Q)");
		System.out.println("Enter Choice: ");
		action = input.next();
		
		
		
		//If the user is apart of faculty ask them what department they work in
		if (action.equalsIgnoreCase("F") || (action.equalsIgnoreCase("Faculty"))) 
		
		{
		
		
			
		Scanner dept = new Scanner(System.in);
		System.out.println("What Department Do You Work in?"); 
		String d = dept.nextLine();
		
		
		//assign variable emp1 to a new faculty class with 
		//first name, last name, department and salary
		Faculty emp1 = new Faculty(fn,ln,d,s);
		
		
		//print out the faculty members first name, last name
		//department and salary
		System.out.println(emp1.toString());
		
		}
		
		
		
		//If the user is apart of Staff ask them what their job title is
		if (action.equalsIgnoreCase("S") || (action.equalsIgnoreCase("Staff")))  
		
		{
		
			
			
		Scanner jobtitle = new Scanner(System.in);
		System.out.println("What is Your Job Title?"); 
		String jt = jobtitle.nextLine();
		
		
		
		//assign variable emp2 to a new Staff class with 
		//first name, last name, job title and salary
		Staff emp2 = new Staff(fn,ln,jt,s);
		
		
		//print out the staff members first name, last name
		//job title and salary
		System.out.println(emp2.toString());
		
		}
		}
		
		
		
		//if the user chooses to quit then exit the program
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
	
	

}
}








/* SCREEN DUMP
What is Your First Name?
Ali
What is Your Last Name?
Akbari
What is your Salary?
40000
Are You a Faculty Member (F) \ or a Staff Member (S) \ Or Do you Want to Quit (Q)
Enter Choice: 
F
What Department Do You Work in?
Math
University Employee Name: Ali Akbari
Salary: 40000.0
Faculty Department: Math
What is Your First Name?
Jane
What is Your Last Name?
Doe
What is your Salary?
100000
Are You a Faculty Member (F) \ or a Staff Member (S) \ Or Do you Want to Quit (Q)
Enter Choice: 
S
What is Your Job Title?
Secretary
University Employee Name: Jane Doe
Salary: 100000.0
Staff Member Job Title: Secretary
*/























