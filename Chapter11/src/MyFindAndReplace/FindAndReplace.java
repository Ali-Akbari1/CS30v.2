
/*
Program: FindAndReplace.java          Last Date of this Revision: April 11, 2022

Purpose: An application that finds a word in a file and replaces it with the user input
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/







//Put FindAndReplace into MyFindAndReplace Package
package MyFindAndReplace;

import java.io.*;
import java.util.*;




//Create class called FindAndReplace
public class FindAndReplace 
{
	
	
	
	//Main Method
	public static void main(String[] args) 
	{

		
		
		//Variables
        String oldData = "";
        FileWriter out;
        String fileName;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        

		
		
        //Ask User For the Name Of their File
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name of your file");
		fileName = input.nextLine();
		fileName = fileName + ".txt";
		File dataFile = new File(fileName);
		
		
		
		
		//Get User Input for the word they would like to find
		System.out.println("What Word or Phrase Would You Like to Find");
		String findWord = input.nextLine();
		
		
		
		
		//Get User Input for the word they would like to replace the word they found with
		System.out.println("What Word or Phrase Would You Like to Replace " + findWord + " With");
		String replaceWord = input.nextLine();
		
		
		
		
		try 
		{

			
			reader = new BufferedReader(new FileReader(dataFile));
			
			
			//Assign currentLine to Lines Being Read
			String currentLine = reader.readLine();
			
			
			
			//Reading the File until White Space
			while(currentLine != null) 
			{
				
				//Read File and Add Lines to String Variable oldData
				oldData += currentLine + System.lineSeparator();
				
				
				//Read Line
				currentLine = reader.readLine();
				
				
			}
			
			
			//Create a new String and replace all of the words 
			String newData = oldData.replaceAll(findWord, replaceWord);
			

			
			//Write Data to new File
			writer = new BufferedWriter(new FileWriter(dataFile));
			
			writer.write(newData);
			
			
			//Print New Data Written To File
			System.out.println("New Data Written To File");
			
			
			//Close File
			reader.close();
			writer.close();
			
		}
		
		//Exceptions
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}
		
	}

}


/*






Enter the Name of your file
test2
What Word or Phrase Would You Like to Find
Ali
What Word or Phrase Would You Like to Replace Ali With
Hey
New Data Written To File








 */






