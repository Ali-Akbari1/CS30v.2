package FindName;

import java.util.*;

public class FindName 
{
	public static void main (String[] args)
	{
	
    int location;
	String FindNam;
	
	Scanner input = new Scanner(System.in);
	System.out.println("How many names would you like to fill the array with");
	int userInput = input.nextInt();
	
	
	String[] NameArray = new String[userInput];
	
	for (int i = 0; i < userInput; i++)
	{
		System.out.println("Type in the name you would like to fill the array with");
		NameArray[i] = input.next();
	}
	
	
	System.out.println("Enter the name you would like to search for");
	FindNam = input.next();
	
	
	location = Search.linear(NameArray, FindNam);
	if (location == -1)
	{
		System.out.println("Sorry Name Not in the Array");
	}
	
	else 
	{
		System.out.println("First Occurence is element " + location);
	}
	
	}
}
