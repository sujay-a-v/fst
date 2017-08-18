package sujay;

import java.util.Scanner;

public class DayOfWeek {
	
	public static void days_of_week(int m,int d,int y)
	{
		String[] d1=new String[7];
		
		d1[0]="Sunday";
		d1[1]="Monday";
		d1[2]="Tuesday";
		d1[3]="Wednesday";
		d1[4]="Thursday";
		d1[5]="Friday";
		d1[6]="Satarday";
		
		int y1=y-(14-m)/12;
		System.out.println("year "+y1);
		int x=y1+(y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d0=(d+x+(31*m1)/12)%7;
		
		System.out.println("the Day on "+d+"/"+m+"/"+y+" is "+d1[d0]);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the month ");
		int m=scan.nextInt();
		
		if(m>=13)
		{
			System.out.println(" invalid month ");
		}
		else
		{
			System.out.println("enter the date");
			int d=scan.nextInt();
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 ||m==12 )
			{
				if(d>31)
				{
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if(m==4 || m==6 || m==9 || m==11)
			{
				if(d>30)
				{
					System.out.println("date is invalid");
					System.exit(0);
				}
			}
			if(m==2)
			{
				if(d>29)
				{
					System.out.println("date is invalid");
					System.exit(0);
				}
			}
			
			System.out.println("enter the year ");
			int y=scan.nextInt();
			
			if(y%4!=0)
			{
				if(d>28)
				{
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			
			days_of_week(m,d,y);
			
		}

	}

}
