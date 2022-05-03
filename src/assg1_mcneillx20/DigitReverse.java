// Xavier McNeill
package assg1_mcneillx20;

import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		// Declare variables and scanner
		int enteredInts;
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for input and call digit extraction method until "-1" is entered
		do {
			System.out.print("Please enter a non-negative integer (-1 to exit): ");
			enteredInts = keyboard.nextInt();
			// Call method only if enteredInts is not "-1"
			if (enteredInts != -1) {
				digitExtract(enteredInts);
			}
		} while (enteredInts != -1);

		keyboard.close();

	}

	public static void digitExtract(int enteredInts) {
		System.out.println("\nYour number printed in reverse order is:");
		// Print "0" if enteredInts is 0, otherwise print enteredInts in reverse order
		if (enteredInts == 0) {
			System.out.println("0");
		} else {
			// Stop when enteredInts is 0
			while (enteredInts > 0) {
				// Extract last digit and print it
				System.out.println(enteredInts % 10);
				// Remove last digit from enteredInts
				enteredInts = enteredInts / 10;
			}
		}
		// Print empty line
		System.out.println();
	}

}
