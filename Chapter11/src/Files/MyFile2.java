package Files;
import java.io.*;
import java.util.*;

public class MyFile2
{
	public static void main(String[] args) 
	{

		File textFile = new File("zzz.txt");
		if (textFile.exists()) 
		{
			System.out.println("File Already Exists");
			
		}
		
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
				
				System.out.println("New File Created");
				
				
				Scanner input = new Scanner(System.in);
				System.out.println("Would You like to Keep (K) or Delete the File (D) or Quit (Q)");
				action = input.next();


				
				if (action.equalsIgnoreCase("K") || (action.equalsIgnoreCase("Keep"))) 
				{
					System.out.println("File has been kept");
				}
				
				
				if (action.equalsIgnoreCase("D") || (action.equalsIgnoreCase("Delete"))) 
				{
					textFile.delete();
					System.out.println("File has been Deleted");
				}
				
				
			}

			while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
			}

		}
	}