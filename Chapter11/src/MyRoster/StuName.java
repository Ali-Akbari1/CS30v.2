package MyRoster;


import java.io.*;


public class StuName implements Serializable
{
	
	private String firstName;
	private String lastName;
	
	
	
	public StuName(String fn, String ln) 
	{
		firstName = fn;
		lastName = ln;
	}
	
	
	public String toString() 
	{
		String stuString;
		
		
		stuString = firstName + " " + lastName;
		return(stuString);
	}

}
