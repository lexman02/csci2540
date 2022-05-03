package activity2;

import java.util.Scanner;

public class CardConverter {

	public static void main(String[] args) {
		String cardCode, value, suit;

		System.out.print("Enter the card in shorthand notation: ");

		Scanner keyboard = new Scanner(System.in);
		cardCode = keyboard.nextLine();

		if (cardCode.length() == 3) {
			value = cardCode.substring(0, 2);
			suit = cardCode.substring(2);
		} else {
			value = cardCode.substring(0, 1);
			suit = cardCode.substring(1);
		}

		switch (value) {
			case "A":
				value = "Ace";
				break;
			case "J":
				value = "Jack";
				break;
			case "Q":
				value = "Queen";
				break;
			case "K":
				value = "King";
				break;
		}

		switch (suit) {
			case "D":
				suit = "Diamonds";
				break;
			case "H":
				suit = "Hearts";
				break;
			case "S":
				suit = "Spades";
				break;
			case "C":
				suit = "Clubs";
				break;
		}

		System.out.println(value + " of " + suit);

		keyboard.close();

	}

}
