import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

//File: Blackjack.java
//Author: Vincent Okafor, Ikenna Okoro
//Date: 2020-03-05
//Contains all the methods and classes used to create a simple game of BlackJack

class Card {
	int v = 0;
	public Card (int v) {
		
		ArrayList<Integer> CardValue = new ArrayList<Integer>();
		CardValue.add(1);
		CardValue.add(2);
		CardValue.add(3);
		CardValue.add(4);
		CardValue.add(5);
		CardValue.add(6);
		CardValue.add(7);
		CardValue.add(8);
		CardValue.add(9);
		CardValue.add(10);
		
		if (v > 10 || v < 1){
			Scanner input = new Scanner(System.in);
			System.out.println("Please pick a card value from 1-10");
			v = input.nextInt();
		}
		
	}
	
	public int GetValue() {
		return v;
	}	
}

class Hand {
	ArrayList<Integer> CardSet = new ArrayList<Integer>();
	//ArrayList<Integer> Cards = new ArrayList<Integer>();
	int [] Cards = {1,2,3,4,5,6,7,8,9,10};
	
	
	public void reset(){
		CardSet.clear();
	}
	
	public void add (int v ){
		if (v > 10 || v < 1){
			Scanner input = new Scanner(System.in);
			System.out.println("Please pick a card value from 1-10");
			v = input.nextInt();
		}
		CardSet.add( v );
	}
	
	public int size(){
		int z = CardSet.size();
		return z;
	}
	
	public int getCard(int i){
		
		int value = Cards[i];
		return value;
	}
	
	public int getTotalValue(){
		int sum = 0;
		for(int i = 0; i < CardSet.size(); i++){
			sum += CardSet.get(i);
			//return sum;
		}
		return sum;
	}
	
	public String toString(){
		String sum = "+" ;
		for(int i = 0; i < CardSet.size(); i++){
			sum += "" + CardSet.get(i);
			//return sum;
		}
		return sum;
	}
}

class Deck {
	ArrayList<Integer> NewCardsDeck = new ArrayList<Integer>();
	ArrayList<Integer> CardDeck = new ArrayList<Integer>();
	ArrayList<Integer> CardsDeck = new ArrayList<Integer>();
	
	
	public Deck(){
		ArrayList<Integer> CardDeck = new ArrayList<Integer>();
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		System.out.println("All cards in the deck are automatically shuffled");
		Collections.shuffle(CardDeck);
	
	}
	
	public void build(){
		ArrayList<Integer> CardsDeck = new ArrayList<Integer>();
		CardsDeck.add(1);
		CardsDeck.add(1);
		CardsDeck.add(1);
		CardsDeck.add(1);
		CardsDeck.add(2);
		CardsDeck.add(2);
		CardsDeck.add(2);
		CardsDeck.add(2);
		CardsDeck.add(3);
		CardsDeck.add(3);
		CardsDeck.add(3);
		CardsDeck.add(3);
		CardsDeck.add(4);
		CardsDeck.add(4);
		CardsDeck.add(4);
		CardsDeck.add(4);
		CardsDeck.add(5);
		CardsDeck.add(5);
		CardsDeck.add(5);
		CardsDeck.add(5);
		CardsDeck.add(6);
		CardsDeck.add(6);
		CardsDeck.add(6);
		CardsDeck.add(6);
		CardsDeck.add(7);
		CardsDeck.add(7);
		CardsDeck.add(7);
		CardsDeck.add(7);
		CardsDeck.add(8);
		CardsDeck.add(8);
		CardsDeck.add(8);
		CardsDeck.add(8);
		CardsDeck.add(9);
		CardsDeck.add(9);
		CardsDeck.add(9);
		CardsDeck.add(9);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		CardsDeck.add(10);
		Collections.shuffle(CardsDeck);
	}
	
	public int Deal(){
		int value2 = CardDeck.get(0);
		CardDeck.remove(0);
		return value2;
	}
	
	public String toString(){
		String sum2 = "+" ;
		for(int i = 0; i < CardDeck.size(); i++){
			sum2 += "" + CardDeck.get(i);
			
		}
		return sum2;
	}
}

public class Blackjack {
	
	Deck player = new Deck();
	Hand player1 = new Hand();
	Deck dealer = new Deck();
	Hand dealer1 = new Hand();
	boolean reshuffle = true;
		
	public void reset(boolean reshuffle){
		player.build();
		dealer.build();
		
		
	}
		
	public void deal(){
		player.Deal();
		dealer.Deal();
	
	
	}
		
	//public String toString(){
		//return;
	
	
	
	//}
		
	public boolean playerTurn(){
		Scanner input = new Scanner(System.in);
		System.out.println("Draw a card");
		int CardDrawn = input.nextInt();
		ArrayList<Integer> CardDeck = new ArrayList<Integer>();
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		if (CardDeck.contains(CardDrawn)){
			CardDeck.remove(CardDrawn);
		}
		boolean True = true;
		return True;
		
		
		
	}
	public boolean dealerTurn(){
		Scanner input = new Scanner(System.in);
		System.out.println("Draw a card");
		int CardDrawn = input.nextInt();
		ArrayList<Integer> CardDeck = new ArrayList<Integer>();
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(1);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(2);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(3);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(4);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(5);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(6);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(7);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(8);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(9);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		CardDeck.add(10);
		if (CardDeck.contains(CardDrawn)){
			CardDeck.remove(CardDrawn);
		}
		boolean True = true;
		return True;
		
		
	}
	public static void main (String args[]) {
		Blackjack dealer = new Blackjack();
		Blackjack player = new Blackjack();
		
		player.deal();
		dealer.deal();
		
		player.playerTurn();
		dealer.dealerTurn();
		
	}
}