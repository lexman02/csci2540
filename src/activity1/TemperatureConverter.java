package activity1;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("Enter a temperature in Celsius:");

		int fahrenheit, celsius;

		Scanner keyboard = new Scanner(System.in);
		celsius = keyboard.nextInt();

		fahrenheit = (int) ((celsius * 9.0/5.0) + 32);

		System.out.println("The temperature in Fahrenheit is:");
		System.out.println(fahrenheit);

		keyboard.close();

	}

}
