package sujay;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventory {
	
	public void writeData()
	{
		Scanner sc=new Scanner(System.in);
		String[] name={"Rice","Wheat","Pulses"};
		JSONObject obj=new JSONObject();
		for(int i=0; i<name.length; i++)
		{
			System.out.println("enter the types of "+name[i]);
			int count=sc.nextInt();
			JSONArray jarray=new JSONArray();
			for(int j=0; j<count; j++)
			{
				JSONObject jobj=new JSONObject();
				System.out.println("enter the name ");
				jobj.put("name", sc.next());
				System.out.println("enter the weight");
				jobj.put("weight", sc.nextInt());
				System.out.println("enter the price");
				jobj.put("price", sc.nextInt());
				jarray.add(jobj);
			}
			obj.put(name[i], jarray);
		}
		String path="//home//bridgeit//Documents//Sujay//ioprm//json.txt";
		
		PrintWriter pw=null;
		try
		{
			pw=new PrintWriter(path);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		pw.write(obj.toJSONString());
		pw.close();
	}
	
	

	public void readData()
	{
		String path="//home//bridgeit//Documents//Sujay//ioprm//json.txt";

		JSONArray arr=new JSONArray();
		JSONParser jpar=new JSONParser();
		JSONObject obj1;
		try
		{
			obj1=(JSONObject) jpar.parse(new FileReader(path));
			arr=(JSONArray) obj1.get("Rice");
			System.out.println("Rice inventory value is :" + getValue(arr));
			arr=(JSONArray) obj1.get("Wheat");
			System.out.println("Wheat inventory value is :" + getValue(arr));
			arr=(JSONArray) obj1.get("Pulses");
			System.out.println("Pulses inventory value is :" + getValue(arr));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public long getValue(JSONArray a)
	{
		long value=0;
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			JSONObject ob=(JSONObject)itr.next();
			long weight=(long)ob.get("weight");
			long price=(long)ob.get("price");
			value=value+(price*weight);
		}
		
		return value;
	}
	



	public static void main(String[] args)
	{
		Inventory inv=new Inventory();
		inv.writeData();
		inv.readData();
	}

}
