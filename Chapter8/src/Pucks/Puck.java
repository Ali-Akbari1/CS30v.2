

/*

Program: Puck.java          Last Date of this Revision: March 16, 2022

Purpose: Class to get weight, division and return a string

Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 

*/

package Pucks;

import java.awt.EventQueue;


//Class called Puck inherits Disk class
//Implements Comparable to be able to compare objects to each other
public class Puck extends Disk implements Comparable{
	
	//Create Double Variable Weight
	private double weight;
	
	//Create Two Boolean Variables called Standard and Youth
	private boolean standard,youth;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	
	
	//Puck Class that has w as a argument 
	public Puck(double w) {
		
		
	//Assign Weight as w
		weight = w;
		
		
		//Check if weight values and return boolean variables as either true or false
		if (weight >= 5 && weight <= 5.5) 
		{
			standard = true;
			youth = false;
			}
		if (weight >= 4 && weight<= 4.5) 
		{ 
			standard = false;
			youth = true;
			}
		if (weight > 5.5&&weight< 4) {
			standard = false;
			youth = false;
		}
		}
	
	
	//Method to return weight
	public double getWeight() 
	{
		return (weight);
		}	
	
	
	// Method to get division of the puck
	public String getDivision()
	{
		
		// Create variable div
		String div;
		
		
		//Check puck division and return a string
		if (standard)
		{
			div = "Puck is Standard";
		}
		else if (youth)
		{
			div = "Puck is Youth";
		}
		else 
		{
			div = "Puck size is neither youth nor standard";
		}
		return div;
		
	}

		// String Method to return a string that has getWeight() and GetDivision()
		public String toString()
		{
			String puck;
			
			puck = "The Puck has a weight of " + getWeight() + " ounces, and the division of the "+ getDivision();
			return(puck);
		}
		
		
		//Check to see if Objects are equal to each other
		 public boolean equals(Object p) 
		 {
			 Puck testObj = (Puck)p;	
			 
			 // If Objects are equal return true
			 if(testObj.getWeight() == weight) 
			 {
			 return(true);
			 } 
			 
			 //Otherwise return false
			 else 
			 {
				 
			 return(false);
			 
			 }
			 
			 }
		 
		 //Compare two objects weight 
		 public int compareTo(Object d) 
		 {
			 Puck testPuck = (Puck)d;
			 
			 
			 //return a number from -1 to 1 based on the weight of the objects
			if (weight < testPuck.getWeight()) 
			 {
				 return(-1); 
			 }
			 else if (weight == testPuck.getWeight()) 
			 {
				 return(0);
			 }
			 else 
			 {
				 return(1);
			 }
		 }

		 
	}