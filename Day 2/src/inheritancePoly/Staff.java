package inheritancePoly;

/**
 * 
 * @author Keith Tanner
 * Title: Staff.java
 * Description: Holds the Staff class.
 * 
 */
public class Staff extends Employee {
	String title;

	// Default constructor
	public Staff() {
		super();
		this.title = "Staff Member";
	}

	public Staff(String name, String address, String phoneNumber, String emailAddress, int office, double salary,
			String title) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}

	// Create a description of the Staff class as a String
	@Override
	public String toString() {
		return super.toString().replace("Class: Employee", "Class: Staff") + "\nTitle: " + title;
	}
}