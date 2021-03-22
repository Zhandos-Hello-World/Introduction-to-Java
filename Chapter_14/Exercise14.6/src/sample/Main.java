package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        GridPane gridPane = new GridPane();
        Rectangle []rectangles = {BlackRectangle(), WhiteRectangle()};
        for(int i = 1; i <= 8; i++){
            boolean check = true;
            if(i % 2 == 0){
                check = false;
            }
            Rectangle currentRectangle;
            for(int j = 0; j < 8; j++){
                if(check){
                    currentRectangle = WhiteRectangle();
                    check = false;
                }
                else{
                     currentRectangle = BlackRectangle();
                     check = true;
                }
                gridPane.add(currentRectangle, i, j);
            }
        }
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Exercise14_06");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
    public static Rectangle BlackRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(50);
        rectangle.setWidth(50);
        rectangle.setStyle("-fx-stroke: black; -fx-fill: black");
        return rectangle;
    }
    public static Rectangle WhiteRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(50);
        rectangle.setWidth(50);
        rectangle.setStyle("-fx-stroke: white; -fx-fill: white");
        return rectangle;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
