package sujay;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values for x and y");
		int x=scan.nextInt();
		int y=scan.nextInt();
		double ans;
		x=x*x;
		
		y=y*y;
		
		x=x+y;
		
		ans=Math.sqrt(x);
		System.out.println(ans);

	}

}
