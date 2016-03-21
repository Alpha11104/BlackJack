package com.alpha11104.blackjack;

public enum Suit {
	SPADES("spade"),
	DIAMONDS("diamond"),
	HEARTS("heart"),
	CLUBS("club");
	
	private String name;
	
	private Suit(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
