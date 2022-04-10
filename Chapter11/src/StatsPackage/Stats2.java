package StatsPackage;
import java.io.*;
import java.util.*;



public class Stats2 
{

	
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num;
		String fileName;
		
		
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
		
		System.out.println("What is the Number of Students Grades being Entered: ");
		num = input.nextInt();
		
		System.out.println("Enter the Name of your File: ");
		fileName = input.next();
		fileName = fileName + ".txt";
		File dataFile = new File(fileName);
		
		
		FileWriter out;
		BufferedWriter writeFile;

		double score;
		String name;
		
		//Write File
		try 
		{
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < num; i++) 
			{
				  System.out.print("Enter Student Name: ");
				  name = input.next();
				  System.out.print("Enter Student Score: ");
				  score = input.nextDouble();
				  writeFile.write(name);
				  writeFile.newLine();
				  writeFile.write(String.valueOf(score));
				  writeFile.newLine();
			}
			
			writeFile.close();
			out.close();
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
			
			System.out.println("Name:\t\tScore:" );
			while((currentLine = readFile.readLine()) != null) 
			{
				names.add(currentLine);
				System.out.print(currentLine +"\t\t");
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
