import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
		double start,end,time;
		Scanner scan=new Scanner(System.in);
		start=System.currentTimeMillis();
		scan.nextLine();
		end=System.currentTimeMillis();
		time=end-start;
		System.out.println(" "+time+" millisec ");

	}

}

