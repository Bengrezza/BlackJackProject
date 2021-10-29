package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealingTest {
	
	public static void main(String[] args) {
	DealingTest dealing = new DealingTest();
	dealing.deal();
	
}
	public void deal() {
		// ** you will be able to create a different set of code to utilize this code**	
		// get a deck of cards
		Deck deck = new Deck ();
	// shuffle the deck
		deck.shuffle();
	// ask the user "how many card do you want, dude?"		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dude: how many: ");
		
		int howMany = sc.nextInt();
		sc.nextLine();
		
		List<Card> userHand = new ArrayList<>();
		int handTotal = 0;
		
	// deal the requested number of cards to the user, one card at a time
		for(int numCard=0; 
				((numCard < howMany) && (deck != null) && numCard < 52 &&
				(deck.checkDeckSize() > 0) ) ;
				numCard++
				)
		{
			//deal a card
			Card dealtCard = deck.dealCard();
			
			// user stuff the dealt card into their running total
			userHand.add(dealtCard);
			
		
					
		
	// the user adds up the cards, based on their rank	
			handTotal += dealtCard.getValue();
		}	
	// have the user show their hand	
			System.out.println("Player total of hand: " + handTotal);
			for (Card card: userHand ) {
				System.out.println(card);
			}
	}
	
}