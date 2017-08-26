package sujay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class week{
	
	public int daysOfWeek(int m,int y, int d)
	{
		int y1=y-(14-m)/12;
        int x=y1+(y1/4)-(y1/100)+(y1/400);
        int m1=m+12*((14-m)/12)-2;
        int d1=(d+x+(31*m1)/12)%7;
        return d1;
    }
	
	public void days()
	{
		Queue<Character> q=new LinkedList<Character>();
		q.add('S');
		q.add('M');
		q.add('T');
		q.add('W');
		q.add('T');
		q.add('F');
		q.add('S');
		
		while(q.size()>0)
		{
			System.out.print(" "+q.poll()+"  ");
		}
	}
	
	 void display(int arr[][],int c)
     {
         int count=0,b=c-9;
         System.out.println(" ");
         for(int i=0;i<=4;i++)
         {
             for(int j=0;j<=6;j++)
             {
                 if(count<c)
                 {
                     if(count<=b)
                     {
                         System.out.print("    ");
                         b--;
                         count++;
                     }
                     else
                     {
                     System.out.print(" 0"+arr[i][j]+" ");
                     count++;
                     }
                 }
	             else
	             {
	                 if(arr[i][j]==0)
	                 {
	                     System.out.print("    ");
	                 }
		             else
		             {
		                 System.out.print(" "+arr[i][j]+" ");
		             }
	             }
		     }
		     System.out.println(" ");    
		 }
	}
}
	public class Week_Days {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		week wk=new week();
		System.out.println("enter the month");
		int m=scan.nextInt();
		System.out.println("enter the year");
		int y=scan.nextInt();
		int d=1;
		int start=wk.daysOfWeek(m,y,d);
		int count=1,lastdate=0;
		int arr[][]=new int[5][7];
		String mnt[]={"JAN","FEB","MAR","APR","MAY","JUN","JLY","AUG","SEP","OCT","NOV","DEC"};
		System.out.println();
		System.out.println(mnt[m-1]+"    "+y);
		wk.days();
		System.out.println();
		
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
		{
			lastdate=31;
		}
		if(m==4||m==6||m==9||m==11)
		{
			lastdate=30;
		}
		if(m==2)
		{
			if(y%4==0)
			{
				lastdate=29;
			}
			else
			{
				lastdate=28;
			}
		}
		
		int start1=start;
		for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(start>0)
                {
                    arr[i][j]=0;
                    start-=1;
                }
                else
                {
                    if(count<=lastdate)
                    {
                        arr[i][j]=count;
                        count++;
                    }
                    else
                    {
                        arr[i][j]=0;
                    }
                }
            }
        }
        int c=start1+9;
        wk.display(arr,c);    

	}

}
