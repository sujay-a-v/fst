package sujay;

import java.util.Scanner;

public class MonthlyPayment {
	
	public static void monthlyPayment(int p,int y,float R)
	{
		int n=(y*12);
		float r=R/(12*100);
		System.out.println("r = "+r);
		float q=(float)Math.pow((1+r),-n);
		float ans=(p*r)/(1-q);
		
		/*y=-(12*y);
		float q=(float)Math.pow((r/1200)+1,y);
		float ans=(float) p*(r/1200)/1-q;*/
		
		System.out.println("Payment is "+ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the principal amount");
		int p=scan.nextInt();
		System.out.println("enter the period in yearly ");
		int y=scan.nextInt();
		System.out.println("enter the rate");
		float R=scan.nextFloat();
		
		monthlyPayment(p,y,R);

	}

}
