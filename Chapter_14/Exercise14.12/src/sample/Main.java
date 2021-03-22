package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label labelProject = new Label("Project -- 20%");
        Rectangle rectangleProject = new Rectangle(200, 200);
        rectangleProject.setStyle("-fx-stroke: red; -fx-fill: red");

        Label labelQuiz = new Label("Quiz -- 10%");
        Rectangle rectangleQuiz = new Rectangle(200, 100);
        rectangleQuiz.setStyle("-fx-fill: blue; -fx-stroke: blue");

        Label labelMidterm = new Label("Midterm -- 30%");
        Rectangle rectangleMidterm = new Rectangle(200, 300);
        rectangleMidterm.setStyle("-fx-stroke: green; -fx-fill: green");

        Label labelFinal = new Label("Final -- 40%");
        Rectangle rectangleFinal = new Rectangle(200, 400);
        rectangleFinal.setStyle("-fx-stroke: orange; -fx-fill: orange");

        FlowPane flowPane1 = new FlowPane(Orientation.VERTICAL);

        flowPane1.setVgap(10);
        flowPane1.setHgap(10);
        flowPane1.getChildren().add(labelProject);
        flowPane1.getChildren().add(rectangleProject);


        FlowPane flowPane2 = new FlowPane(Orientation.VERTICAL);
        flowPane2.setVgap(10);
        flowPane2.setHgap(10);
        flowPane2.getChildren().add(labelQuiz);
        flowPane2.getChildren().add(rectangleQuiz);


        FlowPane flowPane3 = new FlowPane(Orientation.VERTICAL);
        flowPane3.setVgap(10);
        flowPane3.setHgap(10);
        flowPane3.getChildren().add(labelMidterm);
        flowPane3.getChildren().add(rectangleMidterm);

        FlowPane flowPane4 = new FlowPane(Orientation.VERTICAL);
        flowPane4.setVgap(10);
        flowPane4.setHgap(10);
        flowPane4.getChildren().add(labelFinal);
        flowPane4.getChildren().add(rectangleFinal);

        FlowPane flowCommon = new FlowPane(Orientation.HORIZONTAL);
        flowCommon.setPadding(new Insets(10, 10, 10, 10));
        flowCommon.setVgap(10);
        flowCommon.setVgap(10);
        flowCommon.getChildren().add(flowPane1);
        flowCommon.getChildren().add(flowPane2);
        flowCommon.getChildren().add(flowPane3);
        flowCommon.getChildren().add(flowPane4);

        Scene scene = new Scene(flowCommon, 900, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_12");
        
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
