package activity5;

import java.util.Scanner;

public class ExceptionTesting {

	public static void main(String[] args) {
		String userInput;
		Scanner kbd = new Scanner(System.in);

		System.out.print("Enter a string: ");


		try {
			userInput = kbd.nextLine();
			kbd.close();
			if (userInput.equals("")) {
				throw new EmptyStringException();
			}
			System.out.println("\nYour string is: " + userInput);
		}
		catch (EmptyStringException e) {
			System.out.println("\n" + e.getMessage());
			System.exit(1);
		}
	}

}
