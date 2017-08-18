import java.util.*; 
public class Quadratic {
	public static void main(String[]args) 
	{
		Scanner scan=new Scanner(System.in); 
		//collect the value's from user. 
		System.out.println("enter the value of a"); 
		int a=scan.nextInt(); 
		System.out.println("enter the value of b"); 
		int b=scan.nextInt(); 
		System.out.println("enter the value of c"); 
		int c=scan.nextInt(); 
		System.out.println(a+"x*x +"+b+"x +"+c); 
		int delta=b*b-4*a*c; 
		//apply the formula. 
		//calculate the root and display the answer. 
		double root1=((-b+Math.sqrt(delta))/(2*a)); 
		double root2=((-b-Math.sqrt(delta))/(2*a)); 
		System.out.println("root1= "+root1); 
		System.out.println("root2= "+root2); 
		
	}
}
