package sujay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Stock_Report {
	
	
	public static int Stoke(String name,int stock,int price)
	{
		int value;
		value=stock*price;
		System.out.println("the value of the "+name +" is "+value);
	
		return value;
	}

	public static void main(String[] args) throws Exception {
		
		String path3="//home//bridgeit//Documents//Sujay//ioprm//file4.txt";
		
		LinkedList<String> arr=new LinkedList<String>();
		String temp;
		Scanner scan=new Scanner(new File(path3));
		int count=0,value,total=0;
		while(scan.hasNextLine() && count<3)
		{
			arr.add(scan.nextLine());
			count++;
			if(count==3)
			{
				String name=arr.get(0);
				int stock=Integer.parseInt(arr.get(1));
				int price=Integer.parseInt(arr.get(2));
				
				value=Stoke(name,stock,price);
				total+=value;
				count=0;
				arr.clear();
				
			}
		}
		System.out.println("the total value is :"+total);
	}

}

