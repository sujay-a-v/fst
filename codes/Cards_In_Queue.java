package sujay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cards_In_Queue {
	
	public static void distribute(String deck[])
	{
		Queue<String> cards=new LinkedList<String>();
		Queue<String> players=new LinkedList<String>();
		
		int player=4,card=9;
		
		String arr[][]=new String[player][card];
		
		//distribute the cards to players
		for(int i=0; i<player; i++)
		{
			//System.out.println("Player "+(i+1));
			for(int j=0; j<card; j++)
			{
				arr[i][j]=deck[4*j+i];
				//System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		
		players.add("Player 1");
		players.add("Player 2");
		players.add("Player 3");
		players.add("Player 4");

		// Sort the cards
		for(int i=0; i<player; i++)
		{
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("2")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("3")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("4")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("5")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("6")==true)
				{
					cards.add(arr[i][j]);
			
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("7")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("8")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("9")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("10")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("Jack")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("King")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("Queen")==true)
				{
					cards.add(arr[i][j]);
				}
			}
			for(int j=0; j<card; j++)
			{
				if(arr[i][j].contains("Ace")==true)
				{
					cards.add(arr[i][j]);
				}
			}
		}
		
		
		//Display the cards
		
		for(int i=0; i<player; i++)
		{
			System.out.println(players.poll());
			for(int j=0; j<card; j++)
			{
				System.out.println(cards.poll());
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String suits[]={"clubs","Diamonds","Hearts","spades"};
		String ranks[]={"2","3","4","5","6","7","8","9","10",
				"Jack","King","Queen","Ace"};
		String Deck[]=new String[suits.length*ranks.length];
		int n=Deck.length;
		
		for(int i=0; i<ranks.length; i++)
		{
			for(int j=0; j<suits.length; j++)
			{
				Deck[4*i+j]=ranks[i]+" of "+suits[j];
			}
			
		}
		//shuffle the cards
		int r;
		for(int i=0; i<n; i++)
		{
			r=(int)(Math.random()*(n));
			String temp=Deck[i];
			Deck[i]=Deck[r];
			Deck[r]=temp;
		
		}
		
		//display the cards after shuffling 
		/*for(int i=0; i<n; i++)
		{
			System.out.println(Deck[i]);
		}*/
		
		distribute(Deck);
		
		
	}


}
