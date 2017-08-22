import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scan.nextInt();
		boolean flag;
		//compute the year is a leap year or not  
		if((year%4==0 || year%400==0)&& year%100!=0)
		/*{
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		if(flag)*/
		{
			System.out.println(year+"  is a leap year");
		}
		else
		{
			System.out.println(year+" not a leap year");
		}

	}

}
