/*
 * @author Xavier McNeill
 * An application to manage contacts in a phone book
 */
package assg9_mcneillx20;

import java.util.*;

public class PhoneBookManager {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		Scanner kbd = new Scanner(System.in);
		int choice;
		boolean updateFile = false;

		phoneBook.loadData();

		do {
			String name;
			String number;
			choice = menu(kbd);
			kbd.nextLine();
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("Enter the first and last name of the contact:");
				name = kbd.nextLine();
				System.out.println("Enter the phone number of the contact:");
				number = kbd.nextLine();

				if (phoneBook.addContact(name, number)) {
					updateFile = true;
				}
				confirmation(kbd);
				break;
			case 2:
				System.out.println("Enter the first and last name of the contact:");
				name = kbd.nextLine();

				if (phoneBook.deleteContact(name)) {
					updateFile = true;
				}
				confirmation(kbd);
				break;
			case 3:
				System.out.println("Enter the first and last name of the contact to search for:");
				name = kbd.nextLine();
				Person person = phoneBook.searchForContact(name);

				System.out.println();
				if (person != null) {
					System.out.println(person);
				} else {
					System.out.println("\"" + name + "\" not found.");
				}
				confirmation(kbd);
				break;
			case 4:
				System.out.println("Enter the first and last name of the contact to update:");
				name = kbd.nextLine();
				System.out.println("Enter the new phone number of the contact:");
				number = kbd.nextLine();

				if (phoneBook.updateContact(name, number)) {
					updateFile = true;
				}
				confirmation(kbd);
				break;
			case 5:
				phoneBook.displayContacts();
				confirmation(kbd);
				break;
			}
		} while (choice != 6);

		if (updateFile) {
			phoneBook.saveData();
		}

		kbd.close();
	}

	/*
	 * Displays the menu and returns the user's choice
	 * @param kbd The Scanner object to read input from the keyboard
	 * @return The user's choice
	 */
	public static int menu(Scanner kbd) {
		System.out.println("1. Add a contact");
		System.out.println("2. Delete a contact");
		System.out.println("3. Search a phone number");
		System.out.println("4. Update a phone number");
		System.out.println("5. Display all contacts");
		System.out.println("6. Save & Exit\n");

		return kbd.nextInt();
	}

	/*
	 * Prints a confirmation message and waits for the user to press enter
	 * @param kbd The Scanner object to read input from the keyboard
	 */
	public static void confirmation(Scanner kbd) {
		System.out.println("\nPress Enter to continue...");
		kbd.nextLine();
	}
}
