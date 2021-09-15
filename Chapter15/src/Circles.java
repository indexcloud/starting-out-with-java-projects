import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Circles extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Constants for the scene size
        final double SCENE_WIDTH = 440.0;
        final double SCENE_HEIGHT = 440.0;

        // Constants for the starting values
        final double CENTER_X = 220.0;
        final double CENTER_Y = 220.0;
        final double RAD = 20.0;
        final int NUM_CIRCLES = 10;

        // Create an empty Pane.
        Pane pane = new Pane();

        // Recursively add 10 circles to the Pane.
        drawCircles(pane, NUM_CIRCLES, CENTER_X, CENTER_Y, RAD);

        // Create a Scene and display it.
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     *
     */

    private void drawCircles(Pane p, int n, double x, double y, double rad) {
        if (n > 0) {
            Circle circle = new Circle(x, y, rad);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            p.getChildren().addAll(circle);
            drawCircles(p, n - 1, x, y, rad + 20);
        }
    }
}
