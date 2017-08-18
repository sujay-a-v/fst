import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the neme");
		String s=scan.nextLine();
		int n=s.length();
		
		if(n>3)//chech length of the name
		{
			System.out.println("Hello "+s+", how are you?");
		}
		else {
			System.out.println("name is too small....");
		}

	}

}
