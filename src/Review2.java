import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * This Class was created as a review guide for the Introduction to Java Final Exam.
 * Please remember that all questions on here will not represent all questions on the exam,
 * nor does this mean that questions absent from here wont be on the final.
 * @author Micheal Bailey
 *
 */
public class Review2{

	/*
	 * Problems 1-4 will require you to finish the code.
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 1.
	 * a. Write a program that will write to a text file called output.txt the message "Hello World
	 * here are the numbers 1 through 10"? Then displaying the numbers 1-10 with each number having its own line.
	 * without using exception handling.
	 * b.re-write the program using exception handling.
	 * ---------------------------------------------------------------------------------------------------------
	 *

	 public static void main(String[] args) {
	 	PrintWriter writer = new PrintWriter(new File("output.txt"));
        writer.println("Hello World");
        writer.println("here are the numbers 1 through 10:");
        for (int i = 1; i <= 10; i++) {
            writer.println(i);
        }
        writer.close();
	 }
	 
	 public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("output.txt"));
            writer.println("Hello World");
            writer.println("here are the numbers 1 through 10:");
            for (int i = 1; i <= 10; i++) {
                writer.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File could not be created or opened: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 2. Write a program that will read from the file provided and display the contents to the
	 * console. In the catch block display to the user an error message that the file could not be read.
	 * ---------------------------------------------------------------------------------------------------------
	 *
	 *
	 public static void main(String[] args) {
		Scanner scanner = null;
        try {
            File file = new File("input.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File could not be read.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
	 }
	 *
	 * ---------------------------------------------------------------------------------------------------------
	 * Question # 3. Finish the code by displaying the contents of the two dimensional array in ascending order using only loops.
	 * ---------------------------------------------------------------------------------------------------------
	 *
	 *
	 public static void main(String[] args){
     	int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
     	for (int[] row: numbers) {
     		for (int num: row) {
     			System.out.println(num);
     		}	
     	}
	 }
	 *
	 *
	 * ----------------------------------------------------------------------------------------------------------
	 * Question # 4.Finish the code by writing a switch statement that will give the user legos if they are 6, a
	 * bike if they are 12 and a new car if they are 18, if none of these conditions are met the user gets nothing.
	 * ---------------------------------------------------------------------------------------------------------
	 *
	 *
	 public static void main(String[] args){
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age.");
		age = input.nextInt();
		switch (age) {
            case 6:
                System.out.println("You get legos");
                break;
            case 12:
                System.out.println("You get a bike");
                break;
            case 18:
                System.out.println("You get a new car");
                break;
            default:
                System.out.println("You get nothing.");
                break;
        }
			
	 }


	 * ----------------------------------------------------------------------------------------------------------
	 * Question # 5. Which of the following staments are correct for creating a button that says I am a button.
	 * ---------------------------------------------------------------------------------------------------------
	 * A. Button myButton = new Button("I am a button.");
	 * B. Button myButton = new button("I am a button.");
	 * C. Button myButton = new Button().setText("I am a button.");
	 * D. Button myButton = new Button("I am a button.");
	 * myButton.setText("I am a button")
	 * E. Both A and D
	 *
	 * Answer: E

	 * ----------------------------------------------------------------------------------------------------------
	 * Question # 6. What must the class extend if you want to use javaFX to build your GUI
	 * A. JavaFX
	 * B. Application
	 * C. Swing
	 * D. AWT
	 * 
	 * Answer: B
	 * ---------------------------------------------------------------------------------------------------------
	 *

	 *----------------------------------------------------------------------------------------------------------
	 * Question # 7. Without running the program analize the code and explain what is going on, then run the
	 *code to check you answer
	 * 
	 * Answer: When the program is run, a window should appear with a button that says "Click Me". Each time the user clicks,
	 * the counter next to the button should increment.
	 * ---------------------------------------------------------------------------------------------------------
	 *
	 int x = 0;
	 @Override
	 public void start(Stage primaryStage) throws Exception {

		HBox h1 = new HBox();
		Button myButton = new Button("Click Here");
		TextField input = new TextField();
		myButton.setOnAction(e -> { clicker(input); });
		BorderPane myPane = new BorderPane();
		h1.getChildren().addAll(myButton, input);
		myPane.setCenter(h1);
		Scene myScene = new Scene(myPane, 300, 250);
		primaryStage.setTitle("clicker");
		primaryStage.setScene(myScene);
		primaryStage.show();
	 }

	 public static void main(String[] args){
		launch(args);
	 }
	 public void clicker(TextField input){
		x++;
		if(x == 1){
			input.setText("You have clicked " + x + " time");
		}
		else if(x > 1){
			input.setText("You have clicked " + x + " times");
		}
	 }
	*/
}