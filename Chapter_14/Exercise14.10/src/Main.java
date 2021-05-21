/*
(Display a cylinder) Write a program that draws a cylinder, as shown in Figure 14.45b.
You can use the following method to set the dashed stroke for an arc:

arc.getStrokeDashArray().addAll(6.0, 21.0);

The solution posted on the website enables the cylinder to resize horizontally.
Can you revise it to resize vertically as well?
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(100);
        line.setEndY(300);


        Line line1 = new Line();
        line1.setStartX(300);
        line1.setStartY(100);
        line1.setEndX(300);
        line1.setEndY(300);

        Arc arc = new Arc(200, 100, 100, 50, 0, 360);
        arc.setStyle("-fx-stroke: black; -fx-fill: white");
        arc.setStyle("-fx-stroke: black; -fx-fill: white");
        Arc arc1 = new Arc(200, 300, 100, 50, 180, 180);
        arc1.setStyle("-fx-stroke: black; -fx-fill: white");

        Arc arc2 = new Arc(200, 300, 100, 50, 0, 20);
        Arc arc3 = new Arc(200, 300, 100, 50, 45, 20);
        Arc arc4 = new Arc(200, 300, 100, 50, 80, 20);
        Arc arc5 = new Arc(200, 300, 100, 50, 120, 20);
        Arc arc6 = new Arc(200, 300, 100, 50, 160, 20);


        pane.getChildren().add(arc2);
        pane.getChildren().add(arc3);
        pane.getChildren().add(arc4);
        pane.getChildren().add(arc5);
        pane.getChildren().add(arc6);

        pane.getChildren().add(arc1);
        pane.getChildren().add(arc);
        pane.getChildren().add(line);
        pane.getChildren().add(line1);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_10");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}