/*
Program: MyBank.java          Last Date of this Revision: March 31, 2022

Purpose: An application that gets user input and returns the variables
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/




//Put MyBank into Bank Package
package Bank;




import java.util.Scanner;





//MyBank Class inherits Account Class
public class MyBank extends Account


{

	//constructor method
	public MyBank(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
		
	}
	
	
	
	//main method
	public static void main(String[] args) 

	{
		
		
		
		//Gets user Input from the user and asks for first name, 
		//last name, city, street, and zip code
		String action;
		
		do 
		{
		
			
		//first name
		Scanner fname = new Scanner(System.in);
		System.out.println("What is Your First Name?"); 
		String fnam = fname.nextLine();
		
		
		
		
		//last name
		Scanner lname = new Scanner(System.in);
		System.out.println("What is Your Last Name?"); 
		String lnam = lname.nextLine();
		
		
		
		
		//city
		Scanner city = new Scanner(System.in);
		System.out.println("What City Do You Live in?"); 
		String ct = city.nextLine();
		
		
		
		//street
		Scanner st = new Scanner(System.in);
		System.out.println("What Street Do You Live on?"); 
		String street = st.nextLine();
		
		
		
		
		//zip code
		Scanner zip = new Scanner(System.in);
		System.out.println("What is Your Zip Code?"); 
		String zp = zip.nextLine();
		
		
		
		
		//Asks the user if they want to check their personal or business account
		// or if they want to quit
		Scanner input = new Scanner(System.in);
		System.out.println("Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)");
		System.out.println("Enter Choice: ");
		action = input.next();
		
		
		
		
		//if the user wants to check their personal account
		if (action.equalsIgnoreCase("P") || (action.equalsIgnoreCase("Personal"))) 
		{
		
			
		//ask them for balance of their account
		Scanner input1 = new Scanner(System.in);
		System.out.println("What is the balance of your Personal Account?"); 
		double balance = input1.nextDouble();
		
		
		
		
		//assign variable pct to a new PersonalAcct Class with variables from 
		//user input
		Account pct = new PersonalAcct(balance, fnam, lnam, null, ct, street, zp);
		
		
		
		
		//check if the users balance is less than 100 dollars
		//if they are less than 100 dollars charge 2 dollars to their account
		if (balance < 100) 
		{
			
			balance = balance - 2; 
			
			System.out.println("Balance is under 100 Dollars, 2 Dollars Must Be Charged to the Account");
			
		}
		
		
		
		//print out first name, last name, address, and their balance 
		
		System.out.println("Account Holder: " + fnam + " " +  lnam + "\nThe Balance of the Personal Account is: " + balance
				+ "\nThe Account Holder lives in: \n" + ct + " " +  street + " " + zp); 
		
		
		
		
		}
		
		
		
		
		//if the user wants to check their business account
		if (action.equalsIgnoreCase("B") || (action.equalsIgnoreCase("Business"))) {
		
			
			
		//ask the user for the balance of their account	
		Scanner input2 = new Scanner(System.in);
		System.out.println("What is the balance of your Business Account?"); 
		double balance1 = input2.nextDouble();
		
		
		
		
		//assign variable bct to a new BusinessAcct Class with variables from 
		//user input
		Account bct = new BusinessAcct(balance1, fnam, lnam, null, ct, street, zp);
		
		
		
		
		//check if the users balance is less than 500 dollars
		//if so charge 10 dollars to the account
		if (balance1 < 500) 
		{
			
			balance1 = balance1 - 10; 
			
			System.out.println("Balance is under 500 Dollars, 10 Dollars Must Be Charged to the Account");
			
			
		}
		
		
		
		//print out first name, last name, address, and their balance
		System.out.println("Account Holder: " + fnam + " " +  lnam + "\nThe Balance of the Business Account is: " + balance1 
				+ "\nThe Account Holder lives in: \n" + ct + " " +  street + " " + zp); 
		
		
		
	}
		}
		
		
		//if the user chooses to quit then exit the program
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
	}
}




/* SCREEN DUMP
What is Your First Name?
Ali
What is Your Last Name?
Akbari
What City Do You Live in?
Calgary
What Street Do You Live on?
1019 1 St NW
What is Your Zip Code?
T2M 2S2




Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)
Enter Choice: 
personal
What is the balance of your Personal Account?
100
Account Holder: Ali Akbari
The Balance of the Personal Account is: 100.0
The Account Holder lives in: 
Calgary 1019 1 St NW T2M 2S2
What is Your First Name?
Jane
What is Your Last Name?
Doe
What City Do You Live in?
New York City
What Street Do You Live on?
1019 1 St NW
What is Your Zip Code?
T2M 2S2





Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)
Enter Choice: 
B
What is the balance of your Business Account?
498
Balance is under 500 Dollars, 10 Dollars Must Be Charged to the Account
Account Holder: Jane Doe
The Balance of the Business Account is: 488.0
The Account Holder lives in: 
New York City 1019 1 St NW T2M 2S2
*/

























	