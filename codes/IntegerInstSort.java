import java.util.*;
class Alpha
{
public void insertion_sort(int a[],int n)
{
int i,j,item;
for(i=1; i<=n-1; i++)
{
j=i-1;
item=a[i];

while(j>=0 && a[j]>item)
{
//j++;
a[j+1]=a[j];
j--;
}
a[j+1]=item;
}
}
}


class IntegerInstSort
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
x.insertion_sort(a,n);

System.out.println("");

System.out.println("sorted elements are");
for(int i=0; i<n; i++)
{
System.out.print(a[i]+" ");
}
}
}