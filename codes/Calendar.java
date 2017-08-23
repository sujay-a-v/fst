package sujay;

import java.util.Scanner;

public class Calendar {
	
	public static int Month(int m,int y,int d)
	{
		int y1=y-(14-m)/12;
		//System.out.println("year "+y1);
		int x=y1+(y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d0=(d+x+(31*m1)/12)%7;
		//System.out.println(m1);
		//System.out.println(d0);
		return d0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int date=1;
		int count,end=0;
		int start=Month(month,year,date);
		
		int lastDate=0;
		if(month==1||month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			lastDate=31;
		}
		if(month==4 || month==6 || month==9 || month==11)
		{
			lastDate=30;
		}
		if(month==2)
		{
			if(year%4==0)
			{
				lastDate=29;
			}
			else
			{
				lastDate=28;
			}
		}
		
		//Display month and year
		String mon[]={"JAN","FEB","MAR","APR","MAY","JUN","JLY","AUG","SEP","OCT","NOV","DEC"};
		System.out.println("\n          "+mon[month-1]+" "+year+"\n");
		//Display days
		String[] day={"S","M","T","w","TH","F","S"};
		for(int i=0; i<7; i++)
		{
			System.out.print(" "+day[i]+" ");
		}
		
		System.out.println();
		int t=0;
		for(int i=0; i<5; i++)
		{
			if(t==0)
			{
			for(int j=0; j<start; j++)
			{
				System.out.print("   ");
				end++;
			}
			t=1;
			}
			for(int k=end; k<7; k++)
			{
				if(date<10){
					System.out.print("  "+date);
				}
				else
				{
					System.out.print(" "+date);
				}
				if(date==lastDate)
				{
					System.exit(0);
				}
				date++;
				/*end++;
				if(end==7)
				{
					break;
				}*/
			}
			end=0;
			System.out.println();
		}

	}

}
