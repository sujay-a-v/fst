package Sujay;

import java.util.*;
class Binary5
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the integer ");
		int n=scan.nextInt();
		String arr;
		int i,j=0;
		double rev=0;
		arr=(String.format("%8s",Integer.toBinaryString(n)).replace(" ", "0"));
		char q[]=new char[8];
		char x[]=new char[8];
		q=arr.toCharArray();
		/*for(i=0;i<8;i++)
		{
			System.out.print(q[i]);
		}
		*/
		while(j<8)
		{
			for(i=4;i<8;i++)
			{
				x[j]=q[i];
				j++;
			}
			for(i=0;i<4;i++)
			{
				x[j]=q[i];
				j++;
			}
		}
		System.out.println("");
		j=8;
		/*for(i=0;i<8;i++)
		{
			System.out.print(x[i]);
		}*/
			for(i=0;i<8;i++)
			{
				if(x[i]=='1')
				{
					rev=rev+Math.pow(2,j);
				}
				j--;
			}
			System.out.println("rev="+rev);
		int ans=(int) rev/2;
		System.out.println(" "+ans);
		i=2;
		while(i<ans)
		{
			i=i*2;
		}
		if(i==ans)
		{
			System.out.println("yes it is a power of 2 ");
		}
		else
		{
			System.out.println("no it is not a power of 2 ");
		}
		System.out.println(" ");
	}
}