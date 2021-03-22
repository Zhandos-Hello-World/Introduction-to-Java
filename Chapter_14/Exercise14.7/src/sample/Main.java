package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        GridPane gridPane = new GridPane();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                String s = String.valueOf((int)(Math.random() * 2 + 0));
                gridPane.add(new TextField(s), i, j);
            }
        }

        Scene scene = new Scene(gridPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_7");
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
