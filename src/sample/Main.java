package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    PolyClass polyClass = new PolyClass(50, 5, 5);

    // Instance Variables
    private final Polyline polyline;
    private final Circle circle;
    private final EventHandler<MouseEvent> mouseEventEventHandler;

    // Main Constructor
    public Main() {
        this.polyline = new Polyline();
        this.polyline.setStrokeWidth(polyClass.getLine_width());
        this.circle = new Circle(polyClass.getCircle_width());
        this.circle.setFill(Color.BLACK);

        // Mouse event (lambada)
        mouseEventEventHandler = event -> {

            if (polyline.getPoints().size() >= (polyClass.getMax_points() * 2)) {
                polyline.getPoints().remove((polyClass.getMax_points() * 2) - 2,
                        (polyClass.getMax_points() * 2));
            }

            polyline.getPoints().add(0, event.getY());
            polyline.getPoints().add(0, event.getX());

            circle.setCenterX(event.getX());
            circle.setCenterY(event.getY());
        };
    }

    @Override
    public void start(Stage primaryStage) {

        Group group = new Group(this.polyline, this.circle);

        Scene scene = new Scene(group, 350, 350);

        scene.setOnMouseMoved(mouseEventEventHandler);

        primaryStage.setTitle("Polyline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
