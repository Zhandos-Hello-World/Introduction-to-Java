/*
(Color and font) Write a program that displays five texts vertically, as shown in
Figure 14.44a. Set a random color and opacity for each text and set the font of
each text to Times Roman, bold, italic, and 24 pixels
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        FlowPane texts = new FlowPane(Orientation.HORIZONTAL);
        for(int i = 0; i < 5; i++){
            texts.getChildren().add(new customLabel());
        }
        texts.setPadding(new Insets(40, 10, 40, 10));
        stage.setScene(new Scene(texts));
        stage.show();
    }
}
class customLabel extends Label{
    customLabel(){
        super("JavaFX");
        setFont(Font.font("Times new Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
        setTextFill(new Color(Math.random() * 1 + 0, Math.random() * 1 + 0, Math.random() * 1 + 0, 1));
        setRotate(90);
    }
}
