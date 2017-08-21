package sujay;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Word_Binary_Search {

	public static void main(String[] args) throws Exception {
		
		Scanner scan=new Scanner(System.in);
		
		String path="//home//bridgeit//Documents//Sujay//ioprm//file.txt";
		
		Word_Binary_Search wbs=new Word_Binary_Search();
		
		String temp="";
		try
		{
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null)
			{
				System.out.println(temp);
				
				int ans=wbs.countWord(temp);
				
				System.out.println("enter the word to be search");
				String key=scan.nextLine();
				
				int res=wbs.arrayConv(temp, ans, key);
				
				if(res==-1)
				{
					System.out.println("word not found ");
				}
				else
				{
					System.out.println("word found at "+res);
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.println("problem occurs ");
		}
		
		//System.out.println(temp);

	}
	
	public int countWord(String s)
	{
		int n=0;
		StringTokenizer str=new StringTokenizer(s,",");
		while(str.hasMoreTokens())
		{
			String token=str.nextToken();
			n++;
		}
		return n;
	}
	
	public int arrayConv(String s,int n,String key)
	{
		String arr[]=new String[n];
		int i=0;
		StringTokenizer str=new StringTokenizer(s,",");
		while(str.hasMoreTokens())
		{
			String token=str.nextToken();
			arr[i]=token;
			i++;
		}
		
		/*for(i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}*/
		
		for(i=0; i<n; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					String dummy=arr[i];
					arr[i]=arr[j];
					arr[j]=dummy;
				}
			}
		}
		
		System.out.println("sorting of words are ");
		
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Binary search for word
		int low=0,high=n-1;
		int mid;
		while(low<=high)
		{
			mid=(high+low)/2;
			
			if(key.compareToIgnoreCase(arr[mid])==0)
			{
				return mid;
			}
			else if(key.compareToIgnoreCase(arr[mid])>0)
			{
				low=mid+1;
				high=high;
			}
			else if(key.compareToIgnoreCase(arr[mid])<0)
			{
				low=low;
				high=mid-1;
			}
		}
		return -1;
	}

}
