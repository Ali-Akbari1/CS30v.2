
/*
Program: MyDealership.java          Last Date of this Revision: March 31, 2022
Purpose: An application that returns variables of a car, truck or minivan
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/






//Sources: 


//Car:

//https://www.fueleconomy.gov/feg/noframes/43299.shtml



//Truck:

//https://www.fueleconomy.gov/feg/byclass/Standard_Pickup_Trucks_4WD2021.shtml
//https://www.carindigo.com/chevrolet/silverado-1500/cargo-space


//Minivan:

//https://www.jdpower.com/cars/shopping-guides/common-minivan-dimensions#:~:text=The%20cargo%20area%20is%20typically,feet%20of%20average%20cargo%20space.
//https://www.fueleconomy.gov/feg/byclass/Minivan_4WD2021.shtml






//Put MyDealership into CarDealership Package
package CarDealership;




import java.util.Scanner;



//Create a class called MyDealership
public class MyDealership 
{
	
	
	
	//Main Method
	public static void main(String[] args)
	{
		
		
		
		//Gets user Input from the user and asks if they would like to check
		//Car, Truck, Minivan, or if they would like to quit
		String action;
		do 
		{
			
			
			
			//asks if they want to check Car, Truck, Minivan, or quit
			Scanner input = new Scanner(System.in);
			System.out.println("Would You Like To Check Car (C) Or Truck (T) Or Minivan (M) Or Quit(Q)");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			
			
			
			//If the user wants to check Car
			if (action.equalsIgnoreCase("C") || (action.equalsIgnoreCase("Car"))) 
			{
				
				
				//Assign variable c to new Car class with Fuel economy, seating 
				//and cargo volume
				Car c = new Car (28,36,5,60);
				
				
				//Print out c
				System.out.println(c.toString());
				
			}
			
			
			
			//if the user wants to check Truck
			if (action.equalsIgnoreCase("T") || (action.equalsIgnoreCase("Truck"))) 
			{
				
				
				//Assign variable t to new Truck class with Fuel economy, seating 
				//and cargo volume
				Truck t = new Truck(14,18,5,89);
				
				
				//Print out t
				System.out.println(t.toString());
				
				
			}
			
			
			
			
			//If the user wants to check Minivan
			if (action.equalsIgnoreCase("M") || (action.equalsIgnoreCase("Minivan"))) 
			{
				
				
				//Assign variable m to new Minivan class with Fuel economy, seating 
				//and cargo volume
				Minivan m = new Minivan(30,35,8,140);
				
				
				//Print out m
				System.out.println(m.toString());
				
				
			
		}
		}
		
		//if the user chooses to quit then exit the program
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
		
}
}



/* SCREEN DUMP
Would You Like To Check Car (C) Or Truck (T) Or Minivan (M) Or Quit(Q)
Enter Choice: 
C
Fuel Economy in the city is: 28 Miles Per Gallon
Fuel Economy on the Highway is: 36 Miles Per Gallon
The Vehicle has 5 Seats 
Cargo Volume of the Car is: 60.0 Cubic Feet
A Car or also known as a Family car 
has a pretty good fuel economy that seats four passengers and one driver. 
They are generally less expensive more, comfortable and smaller than a Truck or a Minivan
Would You Like To Check Car (C) Or Truck (T) Or Minivan (M) Or Quit(Q)



Enter Choice: 
truck
Fuel Economy in the city is: 14 Miles Per Gallon
Fuel Economy on the Highway is: 18 Miles Per Gallon
The Vehicle has 5 Seats 
Cargo Volume of the Car is: 89.0 Cubic Feet
A Truck has not as good of a fuel economy as a Car. 
The Truck seats four passengers and one driver. 
Their main use comes from the fact they have a large cargo bed.
Trucks are able to carry large goods with the cargo bed. 
Trucks are also better at offroading then cars and minivans.




Would You Like To Check Car (C) Or Truck (T) Or Minivan (M) Or Quit(Q)
Enter Choice: 

M

Fuel Economy in the city is: 30 Miles Per Gallon
Fuel Economy on the Highway is: 35 Miles Per Gallon
The Vehicle has 8 Seats 
Cargo Volume of the Car is: 140.0 Cubic Feet
Minivan has the best fuel economy compared to the car and the truck. 
The Minivan seats 1 driver and 7 passengers. 
Their main use comes from the fact they can seat many people.
Minivans also have a good sized cargo to transport anything that is decently sized. 
Minivans are used for larger families who maybe want to go on a road trip.
*/