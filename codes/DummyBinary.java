package Sujay;

import java.util.Scanner;

public class DummyBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int i,j;
		String a;
		//convert the integer into binary
		a=(String.format("%8s",Integer.toBinaryString(num)).replace(" ","0"));
		
		char x[]=new char[8];
		char y[]=new char[8];
		
		x=a.toCharArray();
		j=0;
		//print binary of original number
		for(i=0; i<8; i++)
		{
			System.out.print(x[i]);
		}
		System.out.println();
		
		//swapping the the nibbles
		for(i=4; i<8; i++)
		{
			y[i]=x[j];
			j++;
		}
		for(i=0; i<4; i++)
		{
			y[i]=x[j];
			j++;
		}
		//print the swapped byte
		for(i=0; i<8; i++)
		{
			System.out.print(y[i]);
		}
		System.out.println();
		
		j=7;
		double rev=0.00;
		for(i=0; i<8; i++)
		{
			if(y[i]=='1')
			{
				rev=rev+Math.pow(2,j);
			}
			j--;
		}
		System.out.println("Resultant number is "+rev);
		
		int ans=(int)rev/2;
		
		i=1;
		while(i<ans)
		{
			i=i*2;
		}
		if(i==ans)
		{
			System.out.println("resultant number is power of 2");
		}
		else
		{
			System.out.println("resultant number is not power of 2");
		}

	}

}
