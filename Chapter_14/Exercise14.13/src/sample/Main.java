package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Arc arcFinal = new Arc(200, 200, 200, 200, 230, 130);
        arcFinal.setStyle("-fx-fill: orange; -fx-stroke: orange");
        arcFinal.setType(ArcType.ROUND);

        Arc arcProject = new Arc(200, 200, 200, 200, 0, 70);
        arcProject.setStyle("-fx-fill: red; -fx-stroke: red");
        arcProject.setType(ArcType.ROUND);

        Arc arcMidterm = new Arc(200, 200, 200, 200, 115, 115);
        arcMidterm.setStyle("-fx-fill: green; -fx-stroke: green");
        arcMidterm.setType(ArcType.ROUND);

        Arc arcQuiz = new Arc(200, 200, 200, 200, 70, 45);
        arcQuiz.setStyle("-fx-fill: blue; -fx-stroke: blue");
        arcQuiz.setType(ArcType.ROUND);


        pane.getChildren().add(arcFinal);
        pane.getChildren().add(arcProject);
        pane.getChildren().add(arcMidterm);
        pane.getChildren().add(arcQuiz);

        StackPane stackPane = new StackPane(pane);

        Label labelQuiz = new Label("Quiz -- 10%");
        labelQuiz.setTranslateX(-10);
        labelQuiz.setTranslateY(-100);
        labelQuiz.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
        labelQuiz.setTextFill(new Color(0,0,0, 1));


        Label labelProject = new Label("Project -- 20%");
        labelProject.setTranslateX(90);
        labelProject.setTranslateY(-70);
        labelProject.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
        labelProject.setTextFill(new Color(0,0,0, 1));

        Label labelMidterm = new Label("Midterm -- 30%");
        labelMidterm.setTranslateX(-100);
        labelMidterm.setTranslateY(0);
        labelMidterm.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
        labelMidterm.setTextFill(new Color(0,0,0, 1));

        Label labelFinal = new Label("Final -- 40%");
        labelFinal.setTranslateX(-30);
        labelFinal.setTranslateY(100);
        labelFinal.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
        labelFinal.setTextFill(new Color(0,0,0, 1));

        stackPane.getChildren().add(labelQuiz);
        stackPane.getChildren().add(labelMidterm);
        stackPane.getChildren().add(labelProject);
        stackPane.getChildren().add(labelFinal);

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Exercise14_13");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
