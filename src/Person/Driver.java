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
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		String name, address, phoneNumber, emailAddress;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter (1) to create a student or (2) to create an employee: ");
		int input = Integer.parseInt(scanner.nextLine());
		if (input != 1 && input != 2) {System.out.println("User input invalid"); scanner.close(); return;}
		String classStatus; Student student;
		System.out.println("Enter the person's name: ");
		name = scanner.nextLine();
		System.out.println("Enter " + name + "'s address: ");
		address = scanner.nextLine();
		System.out.println("Enter " + name + "'s phone number: ");
		phoneNumber = scanner.nextLine();
		System.out.println("Enter " + name + "'s email address: ");
		emailAddress = scanner.nextLine();
		if (input == 1) { // Student
			System.out.println("Enter " + name + "'s class status: ");
			classStatus = scanner.nextLine();
			student = new Student(name, address, phoneNumber, emailAddress, classStatus);
			System.out.println("\n\n" + student.toString());
		} else { // Employee
			int officeNumber, salary; MyDate dateHired; 
			System.out.println("Enter (1) to create a faculty member or (2) to create a staff member: ");
			input = Integer.parseInt(scanner.nextLine());
			if (input != 1 && input != 2) {System.out.println("User input invalid"); scanner.close(); return;}
			System.out.println("Enter " + name + "'s office number: ");
			officeNumber = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter " + name + "'s salary: ");
			salary = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter " + name + "'s hire date: ");
			dateHired = new MyDate(scanner.nextLine());
			
			if (input == 1) { // Faculty
				String officeHours, rank; Faculty faculty;
				System.out.println("Enter " + name + "'s office hours: ");
				officeHours = scanner.nextLine();
				System.out.println("Enter " + name + "'s rank: ");
				rank = scanner.nextLine();
				faculty = new Faculty(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired, officeHours, rank);
				System.out.println(faculty.toString());
			} else { // Staff
				String title; Staff staff;
				System.out.println("Enter " + name + "'s title: ");
				title = scanner.nextLine();
				staff = new Staff(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired, title);
				System.out.println(staff.toString());
			}
			
			
		}
		scanner.close();
		
	}

}
