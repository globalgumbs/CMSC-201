/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Statistics Project
 * Due: 06/24/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/

import java.text.SimpleDateFormat;
import java.util.*;

public class Statistics {
	private static List<Float> nums = new ArrayList<>();
	
	public static void main(String[] args) {
		float sum = getSum();
		float mean = calcMean(sum);
		float std = calcSTD(mean);
		displayData(mean, std);
	}
	
	private static float getSum() {
		System.out.println("********************************************************************");
		System.out.println("***Project 2: Statistics - compute mean and standard deviation***");
		System.out.println();
		System.out.println("Enter numbers:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		String[] numStrings = input.split(" ");
		float sum = 0;
		for (String num: numStrings) {
			sum += Float.parseFloat(num);
			nums.add(Float.parseFloat(num));
		}
		return(sum);
	}
	
	private static float calcMean(float sum) {
		return(sum / nums.size());
	}
	
	private static float calcSTD(float mean) {
		float dev = 0;
		for (float num: nums) {
			dev += Math.pow((num - mean), 2);
		}
		return (float) Math.sqrt(dev / (nums.size() - 1)); 	
	}
	
	private static void displayData(float mean, float std) {
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + std);
		System.out.println("Student: Albert Gumbs");
		String timeStamp = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
		System.out.println("Date: " + timeStamp);		
	}
}

