package inheritancePoly;

/**
 * 
 * @author Keith Tanner
 * Title: Faculty.java
 * Description: Holds the Faculty class.
 * 
 */
public class Faculty extends Employee {
	String officeHours;
	String rank;

	// Default constructor
	public Faculty() {
		super();
		this.officeHours = "None";
		this.rank = "Professor";
	}

	public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary,
			String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// Create a description of the Faculty class as a String
	@Override
	public String toString() {
		return super.toString().replace("Class: Employee","Class: Faculty") + "\nOffice hours: " + officeHours + "\nRank: " + rank;
	}
}