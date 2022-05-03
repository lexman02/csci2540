/*
 * @author Xavier McNeill
 * A class for people objects in a phone book
 */
package assg9_mcneillx20;

public class Person extends KeyedItem<String> {
	String number;

	/*
	 * Default two parameter constructor
	 * @param key The first and last name of the person
	 * @param number The phone number of the person
	 */
	public Person(String key, String number) {
		super(key);
		this.number = number;
	}

	/*
	 * Returns a formatted string of the person's name and number
	 * @return A formatted string of the person's name and number
	 */
	@Override
	public String toString() {
		return getKey() + ": " + number;
	}
}
