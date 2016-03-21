package com.alpha11104.blackjack;

import java.util.Collections;
import java.util.Stack;

public class Deck {
	
	private Stack<Card> stack;
	
	public Deck() {
		stack = new Stack<Card>();
	}
	
	public void addCard(Card card) {
		stack.push(card);
	}
	
	public void shuffle() {
		Collections.shuffle(stack);
	}
	
	public Card draw() {
		// TODO: deal with the empty stack
		return stack.pop();
	}
	
	public String toString() {
		return stack.toString();
	}
	
	public int size() {
		return stack.size();
	}

}
