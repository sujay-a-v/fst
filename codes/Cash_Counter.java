package sujay;

import java.util.*;
import java.util.Scanner;

class StateBank
{
	public String name;
	static private  int AccNum;
	static private int Balance;
	static public int BankBalance=10000;
	
	static Scanner scan=new Scanner(System.in);
	
	StateBank(String name, int AccNum, int Balance )
	{
		this.name=name;
		this.AccNum=AccNum;
		this.Balance=Balance;
	}
	
	void bankActivity()
	{
		int amount,ch=1;
		
		while(ch!=4)
		{
			System.out.println("1. Deposit");
			System.out.println("2. Cash withDraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			System.out.println("enter your choice");
			ch=scan.nextInt();
			
			switch(ch)
			{
				case 1: deposit();
				break;
				case 2: withdraw();
				break;
				case 3: balance();
				break;
				case 4: System.out.println("thank you for banking");;
				break;
				default: System.out.println("Invalid input, Enter the correct input");
			
			}
		}
		
	}
	
	
	
	public static void deposit()
	{
		System.out.println("enter the deposit amount");
		int amount=scan.nextInt();
		Balance+=amount;
		BankBalance+=amount;
		System.out.println("Amount "+amount+" added to the AccNum "+AccNum+" balance is "+Balance);
	}
	
	public static void withdraw()
	{
		System.out.println("enter the amount to draw");
		int draw=scan.nextInt();
		if(Balance>draw)
		{
			Balance-=draw;
			BankBalance-=draw;
			if(BankBalance<=0)
			{
				System.out.println("insuficient balance in Bank");
				System.exit(0);
			}
			
			System.out.println("Amount "+draw+" is draw from acnum "+AccNum+" amount left "+Balance);
		}
		else
		{
			System.out.println("in-sufficient balance in your account");
		}
	}
	
	public static void balance()
	{
		System.out.println("your balance is "+Balance);
	}
	
	
}
	public class Cash_Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome to State Bank");
		
		Queue<String> q=new LinkedList<String>();
		System.out.println("enter the number of people");
		int people=scan.nextInt();
		int accnum,bal;
		String name;
		for(int i=0; i<people; i++)
		{
			System.out.println("enter the name");
			name=scan.next();
			q.add(name);
			System.out.println("enter the Account num");
			accnum=scan.nextInt();
			q.add(Integer.toString(accnum));
			System.out.println("enter the Balance");
			bal=scan.nextInt();
			q.add(Integer.toString(bal));
		}
		
		while(q.size()>0)
		{
			System.out.println(q.peek()+ " Your turn\n" );
			
			StateBank sb=new StateBank(q.poll(),Integer.parseInt(q.poll()),Integer.parseInt(q.poll()));
			sb.bankActivity();
		}
		
	}

}
