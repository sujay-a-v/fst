import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		//ask for the element
		System.out.println("enter the number ");
		int n=scan.nextInt();
		
		//print the number of 2s that divides n
		while(n%2==0)
		{
			System.out.print(2+" ");
			n=n/2;
		}
		
		//now n is odd number, increment i by 2
		//initially from 3 to sqrtof n
		for(int i=3; i<=Math.sqrt(n); i+=2)
		{
			//divid n by i, and print i
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		
		//if n is a prime number and is greater than 2
		if(n>2)
		{
			System.out.print(n);
		}

	}

}
