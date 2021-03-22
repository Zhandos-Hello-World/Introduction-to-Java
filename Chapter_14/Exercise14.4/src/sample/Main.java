package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FlowPane fp = new FlowPane();
        Label[]labels = {new Label("Java"),new Label("Java"),new Label("Java"), new Label("Java"), new Label("Java")};
        for(int i = 0; i < labels.length; i++){
            labels[i].setRotate(90);
            labels[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
            labels[i].setTextFill(colorRandom());
            fp.getChildren().add(labels[i]);
        }
        fp.setPadding(new Insets(30,30,30,30));
        Scene scene = new Scene(fp);
        primaryStage.setTitle("Exercise14_04");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public Color colorRandom(){
        double[]arr = new double[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 + 0) / 100.0;
        }
        return new Color(arr[0], arr[1], arr[2], arr[3]);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
