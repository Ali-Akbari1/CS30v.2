

//Put Search Class in FindName Package
package FindName;



public class Search
{	
	//linear method 
	public static int linear(String[] array, String NamToFind) 
	{
		
		//variables index and size
		int index = 0;
		int size = array.length;

		//While the Name to find does not equal the name in the array keep the while loop going
		while ((!array[index].equals(NamToFind)) && (index < size - 1)) 
		{
			
			//index counter
			index += 1;
			
		}
		

		//If array name equals name to find return index of element
		if (array[index].equals(NamToFind)) 
		{

			return(index);
			
		} 
		
		//otherwise return -1
		else 
		{
			
			return(-1);
			
		}
	}
}