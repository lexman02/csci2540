/*
 * @author Xavier McNeill
 * @author Christian Silvero-Jones
 */
package activity13;

import java.util.*;
import java.io.*;

public class MapTest {

	public static void main(String[] args) {
		Scanner inputStream = null;
		Scanner kbd = new Scanner(System.in);
		String filename = "activity13_input.txt";
		int choice;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		
		try {
			inputStream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println(filename + " not found!");
		}
		
		if (inputStream != null) {			
			while (inputStream.hasNextLine()) {
				String line = inputStream.nextLine();
				dictionary.put(line.substring(0, 2), line.substring(3));
			}
		}
		
		do {
			String code;
			String name;
						
			System.out.println("***** MENU *****");
			System.out.println("1. Display all states");
			System.out.println("2. Add a new state");
			System.out.println("3. Search for a state");
			System.out.println("4. Exit");
			choice = kbd.nextInt();
			kbd.nextLine();
			
			switch (choice) {
				case 1:
					Set<Map.Entry<String,String>> resultSet = dictionary.entrySet();
					Iterator<Map.Entry<String,String>> iter = resultSet.iterator();
					Map.Entry<String, String> entry;
					
					System.out.println("\nStates Displayed");
					while (iter.hasNext()) {
						entry = iter.next();
						System.out.println(entry.getKey() + "\t\t" + entry.getValue());
					}
					System.out.println("\nPress Enter to continue...");
					kbd.nextLine();
					break;
				case 2:
					System.out.println("\nEnter state code:");
					code = kbd.nextLine();
					System.out.println("Enter state name:");
					name = kbd.nextLine();
					if (dictionary.containsKey(code) || dictionary.containsValue(name)) {
						System.out.println("\nState already exists\n");
					} else {
						dictionary.put(code, name);
					}
					break;
				case 3:
					System.out.println("\nEnter a state code:");
					code = kbd.nextLine();
					name = dictionary.get(code);
					if (!name.isEmpty()) {
						System.out.println("\n" + name);
					} else {
						System.out.println("\nState not found");
						
					}
					break;
			}
		} while (choice != 4);
		
		kbd.close();
	}

}
