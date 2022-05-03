/*
 * @author Xavier McNeill
 * A class for a student with an id, last name, first name, gender, date of birth, and major
 */
package assg4_mcneillx20;

public class Student {
	private int id;
	private String lastName;
	private String firstName;
	private char gender;
	private String dateOfBirth;
	private String major;

	/*
	 * Default constructor
	 */
	Student(int id, String lastName, String firstName, char gender, String dateOfBirth, String major) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.major = major;
	}

	/*
	 * Return the student ID
	 * @return The student ID
	 */
	public int getId() {
		return id;
	}

	/*
	 * Return the student's last name
	 * @return The student's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/*
	 * Return the student's first name
	 * @return The student's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * Return the student's gender
	 * @return The student's gender
	 */
	public char getGender() {
		return gender;
	}

	/*
	 * Return the student's date of birth
	 * @return The student's date of birth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/*
	 * Return the student's major
	 * @return The student's major
	 */
	public String getMajor() {
		return major;
	}

	/*
	 * Return formatted student information as a string
	 * @return Formatted student information as a string
	 */
	@Override
	public String toString() {
		return "Id: " + id + ", Last name: " + lastName + ", First name: " + firstName + ", Gender: " + gender + ", Date of birth: " + dateOfBirth + ", Major: " + major;
	}

	/*
	 * Search for the student in an array of students by name and return it position in the array
	 * @param roster The given array of students
	 * @param studentCount The actual number of students in the array
	 * @param lastName The last name to search for in the array
	 * @param firstName The first name to search for in the array
	 * @return The position of the found student in the array, or the exception if no student is found
	 * @throws StudentNotFoundException
	 */
	public static int studentSearch(Student[] roster, int studentCount, String lastName, String firstName) throws StudentNotFoundException {
		for (int i = 0; i < studentCount; i++) {
			if (roster[i].lastName.equals(lastName) && roster[i].firstName.equals(firstName)) {
				return i;
			}
		}

		throw new StudentNotFoundException();
	}
}
