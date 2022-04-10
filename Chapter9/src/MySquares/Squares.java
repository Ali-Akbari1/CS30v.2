package MySquares;

public class Squares 
{
	static int [] numbers = {0,1,2,3,4};
	static int numElements = numbers.length;
	
	public static void main(String[] args) 
	{
		
		for (int i = 0; i < numElements ; i++)  
		{
            numbers[i] = numbers[i] * numbers[i];
		}
		
		System.out.println("Array: " + numbers[0] + " " + numbers[1] + " " +
				numbers[2] +  " " + numbers[3] + " " + numbers[4]);
	}
}
