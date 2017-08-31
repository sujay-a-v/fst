package sujay;

import java.util.Scanner;


public class Company_Shares {
	
	static Scanner sc=new Scanner(System.in);
	static int n=0;
	Node head;
	class Node
	{
		int share;
		Node link;
		
		public Node(int s)
		{
			share=s;
			link=null;
		}
	}
	
	public int add()
	{
		System.out.println("enter the company share");
		int share=sc.nextInt();
		Node nd=new Node(share);
		
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
			n++;
		}
		
		return n;
	}
	
	public int remove(int pos)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("Remove not possible");
		}
		else if(pos==0)
		{
			System.out.println("Removed share is :"+head.share);
			head=temp.link;
		}
		else
		{
			for(int i=0; i<pos-1; i++)
			{
				temp=temp.link;
			}
			
			System.out.println("Removed share is :"+temp.link.share);
			Node next=temp.link.link;
			temp.link=next;
			n--;
		}
		return n;
	}
	
	public void disp()
	{
		if(head==null)
		{
			System.out.println("Display not possible not possible");
		}
		else if(head.link==null)
		{
			System.out.println(head.share);
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.share+" ");
				temp=temp.link;
			}
			temp=null;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		int n1;
		
		Company_Shares cs=new Company_Shares();
		int pos=0;
		while(true)
		{
			System.out.println("1 for add");
			System.out.println("2 for remove");
			System.out.println("3 for display");
			System.out.println("0 for exit");
			
			System.out.println("enter your choice");
			n1=sc.nextInt();
			
			switch(n1)
			{
			case 1: pos=cs.add();
			break;
			case 2: pos=cs.remove(pos);
			break;
			case 3: cs.disp();
			break;
			case 0: System.exit(0);;
			default : System.out.println("enter the currect input");
			}
			
		}

	}

}
