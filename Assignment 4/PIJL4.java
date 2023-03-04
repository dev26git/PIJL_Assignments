package PIJL_Assignments;

/*
 * I have created 3 classes namely Card, Deck and PIJL4.
 * class Card represents a card of the deck with a suit and rank.
 * class Deck represents a deck of cards which can be manipulated.
 * class PIJL4 is the driver class that has a menu to use the methods defined in Card and Deck.
 */

import java.util.Scanner;
public class PIJL4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deck d = new Deck();
		int choice = -1;
		
		while(choice != 5) {
			System.out.println("\n\nPress 1 to create Deck.");
			System.out.println("Press 2 to deal 5 Cards.");
			System.out.println("Press 3 to print Deck.");
			System.out.println("Press 4 to find Card in deck.");
			System.out.println("Press 5 to stop.");
			System.out.println("Enter your choice:");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				d.createDeck();
				break;
				
			case 2:
				d.dealCards();
				break;
				
			case 3:
				d.printDeck();
				break;
			
			case 4:
				System.out.println("Enter suit(0-4) and rank(0-12) of the Card to search:");
				int suit = sc.nextInt();
				int rank = sc.nextInt();
				int found = d.findCard(new Card(suit, rank));
				if(found == 1)
					System.out.println("Card found.");
				else
					System.out.println("Card not found.");
				break;
			}
		}
		sc.close();
	}
}