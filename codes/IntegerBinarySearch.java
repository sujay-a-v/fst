import java.util.*;
class Alpha
{
public int binary_search(int n,int a[],int key,int low,int high)
{

int mid;

while(low<=high)
{
mid=(high+low)/2;

if(a[mid]==key)
{
return mid;
}
else if(key<a[mid])
{
low=low;
high=mid-1;
}
else if(key>a[mid])
{
low=mid+1;
high=high;
}

}

return -1;
}
}


class IntegerBinarySearch
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

System.out.println("enter the key");
int key=scan.nextInt();

int low=0;
int high=n-1;

Alpha x=new Alpha();
int ans=x.binary_search(n,a,key,low,high);

if(ans==-1)
{
System.out.println("key not found");
}
else
{
System.out.println("key found at "+ans);
}

}
}
