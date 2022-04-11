
/*
Program: MyFile2.java          Last Date of this Revision: April 11, 2022

Purpose: An application that creates a file named zzz.txt
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/









//Put MyFile2 into Files Package
package Files;





import java.io.*;
import java.util.*;



//Create class called MyFile2
public class MyFile2
{
	
	
	//Main Method
	public static void main(String[] args) 
	{

		
		//Create a New File Instance
		File textFile = new File("zzz.txt");
		
		
		//Check if File Exists
		if (textFile.exists()) 
		{
			//If File Exists Print File Already Exists
			System.out.println("File Already Exists");
			
		}
		
		
		//OtherWise Create a New File
		else 
		{

			String action;
			do 
			{
				

				try 
				{
					textFile.createNewFile();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
				
				
				//Print New File Created
				System.out.println("New File Created");
				
				
				
				//Prompts User to either Keep or Delete File
				Scanner input = new Scanner(System.in);
				System.out.println("Would You like to Keep (K) or Delete the File (D) or Quit (Q)");
				action = input.next();


				//Check if User Wanted to Keep or Delete
				if (action.equalsIgnoreCase("K") || (action.equalsIgnoreCase("Keep"))) 
				{
					
					//Print File Has been Kept
					System.out.println("File has been kept");
				}
				
				
				if (action.equalsIgnoreCase("D") || (action.equalsIgnoreCase("Delete"))) 
				{
					
					//Delete File
					textFile.delete();
					
					
					//Print File has been Deleted
					System.out.println("File has been Deleted");
				}
				
				
			}
			
			//if the user chooses to quit then exit the program
			while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
			
			}
		

		}
	
	}


/* SCREEN DUMP

New File Created
Would You like to Keep (K) or Delete the File (D) or Quit (Q)
K
File has been kept





New File Created
Would You like to Keep (K) or Delete the File (D) or Quit (Q)
D
File has been Deleted







File Already Exists












*/













