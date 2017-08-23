package sujay;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parentheses {
	
	public static boolean stack(String a)throws Exception
	{
		Stack sk=new Stack();
		
		for(int i=0; i<a.length(); i++)
		{
			char c=a.charAt(i);
			if(c=='(')
			{
				sk.push(c);
			}
			if(c==')')
			{
				if(sk.size()==0)
				{
					return false;
				}
				sk.pop();
			}
		}
		if(sk.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the expression");
		String exp=scan.nextLine();
		
		Stack s=new Stack();
		boolean b=stack(exp);
		
		if(b)
		{
			System.out.println("Arithmatic Expression is balanced");
		}
		else
		{
			System.out.println("Arithmatic Expression is un-balanced");
		}

	}

}
