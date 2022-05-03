/*
 * @author Xavier McNeill
 * A class that implements a substring method using recursion
 */
package assg5_mcneillx20;

import java.util.Scanner;

public class RecursionTest {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Test two-parameter substringRecursive method");
			System.out.println("2. Test three-parameter substringRecursive method");
			System.out.println("3. Exit\n");
			System.out.print("Enter your choice: ");

			choice = kbd.nextInt();

			switch (choice) {
				// Get input string and beginning index for two-parameter substring
				case 1:
					String twoParamInput;
					int twoParamStartPos;

					System.out.println("\nEnter a string:");
					twoParamInput = kbd.next();

					System.out.println("\nEnter a beginning index:");
					twoParamStartPos = kbd.nextInt();

					String twoParam = substringRecursive(twoParamInput, twoParamStartPos);

					System.out.println("\n" + twoParam + "\n");
					break;
				// Get input string and beginning and end indexes for three-parameter substring
				case 2:
					String threeParamInput;
					int threeParamStartPos, threeParamEndPos;

					System.out.println("\nEnter a string:");
					threeParamInput = kbd.next();

					System.out.println("\nEnter a beginning index:");
					threeParamStartPos = kbd.nextInt();

					System.out.println("\nEnter an end index:");
					threeParamEndPos = kbd.nextInt();

					String threeParam = substringRecursive(threeParamInput, threeParamStartPos, threeParamEndPos);
					System.out.println("\n" + threeParam + "\n");
					break;
			}
		} while (choice != 3);

		kbd.close();

	}

	/*
	 * A method that implements a substring method with a start position using
	 * recursion
	 * @param original The input string
	 * @param startPos The beginning index
	 * @return The substring
	 */
	static String substringRecursive(String original, int startPos) {
		if (startPos >= original.length()) {
			return "";
		} else {
			return original.charAt(startPos) + substringRecursive(original, startPos + 1);
		}
	}

	/*
	 * A method that implements a substring method with a start and end position
	 * using recursion
	 * @param original The input string
	 * @param startPos The beginning index
	 * @param endPos The end index
	 * @return The substring
	 */
	static String substringRecursive(String original, int startPos, int endPos) {
		if (startPos >= original.length() || endPos >= original.length() || startPos >= endPos || startPos < 0
				|| endPos < 0) {
			return "";
		} else {
			return original.charAt(startPos) + substringRecursive(original, startPos + 1, endPos);
		}
	}

}
