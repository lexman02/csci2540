/*
 * @author Xavier McNeill
 * A class that asks the user for a first and last name to search for the position in the array and output the results if found
 */
package assg4_mcneillx20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentSearch {

	public static void main(String[] args) {
		// Read 1 line, create student object, and add it to the array
		String inputFilename = "assg4_roster.txt";
		Scanner inputStream = null;
		Student[] roster = new Student[100];
		int count = 0;
		char choice;

		try {
			inputStream = new Scanner(new File(inputFilename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		while (inputStream.hasNextInt()) {
			int id;
			String lastName;
			String firstName;
			char gender;
			String dob;
			String major;

			id = inputStream.nextInt();
			lastName = inputStream.next();
			firstName = inputStream.next();
			gender = inputStream.next().charAt(0);
			dob = inputStream.next();
			major = inputStream.next();

			roster[count] = new Student(id, lastName, firstName, gender, dob, major);
			count++;
		}

		Scanner kbd = new Scanner(System.in);

		do {
			String firstName;
			String lastName;
			int studentPos;

			System.out.print("Enter last name: ");
			lastName = kbd.nextLine();
			System.out.print("Enter first name: ");
			firstName = kbd.nextLine();

			try {
				studentPos = Student.studentSearch(roster, count, lastName, firstName);
				System.out.println(roster[studentPos]);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}

			System.out.print("Do you want to search for another student (Y/N)? ");
			choice = kbd.next().charAt(0);

			kbd.nextLine();
			System.out.println();
		} while (choice == 'y' || choice == 'Y');

		kbd.close();

	}

}
