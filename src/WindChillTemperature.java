/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Wind chill calculator 
 * Due: 06/10/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/


import java.util.Scanner;

public class WindChillTemperature {
	private static final double FIRST_COEFFICIENT = 35.74;
	private static final double SECOND_COEFFICIENT = 0.6215;
	private static final double THIRD_COEFFICIENT = 35.75;
	private static final double FOURTH_COEFFICIENT = 0.4275;
	private static final double EXPONENT = 0.16;

	public static void main(String[] args) {
		WindChillTemperature.getWindChillTemp();
	}
	
	private static void getWindChillTemp() {
		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
	    double actualTemp = Double.parseDouble(myScanner.nextLine());  // Read user input
	    
	    System.out.println("Enter the wind speed (>=2) in miles per hour:");
	    double windSpeed = Double.parseDouble(myScanner.nextLine());
	    myScanner.close();
	    
	    if (actualTemp > 41 || actualTemp < -58) {
	    	System.out.println("Temperature must be in between -58°F and 41°F");
	    	return;
	    }  
	    if (windSpeed < 2) {
	    	System.out.println("Windspeed must be greater than 2 MPH");
	    	return;
	    }
	    
	    double windChillTemp = (FIRST_COEFFICIENT) + (SECOND_COEFFICIENT * actualTemp) - (THIRD_COEFFICIENT * Math.pow(windSpeed, EXPONENT)) + (FOURTH_COEFFICIENT * actualTemp * Math.pow(windSpeed, EXPONENT));
	    windChillTemp = (double)Math.round(windChillTemp * 10000d) / 10000d;
	    System.out.println("The wind chill index is: " + windChillTemp);
	}
}
