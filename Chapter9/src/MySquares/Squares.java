


/*

Program: Squares.java          Last Date of this Revision: March 31, 2022

Purpose: An application that gets the square of the index in a array
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/




//Put Squares Class in MySquares Package
package MySquares;

public class Squares 
{
	
	
	//Create Array Called numbers
	static int [] numbers = {0,1,2,3,4};
	
	//Create Integer that gets the length of the array
	static int numElements = numbers.length;
	
	
	
	//Main Method
	public static void main(String[] args) 
	{
		
		
		//for loop to go through all elements in the array
		for (int i = 0; i < numElements ; i++)  
		{
            numbers[i] = numbers[i] * numbers[i];
		}
		
		//print out Square of index
		System.out.println("Array: " + numbers[0] + " " + numbers[1] + " " +
				numbers[2] +  " " + numbers[3] + " " + numbers[4]);
	}
}


/* SCREEN DUMP



Array: 0 1 4 9 16




*/