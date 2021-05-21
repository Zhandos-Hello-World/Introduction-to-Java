/*
(Game: hangman) Write a program that displays a drawing for the popular hangman game, as shown in Figure 14.48a
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Pane root = new Pane();
        root.setPrefSize(400, 300);

        Ellipse ellipse = new Ellipse(60, 50);
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);
        ellipse.setCenterX(70);
        ellipse.setCenterY(300);

        Line line = new Line(70, 250, 70, 50);

        Line line1 = new Line(70, 50, 200, 50);

        Line line2 = new Line(200, 50, 200, 80);

        Circle circle = new Circle(200, 110, 30, Color.WHITE);
        circle.setStroke(Color.BLACK);

        Line body = new Line(200, 140, 200, 200);

        Line leftHand = new Line(200, 140, 150, 170);

        Line rightHand = new Line(200, 140, 250, 170);


        Line leftLeg = new Line(200, 200, 150, 230);

        Line rightLeg = new Line(200, 200, 250, 230);

        root.getChildren().addAll(ellipse, line, line1, line2, circle, body, leftHand, rightHand, leftLeg, rightLeg);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
