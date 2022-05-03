/*
 * @author Xavier McNeill and Jackson Bass
 */
package activity6;

import java.util.Scanner;

public class RecursionPractice {
	public static void main(String[] args) {
		String str;
		Scanner kbd = new Scanner(System.in);

		System.out.println("Enter a string: ");
		str = kbd.nextLine();

		System.out.println("The even indexs of the string are: " + evenString(str));

		kbd.close();
	}

	public static String evenString(String line) {
		int length = line.length();
		if (length < 2) {
			return line;
		} else {
			return line.charAt(0) + evenString(line.substring(2, length));
		}
	}
}