package inheritancePoly;

/**
 * 
 * @author Keith Tanner
 * Title: Student.java
 * Description: Holds the Student class.
 * 
 */
public class Student extends Person {
	final int status;

	// Default constructor
	public Student() {
		super();
		this.status = 0;
	}

	public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}

	// Convert the status to a printable string
	public String getStatus() {
		switch (status) {
		case 1:
			return "Freshman";
		case 2:
			return "Sophomore";
		case 3:
			return "Junior";
		case 4:
			return "Senior";
		default:
			return "Unknown Status";
		}
	}

	// Create a description of the Student class as a String
	@Override
	public String toString() {
		return super.toString().replace("Class: Person", "Class: Student") + "\nStatus: " + getStatus();
	}
}