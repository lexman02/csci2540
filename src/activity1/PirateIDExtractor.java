package activity1;

import java.util.Scanner;

public class PirateIDExtractor {

	public static void main(String[] args) {
		System.out.println("Enter your ECU email address:");

		String email, pirateId;

		Scanner keyboard = new Scanner(System.in);
		email = keyboard.next();

		pirateId = email.substring(0, email.indexOf('@'));

		System.out.println("Your Pirate ID is:");
		System.out.println(pirateId);

		keyboard.close();

	}

}
