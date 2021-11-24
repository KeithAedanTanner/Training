package inheritancePoly;

/**
 * 
 * @author Keith Tanner
 * Title: Person.java
 * Description: Holds the Person class.
 * 
 */
public class Person {
	String name;
	String address;
	String phoneNumber;
	String emailAddress;

	// Default constructor
	public Person() {
		this("Default Name", "Default Address", "(Default)Phone-Number", "default@email.address");
	}

	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	// Create a description of the Person class as a String
	public String toString() {
		return "\nClass: Person \nName: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail Address: "
				+ emailAddress;
	}
}