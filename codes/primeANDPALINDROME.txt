import java.util.*;
class PrimePalindrome
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the limit");
int limit=scan.nextInt();
for(int i=1; i<limit; i++)
{
boolean flag=true;
for (int j=2; j<i; j++)
{
if(i%j==0)
{
flag=false;
break;
}
}
if(flag==true)
{
//System.out.print(i+" ");

int rem,n=i;
int sum=0;

while(n>0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;

}

if(sum==i)
{
System.out.print(i+" ");
}



}
}


}
}