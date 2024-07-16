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

public class Employee extends Person {
	protected int officeNumber, salary;
	protected MyDate dateHired;

	public Employee(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired) {
		// TODO Auto-generated constructor stub
		super(name, address, phoneNumber, emailAddress);
		this.officeNumber = officeNumber;
		this.salary = salary;
		this.dateHired = dateHired;
	}
}
