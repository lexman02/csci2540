/*
 * @author Xavier McNeill
 * An exception class for students not found in the given array
 */
package assg4_mcneillx20;

@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception {
	/*
	 * Default constructor
	 */
	public StudentNotFoundException() {
		super("No such student");
	}

	/*
	 * Constructor with a given message
	 * @param msg The message to be returned
	 */
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}
