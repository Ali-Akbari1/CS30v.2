package MyRoster;


import java.io.*;
import java.util.Scanner;

public class Roster 
{
	
	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		String fileName;
		int num;
		String firstName;
		String lastName;
		
		System.out.println("Enter the Name of your File: ");
		fileName = input.next();
		fileName = fileName + ".txt";
		File dataFile = new File(fileName);
		
		
		System.out.println("What is the Number of Students in Your Class: ");
		num = input.nextInt();
		
		
		try //Write Objects
		{
			FileOutputStream out = new FileOutputStream(dataFile);
			ObjectOutputStream writeFile = new ObjectOutputStream(out);

			
			for (int i = 0; i < num; i++) 
			{
				  System.out.print("Enter Student First Name: ");
				  firstName = input.next();
				  
				  System.out.print("Enter Student Last Name: ");
				  
				  lastName = input.next();
				  
				  
				  
				  
				  writeFile.writeObject(new StuName(firstName, lastName));
			}
			
			writeFile.close();
			System.out.println("Data Has Been Written To File");
			
			
			//Read and display Objects
			
			FileInputStream in = new FileInputStream(dataFile);
		    ObjectInputStream readStuName = new ObjectInputStream(in);
		    
		    
		    for (int i = 0; i < num; i++) 
			{
			
			
		   System.out.println((StuName)readStuName.readObject());
		   
		   
			
			}
		    readStuName.close();
			
		}
		
		
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
