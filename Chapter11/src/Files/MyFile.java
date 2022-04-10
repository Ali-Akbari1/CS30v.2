
package Files;



import java.io.*;
import java.util.Scanner;

public class MyFile 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of your file");
		String userInput = input.nextLine();
		
		File textFile = new File(userInput);
		if (textFile.exists()) 
		{
			System.out.println("File Already Exists");
			
		}
		
		else 
		{
			System.out.println("File Does Not Exist");
		}
	}

}