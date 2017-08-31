package sujay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;


public class Transactions_Date_Time {
	
	static Scanner sc=new Scanner(System.in);

	Stack insertion=new Stack();
	Stack deletion=new Stack();
	
	Node head;
	class Node
	{
		String data;
		Node link;
		public Node(String d)
		{
			data=d;
			link=null;
		}
	}
	
	public void insert()
	{
		System.out.println("enter the element");
		String elmt=sc.next();
		Node nd=new Node(elmt);
		if(head==null)
		{
			nd.link=head;
			head=nd;
		}
		else
		{
			Node temp=head;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=nd;
		}
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy  hh-mm-ss");
	    Date date = new Date();
	    //System.out.println(sdf.format(date));
	    insertion.push(elmt);
	    insertion.push(sdf.format(date));
	}
	
	public void delet()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("delete not possible");
		}
		else if(head.link==null)
		{
			System.out.println("deleted element is "+head.data);
			deletion.push(head.data);
			head=temp.link;
		}
		else
		{
			System.out.println("deletec element is "+temp.data);
			deletion.push(temp.data);
			head=temp.link;
			
		}
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy  hh-mm-ss");
	    Date date = new Date();
	    //System.out.println(sdf.format(date));
	    deletion.push(sdf.format(date));
	}
	
	public void disp()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("display not possible");
		}
		
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
		}
		System.out.println();
	}
	
	public void trans()
	{
		System.out.println("Transaction details ");
		System.out.println("elements added");
		System.out.println(insertion+"\n");
		System.out.println("elements deleted");
		System.out.println(deletion+"\n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transactions_Date_Time tds=new Transactions_Date_Time();
		int c;
		while(true)
		{
			System.out.println("1 for insert");
			System.out.println("2 for delet");
			System.out.println("3 for display");
			System.out.println("4 for Transcation");
			System.out.println("0 for exit");
			System.out.println("enter your choice");
			c=sc.nextInt();
			
			switch(c)
			{
			case 1: tds.insert();
			break;
			case 2: tds.delet();
			break;
			case 3: tds.disp();
			break;
			case 4: tds.trans();
			break;
			case 0: System.exit(0);
			break;
			default : System.out.println("enter the currect input");
			}
			
		}

	}

}