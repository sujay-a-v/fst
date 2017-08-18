package sujay;

import java.util.Scanner;


public  class Temperature {  
	
	public static double tempConv(int n1,float value)
	{
		double ans1;
		if(n1==0)
		{
			float k=(float)(9/5);
			value=value*k;
			ans1=value+32;
			return ans1;
		}
		else
		{
			float k=(float)(5/9);
			value=value-32;
			ans1=value*(0.5556f);
			//System.out.println("ans1 ="+k);
			return ans1;
		}
		
	}


	public static void main(String[] args) {
		
		int n;
		float value;
		double ans;
		System.out.println("0 to convert celsius to fahrenheit");
		System.out.println("1 to convert fahrenheit to celsius");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		if(n==0)
		{
			System.out.println("enter thye celsius value ");
			value=scan.nextFloat();
			ans=tempConv(n,value);
			System.out.println("the fahrenheit value is "+ans);
		}
		else if(n==1)
		{
			System.out.println("enter the fahrenheit value");
			value=scan.nextFloat();
			ans=tempConv(n,value);
			System.out.println("the celsius value is "+ans);
		}
		else
		{
			System.out.println("enter the valid input ");
		}

	}

}
