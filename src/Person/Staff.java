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

public class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary,
			MyDate dateHired, String title) {
		// TODO Auto-generated constructor stub
		super(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.officeNumber = officeNumber;
		this.salary = salary;
		this.dateHired = dateHired;
		this.title = title;
	}
	
	public String toString() {
		return("Staff"
				+ "\nTitle: " + this.title
				+ "\nName: " + this.name 
				+ "\nOffice Number: " + this.officeNumber
				+ "\nPhone Number: " + this.phoneNumber
				+ "\nEmail Address: " + this.emailAddress);
	}

}
