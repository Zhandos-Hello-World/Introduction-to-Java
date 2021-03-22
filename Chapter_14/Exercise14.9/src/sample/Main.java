package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage){
        GridPane gp = new GridPane();
        gp.add(panes(), 0, 0);
        gp.add(panes(), 0, 1);
        gp.add(panes(), 1, 0);
        gp.add(panes(), 1, 1);
        gp.setVgap(5);
        gp.setHgap(5);
        gp.setPadding(new Insets(5,5,5,5));
        Scene scene = new Scene(gp);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Exercise14_9");
        primaryStage.show();
    }
    public static Pane panes(){
        Pane stackPane = new Pane();
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setStyle("-fx-fill: white; -fx-stroke: black");
        Arc arc = new Arc(100, 100, 100, 100, 45, 35);
        Arc arc1 = new Arc(100, 100, 100, 100, 135, 35);
        Arc arc2 = new Arc(100, 100, 100, 100, 225, 35);
        Arc arc3 = new Arc(100, 100, 100, 100, 315, 35);
        arc.setType(ArcType.ROUND);
        arc1.setType(ArcType.ROUND);
        arc2.setType(ArcType.ROUND);
        arc3.setType(ArcType.ROUND);
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(arc);
        stackPane.getChildren().add(arc1);
        stackPane.getChildren().add(arc2);
        stackPane.getChildren().add(arc3);
        return stackPane;

    }


    public static void main(String[] args) {
        launch(args);
    }
}
