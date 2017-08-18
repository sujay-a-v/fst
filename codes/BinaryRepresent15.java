package sujay;

import java.util.Scanner;

public class BinaryRepresent15 {
	
	public static void toBinary(int n)
	{
		/*int rem,bin=0,i=1;
		int n1=n;
		int k=0;
		while(n1>0)
		{
			rem=n1%2;
			//bin=(rem*i)+bin;
			//i=i*10;
			n=n/2;
			if(rem==1)
			{
				/*k=(int)Math.pow(2, j);
				if(n==0)
				{
					System.out.print(k);
					break;
				}
				
				System.out.print(k+" + ");
		k++;
			}
			
		}*/
		System.out.print(n+"=");
		String a;
        a=(String.format("%16s",Integer.toBinaryString(n)).replace(" ","0"));
		
		char x[]=new char[16];
		
		x=a.toCharArray();
		int j=15;
		int m;
		int k=0;
		for(int i=0; i<16; i++)
		{
			if(x[i]=='1')
			{
				m=(int)Math.pow(2, j);
				if(k==0)
				{
					System.out.print(m);
					k=1;
				}
				else
				{
					System.out.print("+"+m);
				}
			}
			
			j--;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the decimal number ");
		int num=scan.nextInt();
		toBinary(num);
	}

}
