package com.alpha11104.blackjack;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards;
	
	public Hand() {
		cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public String toString() {
		return cards.toString();
	}

}
