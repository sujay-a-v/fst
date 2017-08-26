package sujay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Modified_Hash_Function {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,LinkedList> hm=new HashMap<Integer,LinkedList>();
		
String path3="//home//bridgeit//Documents//Sujay//ioprm//file3.txt";
		
		LinkedList<Integer> arr=new LinkedList<Integer>();
		String temp;
		int values,n=0;
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
				n++;
				//int num=intValue[i];
				//ht[num%11]=num;	
				}
			}
			for(int j=0; j<n; j++)
			{
				System.out.print(intValue[j]+" ");
			}
			
			for(int j=0; j<=10; j++)
			{
				LinkedList<Integer> ls=new LinkedList<Integer>();
				hm.put(j, ls);
			}
			
			for(int j=0; j<n; j++)
			{
				int x=intValue[j]%11;
				arr=hm.get(x);
				arr.add(intValue[j]);
			}
			
			System.out.println("\n"+hm);
			System.out.println("enter the value to be searc");
			int key=sc.nextInt();
			int x=key%11;
			arr=hm.get(x);
            if(arr.contains(key)==true)
            {
            System.out.println("key found and removed");
            int index=arr.indexOf(key);
            arr.remove(index);
            System.out.println(arr);
            }
            else
            {
                System.out.println("key not found");
                arr.add(key);
                System.out.println(hm.get(x));
            }
			
			//hashTable(ht);
			//arr.clear();
		}
		finally
		{
			System.out.println("\n"+hm);
		}

	}
}
