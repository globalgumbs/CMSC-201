/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Project 5: 2D Circle Test
 * Due: 07/08/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
public class TestCircle2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area: "+c1.getArea());
		System.out.println("Perimeter: "+c1.getPerimeter());
		System.out.println("Contains point: "+c1.contains(3, 3));
		System.out.println("Contains circle: "+c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Overlaps circle: "+c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
