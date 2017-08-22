import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for coin flips");
		int num=sc.nextInt();
		int head=0;
		int tail=0;
		
		Random r=new Random();
		float random;
		
		for(int i=0; i<num; i++)
		{
			random=r.nextFloat();//collect the float random number
			if(random<0.5) // checks if head or tail
			{
				head++;
			}
			else
			{
				tail++;
			}
			
		}
		//calculate the percentage of head and tail
		float headPercentage =(float)head*100/num;
		float tailPercentage =(float)tail*100/num;
		
		System.out.println("head percentage is "+headPercentage);
		System.out.println("tail percentage is "+tailPercentage);
		
	}

}
