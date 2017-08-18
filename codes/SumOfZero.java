import java.util.Scanner;

public class SumOfZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter the elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum1=0;
		int sum,count=0;
		
		for (int i=0; i<=n-3; i++)
		{
			for(int j=i+1; j<=n-2; j++)
			{
				for(int k=j+1; k<=n-1; k++)
				{
					sum=0;
					sum=arr[i]+arr[j]+arr[k];
					if(sum==sum1)
					{
						count++;
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
					
				}
			}
		}
		System.out.println(count);

	}

}
