import java.util.*;
class PowerOf2
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int N=scan.nextInt();

System.out.println("table is ");

double n;

for(int i=0; i<=N; i++)
{
n=Math.pow(2,i);
int n1=(int)n;
System.out.print(n1+" ");
}

}
}
