/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Cost of driving calculator
 * Due: 06/10/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/

import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
		CostOfDriving.getCost();
	}
	
	private static void getCost() {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the driving distance in miles:");
		double distance = Double.parseDouble(myScanner.nextLine());
		
		System.out.println("Enter miles per gallon:");
		double mpg = Double.parseDouble(myScanner.nextLine());
		
		System.out.println("Enter the price per gallon in dollars:");
		double ppg = Double.parseDouble(myScanner.nextLine());
		myScanner.close();
		
		if (distance < 0) {System.out.println("Distance cannot be negative"); return;}
		if (mpg <= 0) {System.out.println("Miles per gallon must be greater than 0"); return;}
		if (ppg <= 0) {System.out.println("Price per gallon must be greater than 0"); return;}
		
		
		double totalCost = (double) Math.round((ppg / mpg * distance) * 100d) / 100d;
		System.out.println("The total cost of driving is: $" + totalCost + ".");	
	}
}
