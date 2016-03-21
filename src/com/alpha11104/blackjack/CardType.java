package com.alpha11104.blackjack;

public enum CardType {
	TWO		("2"),
	THREE	("3"),
	FOUR	("4"),
	FIVE	("5"),
	SIX		("6"),
	SEVEN	("7"),
	EIGHT	("8"),
	NINE	("9"),
	TEN		("10"),
	JACK	("jack"),
	QUEEN	("queen"),
	KING	("king"),
	ACE		("ace");
	
	private String name;
	
	private CardType(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
