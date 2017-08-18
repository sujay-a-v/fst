import java.util.Random;
import java.util.Scanner;

class CheckArray{
	static int a,b,j,i;
	static int k,l;
	static String arr[][]=new String[3][3];
	
	static
	{
		//Initially the board is marked as "-"
		for(k=0; k<3; k++)
		{
			for(l=0; l<3; l++)
			{
				arr[k][l]="-";
			}
		}
	}
	Random r=new Random();
	
	 int check(int m,int n)
	{
		 j=0;
		 //user enters the "x" into the board 
		 if(arr[m][n]!="0" && arr[m][n]!="x")
		 {
			 arr[m][n]="x";
		 
			 while(j!=1)
			 {
				 //Computer enters the "0" into the board
				 a=r.nextInt(3);
				 b=r.nextInt(3);
				 if(arr[a][b]!="0" && arr[a][b]!="x")
				 {
					 arr[a][b]="0";
					 j=1;
				 }
			 }
			 //display the board
			 for(i=0; i<3; i++)
			 {
				 for(j=0; j<3; j++)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
				 System.out.println();
			 }
			 
			 //check board
			 for(i=0; i<3; i++)
			 {
				 //checks the rows
				 if(arr[i][0]=="x"&&arr[i][1]=="x"&&arr[i][2]=="x" || arr[i][0]=="0"&&arr[i][1]=="0"&&arr[i][2]=="0" )
				 {
					 if(arr[i][i]=="x")
					 {
						 System.out.println("you win");
						 System.exit(0);
					 }
					 else if(arr[i][i]=="0")
					 {
						 System.out.println("computer win");
						 System.exit(0);
					 }
				 }
				 
				 //checks the columns
				 if(arr[0][i]=="x"&&arr[1][i]=="x"&&arr[2][i]=="x" || arr[0][i]=="0"&&arr[1][i]=="0"&&arr[2][i]=="0" )
				 {
					 if(arr[i][i]=="x")
					 {
						 System.out.println("you win");
						 System.exit(0);
					 }
					 else if(arr[i][i]=="0")
					 {
						 System.out.println("computer win");
						 System.exit(0); 
					 }
				 }
			 }
			 if(arr[0][0]=="x"&&arr[1][1]=="x"&&arr[2][2]=="x" || arr[0][2]=="x"&&arr[1][1]=="x"&&arr[2][0]=="x" )
			 {
				 System.out.println("you win");
				 System.exit(0);
			 }
			 else if(arr[0][0]=="x"&&arr[1][1]=="x"&&arr[2][2]=="x" || arr[0][2]=="x"&&arr[1][1]=="x"&&arr[2][0]=="x" )
			 {
				 System.out.println("computer win");
				 System.exit(0);
			 }
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
			 
	}
}


public class TicTacToe55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m,n,count=0,q;
		
		CheckArray ca=new CheckArray();
		
		while(count<10)
		{
			System.out.println("enter your position ");
			m=scan.nextInt();
			n=scan.nextInt();
			q=ca.check(m, n);
			if(q==1)
			{
				count=count+2;
			}
		}

	}

}
