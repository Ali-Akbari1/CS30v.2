

/*
Program: Roster.java          Last Date of this Revision: April 11, 2022

Purpose: An application that writes students name to a file
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/












//Put Roster into MyRoster Package
package MyRoster;


import java.io.*;
import java.util.Scanner;



//Create class called Roster
public class Roster 
{
	
	
	
	//Main Method
	public static void main(String[] args) 
	{

		
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		//Variables
		String fileName;
		int num;
		String firstName;
		String lastName;
		
		
		
		
		//Ask User For the Name Of their File
		System.out.println("Enter the Name of your File: ");
		fileName = input.next();
		fileName = fileName + ".txt";
		
		
		//Create a New File Instance
		File dataFile = new File(fileName);
		
		
		
		//Ask User The Number of Students in their class
		System.out.println("What is the Number of Students in Your Class: ");
		num = input.nextInt();
		
		
		
		//Write Objects
		try 
		{
			FileOutputStream out = new FileOutputStream(dataFile);
			ObjectOutputStream writeFile = new ObjectOutputStream(out);

			
			
			//For loop to go through the number of students in their class
			for (int i = 0; i < num; i++) 
			{
				
				
				  //Get First Name and Last Name of Student From User
				  System.out.print("Enter Student First Name: ");
				  firstName = input.next();
				  
				  System.out.print("Enter Student Last Name: ");
				  
				  lastName = input.next();
				  
				  
				  
				  //Write Students Name to file using toString method
				  writeFile.writeObject(new StuName(firstName, lastName));
			}
			
			writeFile.close();
			System.out.println("Data Has Been Written To File");
			
			
			
			
			//Read and display Objects
			
			FileInputStream in = new FileInputStream(dataFile);
		    ObjectInputStream readStuName = new ObjectInputStream(in);
		    
		    
		    
		    //For loop to go through the number of students in their class
		    for (int i = 0; i < num; i++) 
			{
			
		   //Print Student Names
		   System.out.println((StuName)readStuName.readObject());
		   
		   
			
			}
		    
		    //close file
		    readStuName.close();
			
		}
		
		
		
		//Exceptions
		catch(FileNotFoundException e) 
		{
			System.out.println("File Could Not be Found");
			System.out.println("File Not Found Exception" + e.getMessage());
		}
		
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}

		catch(ClassNotFoundException e) 
		{
			System.out.println("Class Not Found Exception" + e.getMessage());
			
		}
		
		
	}

}

/* SCREEN DUMP



Enter the Name of your File: 
test4
What is the Number of Students in Your Class: 
3
Enter Student First Name: Ali
Enter Student Last Name: Akbari
Enter Student First Name: Carter
Enter Student Last Name: Sarney
Enter Student First Name: Surkhab
Enter Student Last Name: Mundi
Data Has Been Written To File
Ali Akbari
Carter Sarney
Surkhab Mundi




*/
