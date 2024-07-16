/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Project 6: Person class
 * Due: 07/15/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
package Person;

public class Student extends Person {
	final private String classStatus;

	public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
		// TODO Auto-generated constructor stub
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return("Student"
				+ "\nName: " + this.name 
				+ "\nClass Status: " + this.classStatus 
				+ "\nEmail Address: " + this.emailAddress);
	}
}
