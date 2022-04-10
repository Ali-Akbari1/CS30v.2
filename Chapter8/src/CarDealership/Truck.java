

/*
Program: Truck.java          Last Date of this Revision: March 31, 2022
Purpose: An application that gets fuel economy, seating, cargo, and description of a truck
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/





//Put Truck into CarDealearship Package
package CarDealership;



//Truck class inherits Vehicle class
public class Truck extends Vehicle
{

	
	//constructor method
	public Truck(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
		
	}

	
	
	//String method to return Cargo Volume
	String cargoContainer() 
	{
		return("\nCargo Volume of the Car is: "+ super.getCargoVolume() + " Cubic Feet");
	}

	
	
	
	//String Method to return Description of the Vehicle
	String description() {
		return("\nA Truck has not as good of a fuel economy as a Car. "
				+ "\nThe Truck seats four passengers and one driver. \n"
				+ "Their main use comes from the fact they have a large cargo bed."
				+ "\nTrucks are able to carry large goods with the cargo bed. "
				+ "\nTrucks are also better at offroading then cars and minivans.");
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