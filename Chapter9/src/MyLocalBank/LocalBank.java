

/*
Program: LocalBank.java          Last Date of this Revision: April 28, 2022



Purpose: An application that prompts user for if they want to add or remove an account, make a deposit or withdrawal, 
or check balance, or modify account
Author: Ali Akbari 
School: CHHS
Course: Computer Science 30
 
*/







package MyLocalBank;

/*
 * LocalBank.java from Chapter 9
 * Chapter 9 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 /**
  * A bank where accounts can be opened or closed and customers can
  * make transactions.
  */

 import java.util.Scanner;

 public class LocalBank {

	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account");
			System.out.println("Modify an Account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				}
								
				//If User wants to Modify the account they Type M
				else if (action.equalsIgnoreCase("M")) {
					easySave.modifyAccount(acctID);
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}
 
 
 /* SCREEN DUMP

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: A
First name: Ali
Last name: Akbari
Enter Your Street: 232
Enter Your City: Calgary
Enter Your Province: Alberta
Enter Your Postal Code: T3K0M9
Beginning balance: 150
Account created. Account ID is: AAkbari

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: D
Enter account ID: AAkbari
Enter deposit amount: 150
AAkbari
Ali Akbari 232 Calgary Alberta T3K0M9 
Current balance is $300.00

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: W
Enter account ID: AAkbari
Enter withdrawal amount: 150
AAkbari
Ali Akbari 232 Calgary Alberta T3K0M9 
Current balance is $150.00

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: C
Enter account ID: AAkbari
AAkbari
Ali Akbari 232 Calgary Alberta T3K0M9 
Current balance is $150.00

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: M
Enter account ID: AAkbari
Enter Your Street: 123
Enter Your City: California
Enter Your Province: Yukon
Enter Your Postal Code: T1Y5W7
AAkbari
Ali Akbari 123 California Yukon T1Y5W7 
Current balance is $150.00

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: R
Enter account ID: AAkbari
Account removed.

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: D
Enter account ID: AAkbari
Enter deposit amount: 150
Account does not exist.

Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify an Account
Quit

Enter choice: Q






  */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 