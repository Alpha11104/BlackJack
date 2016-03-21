package com.alpha11104.blackjack;

public class Card {

	private CardType type;
	private Suit suit;
	
	public Card(CardType type, Suit suit) {
		this.type = type;
		this.suit = suit;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return "<" + type + ", " + suit + ">";
	}

}
