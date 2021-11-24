package inheritancePoly;

import java.util.Date;

/**
 * 
 * @author Keith Tanner
 * Title: Employee.java
 * Description: Holds the Employee class.
 * 
 */
public class Employee extends Person {
	int office;
	double salary;
	Date dateHired;

	// Default constructor
	public Employee() {
		super();
		this.office = 0;
		this.salary = 0.00;
		this.dateHired = new Date();
	}

	public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}

	// Create a description of the Employee class as a String
	@Override
	public String toString() {
		return super.toString().replace("Class: Person", "Class: Employee") + "\nOffice: " + office + "\nSalary: $"
				+ salary + "\nDate hired: " + dateHired;
	}
}