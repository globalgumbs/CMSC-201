/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Statistics Project
 * Due: 07/22/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**@author Albert Gumbs*/

public class PrimeNumberMethodTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	/**Tests the PrimeNumberMethod class's isPrime() method
	 * @param No parameters
	 * @return void*/
	void testIsPrime() {
		// create list of prime and non prime numbers
		final int[] PRIMES = {6481, 8761, 4639, 7607, 2027, 643, 2213, 9661, 6703, 5197, 1949, 8819, 641, 557, 3803, 5153, 719, 6691, 1237, 5869, 4157, 4363, 8839, 5881, 7069, 3659, 9257, 2683, 9011, 919, 353, 8501, 9221, 4733, 4283, 7793, 4003, 61, 9551, 8059, 6421, 479, 5333, 4079, 7673, 971, 443, 9521, 3833, 251};
		final int[] NONPRIMES = {6032, 2555, 9951, 9779, 3626, 5541, 7617, 915, 3158, 2118, 5844, 3281, 3658, 2582, 2294, 3577, 9141, 9900, 282, 471, 8777, 7098, 8640, 9685, 5270, 6117, 3490, 3365, 8698, 3178, 7513, 4816, 7336, 7456, 6189, 8062, 7989, 6926, 2415, 7360, 1803, 933, 6918, 2721, 4682, 3341, 4143, 1998, 6541, 6545};
		
		// test prime inputs to ensure that the method returns true
		for (int prime: PRIMES) {
			assertTrue(PrimeNumberMethod.isPrime(prime));
		}
		
		// Test non prime inputs to make sure the method returns false
		for (int nonPrime: NONPRIMES) {
			assertFalse(PrimeNumberMethod.isPrime(nonPrime));
		}
		
		System.out.println("Tests complete.");
	}

}
