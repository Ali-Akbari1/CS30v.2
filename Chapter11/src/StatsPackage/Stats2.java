
/*
Program: Stats2.java          Last Date of this Revision: April 11, 2022

Purpose: An application that gets scores and names from a user
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/










//Put Stats2 into StatsPackage Package
package StatsPackage;



import java.io.*;
import java.util.*;





//Create class called Stats2
public class Stats2 
{

	//Main Method
	public static void main (String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		//Decodes From Bytes To Characters
		FileReader in;
		
		
		
		//Reads Text From a Character Input Stream
		BufferedReader readFile;
		
		
		
		//Variables
		int num;
		String fileName;
		String currentLine;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		double highestGrd = 0;
		double lowestGrd = 100;
		double grade = 0;
		double score;
		String name;
		
		
		
		//Create Array names and grades
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> grades = new ArrayList<String>();
		
		
		
		//Ask User The Number of Students Grades Being Entered
		System.out.println("What is the Number of Students Grades being Entered: ");
		num = input.nextInt();
		
		
		
		//Ask User For the Name Of their File
		System.out.println("Enter the Name of your File: ");
		fileName = input.next();
		fileName = fileName + ".txt";
		
		
		//Create a New File Instance
		File dataFile = new File(fileName);
		
		
		FileWriter out;
		BufferedWriter writeFile;

		
		
		//Write File
		try 
		{
			
			
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			
			//For loop to go through the number of students being entered
			for (int i = 0; i < num; i++) 
			{
				
				
				  //Ask User for name and grade
				  System.out.print("Enter Student Name: ");
				  name = input.next();
				  System.out.print("Enter Student Score: ");
				  score = input.nextDouble();
				  
				  //write name and score to file
				  writeFile.write(name);
				  writeFile.newLine();
				  writeFile.write(String.valueOf(score));
				  writeFile.newLine();
				  
				  
			}
			
			
			
			//Close File
			writeFile.close();
			out.close();
			
			
			//Tell User data has been written to File
			System.out.println("Data Has Been Written To File");
		}
		
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}
		
		
		
		
		//Read File
		try 
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			
			//Header
			System.out.println("Name:\t\tScore:" );
			
			
			
			//Reading the File until White Space
			while((currentLine = readFile.readLine()) != null) 
			{
				
				
				
				//Add current Line to Array names
				names.add(currentLine);
				
				//Print Out Names
				System.out.print(currentLine +"\t\t");
				
				
				//Add current Line to Grades array
				currentLine = readFile.readLine();
				System.out.println(currentLine);
				grades.add(currentLine);
				grade = Double.parseDouble(currentLine);
				
				
				//Add All Scores to variable total scores
				totalScores += Double.parseDouble(currentLine);
				
				
				//counter for number of scores
				numScores +=1;
				
				
				//If current grade is higher than highest grade
				if (grade > highestGrd) 
				{
					
					//change highest Grade to current grade 
					highestGrd = grade;
				}
				
				
				//If current grade is lowest than lowest grade
				if (grade < lowestGrd) 
				{
					
					//assign lowest Grade to current grade
					lowestGrd = grade;
				}
				
				
				
			}
			
			//Get average Score of all the scores
			avgScore = totalScores / numScores; 
			
			
			//Print out the highest lowest and average score
			System.out.println("Highest Score: " + highestGrd);
			System.out.println("Lowest Score: " + lowestGrd);
			System.out.println("Average Score = "+ avgScore);
			
			
			//close the file
			readFile.close();
			in.close();
		} 
		
		
		//Exceptions
		catch(FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}
		
		
		
		
		
		
		
	}
	
	
	
}





/* SCREEN DUMP

What is the Number of Students Grades being Entered: 
	5
	Enter the Name of your File: 
	test3
	Enter Student Name: John
	Enter Student Score: 86
	Enter Student Name: Ali
	Enter Student Score: 99
	Enter Student Name: Surkhab
	Enter Student Score: 90
	Enter Student Name: Carter
	Enter Student Score: 95
	Enter Student Name: James
	Enter Student Score: 20
	Data Has Been Written To File
	Name:		Score:
	John		86.0
	Ali		99.0
	Surkhab		90.0
	Carter		95.0
	James		20.0
	Highest Score: 99.0
	Lowest Score: 20.0
	Average Score = 78.0

	
	*/