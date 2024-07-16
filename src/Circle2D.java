/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Project 5: 2D Circle
 * Due: 07/08/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
public class Circle2D {
	private double x, y, radius;
	
	public Circle2D() {
		this.radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return(Math.PI * Math.pow(radius, 2));
	}
	
	public double getPerimeter() {
		return(2 * Math.PI * this.radius);
	}
	
	private double getX() {
		return this.x;
	}
	
	private double getY() {
		return this.y;
	}
	
	public boolean contains(double x, double y) {	
		if (Math.sqrt( Math.pow( this.x - x, 2 ) + Math.pow(this.y - y,  2)) > radius) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt( Math.pow( this.x - circle.getX(), 2 ) + Math.pow(this.y - circle.getY(),  2));
		if (this.radius >= circle.getRadius() + distance) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt( Math.pow( this.x - circle.getX(), 2 ) + Math.pow(this.y - circle.getY(),  2));
		if (distance <= circle.getRadius() + this.radius) {
			return true;
		} else {
			return false;
		}
	}
}
