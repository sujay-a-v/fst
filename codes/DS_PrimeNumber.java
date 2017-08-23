package sujay;

public class DS_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[10][];
		
		int start=1,end=100;
		
		for(int i=0; i<10; i++)
		{
			int size=0;
			for(int j=start; j<end; j++)
			{
				
				boolean flag=true;
				for(int k=2; k<j; k++)
				{
					if(j%k==0)
					{
						flag=false;
						break;
					}
					if(flag==true)
					{
						size++;
					}
				}
				
			}
			a[i]=new int[size];
			
			//prime(start,end,a);
			
			int j=0;
			
			for(int p=start; p<end; p++)
			{
				boolean b=true;
				for(int q=2; q<p; q++)
				{
					if(p%q==0)
					{
						b=false;
						break;
					}
				}
				if(b==true)
				{
					a[i][j]=p;
					
					System.out.print(a[i][j]+" ");
					
					j++;
				}
			}
			System.out.println();
			
			start=end;
			end=end+100;
			
		}

	}
	
}
