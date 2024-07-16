/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Locker Puzzle
 * Due: 07/01/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
public class LockerPuzzle {
	public static void main(String[] args) {
		
		boolean [] lockers = new boolean [100];
		for (int s = 0; s < 100; s++) {
			
			for (int lckr = s; lckr < 100; lckr+=s+1) {
				lockers[lckr] = !lockers[lckr];
			}
		}
		
		for (int i = 0; i < lockers.length; i++) {
			String status;
			if (lockers[i]) {
				status = "open";
				System.out.println("Locker " + (i+1) + " is " + status);
			}
		}
		
	}
}
