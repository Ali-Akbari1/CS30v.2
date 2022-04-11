

/*
Program: Stats.java          Last Date of this Revision: April 11, 2022

Purpose: An application that gets scores from a file and prints 
lowest highest and average score
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/














//Put Stats into StatsPackage Package
package StatsPackage;


import java.io.*;
import java.util.ArrayList;







//Create class called Stats
public class Stats 
{
	
	
	
	//Main Method
	public static void main (String[] args) 
	{
		
		
		
		
		//Create a New File Instance
		File dataFile = new File("test1.txt");
		
		
		//Decodes From Bytes To Characters
		FileReader in;
		
		
		//Reads Text From a Character Input Stream
		BufferedReader readFile;
		
		
		//Variables
		String currentLine;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		double highestGrd = 0;
		double lowestGrd = 100;
		double grade = 0;
		
		
		
		
		
		//Create Array names and grades
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> grades = new ArrayList<String>();

		
		
		
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
				System.out.print(currentLine +"\t");
				
				
				
				//Add current Line to Grades arrat
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


Name:		Score:
John Doe	86
Ali Akbari	99
Surkhab Mundi	90
Carter Sarney	95
James Smith	24
Highest Score: 99.0
Lowest Score: 24.0
Average Score = 78.8



*/