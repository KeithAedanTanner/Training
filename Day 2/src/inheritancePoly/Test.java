package inheritancePoly;

/**
 * 
 * @author Keith Tanner
 * Title: Test.java
 * Description: Tests the Person, Student, Employee, Faculty, and Staff classes.
 * 
 */
public class Test {

	public static void main(String[] args) {
		// Create default objects to test the classes
		Person person = new Person();
		Student student = new Student();
		Employee employee = new Employee();
		Faculty faculty = new Faculty();
		Staff staff = new Staff();

		// Create objects with information to test the classes
		Person person1 = new Person("Stewart Conn", "7580 E. Plymouth Ave.", "(843)220-9768", "stewart.conn@yahoo.com");
		Student student1 = new Student("Valerie Mariano", "53 East Wentworth St.", "(910)938-8431",
				"valerie.mariano@yahoo.com", 3);
		Employee employee1 = new Employee("Nona Hipolito", "900 Lakewood Ave.", "(208)359-1282",
				"nona.hipolito@hotmail.com", 1234, 48000);
		Faculty faculty1 = new Faculty("Anderson Bryce", "239 King St.", "(563)535-4985", "anderson.bryce@gmail.com",
				4567, 65000, "2pm to 4pm", "Associate Professor");
		Staff staff1 = new Staff("Verona Spencer", "7408 Garfield Street", "(309)267-0443", "verona14@hotmail.com",
				7890, 100000, "Dean of Students");

		// Print out the information about each created objects using the toString()
		// methods
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		System.out.println(person1.toString());
		System.out.println(student1.toString());
		System.out.println(employee1.toString());
		System.out.println(faculty1.toString());
		System.out.println(staff1.toString());
	}
}