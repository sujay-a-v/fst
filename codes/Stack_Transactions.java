package sujay;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Transactions {
	
	Node head;
	//Node purs,sold;
	Stack purs=new Stack();
	Stack sold=new Stack();
	
	class Node{
		String stock;
		Node link;
		public Node(String s)
		{
			stock=s;
			link=null;
		}
	}
	
	public void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		
		Node nd=new Node(name);
		nd.link=head;
		head=nd;
		//purs=head;
		purs.push(head.stock);
	}
	
	public void pop()
	{
		if(head==null)
		{
			System.out.println("pop nat possible");
		}
		else
		{
			Node temp=head;
			System.out.println("deleted element is :"+head.stock);
			/*if(sold==null)
			{
				sold=head;
				sold.link=null;
			}else{
				sold.link=sold;
				sold.stock=head.stock;
			}*/
			//sold.stock=head.stock;
			sold.push(head.stock);
			head=temp.link;
		}
	}
	
	public void disp()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.stock);
			temp=temp.link;
		}
		System.out.println();
	}
	
	public void trans()
	{
		System.out.println("Transaction till now is");
		System.out.println("Purchasing stocks are");
		/*Node temp=purs;
		while(temp!=null)
		{
			System.out.println(temp.stock);
			temp=temp.link;
		}*/
		System.out.println(purs);
		System.out.println("\nSold Stocks are");
		System.out.println(sold);
		/*Node temp1=sold;
		while(temp1!=null)
		{
			System.out.println(temp1.stock);
			temp1=temp1.link;
		}*/
	}
	

	public static void main(String[] args) {
		
		Stack_Transactions st=new Stack_Transactions();
		
		Scanner sc=new Scanner(System.in);
		int n;
		while(true)
		{
			System.out.println("1 for purchase the stock");
			System.out.println("2 for sale the stock");
			System.out.println("3 for display");
			System.out.println("4 for Transaction");
			System.out.println("0 for exit");
			
			n=sc.nextInt();
			switch(n)
			{
			case 1: st.push();
			break;
			case 2: st.pop();
			break;
			case 3: st.disp();
			break; 
			case 4: st.trans();
			break;
			case 0: System.exit(0);
			break;
			default :System.out.println("enter the valid input");
			}
		}

	}

}
