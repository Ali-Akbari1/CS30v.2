package MyHighestGrade;

import java.util.Scanner;

public class HighestGrade 
{
	public static void main(String[] args) 
	{
		int HighestGrd = 0;
		Scanner input = new Scanner(System.in);
		
		
		
		int[] grades = new int[5];
		
		
		for (int i = 0; i < 5; i++) 
		{
		System.out.println("Please Enter The Grade between 0 and 100");
		grades[i] = input.nextInt();
		
		
		if (grades[i] > HighestGrd)
		{
			HighestGrd = grades[i];
		}
		

		}
		System.out.println("Highest Grade is: " + HighestGrd);
		
		
		
		
	}
}
