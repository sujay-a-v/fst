package sujay;

import java.util.Scanner;

public class Permutation {
	
	public static void permut(String s,int p,int q)
	{
		if(p==q)
		{
			System.out.println(s);
		}
		else
		{
			for(int i=p; i<=q; i++)
			{
				s=swap(s,p,i);
				permut(s,p+1,q);
				s=swap(s,p,i);
			}
		}
	}
	
	public static String swap(String s,int i, int j)
	{
		char[] c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		s=String.valueOf(c);
		return s;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int n=str.length();
		permut(str,0,n-1);

	}

}
