


/*
Program: Minivan.java          Last Date of this Revision: March 31, 2022
Purpose: An application that gets fuel economy, seating, cargo, and description of a minivan
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/



//Put Minivan into CarDealearship Package
package CarDealership;




//Minivan class inherits Vehicle class
public class Minivan extends Vehicle{

	
	
	//constructor method
	public Minivan(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	
	
	//String method to return Cargo Volume
	String cargoContainer() 
	{
		return("\nCargo Volume of the Car is: "+ super.getCargoVolume() + " Cubic Feet");
	}

	
	
	
	//String Method to return Description of the Vehicle
	String description() 
	{
		return("\nMinivan has the best fuel economy compared to the car and the truck. "
				+ "\nThe Minivan seats 1 driver and 7 passengers. \n"
				+ "Their main use comes from the fact they can seat many people."
				+ "\nMinivans also have a good sized cargo to transport anything that is decently sized. "
				+ "\nMinivans are used for larger families who maybe want to go on a road trip.");
	}
	
	
	
	
	//String Method to return the Seating of the Vehicle
	String Seating() 
	{
		return("\nThe Vehicle has " + super.getSeating() + " Seats ");
	}
	
	
	
	
	//String Method to return the Fuel Economy of the Vehicle in the City
	String FECity()
	{
		return("Fuel Economy in the city is: " + super.getFECity() + " Miles Per Gallon");
	}
	
	
	
	
	//String Method to return the Fuel Economy of the Vehicle on the Highway
	String FEHwy()
	{
		return("\nFuel Economy on the Highway is: " + super.getFEHwy() + " Miles Per Gallon");
	}
	
	
	
	
	//toString Method to return Fuel Economy, seating, cargo, and description of vehicle
	public String toString() 
	{
		return(FECity() + FEHwy() + Seating() + cargoContainer() + description());

	}
	
	
	
	

}