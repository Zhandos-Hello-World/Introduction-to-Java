/*
(Game: display a checkerboard) Write a program that displays a checkerboard
in which each white and black cell is a Rectangle with a fill color black or
white, as shown in Figure 14.44c.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    private static final int width = 40;
    private static final int height = 40;
    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();
        boolean white;
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                white = true;
            }
            else{
                white = false;
            }
            for(int j = 0; j < 10; j++) {
                if(white){
                    root.add(new Rectangle(width, height, Color.WHITE), j, i);
                    white = false;
                }
                else{
                    root.add(new Rectangle(width, height, Color.BLACK), j, i);
                    white = true;
                }
            }
        }
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

