package sujay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Address_Book {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser parser=new JSONParser();
		Scanner scan=new Scanner(System.in);
		int k,num,x=0;
		String path="//home//bridgeit//Documents//Sujay//ioprm//addBook.json";
		//Object obj=parser.parse(new FileReader(path));
		
		JSONArray arr=new JSONArray();
		while(true)
		{
			System.out.println("press 1 to add the details else press 0");
			num=scan.nextInt();
			if(num==0)
			{
				break;
			}
			JSONObject jobj=new JSONObject();
			System.out.println("enter the firstName");
			String firstName=scan.next();
			jobj.put("firstName", firstName);
			System.out.println("enter the lastName");
			String lastName=scan.next();
			jobj.put("lastName", lastName);
			System.out.println("enter the city");
			String city=scan.next();
			jobj.put("city", city);
			System.out.println("enter the state");
			String state=scan.next();
			jobj.put("state", state);
			System.out.println("enter the pin code");
			int pin=scan.nextInt();
			jobj.put("pin", pin);
			System.out.println("enter the moblile num");
			int mob=scan.nextInt();
			jobj.put("mobile", mob);
			//System.out.println("enter the state");
			// state=scan.next();
			jobj.remove("state");
			//jobj.put("state", state);
			
			arr.add(jobj);
		}
		
		try
		{
			PrintWriter pw=new PrintWriter(path);
			pw.print(arr.toJSONString());
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			JSONObject temp=(JSONObject)itr.next();
			
			System.out.println("Name : "+temp.get("firstName") +" "+temp.get("lastName"));
			System.out.println("city : "+temp.get("city"));
			System.out.println("State : "+temp.get("state"));
			System.out.println("pin code: "+temp.get("pin"));
			System.out.println("Mobile num : "+temp.get("mobile"));
			System.out.println();
		}
		
		while(true)
		{
			System.out.println("press 1 for search");
			System.out.println("press 2 for edit");
			System.out.println("press 0 for exit");
			k=scan.nextInt();
			if(k==0)
			{
				break;
			}
	
			if(k==1)
			{
				System.out.println("enter the name to be search");
				String keyName=scan.next();
				
				Iterator itr1=arr.iterator();
				while(itr1.hasNext())
				{
					JSONObject object=(JSONObject)itr1.next();
				
					if(keyName.equals(object.get("firstName")))
					{
						x=1;
						System.out.println("Name : "+object.get("firstName"));
						System.out.println("city : "+object.get("city"));
						System.out.println("State : "+object.get("state"));
						System.out.println("pin code: "+object.get("pin"));
						System.out.println("Mobile num : "+object.get("mobile"));
					}
				}
			}
			
			else if(k==2)
			{
				System.out.println("enter the name to be edit");
				String keyName=scan.next();
				
				for(int i=0;i<arr.size();i++){
					JSONObject dataObj = (JSONObject) arr.get(i);
					//System.out.println(dataObj.get("Specialization"));
					
					if(dataObj.get("firstName").equals(keyName)){
						System.out.println("HELLO");
						
						x=1;
						//arr.remove(itr2);
						JSONObject json=new JSONObject();
						json.put("name", keyName);
						System.out.println("enter the city");
						String city=scan.next();
						json.put("city", city);
						System.out.println("enter the state");
						String state=scan.next();
						json.put("state", state);
						System.out.println("enter the pin code");
						int pin=scan.nextInt();
						json.put("pin", pin);
						System.out.println("enter the moblile num");
						int mob=scan.nextInt();
						json.put("mobile", mob);
						
						arr.add(json);
					}
				}
				
				/*Iterator itr2=arr.iterator();
				while(itr2.hasNext())
				{
					JSONObject object=(JSONObject)itr2.next();
				
					if(object.get("name").equals(keyName))
					{
						x=1;
						arr.remove(itr2);
						JSONObject json=new JSONObject();
						//System.out.println("enter the name");
						//String name=scan.next();
						json.put("name", keyName);
						System.out.println("enter the city");
						String city=scan.next();
						json.put("city", city);
						System.out.println("enter the state");
						String state=scan.next();
						json.put("state", state);
						System.out.println("enter the pin code");
						int pin=scan.nextInt();
						json.put("pin", pin);
						System.out.println("enter the moblile num");
						int mob=scan.nextInt();
						json.put("mobile", mob);
						
						arr.add(json);
					}*/
					try
					{
						PrintWriter pw=new PrintWriter(path);
						pw.print(arr.toJSONString());
						pw.flush();
						pw.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
					
			}
				if(x==0)
				{
					System.out.println("Name not found ");
				}
				
				if(k>2)
				{
					System.out.println("enter the correct input");
				}	
		}
	

}
