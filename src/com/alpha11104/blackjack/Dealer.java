package com.alpha11104.blackjack;

public class Dealer extends Player {

	private Deck deck;
	
	public Dealer(Deck deck) {
		super("Dealer");
		this.deck = deck;
	}
	
	public void hit(Player p) {
		Card card = deck.draw();
		p.addCard(card);
	}
	
	public void deal(Player[] players) {
		for (int i = 0; i < 2; i++) {
			for (Player p: players) {
				p.addCard(deck.draw());
			}
			this.addCard(deck.draw());
		}
	}
	
	public String toString() {
		return super.toString();
	}

}
