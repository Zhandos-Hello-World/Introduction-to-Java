/*
(Display a pie chart) Write a program that uses a pie chart to display the percentages of the overall market share represented by Apple, HTC, Samsung, and
Others, as shown in Figure 14.46c. Suppose that Apple takes 26 percent and is
displayed in red, HTC takes 26 percent and is displayed in blue, Samsung takes
28 percent and is displayed in green, and the Others take 26 percent and are displayed in orange. Use the Arc class to display the pies. Interested readers may
explore the JavaFX PieChart class for further study
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    Pane stackPane = new Pane();
    double startN = 0;
    public static final int radius = 200;
    @Override
    public void start(Stage primaryStage){
        double []percents = {20, 26, 28, 26};
        Color[]colorsOfTheRectangles = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
        for(int i = 0; i < 4; i++){
            addCompany(colorsOfTheRectangles[i], percents[i]);
        }

        Label []labels = {new Label("Apple -- " + percents[0]), new Label("HTC -- " + percents[1]), new Label("Samsung -- " + percents[2]), new Label("Others -- " + percents[3])};
        labels[0].setTranslateX(radius + 30);
        labels[0].setTranslateY(radius - 40);

        labels[1].setTranslateX(radius - 140);
        labels[1].setTranslateY(radius - 60);

        labels[2].setTranslateX(radius - 140);
        labels[2].setTranslateY(radius + 40);

        labels[3].setTranslateX(radius + 30);
        labels[3].setTranslateY(radius + 40);

        for(int i = 0; i < labels.length; i++){
            labels[i].setFont(Font.font("Times New Roman", FontWeight.BLACK, FontPosture.ITALIC, 20));
            labels[i].setTextFill(Color.BLACK);
        }


        stackPane.getChildren().addAll(labels);
        primaryStage.setScene(new Scene(stackPane));
        primaryStage.show();
    }
    public void addCompany(Color color, double percent){
        double endN = Math.toDegrees(percent * ((2 * Math.PI) / 100));
        Arc arc = new Arc(radius, radius, radius, radius, startN, endN);
        arc.setFill(color);
        arc.setType(ArcType.ROUND);
        stackPane.getChildren().add(arc);
        startN += endN;
    }



    public static void main(String[] args) {
        launch(args);
    }
}
