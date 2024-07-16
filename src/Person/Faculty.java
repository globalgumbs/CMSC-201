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

public class Faculty extends Employee {
	private String officeHours, rank;

	public Faculty(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary,
			MyDate dateHired, String officeHours, String rank) {
		// TODO Auto-generated constructor stub
		super(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString() {
		return("Faculty"
				+ "\nRank: " + this.rank
				+ "\nName: " + this.name 
				+ "\nOffice Number: " + this.officeNumber
				+ "\nOffice Hours: " + this.officeHours
				+ "\nPhone Number: " + this.phoneNumber
				+ "\nEmail Address: " + this.emailAddress);
	}

}
