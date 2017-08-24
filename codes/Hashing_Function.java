package sujay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Hashing_Function {
	
	
	public static void hashTable(int[] ht)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n  Hash Table \n");
		for(int i=0; i<11; i++)
		{
			System.out.print(ht[i]+" ");
		}
		
		System.out.println("\n Enter the search key");
		int key=sc.nextInt();
		
		if(ht[key%11]==key)
		{
			//if key is present in the hash table then delete from the hash table
			ht[key%11]=0;
		}
		else
		{
			//if key is not present in the hash table then add it into the hash table
			ht[key%11]=key;
		}
		
		
		System.out.println("\n  Hash Table \n");
		for(int i=0; i<11; i++)
		{
			System.out.print(ht[i]+" ");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ht[]=new int[11];
		char c;
		/*while(true)
		{
			System.out.println("enter the element");
			int ele=sc.nextInt();
			ht[ele%11]=ele;
			
			System.out.println("to be contine press y else press n");
			c=sc.next().charAt(0);
			if(c=='n' || c=='N')
			{
				break;
			}
		}*/
		
		String path3="//home//bridgeit//Documents//Sujay//ioprm//file3.txt";
		
		LinkedList arr=new LinkedList();
		String temp;
		int values;
		int [] intValue=new int[100];
        
		try
		{
			String s1="";
			FileReader fr=new FileReader(path3);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null)
			{
				String [] st =temp.split(" ");
				for(int i=0;i < st.length;i++){
					intValue[i]=Integer.parseInt(st[i]);
				
				int num=intValue[i];
				ht[num%11]=num;	
				}
			}
			hashTable(ht);
			arr.clear();
		}
		finally
		{
			
		}
		try
		{
			FileWriter fw=new FileWriter(path3);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0; i<ht.length; i++)
			{
				int nm=(ht[i]);
				arr.add(i,nm);
			}
			System.out.println("\n"+arr);
			String s2=String.valueOf(arr);
			bw.write(s2);
			bw.flush();
		}
		finally
		{
			
		}

	}

}
