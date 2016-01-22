import java.util.Scanner;

/* Java 2 T Th 11:15 Professor Voss
 * Randall Sirota Homework 1, pg. 564
 * Requirements: Create a Class file and test the file with a client file
 */
public class TestNameMain {
	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		// create the general constructor set data and test data
		System.out.println("Test explicit constructor");
		Name n = new Name();
		Scanner c = new Scanner(System.in);
		System.out.print("Enter first name: ");
		firstName = c.next();
		System.out.print("Enter middle name: ");
		middleName = c.next();
		System.out.print("Enter last name: ");
		lastName = c.next();
		n.setFirstName(firstName);
		n.setMiddleName(middleName);
		n.setLastName(lastName);
		System.out.println("The name you entered is: " + n);
		System.out.println("Regular order: " + n.getNormalOrder());
		System.out.println("Reverse order: " + n.getReverseOrder());
		System.out.println("Test the getters: " + n.getFirstName() + " " + n.getMiddleName() + " " + n.getLastName());
		c.close();
		
		// create explicit constructor passing name as "John Q Public"
		System.out.println("Test explicit constructor");
		Name n1 = new Name("John", "Q", "Public");
		System.out.println("The name you entered is: " + n1);
		System.out.println("Regular order: " + n1.getNormalOrder());
		System.out.println("Reverse order: " + n1.getReverseOrder());
		System.out.println("Test the getters: " + n1.getFirstName() + " " + n1.getMiddleName() + " " + n1.getLastName());
		System.out.println("Use setter to change name to Buggs B Bunny");
		n1.setFirstName("Buggs");
		n1.setMiddleName("B");
		n1.setLastName("Bunny");
		System.out.println("The name you entered is: " + n1);		
	}
}
