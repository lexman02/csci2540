package activity5;

@SuppressWarnings("serial")
public class EmptyStringException extends Exception {
	public EmptyStringException() {
		super("String can't be empty");
	}

	public EmptyStringException(String input) {
		super(input);
	}
}
