/*
 * @author Xavier McNeill
 * A class to test the Date class
 */
package activity3;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(4, 25, 2002);
		Date d3 = new Date(04, 25, 2002);

		// Test toString method
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println();

		// Test setMonth, setDay, and setYear methods
		d3.setMonth(12);
		d3.setDay(24);
		d3.setYear(2022);

		// Test getMonth, getDay, and getYear methods
		System.out.println("Month: " + d3.getMonth());
		System.out.println("Day: " + d3.getDay());
		System.out.println("Year: " + d3.getYear());
		System.out.println();

		// Test printDate method
		d1.printDate();
		d2.printDate();
		d3.printDate();

	}

}
