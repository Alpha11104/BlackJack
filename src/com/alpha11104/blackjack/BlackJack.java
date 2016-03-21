package com.alpha11104.blackjack;

import java.util.Scanner;

public class BlackJack {
	
	public static Deck generateDeck() {
		Deck deck = new Deck();
	
		Suit[] suit = Suit.values();
		CardType[] cardType = CardType.values();
		
		for (Suit s: suit) {
			for (CardType c: cardType) {
				deck.addCard(new Card(c, s));
			}
		}
		return deck;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		Deck deck = generateDeck();
		deck.shuffle();
		
		Dealer dealer = new Dealer(deck);
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		Player[] players = {player1, player2};
		
		dealer.deal(players);
		
		System.out.println(dealer);
	
		for (Player p: players) {
			System.out.println(p);
			while(true) {
				System.out.println("Enter hit or stand: ");
				String choice = input.next();
				
				if (choice.equals("stand")) break;
			
				dealer.hit(p);
				
				System.out.println(p);
			}
		}
	}
}
