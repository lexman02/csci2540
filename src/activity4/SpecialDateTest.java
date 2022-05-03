/*
 * @author Xavier McNeill
 * A class that tests the Date and SpecialDate class
 */
package activity4;

public class SpecialDateTest {

	public static void main(String[] args) {
		SpecialDate d1 = new SpecialDate();
		SpecialDate d2 = new SpecialDate(04, 25, 2002, "My birthday");
		Date d3 = new SpecialDate(12, 25, 2022, "Christmas Day");

		// Compare dates
		d1.compareTo(d2);
		d1.compareTo(d2);
		d1.compareTo(d3);

		// Set description and print new description
		d1.setDescription("d1 description");
		System.out.println(d1.getDescription());

		// Print each date using the overridden print method
		d1.printDate();
		d2.printDate();
		d3.printDate();

	}

}
