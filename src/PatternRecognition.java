/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Pattern Recognition
 * Due: 07/01/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
import java.util.Scanner;
public class PatternRecognition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many rows: ");
		Scanner scanner = new Scanner(System.in);
		int rows = Integer.parseInt(scanner.nextLine());
		System.out.println("How many columns: ");
		int cols = Integer.parseInt(scanner.nextLine());
		
		int[][] values = new int[rows][cols];
		int i = 0;
		for (int[] row: values) {
			System.out.println("Row " + (i+1) + ": ");
			String[] strArr = scanner.nextLine().split(" ");
			int j = 0;
			while (j < cols && j < strArr.length) {
				row[j] = Integer.parseInt(strArr[j]);
				j++;
			}
			i++;
		}
		scanner.close();
		System.out.println(isConsecutiveFour(values));
		
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		// Case 0: List not long enough for 4 consecutive
		if (values.length < 4 && values[0].length < 4) {
			//System.out.println("Case 0");
			return false;
		}
		
		// Case 1: Horizontal
		for (int[] row: values) { 
			int horCurr = -1, horCount = 1, i = 0;
			while (i < row.length) {
				if (horCurr == row[i]) {
					if (++horCount == 4) {
						//System.out.println("Case 1: " + horCurr);
						return true;}
				} else {
					horCount = 1;
					horCurr = row[i];
				}
				i++;
			}
		}
		
		// Case 2: Vertical
		for (int j = 0; j < values[0].length; j++) {
			int vertCount = 1, vertCurr = -1;
			for (int k = 0; k < values.length; k++) {
				if (vertCurr == values[k][j]) {
					if (++vertCount == 4) {
						//System.out.println("Case 2: " + vertCurr);
						return true;}
				} else {
					vertCount = 1;
					vertCurr = values[k][j];
				}
			}
		}
		
		
		//Case 3: Diagonal Descending
		for (int l = 0; l < values[0].length; l++) {
			int upCurr = -1, m = 0;
			while (values[0].length - l >= 4 && values.length - m >= 4) {
				upCurr = values[l][m];
				if (values[l+1][m+1] == upCurr && values[l+2][m+2] == upCurr && values[l+3][m+3] == upCurr) {
					//System.out.println("Case 3");
					return true;
				}
				m++;
			}
		}
		
		// Case 4: Diagonal Ascending
		for (int n = values[0].length - 1; n >= 0; n--) {
			int downCurr = -1, o = 0;
			while (n >= 3 && values.length - o >= 4) {
				downCurr = values[n][o];
				if (values[n-1][o+1] == downCurr && values[n-2][o+2] == downCurr && values[n-3][o+3] == downCurr) {
					//System.out.println("Case 4");
					return true;
				}
				o++;
			}
		}
		
		// Case 5: No matches
		return false;
	}
	

}
