/**
 * This Class was created as a review guide for the Introduction to Java Final Exam.
 * Please remember that all questions on here will not represent all questions on the exam,
 * nor does this mean that questions absent from here wont be on the final.
 * @author Micheal Bailey
 *
 */
public class Review1 {

	/*Questions 1-7 are all conceptual.


	/*
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 1.
	 * What is an object?
	 * A. a class
	 * B. a sub class
	 * C. an instance of a class
	 * 
	 * Answer: C
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*Please give an explanation for questions 2-4.
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 2.
	 * a. What is a an interface?
	 * b. What keyword is used?
	 * 
	 * 	 
	 * Answer: An interface is an abstract type that forces implemenyting classes to adopt certain behaviours.
	 * The keyword for an interface is "implements".
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 3.
	 * a. What creating an abstract method within a class, what must you do in the subclass?
	 * b. What keyword is used?
	 * 
	 * Answer: When creating an abstract method in a class, the subclass must define that method.
	 * The keyword is "abstract".
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 4.
	 * What is a polymorphism?
	 * 
	 * Answer: Polymorphism is the ability of a type to belong to multiple classes. For example, Dog and Cat can both be
	 * subclasses of Mammal, which can be a subclass of Animal.
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 5.
	 * a. What is inheritance used for in programming?
	 * b. Please provide a real world example.
	 * b. What keyword is used?
	 * 
	 * Answer: Inheritance is used for defining subclasses that inherit all of the properties and methods of the
	 * parent class. For example, if I am creating a program with animals, I can define an Animal class and have
	 * subclasses of Dog, Cat, Mouse, etc. This will save time and effort in rewriting all of the properties
	 * and methods shared among the subclasses. The keyword used for defining inheritance is "extends".
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 6.
	 * What is the difference between the String and StringBuilder class?
	 * A. String is mutable and StringBuilder is immutable.
	 * B. String is immutable and StringBuilder is mutable.
	 * c. They are both mutable.
	 * d. They are both immutable.
	 * 
	 * Answer: B
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 7.
	 * What are setters and getters?
	 * A. Setters are used the assign the class attributes values, while getters are used to obtain the values of the attributes.
	 * B. Getters are used the assign the class attributes values, while setters are used to obtain the values of the attributes.
	 * D. setter are mutators and getters are accessor's.
	 * E. getters are mutators and setters are accessor's.
	 * F. Both A and D.
	 * 
	 * Answer: F
	 * ---------------------------------------------------------------------------------------------------------
	 */

	/*The remaining questions will require you to trace the code.
	 * ---------------------------------------------------------------------------------------------------------
	 * Question #8
	 * a. Will the following code run?
	 * b. why or why not?
	 * c. If it does work what will be the output
	 * 
	 * Answer: The following code will output:
	 * You are now racing
	 * turbo: true
	 * ---------------------------------------------------------------------------------------------------------
	 *
	 public class Car{
	  String name, color;
	  int topSpeed;
	  	 Car(String name, String color, int topSpeed){
	 		 this.name = name;
	  		 this.color = color;
	  	 	 this.topSpeed = topSpeed;
	  	}

	  	public void drive(){
	 		 System.out.println("You are now driving.");
	 	}

	  	public boolean race(){
	  		System.out.println("You are now racing.");
	  		return false;
	  	}
	  }

	  public class Audi extends Car{
	  boolean turbo = false;
	  	Audi(String name, String color, int topSpeed, boolean turbo){
	  		super(name, color, topSpeed);
	  		this.turbo = turbo;
	  	}

	  	public boolean race(){
	  		System.out.println("you are now racing.");
	  		turbo = true;
	  		return turbo;
	  	}
	  }
	  public class Main{
		  public static void main(String[] args){
			  Car myCar = new Audi("R-8", "Black", 190, true);
			  boolean turbo = myCar.race();
			System.out.println("turbo: " + turbo);
		  }
	  }
	 */

