package FindName;

import java.util.*;

public class FindName 
{
	public static void main (String[] args)
	{
	
    int location;
	String FindNam;
	
	Scanner input = new Scanner(System.in);
	System.out.println("How Many Names Would You Like To Fill The Array With");
	int userInput = input.nextInt();
	
	
	String[] NameArray = new String[userInput];
	
	for (int i = 0; i < userInput; i++)
	{
		System.out.println("Type in the Name you Would Like to Fill the Array With");
		NameArray[i] = input.next();
	}
	
	
	System.out.println("Enter the Name you Would Like to Search for");
	FindNam = input.next();
	
	location = Search.linear(NameArray, FindNam);
	if (location == -1)
	{
		System.out.println("Sorry Name Not in the Array");
	}
	
	else 
	{
		System.out.println("First Occurence is Element " + location);
	}
	
	}
}




/* SCREEN DUMP





How Many Names Would You Like To Fill The Array With
3
Type in the Name you Would Like to Fill the Array With
Ali
Type in the Name you Would Like to Fill the Array With
Carter
Type in the Name you Would Like to Fill the Array With
Surkhab
Enter the Name you Would Like to Search for
Ali
First Occurence is Element 0








How Many Names Would You Like To Fill The Array With
3
Type in the Name you Would Like to Fill the Array With
Ali
Type in the Name you Would Like to Fill the Array With
Carter
Type in the Name you Would Like to Fill the Array With
Surkhab
Enter the Name you Would Like to Search for
Carter
First Occurence is Element 1








How Many Names Would You Like To Fill The Array With
3
Type in the Name you Would Like to Fill the Array With
Ali
Type in the Name you Would Like to Fill the Array With
Carter
Type in the Name you Would Like to Fill the Array With
Surkhab
Enter the Name you Would Like to Search for
Surkhab
First Occurence is Element 2









*/