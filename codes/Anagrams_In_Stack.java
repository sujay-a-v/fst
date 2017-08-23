package sujay;

import java.util.Scanner;

import sujay.Find_In_LL.Node;

public class Anagrams_In_Stack {
	
  Node head;
	
	class Node
	{
		int data;
		Node link;
		public Node(int d)
		{
			data=d;
			link=null;
		}
	}
	
	public  void insert(int t1)
	{
			Node nd=new Node(t1);
			nd.link=head;
			head=nd;
	}
	
	public void disp()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\n");
			temp=temp.link;
		}
		
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		
		Anagrams_In_Stack ais=new Anagrams_In_Stack();
		
		int n1=0;
		
		for(int i=1; i<limit; i++)
		{
			boolean b=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}
			if(b==true)
			{
				n1++;
			}
		}
	
		int arr1[]=new int[n1];
		int arr2[]=new int[n1];
		int n=0;
		for(int i=1; i<limit; i++)
		{
			boolean b=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}
			if(b==true)
			{
				System.out.print(i+" ");
				arr1[n]=i;
				
			
				int m=i;
				int sum=0,rem;
				while(m>0)
				{
					rem=m%10;
					sum=(sum*10)+rem;
					m=m/10;
				}
				arr2[n]=sum;
				
				
				n++;
			}
		}
		
		//original numbers 
		/*System.out.println("\n");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		//reverse numbers
		System.out.println("\n");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}*/
		
		System.out.println("\n\n Anagrams are ");
		int anagNum=0;
		
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					//System.out.print(arr1[i]+" ");
					//anagNum++;
					int num=arr1[i];
					ais.insert(num);
					
				}
				
			}
		}
		System.out.println();
		ais.disp();
	}
	

}
