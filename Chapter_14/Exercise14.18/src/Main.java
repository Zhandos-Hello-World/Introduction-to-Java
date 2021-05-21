/*
(Plot the cube function) Write a program that draws a diagram for the function
f(x) = x^3
 (see Figure 14.48b).
Hint: Add points to a polyline using the following code:
 Polyline polyline = new Polyline();
 ObservableList<Double> list = polyline.getPoints();
 double scaleFactor = 0.0125;
 for (int x = –100; x <= 100; x++) {
 list.add(x + 200.0);
 list.add(scaleFactor * x * x * x);
 }
 */


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = - 100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(scaleFactor * x * x * x);
        }
        Pane root = new Pane(polyline);

        primaryStage.setTitle("Exercise14_18");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
