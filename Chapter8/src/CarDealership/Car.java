



/*
Program: Car.java          Last Date of this Revision: March 31, 2022
Purpose: An application that gets fuel economy, seating, cargo, and description of a car
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/




//Put Car into CarDealearship Package
package CarDealership;



//Car class inherits Vehicle class
public class Car extends Vehicle {
	

	
	
	//constructor method
	public Car(int fECity, int fEHwy, int seating, double cargo) 
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
		return("\nA Car or also known as a Family car \nhas a pretty good fuel economy that "
				+ "seats four passengers and one driver. \nThey are generally less expensive more, "
				+ "comfortable and smaller than a Truck or a Minivan");
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