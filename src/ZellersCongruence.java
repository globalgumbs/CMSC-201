/*
 * Class: CMSC201 
 * Instructor: Prof Grinberg
 * Description: Zeller's Congruence program
 * Due: 06/17/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/

import java.util.Scanner;

public class ZellersCongruence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZellersCongruence.getDayofWeek();
	}
	
	private static void getDayofWeek() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********Zeller's Congruence***********");
		System.out.println(" ");
		System.out.println("Enter year (eg 2012): ");
		int year = Integer.parseInt(scanner.nextLine());
		if (year < 0) {
			System.out.println("Year must be 0 or greater");
			scanner.close();
			System.out.println("*************************************");
			return;
		}
		int j = year / 100;
		int k = year % 100;
		
		System.out.println("Enter month (1-12): ");
		int m = Integer.parseInt(scanner.nextLine());
		if (m < 1 || m > 12) {
			System.out.println("Month must be between 1 and 12");
			scanner.close();
			System.out.println("*************************************");
			return;
		}
		
		System.out.println("Enter the day of the month (1-31): ");
		int q = Integer.parseInt(scanner.nextLine());
		if (q < 1 || q > 31) {
			System.out.println("Day must be between 1 and 31");
			scanner.close();
			System.out.println("*************************************");
			return;
		}
		scanner.close();
		
		int dayOfWeek = (q+26*(m+1) / 10+k+k / 4+j / 4+5*j)% 7;
		String dayString = null;
		switch (dayOfWeek) {
			case 0: 
				dayString = "Saturday";
				break;
			case 1: 
				dayString = "Sunday";
				break;
			case 2: 
				dayString = "Monday";
				break;
			case 3: 
				dayString = "Tuesday";
				break;
			case 4: 
				dayString = "Wednesday";
				break;
			case 5:
				dayString = "Thursday";
				break;
			case 6: 
				dayString = "Friday";
				break;
		}
		
		System.out.println("Day of the week is " + dayString);		
		
		System.out.println("****************************************");
	}

}
