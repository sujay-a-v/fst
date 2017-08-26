package sujay;

import java.util.Scanner;

public class Binary_Search_Tree {
	
	public static int numTree(int n)
	{
		int trees[]=new int[n+1];
		for(int i=0; i<=n; i++)
		{
			trees[i]=-1;
		}
		int ans=computeBST(n,trees);
		return ans;
	}
	
	public static int computeBST(int n, int[] trees)
	{
		if(n<0)
		{
			return 0;
		}
		else if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			int totalTrees=0;
			for(int i=1; i<=n; i++)
			{
				if(trees[i-1]==-1)
				{
					trees[i-1]=computeBST(i-1,trees);
				}
				if(trees[n-i]==-1)
				{
					trees[n-i]=computeBST(n-i,trees);
				}
				totalTrees+=trees[i-1]*trees[n-i];
			}
			return totalTrees;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Binary_Search_Tree bst=new Binary_Search_Tree();
		
		System.out.println("enter the size");
		int n=sc.nextInt();
		int ans;
		for(int i=1; i<=n; i++)
		{
			System.out.println("total number of BST for "+i+" is "+ numTree(i));
		}

	}

}