	  /*------------------------------------------------------------------------------------------------------------
	   * Question # 9
	   * What will the following code output?
	   * 
	   * Answer: The code will output:
	   * "helloINTRODUCTIONThJs"
	   * -----------------------------------------------------------------------------------------------------------
	   *
	  	public class Practice{

	  		public String mutateString(String string){
	  			String array[];
	  			array = string.split(":");

	  			return array[0].toLowerCase() + array[4].toUpperCase() + array[2].replaceFirst("i", "J");
	  		}
	  	}

	  	public class Main{
		  	public static void main(String[] args){
		  		String words = "Hello:World:This:is:Introduction:to:Java!";

		  		Practice myClass = new Practice();
		  		System.out.println(myClass.mutateString(words));
		  	}
	  	}
	  	*/


	 	/*
	  	 * ---------------------------------------------------------------------------------------------------------
	  	 * Question # 10
	  	 * a. Will the following code work?
	  	 * b. Why or why not?
	  	 * c. If it does, what will the following code display?
	  	 * 
	  	 * Answer: 120
	  	 * ---------------------------------------------------------------------------------------------------------
	  	 *

		public class MyClass{
	  	int x, y, z;
	  		public MyClass(int x, int y, int z){
	  			this.x = x;
	  			this.y = y;
	  			this.z = z;
	  		}

	  		public int getX(){
	  			return x;
	  		}

	  		public int getY(){
	  			return y;
	  		}

	  		public int getZ(){
	  			return z;
	  		}

	  		public int myFunction(){
	  		int number = getX()*getY()*getZ();
	  		return number;
	  		}
		}

	public class Main{
	public static void main(String[] args){
  		MyClass myClass = new MyClass(4, 5, 6);
  		int number = myClass.myFunction();
  		System.out.println(number);
  		}
	}
	*/

		/*
	  	 * ---------------------------------------------------------------------------------------------------------
	  	 * Question # 11
	  	 * Create a for loop that will do the following.
	  	 * a. display the values of the array,
	  	 * b. sum up the total of the elements.
	  	 * c. find the average, doesnt need a for loop.
	  	 * ---------------------------------------------------------------------------------------------------------
	  	 *
	  	public static void main(String[] args){
	  		int myArray = {40, 50, 60, 70};
	  		int sum = 0;
			for (int num: myArray) {
				System.out.println(num);
				sum += num;
			}
			int avg = sum/myArray.length;
	  	}
	  	*/

	  	/*
	  	 * ---------------------------------------------------------------------------------------------------------
	  	 * Question # 12
	  	 * Create a subclass Student that overrides the following methods within the abstract class. Create a UML Diagram for both classes.
	  	 * ---------------------------------------------------------------------------------------------------------
	  	 */
	  	public abstract class Person{
	  		/**
	  		 * This method will introduce the person.
	  		 * @return an introduction message.
	  		 */
	  		public abstract String introduce();
	  		/**
	  		 * This method will start a conversation with someone.
	  		 * @return a conversation.
	  		 */
	  		public abstract String conversation();
	  		/**
	  		 *
	  		 * This method will make the person walk.
	  		 * @return a message saying the person is walking.
	  		 */
	  		public abstract String walk();
	  		/**
	  		 * This method will make the person run.
	  		 * @return  a message saying the person is running.
	  		 */
	  		public abstract String run();
	  		/**
	  		 * This method will make the person do an action.
	  		 * @return an action
	  		 */
	  		public abstract String action();
	  	}
	  	
	  	public class Student extends Person {

			@Override
			public String introduce() {
				// TODO Auto-generated method stub
				return "Hi! Nice to meet you!";
			}

			@Override
			public String conversation() {
				// TODO Auto-generated method stub
				return "How are you doing?";
			}

			@Override
			public String walk() {
				// TODO Auto-generated method stub
				return "The student is walking";
			}

			@Override
			public String run() {
				// TODO Auto-generated method stub
				return "The student is running";
			}

			@Override
			public String action() {
				// TODO Auto-generated method stub
				return "The student is doing an action";
			}
	  		
	  	}

	  }
