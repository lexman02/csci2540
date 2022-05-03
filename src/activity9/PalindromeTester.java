package activity9;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeTester {

	public static void main(String[] args) {
		String input;
		Scanner kbd = new Scanner(System.in);

		System.out.println("Enter a string:");
		input = kbd.nextLine();

		System.out.println("\nIs this string a palindrome? (Stack Method):");
		if (isPalindromeUsingStack(input)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		System.out.println("\nIs this string a palindrome? (Recursion Method):");
		if (isPalindromeRecursion(input)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		kbd.close();

	}

	public static boolean isPalindromeUsingStack(String input) {
		Stack<Character> string = new Stack<>();
		boolean palindrome = false;

		if (input.length() == 0) {
			palindrome = true;
		} else {
			for (int i = 0; i < input.length(); i++) {
				string.push(input.charAt(i));
			}

			for (int i = 0; i < input.length(); i++) {
				if (string.pop() != input.charAt(i)) {
					palindrome = false;
					break;
				} else {
					palindrome = true;
				}
			}
		}

		return palindrome;
	}

	public static boolean isPalindromeRecursion(String input) {
		boolean palindrome = false;

		if (input.length() == 0 || input.length() == 1) {
			palindrome = true;
		} else if (input.charAt(0) == input.charAt(input.length() - 1)) {
			palindrome = isPalindromeRecursion(input.substring(1, input.length() - 1));
		}

		return palindrome;
	}

}
