package Sujay;

import java.util.Scanner;

public class yourNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int low=1,high=num;
		int mid, a;
		while(true)
		{
			mid=(high+low)/2;
			System.out.println("if your number is between "+low+" and "+mid+" enter 1 else enter 0");
			a=scan.nextInt();
			if(a==1){
				low=low;
				high=mid;
			}
			else
			{
				low=mid+1;
				high=high;
			}
			if(low==high)
			{
				System.out.println("your num is "+low);
				System.exit(0);
			}
		}
		
	}

}
