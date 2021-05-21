/*
(Display random 0 or 1) Write a program that displays a 10-by-10 square matrix,
as shown in Figure 14.45a. Each element in the matrix is 0 or 1, randomly generated. Display each number centered in a text field. Use TextField’s setText
method to set value 0 or 1 as a string.
*/

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class Main extends Application {
    private static final int width = 30;
    private static final int height = 30;
    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                int temp = (int)(Math.random() * 2 + 0);
                TextField text = new TextField(temp + "");
                text.setMaxSize(width, height);
                text.setMinSize(width, height);
                root.add(text, j, i);
            }
        }
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

