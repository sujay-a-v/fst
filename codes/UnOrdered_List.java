package sujay;

import java.awt.List;
import java.io.BufferedReader;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UnOrdered_List {
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String word,temp="";
        String path="//home//bridgeit//Documents//Sujay//ioprm//file.txt";
        
        
        String path2="//home//bridgeit//Documents//Sujay//ioprm//file2.txt";
        
        
        LinkedList arr=new LinkedList();
        
		try
		{
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null)
			{
				System.out.println(temp);
				
				StringTokenizer str=new StringTokenizer(temp," ");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();
					arr.add(token);
				}
			}
		}
		
		
		
		finally
		{
			//System.out.println("problem occurs ");
		}
		
		System.out.println("enter the word tobe search");
		word=scan.nextLine();
		
		int i,j=1,p=-1;
		for(i=0; i<arr.size(); i++)
		{
			if(arr.get(i).equals(word))
			{
				j=0;
			}
			if(j==0)
			{
				p=i;
				break;
			}
		}
		
		if(p==-1)
		{
			System.out.println("\n word not found ");
			arr.add(word);
			System.out.println("new list is ");
			/*for(i=0; i<arr.size(); i++)
			{
				System.out.print(arr.get(i)+" ");
			}*/
			System.out.println(arr);
		}
		else
		{
			System.out.println("\n word found at "+p);
			arr.remove(p);
			System.out.println("new list is ");
			/*for(i=0; i<arr.size(); i++)
			{
				System.out.print(arr.get(i)+" ");
			}*/
			
			System.out.println(arr);
		}
		
		//System.out.println("\n"+arr.size());
		String t="";
		for(i=0; i<arr.size(); i++)
		{
			t=t+arr.get(i)+" ";
		}
		
		BufferedWriter bw=null;
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(path);
			bw=new BufferedWriter(fw);
			bw.write(t);
			bw.flush();
			System.out.println("\n Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			bw.close();
			fw.close();
		}
	}

}
