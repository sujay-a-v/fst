package sujay;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value ");
		double a=scan.nextDouble();
		
		//double a=Double.parseDouble(args[0]);
		
		if(a<=0)
		{
			System.out.println("try again");
			System.exit(0);
		}
		double ans=square(a);
		System.out.println(ans);
	}
	
	public static double square(double c)
	{
		
		double t=c;
		//System.out.println(t);
		double Epsilon=1E-15;
		while((Math.abs(t-c/t))>(Epsilon*t))
		{
			t=(t+(c/t))/2;
		}
		//System.out.println(t);
		return t;
	}

}
