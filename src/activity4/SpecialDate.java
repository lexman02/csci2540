/*
 * @author Xavier McNeill
 * A class for Special Dates that extends the Date class
 */
package activity4;

public class SpecialDate extends Date {
	private String description;

	/*
	 * Defualt constructor
	 */
	SpecialDate() {
		super();
		description = "Special Date";
	}

	/*
	 * Constructor with a given month, day, year, and description
	 * @param month The given month
	 * @param day The given day
	 * @param year The given year
	 * @param description The given description
	 */
	SpecialDate(int month, int day, int year, String description) {
		super(month, day, year);
		this.description = description;
	}

	/*
	 * Retrieve the value of the description
	 * @return The description
	 */
	public String getDescription() {
		return description;
	}

	/*
	 * Modify the description
	 * @param newDescription The new description
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/*
	 * Return formatted date and description as string
	 * @return Formatted date and description
	 */
	@Override
	public String toString() {
		return getMonth() + "/" + getDay() + "/" + getYear() + ", " + description;
	}

	/*
	 * Output formatted date and description to screen
	 */
	@Override
	public void printDate() {
		System.out.println(this.toString());
	}
}
