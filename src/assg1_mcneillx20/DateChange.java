// Xavier McNeill
package assg1_mcneillx20;

import java.util.Scanner;

public class DateChange {

	public static void main(String[] args) {
		// Declare variables and scanner
		String dateUs, dateEu;
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for date in US format
		System.out.println("Enter a date in the form mon/day/year:");
		dateUs = keyboard.next();

		// Convert date to EU format
		dateEu = dateUs.substring(dateUs.indexOf('/') + 1, dateUs.lastIndexOf('/')) + '.' + dateUs.substring(0, dateUs.indexOf('/')) + '.' + dateUs.substring(dateUs.lastIndexOf('/') + 1);

		System.out.println("Your date in European form is:");
		System.out.println(dateEu);

		keyboard.close();

	}

}
