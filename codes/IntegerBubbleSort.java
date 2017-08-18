import java.util.*;
class Alpha
{
public void bubble_sort(int a[],int n)
{
int i,j,temp;
for(i=0; i<=n-2; i++)
{
for(j=0; j<=n-2-i; j++)
{
if(a[j+1]<a[j])
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}
}
}


class IntegerBubbleSort
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=scan.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0; i<n; i++)
{
a[i]=scan.nextInt();
}

Alpha x=new Alpha();
x.bubble_sort(a,n);

System.out.println("");

System.out.println("sorted elements are");
for(int i=0; i<n; i++)
{
System.out.print(a[i]+" ");
}
}
}
