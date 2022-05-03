package activity2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		System.out.print("Enter the size of the triangle: ");

		int size;

		Scanner keyboard = new Scanner(System.in);
		size = keyboard.nextInt();

		printTriangle(size);

		keyboard.close();

	}

	public static void printLine(int size) {
		for (int i = 0; i < size; i++) {
			System.out.print('*');
		}
		System.out.print("\n");
	}

	public static void printTriangle(int size) {
		int tempSize = 0;

		if (tempSize == 0) {
			do {
				printLine(tempSize);
				tempSize++;
			} while (tempSize != size);
		}

		if (tempSize == size) {
			do {
				printLine(tempSize);
				tempSize--;
			} while (tempSize != 0);
//			System.out.println('*');
		}
	}

}
