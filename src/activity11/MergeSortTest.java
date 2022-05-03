/*
 * @author Xavier McNeill and TJ
 */
package activity11;

import java.io.*;
import java.util.*;

public class MergeSortTest {

	public static void main(String[] args) {
		String filename = "activity11_input.txt";
		Scanner inputFile = null;
		ArrayList<String> titles = new ArrayList<>();

		try {
			inputFile = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

		System.out.println("Original List:");
		while (inputFile.hasNextLine()) {
			titles.add(inputFile.nextLine());
			System.out.println(titles.get(titles.size() - 1));
		}

		inputFile.close();

		titles = mergeSort(titles);

		System.out.println("\nSorted List:");
		for (int i = 0; i < titles.size(); i++) {
			System.out.println(titles.get(i));
		}
	}

	public static ArrayList<String> mergeSort(ArrayList<String> titles) {
		int listHalfPoint = (titles.size() / 2);
		ArrayList<String> split1 = new ArrayList<>();
		ArrayList<String> split2 = new ArrayList<>();

		split1.addAll(titles.subList(0, listHalfPoint));
		split2.addAll(titles.subList(listHalfPoint, titles.size()));

		if (split1.size() == 1 && split2.size() == 1) {
			return merge(split1, split2);
		} else if (split1.size() == 1) {
			return merge(split1, mergeSort(split2));
		} else if (split2.size() == 1) {
			return merge(mergeSort(split1), split2);
		} else {
			return merge(mergeSort(split1), mergeSort(split2));
		}
	}

	public static ArrayList<String> merge(ArrayList<String> split1, ArrayList<String> split2) {
		ArrayList<String> combinedTitles = new ArrayList<>();

		if (split1.size() == 0) {
			combinedTitles.addAll(split2);
		} else if (split2.size() == 0) {
			combinedTitles.addAll(split1);
		} else {
			if (split1.size() == 1 && split2.size() == 1) {
				if (split1.get(0).compareTo(split2.get(0)) < 0) {
					combinedTitles.add(split1.get(0));
					split1.remove(0);
					combinedTitles.add(split2.get(0));
					split2.remove(0);
				} else {
					combinedTitles.add(split2.get(0));
					split2.remove(0);
					combinedTitles.add(split1.get(0));
					split1.remove(0);
				}
			} else {
				combinedTitles.addAll(split1);
				combinedTitles.addAll(split2);
			}
		}

		return combinedTitles;
	}

}
