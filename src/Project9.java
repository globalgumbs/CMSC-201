/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Car Program
 * Due: 08/05/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Project9 extends Application {
	
    private double x = 0; 
    private double y = 100; 
    private double speed = 1; 
    private boolean running = true; 
    private Timeline timeline;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Project 9");

        Canvas canvas = new Canvas(800, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> draw(gc)));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        canvas.setOnKeyPressed(this::handleKeyPress);

        Pane root = new Pane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        canvas.requestFocus();
    }

    private void draw(GraphicsContext gc) {
        if (!running) return;

        gc.clearRect(0, 0, 800, 200);
        x += speed;
        if (x > 800) {
        	x = -50;
        }

        // Body
        gc.setFill(Color.BLUE);
        gc.fillRect(x, y - 20, 50, 10); 

        gc.setFill(Color.BLUE);
        gc.fillPolygon(new double[]{x + 10, x + 20, x + 30, x + 40}, new double[]{y - 20, y - 30, y - 30, y - 20}, 4); // Top

        // Draw the wheels
        gc.setFill(Color.BLACK);
        gc.fillOval(x + 10, y - 10, 10, 10);
        gc.fillOval(x + 30, y - 10, 10, 10); 
    }

    private void handleKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case UP -> Math.min(10, speed += 0.5);
            case DOWN -> speed = Math.max(0.5, speed - 0.5);
            case SPACE -> {
            	toggleAnimation();
            }
		default -> {} // Do nothing
        }
    }

    private void toggleAnimation() {
        running = !running;
        if (running) {
            timeline.play();
        } else {
            timeline.pause();
        }
    }
}
