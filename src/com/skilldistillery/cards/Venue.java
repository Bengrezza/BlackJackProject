package com.skilldistillery.cards;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.cards.BlackJackTable;

public class Venue {

	public static void main(String[] args) {
		Venue venue = new Venue();
		venue.run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to The Skill Distillery BlackJack Game.");

		venueMenu(scanner);
	}

	public void venueMenu(Scanner scanner) {
		System.out.println();
		System.out.println("Please Choose From the Options Below.");
		System.out.println("1. Play BackJack.");
		System.out.println("2. Quit.");
		System.out.println("Please Enter Choice Here (1-2):");
		int selection = 0;

		try {
			selection = scanner.nextInt();
		} catch (InputMismatchException e) {
		}

		switch (selection) {
		case 1:
			BlackJackTable blackJackTable = new BlackJackTable();
			blackJackTable.startBlackJack(scanner);
			break;
		case 2:
			System.out.println("Thank You, Game Over, Please Come Again Soon!");
			System.exit(0);
			break;
		default:
			System.err.println("Error: Unexpected Value Entered.");
			run();
		}
	}
}