/*
Program: HighestGrade.java          Last Date of this Revision: April 28, 2022


Purpose: An application that fills an array with numbers and checks for the highest one
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/


//Put HighestGrade into MyHighestGrade package
package MyHighestGrade;



import java.util.Scanner;





public class HighestGrade 
{
	
	//main method
	public static void main(String[] args) 
	{
		
		//variable for the highest grade
		int HighestGrd = 0;
		
		//scanner for user input
		Scanner input = new Scanner(System.in);
		
		
		//create a new array called grades
		int[] grades = new int[5];
		
		
		
		//for loop to go through and prompt user for grades to fill the array with
		for (int i = 0; i < 5; i++) 
		{
			
		//filling the array	
		System.out.println("Please Enter The Grade between 0 and 100");
		grades[i] = input.nextInt();
		
		
		
		//If the number in the array is bigger than the highest grade
		if (grades[i] > HighestGrd)
		{
			//change highest grade to the number in the array
			HighestGrd = grades[i];
			
		}
		

		}
		
		//prints out the highest grade
		System.out.println("Highest Grade is: " + HighestGrd);
		
		
		
		
	}
}
