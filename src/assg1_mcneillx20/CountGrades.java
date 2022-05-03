// Xavier McNeill
package assg1_mcneillx20;

import java.util.Scanner;

public class CountGrades {

	public static void main(String[] args) {
		// Declare variables and scanner
		int numOfGrades, sum = 0, count = 0;
		double avg;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the number of grades: ");
		numOfGrades = keyboard.nextInt();

		// Stop and print error if the number of grades is lower than 1
		if (numOfGrades < 1) {
			System.err.println("The number of grades must be more than 0... You entered " + numOfGrades);
			System.exit(1);
		}

		// Initialize array of grades
		int[] grades = new int[numOfGrades];

		// Prompt user for grades and store them in the array
		for (int i = 0; i < numOfGrades; i++) {
			System.out.print("Enter a grade: ");
			grades[i] = keyboard.nextInt();
		}

		// Add grades to sum
		for (int i = 0; i < numOfGrades; i++) {
			sum += grades[i];
		}

		// Calculate average
		avg = ((double) sum / numOfGrades);

		System.out.println("The average grade is: " + avg);
		System.out.println("The grades above the average grade are:");

		// Print grades above average
		for (int i = 0; i < numOfGrades; i++) {
			if (grades[i] > avg) {
				System.out.println(grades[i]);
				count++;
			}
		}

		System.out.println("for a total of " + count + " grades");

		keyboard.close();

	}

}
