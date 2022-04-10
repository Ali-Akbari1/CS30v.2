package StatsPackage;


import java.io.*;
import java.util.ArrayList;

public class Stats 
{
	
	public static void main (String[] args) 
	{
		
		File dataFile = new File("test1.txt");
		FileReader in;
		BufferedReader readFile;
		String currentLine;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		double highestGrd = 0;
		double lowestGrd = 100;
		double grade = 0;
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> grades = new ArrayList<String>();

		try 
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			System.out.println("Name:\t\tScore:" );
			while((currentLine = readFile.readLine()) != null) 
			{
				names.add(currentLine);
				System.out.print(currentLine +"\t");
				currentLine = readFile.readLine();
				System.out.println(currentLine);
				grades.add(currentLine);
				grade = Double.parseDouble(currentLine);
				totalScores += Double.parseDouble(currentLine);
				numScores +=1;
				
				if (grade > highestGrd) 
				{
					highestGrd = grade;
				}
				
				if (grade < lowestGrd) 
				{
					lowestGrd = grade;
				}
				
				
				
			}
			avgScore = totalScores / numScores; 
			System.out.println("Highest Score: " + highestGrd);
			System.out.println("Lowest Score: " + lowestGrd);
			System.out.println("Average Score = "+ avgScore);
			readFile.close();
			in.close();
		} 
		
		
		
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
