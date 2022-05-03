/*
 * @author Xavier McNeill and Ryan
 */
package activity12;

import java.io.*;
import java.util.*;

public class TreeSortTest {
	public static void main(String[] args) {
		Scanner inputStream = null;
		String filename = "activity12_input.txt";
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();

		try {
			inputStream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File " + filename + " not found");
		}

		while (inputStream.hasNextLine()) {
			String appointment = inputStream.nextLine();
			String[] tempDate = appointment.substring(0, appointment.indexOf(',')).split("/");
			Date d = new Date(Integer.parseInt(tempDate[0]), Integer.parseInt(tempDate[1]),
					Integer.parseInt(tempDate[2]));
			appointments.add(new Appointment(d, appointment.substring(appointment.indexOf(',') + 2)));
		}

		treeSort(appointments);

	}

	public static void treeSort(ArrayList<Appointment> appointments) {
		BinarySearchTree<Appointment, Date> tree = new BinarySearchTree<Appointment, Date>();

		for (Appointment appointment : appointments) {
			tree.insert(appointment);
		}

		TreeIterator<Appointment> iterator = new TreeIterator<Appointment>(tree);
		iterator.setInorder();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
