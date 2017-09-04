package sujay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Clinic {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		String path2="//home//bridgeit//Documents//Sujay//ioprm//clinic.json";
		
		FileReader fr;
		
		JSONParser parser=new JSONParser();
		JSONObject obj=new JSONObject();
		
		JSONArray docArray=new JSONArray();
		JSONArray patArray=new JSONArray();
		
		/*
		System.out.println("enter the number of Doctors");
		int numDoctor=sc.nextInt();
		for(int i=0; i<numDoctor; i++)
		{
			JSONObject doctors=new JSONObject();
			System.out.println("enter the name of the doctor");
			String name=sc.next();
			doctors.put("Name", name);
			System.out.println("enter the doctor's ID");
			//int id=sc.nextInt();
			doctors.put("id",sc.next());
			System.out.println("enter the doctor Specialization");
			//String Specialization=sc.next();
			doctors.put("Specialization", sc.next());
			System.out.println("enter the doctor's availability");
			//int mob=sc.nextInt();
			doctors.put("availability", sc.next());
			System.out.println("enter the booked patients");
			doctors.put("booked", sc.nextInt());
			
			docArray.add(doctors);		
			
		}*/
		
		//int numDoctor=3
		String path3="//home//bridgeit//Documents//Sujay//ioprm//doctor.txt";

		Scanner scan=new Scanner(new File(path3));
		
		while(scan.hasNextLine())
		{
			JSONObject doctors=new JSONObject();

			doctors.put("Name", scan.nextLine());
			doctors.put("id",scan.nextLine());
			doctors.put("Specialization", scan.nextLine());
			doctors.put("availability", scan.nextLine());
			int booked=Integer.parseInt(scan.nextLine());
			doctors.put("booked",booked );

			docArray.add(doctors);		
		}
		
		/*
		System.out.println("enter the number of patients");
		int numPatient=sc.nextInt();
		for(int i=0; i<numPatient; i++)
		{
			JSONObject patients=new JSONObject();
			System.out.println("enter the patient name");
			patients.put("name", sc.next());
			System.out.println("enter the patient ID");
			patients.put("id", sc.next());
			System.out.println("enter the patient mobile number");
			patients.put("Mob", sc.nextInt());
			System.out.println("enter the patient Age");
			patients.put("Age", sc.nextInt());
			
			patArray.add(patients);
		}*/
		
		String path4="//home//bridgeit//Documents//Sujay//ioprm//patients.txt";

		Scanner scan2=new Scanner(new File(path4));
		
		while(scan2.hasNextLine())
		{
			JSONObject patients=new JSONObject();

			patients.put("Name", scan2.nextLine());
			patients.put("id",scan2.nextLine());
			patients.put("Mob", scan2.nextLine());
			patients.put("Age", scan2.nextLine());
			

			patArray.add(patients);		
		}
		
		
		obj.put("Doctor", docArray);
		//obj.put("Patient",patArray);
		try
		{
			PrintWriter pw=new PrintWriter(path2);
			pw.print(obj.toJSONString());
			pw.flush();
			//pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		obj.put("Patient",patArray);
		try
		{
			PrintWriter pw=new PrintWriter(path2);
			pw.print(obj.toJSONString());
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			int k=0,m;
		while(true)
		{
			System.out.println("\n press 1 to search doctor by name");
			System.out.println(" press 2 to search doctor by ID");
			System.out.println(" press 3 to search doctor by Specialization");
			
			int docSearch=sc.nextInt();
			if(docSearch==1)
			{
				System.out.println("enter the name");
				String keyName=sc.next();
				
				for(int i=0; i<docArray.size(); i++)
				{
					JSONObject dataObj=(JSONObject) docArray.get(i);
					if(dataObj.get("Name").equals(keyName))
					{
						k=1;
						found(dataObj,docArray,obj,patArray);
					}
				}
			}
			
			if(docSearch==2)
			{
				System.out.println("enter the id");
				String keyID=sc.next();
				
				for(int i=0;i<docArray.size();i++){
					JSONObject dataObj = (JSONObject) docArray.get(i);
					//System.out.println(dataObj.get("id"));
					
					if(dataObj.get("id").equals(keyID)){
						k=1;
						found(dataObj,docArray,obj,patArray);
						//break;
					}
				}
				
				/*Iterator itr2=docArray.iterator();
				while(itr2.hasNext())
				{
					JSONObject copy=(JSONObject)itr2.next();
					/*if(copy.get("id").equals(keyID))
					{
						k=1;
						found(copy,docArray,obj,patArray);
						break;
					}
				}*/
			}
			
			if(docSearch==3)
			{
				System.out.println("enter the Specialization");
				String keySpecialization=sc.next();
				
				//System.out.println(docArray.get(0));
				for(int i=0;i<docArray.size();i++){
					JSONObject dataObj = (JSONObject) docArray.get(i);
					//System.out.println(dataObj.get("Specialization"));
					
					if(dataObj.get("Specialization").equals(keySpecialization)){
						k=1;
						found(dataObj,docArray,obj,patArray);
						//break;
					}
				}
				/*Iterator itr3=docArray.iterator();
				while(itr3.hasNext())
				{
					JSONObject copy=(JSONObject)itr3.next();
					if(copy.get("Specialization").equals(keySpecialization))
					{
						k=1;
						found(copy,docArray,obj,patArray);
						break;
					}
				}*/
			}
			
			if(k==0)
			{
				System.out.println("Doctor not available");
			}
			System.out.println("press 1 to continue else press 0");
			m=sc.nextInt();
			if(m==0)
			{
				break;
			}
		}
	}

	/**
	 * @param copy
	 * @param docArray
	 * @param obj
	 * @param patArray
	 * 
	 * 
	 */
	private static void found(JSONObject copy,JSONArray docArray,JSONObject obj,JSONArray patArray) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Doctor is found");
		System.out.println("Name : "+copy.get("Name"));
		System.out.println("ID : "+copy.get("id"));
		System.out.println("Specialization : "+copy.get("Specialization"));
		System.out.println("availability : "+copy.get("availability"));
		System.out.println("booked patients : "+copy.get("booked"));

		System.out.println("press 1 for take the Doctor's appointment");
		int appointment=sc.nextInt();
		if(appointment==1)
		{
			//long value;
			int value=(int) copy.get("booked");
			System.out.println("enter the number of patients");
			int numPatient=sc.nextInt();
			int total=(int)value+numPatient;
			if(total<=5)
			{
				copy.put("booked",total);
				docArray.add(copy);
				obj.put("Doctor", docArray);
				
				for(int i=0; i<numPatient; i++)
				{
					JSONObject patients1=new JSONObject();
					System.out.println("enter the patient name");
					patients1.put("name", sc.next());
					System.out.println("enter the patient ID");
					patients1.put("id", sc.next());
					System.out.println("enter the patient mobile number");
					patients1.put("Mob", sc.nextInt());
					System.out.println("enter the patient Age");
					patients1.put("Age", sc.nextInt());
					
					patArray.add(patients1);
				}
				obj.put("Patient",patArray);
				
				String path2="//home//bridgeit//Documents//Sujay//ioprm//clinic.json";

				try
				{
					PrintWriter pw=new PrintWriter(path2);
					pw.print(obj.toJSONString());
					pw.flush();
					pw.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Doctor allows only 5 patients");
			}
		}
		return;
	}

}
