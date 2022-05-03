package activity7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class ListPractice {

	public static void main(String[] args) {
		String filename = "activity7_input.txt";
		Scanner inputStream = null;
		ArrayList<Date> dates = new ArrayList<>();
		ListIterator<Date> iter;

		try {
			inputStream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening \"" + filename + "\"");
		}

		while (inputStream.hasNextLine()) {
			String[] tempDates = inputStream.nextLine().split("/");
			Date tempDate = new Date(Integer.parseInt(tempDates[0]), Integer.parseInt(tempDates[1]), Integer.parseInt(tempDates[2]));
			dates.add(tempDate);
		}

		Collections.sort(dates);

		iter = dates.listIterator();

		while (iter.hasNext()) {
			Date temp = iter.next();
			System.out.println(temp);
		}

	}

}
