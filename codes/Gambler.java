import java.util.*;

public class Gambler {

	public static void main(String[] args) {
		// cololect the stake and goal values from user
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the stoke value");//give the stake value
		int stake=scan.nextInt();
		System.out.println("enter the goal valve");
		int goal=scan.nextInt();
		
		Random r=new Random();
		float num;
		int win=0,loss=0;
		
		System.out.println("enter the number for hoe many time repeats the game");
		int n=scan.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int stake1=stake;
			while(stake1!=goal)
			{
				num=r.nextFloat();
				if(num<=0.5)// gambler loss the game when recieve 0.5 or less
				{
					stake1-=1;
				}
				else// gambler win the game when receive greater the 0.5
				{
					stake+=1;
				}
				if(stake1==0)
				{
					break;
				}
			}
			System.out.println("the stake value is "+stake1);
			if(stake1==0)
			{
				loss++;// count loss
			}
			else
			{
				win++;//count win
			}
		}
		
		float percentage_of_win= (float) win*100/n;
		float percentage_of_loss= (float) loss*100/n;
		//print the winnig number and winning percentage
		System.out.println("number of wins is "+win+"\n win percentage is "+percentage_of_win);
		//print the lossing number and lossing percentage
		System.out.println("number of loss is "+loss+"\n loss percentage is "+percentage_of_loss);

	}

}
