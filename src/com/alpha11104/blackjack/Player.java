package com.alpha11104.blackjack;

public class Player {
	
	private String name;
	private Hand hand;
	
	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCard(Card card) {
		hand.addCard(card);
	}
	
	public String toString() {
		return "<" + name + ", " + hand + ">";
	}
}
