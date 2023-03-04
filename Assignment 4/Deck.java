package PIJL_Assignments;

import java.util.ArrayList;

// This class represents a Deck of Cards. It uses ArrayList to achieve this.

public class Deck {
	
	// Stores all cards in the current deck
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public void createDeck() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				deck.add(new Card(i,j));
			}
		}
	}
	
	// Print the current deck
	public void printDeck() {
		for(Card c:deck) {
			c.printCard();
		}
	}
	
	// Deal 5 cards and print and remove them from deck
	public void dealCards() {
		int randomIndex;
		Card c;
		for(int i=0; i<5; i++) {
			randomIndex = (int)(Math.random() * deck.size());
			c = deck.get(randomIndex);
			c.printCard();
			deck.remove(randomIndex);
		}
	}
	
	// Returns 1 if the card is found in deck, else 0.
	public int findCard(Card toFind) {
		if(deck.contains(toFind))
			return 1;
		return 0;
	}
}