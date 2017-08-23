package sujay;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int n=s.length();
		s=s.toLowerCase();
		
		Deque dq=new LinkedList<String>();
		for(int i=0; i<n; i++)
		{
			char c=s.charAt(i);
			dq.addFirst(c);
		}
		
		int size=dq.size();
		int i=0,j=size-1;;
		while(size>0)
		{
			
			Object fst=dq.getFirst();
			Object lst=dq.getLast();
			
			if(fst==lst)
			{
				//dq.pollFirst();
				//dq.pollLast();
				dq.remove(i);
				dq.remove(j);
			}
			else
			{
				System.out.println("false");
				System.exit(0);
			}
			i++;
			j--;
			size--;
		}
		System.out.println("true");

	}

}
