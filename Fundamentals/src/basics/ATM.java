package basics;

import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		
		Arrays  a= new Arrays();
		//a.check();
		int pin = 1111;
		int Balance = 3000;
		ATM call = new ATM();
		
		//Balance = call.withdraw(pin, Balance);
		//System.out.print(Balance);
	}
	
	int withdraw(int pin, int Balance)
	{
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		if(pin==p)
		{
			System.out.println("Enter the amount:");
			int amount = in.nextInt();
			if(amount > 5000)
			{
				System.out.println("enter valid amount");
				amount = in.nextInt();
			}
			if(amount >= Balance)
			{
				System.out.println("Insufficient balance");
				return balance(Balance);
			}
			else
			{
				System.out.println("Collect your cash");
				return Balance - amount;
			}
			//return Balance - amount;
		}
		else
		{
			System.out.println("Invalid pin");
			return Balance;
		}
		
	}
	
	int balance(int b)
	{
		System.out.print("Your available balance is ");
		return b;
	}
	
}
