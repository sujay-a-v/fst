import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter the value of T "); 
		 int t=scan.nextInt();
		 System.out.println("enter the value of v ");
		 int v=scan.nextInt(); 
		float q=(float) Math.pow(v,0.16);
		float z=(float)(35.74+0.6215*t+((0.4275*t)-35.75)*q);
		System.out.println(" w = "+z);

	}

}
