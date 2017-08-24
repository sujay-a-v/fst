package sujay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ordered_list {
	
	public static LinkedList sort(LinkedList a)
	{
		
		Scanner scan=new Scanner(System.in);
		//System.out.println(a);
		String ary[]=new String[a.size()];
		for(int i=0; i<ary.length; i++)
		{
			ary[i]=(String) a.get(i);
			//System.out.print(ary[i]+" ");
		}
		
		// sort the elements in order wise
		for(int i=0; i<ary.length; i++)
		{
			for(int j=0; j<ary.length; j++)
			{
				if(ary[j].compareToIgnoreCase(ary[i])>0)
				{
					String t1=ary[j];
					ary[j]=ary[i];
					ary[i]=t1;
				}
			}
		}
		a.clear();
		//prints ordered elements
		for(int i=0; i<ary.length; i++)
		{
			System.out.print(ary[i]+" ");
			a.add(ary[i]);
		}
		
		System.out.println("\n"+a);
		
		System.out.println("enter the element to be search ");
		String key=scan.next();
		
		for(int i=0; i<ary.length; i++)
		{
			if(key.compareToIgnoreCase(ary[i])==0)
			{
				System.out.println("number is found");
				a.remove(i);
				break;
			}
			if(key.compareToIgnoreCase(ary[i])>0)
			{
				continue;
			}
			else
			{
				a.add(i, key);
				break;
			}
		}
		
		//System.out.println("\n"+a);
		
		return a;
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path="//home//bridgeit//Documents//Sujay//ioprm//file2.txt";
		
		LinkedList arr=new LinkedList();
		String temp;
        
		try
		{
			String s1="";
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null)
			{
				System.out.println(temp);
				
				StringTokenizer str=new StringTokenizer(temp," ");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();
					//System.out.print(token+" ");
					arr.add(token);
				}
				arr=sort(arr);
				s1=String.valueOf(arr);
				/*for(int i=0; i<arr.size(); i++)
				{
					s1=String.valueOf(arr.get(i))+" ";
				}*/
			}
			
			FileWriter fw=new FileWriter(path);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write(s1);
			bw.flush();
		}
		finally
		{
			
		}
		
		System.out.println(arr);

	}

}
