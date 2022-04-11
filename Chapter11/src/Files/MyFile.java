/*
Program: MyFile.java          Last Date of this Revision: April 11, 2022

Purpose: An application that checks if a file exists
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/


//Put MyFile into Files Package
package Files;


import java.io.*;
import java.util.Scanner;




//Create class called MyFile
public class MyFile 
{
	
	
	//Main Method
	public static void main(String[] args) 
	{
		
		//Get User Input for the Name of the File
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of your file");
		String userInput = input.nextLine();
		userInput = userInput + ".txt";
		
		
		
		//Create a New File Instance
		File textFile = new File(userInput);
		
		
		//Check if File Exists
		if (textFile.exists()) 
		{
			
			//If File Exists Print File Already Exists
			System.out.println("File Already Exists");
			
		}
		
		else 
		{
			
			//If File Does Not Exist Print File Does Not Exist
			System.out.println("File Does Not Exist");
		}
		
	}
	

}

/* SCREEN DUMP




Enter the name of your file
zzz
File Does Not Exist






Enter the name of your file
test2
File Already Exists









*/
