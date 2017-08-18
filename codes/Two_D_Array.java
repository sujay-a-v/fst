import java.io.PrintWriter;
import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out , true);
		int i,j;
		pw.println("enter the number of ros");
		int rows=sc.nextInt();
		pw.println("enter the number of colunms");
		int cols=sc.nextInt();
		
		String[][] arr=new String[rows][cols];
		
		//enter the elements foe the array
		
		pw.println("enter the valuea for array");
		for(i=0; i<rows; i++)
		{
			for(j=0; j<cols; j++)
			{
				arr[i][j]=sc.next();
			}
		}

		//Display the the array array values
		for(i=0; i<rows; i++)
		{
			for(j=0; j<cols; j++)
			{
				pw.print(arr[i][j]+" ");
			}
			pw.println();
		}
	}

}
