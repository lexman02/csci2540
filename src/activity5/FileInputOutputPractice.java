package activity5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInputOutputPractice {
	public static void main(String[] args) {
		String inputFilename = "activity5_input.txt";
		String outputFilename = "activity5_output.txt";
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String line;
		int lineNumber = 1;

		try {
			inputStream = new Scanner(new File(inputFilename));
			outputStream = new PrintWriter(outputFilename);
		}
		catch (IOException e) {
			System.out.println("Error opening the file \"" + outputFilename + "\"");
			System.exit(1);
		}

		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			outputStream.println(lineNumber + ": " + line.toUpperCase());
			lineNumber++;
		}
		outputStream.close();
	}

}
