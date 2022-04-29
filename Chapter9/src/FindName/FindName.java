/*
Program: FindName.java          Last Date of this Revision: April 28, 2022


Purpose: An application that checks fills an array and checks for a name in that array
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/

//Put FindName Class in FindName Package
package FindName;


import java.util.*;




public class FindName 
{
	
	
	//main method
	public static void main (String[] args)
	{
	
	//variables location and FindNam
    int location;
	String FindNam;
	
	
	//Ask user for how many names they want to fill the array with
	Scanner input = new Scanner(System.in);
	System.out.println("How Many Names Would You Like To Fill The Array With");
	int userInput = input.nextInt();
	
	
	
	//create a new String array called NameArray
	String[] NameArray = new String[userInput];
	
	
	
	//For loop to prompt user to type the names they want to fill the array with
	for (int i = 0; i < userInput; i++)
	{
		System.out.println("Type in the Name you Would Like to Fill the Array With");
		NameArray[i] = input.next();
	}
	
	//Prompt user for the name they would like to find
	System.out.println("Enter the Name you Would Like to Search for");
	FindNam = input.next();
	
	
	//Use Search method to see if the Name is in the array
	location = Search.linear(NameArray, FindNam);
	if (location == -1)
	{
		System.out.println("Sorry Name Not in the Array");
	}
	
	else 
	{
		System.out.println("First Occurence is Element " + location);
	}
	
	}
}




/* SCREEN DUMP





How Many Names Would You Like To Fill The Array With
3
Type in the Name you Would Like to Fill the Array With
Ali
Type in the Name you Would Like to Fill the Array With
Carter
Type in the Name you Would Like to Fill the Array With
Surkhab
Enter the Name you Would Like to Search for
Ali
First Occurence is Element 0








How Many Names Would You Like To Fill The Array With
3
Type in the Name you Would Like to Fill the Array With
Ali
Type in the Name you Would Like to Fill the Array With
Carter
Type in the Name you Would Like to Fill the Array With
Surkhab
Enter the Name you Would Like to Search for
Carter
First Occurence is Element 1








How Many Names Would You Like To Fill The Array With
3
Type in the Name you Would Like to Fill the Array With
Ali
Type in the Name you Would Like to Fill the Array With
Carter
Type in the Name you Would Like to Fill the Array With
Surkhab
Enter the Name you Would Like to Search for
Surkhab
First Occurence is Element 2









*/