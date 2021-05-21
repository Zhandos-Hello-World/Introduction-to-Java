/*
(Paint a smiley face) Write a program that paints a smiley face, as shown in
Figure 14.46a.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Circle circle = new Circle(200, 200, 200);
        circle.setStyle("-fx-stroke: black; -fx-fill: white");

        Arc eyeL = new Arc(120, 150, 50, 25, 0, 360);
        eyeL.setStyle("-fx-stroke: black; -fx-fill: white");
        Arc eyeR = new Arc(270, 150, 50, 25, 0, 360);
        eyeR.setStyle("-fx-stroke: black; -fx-fill: white");

        Arc pupilsL = new Arc(120, 150, 25, 25, 0, 360);
        Arc pupilsR = new Arc(270, 150, 25, 25, 0, 360);

        Line nose1 = new Line(200, 150, 250,250);
        Line nose2 = new Line(200, 150, 150,250);
        Line nose3 = new Line(150, 250, 250,250);

        Arc lip = new Arc(200, 260, 100, 100, 180, 180);


        pane.getChildren().add(circle);
        pane.getChildren().add(eyeL);
        pane.getChildren().add(eyeR);
        pane.getChildren().add(pupilsL);
        pane.getChildren().add(pupilsR);

        pane.getChildren().add(nose1);
        pane.getChildren().add(nose2);
        pane.getChildren().add(nose3);

        pane.getChildren().add(lip);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Exercise14_11");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
