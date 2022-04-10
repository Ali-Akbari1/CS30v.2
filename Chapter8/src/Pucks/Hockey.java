package Pucks;


/*

Program: Hockey.java          Last Date of this Revision: March 16, 2022

Purpose: Test Application for Puck Class

Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 

*/


import java.util.Scanner;


//Class called puck inherits Puck class
public class Hockey extends Puck
{
	
	//Constructor class for hockey
	 public Hockey(double w) 
	 
	 {
		super(w);
		
	}
	 
	 
	 //Main Method
	public static void main(String[] args) 
	{
		
		//Get user input from the user
		Scanner input = new Scanner(System.in);
		
		//tell user to put in a number from 4 to 5.5 
		System.out.println("Enter a weight between 4 and 5.5 ounces for puck number 1"); 
		
		//assign user input to variable called userInput
		double userInput = input.nextDouble();
		
		
		//Get user input from the user
		Scanner input2 = new Scanner(System.in);
		
		//tell user to put in a number from 4 to 5.5 
		System.out.println("Enter a weight between 4 and 5.5 ounces for puck number 2"); 
		
		//assign user input to variable called userInput2
		double userInput2 = input2.nextDouble();
		
		
		//Assign variables p1 and p2 to the user input
		 Puck p1 = new Puck(userInput);
		 Puck p2 = new Puck(userInput2);
		 
		 
		 //Print out weight and division of pucks
		 System.out.println("Puck 1: " + p1.toString());
		 System.out.println("Puck 2: " + p2.toString());
		 
		 
		 //if the two pucks are equal print out that the two pucks are equal
		 if (p1.equals(p2) == true) 
			 
		 {
			 System.out.println("Puck weights are equal."); 
		 }
		 
		 
		//Otherwise print out that the two pucks are not equal
		 else 
		 {
			 System.out.println("Puck weights are not equal."); 
		 }
		 
		 
		 
		//Get user input from the user 
		Scanner inp = new Scanner(System.in);
		
		
		//tell user to put in a number from 4 to 5.5
		System.out.println("Enter a weight between 4 and 5.5 ounces for Spot object 1"); 
		
		
		//assign user input to variable called userInp
		double userInp = inp.nextDouble();
		
		
		//Get user input from the user
		Scanner inp2 = new Scanner(System.in);
		
		
		//tell user to put in a number from 4 to 5.5
		System.out.println("Enter a weight between 4 and 5.5 ounces for Spot object 2"); 
		
		
		//assign user input to variable called userInp2
		double userInp2 = inp2.nextDouble();
		
		
		
		//Assign variables spot one and spot2 to the user input
		 Puck spot1 = new Puck(userInp);
		 Puck spot2 = new Puck(userInp2);
		 
		 
		 
		 //Compare the two weights if they are equal, bigger or smaller
		 if (spot1.compareTo(spot2) == 0) 
		 {
			 
			 
			//Print out weight and division of spot objects
			 System.out.println("Spot Object 1: " + spot1.toString());
			 System.out.println("Spot Object 2: " + spot2.toString());
			 
			 //Print out that the two objects weight are equal
			 System.out.println("Spot Objects weight are equal");
			 
			 
		 }
		 
		 
		 else if (spot1.compareTo(spot2) < 0) 
			 
		 {
			 
			//Print out weight and division of spot objects
			 System.out.println("Spot Object 1: " + spot1.toString());
			 System.out.println("Spot Object 2: " + spot2.toString());
			 
			 
			//Print out that the Spot 1 is smaller than spot 2
			 System.out.println("Spot1 is smaller than spot2");
			 
			 
		 }
		 
		 else 
			 
		 {
			 
			//Print out weight and division of spot objects
			 System.out.println(spot1.toString());
			 System.out.println(spot2.toString());
			 
			 
			//Print out that the Spot 1 is larger than spot 2
			 System.out.println("Spot1 is larger than spot2");
			 
		 }
		 }
		}


		/* SCREEN DUMP


Enter a weight between 4 and 5.5 ounces for puck number 1
5.5
Enter a weight between 4 and 5.5 ounces for puck number 2
4.5
Puck 1: The Puck has a weight of 5.5 ounces, and the division of the Puck is Standard
Puck 2: The Puck has a weight of 4.5 ounces, and the division of the Puck is Youth
Puck weights are not equal.
Enter a weight between 4 and 5.5 ounces for Spot object 1
5.5
Enter a weight between 4 and 5.5 ounces for Spot object 2
4.5
The Puck has a weight of 5.5 ounces, and the division of the Puck is Standard
The Puck has a weight of 4.5 ounces, and the division of the Puck is Youth
Spot1 is larger than spot2




Enter a weight between 4 and 5.5 ounces for puck number 1
4.5
Enter a weight between 4 and 5.5 ounces for puck number 2
4.5
Puck 1: The Puck has a weight of 4.5 ounces, and the division of the Puck is Youth
Puck 2: The Puck has a weight of 4.5 ounces, and the division of the Puck is Youth
Puck weights are equal.
Enter a weight between 4 and 5.5 ounces for Spot object 1
4.5
Enter a weight between 4 and 5.5 ounces for Spot object 2
4.5
Spot Object 1: The Puck has a weight of 4.5 ounces, and the division of the Puck is Youth
Spot Object 2: The Puck has a weight of 4.5 ounces, and the division of the Puck is Youth
Spot Objects are equal


*/


