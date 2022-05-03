/*
 * @author Xavier McNeill
 * A class for Date
 */
package activity4;

public class Date implements Comparable<Date> {
	private int month, day, year;

	/*
	 * Default constructor
	 */
	Date(){
		month = 1;
		day = 1;
		year = 2000;
	}

	/*
	 * Constructor with a given month, day, and year
	 * @param month The given month
	 * @param day The given day
	 * @param year The given year
	 */
	Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	/*
	 * Retrieve the value of the month
	 * @return The month
	 */
	public int getMonth() {
		return month;
	}

	/*
	 * Retrieve the value of the day
	 * @return The day
	 */
	public int getDay() {
		return day;
	}

	/*
	 * Retrieve the value of the year
	 * @return The year
	 */
	public int getYear() {
		return year;
	}

	/*
	 * Modify the month
	 * @param newMonth The new month
	 */
	public void setMonth(int newMonth) {
		month = newMonth;
	}

	/*
	 * Modify the day
	 * @param newDay The new day
	 */
	public void setDay(int newDay) {
		day = newDay;
	}

	/*
	 * Modify the year
	 * @param newYear The new year
	 */
	public void setYear(int newYear) {
		year = newYear;
	}

	/*
	 * Return formatted date as string
	 * @return Formatted date as string
	 */
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	/*
	 * Output formatted date to screen
	 */
	public void printDate() {
		System.out.println(month + "/" + day + "/" + year);
		// System.out.println(this.toString());
		// System.out.println(this);
	}

	/*
	 * Compare this date to a date object
	 * @param d The date to compare
	 * @return An integer containing the results of the comparison
	 */
	@Override
	public int compareTo(Date d) {
		if (this.month > d.month || this.day > d.day || this.year > d.year) {
			return 1;
		} else if (this.month < d.month || this.day < d.day || this.year < d.year) {
			return -1;
		} else {
			return 0;
		}
	}
}
