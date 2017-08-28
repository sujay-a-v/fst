package sujay;

import java.util.Scanner;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int player=4,card=9;
		String arr[][]=new String[card][player];
		
		//distribute the cards to players
		for(int i=0; i<card; i++)
		{
			for(int j=0; j<player; j++)
			{
				arr[i][j]=Deck[i+j];
				System.out.print(arr[i][j]+", ");
			}
			System.out.println("");
		}
		
		
		

	}

}
