import java.util.Random;

import java.util.Scanner;


class StatFunc{	
	public static int coupon()
	{
		Random r=new Random();
		int num=r.nextInt(99);
		/*Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();*/
		return num;
	}

}


public class Coupon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		StatFunc a=new StatFunc();
		//a.coupon();
	
		int count=0;
		int pos=0;
		
		while(pos<n)
		{
			int value=a.coupon();
			System.out.print(value+" ");
			count++;
			int j=0;
			
			if(pos==0)
			{
				arr[pos]=value;
				pos++;
			}
			else
			{
				for( int z:arr)
				{
					if(z==value)
					{
						j=1;
						break;
					}
				}
				if(j==0)
				{
					arr[pos]=value;
					pos++;
				}
			}
			
		}
		System.out.println("count="+count);
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


