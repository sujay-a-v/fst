import java.util.*;
class HarmonicNumbers
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int num=scan.nextInt();

System.out.println("Harmonic numbers are ");

for(int i=1; i<=num; i++)
{
System.out.print("1/"+i+" ");
}

}
}
